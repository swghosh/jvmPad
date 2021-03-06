import java.util.*;
public class Time
{
    int hrs,min;
    /**
     * Time Constructor
     *
     */
    Time()
    {
        hrs=0;min=0;
    }

    /**
     * Method getTime
     *
     * @param h Hour
     * @param m Minute
     */
    void getTime(int h,int m)
    {
        hrs=h;min=m;
    }

    /**
     * Method printTime
     *
     */
    void printTime()
    {
        System.out.print(((hrs>10)?(Integer.toString(hrs)):("0"+Integer.toString(hrs)))+":"+((min>10)?(Integer.toString(min)):("0"+Integer.toString(min))));
    }

    /**
     * Method sumTime
     *
     * @param t1 Time 1
     * @param t2 Time 2
     * @return Added Time
     */
    Time sumTime(Time t1,Time t2)
    {
        Time t3=new Time();
        t3.hrs=t1.hrs+t2.hrs;
        t3.hrs+=(t1.min+t2.min)/60;
        t3.min=(t1.min+t2.min)%60;
        return t3;
    }

    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("TIME 1");
        System.out.print("Hours [int]->");
        int h1=sc.nextInt();
        System.out.print("Minutes [int]->");
        int m1=sc.nextInt();
        Time t1=new Time();//user input time
        t1.getTime(h1,m1);
        System.out.println("------\nTIME 2");
        System.out.print("Hours [int]->");
        int h2=sc.nextInt();
        System.out.print("Minutes [int]->");
        int m2=sc.nextInt();
        Time t2=new Time();//user input another time
        t2.getTime(h2,m2);
        Time t3=new Time();
        t3=t3.sumTime(t1,t2);
        System.out.println("Total Time");
        t3.printTime();//prints sum of time
    }
}