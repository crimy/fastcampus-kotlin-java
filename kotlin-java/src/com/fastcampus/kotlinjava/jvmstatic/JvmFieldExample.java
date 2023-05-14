package com.fastcampus.kotlinjava.jvmstatic;

public class JvmFieldExample {

    public static void main(String[] args) {
        JvmFieldClass.Companion.getIdCompanion();
        int id = JvmFieldClass.id;

        String name = JvmFieldObject.name;


        int code = JvmFieldClass.CODE;
        String familyName = JvmFieldObject.FAMILY_NAME;
    }
}
