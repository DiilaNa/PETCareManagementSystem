package gdse71.project.animalhospital.dao.custom;

import gdse71.project.animalhospital.dao.CrudDAO;
import gdse71.project.animalhospital.entity.Sms;

import java.sql.SQLException;
import java.util.ArrayList;

public interface SmsDAO extends CrudDAO<Sms> {
    ArrayList<String> loadSmsComboBox() throws SQLException, ClassNotFoundException;
    ArrayList<String> loadAppointmentIdComboBox() throws SQLException, ClassNotFoundException;
}
