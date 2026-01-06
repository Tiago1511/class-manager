package eapli.base.teacherManagement.dto;

import eapli.framework.representations.dto.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DTO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {

        public String acronym;
        public String taxNumber;
        public String birthday;

}
