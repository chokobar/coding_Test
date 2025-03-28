package foundation.codingTest;

public class Test32 {

    public static void main(String[] args) {
        /*
         * 9로 나눈 나머지
         *
         * 문제 설명
         * 이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때,
         * 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
         *
         *
         * number	                result
         * "123"	                6
         * "78720646226947352489"	2
         *
         * 입출력 예 #1
         * 예제 1번의 number는 123으로 각 자리 숫자의 합은 6입니다.
         * 6을 9로 나눈 나머지는 6이고, 실제로 123 = 9 × 13 + 6입니다.
         * 따라서 6을 return 합니다.
         *
         * 입출력 예 #2
         * 예제 2번의 number는 78720646226947352489으로 각자리 숫자의 합은 101입니다.
         * 101을 9로 나눈 나머지는 2이고,
         * 실제로 78720646226947352489 = 9 × 8746738469660816943 + 2입니다.
         * 따라서 2를 return 합니다.
         *
         */
        class Solution {
            public int solution(String number) {
                int answer = 0;
                int sum = 0;
                for (int i = 0; i < number.length(); i++) {
                    sum += number.charAt(i) - '0';
                }
                answer = sum % 9;
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("78720646226947352489");
    }
}
