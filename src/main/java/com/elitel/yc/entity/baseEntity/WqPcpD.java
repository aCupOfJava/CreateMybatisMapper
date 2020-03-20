package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WqPcpD implements Serializable {
    private String stcd;

    private Date spt;

    private String prpnm;

    private String lynm;

    private String wbtp;

    private BigDecimal airt;

    private Integer atm;

    private Short ilmt;

    private Integer ilmi;

    private BigDecimal wt;

    private BigDecimal ph;

    private Integer cond;

    private BigDecimal redox;

    private Short chroma;

    private String smell;

    private String neobj;

    private Short turb;

    private BigDecimal clarity;

    private BigDecimal ss;

    private BigDecimal mndg;

    private BigDecimal acid;

    private BigDecimal talky;

    private BigDecimal hco3;

    private BigDecimal co3;

    private BigDecimal dsco2;

    private BigDecimal agco2;

    private BigDecimal tsolid;

    private BigDecimal tds;

    private BigDecimal talatv;

    private BigDecimal tbtatv;

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

    public BigDecimal getAirt() {
        return airt;
    }

    public void setAirt(BigDecimal airt) {
        this.airt = airt;
    }

    public Integer getAtm() {
        return atm;
    }

    public void setAtm(Integer atm) {
        this.atm = atm;
    }

    public Short getIlmt() {
        return ilmt;
    }

    public void setIlmt(Short ilmt) {
        this.ilmt = ilmt;
    }

    public Integer getIlmi() {
        return ilmi;
    }

    public void setIlmi(Integer ilmi) {
        this.ilmi = ilmi;
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

    public BigDecimal getRedox() {
        return redox;
    }

    public void setRedox(BigDecimal redox) {
        this.redox = redox;
    }

    public Short getChroma() {
        return chroma;
    }

    public void setChroma(Short chroma) {
        this.chroma = chroma;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell == null ? null : smell.trim();
    }

    public String getNeobj() {
        return neobj;
    }

    public void setNeobj(String neobj) {
        this.neobj = neobj == null ? null : neobj.trim();
    }

    public Short getTurb() {
        return turb;
    }

    public void setTurb(Short turb) {
        this.turb = turb;
    }

    public BigDecimal getClarity() {
        return clarity;
    }

    public void setClarity(BigDecimal clarity) {
        this.clarity = clarity;
    }

    public BigDecimal getSs() {
        return ss;
    }

    public void setSs(BigDecimal ss) {
        this.ss = ss;
    }

    public BigDecimal getMndg() {
        return mndg;
    }

    public void setMndg(BigDecimal mndg) {
        this.mndg = mndg;
    }

    public BigDecimal getAcid() {
        return acid;
    }

    public void setAcid(BigDecimal acid) {
        this.acid = acid;
    }

    public BigDecimal getTalky() {
        return talky;
    }

    public void setTalky(BigDecimal talky) {
        this.talky = talky;
    }

    public BigDecimal getHco3() {
        return hco3;
    }

    public void setHco3(BigDecimal hco3) {
        this.hco3 = hco3;
    }

    public BigDecimal getCo3() {
        return co3;
    }

    public void setCo3(BigDecimal co3) {
        this.co3 = co3;
    }

    public BigDecimal getDsco2() {
        return dsco2;
    }

    public void setDsco2(BigDecimal dsco2) {
        this.dsco2 = dsco2;
    }

    public BigDecimal getAgco2() {
        return agco2;
    }

    public void setAgco2(BigDecimal agco2) {
        this.agco2 = agco2;
    }

    public BigDecimal getTsolid() {
        return tsolid;
    }

    public void setTsolid(BigDecimal tsolid) {
        this.tsolid = tsolid;
    }

    public BigDecimal getTds() {
        return tds;
    }

    public void setTds(BigDecimal tds) {
        this.tds = tds;
    }

    public BigDecimal getTalatv() {
        return talatv;
    }

    public void setTalatv(BigDecimal talatv) {
        this.talatv = talatv;
    }

    public BigDecimal getTbtatv() {
        return tbtatv;
    }

    public void setTbtatv(BigDecimal tbtatv) {
        this.tbtatv = tbtatv;
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
        sb.append(", airt=").append(airt);
        sb.append(", atm=").append(atm);
        sb.append(", ilmt=").append(ilmt);
        sb.append(", ilmi=").append(ilmi);
        sb.append(", wt=").append(wt);
        sb.append(", ph=").append(ph);
        sb.append(", cond=").append(cond);
        sb.append(", redox=").append(redox);
        sb.append(", chroma=").append(chroma);
        sb.append(", smell=").append(smell);
        sb.append(", neobj=").append(neobj);
        sb.append(", turb=").append(turb);
        sb.append(", clarity=").append(clarity);
        sb.append(", ss=").append(ss);
        sb.append(", mndg=").append(mndg);
        sb.append(", acid=").append(acid);
        sb.append(", talky=").append(talky);
        sb.append(", hco3=").append(hco3);
        sb.append(", co3=").append(co3);
        sb.append(", dsco2=").append(dsco2);
        sb.append(", agco2=").append(agco2);
        sb.append(", tsolid=").append(tsolid);
        sb.append(", tds=").append(tds);
        sb.append(", talatv=").append(talatv);
        sb.append(", tbtatv=").append(tbtatv);
        sb.append(", nt=").append(nt);
        sb.append(", speRegData=").append(speRegData);
        sb.append(", ts=").append(ts);
        sb.append(", testComTm=").append(testComTm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}