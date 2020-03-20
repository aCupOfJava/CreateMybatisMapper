package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRsvrevsR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal htrz;

    private BigDecimal ltrz;

    private BigDecimal mxinq;

    private BigDecimal mninq;

    private BigDecimal mxotq;

    private BigDecimal mnotq;

    private BigDecimal mxw;

    private BigDecimal mnw;

    private Date htrztm;

    private Date ltrztm;

    private Date mxinqtm;

    private Date mninqtm;

    private Date mxotqtm;

    private Date mnotqtm;

    private Date mxwtm;

    private Date mnwtm;

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

    public BigDecimal getHtrz() {
        return htrz;
    }

    public void setHtrz(BigDecimal htrz) {
        this.htrz = htrz;
    }

    public BigDecimal getLtrz() {
        return ltrz;
    }

    public void setLtrz(BigDecimal ltrz) {
        this.ltrz = ltrz;
    }

    public BigDecimal getMxinq() {
        return mxinq;
    }

    public void setMxinq(BigDecimal mxinq) {
        this.mxinq = mxinq;
    }

    public BigDecimal getMninq() {
        return mninq;
    }

    public void setMninq(BigDecimal mninq) {
        this.mninq = mninq;
    }

    public BigDecimal getMxotq() {
        return mxotq;
    }

    public void setMxotq(BigDecimal mxotq) {
        this.mxotq = mxotq;
    }

    public BigDecimal getMnotq() {
        return mnotq;
    }

    public void setMnotq(BigDecimal mnotq) {
        this.mnotq = mnotq;
    }

    public BigDecimal getMxw() {
        return mxw;
    }

    public void setMxw(BigDecimal mxw) {
        this.mxw = mxw;
    }

    public BigDecimal getMnw() {
        return mnw;
    }

    public void setMnw(BigDecimal mnw) {
        this.mnw = mnw;
    }

    public Date getHtrztm() {
        return htrztm;
    }

    public void setHtrztm(Date htrztm) {
        this.htrztm = htrztm;
    }

    public Date getLtrztm() {
        return ltrztm;
    }

    public void setLtrztm(Date ltrztm) {
        this.ltrztm = ltrztm;
    }

    public Date getMxinqtm() {
        return mxinqtm;
    }

    public void setMxinqtm(Date mxinqtm) {
        this.mxinqtm = mxinqtm;
    }

    public Date getMninqtm() {
        return mninqtm;
    }

    public void setMninqtm(Date mninqtm) {
        this.mninqtm = mninqtm;
    }

    public Date getMxotqtm() {
        return mxotqtm;
    }

    public void setMxotqtm(Date mxotqtm) {
        this.mxotqtm = mxotqtm;
    }

    public Date getMnotqtm() {
        return mnotqtm;
    }

    public void setMnotqtm(Date mnotqtm) {
        this.mnotqtm = mnotqtm;
    }

    public Date getMxwtm() {
        return mxwtm;
    }

    public void setMxwtm(Date mxwtm) {
        this.mxwtm = mxwtm;
    }

    public Date getMnwtm() {
        return mnwtm;
    }

    public void setMnwtm(Date mnwtm) {
        this.mnwtm = mnwtm;
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
        sb.append(", htrz=").append(htrz);
        sb.append(", ltrz=").append(ltrz);
        sb.append(", mxinq=").append(mxinq);
        sb.append(", mninq=").append(mninq);
        sb.append(", mxotq=").append(mxotq);
        sb.append(", mnotq=").append(mnotq);
        sb.append(", mxw=").append(mxw);
        sb.append(", mnw=").append(mnw);
        sb.append(", htrztm=").append(htrztm);
        sb.append(", ltrztm=").append(ltrztm);
        sb.append(", mxinqtm=").append(mxinqtm);
        sb.append(", mninqtm=").append(mninqtm);
        sb.append(", mxotqtm=").append(mxotqtm);
        sb.append(", mnotqtm=").append(mnotqtm);
        sb.append(", mxwtm=").append(mxwtm);
        sb.append(", mnwtm=").append(mnwtm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}