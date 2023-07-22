package animais;

public class Cachorro extends Animal {
//atributos
    static int numeroDeCachorros;
//    private String nome;
//    private String cor;
//    private int altura;
//    private double peso;
    private int tamanhoDoRabo;
//    private String estadoDeEspirito;

    //construtores
//    public Cachorro (){}
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeESpirito = estadoDeEspirito;
        numeroDeCachorros ++;
    }

    //metodos

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }
    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }
    public String getnome(){return  this.nome = nome;}

    public void setNome(String nome){this.nome = nome;}

    public String getCor(){return cor;}

    public void setCor(String cor) { }

    public int getAltura() {return altura;}

    public void setAltura(int altura) {this.altura = altura;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

    public int getTamanhoDoRabo() {return tamanhoDoRabo;}

    public void setTamanhoDoRabo(int tamanhoDoRabo) {this.tamanhoDoRabo = tamanhoDoRabo;}

    public String getEstadoDeEspirito() { return estadoDeESpirito;}

//    public void comer() {
//    }

//    public void soar() {
//        System.out.println("AU AU");
//    }

    public String pegar() {return "bolinha";}

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":this.estadoDeESpirito = "feliz"; break;
            case "vai dormir":this.estadoDeESpirito = "bravo"; break;
            case "pisar na patinha":this.estadoDeESpirito = "triste"; break;
            default:this.estadoDeESpirito = "neutro";break;
        }
        return this.estadoDeESpirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
    @Override
    public void soar() {
        System.out.println("AU AU");
    }
}
//        if(acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        } else if (acao.equals("vai dormir")) {
//            this.estadoDeEspirito = "bravo";
//        } else {
//            this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;


