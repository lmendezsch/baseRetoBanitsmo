package models.setData;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Data
public class ElementoReferencia {
    String elemento;

    public static List<ElementoReferencia> setData(DataTable dataTable) {
        List<ElementoReferencia> elemento = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            elemento.add(new ObjectMapper().convertValue(map, ElementoReferencia.class));
        }
        return elemento;
    }
}
