
import java.util.*;
public class LAB2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        String name2;
        String name3;
        //String name[]= {"ayu","Sinha","Riya","Shan"}
        String name[]= new String[1024];
        int c=0; int a=0;
        do{
            System.out.println("Enter your choice:\n 1 Enter a name \n 2 for Search \n 3 Remove a name \n 4 Show all names");
            int inp=Integer.parseInt(sc.nextLine()); 
           
            switch(inp){
                case 1: System.out.println("Enter the name");
                name[c]=sc.nextLine();
                c=c+1;
                break;
                case 2:System.out.println("Enter name for search");
                name2=sc.nextLine();


                for(int i=0;i<=c;i++){ if(name[i].equals(name2)) {
                    System.out.println(" name already exists at "+i);
                    break;

                }
                //else{System.out.println(" name does not exists");}

            }  break;
            case 3:System.out.println("Enter the names you want to remove");
            name3=sc.nextLine();
            for(int i=0;i<c;i++){ 
                if(name[i].equals(name3)) {
                    name[i]="null";
            } }
            break;
             case 4:
             System.out.println("names");

             for(int i=0;i<c;i++){
                //System.out.println("names");
                System.out.println(name[i]);

             }
             break;

            }
            System.out.println("press 1 to discontinue and 0 to continue");
            a=Integer.parseInt(sc.nextLine());
        }
        
        while(a==0);

    }
    
}
