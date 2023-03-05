package pl.sda.orange2.lambda;

import java.awt.*;

public class LambdaExercises {

    public static void main(String[] args) {

        BoysDontCry boy = new ChłopakiNiePłaczą();
        boy.silnoreki();
        //  boy.sing();

        ChłopakiNiePłaczą boy2 = new ChłopakiNiePłaczą();
        boy2.sing();


        //Poniżej klasa bez nazwy
        BoysDontCry anonymousClassReference = new BoysDontCry() {
            @Override
            public void silnoreki() {

                System.out.println("ANON SILNOREKI");
            }
        };

        anonymousClassReference.silnoreki();

        //  BoysDontCry stupid = new String("")

        BoysDontCry firstLambda = () -> {
        };
        BoysDontCry secondLambda = () -> System.out.println("Lambda");
        //Powyżej definicja metody silnoręki ten interfejs
        secondLambda.silnoreki();
        BoysDontCry thirdLambda = () -> {

            System.out.println("one");
            System.out.println("second");
        };

        System.out.println("---------------------------------");
        System.out.println("Coffe time");
        //Nawiasy klamrowe to ciało metody
        //Nawiasy () to lista argumetnów
        //() parenthesis - arguments list
        // -> argument body separator
        //{} parenthesis - method body
        CoffeMaker myCoffeMaker = (int water, String coffeType) -> "my coffe";
        CoffeMaker myCoffeMaker2 = (int water, String coffeType) -> {

            return "my coffe";
        };


        CoffeMaker myCoffeeMaker3 = (int water, String coffeeType) -> {
            System.out.println("Coffee brewing...");
            return "Java Latte";
        };
        String myCoffee = myCoffeeMaker3.prepare(5, "Small");
        System.out.println("my coffee is ready: " + myCoffee);

        CoffeMaker shortVersion = (water, coffeeType) -> "my coffee";
        shortVersion.prepare(5, "Large Java coffee");


    }
}

