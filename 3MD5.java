package lanxin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class lanxin
{

     public static void main(String []args)
     {
    	 
        String plain = "123456";
        byte[] fake = plain.getBytes();
        
        final MessageDigest MD5;
        try
        {
            MD5 = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
        {
            throw new RuntimeException(localNoSuchAlgorithmException.getMessage());
        }
        
        for(int c = 0; c <= 2; ++c)
        {    
            fake = MD5.digest(fake);
            System.out.printf("MD5[%02X]:",c);
            for (int i = 0; i < fake.length; i++)
            {
                String hex = Integer.toHexString(fake[i] & 0xFF); 
                if (hex.length() == 1) 
                {
                     hex = '0' + hex;
                }
                System.out.print(hex.toUpperCase() + " ");
            }
            System.out.println();
        }
        
     }
}