import java.util.*;
public class Lab01 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        String name;
        String class1;
        int age;
        String state;
        char gender;
        System.out.println("Enter your name, class, age, state and gender(in F or M)");
        name=sc.nextLine();
        class1=sc.nextLine();
        age=Integer.parseInt(sc.nextLine());
        state =sc.nextLine();
        gender=sc.next().charAt(0);
        
        System.out.println("**********************OUTPUT************************");
        System.out.println("****************************************************");
        System.out.println(" name : "+name);
        System.out.println(" class : "+class1);
        System.out.println(" age : "+age);
        System.out.println(" state : "+state);
        System.out.println(" gender : "+gender);
        System.out.println("****************************************************");

        if(gender=='M'||gender=='m')
        {
            System.out.println("Male");
        }
        else if(gender=='F'||gender=='f') 
        {
            System.out.println("Female");
        }
        else
        {        
            System.out.println("invalid");
        }
        //int count=0;
        
    switch(state)
    {
      case "Kashmir":System.out.println("The student belongs to North India");
      break;
      case "Punjab": System.out.println("The student belongs to North India");
      break;
      case "Rajasthan": System.out.println("The student belongs to North India");
      break;
      case "Bihar": System.out.println("The student belongs to North India");
      break;
      case "West Bengal": System.out.println("The student belongs to North India");
      break;
      case "Delhi": System.out.println("The student belongs to North India");
      break;
      case "Kerela": System.out.println("The student belongs to South India");
      break;
      case "Tamil Nadu": System.out.println("The student belongs to North India");
      break;
      case "Andhra Pradesh": System.out.println("The student belongs to South India");
      break;
      case "Karnataka": System.out.println("The student belongs to South India");
      break;
      case "Telangana": System.out.println("The student belongs to South India");
      break;
      case "Himachal Pradesh": System.out.println("The student belongs to North India");
      break;
      case "Uttar Pradesh": System.out.println("The student belongs to North India");
      break;
      case "Maharashtra": System.out.println("The student belongs to west India");
      break;
      case "Gujrat": System.out.println("The student belongs to West India");
      break;

      default:
      System.out.println("invalid");
      break;
    }








    }
    
}
