public class inverted_right_angled_triangle {
    static int size = 5;

    public static void main(String args[]) {
        pattern();
    }

    static void pattern() {
        int level = 1;
        int end = size;

        while (level != size + 1) {

            for (int count = 1; count <= size; count++) {
                if (count >= end) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println("");
            level++;
            end--;
        }
    }

}
