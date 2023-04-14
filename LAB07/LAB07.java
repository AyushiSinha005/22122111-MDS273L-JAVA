import java.io.*;
import java.util.*;
class stats{
    float mean(float[] meanval,int n){
       float res;float val=0;
     for(int i=0;i<meanval.length;i++){
         val=meanval[i]+val;
     }
        res=val/n;
        return res;
        
    }
    float median(float[] medianval) {
        Arrays.sort(medianval);
        int length = medianval.length;
        if (length % 2 == 0) {
            return (float) (medianval[length / 2] + medianval[length / 2 - 1]) / 2;
        } else {
            return (float) medianval[length / 2];
        }}
    float mode(float[] nums) {
            Arrays.sort(nums);
            float mode = -1;
            int maxFrequency = 0;
            int currentFrequency = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    currentFrequency++;
                } else {
                    if (currentFrequency > maxFrequency) {
                        mode = nums[i - 1];
                        maxFrequency = currentFrequency;
                    }
                    currentFrequency = 1;
                }
            }
            if (currentFrequency > maxFrequency) {
                mode = nums[nums.length - 1];
            }
            return mode;
        }    
}
class LAB07 {

    public static void main(String[] args) {
        float meanval=0;int count=0;int count1=0;
        float[] col1=new float[150];
        float[] col2=new float[150];
        float[] col3=new float[150];
        float[] col4=new float[150];
        try{
            File file=new File("Iris.csv");
            Scanner sc=new Scanner(file);
            String header[];
            int i=0;
            while(sc.hasNextLine()){
                if(count1==0)
                {
                    header = sc.nextLine().split(",");
                }  
                    count1++;
                String temp=sc.nextLine();
                String arr[]=temp.split(",");
                count++;
                col1[i]=Float.parseFloat(arr[1]);
                col2[i]=Float.parseFloat(arr[2]);
                col3[i]=Float.parseFloat(arr[3]);
                col4[i]=Float.parseFloat(arr[4]);
                i++;

            }
        }catch(Exception ex){
            System.out.println("sommme errror");
        }
        stats obj=new stats();
        float res=obj.mean(col1,count);
        System.out.println("mean of the sepal length is "+res);
        float res2=obj.median(col1);
        System.out.println("median of the sepal length is "+res2);
        float res3=obj.mode(col1);
        System.out.println("mode of the sepal length is "+res3);
        float res4=obj.mean(col2,count);
        System.out.println("mean of the sepal width is "+res4);
        float res5=obj.median(col2);
        System.out.println("median of the sepal width is "+res5);
        float res6=obj.mode(col2);
        System.out.println("mode of the sepal width is "+res6);
        float res7=obj.mean(col3,count);
        System.out.println("mean of the petal length is "+res7);
        float res8=obj.median(col3);
        System.out.println("median of the petal length is "+res8);
        float res9=obj.mode(col3);
        System.out.println("mode of the petal length is "+res9);
        float res10=obj.mean(col4,count);
        System.out.println("mean of the petal width is "+res10);
        float res11=obj.median(col4);
        System.out.println("median of the petal width is "+res11);
        float res12=obj.mode(col4);
        System.out.println("mode of the petal width is "+res12);
        System.out.println("****************************************************");

        
        float[] newcol1=new float[50];
        float[] newcol2=new float[50];
        float[] newcol3=new float[50];
        float[] newcol4=new float[50];
        float[] newcol5=new float[150];
        float[] newcol6=new float[150];
        float[] newcol7=new float[150];
        float[] newcol8=new float[150];
        float[] newcol9=new float[150];
        float[] newcol10=new float[150];
        float[] newcol11=new float[150];
        float[] newcol12=new float[150];
        
        try{
            File file2=new File("Iris.csv");
            Scanner sc=new Scanner(file2);
            String header[];
            int j=0,k=0,l=0,count2=0;
            while(sc.hasNextLine()){
                if(count2==0)
                {
                    header = sc.nextLine().split(",");
                }  
                    count2++;
                String temp2=sc.nextLine();
                String arr2[]=temp2.split(",");
                
                while("Iris-setosa".equals(arr2[5])){
                    //System.out.println(arr2[5]);
                    newcol1[j]=Float.parseFloat(arr2[1]);
                    newcol2[j]=Float.parseFloat(arr2[2]);
                    newcol3[j]=Float.parseFloat(arr2[3]);
                    newcol4[j]=Float.parseFloat(arr2[4]);
                    j++;
                    break;
                }
                while("Iris-versicolor".equals(arr2[5])){
                    newcol5[k]=Float.parseFloat(arr2[1]);
                    newcol6[k]=Float.parseFloat(arr2[2]);
                    newcol7[k]=Float.parseFloat(arr2[3]);
                    newcol8[k]=Float.parseFloat(arr2[4]);
                    k++;
                    break;
                }
                while("Iris-virginica".equals(arr2[5])){
                    newcol9[l]=Float.parseFloat(arr2[1]);
                    newcol10[l]=Float.parseFloat(arr2[2]);
                    newcol11[l]=Float.parseFloat(arr2[3]);
                    newcol12[l]=Float.parseFloat(arr2[4]);
                    l++;
                    break;
            }
        } }catch(Exception ex){
            System.out.println("sommme errror");
        }
        System.out.println("Iris-setosa");

        float res13=obj.mean(newcol1,50);
        System.out.println("mean of the sepal length "+res13);
        float res14=obj.median(newcol1);
        System.out.println("median of the sepal length "+res14);
        float res15=obj.mode(newcol1);
        System.out.println("mode of the sepal length "+res15);
        float res16=obj.mean(newcol2,50);
        System.out.println("mean of the sepal width of setosa "+res16);
        float res17=obj.median(newcol2);
        System.out.println("median of the sepal width "+res17);
        float res18=obj.mode(newcol2);
        System.out.println("mode of the sepal width "+res18);
        float res19=obj.mean(newcol3,50);
        System.out.println("mean of the petal length "+res19);
        float res20=obj.median(newcol3);
        System.out.println("median of the petal length "+res20);
        float res21=obj.mode(newcol3);
        System.out.println("mode of the petal length "+res21);
        float res22=obj.mean(newcol4,50);
        System.out.println("mean of the petal width "+res22);
        float res23=obj.median(newcol4);
        System.out.println("median of the petal width "+res23);
        float res24=obj.mode(newcol4);
        System.out.println("mode of the petal width "+res24);
        // for(int i=0;i<newcol1.length;i++){
        //     System.out.println(newcol1[i]);
        // }
        System.out.println("****************************************************");
        System.out.println("Iris-versicolor");

        float res25=obj.mean(newcol5,50);
        System.out.println("mean of the sepal length "+res25);
        float res26=obj.median(newcol5);
        System.out.println("median of the sepal length  "+res26);
        float res27=obj.mode(newcol5);
        System.out.println("mode of the sepal length  "+res27);
        float res28=obj.mean(newcol6,50);
        System.out.println("mean of the sepal width  "+res28);
        float res29=obj.median(newcol6);
        System.out.println("median of the sepal width  "+res29);
        float res30=obj.mode(newcol6);
        System.out.println("mode of the sepal width "+res30);
        float res31=obj.mean(newcol7,50);
        System.out.println("mean of the petal length  "+res31);
        float res32=obj.median(newcol7);
        System.out.println("median of the petal length  "+res32);
        float res33=obj.mode(newcol7);
        System.out.println("mode of the petal length  "+res33);
        float res34=obj.mean(newcol8,50);
        System.out.println("mean of the petal width  "+res34);
        float res35=obj.median(newcol8);
        System.out.println("median of the petal width "+res35);
        float res36=obj.mode(newcol8);
        System.out.println("mode of the petal width "+res36);

        System.out.println("****************************************************");
        System.out.println("Iris-virginica");
        float res37=obj.mean(newcol9,50);
        System.out.println("mean of the sepal length "+res37);
        float res38=obj.median(newcol9);
        System.out.println("median of the sepal length "+res38);
        float res39=obj.mode(newcol9);
        System.out.println("mode of the sepal length "+res39);
        float res40=obj.mean(newcol10,50);
        System.out.println("mean of the sepal width "+res40);
        float res41=obj.median(newcol10);
        System.out.println("median of the sepal width "+res41);
        float res42=obj.mode(newcol10);
        System.out.println("mode of the sepal width "+res42);
        float res43=obj.mean(newcol11,50);
        System.out.println("mean of the petal length "+res43);
        float res44=obj.median(newcol11);
        System.out.println("median of the petal length "+res44);
        float res45=obj.mode(newcol11);
        System.out.println("mode of the petal length "+res45);
        float res46=obj.mean(newcol12,50);
        System.out.println("mean of the petal width "+res46);
        float res47=obj.median(newcol12);
        System.out.println("median of the petal width "+res47);
        float res48=obj.mode(newcol12);
        System.out.println("mode of the petal width "+res48);
}}
