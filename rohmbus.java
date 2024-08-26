public class rohmbus {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i = n ; i > 0; i--){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j < n; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
    
}
