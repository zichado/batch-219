package com.xsis.day2.strings;

public class string04 {
    public static void main(String[] args) {
        String s, st;
        s = "Hello .NET Developer Welcome to Xsis Academy";
        System.out.println(s);
        st = s.replace(".NET","JAVA");
        System.out.println("After replace = " +st );
        // replace welcome jadi hello
        st = st.replace("Welcome","Hello");
        System.out.println("replace #2 = "+st);
        // replace dua kata
        st = st.replace("Hello","Assalamualaikum")
                .replace("Academy","Bootcamp");
        System.out.println("replace #3 = "+st);
        // to uppercase to lowercase
        st = st.replace("Hello","Assalamualaikum")
                .replace("Academy","Bootcamp").toUpperCase();
        System.out.println("uppercase #4 = "+st);


    }
}
