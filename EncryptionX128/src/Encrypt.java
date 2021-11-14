public class Encrypt {
    private final String str;
    protected String enc;

    public Encrypt(String str) {
        this.str = str;
        this.enc = "";
    }

    public String encrypt() {
        StringBuilder out = new StringBuilder();

        for(int i = 0; i < this.str.length(); ++i) {
            out.append(this.str.charAt(i) + 128);
        }

        this.enc = out.toString();
        return this.enc;
    }
}
