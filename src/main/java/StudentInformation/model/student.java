package main.java.StudentInformation.model;

public class student {
    Integer studentId;
    String firstName;
    String lastName;
    Integer age;
    Integer year;

    public void student(Integer studentId, String firstName, String lastName, Integer age, Integer year){
      this.studentId = studentId;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.year = year;
    }

    public Integer getStudentId(){
      return studentId;
    }

    public String getFirstName() {
      return firstName;
    }
    public String getLastName(){ return lastName;}

    public Integer getAge(){ return age;}

    public Integer getYear(){ return year;}

    public void setStudentId(Integer studentId){
      this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public void setLastName(String lastName){ this.lastName = lastName;}

    public void setAge(Integer age){ this.age = age;}

    public void setYear(Integer year){ this.year = year;}

}
