public class diamond {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= 4; i++){
            for(int j = 4; j > i; j--){
                System.out.print(" ");
            }

            for(int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i >= 1; i--){
            for(int j = 1; j < n - i + 1; j++){
                System.out.print(" ");
            }

            for(int j = (i*2 - 1); j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
