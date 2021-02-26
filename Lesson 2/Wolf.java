public class Wolf {
    private char sex;
    private String nicname;
    private int weight;
    private int age;
    private String color;

    public char getSex() {
        return sex;
    }

    public String getNicname() {
        return nicname;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setNicname(String nicname) {
        this.nicname = nicname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

     public void setColor(String color) {
        this.color = color;
    }

    public void go() {

    }

    public void sit() {

    }

    public void run() {

    }

    public void howl() {

    }

    public void hunt() {

    }
}