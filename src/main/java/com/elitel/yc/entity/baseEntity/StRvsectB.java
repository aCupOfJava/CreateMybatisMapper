package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StRvsectB implements Serializable {
    private String stcd;

    private Date mstm;

    private Short vtno;

    private String bgbk;

    private BigDecimal di;

    private BigDecimal zb;

    private String comments;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public Date getMstm() {
        return mstm;
    }

    public void setMstm(Date mstm) {
        this.mstm = mstm;
    }

    public Short getVtno() {
        return vtno;
    }

    public void setVtno(Short vtno) {
        this.vtno = vtno;
    }

    public String getBgbk() {
        return bgbk;
    }

    public void setBgbk(String bgbk) {
        this.bgbk = bgbk == null ? null : bgbk.trim();
    }

    public BigDecimal getDi() {
        return di;
    }

    public void setDi(BigDecimal di) {
        this.di = di;
    }

    public BigDecimal getZb() {
        return zb;
    }

    public void setZb(BigDecimal zb) {
        this.zb = zb;
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
        sb.append(", mstm=").append(mstm);
        sb.append(", vtno=").append(vtno);
        sb.append(", bgbk=").append(bgbk);
        sb.append(", di=").append(di);
        sb.append(", zb=").append(zb);
        sb.append(", comments=").append(comments);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}