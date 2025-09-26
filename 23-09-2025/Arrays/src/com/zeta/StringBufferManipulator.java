package com.zeta;

public class StringBufferManipulator {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println(sb);

        sb.append("how ");
        System.out.println(sb);

        sb.append("are you");
        System.out.println(sb);

        System.out.println(sb.length());

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.insert(4,'o');
        System.out.println(sb);

        sb.insert(5, " Zeta Techies,");
        System.out.println(sb);

        sb.delete(6,8);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
