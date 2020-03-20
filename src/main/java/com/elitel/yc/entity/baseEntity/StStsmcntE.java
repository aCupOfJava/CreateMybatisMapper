package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StStsmcntE implements Serializable {
    private String instcd;

    private String stcd;

    private Date countday;

    private String infstatus;

    private String inftype;

    private String frgrd;

    private Integer icnt;

    private Integer ucnt;

    private Integer dcnt;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getInstcd() {
        return instcd;
    }

    public void setInstcd(String instcd) {
        this.instcd = instcd == null ? null : instcd.trim();
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Date getCountday() {
        return countday;
    }

    public void setCountday(Date countday) {
        this.countday = countday;
    }

    public String getInfstatus() {
        return infstatus;
    }

    public void setInfstatus(String infstatus) {
        this.infstatus = infstatus == null ? null : infstatus.trim();
    }

    public String getInftype() {
        return inftype;
    }

    public void setInftype(String inftype) {
        this.inftype = inftype == null ? null : inftype.trim();
    }

    public String getFrgrd() {
        return frgrd;
    }

    public void setFrgrd(String frgrd) {
        this.frgrd = frgrd == null ? null : frgrd.trim();
    }

    public Integer getIcnt() {
        return icnt;
    }

    public void setIcnt(Integer icnt) {
        this.icnt = icnt;
    }

    public Integer getUcnt() {
        return ucnt;
    }

    public void setUcnt(Integer ucnt) {
        this.ucnt = ucnt;
    }

    public Integer getDcnt() {
        return dcnt;
    }

    public void setDcnt(Integer dcnt) {
        this.dcnt = dcnt;
    }

    public Date getModitime() {
        return moditime;
    }

    public void setModitime(Date moditime) {
        this.moditime = moditime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", instcd=").append(instcd);
        sb.append(", stcd=").append(stcd);
        sb.append(", countday=").append(countday);
        sb.append(", infstatus=").append(infstatus);
        sb.append(", inftype=").append(inftype);
        sb.append(", frgrd=").append(frgrd);
        sb.append(", icnt=").append(icnt);
        sb.append(", ucnt=").append(ucnt);
        sb.append(", dcnt=").append(dcnt);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}