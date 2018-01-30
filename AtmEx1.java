import java.util.Scanner;
class AtmEx1
{
    public static void main(String[] s)
    {
        Scanner sc=new Scanner(System.in);
        int PIN=1234;
        int Amount=50000;
        int count=3;
        System.out.println("----WELCOME TO RCPL ATM----");
        System.out.println("Enter your PIN: ");
        int p=sc.nextInt();
        while(p!=PIN)
        {
                    if(count==0)
                        System.exit(0);
                    System.out.println("Wrong Pin Try Again!!");
                    System.out.println("You Have "+count +" Attempts Left");
                    System.out.println("Enter your PIN: ");
                    int p1=sc.nextInt();
                    p=p1;
                    count--;
        }
            
        if(p==PIN)
        {
            while(true)
            {
            System.out.println("*********Banking Menu***********");
            System.out.println("---Press 1 for Withdraw---");
            System.out.println("---Press 2 for Deposit---");
            System.out.println("---Press 3 for Balance---");
            System.out.println("---Press 4 for Exit---");
            System.out.println("********************************");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                System.out.println("Enter Withdraw Amount: ");
                int wa=sc.nextInt();
                if(wa%100==0)
                 {
                     if(wa>Amount)
                    {
                        System.out.println("Amount Not Available");
                        break;
                    }
                    if(wa<100)
                    {
                        System.out.println("Amount too small");
                        break;
                    }
                        System.out.println("---DENOMINATIONS---");
                        System.out.println(" 1. 2000");
                        System.out.println(" 2. 500");
                        System.out.println(" 3. 100");
                        System.out.println("Enter your choice: ");
                        int c1=sc.nextInt();
                        switch(c1)
                        {
                            case 1:
                                    if(wa%2000!=0)
                                    {
                                        System.out.println("Could Not Process Your Request");
                                        System.out.println("Try Choosing Different Denomination");
                                        continue;
                                    }
                                    int notes=wa/2000;
                                    System.out.println(" "+notes+" notes of 2000");
                                    break;
                            case 2:
                                if(wa%500!=0)
                                    {
                                        System.out.println("Could Not Process Your Request");
                                        System.out.println("Try Choosing Different Denomination");
                                        continue;
                                    }
                                    int notes1=wa/500;
                                    System.out.println(" "+notes1+" notes of 500");
                                    break;
                            case 3: if(wa%100!=0)
                                    {
                                        System.out.println("Could Not Process Your Request");
                                        System.out.println("Try Choosing Different Denomination");
                                        continue;
                                    }
                                    int notes2=wa/100;
                                    System.out.println(" "+notes2+" notes of 100");
                                    break;
                            default:
                            System.out.println("DENOMINATION NOT AVAILABLE");
                        }
                    Amount=Amount-wa;
                    System.out.println("Please Collect Cash "+wa+" Before leaving ATM");
                    System.out.println("Total Amount after deposit: "+Amount);
                }
               break;
            case 2:
            System.out.println("Enter the amount you want to deposit: ");
            int da=sc.nextInt();
            Amount=Amount+da;
            System.out.println("Total Amount after deposit: "+Amount);
            break;
        case    3:
            System.out.println("Total Balance is: "+Amount);
            break;
        case 4:
            System.exit(0);
        default:
            System.out.println("You have entered a wrong choice");

        }
    }
    }
    }
}

