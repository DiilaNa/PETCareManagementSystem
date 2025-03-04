package lk.project.animalhospital.model.PetTm;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PetRecordTM {
    private String recordId;
    private String status;
    private String description;
    private double weight;
    private String petID;
}
