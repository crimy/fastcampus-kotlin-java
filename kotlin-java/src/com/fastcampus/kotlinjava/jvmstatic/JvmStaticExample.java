package com.fastcampus.kotlinjava.jvmstatic;

public class JvmStaticExample {

    public static void main(String[] args) {
        String helloNotStatic = HelloClass.Companion.helloNotStatic();
        String hello = HelloClass.hello();
        System.out.println(hello);

        String hiNotStatic = HiObject.INSTANCE.hiNotStatic();
        String hi = HiObject.hi();
        System.out.println(hi);

    }
}
