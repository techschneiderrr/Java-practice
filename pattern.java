public class pattern {
    
    //     *
    //    **
    //   ***
    //  ****    
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=4-i;j>1;j--){
                System.out.print(" ");
            }
            
            for(int j=+1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    

    // 1
    // 12
    // 123
    // 1234

    for(int i=1;i<=4;i++){
        for(int j=1;j<i+1;j++){
            System.out.print(j);
        }
        System.out.println("");
    }
}

}
