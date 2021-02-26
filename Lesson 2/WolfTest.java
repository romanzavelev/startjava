public class WolfTest {
    public static void main(String[] args) {
        Wolf WolfOne = new Wolf();
        WolfOne.setSex('M');
        WolfOne.setNicname("Шарик");
        WolfOne.setWeight(15);
        WolfOne.setAge(5);
        WolfOne.setColor("blue");
        
        System.out.println(WolfOne.getSex());
        System.out.println(WolfOne.getNicname());
        System.out.println(WolfOne.getWeight());
        System.out.println(WolfOne.getAge());
        System.out.println(WolfOne.getColor());

        WolfOne.go();
        WolfOne.sit();
        WolfOne.run();
        WolfOne.howl();
        WolfOne.hunt();
    }
}