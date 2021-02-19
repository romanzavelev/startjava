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
        
        char firstLetterName = 'M';
        if (firstLetterName == 'M') {
            System.out.println("first letter name = M");
        } else if (firstLetterName == 'I') {
            System.out.println("first letter name= I");
        } else {
            System.out.println("first letter name not I and first letter name not M");
        }
    }
}