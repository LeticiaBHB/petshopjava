package Main;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nome = "leticia";
        System.out.printf("Hello and welcome!", nome);
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a -b;
        int multiplicacao = a* b;
        int divisao = (int) ((float) a/ b);
        boolean resultado = false;
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean fazendoChuva = false;
        boolean vamosAPraia = fimDeSemana && fazendoSol ; // && é para comparar
        boolean nãoVamosAPraia = fimDeSemana || fazendoChuva;
        boolean FicaremCasa = fimDeSemana && fazendoChuva;

        int nota = 70;



        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resultado);
        System.out.println(vamosAPraia);
        System.out.println(nãoVamosAPraia);
        System.out.println(FicaremCasa);

        System.out.println(vamosAPraia);
        String mensagem = fimDeSemana? "é fim de semana" : "não é fim de semana";
        System.out.println(mensagem);
        if (nota >= 70) {
                System.out.println("aprovado");
        }else{
                System.out.println("reprovado");
        }


        int noota = 50;
        String graduação;

        if (noota >= 80){
            graduação = "A";
            System.out.println("graduação a");
        } else if (noota < 80 && noota >= 70){
            graduação = "B";
            System.out.println("graduação b");
        }else if (noota < 70 && noota >= 60){
            graduação = "C";
            System.out.println("graduação c");
        }else if (noota < 60 && noota >= 0){
            graduação = "D";
            System.out.println("graduação d");
        }else {
            graduação = null;
            System.out.println("nota inválida");
        }
        switch (graduação){
            case "A":
            case "B":
                System.out.println("aluno aprovado");
                break;
            case "C":
            case "D":
                System.out.println("reprovado");
                break;
            default:
                System.out.println("graduação inválida");
        }
        String apelido = "Jessé";
        System.out.println(apelido.toLowerCase());
        System.out.println(apelido.toUpperCase());
        System.out.println(apelido.length());

        String apelidoOutro = "Jessé";
        String apelidoOutro2 = "jessé";
        System.out.println(apelido.equals(apelidoOutro));
        System.out.println(apelido.equalsIgnoreCase(apelidoOutro2));

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale( "pt","BR");
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour()>=0 && agora.getHour()< 12){
            saudacao = "bom dia";
        } else if (agora.getHour()>= 12 && agora.getHour()<18) {
            saudacao = "boa tarde";
        }else if (agora.getHour()>= 18 && agora.getHour()<24) {
            saudacao = "boa noite";
        } else {
            saudacao = "olá";
        }
        System.out.println(hoje.getDayOfMonth());

        System.out.printf("olá, %s. Hoje é %s, %s. %n", nome, diaSemana,saudacao.toLowerCase());
        for (int i = 1; i<= 10; i ++){
            for (int j = 1; j <=10; j++){
                System.out.println(j +"x" + i + "=" + j*i);
            }
            //System.out.println(1*i);
        }
        int numero1 =1;
        int numero2 =2;
        int numero3 =3;
        int numero4 =4;
        int numero5 =5;

        int [] numeros = new int [5]; // array é imutável
        numeros [0] = 1;
        numeros [1] = 2;
        numeros [2] = 3;
        numeros [3] = 4;
        numeros [4] = 5;
        System.out.println(numeros);
        for (int i=0; i < numeros.length; i ++){
            System.out.println(numeros[i]);
        }
        String[] letras = {"A", "B", "C", "J", "X"};
        for (int i=0; i < letras.length; i++){
            System.out.println(letras[i]);
        }
        System.out.println(Arrays.toString(letras));
        int []num = {9,10,12,25,2};
        int maior = num [0];
        int menor = num [0];
        int media = 0;

        for (int i=0; i < num.length; i++){
            if(num[i]>maior){
                maior = num[i];
            }
            if(num[i]< menor){
                menor = numeros[i];
            }
            media +=num[i];
        }
        System.out.println("maior:" + maior);
        System.out.println("menor:" + menor);
        System.out.println("media:" + media/num.length);
        String nomeee = "Let's Code";
        saudacao(nomeee);
        int resultad = soma(2,3);
        System.out.println(resultad);
    }
    public static void saudacao(String nomeee){
        System.out.println("Hello,"+ nomeee);
    }
    public static int soma(int a, int b){
        return a+b;
    }
}