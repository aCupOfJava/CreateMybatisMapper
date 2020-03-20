package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRtuMonR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal v;

    private BigDecimal csq;

    private BigDecimal pumpAV;

    private BigDecimal pumpBV;

    private BigDecimal pumpCV;

    private BigDecimal pumpAC;

    private BigDecimal pumpBC;

    private BigDecimal pumpcC;

    private String acpwrCond;

    private String pumpWorkCond;

    private String memCond;

    private String chasDoorCond;

    private String othWarm;

    private Date ts;

    private String nt;

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

    public BigDecimal getV() {
        return v;
    }

    public void setV(BigDecimal v) {
        this.v = v;
    }

    public BigDecimal getCsq() {
        return csq;
    }

    public void setCsq(BigDecimal csq) {
        this.csq = csq;
    }

    public BigDecimal getPumpAV() {
        return pumpAV;
    }

    public void setPumpAV(BigDecimal pumpAV) {
        this.pumpAV = pumpAV;
    }

    public BigDecimal getPumpBV() {
        return pumpBV;
    }

    public void setPumpBV(BigDecimal pumpBV) {
        this.pumpBV = pumpBV;
    }

    public BigDecimal getPumpCV() {
        return pumpCV;
    }

    public void setPumpCV(BigDecimal pumpCV) {
        this.pumpCV = pumpCV;
    }

    public BigDecimal getPumpAC() {
        return pumpAC;
    }

    public void setPumpAC(BigDecimal pumpAC) {
        this.pumpAC = pumpAC;
    }

    public BigDecimal getPumpBC() {
        return pumpBC;
    }

    public void setPumpBC(BigDecimal pumpBC) {
        this.pumpBC = pumpBC;
    }

    public BigDecimal getPumpcC() {
        return pumpcC;
    }

    public void setPumpcC(BigDecimal pumpcC) {
        this.pumpcC = pumpcC;
    }

    public String getAcpwrCond() {
        return acpwrCond;
    }

    public void setAcpwrCond(String acpwrCond) {
        this.acpwrCond = acpwrCond == null ? null : acpwrCond.trim();
    }

    public String getPumpWorkCond() {
        return pumpWorkCond;
    }

    public void setPumpWorkCond(String pumpWorkCond) {
        this.pumpWorkCond = pumpWorkCond == null ? null : pumpWorkCond.trim();
    }

    public String getMemCond() {
        return memCond;
    }

    public void setMemCond(String memCond) {
        this.memCond = memCond == null ? null : memCond.trim();
    }

    public String getChasDoorCond() {
        return chasDoorCond;
    }

    public void setChasDoorCond(String chasDoorCond) {
        this.chasDoorCond = chasDoorCond == null ? null : chasDoorCond.trim();
    }

    public String getOthWarm() {
        return othWarm;
    }

    public void setOthWarm(String othWarm) {
        this.othWarm = othWarm == null ? null : othWarm.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt == null ? null : nt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", v=").append(v);
        sb.append(", csq=").append(csq);
        sb.append(", pumpAV=").append(pumpAV);
        sb.append(", pumpBV=").append(pumpBV);
        sb.append(", pumpCV=").append(pumpCV);
        sb.append(", pumpAC=").append(pumpAC);
        sb.append(", pumpBC=").append(pumpBC);
        sb.append(", pumpcC=").append(pumpcC);
        sb.append(", acpwrCond=").append(acpwrCond);
        sb.append(", pumpWorkCond=").append(pumpWorkCond);
        sb.append(", memCond=").append(memCond);
        sb.append(", chasDoorCond=").append(chasDoorCond);
        sb.append(", othWarm=").append(othWarm);
        sb.append(", ts=").append(ts);
        sb.append(", nt=").append(nt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}