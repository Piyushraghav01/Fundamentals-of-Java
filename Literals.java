import java.lang.String;

class Literals {
    public static void main(String[] args) {
        byte players = 013;
        short score = 0b1111;
        int seatings = 0xA;
        Integer i = 100;
        System.out.println(i);
        long collections = 1_25_34_75_67_44l;

        float avg = 98.3_45_76f;
        double d = 1e+9;

        char ch = '\uff74';
        System.out.println(ch);

        String myName = "Falak Chandni";
        System.out.println(myName);

        boolean bool = true;
        System.out.println(bool);

        System.out.println(players);
        System.out.println(score);
        System.out.println(seatings);
        System.out.println(collections);
        System.out.println(avg);
        System.out.println(d);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);

        // javap java.lang.Integer Values of Integers 

    }

}
