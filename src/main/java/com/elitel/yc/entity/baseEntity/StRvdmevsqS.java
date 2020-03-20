package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRvdmevsqS implements Serializable {
    private String stcd;

    private Short yr;

    private Short mnth;

    private Short prdtp;

    private BigDecimal htz;

    private Date htztm;

    private BigDecimal mxq;

    private Date mxqtm;

    private BigDecimal ltz;

    private Date ltztm;

    private BigDecimal mnq;

    private Date mnqtm;

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

    public BigDecimal getHtz() {
        return htz;
    }

    public void setHtz(BigDecimal htz) {
        this.htz = htz;
    }

    public Date getHtztm() {
        return htztm;
    }

    public void setHtztm(Date htztm) {
        this.htztm = htztm;
    }

    public BigDecimal getMxq() {
        return mxq;
    }

    public void setMxq(BigDecimal mxq) {
        this.mxq = mxq;
    }

    public Date getMxqtm() {
        return mxqtm;
    }

    public void setMxqtm(Date mxqtm) {
        this.mxqtm = mxqtm;
    }

    public BigDecimal getLtz() {
        return ltz;
    }

    public void setLtz(BigDecimal ltz) {
        this.ltz = ltz;
    }

    public Date getLtztm() {
        return ltztm;
    }

    public void setLtztm(Date ltztm) {
        this.ltztm = ltztm;
    }

    public BigDecimal getMnq() {
        return mnq;
    }

    public void setMnq(BigDecimal mnq) {
        this.mnq = mnq;
    }

    public Date getMnqtm() {
        return mnqtm;
    }

    public void setMnqtm(Date mnqtm) {
        this.mnqtm = mnqtm;
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
        sb.append(", htz=").append(htz);
        sb.append(", htztm=").append(htztm);
        sb.append(", mxq=").append(mxq);
        sb.append(", mxqtm=").append(mxqtm);
        sb.append(", ltz=").append(ltz);
        sb.append(", ltztm=").append(ltztm);
        sb.append(", mnq=").append(mnq);
        sb.append(", mnqtm=").append(mnqtm);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}