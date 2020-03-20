package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StSoilchB implements Serializable {
    private String stcd;

    private String sltp;

    private String sltx;

    private String sfbr;

    private BigDecimal sspg;

    private BigDecimal dsd;

    private BigDecimal spor;

    private BigDecimal shwc;

    private BigDecimal fdcp;

    private BigDecimal wlcp;

    private String comments;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public String getSltp() {
        return sltp;
    }

    public void setSltp(String sltp) {
        this.sltp = sltp == null ? null : sltp.trim();
    }

    public String getSltx() {
        return sltx;
    }

    public void setSltx(String sltx) {
        this.sltx = sltx == null ? null : sltx.trim();
    }

    public String getSfbr() {
        return sfbr;
    }

    public void setSfbr(String sfbr) {
        this.sfbr = sfbr == null ? null : sfbr.trim();
    }

    public BigDecimal getSspg() {
        return sspg;
    }

    public void setSspg(BigDecimal sspg) {
        this.sspg = sspg;
    }

    public BigDecimal getDsd() {
        return dsd;
    }

    public void setDsd(BigDecimal dsd) {
        this.dsd = dsd;
    }

    public BigDecimal getSpor() {
        return spor;
    }

    public void setSpor(BigDecimal spor) {
        this.spor = spor;
    }

    public BigDecimal getShwc() {
        return shwc;
    }

    public void setShwc(BigDecimal shwc) {
        this.shwc = shwc;
    }

    public BigDecimal getFdcp() {
        return fdcp;
    }

    public void setFdcp(BigDecimal fdcp) {
        this.fdcp = fdcp;
    }

    public BigDecimal getWlcp() {
        return wlcp;
    }

    public void setWlcp(BigDecimal wlcp) {
        this.wlcp = wlcp;
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
        sb.append(", sltp=").append(sltp);
        sb.append(", sltx=").append(sltx);
        sb.append(", sfbr=").append(sfbr);
        sb.append(", sspg=").append(sspg);
        sb.append(", dsd=").append(dsd);
        sb.append(", spor=").append(spor);
        sb.append(", shwc=").append(shwc);
        sb.append(", fdcp=").append(fdcp);
        sb.append(", wlcp=").append(wlcp);
        sb.append(", comments=").append(comments);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}