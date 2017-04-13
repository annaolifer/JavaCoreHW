package Module6.Task4;


public class CitizenMain {

    public static void main(String[] args) {

        Citizen englishman = CitizenFactory.englishman();
        Citizen chinese = CitizenFactory.chinese();
        Citizen russian = CitizenFactory.russian();
        Citizen italian = CitizenFactory.italian();

        englishman.sayHello();
        chinese.sayHello();
        russian.sayHello();
        italian.sayHello();

    }
}
