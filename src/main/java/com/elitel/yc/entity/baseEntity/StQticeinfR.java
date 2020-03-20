package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StQticeinfR implements Serializable {
    private String stcd;

    private Date tm;

    private String exkey;

    private String qnticd;

    private String rlpstn;

    private BigDecimal rldstn;

    private Short lbdiwd;

    private Short rbdiwd;

    private BigDecimal bdithk;

    private Short ircon;

    private BigDecimal dithk;

    private Short mxia;

    private BigDecimal mxiv;

    private BigDecimal iq;

    private String frzprop;

    private String brkprop;

    private Short dipck;

    private String idamgrw;

    private BigDecimal idamhgt;

    private BigDecimal idamwd;

    private BigDecimal idamupz;

    private String idamupwptn;

    private String elty;

    private String iqprop;

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

    public String getExkey() {
        return exkey;
    }

    public void setExkey(String exkey) {
        this.exkey = exkey == null ? null : exkey.trim();
    }

    public String getQnticd() {
        return qnticd;
    }

    public void setQnticd(String qnticd) {
        this.qnticd = qnticd == null ? null : qnticd.trim();
    }

    public String getRlpstn() {
        return rlpstn;
    }

    public void setRlpstn(String rlpstn) {
        this.rlpstn = rlpstn == null ? null : rlpstn.trim();
    }

    public BigDecimal getRldstn() {
        return rldstn;
    }

    public void setRldstn(BigDecimal rldstn) {
        this.rldstn = rldstn;
    }

    public Short getLbdiwd() {
        return lbdiwd;
    }

    public void setLbdiwd(Short lbdiwd) {
        this.lbdiwd = lbdiwd;
    }

    public Short getRbdiwd() {
        return rbdiwd;
    }

    public void setRbdiwd(Short rbdiwd) {
        this.rbdiwd = rbdiwd;
    }

    public BigDecimal getBdithk() {
        return bdithk;
    }

    public void setBdithk(BigDecimal bdithk) {
        this.bdithk = bdithk;
    }

    public Short getIrcon() {
        return ircon;
    }

    public void setIrcon(Short ircon) {
        this.ircon = ircon;
    }

    public BigDecimal getDithk() {
        return dithk;
    }

    public void setDithk(BigDecimal dithk) {
        this.dithk = dithk;
    }

    public Short getMxia() {
        return mxia;
    }

    public void setMxia(Short mxia) {
        this.mxia = mxia;
    }

    public BigDecimal getMxiv() {
        return mxiv;
    }

    public void setMxiv(BigDecimal mxiv) {
        this.mxiv = mxiv;
    }

    public BigDecimal getIq() {
        return iq;
    }

    public void setIq(BigDecimal iq) {
        this.iq = iq;
    }

    public String getFrzprop() {
        return frzprop;
    }

    public void setFrzprop(String frzprop) {
        this.frzprop = frzprop == null ? null : frzprop.trim();
    }

    public String getBrkprop() {
        return brkprop;
    }

    public void setBrkprop(String brkprop) {
        this.brkprop = brkprop == null ? null : brkprop.trim();
    }

    public Short getDipck() {
        return dipck;
    }

    public void setDipck(Short dipck) {
        this.dipck = dipck;
    }

    public String getIdamgrw() {
        return idamgrw;
    }

    public void setIdamgrw(String idamgrw) {
        this.idamgrw = idamgrw == null ? null : idamgrw.trim();
    }

    public BigDecimal getIdamhgt() {
        return idamhgt;
    }

    public void setIdamhgt(BigDecimal idamhgt) {
        this.idamhgt = idamhgt;
    }

    public BigDecimal getIdamwd() {
        return idamwd;
    }

    public void setIdamwd(BigDecimal idamwd) {
        this.idamwd = idamwd;
    }

    public BigDecimal getIdamupz() {
        return idamupz;
    }

    public void setIdamupz(BigDecimal idamupz) {
        this.idamupz = idamupz;
    }

    public String getIdamupwptn() {
        return idamupwptn;
    }

    public void setIdamupwptn(String idamupwptn) {
        this.idamupwptn = idamupwptn == null ? null : idamupwptn.trim();
    }

    public String getElty() {
        return elty;
    }

    public void setElty(String elty) {
        this.elty = elty == null ? null : elty.trim();
    }

    public String getIqprop() {
        return iqprop;
    }

    public void setIqprop(String iqprop) {
        this.iqprop = iqprop == null ? null : iqprop.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", exkey=").append(exkey);
        sb.append(", qnticd=").append(qnticd);
        sb.append(", rlpstn=").append(rlpstn);
        sb.append(", rldstn=").append(rldstn);
        sb.append(", lbdiwd=").append(lbdiwd);
        sb.append(", rbdiwd=").append(rbdiwd);
        sb.append(", bdithk=").append(bdithk);
        sb.append(", ircon=").append(ircon);
        sb.append(", dithk=").append(dithk);
        sb.append(", mxia=").append(mxia);
        sb.append(", mxiv=").append(mxiv);
        sb.append(", iq=").append(iq);
        sb.append(", frzprop=").append(frzprop);
        sb.append(", brkprop=").append(brkprop);
        sb.append(", dipck=").append(dipck);
        sb.append(", idamgrw=").append(idamgrw);
        sb.append(", idamhgt=").append(idamhgt);
        sb.append(", idamwd=").append(idamwd);
        sb.append(", idamupz=").append(idamupz);
        sb.append(", idamupwptn=").append(idamupwptn);
        sb.append(", elty=").append(elty);
        sb.append(", iqprop=").append(iqprop);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}