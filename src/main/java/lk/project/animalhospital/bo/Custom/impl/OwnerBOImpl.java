package lk.project.animalhospital.bo.Custom.impl;

import lk.project.animalhospital.bo.Custom.OwnerBO;
import lk.project.animalhospital.dao.DaoFactory;
import lk.project.animalhospital.dao.custom.OwnerDao;
import lk.project.animalhospital.model.Ownerdto;
import lk.project.animalhospital.entity.Owner;

import java.util.ArrayList;

public class OwnerBOImpl implements OwnerBO {

    OwnerDao ownerDao = (OwnerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.OWNER);
    @Override
    public ArrayList<Ownerdto> getAllOwner() throws Exception, ClassNotFoundException {
        ArrayList<Ownerdto> ownerdtos = new ArrayList<>();
        ArrayList<Owner> owners = ownerDao.getAll();
        for (Owner owner : owners) {
           ownerdtos.add(new Ownerdto(owner.getOwnerId(), owner.getOwnerName(), owner.getOwnerAddress(), owner.getOwnerMail()));
        }
        return ownerdtos;
    }
    @Override
    public boolean deleteOwners(String id) throws Exception, ClassNotFoundException {
        return ownerDao.delete(id);
    }

    @Override
    public boolean updateOwners(Ownerdto owner) throws Exception, ClassNotFoundException {
        return ownerDao.update(new Owner(
                owner.getOwnerId(), owner.getOwnerName(), owner.getOwnerAddress(), owner.getOwnerMail()
        ));
    }
}
