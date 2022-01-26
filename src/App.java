public class App {
    public static void main(String[]args){
/*
        int [] TestArray1 = {4, 5, 6, 3, 7, 2, 9};
        SimpleStuffs testObject = new SimpleStuffs();
        System.out.println(testObject.Addition(TestArray1));
        System.out.println(testObject.linearSearch(TestArray1, 6));
 */
        Student John = new Student("John Meyer", 45, "Male");
        Student Peter = new Student("Peter Pan", 15, "Male");
        Student Mary = new Student("Mary Jane", 22, "Female");

        John.setName("John Pan");
        //System.out.println("I am " + John.getAge() + " years old");
        //System.out.println("I am on the other hand " + Peter.getAge() + " years old");

        John.setAge(46);
        Peter.setAge(16);

        //System.out.println("I am " + John.getAge() + " years old");
        //System.out.println("I am on the other hand " + Peter.getAge() + " years old");

        System.out.println("I am Peter and I am so far a " + Peter.getGender());
        Peter.setGender("Female");


        System.out.println("*********************************************");

        System.out.println("You know what I am still Peter but surprise I am not longer a Dude, now I am a " + Peter.getGender());

    }
}

