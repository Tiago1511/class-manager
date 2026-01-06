package eapli.base.coursemanagement.domain;

import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.representations.dto.DTOable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Course implements AggregateRoot<String>, DTOable<CourseDTO> {
    @Id
    private String code;

    /**
     * title of the course
     */
    @Column(name="title", nullable=false)
    private String title;

    @Column(nullable=false)
    private String description;

    /**
     * teachers of the course
     */
    @ManyToMany
    private Set<Teacher> teacher = new HashSet<>();

    /**
     * head teacher of the course
     */
    @OneToOne
    @JoinColumn(name = "headTeacher", referencedColumnName = "acronym")
    private Teacher headTeacher;

    /**
     * status of the course
     */
    @Enumerated(EnumType.STRING)
    private Status status;

    /**
     * capacity of the course
     */
    private Capacity capacity;

    @Column(nullable=false)
    private Edition edition;

    /*@ManyToMany(
            cascade = {CascadeType.ALL},
            fetch = FetchType.EAGER)
    private List<SystemUser> participants;
*/

    protected Course() {}

    protected Course(final String code, final String title, final String description, final Teacher headTeacher, final Capacity capacity) {
        if ( !validCode(code) || !validTitle(title))
            throw new IllegalArgumentException("Invalid arguments");
        this.code = code;
        this.title = title;
        this.description = description;
        this.headTeacher = headTeacher;
        this.capacity = capacity;
        this.status = Status.CLOSE;
        this.teacher = null;
    }

    public Course( String title, String code, Edition edition, String description) {
        if ( !validCode(code) || !validTitle(title))
            throw new IllegalArgumentException("Invalid arguments");
        this.headTeacher = null;
        this.title = title;
        this.code = code;
        this.description = description;
        this.status = Status.CLOSE;
        this.capacity = null;
        this.teacher = null;
        this.edition = edition;
    }

    public Course( String title, String code, Edition edition, String description, Status status) {
        if ( !validCode(code) || !validTitle(title))
            throw new IllegalArgumentException("Invalid arguments");
        this.headTeacher = null;
        this.title = title;
        this.code = code;
        this.description = description;
        this.status = status;
        //this.capacity = null;
        this.teacher = null;
        this.edition = edition;
    }

    public Course( String title, String code, Edition edition, String description, Capacity capacity) {
        if ( !validCode(code) || !validTitle(title))
            throw new IllegalArgumentException("Invalid arguments");
        this.headTeacher = null;
        this.title = title;
        this.code = code;
        this.description = description;
        this.status = Status.CLOSE;
        this.capacity = capacity;
        this.teacher = null;
        this.edition = edition;
    }

    public Course( String title, String code, Edition edition, String description, Capacity capacity, Status status) {
        if ( !validCode(code) || !validTitle(title))
            throw new IllegalArgumentException("Invalid arguments");
        this.headTeacher = null;
        this.title = title;
        this.code = code;
        this.description = description;
        this.status = status;
        this.capacity = capacity;
        this.teacher = null;
        this.edition = edition;
    }

    public Course( String title, String code, Edition edition, String description, Capacity capacity, Status status, Teacher headTeacher) {
        if ( !validCode(code) || !validTitle(title))
            throw new IllegalArgumentException("Invalid arguments");
        this.headTeacher = headTeacher;
        this.title = title;
        this.code = code;
        this.description = description;
        this.status = status;
        this.capacity = capacity;
        this.teacher = null;
        this.edition = edition;
    }

    public Course(String title, String code, Edition edition, String description, Capacity capacity, Status status, Teacher headTeacher, Set<Teacher> teacher) {
        if ( !validCode(code) || !validTitle(title))
            throw new IllegalArgumentException("Invalid arguments");
        this.headTeacher = headTeacher;
        this.title = title;
        this.code = code;
        this.description = description;
        this.status = status;
        this.capacity = capacity;
        this.teacher = teacher;
        this.edition = edition;
    }

    @Override
    public boolean sameAs(Object other) {
        if(!(other instanceof Course)){
            return false;
        }

        if (this == other) {
            return true;
        }

        final Course that = (Course) other;

        return identity().equals(that.identity()) && title.equals(that.title) && description.equals(that.description) && status.equals(that.status) && capacity.equals(that.capacity);
        // return identity().equals(that.identity()) && teacher.equals(that.teacher) && headTeacher.equals(that.headTeacher) && title.equals(that.title) && description.equals(that.description) && status.equals(that.status) && capacity.equals(that.capacity);
    }

    @Override
    public boolean equals(final Object o){
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public String identity() {
        return this.code;
    }

    /*public void changeCapacityInfoTo(final Capacity capacity) {
        if (capacity == null) {
            throw new IllegalArgumentException("Capacity should not be null");
        }
        this.capacity = capacity;
    }

    public void changeStatusInfoTo(Status status) {
        if (status == null) {
            throw new IllegalArgumentException("Status should not be null");
        }
        this.status = status;
    }

    public Capacity currentCapacity() {
        return this.capacity;
    }*/

    public CourseDTO toDTO() {
        return new CourseDTO(code, title, edition.edition(), description, capacity.minCapacity(), capacity.maxCapacity(), status.toString(), headTeacher.acronym().toString(), headTeacher.taxNumber().toString());
    }

    /*public boolean isClosed() {
        return this.status.equals(Status.CLOSE);
    }*/

    public Status status( Status status) {
        return this.status = status;
    }

    public Status status( ) {
        return this.status;
    }

    public String code(){return this.code;}

    public String title() {
        return this.title;
    }
    public CourseDTO toDTOClose() {
        return new CourseDTO(code, title, edition.edition(), description, capacity.minCapacity(), capacity.maxCapacity(), status.open().toString(), headTeacher.acronym().toString(), headTeacher.taxNumber().toString());
    }

    public Boolean validCode(String code) {
        return !code.isEmpty();
    }

    public Boolean validTitle(String title) {
        return !title.isEmpty();
    }

    public Set<Teacher> getTeacher() {
        return teacher;
    }

/* public boolean addTeacher(Teacher teacher){
        return this.teacher.add(teacher);
    }*/

}
