package com.fedorenko.examples;
import javax.persistence.*;
import java.util.List;

@Entity
public class Lecturer {

    @Id
    @Column(name = "lecturerID")
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phoneNumber")
    private Phone phone;

    @OneToMany(mappedBy = "lecturer")
    private List<Science> sciences;

    @ManyToMany
    @JoinTable(
            name = "Students",
            joinColumns = @JoinColumn(name = "lecturerID"),
            inverseJoinColumns = @JoinColumn(name = "studentID"))
    private List<Student> students;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<Science> getSciences() {
        return sciences;
    }

    public void setSciences(List<Science> sciences) {
        this.sciences = sciences;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
