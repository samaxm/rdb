package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.ChatRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChatRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_record
     *
     * @mbggenerated Mon Oct 03 20:36:49 CST 2016
     */
    int deleteByPrimaryKey(Long mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_record
     *
     * @mbggenerated Mon Oct 03 20:36:49 CST 2016
     */
    int insert(ChatRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_record
     *
     * @mbggenerated Mon Oct 03 20:36:49 CST 2016
     */
    int insertSelective(ChatRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_record
     *
     * @mbggenerated Mon Oct 03 20:36:49 CST 2016
     */
    ChatRecord selectByPrimaryKey(Long mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_record
     *
     * @mbggenerated Mon Oct 03 20:36:49 CST 2016
     */
    int updateByPrimaryKeySelective(ChatRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chat_record
     *
     * @mbggenerated Mon Oct 03 20:36:49 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(ChatRecord record);

    List<ChatRecord> searchRecordsByID(@Param("indexs")List<Long> indexs);


    void batchInsertRecord(@Param("records") List<ChatRecord> records);

    List<ChatRecord> searchRecords(@Param(value = "dwID")String dwID,@Param(value = "contactID")String contactID);
}