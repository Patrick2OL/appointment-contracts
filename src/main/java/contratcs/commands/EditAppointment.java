package contratcs.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.LocalDate;

@Value
public class EditAppointment {
    @TargetAggregateIdentifier
    String appointmentId;
    LocalDate startAt;
    LocalDate endAt;
    String type;
    String topic;
    String information;
}
