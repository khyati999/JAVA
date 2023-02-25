public class Linear_search
 {
    public static void main(String s[])
    {
        int n=Integer.parseInt(s[0]);
        int[] arr= {1,4,23,56,54};
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                break;
            }

            
        }
        if(i<arr.length)
        {
            System.out.println("Number found in array!");
        }
        else{
            System.out.println("Number not found in array!");
        }




    }    
}
