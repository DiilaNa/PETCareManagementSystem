package gdse71.project.animalhospital.dao;

import gdse71.project.animalhospital.dao.custom.impl.*;

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
        PET, PET_RECORD,OWNER,PAYMENT,INVOICE,SALARY,SERVICE,SMS,MEDICINE, MEDICINE_DETAILS,JOIN,EMPLOYEE,DOC_DETAIL
    }
    public SuperDAO getDao(DaoType Type) {
        switch (Type) {
            case PET:
                return new PetDaoImpl();
                case PET_RECORD:
                    return new PetRecordImpl();
                    case OWNER:
                        return new OwnerDAOImpl();
                        case PAYMENT:
                            return new PaymentDAOImpl();
                            case INVOICE:
                                return new InvoiceDAOImpl();
                                case SALARY:
                                    return new SalaryDAOImpl();
                                    case SERVICE:
                                        return new ServiceDAOImpl();
                                        case SMS:
                                            return new SmsDAOImpl();
                                            case MEDICINE:
                                                return new MedicineDAOImpl();
                                                case MEDICINE_DETAILS:
                                                    return new MedicineDetailsDAOImpl();
                                                    case JOIN:
                                                        return new QuerryDAOImpl();
                                                        case EMPLOYEE:
                                                            return new EmployeeDAOImpl();
                                                            case DOC_DETAIL:
                                                                return new DocDetailDAOImpl();
                default:
                    return null;
        }

    }

}
