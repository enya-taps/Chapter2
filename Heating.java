
/**
 * Beschreiben Sie hier die Klasse Heating.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Heating
{
    private double temperature;
    private double min;
    private double max;
    private double steps;

    public Heating(double minimum,double maximum){
        temperature = 15.0;
        steps = 10.0;
        min = minimum;
        max = maximum;
    }

    public void settemp(int step){
        if(step>0){
            steps = step;
        }
    }

    public void warmer(){
        if(temperature + steps < max){
            temperature +=steps;
        }
    }

    public void colder(){
        if(temperature - steps > min){
            temperature-=steps;
        }
    }

    public double givetemp(){
        return temperature;
    }

}
