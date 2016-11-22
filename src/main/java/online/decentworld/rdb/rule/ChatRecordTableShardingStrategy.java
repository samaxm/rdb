//package online.decentworld.rdb.rule;
//
//import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
//import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;
//
//import java.util.Collection;
//
///**
// * Created by Sammax on 2016/10/4.
// */
//public class ChatRecordTableShardingStrategy implements SingleKeyTableShardingAlgorithm<Long> {
//
//    private static int shardingStep=100000;
//
//    @Override
//    public String doEqualSharding(Collection<String> collection, ShardingValue<Long> shardingValue) {
//        for(String tableName:collection){
//            int tableID=Integer.parseInt(String.valueOf(tableName.charAt(tableName.length()-1)));
//            if(shardingValue.getValue()<=shardingStep*(tableID+1)&&
//                    shardingValue.getValue()>=shardingStep*tableID){
//                return tableName;
//            }
//        }
//        throw new IllegalArgumentException();
//    }
//
//    @Override
//    public Collection<String> doInSharding(Collection<String> collection, ShardingValue<Long> shardingValue) {
//        return collection;
//    }
//
//    @Override
//    public Collection<String> doBetweenSharding(Collection<String> collection, ShardingValue<Long> shardingValue) {
//        return collection;
//    }
//
//
//}
