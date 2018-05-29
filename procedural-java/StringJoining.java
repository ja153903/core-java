public class StringJoining {
    public static void main(String[] args) {
        // The first character has to be a delimiter
        // every other character has to be the character elements
        String s = String.join(" ", "jaime", "abbariao", "is", "here");
        System.out.println(s);
    }
}