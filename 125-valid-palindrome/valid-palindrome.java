class Solution {
    public boolean isPalindrome(String s) {
        String nss = s.replaceAll("\\s", "");
        if (nss.isEmpty()) {
            return true;
        }
        String cns = nss.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cns);
        sb.reverse();
        String rvs = sb.toString();
        return cns.equals(rvs);
    }
}