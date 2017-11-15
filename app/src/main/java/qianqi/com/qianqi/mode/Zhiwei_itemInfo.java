package qianqi.com.qianqi.mode;

/**
 * Created by Administrator on 2017/11/7.
 */

public class Zhiwei_itemInfo {
    private String zhiwei;
    private String gongsi;
    private String dizhi;
    private String gongzi;
    private String xueli;

    public String getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(String zhiwei) {
        this.zhiwei = zhiwei;
    }

    public String getGongsi() {
        return gongsi;
    }

    public void setGongsi(String gongsi) {
        this.gongsi = gongsi;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    public String getGongzi() {
        return gongzi;
    }

    public void setGongzi(String gongzi) {
        this.gongzi = gongzi;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    private Zhiwei_itemInfo(Builder builder) {
        zhiwei = builder.zhiwei;
        gongsi = builder.gongsi;
        dizhi = builder.dizhi;
        gongzi = builder.gongzi;
        xueli = builder.xueli;
    }


    public static final class Builder {
        private String zhiwei;
        private String gongsi;
        private String dizhi;
        private String gongzi;
        private String xueli;

        public Builder() {
        }

        public Builder zhiwei(String val) {
            zhiwei = val;
            return this;
        }

        public Builder gongsi(String val) {
            gongsi = val;
            return this;
        }

        public Builder dizhi(String val) {
            dizhi = val;
            return this;
        }

        public Builder gongzi(String val) {
            gongzi = val;
            return this;
        }

        public Builder xueli(String val) {
            xueli = val;
            return this;
        }

        public Zhiwei_itemInfo build() {
            return new Zhiwei_itemInfo(this);
        }
    }
}
