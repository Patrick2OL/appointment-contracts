package contratcs.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.Instant;
import java.time.LocalDate;

@Value
public class RegisterAppointment {
    @TargetAggregateIdentifier
    String appointmentId;
    LocalDate startAt;
    LocalDate endAt;
    String type;
    String topic;
    String information;
}
