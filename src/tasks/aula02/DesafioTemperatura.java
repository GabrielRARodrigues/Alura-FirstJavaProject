package tasks.aula02;

public class DesafioTemperatura {

    public static void main(String[] args) {

       double temperaturaEmCelsius = 30;
        double temperaturaEmFahrenheit = temperaturaEmCelsius * 1.8 + 32;

        String mensagem = """
                A temperaura %.2f graus Celsius em Fahrenheit é %.2f
                """.formatted(temperaturaEmCelsius, temperaturaEmFahrenheit );
        System.out.println(mensagem);

        int temperaturaEmFahrenheitSemCasasDecimais = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit sem casas decimais é " + temperaturaEmFahrenheitSemCasasDecimais);
    }

}
