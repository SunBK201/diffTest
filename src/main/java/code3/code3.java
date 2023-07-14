package code3;

public class code3 {
    void say() {
        System.out.println("this is foo code3");
    }

    void isay() {
        say();
    }

    static {
        System.loadLibrary("hello");
    }

    private native void sayHello();

    void jni_sayhi() {
        sayHello();
    }
}
