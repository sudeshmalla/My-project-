

public class WaterLevel
{
   public static void main(String[] args){
       int a=100;
       System.out.println("The water level is:"+a);
       String message= (a>=1000)? 
       "Warning!! The water level is high"
       :"Status: Normal";
       System.out.println("Water level high:"+message);
       
    }
}