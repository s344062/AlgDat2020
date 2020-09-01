public class Bubble {
    public static void main (String [] args){
        int [] a= {1, 9, 2, 4, 7, 6};

        bubble(a);

        for (int k :a ){
            System.out.println(k);
        }
    }
    static void bubble(int [] a){
        int begin= 0;
        int end= a.length-1;

        for (int i=begin;  i<end; i++){
            if (a[i]> a[i+1]){
                // vi har funnet en inversjon
                int temp= a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
            else {
                //ingenting- ingen inversjon
            }
            System.out.print(a[0]);

            for (int j= 1; j<a.length; j++){
                System.out.print(", "+ a[j]);
            }
            System.out.println();
        }
    }
}
