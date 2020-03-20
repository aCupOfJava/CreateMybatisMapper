package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StGrwevsR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal mxbd;

    private BigDecimal mnbd;

    private BigDecimal mxspq;

    private BigDecimal mnspq;

    private BigDecimal mxgwtmp;

    private BigDecimal mngwtmp;

    private Date mxbdtm;

    private Date mnbdtm;

    private Date mxspqtm;

    private Date mnspqtm;

    private Date mxgwtmptm;

    private Date mngwtmptm;

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

    public BigDecimal getMxbd() {
        return mxbd;
    }

    public void setMxbd(BigDecimal mxbd) {
        this.mxbd = mxbd;
    }

    public BigDecimal getMnbd() {
        return mnbd;
    }

    public void setMnbd(BigDecimal mnbd) {
        this.mnbd = mnbd;
    }

    public BigDecimal getMxspq() {
        return mxspq;
    }

    public void setMxspq(BigDecimal mxspq) {
        this.mxspq = mxspq;
    }

    public BigDecimal getMnspq() {
        return mnspq;
    }

    public void setMnspq(BigDecimal mnspq) {
        this.mnspq = mnspq;
    }

    public BigDecimal getMxgwtmp() {
        return mxgwtmp;
    }

    public void setMxgwtmp(BigDecimal mxgwtmp) {
        this.mxgwtmp = mxgwtmp;
    }

    public BigDecimal getMngwtmp() {
        return mngwtmp;
    }

    public void setMngwtmp(BigDecimal mngwtmp) {
        this.mngwtmp = mngwtmp;
    }

    public Date getMxbdtm() {
        return mxbdtm;
    }

    public void setMxbdtm(Date mxbdtm) {
        this.mxbdtm = mxbdtm;
    }

    public Date getMnbdtm() {
        return mnbdtm;
    }

    public void setMnbdtm(Date mnbdtm) {
        this.mnbdtm = mnbdtm;
    }

    public Date getMxspqtm() {
        return mxspqtm;
    }

    public void setMxspqtm(Date mxspqtm) {
        this.mxspqtm = mxspqtm;
    }

    public Date getMnspqtm() {
        return mnspqtm;
    }

    public void setMnspqtm(Date mnspqtm) {
        this.mnspqtm = mnspqtm;
    }

    public Date getMxgwtmptm() {
        return mxgwtmptm;
    }

    public void setMxgwtmptm(Date mxgwtmptm) {
        this.mxgwtmptm = mxgwtmptm;
    }

    public Date getMngwtmptm() {
        return mngwtmptm;
    }

    public void setMngwtmptm(Date mngwtmptm) {
        this.mngwtmptm = mngwtmptm;
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
        sb.append(", mxbd=").append(mxbd);
        sb.append(", mnbd=").append(mnbd);
        sb.append(", mxspq=").append(mxspq);
        sb.append(", mnspq=").append(mnspq);
        sb.append(", mxgwtmp=").append(mxgwtmp);
        sb.append(", mngwtmp=").append(mngwtmp);
        sb.append(", mxbdtm=").append(mxbdtm);
        sb.append(", mnbdtm=").append(mnbdtm);
        sb.append(", mxspqtm=").append(mxspqtm);
        sb.append(", mnspqtm=").append(mnspqtm);
        sb.append(", mxgwtmptm=").append(mxgwtmptm);
        sb.append(", mngwtmptm=").append(mngwtmptm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}