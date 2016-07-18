/**
 *
 * @author Victoria
 */
public class Appointment {
    public String description;
    private int month;
    private int day;
    private int year;
    
    public Appointment(int year, int month, int day, String description)
    {
        this.month = month;
        this.day = day;
        this.year = year;
        this.description = description;
    }

    public String toString()
    {
        return description;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }

    public int getYear()
    {
        return year;
    }

    public boolean occursOn(int year, int month, int date)
    {
        if(this.year == year && this.month == month && this.day == date)
        {
            return true;
        }
        return false;
    }

}
