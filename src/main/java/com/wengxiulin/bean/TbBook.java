package com.wengxiulin.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 图书信息对象 tb_book
 *
 * @author 翁修林
 * @date 2022-10-14
 */
public class TbBook {
    private static final long serialVersionUID = 1L;

    /** 图书序号 */

    private Long bkId;

    /** 图书编号 */

    private String bkCode;

    /** 书名 */

    private String bkName;

    /** 作者 */

    private String bkAuthor;

    /** 出版社 */

    private String bkPress;

    /** 出版日期 */

    private Date bkDatePress;

    /** ISBN书号 */

    private String bkIsbn;

    /** 分类号 */

    private String bkCatalog;

    /** 语言 */

    private Integer bkLanguage;

    /** 页数 */

    private Integer bkPages;

    /** 价格 */

    private BigDecimal bkPrice;

    /** 入馆日期 */

    private Date bkDatein;

    /** 内容简介 */

    private String bkBrief;

    /** 图书封面照片 */

    private String bkCover;

    /** 图书状态 */

    private Integer bkStatus;

    /** 图书所在地 */

    private Long pId;

    public void setBkId(Long bkId)
    {
        this.bkId = bkId;
    }

    public Long getBkId()
    {
        return bkId;
    }
    public void setBkCode(String bkCode)
    {
        this.bkCode = bkCode;
    }

    public String getBkCode()
    {
        return bkCode;
    }
    public void setBkName(String bkName)
    {
        this.bkName = bkName;
    }

    public String getBkName()
    {
        return bkName;
    }
    public void setBkAuthor(String bkAuthor)
    {
        this.bkAuthor = bkAuthor;
    }

    public String getBkAuthor()
    {
        return bkAuthor;
    }
    public void setBkPress(String bkPress)
    {
        this.bkPress = bkPress;
    }

    public String getBkPress()
    {
        return bkPress;
    }
    public void setBkDatePress(Date bkDatePress)
    {
        this.bkDatePress = bkDatePress;
    }

    public Date getBkDatePress()
    {
        return bkDatePress;
    }
    public void setBkIsbn(String bkIsbn)
    {
        this.bkIsbn = bkIsbn;
    }

    public String getBkIsbn()
    {
        return bkIsbn;
    }
    public void setBkCatalog(String bkCatalog)
    {
        this.bkCatalog = bkCatalog;
    }

    public String getBkCatalog()
    {
        return bkCatalog;
    }
    public void setBkLanguage(Integer bkLanguage)
    {
        this.bkLanguage = bkLanguage;
    }

    public Integer getBkLanguage()
    {
        return bkLanguage;
    }
    public void setBkPages(Integer bkPages)
    {
        this.bkPages = bkPages;
    }

    public Integer getBkPages()
    {
        return bkPages;
    }
    public void setBkPrice(BigDecimal bkPrice)
    {
        this.bkPrice = bkPrice;
    }

    public BigDecimal getBkPrice()
    {
        return bkPrice;
    }
    public void setBkDatein(Date bkDatein)
    {
        this.bkDatein = bkDatein;
    }

    public Date getBkDatein()
    {
        return bkDatein;
    }
    public void setBkBrief(String bkBrief)
    {
        this.bkBrief = bkBrief;
    }

    public String getBkBrief()
    {
        return bkBrief;
    }
    public void setBkCover(String bkCover)
    {
        this.bkCover = bkCover;
    }

    public String getBkCover()
    {
        return bkCover;
    }
    public void setBkStatus(Integer bkStatus)
    {
        this.bkStatus = bkStatus;
    }

    public Integer getBkStatus()
    {
        return bkStatus;
    }
    public void setpId(Long pId)
    {
        this.pId = pId;
    }

    public Long getpId()
    {
        return pId;
    }

    @Override
    public String toString() {
        return "TbBook{" +
                "bkId=" + bkId +
                ", bkCode='" + bkCode + '\'' +
                ", bkName='" + bkName + '\'' +
                ", bkAuthor='" + bkAuthor + '\'' +
                ", bkPress='" + bkPress + '\'' +
                ", bkDatePress=" + bkDatePress +
                ", bkIsbn='" + bkIsbn + '\'' +
                ", bkCatalog='" + bkCatalog + '\'' +
                ", bkLanguage=" + bkLanguage +
                ", bkPages=" + bkPages +
                ", bkPrice=" + bkPrice +
                ", bkDatein=" + bkDatein +
                ", bkBrief='" + bkBrief + '\'' +
                ", bkCover='" + bkCover + '\'' +
                ", bkStatus=" + bkStatus +
                ", pId=" + pId +
                '}';
    }
}
