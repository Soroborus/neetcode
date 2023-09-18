public static boolean isSequence(String s,String t){
        if (s.length()>t.length()){
            return false;
        }
        else {
            if ((s.length() == 0) && (t.length() != 0)) {
                return true;
            }
        }
        int n=0;
        for (int i=0;i<t.length();i++) {
            if (s.charAt(n) == t.charAt(i)) {
                n++;
            }
            if(n==s.length()){
                return true;

            }
         }
        return false;
    }
