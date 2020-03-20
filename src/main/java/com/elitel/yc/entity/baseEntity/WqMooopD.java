package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WqMooopD implements Serializable {
    private String stcd;

    private Date spt;

    private String prpnm;

    private String lynm;

    private String wbtp;

    private BigDecimal jjg;

    private BigDecimal yjg;

    private BigDecimal syjq;

    private BigDecimal djhys;

    private BigDecimal bd;

    private BigDecimal shhj;

    private BigDecimal sjy;

    private BigDecimal bbab;

    private BigDecimal las;

    private BigDecimal toc;

    private BigDecimal oil;

    private BigDecimal dzhwy;

    private BigDecimal wnzdslr;

    private BigDecimal chla;

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

    public BigDecimal getJjg() {
        return jjg;
    }

    public void setJjg(BigDecimal jjg) {
        this.jjg = jjg;
    }

    public BigDecimal getYjg() {
        return yjg;
    }

    public void setYjg(BigDecimal yjg) {
        this.yjg = yjg;
    }

    public BigDecimal getSyjq() {
        return syjq;
    }

    public void setSyjq(BigDecimal syjq) {
        this.syjq = syjq;
    }

    public BigDecimal getDjhys() {
        return djhys;
    }

    public void setDjhys(BigDecimal djhys) {
        this.djhys = djhys;
    }

    public BigDecimal getBd() {
        return bd;
    }

    public void setBd(BigDecimal bd) {
        this.bd = bd;
    }

    public BigDecimal getShhj() {
        return shhj;
    }

    public void setShhj(BigDecimal shhj) {
        this.shhj = shhj;
    }

    public BigDecimal getSjy() {
        return sjy;
    }

    public void setSjy(BigDecimal sjy) {
        this.sjy = sjy;
    }

    public BigDecimal getBbab() {
        return bbab;
    }

    public void setBbab(BigDecimal bbab) {
        this.bbab = bbab;
    }

    public BigDecimal getLas() {
        return las;
    }

    public void setLas(BigDecimal las) {
        this.las = las;
    }

    public BigDecimal getToc() {
        return toc;
    }

    public void setToc(BigDecimal toc) {
        this.toc = toc;
    }

    public BigDecimal getOil() {
        return oil;
    }

    public void setOil(BigDecimal oil) {
        this.oil = oil;
    }

    public BigDecimal getDzhwy() {
        return dzhwy;
    }

    public void setDzhwy(BigDecimal dzhwy) {
        this.dzhwy = dzhwy;
    }

    public BigDecimal getWnzdslr() {
        return wnzdslr;
    }

    public void setWnzdslr(BigDecimal wnzdslr) {
        this.wnzdslr = wnzdslr;
    }

    public BigDecimal getChla() {
        return chla;
    }

    public void setChla(BigDecimal chla) {
        this.chla = chla;
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
        sb.append(", jjg=").append(jjg);
        sb.append(", yjg=").append(yjg);
        sb.append(", syjq=").append(syjq);
        sb.append(", djhys=").append(djhys);
        sb.append(", bd=").append(bd);
        sb.append(", shhj=").append(shhj);
        sb.append(", sjy=").append(sjy);
        sb.append(", bbab=").append(bbab);
        sb.append(", las=").append(las);
        sb.append(", toc=").append(toc);
        sb.append(", oil=").append(oil);
        sb.append(", dzhwy=").append(dzhwy);
        sb.append(", wnzdslr=").append(wnzdslr);
        sb.append(", chla=").append(chla);
        sb.append(", nt=").append(nt);
        sb.append(", speRegData=").append(speRegData);
        sb.append(", ts=").append(ts);
        sb.append(", testComTm=").append(testComTm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}