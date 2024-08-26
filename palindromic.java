public class palindromic {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 5; j > i ; j--){
                System.out.print(" ");
            }
            
            int temp = i;
            for(int j = 1; j <= i; j++){
                    System.out.print(temp);
                    temp--;
            }

            temp = 2;
            for(int j = 1; j < i; j++){
                System.out.print(temp);
                temp++;
            }

            System.out.println();
           
        }
    }
}
