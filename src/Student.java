public class Student {

    private String name; // let´s start with name
    private int age;
    private String gender;


    public Student (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String genderchange){
        this.gender = genderchange;
    }

    public String getGender() {
        return gender;
    }
}
