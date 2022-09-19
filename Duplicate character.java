public class Duplicate 
{
   public static void main( String[] args)
   {  int i;
      string str= "LPDDR";
      int length = str.length();
      char[] chr = str.toCharArray();
      
      for( i=0 ; i<length ; i++ )
       {
       
           for ( int j=i+1 ; j<length ; j++)
           {
               if( chr[i]==chr[j])
               {
                 System.out.println("Duplicate Characters" + chr[j]);
                break;
                
                }
                
            }
            
        }
        
     }
     
  }   
      
