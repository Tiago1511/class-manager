package eapli.base.studentManagement.dto;

import eapli.framework.representations.dto.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DTO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
private String mecanographicNumber;
private String taxNumber;
private String birthday;


}
