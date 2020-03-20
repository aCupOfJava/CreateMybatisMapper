package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WqOpcpD implements Serializable {
    private String stcd;

    private Date spt;

    private String prpnm;

    private String lynm;

    private String wbtp;

    private BigDecimal bhc;

    private BigDecimal ddt;

    private BigDecimal rogor;

    private BigDecimal dll;

    private BigDecimal jjdll;

    private BigDecimal mlll;

    private BigDecimal ddv;

    private BigDecimal dbch;

    private BigDecimal atlj;

    private BigDecimal bjq;

    private BigDecimal jnw;

    private BigDecimal xqjzh;

    private BigDecimal nxl;

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

    public BigDecimal getBhc() {
        return bhc;
    }

    public void setBhc(BigDecimal bhc) {
        this.bhc = bhc;
    }

    public BigDecimal getDdt() {
        return ddt;
    }

    public void setDdt(BigDecimal ddt) {
        this.ddt = ddt;
    }

    public BigDecimal getRogor() {
        return rogor;
    }

    public void setRogor(BigDecimal rogor) {
        this.rogor = rogor;
    }

    public BigDecimal getDll() {
        return dll;
    }

    public void setDll(BigDecimal dll) {
        this.dll = dll;
    }

    public BigDecimal getJjdll() {
        return jjdll;
    }

    public void setJjdll(BigDecimal jjdll) {
        this.jjdll = jjdll;
    }

    public BigDecimal getMlll() {
        return mlll;
    }

    public void setMlll(BigDecimal mlll) {
        this.mlll = mlll;
    }

    public BigDecimal getDdv() {
        return ddv;
    }

    public void setDdv(BigDecimal ddv) {
        this.ddv = ddv;
    }

    public BigDecimal getDbch() {
        return dbch;
    }

    public void setDbch(BigDecimal dbch) {
        this.dbch = dbch;
    }

    public BigDecimal getAtlj() {
        return atlj;
    }

    public void setAtlj(BigDecimal atlj) {
        this.atlj = atlj;
    }

    public BigDecimal getBjq() {
        return bjq;
    }

    public void setBjq(BigDecimal bjq) {
        this.bjq = bjq;
    }

    public BigDecimal getJnw() {
        return jnw;
    }

    public void setJnw(BigDecimal jnw) {
        this.jnw = jnw;
    }

    public BigDecimal getXqjzh() {
        return xqjzh;
    }

    public void setXqjzh(BigDecimal xqjzh) {
        this.xqjzh = xqjzh;
    }

    public BigDecimal getNxl() {
        return nxl;
    }

    public void setNxl(BigDecimal nxl) {
        this.nxl = nxl;
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
        sb.append(", bhc=").append(bhc);
        sb.append(", ddt=").append(ddt);
        sb.append(", rogor=").append(rogor);
        sb.append(", dll=").append(dll);
        sb.append(", jjdll=").append(jjdll);
        sb.append(", mlll=").append(mlll);
        sb.append(", ddv=").append(ddv);
        sb.append(", dbch=").append(dbch);
        sb.append(", atlj=").append(atlj);
        sb.append(", bjq=").append(bjq);
        sb.append(", jnw=").append(jnw);
        sb.append(", xqjzh=").append(xqjzh);
        sb.append(", nxl=").append(nxl);
        sb.append(", nt=").append(nt);
        sb.append(", speRegData=").append(speRegData);
        sb.append(", ts=").append(ts);
        sb.append(", testComTm=").append(testComTm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}