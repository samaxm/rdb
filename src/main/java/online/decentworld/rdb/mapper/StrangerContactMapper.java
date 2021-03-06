package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.StrangerContact;
import online.decentworld.rdb.entity.StrangerContactKey;

import java.util.Set;

public interface StrangerContactMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stranger_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    int deleteByPrimaryKey(StrangerContactKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stranger_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    int insert(StrangerContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stranger_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    int insertSelective(StrangerContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stranger_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    StrangerContact selectByPrimaryKey(StrangerContactKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stranger_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    int updateByPrimaryKeySelective(StrangerContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stranger_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    int updateByPrimaryKey(StrangerContact record);


    Set<StrangerContact> getStrangerContacts(String dwid);

}