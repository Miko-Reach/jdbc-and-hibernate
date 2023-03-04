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
    }
}

