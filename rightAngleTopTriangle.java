class rightAngleTopTriangle{


    // *****  1
    //  ****  2
    //   ***  3
    //    **  4
    //     *  5

    public static void main(String[] args) {
        
        int num = 5;

        for(int i=1; i<=num; i++){

            for (int x=1; x<=i; x++){
                System.out.print(" ");
            }
            for(int y = i; y<=num; y++ ) System.out.print("*");

            System.out.println();
        }
    }
}