package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WrMpHourwR implements Serializable {
    private Date dt;

    private String mpCd;

    private BigDecimal hourW;

    private String speRegData;

    private Date ts;

    private static final long serialVersionUID = 1L;

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public String getMpCd() {
        return mpCd;
    }

    public void setMpCd(String mpCd) {
        this.mpCd = mpCd == null ? null : mpCd.trim();
    }

    public BigDecimal getHourW() {
        return hourW;
    }

    public void setHourW(BigDecimal hourW) {
        this.hourW = hourW;
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
        sb.append(", dt=").append(dt);
        sb.append(", mpCd=").append(mpCd);
        sb.append(", hourW=").append(hourW);
        sb.append(", speRegData=").append(speRegData);
        sb.append(", ts=").append(ts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}