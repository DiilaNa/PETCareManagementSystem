package lk.project.animalhospital.model.PetTm;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ViewAppointmentTM {
    private String appointmentId;
    private String Date;
    private String Time;
    private String petId;
    private String payID;
    private String Status;

}
