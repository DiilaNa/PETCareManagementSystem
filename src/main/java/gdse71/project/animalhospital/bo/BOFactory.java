package gdse71.project.animalhospital.bo;

import gdse71.project.animalhospital.bo.Custom.PetBO;
import gdse71.project.animalhospital.bo.Custom.impl.*;

public class BOFactory{
    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getInstance(){
        if(boFactory == null){
            boFactory = new BOFactory();
        }
        return boFactory;
    }
    public enum BOType{
        PET,PETRECORD,OWNER,PAYMENT,INVOICE
    }
    public SuperBO getBO(BOType type){
        switch (type){
            case PET:
                return new PetBOImpl();
                case PETRECORD:
                    return new PetRecordBOImpl();
                        case OWNER:
                            return new OwnerBOImpl();
                            case PAYMENT:
                                return new PaymentBOImpl();
                                case INVOICE:
                                    return new InvoiceBOImpl();
                default:
                    return null;
        }
    }
}
