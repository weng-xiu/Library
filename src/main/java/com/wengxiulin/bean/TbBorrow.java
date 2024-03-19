package com.wengxiulin.bean;

import java.util.Date;

/**
 * 借阅信息对象 tb_borrow
 *
 * @author 翁修林
 * @date 2022-10-14
 */
public class TbBorrow {
    private static final long serialVersionUID = 1L;

    /** 借书顺序号【主键】 */
    private Long brId;

    /** 读者序号【外键TB_Reader】 */

    private Long rdId;

    /** 图书序号【外键TB_Book】 */
    private Long bkId;

    /** 续借次数（第一次借时，记为0） */
    private Long brContinueTimes;

    /** 借书日期 */
    private Date brDateOut;

    /** 应还日期 */
    private Date brDateRetPlan;

    /** 实际还书日期 */
    private Date brDateRetAct;

    /** 超期天数 */
    private Long brOverDay;

    /** 超期金额（应罚款金额） */
    private Long brOverMoney;

    /** 罚款金额 */
    private Long brPunishMoney;

    /** 是否已经还书，缺省为0-未还 */
    private Long brIsHasReturn;

    /** 借书操作员 */
    private String brOperatorLend;

    /** 还书操作员 */
    private String brOperatorRet;

    public void setBrId(Long brId)
    {
        this.brId = brId;
    }

    public Long getBrId()
    {
        return brId;
    }
    public void setRdId(Long rdId)
    {
        this.rdId = rdId;
    }

    public Long getRdId()
    {
        return rdId;
    }
    public void setBkId(Long bkId)
    {
        this.bkId = bkId;
    }

    public Long getBkId()
    {
        return bkId;
    }
    public void setBrContinueTimes(Long brContinueTimes)
    {
        this.brContinueTimes = brContinueTimes;
    }

    public Long getBrContinueTimes()
    {
        return brContinueTimes;
    }
    public void setBrDateOut(Date brDateOut)
    {
        this.brDateOut = brDateOut;
    }

    public Date getBrDateOut()
    {
        return brDateOut;
    }
    public void setBrDateRetPlan(Date brDateRetPlan)
    {
        this.brDateRetPlan = brDateRetPlan;
    }

    public Date getBrDateRetPlan()
    {
        return brDateRetPlan;
    }
    public void setBrDateRetAct(Date brDateRetAct)
    {
        this.brDateRetAct = brDateRetAct;
    }

    public Date getBrDateRetAct()
    {
        return brDateRetAct;
    }
    public void setBrOverDay(Long brOverDay)
    {
        this.brOverDay = brOverDay;
    }

    public Long getBrOverDay()
    {
        return brOverDay;
    }
    public void setBrOverMoney(Long brOverMoney)
    {
        this.brOverMoney = brOverMoney;
    }

    public Long getBrOverMoney()
    {
        return brOverMoney;
    }
    public void setBrPunishMoney(Long brPunishMoney)
    {
        this.brPunishMoney = brPunishMoney;
    }

    public Long getBrPunishMoney()
    {
        return brPunishMoney;
    }
    public void setBrIsHasReturn(Long brIsHasReturn)
    {
        this.brIsHasReturn = brIsHasReturn;
    }

    public Long getBrIsHasReturn()
    {
        return brIsHasReturn;
    }
    public void setBrOperatorLend(String brOperatorLend)
    {
        this.brOperatorLend = brOperatorLend;
    }

    public String getBrOperatorLend()
    {
        return brOperatorLend;
    }
    public void setBrOperatorRet(String brOperatorRet)
    {
        this.brOperatorRet = brOperatorRet;
    }

    public String getBrOperatorRet()
    {
        return brOperatorRet;
    }

    @Override
    public String toString() {
        return "TbBorrow{" +
                "brId=" + brId +
                ", rdId=" + rdId +
                ", bkId=" + bkId +
                ", brContinueTimes=" + brContinueTimes +
                ", brDateOut=" + brDateOut +
                ", brDateRetPlan=" + brDateRetPlan +
                ", brDateRetAct=" + brDateRetAct +
                ", brOverDay=" + brOverDay +
                ", brOverMoney=" + brOverMoney +
                ", brPunishMoney=" + brPunishMoney +
                ", brIsHasReturn=" + brIsHasReturn +
                ", brOperatorLend='" + brOperatorLend + '\'' +
                ", brOperatorRet='" + brOperatorRet + '\'' +
                '}';
    }
}
