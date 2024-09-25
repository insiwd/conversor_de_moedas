    package com.insiwd;

    import com.insiwd.service.ConvertCurrency;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ConvertCurrency convertCurrency = new ConvertCurrency();

            boolean choice = true;
            while(choice) {
                System.out.println("""
                    1) Dólar -→ Peso Argentino
                    2) Peso Argentino -→ Dólar
                    3) Dólar -→ Real
                    4) Real -→ Dólar
                    5) Dólar -→ Peso Colombiano
                    6) Peso Colombiano -→ Dólar
                    7) Sair""");
                System.out.println();
                System.out.print("Digite sua escolha: ");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        convertCurrency.convert("USD", "ARS");
                        break;
                    case 2:
                        convertCurrency.convert("ARS", "USD");
                        break;
                    case 3:
                        convertCurrency.convert("USD", "BRL");
                        break;
                    case 4:
                        convertCurrency.convert("BRL", "USD");
                        break;
                    case 5:
                        convertCurrency.convert("USD", "COP");
                        break;
                    case 6:
                        convertCurrency.convert("COP", "USD");
                        break;
                    case 7:
                        choice = false;
                        break;
                }
            }


        }
    }