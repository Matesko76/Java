class HelloWorld {
    public static void main(String[] args) {
        // rozšírujúca konverzia
        short x = 5;
        long z;
        z = (long)x;
        System.out.println(z);

        short a = 312;
        byte b;
        b = (byte)a;
        System.out.println(b);
    }
}