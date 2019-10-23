class Solution {
  public int solution(int n) {
      int answer = 1;    //i=2
     
      start:
      for(int i=3; i<=n; i++) //n이 3일때 i=2,3
      {      
          for(int j=2; j<=Math.sqrt(i); j++) // 소수는 자기자신 제곱수  
          {
              if(i%j==0)    //소수가 하나라도 있으면
              continue start; //start: 쪽으로 이동
          }
        answer++;
      }
      return answer;
  }
}