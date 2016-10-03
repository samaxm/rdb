package online.decentworld.rdb.rule;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;

import java.util.Collection;

/**
 * Created by Sammax on 2016/10/3.
 */
public class ChatIndexTableShardingStrategy implements SingleKeyTableShardingAlgorithm<String> {


    private static int shardingStep=100000;
    @Override
    public String doEqualSharding(Collection<String> collection, ShardingValue<String> shardingValue) {
        int idValue=Integer.valueOf(shardingValue.getValue());
        for(String tableName:collection){
            int range=Integer.valueOf(String.valueOf(tableName.charAt(tableName.length()-1)));
            if(range*shardingStep<=idValue&&idValue<=(range+1)*shardingStep){
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Collection<String> doInSharding(Collection<String> collection, ShardingValue<String> shardingValue) {
        return null;
    }

    @Override
    public Collection<String> doBetweenSharding(Collection<String> collection, ShardingValue<String> shardingValue) {
        return null;
    }
}
