package qianqi.com.qianqi.mode;

/**
 * Created by Administrator on 2017/11/14.
 */

public class Mybean {
    private String name;
    private  String pass;
    private boolean istrue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean istrue() {
        return istrue;
    }

    public void setIstrue(boolean istrue) {
        this.istrue = istrue;
    }

    @Override
    public String toString() {
        return "Mybean{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", istrue=" + istrue +
                '}';
    }
}
