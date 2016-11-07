package online.decentworld.rdb.entity;

/**
 * Created by Sammax on 2016/9/8.
 */
public class DBChargeResult {
    public int getNewWealth() {
        return newWealth;
    }

    public void setNewWealth(int newWealth) {
        this.newWealth = newWealth;
    }

    private int resultCode;
    private int newWealth;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }


    public static int SUCCESS=1;
    public static int WEALTH_NOT_ENOUGH=0;
    public static int USER_NOT_FOUND=3;
}
