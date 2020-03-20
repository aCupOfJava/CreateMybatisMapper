package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StPdmmysqS implements Serializable {
    private String stcd;

    private Short yr;

    private Short mnth;

    private Short prdtp;

    private BigDecimal accp;

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

    public BigDecimal getAccp() {
        return accp;
    }

    public void setAccp(BigDecimal accp) {
        this.accp = accp;
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
        sb.append(", accp=").append(accp);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}