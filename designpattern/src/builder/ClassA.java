package builder;

/**
 * Created by zsl on 17-5-23.
 * ClassA a = new ClassA().setparameter1(xx,xx).setpara2(xx,xx)
 */
public class ClassA {
    public String p1;
    public String p2;
    public String p3;

    public String p4;

    public ClassA() {

    }

    public ClassA setP1(String p1) {
        this.p1 = p1;
        return this;
    }

    public ClassA setP2(String p2) {
        this.p2 = p2;
        return this;
    }
}
