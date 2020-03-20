package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StTmpevsR implements Serializable {
    private String stcd;

    private Date idtm;

    private String sttdrcd;

    private BigDecimal mxatmp;

    private BigDecimal mnatmp;

    private BigDecimal mxwtmp;

    private BigDecimal mnwtmp;

    private Date mxatmptm;

    private Date mnatmptm;

    private Date mxwtmptm;

    private Date mnwtmptm;

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

    public BigDecimal getMxatmp() {
        return mxatmp;
    }

    public void setMxatmp(BigDecimal mxatmp) {
        this.mxatmp = mxatmp;
    }

    public BigDecimal getMnatmp() {
        return mnatmp;
    }

    public void setMnatmp(BigDecimal mnatmp) {
        this.mnatmp = mnatmp;
    }

    public BigDecimal getMxwtmp() {
        return mxwtmp;
    }

    public void setMxwtmp(BigDecimal mxwtmp) {
        this.mxwtmp = mxwtmp;
    }

    public BigDecimal getMnwtmp() {
        return mnwtmp;
    }

    public void setMnwtmp(BigDecimal mnwtmp) {
        this.mnwtmp = mnwtmp;
    }

    public Date getMxatmptm() {
        return mxatmptm;
    }

    public void setMxatmptm(Date mxatmptm) {
        this.mxatmptm = mxatmptm;
    }

    public Date getMnatmptm() {
        return mnatmptm;
    }

    public void setMnatmptm(Date mnatmptm) {
        this.mnatmptm = mnatmptm;
    }

    public Date getMxwtmptm() {
        return mxwtmptm;
    }

    public void setMxwtmptm(Date mxwtmptm) {
        this.mxwtmptm = mxwtmptm;
    }

    public Date getMnwtmptm() {
        return mnwtmptm;
    }

    public void setMnwtmptm(Date mnwtmptm) {
        this.mnwtmptm = mnwtmptm;
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
        sb.append(", mxatmp=").append(mxatmp);
        sb.append(", mnatmp=").append(mnatmp);
        sb.append(", mxwtmp=").append(mxwtmp);
        sb.append(", mnwtmp=").append(mnwtmp);
        sb.append(", mxatmptm=").append(mxatmptm);
        sb.append(", mnatmptm=").append(mnatmptm);
        sb.append(", mxwtmptm=").append(mxwtmptm);
        sb.append(", mnwtmptm=").append(mnwtmptm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}