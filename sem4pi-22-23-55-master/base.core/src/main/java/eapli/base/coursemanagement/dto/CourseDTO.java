package eapli.base.coursemanagement.dto;

import eapli.base.coursemanagement.domain.Capacity;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.Edition;
import eapli.base.coursemanagement.domain.Status;
import eapli.framework.representations.dto.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DTO
@Data
@NoArgsConstructor
public class CourseDTO {

    public String code;
    public String title;
    public String description;
    public String edition;
    public Integer minCapacity;
    public Integer maxCapacity;
    public String status;

    public String acronym;
    public String taxNumber;

    public CourseDTO(String code, String title, String edition,String description, Integer minCapacity, Integer maxCapacity , String status, String acronym, String taxNumber) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
        this.status = status;
        this.acronym = acronym;
        this.taxNumber = taxNumber;
        this.edition = edition;
    }

    public CourseDTO(String code, String title, String edition, String description, Integer minCapacity, Integer maxCapacity , String status) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
        this.status = status;
        this.edition = edition;
    }

    public Course toEntity() {
        return new Course(title, code, new Edition(edition), description, new Capacity(minCapacity, maxCapacity), Status.valueOf(status));
    }
}
