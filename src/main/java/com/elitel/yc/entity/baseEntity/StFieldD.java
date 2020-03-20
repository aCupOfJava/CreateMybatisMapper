package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StFieldD implements Serializable {
    private String tabid;

    private String flid;

    private Short flsid;

    private String flcn;

    private String flen;

    private String fltl;

    private String nlat;

    private String unnm;

    private String fchsc;

    private String eufl;

    private String pkat;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getTabid() {
        return tabid;
    }

    public void setTabid(String tabid) {
        this.tabid = tabid == null ? null : tabid.trim();
    }

    public String getFlid() {
        return flid;
    }

    public void setFlid(String flid) {
        this.flid = flid == null ? null : flid.trim();
    }

    public Short getFlsid() {
        return flsid;
    }

    public void setFlsid(Short flsid) {
        this.flsid = flsid;
    }

    public String getFlcn() {
        return flcn;
    }

    public void setFlcn(String flcn) {
        this.flcn = flcn == null ? null : flcn.trim();
    }

    public String getFlen() {
        return flen;
    }

    public void setFlen(String flen) {
        this.flen = flen == null ? null : flen.trim();
    }

    public String getFltl() {
        return fltl;
    }

    public void setFltl(String fltl) {
        this.fltl = fltl == null ? null : fltl.trim();
    }

    public String getNlat() {
        return nlat;
    }

    public void setNlat(String nlat) {
        this.nlat = nlat == null ? null : nlat.trim();
    }

    public String getUnnm() {
        return unnm;
    }

    public void setUnnm(String unnm) {
        this.unnm = unnm == null ? null : unnm.trim();
    }

    public String getFchsc() {
        return fchsc;
    }

    public void setFchsc(String fchsc) {
        this.fchsc = fchsc == null ? null : fchsc.trim();
    }

    public String getEufl() {
        return eufl;
    }

    public void setEufl(String eufl) {
        this.eufl = eufl == null ? null : eufl.trim();
    }

    public String getPkat() {
        return pkat;
    }

    public void setPkat(String pkat) {
        this.pkat = pkat == null ? null : pkat.trim();
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
        sb.append(", tabid=").append(tabid);
        sb.append(", flid=").append(flid);
        sb.append(", flsid=").append(flsid);
        sb.append(", flcn=").append(flcn);
        sb.append(", flen=").append(flen);
        sb.append(", fltl=").append(fltl);
        sb.append(", nlat=").append(nlat);
        sb.append(", unnm=").append(unnm);
        sb.append(", fchsc=").append(fchsc);
        sb.append(", eufl=").append(eufl);
        sb.append(", pkat=").append(pkat);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}