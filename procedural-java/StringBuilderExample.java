public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        builder.append("bbariao");

        System.out.println(builder.toString());
    }
    /*
    There is an alternative called a StringBuffer
    It's less efficient, but allows for multiple
    threads to add or remove characters
    */
}