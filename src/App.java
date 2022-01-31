import java.time.temporal.Temporal;

public class App {


    public static void main(String[] args) {
/*
        int [] TestArray1 = {4, 5, 6, 3, 7, 2, 9};
        SimpleStuffs testObject = new SimpleStuffs();
        System.out.println(testObject.Addition(TestArray1));
        System.out.println(testObject.linearSearch(TestArray1, 6));
 */

/*
        String[] array = {"a", "a", "k", "m", "a", "a", "k", "m", "a", "k", "d", "a" };
        int[] array1 = {2, 1, 3, 5, 4};
        int[] array4 = {1, 3, 4, 2, 5};
        Test myTest = new Test();
        System.out.println(myTest.solution(array));
        System.out.println(myTest.solution(array4));
*/

        Student John = new Student("John Meyer", 45, "Male", 95);
        Student Peter = new Student("Peter Pan", 15, "Male", 55);
        Student Mary = new Student("Mary Jane", 22, "Female", 99);


        John.setAge(46);
        Peter.setAge(16);

        //System.out.println("I am " + John.getAge() + " years old");
        //System.out.println("I am on the other hand " + Peter.getAge() + " years old");

        //System.out.println("I am Peter and I am so far a " + Peter.getGender());
        //Peter.setGender("Female");
        //System.out.println("*********************************************");
        //System.out.println("You know what I am still Peter but surprise I am not longer a Dude, now I am a " + Peter.getGender());

        Student[] Group1 = {John, Peter, Mary};

        //System.out.println("My name is " + Peter.getName() + " and I got " + Peter.getMathgrade() + " in Math last year");
        //System.out.println("My name is " + John.getName() + " and it is " + John.MathIMadeItOrNot() + " that I passed Math");


        int [] TestArray1 = {4, 5, 6, 3, 7, 2, 9};

        for (int i = 0; i<TestArray1.length; i++){
            System.out.println(TestArray1[i]);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        for (int number : TestArray1){
            System.out.print(number);
        }

    }
}

