package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRsvrmyavS implements Serializable {
    private String stcd;

    private Short mnth;

    private Short day;

    private BigDecimal mydavw;

    private Short bgyr;

    private Short edyr;

    private Short sttyrnum;

    private String comments;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Short getMnth() {
        return mnth;
    }

    public void setMnth(Short mnth) {
        this.mnth = mnth;
    }

    public Short getDay() {
        return day;
    }

    public void setDay(Short day) {
        this.day = day;
    }

    public BigDecimal getMydavw() {
        return mydavw;
    }

    public void setMydavw(BigDecimal mydavw) {
        this.mydavw = mydavw;
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

    public Short getSttyrnum() {
        return sttyrnum;
    }

    public void setSttyrnum(Short sttyrnum) {
        this.sttyrnum = sttyrnum;
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
        sb.append(", mnth=").append(mnth);
        sb.append(", day=").append(day);
        sb.append(", mydavw=").append(mydavw);
        sb.append(", bgyr=").append(bgyr);
        sb.append(", edyr=").append(edyr);
        sb.append(", sttyrnum=").append(sttyrnum);
        sb.append(", comments=").append(comments);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}