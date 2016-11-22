package online.decentworld.rdb.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sammax on 2016/11/21.
 */
public class HbaseClient {
    private static String HBASE_ZK="120.76.26.75:2080,112.74.29.115:2080,112.74.13.117:2080";
    private static String HBASE_ZK_PORT="2080";
    private static Logger logger= LoggerFactory.getLogger(HbaseClient.class);
    private static HbaseClient client;
    public synchronized static HbaseClient instance(){
        if(client==null)
            client=new HbaseClient();

        return client;
    }

    private Connection connection;

    private HbaseClient(){
        Configuration configuration= HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.quorum",HBASE_ZK);
        configuration.set("hbase.zookeeper.property.clientPort",HBASE_ZK_PORT);
        try {
            connection = ConnectionFactory.createConnection(configuration);
            while (connection==null){
            }
        }catch (Exception e){
            logger.warn("",e);
        }
    }


    public boolean createTable(String tableName,String... columnFamily){

        if(tableName==null||columnFamily==null||columnFamily.length==0){
            throw new IllegalArgumentException("[CREATE_HTABLE_ERROR] tableName#"+tableName+" columeFamily#"+columnFamily);
        }else{
            HBaseAdmin admin = null;
            try {
                admin= (HBaseAdmin) connection.getAdmin();
                HTableDescriptor tableDescriptor=new HTableDescriptor(TableName.valueOf(tableName));
                for(String cf:columnFamily){
                    tableDescriptor.addFamily(new HColumnDescriptor(cf));
                }
                if(admin.tableExists(TableName.valueOf(tableName))){
                    logger.info("[HTABLE_EXSIT] tableName#"+tableName);
                }else{
                    admin.createTable(tableDescriptor);
                }
                return true;
            }catch (Exception e){
                logger.warn("[CREATE_HTABLE_FAIL]",e);
                return false;
            }finally {
                if(admin!=null){
                    try {
                        admin.close();
                    }catch (Exception e){
                        logger.warn("[CLOSE_HADMIN_FAIL]",e);
                    }
                }
            }
        }
    }


    public void put(byte[] tableName,byte[] rowkey,byte[] cf,byte[] ci,byte[] value) throws IOException {
        HTable table=null;
        try{
            table= (HTable) connection.getTable(TableName.valueOf(tableName));
            Put put=new Put(rowkey);
            put.addColumn(cf,ci,value);
            table.put(put);
        }finally {
            realseResource(table);
        }
    }


    public void put(PutRequest... requests) throws IOException {
        for(PutRequest request:requests){
            List<PutRequest.Row> list=request.getRows();
            if(list.size()==0){
                return;
            }else{
                HTable table=null;
                try{
                    table= (HTable) connection.getTable(TableName.valueOf(request.getTable()));
                    List<Put> puts=new LinkedList<>();
                    for(PutRequest.Row row:list){
                        Put put=new Put(row.getRowkey());
                        put.addColumn(request.getColumnFamily(),row.getColumn(),row.getValue());
                        puts.add(put);
                    }
                    table.put(puts);
                    table.flushCommits();
                }finally {
                    realseResource(table);
                }
            }
        }
    }


    public Result get(byte[] tableName,byte[] rowkey) throws IOException {
        HTable table=null;
        try {
            table= (HTable) connection.getTable(TableName.valueOf(tableName));
            Get get=new Get(rowkey);
            return table.get(get);
        }finally {
            realseResource(table);
        }
    }

    public List<Result> scan(String tableName,byte[] profix,byte[] start,byte[] stop) throws IOException {
        HTable table=null;
        if(tableName==null||start==null||stop==null){
            throw new IllegalArgumentException("tableName#"+tableName+" start#"+start+" stop#"+stop);
        }
        try {
            table= (HTable) connection.getTable(TableName.valueOf(tableName.getBytes()));
            Scan scan=new Scan();
            if(profix!=null){
                scan.setRowPrefixFilter(profix);
            }
            scan.setStartRow(start);
            scan.setStopRow(stop);
            ResultScanner scanner=table.getScanner(scan);
            List<Result> results=new LinkedList<>();
            scanner.forEach((Result re)->{
                results.add(re);
            });
            return results;
           }finally {
            realseResource(table);
        }
    }

    public void realseResource(HTable table){
        if(table!=null){
            try {
                table.close();
            }catch (Exception e){
                logger.warn("",e);
            }
        }
    }

    public synchronized  void close(){
        if(connection!=null){
            try{
                connection.close();
            }catch (Exception e){
                logger.warn("",e);
            }
        }
        client=null;
    }




}
