package Lecture_13;

//Create class Person which has the following attributes: name, sex, religion, language spoken, job, nationality, EGN, date of birth, age, country of residence.
//The date of birth attribute and age are composed during the creation of an object based on the EGN.
//EGN consists of 10 digits. If provided value for EGN or sex are not correct throw exception.
//If wrong sex is provided program must continue its normal execution with printing relevant message.
//Only job and country of residence could change their values. All other attributes can`t be changes once they are set.
//Hint: EGN validation should be limited to consisting 10 digits only, nothing more.
//Use only EGN with year in range 1900-1999

//The Person class should have methods –sayHello(), celebrateEaster(), isAdult(), canTakeLoan() with the relevant parameters if any.
//sayHello() should print Hello based on concrete person spoken language, default is in English.
//celebrateEastershould print if the concrete person celebrates Easter based on their religion.
//isAdultshould take in consideration the country of residence.
//canTakeLoanis based on the job.
//Languages –Bulgarian / Italian / English;Countries –Bulgaria (18) / Italy (18) / USA (21);Sex –Male / Female
//Religions –Orthodox / Catholic / Islam

//Create 4 classes Child, Bulgarian, American and Italian which inherit Person class
//Use polymorphism to change the implementation of the methods that need different behavior.
//Implement new methods specific only for the concrete class.
//Create different objects in the main class and use their methods.

public class Exercise_01 {
}
