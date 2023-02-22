import java.util.*;
public class Lab04 {
    
    static String name;
    static int accnum;
    static int balance;
    static Scanner sc= new Scanner(System.in);
    static void initialise(){
        System.out.println("enter the name");
        name=sc.nextLine();
        System.out.println("enter the account number");
        accnum=Integer.parseInt(sc.nextLine());
        System.out.println("enter the balance");
        balance=Integer.parseInt(sc.nextLine());
        }
    static void deposit(int a){
        //System.out.println("enter the amount");
           // int a=Integer.parseInt(sc.nextLine());
            System.out.println("Amount deposited successfully "+a);
            balance=balance+a;
           // transaction(a);
            //return a;
    }  
    static void withdraw(int b){
        //System.out.println("enter the amount");
        //int a=Integer.parseInt(sc.nextLine());
        if(b>=balance){
            System.out.println("not enough balance ");
        }
        else{System.out.println("Amount withdrawn "+b);
        balance=balance-b;
        //transaction(a);
        //return b;
    }
}
    static void transaction(int c){
        System.out.println(c);


    }
    static void summary(){
        System.out.println("Total balance "+balance);

    }
    public static void main(String[] args){
    initialise();
    
    int a=0;
    int b=0;
    int user;
do{
    System.out.println("menu \n 1 for deposit \n 2 for withdraw \n 3 for transaction \n 4 for Summary");
    int userinp=Integer.parseInt(sc.nextLine());
    switch(userinp){
        case 1:
        System.out.println("enter the amount");
        a=Integer.parseInt(sc.nextLine());
        deposit(a);
        break;
        case 2:System.out.println("enter the amount");
        b=Integer.parseInt(sc.nextLine());
        withdraw(b);
        break;
        case 3:
        System.out.println("************************");
        System.out.println("amount before = "+balance);
        System.out.println("amount credited");
        transaction(a);
        System.out.println("amount debited");
        transaction(b);
        System.out.println("total current amount = "+balance);

        System.out.println("************************");
        break;
        case 4:
        System.out.println("************************");
        System.out.println("total amount available= "+ balance);
        System.out.println("************************");
        break;
        default: System.out.println("invalid");




    }
    System.out.println("Enter 0 to continue");
    user=Integer.parseInt(sc.nextLine());
}while(user==0);
    }
}