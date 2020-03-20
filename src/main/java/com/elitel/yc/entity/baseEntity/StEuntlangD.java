package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StEuntlangD implements Serializable {
    private String flid;

    private String eucd;

    private String ntlang;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public String getFlid() {
        return flid;
    }

    public void setFlid(String flid) {
        this.flid = flid == null ? null : flid.trim();
    }

    public String getEucd() {
        return eucd;
    }

    public void setEucd(String eucd) {
        this.eucd = eucd == null ? null : eucd.trim();
    }

    public String getNtlang() {
        return ntlang;
    }

    public void setNtlang(String ntlang) {
        this.ntlang = ntlang == null ? null : ntlang.trim();
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
        sb.append(", flid=").append(flid);
        sb.append(", eucd=").append(eucd);
        sb.append(", ntlang=").append(ntlang);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}