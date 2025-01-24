package gdse71.project.animalhospital.dao;

import gdse71.project.animalhospital.dao.custom.PetDao;
import gdse71.project.animalhospital.dao.custom.impl.PetDaoImpl;
import gdse71.project.animalhospital.dao.custom.impl.PetRecordImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory() {

    }
    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    public enum DaoType {
        PET,PETRECORD
    }
    public SuperDAO getDao(DaoType Type) {
        switch (Type) {
            case PET:
                return new PetDaoImpl();
                case PETRECORD:
                    return new PetRecordImpl();
                default:
                    return null;
        }

    }

}
