class Solution {
  public static boolean solution(String s) {

      int length = s.length();  
      if(length != 4 && length != 6)
          return false;
      for(int i=0; i<length; ++i)
      {
         char c = s.charAt(i);
      if(c < '0' && c > '9')
      {
          return false;
      }    
  }
      return true;
  }
}