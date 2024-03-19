package com.wengxiulin.bean;

import java.util.Date;

/**
 * 读者信息对象 tb_reader
 *
 * @author 翁修林
 * @date 2022-10-14
 */
public class TbReader {
    private static final long serialVersionUID = 1L;

    /** 读者编号/借书证号【主键】 */
    private Long rdId;

    /** 读者姓名 */
    private String rdName;

    /** 性别 */
    private String rdSex;

    /** 读者类别 */
    private Long rdType;

    /** 单位代码 */
    private String rdDept;

    /** 电话号码 */
    private String rdPhone;

    /** 电子邮箱 */
    private String rdEmail;

    /** 读者登记日期/办证日期 */
    private Date rdDateReg;

    /** 读者照片 */
    private String rdPhoto;

    /** 证件状态 */
    private Integer rdStatus;

    /** 已借书数量 */
    private Long rdLendBookNum;

    /** 读者密码 */
    private String rdPwd;

    /** 管理角色 */
    private Integer rdAdminRoles;

    public void setRdId(Long rdId)
    {
        this.rdId = rdId;
    }

    public Long getRdId()
    {
        return rdId;
    }
    public void setRdName(String rdName)
    {
        this.rdName = rdName;
    }

    public String getRdName()
    {
        return rdName;
    }
    public void setRdSex(String rdSex)
    {
        this.rdSex = rdSex;
    }

    public String getRdSex()
    {
        return rdSex;
    }
    public void setRdType(Long rdType)
    {
        this.rdType = rdType;
    }

    public Long getRdType()
    {
        return rdType;
    }
    public void setRdDept(String rdDept)
    {
        this.rdDept = rdDept;
    }

    public String getRdDept()
    {
        return rdDept;
    }
    public void setRdPhone(String rdPhone)
    {
        this.rdPhone = rdPhone;
    }

    public String getRdPhone()
    {
        return rdPhone;
    }
    public void setRdEmail(String rdEmail)
    {
        this.rdEmail = rdEmail;
    }

    public String getRdEmail()
    {
        return rdEmail;
    }
    public void setRdDateReg(Date rdDateReg)
    {
        this.rdDateReg = rdDateReg;
    }

    public Date getRdDateReg()
    {
        return rdDateReg;
    }
    public void setRdPhoto(String rdPhoto)
    {
        this.rdPhoto = rdPhoto;
    }

    public String getRdPhoto()
    {
        return rdPhoto;
    }
    public void setRdStatus(Integer rdStatus)
    {
        this.rdStatus = rdStatus;
    }

    public Integer getRdStatus()
    {
        return rdStatus;
    }
    public void setRdLendBookNum(Long rdLendBookNum)
    {
        this.rdLendBookNum = rdLendBookNum;
    }

    public Long getRdLendBookNum()
    {
        return rdLendBookNum;
    }
    public void setRdPwd(String rdPwd)
    {
        this.rdPwd = rdPwd;
    }

    public String getRdPwd()
    {
        return rdPwd;
    }
    public void setRdAdminRoles(Integer rdAdminRoles)
    {
        this.rdAdminRoles = rdAdminRoles;
    }

    public Integer getRdAdminRoles()
    {
        return rdAdminRoles;
    }

    @Override
    public String toString() {
        return "TbReader{" +
                "rdId=" + rdId +
                ", rdName='" + rdName + '\'' +
                ", rdSex='" + rdSex + '\'' +
                ", rdType=" + rdType +
                ", rdDept='" + rdDept + '\'' +
                ", rdPhone='" + rdPhone + '\'' +
                ", rdEmail='" + rdEmail + '\'' +
                ", rdDateReg=" + rdDateReg +
                ", rdPhoto='" + rdPhoto + '\'' +
                ", rdStatus=" + rdStatus +
                ", rdLendBookNum=" + rdLendBookNum +
                ", rdPwd='" + rdPwd + '\'' +
                ", rdAdminRoles=" + rdAdminRoles +
                '}';
    }
}
