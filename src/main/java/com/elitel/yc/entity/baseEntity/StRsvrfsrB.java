package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRsvrfsrB implements Serializable {
    private String stcd;

    private String bgmd;

    private String edmd;

    private BigDecimal fsltdz;

    private BigDecimal fsltdw;

    private String fstp;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public String getBgmd() {
        return bgmd;
    }

    public void setBgmd(String bgmd) {
        this.bgmd = bgmd == null ? null : bgmd.trim();
    }

    public String getEdmd() {
        return edmd;
    }

    public void setEdmd(String edmd) {
        this.edmd = edmd == null ? null : edmd.trim();
    }

    public BigDecimal getFsltdz() {
        return fsltdz;
    }

    public void setFsltdz(BigDecimal fsltdz) {
        this.fsltdz = fsltdz;
    }

    public BigDecimal getFsltdw() {
        return fsltdw;
    }

    public void setFsltdw(BigDecimal fsltdw) {
        this.fsltdw = fsltdw;
    }

    public String getFstp() {
        return fstp;
    }

    public void setFstp(String fstp) {
        this.fstp = fstp == null ? null : fstp.trim();
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
        sb.append(", bgmd=").append(bgmd);
        sb.append(", edmd=").append(edmd);
        sb.append(", fsltdz=").append(fsltdz);
        sb.append(", fsltdw=").append(fsltdw);
        sb.append(", fstp=").append(fstp);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}