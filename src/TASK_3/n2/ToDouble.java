package TASK_3.n2;

public class ToDouble {
    public static void main(String[] args) {
        System.out.print("1) ");
        Double a = Double.valueOf(3.1415);
        System.out.print(a + "\n");

        System.out.print("\n2) ");
        String str = "1.23456";
        Double b = Double.parseDouble(str);
        System.out.print(b + "\n");

        Double c = Double.valueOf(1.23);
        System.out.println("\n3) Число: " + c);
        int i = c.intValue();
        System.out.println("К int: " + i);
        short s = c.shortValue();
        System.out.println("К short: " + s);
        double d = c.doubleValue();
        System.out.println("К double: " + d);
        float f = c.floatValue();
        System.out.println("К float: " + f);
        long l = c.longValue();
        System.out.println("К long: " + l);
        byte bt = c.byteValue();
        System.out.println("К byte: " + bt);

        System.out.print("\n5) ");
        double dd = 3.14;
        String w = Double.toString(dd);
        System.out.print(w);








    }

}