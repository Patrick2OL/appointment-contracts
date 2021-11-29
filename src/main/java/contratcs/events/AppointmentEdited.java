package contratcs.events;

import lombok.Value;

import java.time.Instant;
import java.time.LocalDate;

@Value
public class AppointmentEdited {
    String appointmentId;
    LocalDate startAt;
    LocalDate endAt;
    String type;
    String topic;
    String information;
    String userId;
    Instant occurredOn;
}
