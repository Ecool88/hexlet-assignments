package exercise;

// BEGIN
class ReversedSequence implements CharSequence {
    private String reversedStr;

    ReversedSequence (String str) {
        this.reversedStr = new StringBuilder(str).reverse().toString();
    }

    public String toString() {
        return reversedStr;
    }

    public char charAt (int position) {
        return reversedStr.charAt(position);
    }

    public int length () {
        return reversedStr.length();
    }

    public String subSequence (int start, int end) {
        return reversedStr.substring(start, end);
    }
}
// END
