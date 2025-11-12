//Assignment Task 04: Game Arena
class AssgnTask4{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){

        Integer rows = arena.length;
        Integer cols = arena[0].length;
        Integer point = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arena[i][j] % 50 == 0 && arena[i][j] != 0) {

                    if (i > 0 && arena[i - 1][j] == 2) {
                        point = point+2;
                    }
                    if (i < rows - 1 && arena[i + 1][j] == 2) {
                        point = point+2;
                    }
                    if (j > 0 && arena[i][j - 1] == 2) {
                        point = point+2;
                    }
                    if (j < cols - 1 && arena[i][j + 1] == 2) {
                        point = point+2;
                    }
                }
            }
        }
        if ( point >=10 ) {
            System.out.println("Points gained : " + point + " Your team has survived the game");
        }else{
            System.out.println("Points gained "+ point + "Your team is out");
        }
    }

}

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}