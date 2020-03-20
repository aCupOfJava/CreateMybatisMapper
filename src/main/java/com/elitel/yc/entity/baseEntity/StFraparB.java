package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StFraparB implements Serializable {
    private String stcd;

    private Short tpcyr;

    private String vartp;

    private BigDecimal avrg;

    private BigDecimal cv;

    private BigDecimal cs;

    private Short bgyr;

    private Short edyr;

    private Short spnum;

    private String comments;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Short getTpcyr() {
        return tpcyr;
    }

    public void setTpcyr(Short tpcyr) {
        this.tpcyr = tpcyr;
    }

    public String getVartp() {
        return vartp;
    }

    public void setVartp(String vartp) {
        this.vartp = vartp == null ? null : vartp.trim();
    }

    public BigDecimal getAvrg() {
        return avrg;
    }

    public void setAvrg(BigDecimal avrg) {
        this.avrg = avrg;
    }

    public BigDecimal getCv() {
        return cv;
    }

    public void setCv(BigDecimal cv) {
        this.cv = cv;
    }

    public BigDecimal getCs() {
        return cs;
    }

    public void setCs(BigDecimal cs) {
        this.cs = cs;
    }

    public Short getBgyr() {
        return bgyr;
    }

    public void setBgyr(Short bgyr) {
        this.bgyr = bgyr;
    }

    public Short getEdyr() {
        return edyr;
    }

    public void setEdyr(Short edyr) {
        this.edyr = edyr;
    }

    public Short getSpnum() {
        return spnum;
    }

    public void setSpnum(Short spnum) {
        this.spnum = spnum;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
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
        sb.append(", tpcyr=").append(tpcyr);
        sb.append(", vartp=").append(vartp);
        sb.append(", avrg=").append(avrg);
        sb.append(", cv=").append(cv);
        sb.append(", cs=").append(cs);
        sb.append(", bgyr=").append(bgyr);
        sb.append(", edyr=").append(edyr);
        sb.append(", spnum=").append(spnum);
        sb.append(", comments=").append(comments);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}