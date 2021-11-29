package contratcs.events;

import lombok.Value;

import java.time.Instant;
import java.time.LocalDate;

@Value
public class AppointmentRegistered {
    String appointmentId;
    LocalDate startAt;
    LocalDate endAt;
    String type;
    String topic;
    String information;
    Instant occurredOn;
}
