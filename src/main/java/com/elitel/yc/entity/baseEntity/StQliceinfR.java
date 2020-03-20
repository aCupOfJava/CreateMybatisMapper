package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StQliceinfR implements Serializable {
    private String stcd;

    private Date tm;

    private String exkey;

    private String qlticd;

    private String rlpstn;

    private BigDecimal rldstn;

    private BigDecimal qltithk;

    private Short iosndp;

    private Short iudfsthk;

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

    public String getQlticd() {
        return qlticd;
    }

    public void setQlticd(String qlticd) {
        this.qlticd = qlticd == null ? null : qlticd.trim();
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

    public BigDecimal getQltithk() {
        return qltithk;
    }

    public void setQltithk(BigDecimal qltithk) {
        this.qltithk = qltithk;
    }

    public Short getIosndp() {
        return iosndp;
    }

    public void setIosndp(Short iosndp) {
        this.iosndp = iosndp;
    }

    public Short getIudfsthk() {
        return iudfsthk;
    }

    public void setIudfsthk(Short iudfsthk) {
        this.iudfsthk = iudfsthk;
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
        sb.append(", qlticd=").append(qlticd);
        sb.append(", rlpstn=").append(rlpstn);
        sb.append(", rldstn=").append(rldstn);
        sb.append(", qltithk=").append(qltithk);
        sb.append(", iosndp=").append(iosndp);
        sb.append(", iudfsthk=").append(iudfsthk);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}