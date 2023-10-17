package TASK_4.n1;


public class Years{
    enum Year {
        Spring(12),
        Summer(30){
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },
        Autumn(11),
        Winter(-20);

        private int temp;

        Year(int temp) {
            this.temp = temp;
        }

        public int getTemp() {
            return temp;
        }

        public String getDescription() {
            return "Холодное время года";
        }
    }

    public static void favYear(Year year){
        switch (year){
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я люблю осень");
                break;
            case Spring:
                System.out.println("Я люблю весну");
                break;
            case Winter:
                System.out.println("Я люблю зиму");
                break;
        }
    }

    public static void main(String [] args){
        Year fav = Year.Summer;
        favYear(fav);
        System.out.println("Средняя температура: " + fav.temp);

        for(Year x:Year.values()){
            System.out.println(x + " " + x.getDescription() + " Средняя температура: " +  x.getTemp());
        }
    }
}
