public class lessuNmber {
    public static void main(String[] args) {
        int n = findLessNumber (3, 7, 5, 2);
        System.out.println(n);
    }

    static int findLessNumber (int a, int b, int c, int d) {
        int[] numbersArray = {a, b, c, d};
        int x = 0;
        for (int i : numbersArray) {
            if(x == 0){
                x = i;
            } else if (i < x ) {
                x = i;
            }
        }
        return x;
    }
}
