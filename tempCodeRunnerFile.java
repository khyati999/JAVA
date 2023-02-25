
class quadratic
{
    public static void main(String s[])
    {
        int a=5,b=-2,c=-1;
        
        int check=((b^2)-(4*a*c));
        if(check<0){
            System.out.println("No real solution imaginary solution");
        }
        else if(check>0){
            System.out.println("Two real and unique solution exists!");
        }
        else
        {
            System.out.println("Only 1 real solution exists!");
        }
        
    }
}