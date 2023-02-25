
//import java.util.Arrays;

class array
{
    public static void main(String s[])
        {
            int[] arr={27,12,35,76,5};
            int i,j;
            int temp;
            for( i=0;i<arr.length;i++)
            {
                for( j=i+1;j<arr.length;j++)
                  {
                    if(arr[i] > arr[j])
                    {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
             }
            }
            for( i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }

}