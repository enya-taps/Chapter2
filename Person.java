
/**
 * Beschreiben Sie hier die Klasse Person.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Person
{
    private String name;
    private String nummer;
    private int alter;
    private int kreditrahmen;
    
    public Person( String meinName, int meinAlter){
        name = meinName;
        alter = meinAlter;
    }
    
    public int getAge(){
        return alter;
    }
    
    public void setAge(int age){
        alter = age;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String noma){
        name = noma;
    }
    
    public void givedetails(){
        System.out.println("Mein Name ist: " +name);
    }
}
