public class Demo1 {
    public static void main(String[] args) {
        
        /* 
            Single Loop, Nested Loops
            Via +

            + + + + +              5        -14   
            + + + +                9        -9
            + + +                  12      -5
            + +                    14      -2
            +                      15      0
            + +                     17      2
            + + +                   20      5
            + + + +                 24       9
            + + + + +               29       14
         */

        
        // /* By Single Loop */

        // int i = -16;
        // int k = -12;
        // int j = 5;
        // while (i< 15){    
                                 
        //     System.out.print("+ ");
        //     // System.out.print(i + "  "); 
        //     // System.out.print(k + "  ");
        //     // System.out.print(j + "  ");                     
                     
        //     if (i == k ){  
        //         // System.out.print(i + "  ");                     
        //         // System.out.println(j);             
        //         System.out.println();
        //         j--;
        //         k = i + j;
        //     }
            

        //     i++;
        // }

        
        /*By nested loop */

        int a = 0;
        int c = 5;
        int b;

        while (a++ <= 9){
            if ( a <= 5 ) {
                b = 0;
                c= a;
            }
            else {
                b = 11; c = -a;
            }
            while (b < 6 - c){
                System.out.print("+ ");
                b++;
            }
            System.out.println();


           

        } 




    }
}