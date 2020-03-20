package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRvdmmysqS implements Serializable {
    private String stcd;

    private Short yr;

    private Short mnth;

    private Short prdtp;

    private BigDecimal avz;

    private BigDecimal avq;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Short getYr() {
        return yr;
    }

    public void setYr(Short yr) {
        this.yr = yr;
    }

    public Short getMnth() {
        return mnth;
    }

    public void setMnth(Short mnth) {
        this.mnth = mnth;
    }

    public Short getPrdtp() {
        return prdtp;
    }

    public void setPrdtp(Short prdtp) {
        this.prdtp = prdtp;
    }

    public BigDecimal getAvz() {
        return avz;
    }

    public void setAvz(BigDecimal avz) {
        this.avz = avz;
    }

    public BigDecimal getAvq() {
        return avq;
    }

    public void setAvq(BigDecimal avq) {
        this.avq = avq;
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
        sb.append(", stcd=").append(stcd);
        sb.append(", yr=").append(yr);
        sb.append(", mnth=").append(mnth);
        sb.append(", prdtp=").append(prdtp);
        sb.append(", avz=").append(avz);
        sb.append(", avq=").append(avq);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}