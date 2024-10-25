public class Classroom {
    private Teacher teacher;
    private Student student;

    public Classroom(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
