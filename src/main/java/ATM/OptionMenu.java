/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;
import java.util.*;
import java.io.IOException;
import java.util.Map.Entry;

public class OptionMenu extends Account {
    Scanner sc=new Scanner(System.in);
    //DecimalFormat moneyFormat=new DecimalFormat("'₹ '########0.00");
    HashMap<Integer,Integer> userData=new HashMap<>();
    int selection;

public void userLogin() throws IOException{
    int x=1;
    do{
        try {
            userData.put(1234567,2345);
            userData.put(1234569,9876);
            System.out.println("Welcome!");
            System.out.println("Enter your Account number:");
            setCusNumber(sc.nextInt());
            System.out.println("Enter your pin number");
            setPinNumber(sc.nextInt());
            
            
        }
        catch(Exception e){
            System.out.println("\n"+"Invalid character(s).Only numbers." +"\n");
            x=2;
        }
        for(Entry<Integer,Integer>entry:userData.entrySet()){
        if(entry.getKey()==getCusNumber()&&entry.getValue()==getPinNumber()){
            getAccType();
        }
    }
        System.out.println("\n"+"Wrong credentials,Try again!"+"\n");
    }while(x==1); 
}
//Account type and its option
public void getAccType(){
    System.out.println("Select the accountype:");
    System.out.println("Type 1 : Checking Account");
    System.out.println("Type 2 : Saving Account");
    System.out.println("Type 3 : Exit");
    System.out.println("Eneter your choice:");
    
    selection=sc.nextInt();
    
    switch(selection){
        case 1 :
            getChecking();
            break;
        case 2 :
            getSaving();
            break;
        case 3 :
            System.out.println("Thankyou for using this ATM!");
            break;
        default :
            System.out.println("Invalid choice selection");
            System.out.println("Select your choice  from below available options!");
            getAccType();
            
    }
}
public void getChecking(){
    System.out.println("Checking Account:");
    System.out.println("Type 1 : View Balance");
    System.out.println("Type 2 : Withdraw Balance");
    System.out.println("Type 3 : Deposit money");
    System.out.println("Type 4 : Exit:");
    System.out.println("Choice :");
    
    selection=sc.nextInt();
    
    switch(selection){
        case 1 :
            System.out.println("Checking balance"+"'₹ '"+moneyFormat.format(getCheckingBalance()));
            getChecking();
            break;
        case 2 :
            getCheckingWithdrawInput();
            getChecking();
            break;
        case 3 :
           getCheckingDepositInput();
           getChecking();
            break;
        case 4 :
            System.out.println("Thankyou for using this ATM!");
            getAccType();
            break;
        default :
            System.out.println("Invalid choice selection");
            System.out.println("Select your choice  from below available options!");
            getChecking();
            
            
    }
}
public void getSaving(){
    System.out.println("Checking Account:");
    System.out.println("Type 1 : View Balance");
    System.out.println("Type 2 : Withdraw Balance");
    System.out.println("Type 3 : Deposit money");
    System.out.println("Type 4 : Exit:");
    System.out.println("Choice :");
    
    selection=sc.nextInt();
    
    switch(selection){
        case 1 :
            System.out.println("Saving balance"+moneyFormat.format(getSavingBalance()));
            getSaving();
            break;
        case 2 :
            getSavingWithdrawInput();
            getSaving();
            break;
        case 3 :
           getSavingDepositInput();
           getSaving();
            break;
        case 4 :
            System.out.println("Thankyou for using this ATM!");
            getAccType();
            break;
        default :
            System.out.println("Invalid choice selection");
            System.out.println("Select your choice  from below available options!");
            getSaving();
            
    }
}
}
