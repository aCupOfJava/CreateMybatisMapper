package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRsvrR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal rz;

    private BigDecimal inq;

    private BigDecimal w;

    private BigDecimal blrz;

    private BigDecimal otq;

    private String rwchrcd;

    private String rwptn;

    private BigDecimal inqdr;

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

    public BigDecimal getRz() {
        return rz;
    }

    public void setRz(BigDecimal rz) {
        this.rz = rz;
    }

    public BigDecimal getInq() {
        return inq;
    }

    public void setInq(BigDecimal inq) {
        this.inq = inq;
    }

    public BigDecimal getW() {
        return w;
    }

    public void setW(BigDecimal w) {
        this.w = w;
    }

    public BigDecimal getBlrz() {
        return blrz;
    }

    public void setBlrz(BigDecimal blrz) {
        this.blrz = blrz;
    }

    public BigDecimal getOtq() {
        return otq;
    }

    public void setOtq(BigDecimal otq) {
        this.otq = otq;
    }

    public String getRwchrcd() {
        return rwchrcd;
    }

    public void setRwchrcd(String rwchrcd) {
        this.rwchrcd = rwchrcd == null ? null : rwchrcd.trim();
    }

    public String getRwptn() {
        return rwptn;
    }

    public void setRwptn(String rwptn) {
        this.rwptn = rwptn == null ? null : rwptn.trim();
    }

    public BigDecimal getInqdr() {
        return inqdr;
    }

    public void setInqdr(BigDecimal inqdr) {
        this.inqdr = inqdr;
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
        sb.append(", rz=").append(rz);
        sb.append(", inq=").append(inq);
        sb.append(", w=").append(w);
        sb.append(", blrz=").append(blrz);
        sb.append(", otq=").append(otq);
        sb.append(", rwchrcd=").append(rwchrcd);
        sb.append(", rwptn=").append(rwptn);
        sb.append(", inqdr=").append(inqdr);
        sb.append(", msqmt=").append(msqmt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}