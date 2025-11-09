package Homework04.h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 22f;
        float fahrenheitFloat;
        double celsiusDouble = 22;
        double fahrenheitDouble;

        fahrenheitFloat = celsiusZuFahrenheitFloat(celsiusFloat);
        fahrenheitDouble = celsiusZuFahrenheitDouble(celsiusDouble);
        System.out.println(celsiusFloat + "°C in Fahrenheit (float): " + fahrenheitFloat + "°F");
        System.out.println(celsiusDouble + "°C in Fahrenheit (double): " + fahrenheitDouble + "°F");

    }

    public static float celsiusZuFahrenheitFloat(float celsius) {
        float fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
    public static double celsiusZuFahrenheitDouble(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
}
