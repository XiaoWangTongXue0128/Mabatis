package service;

import dao.IDCardDao;
import domain.IDCard;

import java.util.List;

public class IDCardService {
    private IDCardDao dao = new IDCardDao();

    public IDCard selectOne(String id) {
        return dao.selectOne(id);
    }
    public List<IDCard> selectAll() {
        return dao.selectAll();
    }
}
