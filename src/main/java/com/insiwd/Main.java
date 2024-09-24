    package com.insiwd;

    import com.insiwd.CurrencyDto.CurrencyDto;
    import com.insiwd.service.CurrencyService;

    import java.io.IOException;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            CurrencyService currencyService = new CurrencyService();


            boolean choice = true;
            while(choice) {
                System.out.println("""
                    1) Dólar -→ Peso Argentino
                    2) Peso Argentino → Dólar
                    3) dólar → real
                    4) real → dólar
                    5) dólar → peso colombiano
                    6) peso colombiano → dólar
                    7) sair""");
                System.out.print("Digite sua escolha: ");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.print("Digite o valor que deseja converter: ");
                        Double value = sc.nextDouble();
                        try {
                            CurrencyDto currencyDto = currencyService.getCurrency("USD");
                            Double currencyARS = currencyDto.getConversionRates().get("ARS");

                            Double convertedValue = value * currencyARS;
                            System.out.printf("O Valor %.2f [" + currencyDto.getBase_code() + "] corresponde ao valor final de: %.2f [ARS]", value, convertedValue);
                        } catch (IOException | InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    case 7:
                        choice = false;
                        break;
                }
            }


        }
    }