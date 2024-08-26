public class O1triangle {
    public static void main(String[] args) {
        int h = 5;
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= i; j++){
                if((j % 2 != 0 && (i % 2 != 0) || (i % 2 == 0 && j % 2 == 0))){ // int sum = i+j; sum % 2 == 0;
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}