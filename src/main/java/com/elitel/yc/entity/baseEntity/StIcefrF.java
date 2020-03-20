package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StIcefrF implements Serializable {
    private String stcd;

    private String unitname;

    private String plcd;

    private Date fymdh;

    private Date iymdh;

    private Date ymdh;

    private String exkey;

    private String ficd;

    private String firpstn;

    private BigDecimal frldstn;

    private BigDecimal fithk;

    private String ithkcd;

    private BigDecimal fiq;

    private String iqprop;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getPlcd() {
        return plcd;
    }

    public void setPlcd(String plcd) {
        this.plcd = plcd == null ? null : plcd.trim();
    }

    public Date getFymdh() {
        return fymdh;
    }

    public void setFymdh(Date fymdh) {
        this.fymdh = fymdh;
    }

    public Date getIymdh() {
        return iymdh;
    }

    public void setIymdh(Date iymdh) {
        this.iymdh = iymdh;
    }

    public Date getYmdh() {
        return ymdh;
    }

    public void setYmdh(Date ymdh) {
        this.ymdh = ymdh;
    }

    public String getExkey() {
        return exkey;
    }

    public void setExkey(String exkey) {
        this.exkey = exkey == null ? null : exkey.trim();
    }

    public String getFicd() {
        return ficd;
    }

    public void setFicd(String ficd) {
        this.ficd = ficd == null ? null : ficd.trim();
    }

    public String getFirpstn() {
        return firpstn;
    }

    public void setFirpstn(String firpstn) {
        this.firpstn = firpstn == null ? null : firpstn.trim();
    }

    public BigDecimal getFrldstn() {
        return frldstn;
    }

    public void setFrldstn(BigDecimal frldstn) {
        this.frldstn = frldstn;
    }

    public BigDecimal getFithk() {
        return fithk;
    }

    public void setFithk(BigDecimal fithk) {
        this.fithk = fithk;
    }

    public String getIthkcd() {
        return ithkcd;
    }

    public void setIthkcd(String ithkcd) {
        this.ithkcd = ithkcd == null ? null : ithkcd.trim();
    }

    public BigDecimal getFiq() {
        return fiq;
    }

    public void setFiq(BigDecimal fiq) {
        this.fiq = fiq;
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
        sb.append(", unitname=").append(unitname);
        sb.append(", plcd=").append(plcd);
        sb.append(", fymdh=").append(fymdh);
        sb.append(", iymdh=").append(iymdh);
        sb.append(", ymdh=").append(ymdh);
        sb.append(", exkey=").append(exkey);
        sb.append(", ficd=").append(ficd);
        sb.append(", firpstn=").append(firpstn);
        sb.append(", frldstn=").append(frldstn);
        sb.append(", fithk=").append(fithk);
        sb.append(", ithkcd=").append(ithkcd);
        sb.append(", fiq=").append(fiq);
        sb.append(", iqprop=").append(iqprop);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}