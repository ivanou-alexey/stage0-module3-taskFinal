package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double a = 5 / 9;
        double temperatureFahrenheit = temperatureCelsius * a + 32;
        System.out.println(temperatureFahrenheit);
    }
}
