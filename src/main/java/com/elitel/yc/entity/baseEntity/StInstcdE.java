package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StInstcdE implements Serializable {
    private String instcd;

    private String instnm;

    private String exctype;

    private String excip;

    private Integer excport;

    private String excsrv;

    private String weburl;

    private String password;

    private String trfl;

    private String isstarts;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getInstcd() {
        return instcd;
    }

    public void setInstcd(String instcd) {
        this.instcd = instcd == null ? null : instcd.trim();
    }

    public String getInstnm() {
        return instnm;
    }

    public void setInstnm(String instnm) {
        this.instnm = instnm == null ? null : instnm.trim();
    }

    public String getExctype() {
        return exctype;
    }

    public void setExctype(String exctype) {
        this.exctype = exctype == null ? null : exctype.trim();
    }

    public String getExcip() {
        return excip;
    }

    public void setExcip(String excip) {
        this.excip = excip == null ? null : excip.trim();
    }

    public Integer getExcport() {
        return excport;
    }

    public void setExcport(Integer excport) {
        this.excport = excport;
    }

    public String getExcsrv() {
        return excsrv;
    }

    public void setExcsrv(String excsrv) {
        this.excsrv = excsrv == null ? null : excsrv.trim();
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl == null ? null : weburl.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTrfl() {
        return trfl;
    }

    public void setTrfl(String trfl) {
        this.trfl = trfl == null ? null : trfl.trim();
    }

    public String getIsstarts() {
        return isstarts;
    }

    public void setIsstarts(String isstarts) {
        this.isstarts = isstarts == null ? null : isstarts.trim();
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
        sb.append(", instcd=").append(instcd);
        sb.append(", instnm=").append(instnm);
        sb.append(", exctype=").append(exctype);
        sb.append(", excip=").append(excip);
        sb.append(", excport=").append(excport);
        sb.append(", excsrv=").append(excsrv);
        sb.append(", weburl=").append(weburl);
        sb.append(", password=").append(password);
        sb.append(", trfl=").append(trfl);
        sb.append(", isstarts=").append(isstarts);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}