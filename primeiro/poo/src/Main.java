import Lojas.Petshop;
import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import animais.Passaro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("rex", "branco", 10 , 10.5, 8, "feliz");
        System.out.println(cachorro1.getNumeroDeCachorros());
        Cachorro cachorro2 = new Cachorro("Puppy","Marrom", 25, 5.5, 5, "nada");
        Gato gato1 = new Gato("Baby","trigrada", 4.9);
        Passaro passato1 = new Passaro("frajola", "Azul",0.5);
        Animal gato2 = new Animal( "bolinha", "marrom", 3.5);
        cachorro1.soar();
        gato1.soar();
        passato1.soar();
        Petshop petshop = new Petshop();
        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeESpirito());
        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
        System.out.println(gato2.getCor());

//        System.out.println(cachorro2.getNumeroDeCachorros());
//        System.out.println(cachorro1.getNumeroDeCachorros());
//
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
//        System.out.println(cachorro2.getPeso());
//        cachorro1.setNome("Puppy");
//        cachorro1.setCor("marrom");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);
//        cachorro1.latir();
//
//        System.out.println(cachorro2.getnome());
//        System.out.println(cachorro2.getPeso());
//        System.out.println(cachorro1);
//        System.out.println(cachorro2);
//        System.out.println("o cachorro pegou uma "+ cachorro1.pegar());
//        System.out.println("o cachorro está " + cachorro1.interagir("carinho"));
//        System.out.println("o cachorro está " + cachorro1.interagir("vai dormir"));
//        System.out.println("o cachorro está " + cachorro1.interagir("vai neutro"));
        }
}
