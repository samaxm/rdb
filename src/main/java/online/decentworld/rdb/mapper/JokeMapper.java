package online.decentworld.rdb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import online.decentworld.rdb.entity.Joke;

public interface JokeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_jokes
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_jokes
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    int insert(Joke record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_jokes
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    int insertSelective(Joke record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_jokes
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    Joke selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_jokes
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    int updateByPrimaryKeySelective(Joke record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_jokes
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    int updateByPrimaryKey(Joke record);
    
    List<Joke> getJokes(@Param(value = "index") int index,@Param(value = "limit") int limit);
    
    int getDataSize();
}