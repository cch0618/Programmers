import java.util.*;

class Solution {
    public String solution(String s) {
        char[] st = s.toCharArray();    //String.toCahrArray 사용해서 char형태로 변형
        Arrays.sort(st);    //정렬 -> 있어도 되고 없어도 됨. 오름차순
        StringBuilder sb = new StringBuilder(String.valueOf(st));//StringBuilder 변수에 st의 값을 String생성
        sb.reverse(); //sb값을 내림차순으로
        return sb.toString(); // 결과값 출력

    }
    

    //테스트
    
    public static void main(String[] args)
    {
        Solution st = new Solution();
        System.out.println(st.solution("Abtdhe"));
    }
    
}