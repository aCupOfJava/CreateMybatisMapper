package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRsvrfcchB implements Serializable {
    private String stcd;

    private String rsvrtp;

    private BigDecimal damel;

    private BigDecimal ckflz;

    private BigDecimal dsflz;

    private BigDecimal normz;

    private BigDecimal ddz;

    private BigDecimal actz;

    private BigDecimal ttcp;

    private BigDecimal fldcp;

    private BigDecimal actcp;

    private BigDecimal ddcp;

    private BigDecimal hhrz;

    private BigDecimal hmxw;

    private Date hhrztm;

    private BigDecimal hmxinq;

    private BigDecimal rstdr;

    private Date hmxinqtm;

    private BigDecimal hmxotq;

    private Date hmxotqtm;

    private BigDecimal hlrz;

    private Date hlrztm;

    private BigDecimal hmninq;

    private Date hmninqtm;

    private BigDecimal laz;

    private BigDecimal sfq;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public String getRsvrtp() {
        return rsvrtp;
    }

    public void setRsvrtp(String rsvrtp) {
        this.rsvrtp = rsvrtp == null ? null : rsvrtp.trim();
    }

    public BigDecimal getDamel() {
        return damel;
    }

    public void setDamel(BigDecimal damel) {
        this.damel = damel;
    }

    public BigDecimal getCkflz() {
        return ckflz;
    }

    public void setCkflz(BigDecimal ckflz) {
        this.ckflz = ckflz;
    }

    public BigDecimal getDsflz() {
        return dsflz;
    }

    public void setDsflz(BigDecimal dsflz) {
        this.dsflz = dsflz;
    }

    public BigDecimal getNormz() {
        return normz;
    }

    public void setNormz(BigDecimal normz) {
        this.normz = normz;
    }

    public BigDecimal getDdz() {
        return ddz;
    }

    public void setDdz(BigDecimal ddz) {
        this.ddz = ddz;
    }

    public BigDecimal getActz() {
        return actz;
    }

    public void setActz(BigDecimal actz) {
        this.actz = actz;
    }

    public BigDecimal getTtcp() {
        return ttcp;
    }

    public void setTtcp(BigDecimal ttcp) {
        this.ttcp = ttcp;
    }

    public BigDecimal getFldcp() {
        return fldcp;
    }

    public void setFldcp(BigDecimal fldcp) {
        this.fldcp = fldcp;
    }

    public BigDecimal getActcp() {
        return actcp;
    }

    public void setActcp(BigDecimal actcp) {
        this.actcp = actcp;
    }

    public BigDecimal getDdcp() {
        return ddcp;
    }

    public void setDdcp(BigDecimal ddcp) {
        this.ddcp = ddcp;
    }

    public BigDecimal getHhrz() {
        return hhrz;
    }

    public void setHhrz(BigDecimal hhrz) {
        this.hhrz = hhrz;
    }

    public BigDecimal getHmxw() {
        return hmxw;
    }

    public void setHmxw(BigDecimal hmxw) {
        this.hmxw = hmxw;
    }

    public Date getHhrztm() {
        return hhrztm;
    }

    public void setHhrztm(Date hhrztm) {
        this.hhrztm = hhrztm;
    }

    public BigDecimal getHmxinq() {
        return hmxinq;
    }

    public void setHmxinq(BigDecimal hmxinq) {
        this.hmxinq = hmxinq;
    }

    public BigDecimal getRstdr() {
        return rstdr;
    }

    public void setRstdr(BigDecimal rstdr) {
        this.rstdr = rstdr;
    }

    public Date getHmxinqtm() {
        return hmxinqtm;
    }

    public void setHmxinqtm(Date hmxinqtm) {
        this.hmxinqtm = hmxinqtm;
    }

    public BigDecimal getHmxotq() {
        return hmxotq;
    }

    public void setHmxotq(BigDecimal hmxotq) {
        this.hmxotq = hmxotq;
    }

    public Date getHmxotqtm() {
        return hmxotqtm;
    }

    public void setHmxotqtm(Date hmxotqtm) {
        this.hmxotqtm = hmxotqtm;
    }

    public BigDecimal getHlrz() {
        return hlrz;
    }

    public void setHlrz(BigDecimal hlrz) {
        this.hlrz = hlrz;
    }

    public Date getHlrztm() {
        return hlrztm;
    }

    public void setHlrztm(Date hlrztm) {
        this.hlrztm = hlrztm;
    }

    public BigDecimal getHmninq() {
        return hmninq;
    }

    public void setHmninq(BigDecimal hmninq) {
        this.hmninq = hmninq;
    }

    public Date getHmninqtm() {
        return hmninqtm;
    }

    public void setHmninqtm(Date hmninqtm) {
        this.hmninqtm = hmninqtm;
    }

    public BigDecimal getLaz() {
        return laz;
    }

    public void setLaz(BigDecimal laz) {
        this.laz = laz;
    }

    public BigDecimal getSfq() {
        return sfq;
    }

    public void setSfq(BigDecimal sfq) {
        this.sfq = sfq;
    }

    public Date getModitime() {
        return moditime;
    }

    public void setModitime(Date moditime) {
        this.moditime = moditime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", rsvrtp=").append(rsvrtp);
        sb.append(", damel=").append(damel);
        sb.append(", ckflz=").append(ckflz);
        sb.append(", dsflz=").append(dsflz);
        sb.append(", normz=").append(normz);
        sb.append(", ddz=").append(ddz);
        sb.append(", actz=").append(actz);
        sb.append(", ttcp=").append(ttcp);
        sb.append(", fldcp=").append(fldcp);
        sb.append(", actcp=").append(actcp);
        sb.append(", ddcp=").append(ddcp);
        sb.append(", hhrz=").append(hhrz);
        sb.append(", hmxw=").append(hmxw);
        sb.append(", hhrztm=").append(hhrztm);
        sb.append(", hmxinq=").append(hmxinq);
        sb.append(", rstdr=").append(rstdr);
        sb.append(", hmxinqtm=").append(hmxinqtm);
        sb.append(", hmxotq=").append(hmxotq);
        sb.append(", hmxotqtm=").append(hmxotqtm);
        sb.append(", hlrz=").append(hlrz);
        sb.append(", hlrztm=").append(hlrztm);
        sb.append(", hmninq=").append(hmninq);
        sb.append(", hmninqtm=").append(hmninqtm);
        sb.append(", laz=").append(laz);
        sb.append(", sfq=").append(sfq);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}