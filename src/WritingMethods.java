public class WritingMethods {
    public static void main(String[] args) {

        AddingShit.addingIntegers();
        AddingShit somethingAdded = new AddingShit();
        somethingAdded.anotherNumber= 5;
        System.out.println(somethingAdded.anotherNumber);

        AddingShit.adding();

        AddingShit.addingShit2();

        //Sneakers.bestPair();


        ShoeLaces sl1 = new ShoeLaces();
        sl1.color ="red";
        sl1.length = 32;

        Sneakers toDamnMany = new Sneakers(sl1);
        toDamnMany.Pairs = 85;


        System.out.println(toDamnMany.Pairs);
        System.out.println(toDamnMany.sl.color);
        System.out.println(toDamnMany.sl.length);


        MyClass myObj = new MyClass();
        System.out.println(myObj.x);



    }
}







