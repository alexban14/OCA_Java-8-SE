package pond.swan;

import pond.duck.MotherDuck; // import another package

public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // DOES NOT COMPILE
        System.out.println(duck.noise); // DOES NOT COMPILE
    }
}
