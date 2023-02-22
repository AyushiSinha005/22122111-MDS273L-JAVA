<<<<<<< HEAD
import java.util.*;

public class Lab03 {
    static float meanf(int[] a){
        float m=0;
        for(int i=0;i<a.length;i++){
           m=m+a[i];
        }
         float mean=m/a.length;
         //System.out.println("The mean of the array is "+mean);
         return mean;
      }
      static float medianf(int[] a){
        int m=0;int n=0;int s=0;float val=0;
        Arrays.sort(a);
        if((a.length+1)%2==0){
            s=(a.length/2)+1;
            n=(a.length/2);
            val=(a[s]+a[n])/2;

        }
        else{
            m=(a.length+1)/2;
            val=a[m];
        }
         return val;
      }
        static int modef(int a[]) {
           int maxValue = 0, Count = 0, i, j;
           int n=a.length;
           for (i = 0; i < n; ++i) {
              int count = 0;
              for (j = 0; j < n; ++j) {
                 if (a[j] == a[i])
                 ++count;
              }
     
              if (count > Count) {
                 Count = count;
                 maxValue = a[i];
              }
           }
           return maxValue;
        }
    public static void main(String[] args){
        
            Scanner sc= new Scanner(System.in);
            System.out.println("enter your choice\n 1 for mean\n 2 for median \n 3 for mode");
            int userchoice;
            userchoice=Integer.parseInt(sc.nextLine());
            System.out.println("enter the number for the array");
            int num=Integer.parseInt(sc.nextLine());
            int[] arr=new int[num+1];
            for(int i=1;i<=num;i++){
                System.out.println("enter the number for "+i);
                arr[i]=Integer.parseInt(sc.nextLine());
            }
            float res;int res2;
            switch(userchoice){
               case 1: 
               res=meanf(arr);
               System.out.println("The mean of the array is "+res);
               break;
               case 2:
               res=medianf(arr);
               System.out.println("The median of the array is "+res);
               break;
               case 3:
               res2=modef(arr);
               System.out.println("The mode of the array is "+res2);
               break;
               default:System.out.println("invalid choice");
               break;
            } 
        
        }

    }
    

=======
import java.util.*;

public class Lab03 {
    static float meanf(int[] a){
        float m=0;
        for(int i=0;i<a.length;i++){
           m=m+a[i];
        }
         float mean=m/a.length;
         //System.out.println("The mean of the array is "+mean);
         return mean;
      }
      static float medianf(int[] a){
        int m=0;int n=0;int s=0;float val=0;
        Arrays.sort(a);
        if(a.length%2==0){
            s=(a.length/2)+1;
            n=(a.length/2);
            val=(a[s]+a[n])/2;

        }
        else{
            m=a.length+1/2;
            val=a[m];
        }
         return val;
      }
        static int modef(int a[]) {
           int maxValue = 0, Count = 0, i, j;
           int n=a.length;
           for (i = 0; i < n; ++i) {
              int count = 0;
              for (j = 0; j < n; ++j) {
                 if (a[j] == a[i])
                 ++count;
              }
     
              if (count > Count) {
                 Count = count;
                 maxValue = a[i];
              }
           }
           return maxValue;
        }
    public static void main(String[] args){
        
            Scanner sc= new Scanner(System.in);
            System.out.println("enter your choice\n 1 for mean\n 2 for median \n 3 for mode");
            int userchoice;
            userchoice=Integer.parseInt(sc.nextLine());
            System.out.println("enter the number for the array");
            int num=Integer.parseInt(sc.nextLine());
            int[] arr=new int[num+1];
            for(int i=1;i<=num;i++){
                System.out.println("enter the number for "+i);
                arr[i]=Integer.parseInt(sc.nextLine());
            }
            float res;int res2;
            switch(userchoice){
               case 1: 
               res=meanf(arr);
               System.out.println("The mean of the array is "+res);
               break;
               case 2:
               res=medianf(arr);
               System.out.println("The median of the array is "+res);
               break;
               case 3:
               res2=modef(arr);
               System.out.println("The mode of the array is "+res2);
               break;
               default:System.out.println("invalid choice");
               break;
            } 
        
        }

    }
    

>>>>>>> df8bd965308151edc5e3d52e08f3844373c29e14
