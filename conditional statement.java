import java.util.*;;
class secondclass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int a=sc.nextInt(); 
        if(a>18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Not Adult");
        }


    }
}