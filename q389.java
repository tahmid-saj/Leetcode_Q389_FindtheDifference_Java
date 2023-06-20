class Solution {
    public char findTheDifference(String s, String t) {
        char[] tmpS = s.toCharArray();
        char[] tmpT = t.toCharArray();
        char res = 'a';

        Arrays.sort(tmpS);
        Arrays.sort(tmpT);

        for (int i = 0; i < tmpT.length; i++) {
            if (i == tmpS.length || tmpT[i] != tmpS[i]) {
                res = tmpT[i];
                break;
            }
        }

        return res;
    }
}
