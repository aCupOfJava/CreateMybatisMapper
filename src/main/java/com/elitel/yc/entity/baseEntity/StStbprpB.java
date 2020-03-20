package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StStbprpB implements Serializable {
    private String stcd;

    private String stnm;

    private String rvnm;

    private String hnnm;

    private String bsnm;

    private BigDecimal lgtd;

    private BigDecimal lttd;

    private String stlc;

    private String addvcd;

    private String dtmnm;

    private BigDecimal dtmel;

    private BigDecimal dtpr;

    private String sttp;

    private String frgrd;

    private String esstym;

    private String bgfrym;

    private String atcunit;

    private String admauth;

    private String locality;

    private String stbk;

    private Short stazt;

    private BigDecimal dstrvm;

    private Integer drna;

    private String phcd;

    private String usfl;

    private String comments;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd == null ? null : stcd.trim();
    }

    public String getStnm() {
        return stnm;
    }

    public void setStnm(String stnm) {
        this.stnm = stnm == null ? null : stnm.trim();
    }

    public String getRvnm() {
        return rvnm;
    }

    public void setRvnm(String rvnm) {
        this.rvnm = rvnm == null ? null : rvnm.trim();
    }

    public String getHnnm() {
        return hnnm;
    }

    public void setHnnm(String hnnm) {
        this.hnnm = hnnm == null ? null : hnnm.trim();
    }

    public String getBsnm() {
        return bsnm;
    }

    public void setBsnm(String bsnm) {
        this.bsnm = bsnm == null ? null : bsnm.trim();
    }

    public BigDecimal getLgtd() {
        return lgtd;
    }

    public void setLgtd(BigDecimal lgtd) {
        this.lgtd = lgtd;
    }

    public BigDecimal getLttd() {
        return lttd;
    }

    public void setLttd(BigDecimal lttd) {
        this.lttd = lttd;
    }

    public String getStlc() {
        return stlc;
    }

    public void setStlc(String stlc) {
        this.stlc = stlc == null ? null : stlc.trim();
    }

    public String getAddvcd() {
        return addvcd;
    }

    public void setAddvcd(String addvcd) {
        this.addvcd = addvcd == null ? null : addvcd.trim();
    }

    public String getDtmnm() {
        return dtmnm;
    }

    public void setDtmnm(String dtmnm) {
        this.dtmnm = dtmnm == null ? null : dtmnm.trim();
    }

    public BigDecimal getDtmel() {
        return dtmel;
    }

    public void setDtmel(BigDecimal dtmel) {
        this.dtmel = dtmel;
    }

    public BigDecimal getDtpr() {
        return dtpr;
    }

    public void setDtpr(BigDecimal dtpr) {
        this.dtpr = dtpr;
    }

    public String getSttp() {
        return sttp;
    }

    public void setSttp(String sttp) {
        this.sttp = sttp == null ? null : sttp.trim();
    }

    public String getFrgrd() {
        return frgrd;
    }

    public void setFrgrd(String frgrd) {
        this.frgrd = frgrd == null ? null : frgrd.trim();
    }

    public String getEsstym() {
        return esstym;
    }

    public void setEsstym(String esstym) {
        this.esstym = esstym == null ? null : esstym.trim();
    }

    public String getBgfrym() {
        return bgfrym;
    }

    public void setBgfrym(String bgfrym) {
        this.bgfrym = bgfrym == null ? null : bgfrym.trim();
    }

    public String getAtcunit() {
        return atcunit;
    }

    public void setAtcunit(String atcunit) {
        this.atcunit = atcunit == null ? null : atcunit.trim();
    }

    public String getAdmauth() {
        return admauth;
    }

    public void setAdmauth(String admauth) {
        this.admauth = admauth == null ? null : admauth.trim();
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality == null ? null : locality.trim();
    }

    public String getStbk() {
        return stbk;
    }

    public void setStbk(String stbk) {
        this.stbk = stbk == null ? null : stbk.trim();
    }

    public Short getStazt() {
        return stazt;
    }

    public void setStazt(Short stazt) {
        this.stazt = stazt;
    }

    public BigDecimal getDstrvm() {
        return dstrvm;
    }

    public void setDstrvm(BigDecimal dstrvm) {
        this.dstrvm = dstrvm;
    }

    public Integer getDrna() {
        return drna;
    }

    public void setDrna(Integer drna) {
        this.drna = drna;
    }

    public String getPhcd() {
        return phcd;
    }

    public void setPhcd(String phcd) {
        this.phcd = phcd == null ? null : phcd.trim();
    }

    public String getUsfl() {
        return usfl;
    }

    public void setUsfl(String usfl) {
        this.usfl = usfl == null ? null : usfl.trim();
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
        sb.append(", stnm=").append(stnm);
        sb.append(", rvnm=").append(rvnm);
        sb.append(", hnnm=").append(hnnm);
        sb.append(", bsnm=").append(bsnm);
        sb.append(", lgtd=").append(lgtd);
        sb.append(", lttd=").append(lttd);
        sb.append(", stlc=").append(stlc);
        sb.append(", addvcd=").append(addvcd);
        sb.append(", dtmnm=").append(dtmnm);
        sb.append(", dtmel=").append(dtmel);
        sb.append(", dtpr=").append(dtpr);
        sb.append(", sttp=").append(sttp);
        sb.append(", frgrd=").append(frgrd);
        sb.append(", esstym=").append(esstym);
        sb.append(", bgfrym=").append(bgfrym);
        sb.append(", atcunit=").append(atcunit);
        sb.append(", admauth=").append(admauth);
        sb.append(", locality=").append(locality);
        sb.append(", stbk=").append(stbk);
        sb.append(", stazt=").append(stazt);
        sb.append(", dstrvm=").append(dstrvm);
        sb.append(", drna=").append(drna);
        sb.append(", phcd=").append(phcd);
        sb.append(", usfl=").append(usfl);
        sb.append(", comments=").append(comments);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}