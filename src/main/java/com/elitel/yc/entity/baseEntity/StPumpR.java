package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StPumpR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal ppupz;

    private BigDecimal ppdwz;

    private Short omcn;

    private Integer ompwr;

    private BigDecimal pmpq;

    private String ppwchrcd;

    private String ppupwptn;

    private String ppdwwptn;

    private String msqmt;

    private String pdchcd;

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

    public BigDecimal getPpupz() {
        return ppupz;
    }

    public void setPpupz(BigDecimal ppupz) {
        this.ppupz = ppupz;
    }

    public BigDecimal getPpdwz() {
        return ppdwz;
    }

    public void setPpdwz(BigDecimal ppdwz) {
        this.ppdwz = ppdwz;
    }

    public Short getOmcn() {
        return omcn;
    }

    public void setOmcn(Short omcn) {
        this.omcn = omcn;
    }

    public Integer getOmpwr() {
        return ompwr;
    }

    public void setOmpwr(Integer ompwr) {
        this.ompwr = ompwr;
    }

    public BigDecimal getPmpq() {
        return pmpq;
    }

    public void setPmpq(BigDecimal pmpq) {
        this.pmpq = pmpq;
    }

    public String getPpwchrcd() {
        return ppwchrcd;
    }

    public void setPpwchrcd(String ppwchrcd) {
        this.ppwchrcd = ppwchrcd == null ? null : ppwchrcd.trim();
    }

    public String getPpupwptn() {
        return ppupwptn;
    }

    public void setPpupwptn(String ppupwptn) {
        this.ppupwptn = ppupwptn == null ? null : ppupwptn.trim();
    }

    public String getPpdwwptn() {
        return ppdwwptn;
    }

    public void setPpdwwptn(String ppdwwptn) {
        this.ppdwwptn = ppdwwptn == null ? null : ppdwwptn.trim();
    }

    public String getMsqmt() {
        return msqmt;
    }

    public void setMsqmt(String msqmt) {
        this.msqmt = msqmt == null ? null : msqmt.trim();
    }

    public String getPdchcd() {
        return pdchcd;
    }

    public void setPdchcd(String pdchcd) {
        this.pdchcd = pdchcd == null ? null : pdchcd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", ppupz=").append(ppupz);
        sb.append(", ppdwz=").append(ppdwz);
        sb.append(", omcn=").append(omcn);
        sb.append(", ompwr=").append(ompwr);
        sb.append(", pmpq=").append(pmpq);
        sb.append(", ppwchrcd=").append(ppwchrcd);
        sb.append(", ppupwptn=").append(ppupwptn);
        sb.append(", ppdwwptn=").append(ppdwwptn);
        sb.append(", msqmt=").append(msqmt);
        sb.append(", pdchcd=").append(pdchcd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}