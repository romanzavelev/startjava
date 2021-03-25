public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-1");
        jaeger1.setStrength(8);
        jaeger1.move();
        jaeger1.drift();
        System.out.println(jaeger1.getMark());
        System.out.println(jaeger1.getStrength());

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMark("Mark-5");
        jaeger2.setStrength(10);
        jaeger2.move();
        jaeger2.drift();
        System.out.println(jaeger2.getMark());
        System.out.println(jaeger2.getStrength());
    }
}