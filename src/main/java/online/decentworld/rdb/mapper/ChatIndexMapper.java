package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.ChatIndex;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChatIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_index_1
     *
     * @mbggenerated Mon Oct 03 19:16:06 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_index_1
     *
     * @mbggenerated Mon Oct 03 19:16:06 CST 2016
     */
    int insert(ChatIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_index_1
     *
     * @mbggenerated Mon Oct 03 19:16:06 CST 2016
     */
    int insertSelective(ChatIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_index_1
     *
     * @mbggenerated Mon Oct 03 19:16:06 CST 2016
     */
    ChatIndex selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_index_1
     *
     * @mbggenerated Mon Oct 03 19:16:06 CST 2016
     */
    int updateByPrimaryKeySelective(ChatIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_index_1
     *
     * @mbggenerated Mon Oct 03 19:16:06 CST 2016
     */
    int updateByPrimaryKey(ChatIndex record);


    List<ChatIndex> getUserChats(@Param(value = "dwid") String dwID,@Param(value = "contactid")  String contactID);
}