package animais;

public class Gato extends Animal {
//    static  int numeroDeGatos;
//    private String nome;
//    private String cor;
//    private int altura;
//    private double peso;
//    private String estadoEspirito;
//
//    public Gato(String nome, String cor, int altura, double peso, String estadoEspirito) {
//        this.nome = nome;
//        this.cor = cor;
//        this.altura = altura;
//        this.peso = peso;
//        this.estadoEspirito = estadoEspirito;
      static int numeroDeGatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    //    }
//    void comer(){}
//    void dormir(){}
//    void soar(){
//        System.out.println("MIAU MIAU");
//    }
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
    @Override
    public void soar() {
        System.out.println("MIAU");
    }
}

