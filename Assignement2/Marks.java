abstract class demo {
    protected int markICP;
    protected int markDSA;
    protected double per;
    
}
class InnerMarksForCSE extends demo {
     int algoDesign;
    public InnerMarksForCSE(int markICP, int markDSA, int algoDesign) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;
    }
    public void getPercentage() {
        per = (markICP + markDSA + algoDesign) / 3.0;
        System.out.println("Percentage for CSE student: " + per);
    }
}



class InnerMarksForNonCSE extends demo {
     int enggMechanics;
   public InnerMarksForNonCSE(int markICP, int markDSA, int enggMechanics) {
       this.markICP = markICP;
       this.markDSA = markDSA;
       this.enggMechanics = enggMechanics;
   }
   public void getPercentage() {
       per = (markICP + markDSA + enggMechanics) / 3.0;
       System.out.println("Percentage for CSE student: " + per);
   }
}
public class Marks {
    public static void main(String[] args) {
        InnerMarksForCSE obj = new InnerMarksForCSE(85, 90, 88);
        obj.getPercentage();

        InnerMarksForNonCSE obj1 = new InnerMarksForNonCSE(75, 80, 82);
        obj1.getPercentage();
    }
}
