public class Palindrome{
    public static boolean is_palindrome(String s)
    {
       
        int longueur=s.length();
        boolean egale=true;
        int i=longueur-1;
        while(i!=0){
           if(s.charAt(i)!=s.charAt(longueur-1-i)){
              i=0;
              egale=false;
           }
           else{
            i--;
           }
      
       }
    return egale; 
   }
 }
