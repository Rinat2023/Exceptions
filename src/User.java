public class User {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void checkAge(int age){
        try{
            if (age < 18){
                throw new AgeRestrictionException("пользователь НЕ соответствует возрастным требованиям");
            }
            else {
                System.out.println("пользователь соответствует возрастным требованиям");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getName (){
        return this.name;
    }
    public int getAge (){
        return this.age;
    }
}
