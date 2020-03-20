package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRvfcchB implements Serializable {
    private String stcd;

    private BigDecimal ldkel;

    private BigDecimal rdkel;

    private BigDecimal wrz;

    private BigDecimal wrq;

    private BigDecimal grz;

    private BigDecimal grq;

    private BigDecimal flpq;

    private BigDecimal obhtz;

    private Date obhtztm;

    private BigDecimal ivhz;

    private Date ivhztm;

    private BigDecimal obmxq;

    private Date obmxqtm;

    private BigDecimal ivmxq;

    private Date ivmxqtm;

    private BigDecimal hmxs;

    private Date hmxstm;

    private BigDecimal hmxavv;

    private Date hmxavvtm;

    private BigDecimal hlz;

    private Date hlztm;

    private BigDecimal hmnq;

    private Date hmnqtm;

    private BigDecimal taz;

    private BigDecimal taq;

    private BigDecimal laz;

    private BigDecimal laq;

    private BigDecimal sfz;

    private BigDecimal sfq;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public BigDecimal getLdkel() {
        return ldkel;
    }

    public void setLdkel(BigDecimal ldkel) {
        this.ldkel = ldkel;
    }

    public BigDecimal getRdkel() {
        return rdkel;
    }

    public void setRdkel(BigDecimal rdkel) {
        this.rdkel = rdkel;
    }

    public BigDecimal getWrz() {
        return wrz;
    }

    public void setWrz(BigDecimal wrz) {
        this.wrz = wrz;
    }

    public BigDecimal getWrq() {
        return wrq;
    }

    public void setWrq(BigDecimal wrq) {
        this.wrq = wrq;
    }

    public BigDecimal getGrz() {
        return grz;
    }

    public void setGrz(BigDecimal grz) {
        this.grz = grz;
    }

    public BigDecimal getGrq() {
        return grq;
    }

    public void setGrq(BigDecimal grq) {
        this.grq = grq;
    }

    public BigDecimal getFlpq() {
        return flpq;
    }

    public void setFlpq(BigDecimal flpq) {
        this.flpq = flpq;
    }

    public BigDecimal getObhtz() {
        return obhtz;
    }

    public void setObhtz(BigDecimal obhtz) {
        this.obhtz = obhtz;
    }

    public Date getObhtztm() {
        return obhtztm;
    }

    public void setObhtztm(Date obhtztm) {
        this.obhtztm = obhtztm;
    }

    public BigDecimal getIvhz() {
        return ivhz;
    }

    public void setIvhz(BigDecimal ivhz) {
        this.ivhz = ivhz;
    }

    public Date getIvhztm() {
        return ivhztm;
    }

    public void setIvhztm(Date ivhztm) {
        this.ivhztm = ivhztm;
    }

    public BigDecimal getObmxq() {
        return obmxq;
    }

    public void setObmxq(BigDecimal obmxq) {
        this.obmxq = obmxq;
    }

    public Date getObmxqtm() {
        return obmxqtm;
    }

    public void setObmxqtm(Date obmxqtm) {
        this.obmxqtm = obmxqtm;
    }

    public BigDecimal getIvmxq() {
        return ivmxq;
    }

    public void setIvmxq(BigDecimal ivmxq) {
        this.ivmxq = ivmxq;
    }

    public Date getIvmxqtm() {
        return ivmxqtm;
    }

    public void setIvmxqtm(Date ivmxqtm) {
        this.ivmxqtm = ivmxqtm;
    }

    public BigDecimal getHmxs() {
        return hmxs;
    }

    public void setHmxs(BigDecimal hmxs) {
        this.hmxs = hmxs;
    }

    public Date getHmxstm() {
        return hmxstm;
    }

    public void setHmxstm(Date hmxstm) {
        this.hmxstm = hmxstm;
    }

    public BigDecimal getHmxavv() {
        return hmxavv;
    }

    public void setHmxavv(BigDecimal hmxavv) {
        this.hmxavv = hmxavv;
    }

    public Date getHmxavvtm() {
        return hmxavvtm;
    }

    public void setHmxavvtm(Date hmxavvtm) {
        this.hmxavvtm = hmxavvtm;
    }

    public BigDecimal getHlz() {
        return hlz;
    }

    public void setHlz(BigDecimal hlz) {
        this.hlz = hlz;
    }

    public Date getHlztm() {
        return hlztm;
    }

    public void setHlztm(Date hlztm) {
        this.hlztm = hlztm;
    }

    public BigDecimal getHmnq() {
        return hmnq;
    }

    public void setHmnq(BigDecimal hmnq) {
        this.hmnq = hmnq;
    }

    public Date getHmnqtm() {
        return hmnqtm;
    }

    public void setHmnqtm(Date hmnqtm) {
        this.hmnqtm = hmnqtm;
    }

    public BigDecimal getTaz() {
        return taz;
    }

    public void setTaz(BigDecimal taz) {
        this.taz = taz;
    }

    public BigDecimal getTaq() {
        return taq;
    }

    public void setTaq(BigDecimal taq) {
        this.taq = taq;
    }

    public BigDecimal getLaz() {
        return laz;
    }

    public void setLaz(BigDecimal laz) {
        this.laz = laz;
    }

    public BigDecimal getLaq() {
        return laq;
    }

    public void setLaq(BigDecimal laq) {
        this.laq = laq;
    }

    public BigDecimal getSfz() {
        return sfz;
    }

    public void setSfz(BigDecimal sfz) {
        this.sfz = sfz;
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
        sb.append(", ldkel=").append(ldkel);
        sb.append(", rdkel=").append(rdkel);
        sb.append(", wrz=").append(wrz);
        sb.append(", wrq=").append(wrq);
        sb.append(", grz=").append(grz);
        sb.append(", grq=").append(grq);
        sb.append(", flpq=").append(flpq);
        sb.append(", obhtz=").append(obhtz);
        sb.append(", obhtztm=").append(obhtztm);
        sb.append(", ivhz=").append(ivhz);
        sb.append(", ivhztm=").append(ivhztm);
        sb.append(", obmxq=").append(obmxq);
        sb.append(", obmxqtm=").append(obmxqtm);
        sb.append(", ivmxq=").append(ivmxq);
        sb.append(", ivmxqtm=").append(ivmxqtm);
        sb.append(", hmxs=").append(hmxs);
        sb.append(", hmxstm=").append(hmxstm);
        sb.append(", hmxavv=").append(hmxavv);
        sb.append(", hmxavvtm=").append(hmxavvtm);
        sb.append(", hlz=").append(hlz);
        sb.append(", hlztm=").append(hlztm);
        sb.append(", hmnq=").append(hmnq);
        sb.append(", hmnqtm=").append(hmnqtm);
        sb.append(", taz=").append(taz);
        sb.append(", taq=").append(taq);
        sb.append(", laz=").append(laz);
        sb.append(", laq=").append(laq);
        sb.append(", sfz=").append(sfz);
        sb.append(", sfq=").append(sfq);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}