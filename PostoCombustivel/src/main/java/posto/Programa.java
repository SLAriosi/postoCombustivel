package posto;
import posto.combustiveis.Diesel;
import posto.combustiveis.Etanol;
import posto.combustiveis.Gasolina;
import java.util.Random;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        var gasolina = new Gasolina();
        var etanol = new Etanol();
        var diesel = new Diesel();
        gasolina.setPrecoLitro(5.00F);
        etanol.setPrecoLitro(3.00F);
        diesel.setPrecoLitro(6.00F);
        String escolha3 = "";

        do {
            String escolha = "";

            System.out.println("Bem vindo ao nosso Posto de Gasolina");

            System.out.println("Com qual combustivel deseja abastecer o seu veiculo? ");
            System.out.println("Gasolina (G) $5,00L");
            System.out.println("Etanol(E) $3,00L");
            System.out.println("Diesel (D) $6,00L");
            escolha = s.next();
            var tipo = 0;

            switch (escolha) {
                case "G":
                    System.out.println("Digite 1 para quantos litros você deseja?");
                    System.out.println("Digite 2 para quantos reais você deseja?");
                    tipo = s.nextInt();

                    if (tipo == 1) {

                        System.out.println("Quantos litros?");
                        var qtLitros = s.nextFloat();
                        var valorGasolina = gasolina.getPrecoLitro();
                        var valorLitros = valorGasolina * qtLitros;
                        System.out.println("Você terá que pagar R$ " + valorLitros);
                        System.out.println("Por " + qtLitros + " litros.");
                    } else {
                        System.out.println("Quantos reais?");
                        var qtReais = s.nextFloat();
                        var valorGasolina = gasolina.getPrecoLitro();
                        var valorLitros = qtReais / valorGasolina;
                        System.out.println("Você terá que pagar R$ " + qtReais);
                        System.out.println("Por " + valorLitros + " litros.");
                    }
                    break;
                case "E":
                    System.out.println("Digite 1 para quantos litros você deseja?");
                    System.out.println("Digite 2 para quantos reais você deseja?");
                    tipo = s.nextInt();

                    if (tipo == 1) {

                        System.out.println("Quantos litros?");
                        var qtLitros = s.nextFloat();
                        var valorEtanol = etanol.getPrecoLitro();
                        var valorLitros = valorEtanol * qtLitros;
                        System.out.println("Você terá que pagar R$ " + valorLitros);
                        System.out.println("Por " + qtLitros + " litros.");
                    } else {
                        System.out.println("Quantos reais?");
                        var qtReais = s.nextFloat();
                        var valorEtanol = etanol.getPrecoLitro();
                        var valorLitros = qtReais / valorEtanol;
                        System.out.println("Você terá que pagar R$ " + qtReais);
                        System.out.println("Por " + valorLitros + " litros.");
                    }
                    break;
                case "D":
                    System.out.println("Digite 1 para quantos litros você deseja?");
                    System.out.println("Digite 2 para quantos reais você deseja?");
                    tipo = s.nextInt();

                    if (tipo == 1) {
                        System.out.println("Quantos litros?");
                        var qtLitros = s.nextFloat();
                        var valorDiesel = diesel.getPrecoLitro();
                        var valorLitros = valorDiesel * qtLitros;

                        System.out.println("Você terá que pagar R$ " + valorLitros);
                        System.out.println("Por " + qtLitros + " litros.");
                    } else {
                        System.out.println("Quantos reais?");
                        var qtReais = s.nextFloat();
                        var valorDiesel = diesel.getPrecoLitro();
                        var valorLitros = qtReais / valorDiesel;
                        System.out.println("Você terá que pagar R$ " + qtReais);
                        System.out.println("Por " + valorLitros + " litros.");
                    }
                    break;
                default:
                    System.out.println("Escolha entre as opções existentes (G), (D), (E)");
                    break;
            }

            Random random = new Random();
            var bomba = random.nextInt(4);
            System.out.println("Como deseja pagar, Débito, Credito ou Pix ? (D) (C) (P)");
            String escolha2 = s.next();

            switch (escolha2) {
                case "D":
                    System.out.println("Você escolheu Débito!");
                    System.out.println("O abastecimento foi feito na bomba: " + bomba);
                    break;

                case "C":
                    System.out.println("Você escolheu Crédito!");
                    System.out.println("O abastecimento foi feito na bomba: " + bomba);
                    break;

                case "P":
                    System.out.println("Você escolheu Pix!");
                    System.out.println("O abastecimento foi feito na bomba: " + bomba);
                    break;
            }

            System.out.println("Pagamento realizado!");
            System.out.println("Deseja retornar ao inicio? (S), (N)");
            escolha3 = s.next();
        }while(escolha3.equals("S"));
    }
}
