public class Animal {
    protected void hacerSonido(){
        System.out.println("el animal hace un sonido");

    }
}
class Perro extends Animal {


    @Override
    protected void hacerSonido() {
        System.out.println("el perro hace guaf");
    }
}

class Gato extends Animal {
    @Override
    protected void hacerSonido() {
        System.out.println("el gato hace miau");
    }
}

class PruebaAnimal {

    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        //objeto de la clase padre (animal)
        // Animal animal = new Animal();
        Animal animal = new Perro();
        imprimirSonido(animal);
    }
}






