public class floydtriangle{
    public static void main(String[] args) {
        int h = 5;

        int num = 1;

        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}