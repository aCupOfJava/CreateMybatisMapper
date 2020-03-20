package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StTideR implements Serializable {
    private String stcd;

    private Date tm;

    private BigDecimal tdz;

    private Integer airp;

    private String tdchrcd;

    private String tdptn;

    private String hltdmk;

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

    public BigDecimal getTdz() {
        return tdz;
    }

    public void setTdz(BigDecimal tdz) {
        this.tdz = tdz;
    }

    public Integer getAirp() {
        return airp;
    }

    public void setAirp(Integer airp) {
        this.airp = airp;
    }

    public String getTdchrcd() {
        return tdchrcd;
    }

    public void setTdchrcd(String tdchrcd) {
        this.tdchrcd = tdchrcd == null ? null : tdchrcd.trim();
    }

    public String getTdptn() {
        return tdptn;
    }

    public void setTdptn(String tdptn) {
        this.tdptn = tdptn == null ? null : tdptn.trim();
    }

    public String getHltdmk() {
        return hltdmk;
    }

    public void setHltdmk(String hltdmk) {
        this.hltdmk = hltdmk == null ? null : hltdmk.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stcd=").append(stcd);
        sb.append(", tm=").append(tm);
        sb.append(", tdz=").append(tdz);
        sb.append(", airp=").append(airp);
        sb.append(", tdchrcd=").append(tdchrcd);
        sb.append(", tdptn=").append(tdptn);
        sb.append(", hltdmk=").append(hltdmk);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}