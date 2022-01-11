class Solution {
        public int myAtoi(String str) {
        str = str.trim();
        if (str.equals("")) {
            return 0;
        }
        int startIndex = 0;
        int sign = 1;
        int endIndex = str.length();

        if (str.charAt(0) == '-') {
            sign = -1;
            startIndex = 1;
        } else if (str.charAt(0) == '+') {
            startIndex = 1;
        }


        for (int i = startIndex; i < str.length(); i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                endIndex = i;
                break;
            }
        }

        if (startIndex == endIndex) {
            return 0;
        }

       


        try {
            Integer sol =sign*Integer.parseInt(str.substring(startIndex, endIndex));
            return sol;
        }catch (NumberFormatException e){
            if (sign==-1){
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }


    }



}