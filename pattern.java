public class pattern {
    
    //     *
    //    **
    //   ***
    //  ****    
     public static void main(String[] args) {
        // for(int i=0;i<4;i++){
        //     for(int j=4-i;j>1;j--){
        //         System.out.print(" ");
        //     }
            
        //     for(int j=+1;j<=i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
    

    // 1
    // 12
    // 123
    // 1234

    // for(int i=1;i<=4;i++){
    //     for(int j=1;j<i+1;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println("");
    // }

    // 1
    // 23
    // 456
    // 78910

    // for(int i=1;i<4+2;i++){
    //     int num=1;
    //     for(int j=1;j<i;j++){
    //         System.out.print(num);
    //         num++;
    //     }
    //     System.out.println("");
    // }

    // 1
    // 2 3 
    // 4 5 6
    // 7 8 9 10

    int n = 4;
    int num=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println("");
    }
}
}
