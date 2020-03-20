package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StZvarlB implements Serializable {
    private String stcd;

    private Date mstm;

    private Short ptno;

    private BigDecimal rz;

    private BigDecimal w;

    private Integer wsfa;

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

    public Short getPtno() {
        return ptno;
    }

    public void setPtno(Short ptno) {
        this.ptno = ptno;
    }

    public BigDecimal getRz() {
        return rz;
    }

    public void setRz(BigDecimal rz) {
        this.rz = rz;
    }

    public BigDecimal getW() {
        return w;
    }

    public void setW(BigDecimal w) {
        this.w = w;
    }

    public Integer getWsfa() {
        return wsfa;
    }

    public void setWsfa(Integer wsfa) {
        this.wsfa = wsfa;
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
        sb.append(", ptno=").append(ptno);
        sb.append(", rz=").append(rz);
        sb.append(", w=").append(w);
        sb.append(", wsfa=").append(wsfa);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}