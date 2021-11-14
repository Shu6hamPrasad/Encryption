public class Decrypt {
    private String enc;

    public Decrypt(Encrypt s) {
        this.enc = s.enc;
    }

    public String decrypt() {
        StringBuilder k = new StringBuilder();
        int sum = 0;

        for(int i = 0; i < this.enc.length(); ++i) {
            sum = sum * 10 + this.enc.charAt(i) - 48;
            if ((i + 1) % 3 == 0) {
                sum -= 128;
                k.append((char)sum);
                sum = 0;
            }
        }

        return k.toString();
    }
}
