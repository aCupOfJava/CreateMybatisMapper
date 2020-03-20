package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StGateR implements Serializable {
    private String stcd;

    private Date tm;

    private String exkey;

    private String eqptp;

    private String eqpno;

    private Short gtopnum;

    private BigDecimal gtophgt;

    private BigDecimal gtq;

    private String msqmt;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Date getTm() {
        return tm;
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }

    public String getExkey() {
        return exkey;
    }

    public void setExkey(String exkey) {
        this.exkey = exkey == null ? null : exkey.trim();
    }

    public String getEqptp() {
        return eqptp;
    }

    public void setEqptp(String eqptp) {
        this.eqptp = eqptp == null ? null : eqptp.trim();
    }

    public String getEqpno() {
        return eqpno;
    }

    public void setEqpno(String eqpno) {
        this.eqpno = eqpno == null ? null : eqpno.trim();
    }

    public Short getGtopnum() {
        return gtopnum;
    }

    public void setGtopnum(Short gtopnum) {
        this.gtopnum = gtopnum;
    }

    public BigDecimal getGtophgt() {
        return gtophgt;
    }

    public void setGtophgt(BigDecimal gtophgt) {
        this.gtophgt = gtophgt;
    }

    public BigDecimal getGtq() {
        return gtq;
    }

    public void setGtq(BigDecimal gtq) {
        this.gtq = gtq;
    }

    public String getMsqmt() {
        return msqmt;
    }

    public void setMsqmt(String msqmt) {
        this.msqmt = msqmt == null ? null : msqmt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", exkey=").append(exkey);
        sb.append(", eqptp=").append(eqptp);
        sb.append(", eqpno=").append(eqpno);
        sb.append(", gtopnum=").append(gtopnum);
        sb.append(", gtophgt=").append(gtophgt);
        sb.append(", gtq=").append(gtq);
        sb.append(", msqmt=").append(msqmt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}