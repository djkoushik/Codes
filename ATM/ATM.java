package Project.ATM;


class ATM
{
    static int notes_1 = 100;
    static int notes_5 = 500;
    static int notes_2 = 200;
    static double Balance = ((ATM.notes_1*100)+(ATM.notes_2*2000)+(ATM.notes_5*500));

    public ATM(int notes_1, int notes_2, int notes_5) {
        ATM.notes_1 =  notes_1;
        ATM.notes_2 = notes_2;
        ATM.notes_5 = notes_5;
    }
}
class Bank
{
        ATM insert = new ATM(50000,10000,5000);
}
class Withdraw {

    public void withdraw(double amount, double balance) {
        int notesof2000;
        int notesof500;
        int notesof100;
        System.out.println(ATM.Balance);
        if (amount != 0 && amount % 100 == 0 && amount <= ATM.Balance)
          if(amount < balance) {
            if(ATM.notes_2 != 0)
            {
              notesof2000 = (int) amount / 2000;
              amount = amount % 2000;
              if (notesof2000 != 0 )
                  System.out.println("check wether you got " + notesof2000 + " 2000 notes or not");
                ATM.notes_2 -= (notesof2000);
            }
            if (ATM.notes_5 != 0)
            {
              notesof500 = (int) amount / 500;
              amount = amount % 500;
              if (notesof500 != 0)
                  System.out.println("check wehter you got " + notesof500 + " 500 notes or not");

                  ATM.notes_5 -= (notesof500);
            }
              if(ATM.notes_1 != 0) {
                  notesof100 = (int) amount / 100;
                  if (notesof100 != 0 && ATM.notes_1 != 0)
                      System.out.println("check wether you got " + notesof100 + " 100 notes or not");
                  ATM.notes_1 -= (notesof100);
              }

              if(ATM.Balance != 0)
                    ATM.Balance = ((ATM.notes_1*100)+(ATM.notes_2*2000)+(ATM.notes_5*500));
          }
          else
                System.out.println(" You donot sufficient balance in you account");
        else
                System.out.println("Something went wrong");


        System.out.println(ATM.Balance);

        System.out.println(ATM.notes_1);

        System.out.println(ATM.notes_2);

        System.out.println(ATM.notes_5);
    }
}

