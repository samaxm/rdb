package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.PartnerCode;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PartnerCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner_code
     *
     * @mbggenerated Sat Dec 24 13:37:19 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner_code
     *
     * @mbggenerated Sat Dec 24 13:37:19 CST 2016
     */
    int insert(PartnerCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner_code
     *
     * @mbggenerated Sat Dec 24 13:37:19 CST 2016
     */
    int insertSelective(PartnerCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner_code
     *
     * @mbggenerated Sat Dec 24 13:37:19 CST 2016
     */
    PartnerCode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner_code
     *
     * @mbggenerated Sat Dec 24 13:37:19 CST 2016
     */
    int updateByPrimaryKeySelective(PartnerCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner_code
     *
     * @mbggenerated Sat Dec 24 13:37:19 CST 2016
     */
    int updateByPrimaryKey(PartnerCode record);



    PartnerCode isCodeExist(@Param(value = "code") String code);


    void batchInsertCodes(@Param("list") List<PartnerCode> list);

}