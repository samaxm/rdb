package online.decentworld.rdb.entity;

import java.util.Date;

/**
 * Created by Sammax on 2016/10/4.
 */
public class LikeRecordDetail {

   private BaseDisplayUserInfo info;
    private Date time;
    private String status;

    public LikeRecordDetail() {
    }
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }



    public BaseDisplayUserInfo getInfo() {
        return info;
    }

    public void setInfo(BaseDisplayUserInfo info) {
        this.info = info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
