public class Multiplicationmatrix
 {
    public static void main(String s[])
    {
        int i,j,k;
        int a[][]={{1,3,2},{2,1,3},{1,7,1}};
        int b[][]={{6,2,1},{2,6,4},{1,3,1}};
        int res[][]=new int [a.length][b.length];
     
        for( i=0;i<a.length;i++)
        {    
            for(j=0;j<b.length;j++)
            {    
              res[i][j]=0;      
                for( k=0;k<b.length;k++)      
                {      
                     res[i][j]+=a[i][k]*b[k][j];      
                }
               
                 System.out.print(res[i][j]+" "); 

            }
            System.out.println();  
            
        }    
    }
    
}
