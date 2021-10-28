public class squarePattern {
    
    public static void main(String[] args) {
        
        int num = 5;

        for(int i = 0; i<num; i++){
            for(int j = 0; j<num; j++)
            {
            //Added a space to prevent being a rectangle 
            System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
