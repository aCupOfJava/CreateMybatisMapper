package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRiverR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal z;

    private BigDecimal q;

    private BigDecimal xsa;

    private BigDecimal xsavv;

    private BigDecimal xsmxv;

    private String flwchrcd;

    private String wptn;

    private String msqmt;

    private String msamt;

    private String msvmt;

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

    public BigDecimal getZ() {
        return z;
    }

    public void setZ(BigDecimal z) {
        this.z = z;
    }

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }

    public BigDecimal getXsa() {
        return xsa;
    }

    public void setXsa(BigDecimal xsa) {
        this.xsa = xsa;
    }

    public BigDecimal getXsavv() {
        return xsavv;
    }

    public void setXsavv(BigDecimal xsavv) {
        this.xsavv = xsavv;
    }

    public BigDecimal getXsmxv() {
        return xsmxv;
    }

    public void setXsmxv(BigDecimal xsmxv) {
        this.xsmxv = xsmxv;
    }

    public String getFlwchrcd() {
        return flwchrcd;
    }

    public void setFlwchrcd(String flwchrcd) {
        this.flwchrcd = flwchrcd == null ? null : flwchrcd.trim();
    }

    public String getWptn() {
        return wptn;
    }

    public void setWptn(String wptn) {
        this.wptn = wptn == null ? null : wptn.trim();
    }

    public String getMsqmt() {
        return msqmt;
    }

    public void setMsqmt(String msqmt) {
        this.msqmt = msqmt == null ? null : msqmt.trim();
    }

    public String getMsamt() {
        return msamt;
    }

    public void setMsamt(String msamt) {
        this.msamt = msamt == null ? null : msamt.trim();
    }

    public String getMsvmt() {
        return msvmt;
    }

    public void setMsvmt(String msvmt) {
        this.msvmt = msvmt == null ? null : msvmt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", z=").append(z);
        sb.append(", q=").append(q);
        sb.append(", xsa=").append(xsa);
        sb.append(", xsavv=").append(xsavv);
        sb.append(", xsmxv=").append(xsmxv);
        sb.append(", flwchrcd=").append(flwchrcd);
        sb.append(", wptn=").append(wptn);
        sb.append(", msqmt=").append(msqmt);
        sb.append(", msamt=").append(msamt);
        sb.append(", msvmt=").append(msvmt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}