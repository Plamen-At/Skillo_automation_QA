package Lecture_13;

public class Bulgarian extends Person {

    public Bulgarian(String EGN, String sex, String name, String religion, String languageSpoken, String job, String nationality, String countryOfresidence) {
        super(EGN, sex, name, religion, languageSpoken, job, nationality, countryOfresidence);
    }
    @Override
    void favouriteMeal() {
        System.out.println("Обичам баничка с боза.");
    }


}


//    public static void main(String[] args) {
//        Person Bulgarian = new Person(
//                "9502218086",
//                "male",
//                "Ivan",
//                "Orthodox",
//                "Bulgarian",
//                "Building construction",
//                "Bulgarian",
//                "Bulgaria");
//
//        System.out.println("Print date of birth: " + Bulgarian.getDateOfBirth());
//        Bulgarian.sayHello();
//        Bulgarian.celebrateEaster();
//        Bulgarian.isAdult();
//        System.out.println("Can " + Bulgarian.getName() + " take a loan: " + Bulgarian.canTakeLoan());
//    }

