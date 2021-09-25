import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Exporter {
    public void exportContact(List<CRMObject> lst) throws IOException {
        FileWriter csvWriter = new FileWriter("ContactExported.csv");
        csvWriter.append("Name");
        csvWriter.append(",");
        csvWriter.append("Phone");
        csvWriter.append(",");
        csvWriter.append("Email");
        csvWriter.append(",");
        csvWriter.append("TeamName");
        csvWriter.append(",");
        csvWriter.append("Remark");
        csvWriter.append("\n");
        for (CRMObject element: lst) {
            csvWriter.append(((Contact) element).toCsv());
            csvWriter.append("\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }

    public void exportSchedule(List<CRMObject> lst) throws IOException {
        FileWriter csvWriter = new FileWriter("ScheduleExported.csv");
        csvWriter.append("Name");
        csvWriter.append(",");
        csvWriter.append("Time");
        csvWriter.append(",");
        csvWriter.append("Address");
        csvWriter.append(",");
        csvWriter.append("Context");
        csvWriter.append("\n");
        for (CRMObject element: lst) {
            csvWriter.append(((Schedule) element).toCsv());
            csvWriter.append("\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }
}
