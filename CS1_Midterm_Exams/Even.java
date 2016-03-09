class Even {
    public static void main(String[] args) {
        System.out.println(countEvenDigits(8546587));
        System.out.println(countEvenDigits(2203654));
    }

    public static int countEvenDigits(int num) {
        int count = 0;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            char sub = s.charAt(i);
            if (sub == '8' || sub == '6' || sub == '4' || sub == '2' || sub == '0') {
                count++;
            }
        }
        return count;
    }
}
