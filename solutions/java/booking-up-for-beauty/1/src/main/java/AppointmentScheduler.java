import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.*;
import java.util.Locale;

class AppointmentScheduler {


    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();
        System.out.println(scheduler.schedule("7/25/2019 13:45:00"));
        System.out.println(scheduler.hasPassed(scheduler.schedule("7/25/2019 13:45:00")));
        System.out.println(scheduler.isAfternoonAppointment(scheduler.schedule("7/25/2019 11:45:00")));
        System.out.println(scheduler.getDescription(scheduler.schedule("7/25/2019 10:45:00")));
        System.out.println(scheduler.getAnniversaryDate());
    }
    public LocalDateTime schedule(String appointmentDateDescription) {
        String[] date2 = appointmentDateDescription.split("[/: ]");
        LocalDateTime appointment = LocalDateTime.of(Integer.valueOf(date2[2]), Integer.valueOf(date2[0]), Integer.valueOf(date2[1]), Integer.valueOf(date2[3]), Integer.valueOf(date2[4]), Integer.valueOf(date2[5])); 
        return appointment;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return (appointmentDate.toLocalTime().isAfter(LocalTime.of(11,59,59)) && appointmentDate.toLocalTime().isBefore(LocalTime.of(18,00)));
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("EEEE',' MMMM d, yyyy', at' h:mm a'.'", Locale.ENGLISH );
        return "You have an appointment on " + printer.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
