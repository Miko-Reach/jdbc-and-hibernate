package pl.sda.orange2.lambda;


//its functional interface because it has one abstract method

@FunctionalInterface
public interface BoysDontCry {

    void silnoreki();

   default void cry () {}

    //Functional interface rozszerza interfejs i domyślnie'
    //nam implementuje
}
