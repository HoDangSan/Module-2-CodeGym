import java.sql.Date;

public class SystemTime {
    public static void main(String[] args) {
        String str = "2017-09-11";
        // converting string into sql date
        Date date = Date.valueOf(str);
        System.out.println(date);


    }
}