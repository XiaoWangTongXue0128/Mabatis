package test;

import domain.IDCard;
import domain.Person;
import service.IDCardService;
import service.PersonService;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
/*
        PersonService service = new PersonService();
//        Person person = service.selectOne(1);
//        System.out.println(person);
        List<Person> personList = service.selectAll();
        for (Person person : personList) {
            System.out.println(person.getPid()+":"+person.getPname()+":"+person.getCardid());
        }

 */


        //-----------------------------------------
        IDCardService service = new IDCardService();
//        IDCard idCard = service.selectOne("110000200001010101");
//        System.out.println(idCard);

        List<IDCard> cardList = service.selectAll();
        for (IDCard card : cardList) {
            System.out.println(card);
        }
    }
}
