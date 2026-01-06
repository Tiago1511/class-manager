package eapli.base.ClassManagement.application.viaDTO;

import eapli.base.ClassManagement.DTO.ClassDTO;
import eapli.base.ClassManagement.domain.ClassBuilder;
import eapli.base.coursemanagement.domain.Capacity;
import eapli.base.coursemanagement.domain.Status;
import eapli.framework.representations.dto.DTOParser;
import eapli.base.ClassManagement.domain.Class;

public class ClassDTOParser implements DTOParser<ClassDTO, Class> {

    @Override
    public Class valueOf(ClassDTO dto) {
        return new ClassBuilder().build();
    }
}
