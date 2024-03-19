import java.util.*;
public class Ameer {
    static int a1,a2,a3,a4,a5,a6;
    private static String[][] JA;
    static String[] RE = new String[100];
    static String[] D = new String[100];
    static String[] EV = new String[100];
    static String[] SC = new String[100];
    static String[] MC = new String[100];
    static String[] P = new String[100];
    void duplicate(String a){
        int a1 = 0;
        int w = a.length();
        for(int i = 0;i<w;i++){
            for(int j = 0;j<w;j++){
                if(a.charAt(i) == a.charAt(j)){
                    D[a1++] = a;
                }
            }
        }
    }
    void reverse(String a) {
        int a2 = 0;
        String re = "";
        for (int i = a.length() - 1;i>=0;i--) {
            re = re + a.charAt(i);
        }
        RE[a2++] = re;
    }
    void endsvowel(String a) {
        int a3 = 0;
        int k = a.length();
        if (a.charAt(k) == 'a' || a.charAt(k) == 'e' || a.charAt(k) == 'i' || a.charAt(k) == 'o' || a.charAt(k) == 'u') {
            EV[a3++] = a;
        }
    }
    void startsataic(String a) {
        int a4 = 0;
        if (a.charAt(1) != 'a' && a.charAt(0) != 'e' && a.charAt(0) != 'i' && a.charAt(0) != 'o' && a.charAt(0) != 'u') {
            SC[a4++] = a;
        }
    }

    void moreconsat(String a) {
        int j = a5, t = 0;
        int k = a.length();
        for (int i = 0; i < k; i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                t++;
            }
        }
        if (k > t) {
            MC[a5++] = a;
        }
    }

    void pru(String a) {
        int a6 = 0;
        int k = a.length();
        if (a.endsWith("s") && a.endsWith("ies") && a.endsWith("es")) {
            P[a6++] = a;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] JA = {{"Box","Keys","Pencil"},{"picture","potatoes","Orange","banana","leaves"},{"umbrella"},{"apple","spaceships","Singular","candies"},{"flowers","Window"}};
        for (int i = 0; i < JA.length; i++) {
            for (int j = 0; j < JA[i].length; j++) {
                Ameer ob = new Ameer();
                ob.duplicate(JA[i][j]);
                ob.pru(JA[i][j]);
                ob.reverse(JA[i][j]);
                ob.endsvowel(JA[i][j]);
                ob.startsataic(JA[i][j]);
                ob.moreconsat(JA[i][j]);
            }
        }
        System.out.println("Duplicate");
        for (int q = 0; q < a1; q++) {
            System.out.println(D[q]);
        }
        System.out.println("Reverse");
        for (int q = 0; q < a2; q++) {
            System.out.println(RE[q]);
        }
        System.out.println("Ends with vowel");
        for (int q = 0; q < a3; q++) {
            System.out.println(EV[q]);
        }
        System.out.println("More con");
        for (int q = 0; q < a4; q++) {
            System.out.println(MC[q]);
        }
        System.out.println("starts with con");
        for (int q = 0; q < a5; q++) {
            System.out.println(SC[q]);
        }
        System.out.println("pru");
        for (int q = 0; q < a6; q++) {
            System.out.println(P[q]);
        }
    }
}
