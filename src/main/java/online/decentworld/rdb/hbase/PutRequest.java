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

    public PutRequest (byte[] table,byte[] columnFamily){
        this.table=table;
        this.columnFamily=columnFamily;
    }

    public void add(byte[] rowkey,byte[] column,byte[] value){
        rows.add(new Row(rowkey,column,value));
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
