package builder;

/**
 * Created by zsl on 17-5-23.
 * ClassA a = new ClassA().setparameter1(xx,xx).setpara2(xx,xx)
 */
public class ClassB {
    public String p1;
    public String p2;
    public String p3;

    public String p4;

    public ClassB() {

    }

    public ClassB(Builer builer) {
        this.p1 = builer.p1;
    }

    public static Builer

    {
        private String p1;
        private String p2;
        private String p3;
        public Builer() {

    }

    public Builer p1(String p1) {
        this.p1 = p1;
    }

    public ClassB builder(Builer builer) {
        return new ClassB(builer);
    }

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
