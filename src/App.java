public class App {
    public static void main(String[]args){

        int [] TestArray1 = {4, 5, 6, 3, 7, 2};

        SimpleStuffs testObject = new SimpleStuffs();
        System.out.println(testObject.Addition(TestArray1));

        System.out.println(testObject.linearSearch(TestArray1, 6));


    }
}
