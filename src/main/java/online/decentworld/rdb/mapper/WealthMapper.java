package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.DBChargeResult;
import online.decentworld.rdb.entity.Wealth;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

public interface WealthMapper {

    int insert(Wealth record);
    Wealth selectByPrimaryKey(String dwid);
    Wealth selectSerializable(String dwid);

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public DBChargeResult charge(@Param(value = "dwID") String dwID,@Param(value = "charge_amount")  int charge_amount);

    public void updateTest(@Param(value = "dwid") String dwID);
}