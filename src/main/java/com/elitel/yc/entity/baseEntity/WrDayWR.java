package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WrDayWR implements Serializable {
    private String mpCd;

    private Date dt;

    private BigDecimal dayW;

    private String speRegData;

    private Date ts;

    private static final long serialVersionUID = 1L;

    public String getMpCd() {
        return mpCd;
    }

    public void setMpCd(String mpCd) {
        this.mpCd = mpCd == null ? null : mpCd.trim();
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public BigDecimal getDayW() {
        return dayW;
    }

    public void setDayW(BigDecimal dayW) {
        this.dayW = dayW;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mpCd=").append(mpCd);
        sb.append(", dt=").append(dt);
        sb.append(", dayW=").append(dayW);
        sb.append(", speRegData=").append(speRegData);
        sb.append(", ts=").append(ts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}