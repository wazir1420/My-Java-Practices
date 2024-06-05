package wazir;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
  int username;
  System.out.println("Enter Your Username:- ");
  Scanner janu=new Scanner(System.in);
  username=janu.nextInt();
  int password;
  System.out.println("Enter Your Password:- ");
  Scanner paku=new Scanner(System.in);
  password=paku.nextInt();

  if(username==12345 && password==54321)
  {
    System.out.println("You're Successfully Login...");
  }
  else{
    System.out.println("Sorry Wrong Input...");
  }
  
    
  }  
}
