public class StringEquality {
    public static void main(String[] args) {
        String s = "jaime";
        String t = "jaime";

        System.out.println(s.equals(t));

        String m = "Jaime";
        String n = "jaime";

        System.out.println(m.equalsIgnoreCase(n));
    }
}