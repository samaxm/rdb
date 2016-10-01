package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.FriendContact;
import online.decentworld.rdb.entity.FriendContactKey;

import java.util.Set;

public interface FriendContactMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    int deleteByPrimaryKey(FriendContactKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    int insert(FriendContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    int insertSelective(FriendContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    FriendContact selectByPrimaryKey(FriendContactKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    int updateByPrimaryKeySelective(FriendContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend_contact
     *
     * @mbggenerated Sat Oct 01 18:58:05 CST 2016
     */
    int updateByPrimaryKey(FriendContact record);

    Set<FriendContact> getFriendContacts(String dwid);
}