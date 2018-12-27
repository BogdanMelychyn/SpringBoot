package lviv.SpringBoot.service;

import java.util.List;
import lviv.SpringBoot.model.Office;

public interface OfficesDAO {
List<Office> getOfficeIncomePeriod(String dateStart, String dateEnd);
}
