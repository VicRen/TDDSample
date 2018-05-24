package ren.vic.tddsample;

class TDDSample {
    public boolean isPalindrome(String string) {
        return string.toLowerCase().equals(new StringBuffer(string).reverse().toString().toLowerCase());
    }
}
