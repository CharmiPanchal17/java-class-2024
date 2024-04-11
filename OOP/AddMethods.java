public class AddMethods {
    
    public void goodMorning(){
        System.out.println("Good Morning.");
    }

    public void goodAfternoon(){
        System.out.println("Good Afternoon.");
    }

    public void goodEvening(){
        System.out.println("Good Evening.");
    }

    public static void main(String[] args) {
        
        AddMethods greet1 = new AddMethods();  //without creating any constructor, by defalut there will always be a constructor with the same name as the class 

        greet1.goodMorning();
        greet1.goodAfternoon();
        greet1.goodEvening();
    }

    
    
}
