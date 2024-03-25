package service;

import dao.PersonDao;
import domain.Person;

import java.util.List;

public class PersonService {
    private PersonDao dao = new PersonDao();

    public Person selectOne(Integer pid) {
        return dao.selectOne(pid);
    }

    public List<Person> selectAll() {
        return dao.selectAll();
    }
}
