package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StWdpstatR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private Short pptms;

    private BigDecimal accpw;

    private BigDecimal pphrs;

    private Short drntms;

    private BigDecimal accdw;

    private BigDecimal drnhrs;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Date getIdtm() {
        return idtm;
    }

    public void setIdtm(Date idtm) {
        this.idtm = idtm;
    }

    public String getSttdrcd() {
        return sttdrcd;
    }

    public void setSttdrcd(String sttdrcd) {
        this.sttdrcd = sttdrcd == null ? null : sttdrcd.trim();
    }

    public Short getPptms() {
        return pptms;
    }

    public void setPptms(Short pptms) {
        this.pptms = pptms;
    }

    public BigDecimal getAccpw() {
        return accpw;
    }

    public void setAccpw(BigDecimal accpw) {
        this.accpw = accpw;
    }

    public BigDecimal getPphrs() {
        return pphrs;
    }

    public void setPphrs(BigDecimal pphrs) {
        this.pphrs = pphrs;
    }

    public Short getDrntms() {
        return drntms;
    }

    public void setDrntms(Short drntms) {
        this.drntms = drntms;
    }

    public BigDecimal getAccdw() {
        return accdw;
    }

    public void setAccdw(BigDecimal accdw) {
        this.accdw = accdw;
    }

    public BigDecimal getDrnhrs() {
        return drnhrs;
    }

    public void setDrnhrs(BigDecimal drnhrs) {
        this.drnhrs = drnhrs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", idtm=").append(idtm);
        sb.append(", sttdrcd=").append(sttdrcd);
        sb.append(", pptms=").append(pptms);
        sb.append(", accpw=").append(accpw);
        sb.append(", pphrs=").append(pphrs);
        sb.append(", drntms=").append(drntms);
        sb.append(", accdw=").append(accdw);
        sb.append(", drnhrs=").append(drnhrs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}