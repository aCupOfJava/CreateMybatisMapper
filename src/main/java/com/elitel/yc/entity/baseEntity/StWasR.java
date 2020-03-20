package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StWasR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal upz;

    private BigDecimal dwz;

    private BigDecimal tgtq;

    private String swchrcd;

    private String supwptn;

    private String sdwwptn;

    private String msqmt;

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

    public BigDecimal getUpz() {
        return upz;
    }

    public void setUpz(BigDecimal upz) {
        this.upz = upz;
    }

    public BigDecimal getDwz() {
        return dwz;
    }

    public void setDwz(BigDecimal dwz) {
        this.dwz = dwz;
    }

    public BigDecimal getTgtq() {
        return tgtq;
    }

    public void setTgtq(BigDecimal tgtq) {
        this.tgtq = tgtq;
    }

    public String getSwchrcd() {
        return swchrcd;
    }

    public void setSwchrcd(String swchrcd) {
        this.swchrcd = swchrcd == null ? null : swchrcd.trim();
    }

    public String getSupwptn() {
        return supwptn;
    }

    public void setSupwptn(String supwptn) {
        this.supwptn = supwptn == null ? null : supwptn.trim();
    }

    public String getSdwwptn() {
        return sdwwptn;
    }

    public void setSdwwptn(String sdwwptn) {
        this.sdwwptn = sdwwptn == null ? null : sdwwptn.trim();
    }

    public String getMsqmt() {
        return msqmt;
    }

    public void setMsqmt(String msqmt) {
        this.msqmt = msqmt == null ? null : msqmt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", upz=").append(upz);
        sb.append(", dwz=").append(dwz);
        sb.append(", tgtq=").append(tgtq);
        sb.append(", swchrcd=").append(swchrcd);
        sb.append(", supwptn=").append(supwptn);
        sb.append(", sdwwptn=").append(sdwwptn);
        sb.append(", msqmt=").append(msqmt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}