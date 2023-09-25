import java.util.*;
import java.text.*;

public class Time_Convertion_by_Country {

    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        String ids[] = TimeZone.getAvailableIDs();

        for(String id:ids)
        {
            System.out.println(id);
        }
        String format = "dd-mm-yyyy hh:mm:ss a";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date dt = new Date();

        String defaultTZ = TimeZone.getDefault().getID();
        System.out.println("\nDefault TimeZone " +defaultTZ);

        Calendar cal = new GregorianCalendar();
        cal.setTime(dt);
        
        System.out.println("Date "+dateFormat.format(cal.getTime()));
        System.out.println("TimeZone "+cal.getTimeZone().getID());
        System.out.println("TimeZone name: "+cal.getTimeZone().getDisplayName());

        String s;
        System.out.print("Enter the timezone : ");
        s = in.next();
        TimeZone jnbTZ = TimeZone.getTimeZone(s);
        SimpleDateFormat jnbFormat = new SimpleDateFormat(format);
        jnbFormat.setTimeZone(jnbTZ);

        cal.setTimeZone(jnbTZ);

        System.out.println("**********************\n");
        System.out.println("After Conversion");
        System.out.println("Date "+jnbFormat.format(cal.getTime()));
        System.out.println("TimeZone "+cal.getTimeZone().getID());
        System.out.println("TimeZone name: "+cal.getTimeZone().getDisplayName());

        in.close();
    }
}
