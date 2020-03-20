package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WrMpQR implements Serializable {
    private String mpCd;

    private Date tm;

    private BigDecimal mpQ;

    private BigDecimal accW;

    private BigDecimal inStpQ;

    private BigDecimal accPqW;

    private String speRegData;

    private Date ts;

    private String fm;

    private String fr;

    private static final long serialVersionUID = 1L;

    public String getMpCd() {
        return mpCd;
    }

    public void setMpCd(String mpCd) {
        this.mpCd = mpCd == null ? null : mpCd.trim();
    }

    public Date getTm() {
        return tm;
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }

    public BigDecimal getMpQ() {
        return mpQ;
    }

    public void setMpQ(BigDecimal mpQ) {
        this.mpQ = mpQ;
    }

    public BigDecimal getAccW() {
        return accW;
    }

    public void setAccW(BigDecimal accW) {
        this.accW = accW;
    }

    public BigDecimal getInStpQ() {
        return inStpQ;
    }

    public void setInStpQ(BigDecimal inStpQ) {
        this.inStpQ = inStpQ;
    }

    public BigDecimal getAccPqW() {
        return accPqW;
    }

    public void setAccPqW(BigDecimal accPqW) {
        this.accPqW = accPqW;
    }

    public String getSpeRegData() {
        return speRegData;
    }

    public void setSpeRegData(String speRegData) {
        this.speRegData = speRegData == null ? null : speRegData.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm == null ? null : fm.trim();
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr == null ? null : fr.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mpCd=").append(mpCd);
        sb.append(", tm=").append(tm);
        sb.append(", mpQ=").append(mpQ);
        sb.append(", accW=").append(accW);
        sb.append(", inStpQ=").append(inStpQ);
        sb.append(", accPqW=").append(accPqW);
        sb.append(", speRegData=").append(speRegData);
        sb.append(", ts=").append(ts);
        sb.append(", fm=").append(fm);
        sb.append(", fr=").append(fr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}