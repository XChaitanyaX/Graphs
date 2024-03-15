import java.util.*;
class Balance
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the amount:");
        double amount=input.nextDouble();
        double interest;
        double rate;
        for(int i=1;i<=12;i++)
        {
            if (amount<=110000)
            {
                rate=0.01;
            }
            else if (amount>110000 && amount<=125000)
            {
                rate=0.015;
            }
            else
            {
                rate=0.02;
            }
            interest=amount*rate;
            amount=amount+interest+1000;
            System.out.println(i+"\t"+rate+"\t"+interest+"\t"+amount);
        }
    }
}