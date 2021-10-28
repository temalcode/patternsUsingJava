class pyramidPattern {
    

    //      *     
    //     ***    
    //    *****  

    public static void main(String[] args) {
        
        int num = 5;
        
            for(int i=1; i<=num; i++){

                for(int x=i; x<=num; x++) System.out.print(" ");
                for(int y=1; y<i; y++) System.out.print("*");

                for(int y=1; y<=i; y++) System.out.print("*");
                for(int x=i; x<=num; x++) System.out.print(" ");
                

                System.out.println();
            }
            
            
    }
}
