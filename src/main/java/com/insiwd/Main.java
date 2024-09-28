    package com.insiwd;

    import java.util.Scanner;

    import com.insiwd.service.ConvertCurrency;

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
                    case 1 -> convertCurrency.convert("USD", "ARS");
                    case 2 -> convertCurrency.convert("ARS", "USD");
                    case 3 -> convertCurrency.convert("USD", "BRL");
                    case 4 -> convertCurrency.convert("BRL", "USD");
                    case 5 -> convertCurrency.convert("USD", "COP");
                    case 6 -> convertCurrency.convert("COP", "USD");
                    case 7 -> choice = false;
                }
            }


        }
    }