public class HashCode {
    public static void main(String[] args) {
        // This is how string hashcodes are computed
        // int hash = 0;
        // for (int i = 0; i < length(); i++) {
        //     hash = 31 * hash + charAt(i);
        // }

        String s = "Ok";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());

        String t = "Ok";
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());
    }
}