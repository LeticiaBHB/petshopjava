package Lojas;
import animais.Animal;
import animais.Cachorro;

public class Petshop {
    public void darBanho( Animal animal){
        animal.setEstadoDeESpirito("limpo");
    }
    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeESpirito("tosado");
    }
    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeESpirito("com saudades");
    }
}
