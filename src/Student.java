public class Student {

    private String name; // let´s start with name
    private int age;
    private String gender;
    private int Mathgrade = 100;


    public Student (String name, int age, String gender, int Mathgrade){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.Mathgrade =  Mathgrade;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String genderchange){
        this.gender = genderchange;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getMathgrade() {
        return Mathgrade;
    }

    public void setMathgrade(int mathgrade) {
        Mathgrade = mathgrade;
    }

   public boolean MathIMadeItOrNot(){
        if (this.getMathgrade() > 60){
            return true;
        }else {
            return false;
        }
   }
}
