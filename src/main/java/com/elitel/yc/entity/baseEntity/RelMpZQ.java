package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RelMpZQ implements Serializable {
    private String mpCd;

    private Date enabTm;

    private String ptNo;

    private String curvNm;

    private BigDecimal z;

    private BigDecimal q;

    private String nt;

    private Date ts;

    private static final long serialVersionUID = 1L;

    public String getMpCd() {
        return mpCd;
    }

    public void setMpCd(String mpCd) {
        this.mpCd = mpCd == null ? null : mpCd.trim();
    }

    public Date getEnabTm() {
        return enabTm;
    }

    public void setEnabTm(Date enabTm) {
        this.enabTm = enabTm;
    }

    public String getPtNo() {
        return ptNo;
    }

    public void setPtNo(String ptNo) {
        this.ptNo = ptNo == null ? null : ptNo.trim();
    }

    public String getCurvNm() {
        return curvNm;
    }

    public void setCurvNm(String curvNm) {
        this.curvNm = curvNm == null ? null : curvNm.trim();
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

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt == null ? null : nt.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mpCd=").append(mpCd);
        sb.append(", enabTm=").append(enabTm);
        sb.append(", ptNo=").append(ptNo);
        sb.append(", curvNm=").append(curvNm);
        sb.append(", z=").append(z);
        sb.append(", q=").append(q);
        sb.append(", nt=").append(nt);
        sb.append(", ts=").append(ts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}