package gdse71.project.animalhospital.bo.Custom;

import gdse71.project.animalhospital.bo.SuperBO;
import gdse71.project.animalhospital.dto.DocDetailsDto;
import gdse71.project.animalhospital.dto.Employeedto;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeBO extends SuperBO {
    ArrayList<Employeedto> getALLEmployees() throws Exception;
    boolean saveEmployee(List<Employeedto>employeedtos, List<DocDetailsDto>docDetailsDtos) throws Exception;
}
