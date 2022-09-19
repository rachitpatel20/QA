import java.util.Arrays;

public class secondlargestnumber{  
public static int secondlargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-2];  
}  
public static void main(String args[]){  
int a[]={60,20,19,26,33,74};    
System.out.println("Second Largest: "+secondlargest(a,6));  
}
}
