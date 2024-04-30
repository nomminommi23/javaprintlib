package de.nomminommi23;


public class Print {
    public static void print(Object... args) {
        StringBuilder sb = new StringBuilder();
        for (Object arg : args) {
            sb.append(arg).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}