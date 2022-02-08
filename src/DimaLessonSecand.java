public class DimaLessonSecand {

    public static void main(String[] args) {
        double fahrenheitTemperature = 77;
        double celsiusTemperature = (5.0 / 9.0) * (fahrenheitTemperature - 32);
        System.out.println( "For fahrenheit Temperature " + fahrenheitTemperature + " celsius Temperature is:"
                + celsiusTemperature );


        double celsiusTemperature1 = 25;
        double fahrenheitTemperature1 = (celsiusTemperature1 * 9.0/5.0) + 32;
        System.out.println( "For celsius Temperature1" + celsiusTemperature1 + " fahrenheit Temperature1 is:" + fahrenheitTemperature1);

    double celsius = 55;
    double kelvin = celsius + 273.15;
        System.out.println("For celsius" + celsius + " kelvin is:"+ kelvin);

        double meters = 10;
        double inches = meters * 39.37;
        System.out.println("For meters: " + meters + " inches is:" + inches);
        inches = 299;
        meters = 0.0254 * inches;
        System.out.println("For inches: " + inches + " meters is: " + meters);

        double miles = 10;
        double kilometres = miles * 1.60934;
        System.out.println("For miles:" + miles + "kilometres is: " + kilometres);
        kilometres = 10;
        miles = kilometres * 0.621371;
        System.out.println("For kilometres: " + kilometres + "miles is: " + miles);

        double kilograms = 30;
        double pounts = 0.453592 * kilograms;
        System.out.println("For kilograms: " +kilograms+ " pounts is:" + pounts);
        pounts = 28;
        kilograms = 2.20462 * pounts;
        System.out.println("For pounts: " + pounts + "kilograms is: " + kilograms);

        double speedKilometresHour = 120;
        double speedMilesHour = speedKilometresHour * 0.621369647819285;
        System.out.println("For speedKilometresHour: " + speedKilometresHour + "speedMilesHour is: " + speedMilesHour);

        speedMilesHour = 70;
        speedKilometresHour = speedMilesHour * 1.60934;
        System.out.println("For speedKilometresHour: " + speedKilometresHour + " speedMilesHour is:" + speedMilesHour);

        int total = 10;
        int marked = 8;
        int results = 8*100/10;
        System.out.println("total: " + total + " marked: " + marked + " results: " + results + " percentage");

        int man = 35;
        int women = 35;

        boolean mortgage = man < 35 & women < 35;
        System.out.println(mortgage);

        int income = 20000;
        boolean mortgage1 = 20000 > income ^ income < 50000;

        System.out.println(mortgage1);

        int a = 0;
        int b = 1;
        boolean c= ( a ^ b ) > 0 ;
        System.out.println(c);



    }



}
