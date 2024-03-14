public class Question4 {
    public static void main(String[] args) {
        char a[]={'C','A','R'};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j< a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                  if(a[i]!=a[j] && a[j]!=a[i] &&a[j]!=a[k] && a[k]!=a[j] && a[k] != a[i] && a[i]!=a[k])
                  {
                    System.out.print(a[i]);
                     
                     System.out.print(a[j]);

                     System.out.println(a[k]);
                  }
                }
            }
        }
    }
}
