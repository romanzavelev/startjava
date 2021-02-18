public class ConditionalStatement {   
    public static void main(String[] args) {
        int age = 30;
        if (age > 20) {
            System.out.println("adult");
        }
        boolean genderMale = true;
        if (genderMale) {
            System.out.println("man");
        }
        if (!genderMale) {
            System.out.println("woman");
        }
        double height = 1.60;
        if (height < 1.80) {
            System.out.println("low");
        } else {
            System.out.println("high");
        }
        char firstLetter = 'M';
        if (firstLetter == 'M') {
            System.out.println("first letter = M");
        } else if (firstLetter == 'I') {
            System.out.println("first letter = I");
        } else {
            System.out.println("first letter not I and first letter not M");
        }
    }
}