package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WqAwqmdD implements Serializable {
    private String stcd;

    private Date spt;

    private BigDecimal wt;

    private BigDecimal ph;

    private Integer cond;

    private Short turb;

    private BigDecimal dox;

    private BigDecimal codmn;

    private BigDecimal codcr;

    private BigDecimal tn;

    private BigDecimal nh3n;

    private BigDecimal no2;

    private BigDecimal no3;

    private BigDecimal tp;

    private BigDecimal toc;

    private BigDecimal vlph;

    private BigDecimal chla;

    private BigDecimal f;

    private BigDecimal ars;

    private BigDecimal hg;

    private BigDecimal cr6;

    private BigDecimal cu;

    private BigDecimal pb;

    private BigDecimal cd;

    private BigDecimal zn;

    private BigDecimal sb;

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

    public BigDecimal getWt() {
        return wt;
    }

    public void setWt(BigDecimal wt) {
        this.wt = wt;
    }

    public BigDecimal getPh() {
        return ph;
    }

    public void setPh(BigDecimal ph) {
        this.ph = ph;
    }

    public Integer getCond() {
        return cond;
    }

    public void setCond(Integer cond) {
        this.cond = cond;
    }

    public Short getTurb() {
        return turb;
    }

    public void setTurb(Short turb) {
        this.turb = turb;
    }

    public BigDecimal getDox() {
        return dox;
    }

    public void setDox(BigDecimal dox) {
        this.dox = dox;
    }

    public BigDecimal getCodmn() {
        return codmn;
    }

    public void setCodmn(BigDecimal codmn) {
        this.codmn = codmn;
    }

    public BigDecimal getCodcr() {
        return codcr;
    }

    public void setCodcr(BigDecimal codcr) {
        this.codcr = codcr;
    }

    public BigDecimal getTn() {
        return tn;
    }

    public void setTn(BigDecimal tn) {
        this.tn = tn;
    }

    public BigDecimal getNh3n() {
        return nh3n;
    }

    public void setNh3n(BigDecimal nh3n) {
        this.nh3n = nh3n;
    }

    public BigDecimal getNo2() {
        return no2;
    }

    public void setNo2(BigDecimal no2) {
        this.no2 = no2;
    }

    public BigDecimal getNo3() {
        return no3;
    }

    public void setNo3(BigDecimal no3) {
        this.no3 = no3;
    }

    public BigDecimal getTp() {
        return tp;
    }

    public void setTp(BigDecimal tp) {
        this.tp = tp;
    }

    public BigDecimal getToc() {
        return toc;
    }

    public void setToc(BigDecimal toc) {
        this.toc = toc;
    }

    public BigDecimal getVlph() {
        return vlph;
    }

    public void setVlph(BigDecimal vlph) {
        this.vlph = vlph;
    }

    public BigDecimal getChla() {
        return chla;
    }

    public void setChla(BigDecimal chla) {
        this.chla = chla;
    }

    public BigDecimal getF() {
        return f;
    }

    public void setF(BigDecimal f) {
        this.f = f;
    }

    public BigDecimal getArs() {
        return ars;
    }

    public void setArs(BigDecimal ars) {
        this.ars = ars;
    }

    public BigDecimal getHg() {
        return hg;
    }

    public void setHg(BigDecimal hg) {
        this.hg = hg;
    }

    public BigDecimal getCr6() {
        return cr6;
    }

    public void setCr6(BigDecimal cr6) {
        this.cr6 = cr6;
    }

    public BigDecimal getCu() {
        return cu;
    }

    public void setCu(BigDecimal cu) {
        this.cu = cu;
    }

    public BigDecimal getPb() {
        return pb;
    }

    public void setPb(BigDecimal pb) {
        this.pb = pb;
    }

    public BigDecimal getCd() {
        return cd;
    }

    public void setCd(BigDecimal cd) {
        this.cd = cd;
    }

    public BigDecimal getZn() {
        return zn;
    }

    public void setZn(BigDecimal zn) {
        this.zn = zn;
    }

    public BigDecimal getSb() {
        return sb;
    }

    public void setSb(BigDecimal sb) {
        this.sb = sb;
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
        sb.append(", wt=").append(wt);
        sb.append(", ph=").append(ph);
        sb.append(", cond=").append(cond);
        sb.append(", turb=").append(turb);
        sb.append(", dox=").append(dox);
        sb.append(", codmn=").append(codmn);
        sb.append(", codcr=").append(codcr);
        sb.append(", tn=").append(tn);
        sb.append(", nh3n=").append(nh3n);
        sb.append(", no2=").append(no2);
        sb.append(", no3=").append(no3);
        sb.append(", tp=").append(tp);
        sb.append(", toc=").append(toc);
        sb.append(", vlph=").append(vlph);
        sb.append(", chla=").append(chla);
        sb.append(", f=").append(f);
        sb.append(", ars=").append(ars);
        sb.append(", hg=").append(hg);
        sb.append(", cr6=").append(cr6);
        sb.append(", cu=").append(cu);
        sb.append(", pb=").append(pb);
        sb.append(", cd=").append(cd);
        sb.append(", zn=").append(zn);
        sb.append(", sb=").append(sb);
        sb.append(", speRegData=").append(speRegData);
        sb.append(", ts=").append(ts);
        sb.append(", testComTm=").append(testComTm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}