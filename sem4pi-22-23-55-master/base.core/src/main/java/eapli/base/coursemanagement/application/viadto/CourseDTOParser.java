package eapli.base.coursemanagement.application.viadto;

import eapli.base.coursemanagement.domain.*;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.teacherManagement.repositories.TeacherRepository;
import eapli.framework.representations.dto.DTOParser;

public class CourseDTOParser implements DTOParser<CourseDTO, Course> {

   /* private final CourseRepository courserepository;

   public CourseDTOParser(final CourseRepository courserepository) {
        this.courserepository = courserepository;
    }*/

    private final TeacherRepository teacherRepository = PersistenceContext.repositories().teachers();
    @Override
    public Course valueOf(CourseDTO dto) {

        final Teacher teacher = teacherRepository.ofIdentity(new Acronym(dto.getAcronym())).orElseThrow(() -> new IllegalArgumentException("Unknown Head Teacher: " + dto.getAcronym()));

        return new CourseBuilder().ofType(teacher).code(dto.code).title(dto.title).edition(new Edition(dto.edition)).description(dto.description).capacity(new Capacity(dto.minCapacity, dto.maxCapacity)).status(Status.valueOf(dto.status)).build();
    }
}
