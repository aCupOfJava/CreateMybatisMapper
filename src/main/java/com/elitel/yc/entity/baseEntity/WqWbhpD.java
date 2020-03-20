package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class WqWbhpD implements Serializable {
    private String stcd;

    private Date spt;

    private String prpnm;

    private String lynm;

    private String wbtp;

    private Long bctc;

    private Long tcg;

    private Long fcg;

    private Long fs;

    private String nt;

    private String speRegData;

    private Date ts;

    private Date testComTm;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Date getSpt() {
        return spt;
    }

    public void setSpt(Date spt) {
        this.spt = spt;
    }

    public String getPrpnm() {
        return prpnm;
    }

    public void setPrpnm(String prpnm) {
        this.prpnm = prpnm == null ? null : prpnm.trim();
    }

    public String getLynm() {
        return lynm;
    }

    public void setLynm(String lynm) {
        this.lynm = lynm == null ? null : lynm.trim();
    }

    public String getWbtp() {
        return wbtp;
    }

    public void setWbtp(String wbtp) {
        this.wbtp = wbtp == null ? null : wbtp.trim();
    }

    public Long getBctc() {
        return bctc;
    }

    public void setBctc(Long bctc) {
        this.bctc = bctc;
    }

    public Long getTcg() {
        return tcg;
    }

    public void setTcg(Long tcg) {
        this.tcg = tcg;
    }

    public Long getFcg() {
        return fcg;
    }

    public void setFcg(Long fcg) {
        this.fcg = fcg;
    }

    public Long getFs() {
        return fs;
    }

    public void setFs(Long fs) {
        this.fs = fs;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt == null ? null : nt.trim();
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

    public Date getTestComTm() {
        return testComTm;
    }

    public void setTestComTm(Date testComTm) {
        this.testComTm = testComTm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", spt=").append(spt);
        sb.append(", prpnm=").append(prpnm);
        sb.append(", lynm=").append(lynm);
        sb.append(", wbtp=").append(wbtp);
        sb.append(", bctc=").append(bctc);
        sb.append(", tcg=").append(tcg);
        sb.append(", fcg=").append(fcg);
        sb.append(", fs=").append(fs);
        sb.append(", nt=").append(nt);
        sb.append(", speRegData=").append(speRegData);
        sb.append(", ts=").append(ts);
        sb.append(", testComTm=").append(testComTm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}