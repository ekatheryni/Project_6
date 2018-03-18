package com.fedorenko.examples;
import javax.persistence.*;

@Entity
public class Science {

        @Id
        private long id;

        @ManyToOne(fetch = FetchType.LAZY)
        private Lecturer lecturer;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public Lecturer getLecturer() {
            return lecturer;
        }

        public void setLecturer(Lecturer lecturer) {
            this.lecturer = lecturer;
        }

}
