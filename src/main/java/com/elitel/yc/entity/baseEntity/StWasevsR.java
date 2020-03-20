package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StWasevsR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal htupz;

    private BigDecimal ltupz;

    private BigDecimal mxgtq;

    private BigDecimal mngtq;

    private BigDecimal htdwz;

    private BigDecimal ltdwz;

    private Date htupztm;

    private Date ltupztm;

    private Date mxgtqtm;

    private Date mngtqtm;

    private Date htdwztm;

    private Date ltdwztm;

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

    public BigDecimal getHtupz() {
        return htupz;
    }

    public void setHtupz(BigDecimal htupz) {
        this.htupz = htupz;
    }

    public BigDecimal getLtupz() {
        return ltupz;
    }

    public void setLtupz(BigDecimal ltupz) {
        this.ltupz = ltupz;
    }

    public BigDecimal getMxgtq() {
        return mxgtq;
    }

    public void setMxgtq(BigDecimal mxgtq) {
        this.mxgtq = mxgtq;
    }

    public BigDecimal getMngtq() {
        return mngtq;
    }

    public void setMngtq(BigDecimal mngtq) {
        this.mngtq = mngtq;
    }

    public BigDecimal getHtdwz() {
        return htdwz;
    }

    public void setHtdwz(BigDecimal htdwz) {
        this.htdwz = htdwz;
    }

    public BigDecimal getLtdwz() {
        return ltdwz;
    }

    public void setLtdwz(BigDecimal ltdwz) {
        this.ltdwz = ltdwz;
    }

    public Date getHtupztm() {
        return htupztm;
    }

    public void setHtupztm(Date htupztm) {
        this.htupztm = htupztm;
    }

    public Date getLtupztm() {
        return ltupztm;
    }

    public void setLtupztm(Date ltupztm) {
        this.ltupztm = ltupztm;
    }

    public Date getMxgtqtm() {
        return mxgtqtm;
    }

    public void setMxgtqtm(Date mxgtqtm) {
        this.mxgtqtm = mxgtqtm;
    }

    public Date getMngtqtm() {
        return mngtqtm;
    }

    public void setMngtqtm(Date mngtqtm) {
        this.mngtqtm = mngtqtm;
    }

    public Date getHtdwztm() {
        return htdwztm;
    }

    public void setHtdwztm(Date htdwztm) {
        this.htdwztm = htdwztm;
    }

    public Date getLtdwztm() {
        return ltdwztm;
    }

    public void setLtdwztm(Date ltdwztm) {
        this.ltdwztm = ltdwztm;
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
        sb.append(", htupz=").append(htupz);
        sb.append(", ltupz=").append(ltupz);
        sb.append(", mxgtq=").append(mxgtq);
        sb.append(", mngtq=").append(mngtq);
        sb.append(", htdwz=").append(htdwz);
        sb.append(", ltdwz=").append(ltdwz);
        sb.append(", htupztm=").append(htupztm);
        sb.append(", ltupztm=").append(ltupztm);
        sb.append(", mxgtqtm=").append(mxgtqtm);
        sb.append(", mngtqtm=").append(mngtqtm);
        sb.append(", htdwztm=").append(htdwztm);
        sb.append(", ltdwztm=").append(ltdwztm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}