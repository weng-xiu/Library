package com.wengxiulin.bean;

/**
 * 读者类别对象 tb_readertype
 *
 * @author 翁修林
 * @date 2022-10-14
 */
public class TbReadertype {
    private static final long serialVersionUID = 1L;

    /** 读者类别 */
    private Long rdtTypeId;

    /** 读者类别名称 */
    private String rdtTypeName;

    /** 可借书数量 */
    private Integer rdtCanLendNum;

    /** 可借书天数 */
    private Integer rdtLendDay;

    /** 可续借的次数 */
    private Integer rdtLendFrequency;

    /** 罚款率 */
    private Integer rdtPunishRate;

    /** 证书有效期 */
    private Integer rdtDateValid;

    public void setRdtTypeId(Long rdtTypeId)
    {
        this.rdtTypeId = rdtTypeId;
    }

    public Long getRdtTypeId()
    {
        return rdtTypeId;
    }
    public void setRdtTypeName(String rdtTypeName)
    {
        this.rdtTypeName = rdtTypeName;
    }

    public String getRdtTypeName()
    {
        return rdtTypeName;
    }
    public void setRdtCanLendNum(Integer rdtCanLendNum)
    {
        this.rdtCanLendNum = rdtCanLendNum;
    }

    public Integer getRdtCanLendNum()
    {
        return rdtCanLendNum;
    }
    public void setRdtLendDay(Integer rdtLendDay)
    {
        this.rdtLendDay = rdtLendDay;
    }

    public Integer getRdtLendDay()
    {
        return rdtLendDay;
    }
    public void setRdtLendFrequency(Integer rdtLendFrequency)
    {
        this.rdtLendFrequency = rdtLendFrequency;
    }

    public Integer getRdtLendFrequency()
    {
        return rdtLendFrequency;
    }
    public void setRdtPunishRate(Integer rdtPunishRate)
    {
        this.rdtPunishRate = rdtPunishRate;
    }

    public Integer getRdtPunishRate()
    {
        return rdtPunishRate;
    }
    public void setRdtDateValid(Integer rdtDateValid)
    {
        this.rdtDateValid = rdtDateValid;
    }

    public Integer getRdtDateValid()
    {
        return rdtDateValid;
    }

    @Override
    public String toString() {
        return "TbReadertype{" +
                "rdtTypeId=" + rdtTypeId +
                ", rdtTypeName='" + rdtTypeName + '\'' +
                ", rdtCanLendNum=" + rdtCanLendNum +
                ", rdtLendDay=" + rdtLendDay +
                ", rdtLendFrequency=" + rdtLendFrequency +
                ", rdtPunishRate=" + rdtPunishRate +
                ", rdtDateValid=" + rdtDateValid +
                '}';
    }
}
