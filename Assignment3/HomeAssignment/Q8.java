
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //     A  B   C    //
 
     // WHEN N = 1
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    ||   //
     //     A  B   C    //
    //STEP 2
     // WHEN N = 2
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  ||   ||   //
     //     A  B   C    //
     // STEP 3
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    |    //
     //    |  |    ||   //
     //    |  |    ||   //
     //    A   B    C   //

     // WHEN N = 3
     //    |   |    |    //
     //    |   |    |    //
     //    |   |    |    //
     //    ||  |    |    //
     //    ||  |    |    //
     //    ||  |    |    //
     //    A   B    C    //
     // STEP 1
     // WHEN N = 3
     //    |   |    |    //
     //    |   |    |    //
     //    |   |    |    //
     //    |   |    |    //
     //    |   ||   |    //
     //    ||  ||   |    //
     //    A   B    C    //
    // STEP 2
     // WHEN N = 3
     //    |   |    |    //
     //    |   |    |    //
     //    |   |    |    //
     //    |   |    |    //
     //    |  ||    |    //
     //    |  ||    ||   //
     //    A   B    C    //
     // STEP 3
     // WHEN N = 3
     //    |   |    |    //
     //    |   |    |    //
     //    |   |    |    //
     //    |   |    |    //
     //    |   |    ||    //
     //    ||  |    ||   //
     //    A   B    C    //
     // STEP 4
     // WHEN N = 3
     //    |   |    |    //
     //    |   |    |    //
     //    |   |    |    //
     //    |   |    ||    //
     //    |   |    ||    //
     //    |   |    ||   //
     //    A   B    C    //

  

 // TIME COMPLEXITY :- O(2^n)
     // ## TOWER OF HANOI ## //




package HomeAssignment;

public class Q8 {
    public static void towerOfHanoi(int n, String src, String helper, String desk)
    {
         if(n==1 )
         {
              System.out.println("Transfer disk "+n+" from "+src+" to "+desk);
              System.out.println();
              return;
         }
         towerOfHanoi(n-1, src,desk, helper);
         System.out.println("Transfer disk "+n+" from "+src+" to "+desk);
         System.out.println();
         towerOfHanoi(n-1,helper,src,desk);
    }
    public static void main(String[] args) {
         int n=4;
         System.out.println();
         towerOfHanoi(n, "S", "H", "D");
    }
}
