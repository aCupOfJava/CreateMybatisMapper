package com.elitel.yc.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

public class StSyslogE implements Serializable {
    private Long loglsh;

    private String logtype;

    private String logcontent;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public Long getLoglsh() {
        return loglsh;
    }

    public void setLoglsh(Long loglsh) {
        this.loglsh = loglsh;
    }

    public String getLogtype() {
        return logtype;
    }

    public void setLogtype(String logtype) {
        this.logtype = logtype == null ? null : logtype.trim();
    }

    public String getLogcontent() {
        return logcontent;
    }

    public void setLogcontent(String logcontent) {
        this.logcontent = logcontent == null ? null : logcontent.trim();
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
        sb.append(", loglsh=").append(loglsh);
        sb.append(", logtype=").append(logtype);
        sb.append(", logcontent=").append(logcontent);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}