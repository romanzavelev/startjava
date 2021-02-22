public class WolfTest {
    public static void main(String[] args) {
        Wolf WolfOne = new Wolf();
        WolfOne.sex = 'M';
        WolfOne.nicname = "Шарик";
        WolfOne.weight = 15;
        WolfOne.age = 5;
        WolfOne.color = "blue";
        
        System.out.println(WolfOne.sex);
        System.out.println(WolfOne.nicname);
        System.out.println(WolfOne.weight);
        System.out.println(WolfOne.age);
        System.out.println(WolfOne.color);

        WolfOne.go();
        WolfOne.sit();
        WolfOne.run();
        WolfOne.howl();
        WolfOne.hunt();
    }
}