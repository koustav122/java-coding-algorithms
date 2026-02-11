class OuterClass {
    int x = 10;
    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}
public class Access {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.err.println(myInner.myInnerMethod());
    }
}
