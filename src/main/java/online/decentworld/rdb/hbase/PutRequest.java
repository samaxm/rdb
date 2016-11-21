package online.decentworld.rdb.hbase;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sammax on 2016/11/21.
 */
public class PutRequest {

    private byte[] table;
    private byte[] columnFamily;


    private List<Row> rows=new LinkedList<Row>();

    public byte[] getTable() {
        return table;
    }

    public  byte[]  getColumnFamily() {
        return columnFamily;
    }

    public PutRequest (String table,String columnFamily){
        this.table=table.getBytes();
        this.columnFamily=columnFamily.getBytes();
    }

    public void add(String rowkey,String colmn,byte[] value){
        rows.add(new Row(rowkey.getBytes(),colmn.getBytes(),value));
    }

    public List<Row> getRows(){
        return rows;
    }

    public static final class Row{
        private byte[] rowkey;
        private byte[] column;
        private byte[] value;

        public Row(byte[] rowkey, byte[] column, byte[] value) {
            this.rowkey = rowkey;
            this.column = column;
            this.value = value;
        }

        public byte[] getRowkey() {
            return rowkey;
        }

        public byte[] getColumn() {
            return column;
        }

        public byte[] getValue() {
            return value;
        }
    }
}
