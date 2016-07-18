import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Victoria
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Appointment> appointment = new ArrayList<Appointment>();

        Appointment appt = new Appointment(2015, 9, 27, "Dentist Appointment");
        boolean answer = true;

        appointment.add(new OneTime(2015, 10, 31, "You have an appointment with a client."));
        appointment.add(new Daily(2015, 10, 31, "You have an appointment with your team."));
        appointment.add(new Monthly(2016, 1, 1, "You have an appointment with your project manager."));

        System.out.println("Would you like to add an appointment? (Y/N)");
        if(scan.next().equalsIgnoreCase("y"))
        {
            answer = true;
        }
        else
        {
            answer = false;
        }

        while(answer == true)
        {
            System.out.println("Is you appointment daily(d), monthly(m) or one time(o)?");
            String ans = scan.next();

            System.out.println("Enter the description of your appointment: ");
            scan.nextLine();
            String description = scan.nextLine();            
            
            System.out.println("Enter the month of your appointment: ");
            int month = scan.nextInt();
            
            System.out.println("Enter the day of your appointment: ");
            int day = scan.nextInt();

            System.out.println("Enter the year of your appointment: ");
            int year = scan.nextInt();


        if(ans.equalsIgnoreCase("d"))
        {
            appt = new Daily(year, month, day, description);
        }

        else if(ans.equalsIgnoreCase("m"))
        {
            appt = new Monthly(year, month, day, description);
        }

        else if(ans.equalsIgnoreCase("o"))
        {
            appt = new OneTime(year, month, day, description);
        }

        else
        {
            System.out.println("Invalid Answer");
        }

        appointment.add(appt);

        System.out.println("Do you want to continue to add new appointments? (Y/N)");

        String res = scan.next();

        if(res.equalsIgnoreCase("y"))
        {
            answer = true;
        }

        else
        {
            answer = false;
        }
        }

        System.out.println("Enter the date to list the appointments you have for that day. ");
        System.out.println("Enter the month ");
        int apptMonth = scan.nextInt();

        System.out.println("Enter the day ");
        int apptDay = scan.nextInt();

        System.out.println("Enter the year ");
        int apptYear = scan.nextInt();

        for(int i = 0; i < appointment.size(); i++)
        {
            if(appointment.get(i).occursOn(apptYear, apptMonth, apptDay))
            {
                System.out.println("You have the following appointments: " + appointment.get(i).description);
            }
        }
    }
}
