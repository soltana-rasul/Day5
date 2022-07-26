class CustomException extends Exception  {  

}  
    
public class Q3Cont  
{  
    public static void main(String args[])  
    {  
        try  
        {  
            throw new CustomException();  
        }  
        catch (CustomException ex)  
        {  
            System.out.println("Custom Exception");  
        }  
  
        System.out.println("rest of the code...");    
    }  
}  