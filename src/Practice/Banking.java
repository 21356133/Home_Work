package Practice;

import java.util.Scanner;

class Banking {

  private String Acno;
  private String Name;
  private long Balance;
  
  Scanner Sc=new Scanner(System.in);
  
  void openAccount() {
      System.out.print("Enter Account No: ");
      Acno = Sc.next();
      System.out.print("Enter Name: ");
      Name = Sc.next();
      System.out.print("Enter Balance: ");
      Balance = Sc.nextLong();
  }
  
  void DisplayAc() {
      System.out.println(Acno + "," + Name + "," + Balance);
  }
  
  void Deposit() {
      long Amt;
      System.out.println("Enter Amount U Want to Deposit : ");
      Amt = Sc.nextLong();
      Balance = Balance + Amt;
  }
  
  void Withdrawal() {
      long Amt;
      System.out.println("Enter Amount U Want to withdraw : ");
      Amt = Sc.nextLong();
      if (Balance >= Amt) {
          Balance = Balance - Amt;
      } else {
          System.out.println("Less Balance..Transaction Failed..");
      }
  }
  
  boolean search(String acn) {
      if (Acno.equals(acn)) {
          DisplayAc();
          return (true);
      }
      return (false);
  }
 
      public static void main(String arg[]) {
          @SuppressWarnings("resource")
			Scanner Sc = new Scanner(System.in);

              
          System.out.print("How Many Customer U Want to Input : ");
          int n = Sc.nextInt();
          Banking C[] = new Banking[n];
          for (int i = 0; i < C.length; i++) {
              C[i] = new Banking();
              C[i].openAccount();
          }

          
          int ch;
          do {
              System.out.println("Main Menu\n 1. DisplayAc\n 2.Search By Account\n 3.Deposit\n 4.Withdrawal\n 5.E xit ");
                  System.out.println("Ur Choice :"); ch = Sc.nextInt();
                  switch (ch) {
                      case 1:
                          for (int i = 0; i < C.length; i++) {
                              C[i].DisplayAc();
                          }
                          break;

                     case 2:
                          System.out.print("Enter Account No U Want to Search...: ");
                          String acn = Sc.next();
                          boolean found = false;
                          for (int i = 0; i < C.length; i++) {
                              found = C[i].search(acn);
                              if (found) {
                                  break;
                              }
                          }
                          if (!found) {
                              System.out.println("Search Failed..Account Not Exist..");
                          }
                          break;   

                      case 3:
                          System.out.print("Enter Account No : ");
                          acn = Sc.next();
                          found = false;
                          for (int i = 0; i < C.length; i++) {
                              found = C[i].search(acn);
                              if (found) {
                                  C[i].Deposit();
                                  break;
                              }
                          }
                          if (!found) {
                              System.out.println("Search Failed..Account Not Exist..");
                          }
                          break;

                      case 4:
                          System.out.print("Enter Account No : ");
                          acn = Sc.next();
                          found = false;
                          for (int i = 0; i < C.length; i++) {
                              found = C[i].search(acn);
                              if (found) {
                                  C[i].Withdrawal();
                                  break;
                              }
                          }
                          if (!found) {
                              System.out.println("Search Failed..Account Not Exist..");
                          }
                          break;

                      case 5:
                          System.out.println("Good Bye..");
                          break;
                  }
              }
              while (ch != 5);
          }
      }

          
      
      
      
      
      
      
