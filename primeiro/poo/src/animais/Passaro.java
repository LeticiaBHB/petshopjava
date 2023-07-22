package animais;

public class Passaro extends Animal{
      static int numerodePassaros;

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }
    @Override
    public void soar() {
        System.out.println("PIU PIU");
    }
//    private String nome;
//    private String cor;
//    private int altura;
//    private double peso;
//    private String estadodeESpirito;

//    public Passaro(String nome, String cor, int altura, double peso, String estadodeESpirito) {
//        this.nome = nome;
//        this.cor = cor;
//        this.altura = altura;
//        this.peso = peso;
//        this.estadodeESpirito = estadodeESpirito;
//        static int numerodePassaros ++:
//    }
//    void comer(){}
//    void dormir(){}
//    void soar(){
//        System.out.println("PIU PIU");
//    }
}
