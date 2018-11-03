package com.example.exporttocsvpoc;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvGenerator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CsvUtil {
    public static <T> void exportToCsv(String fileName, Class<T> clazz, List<T> lista) throws IOException {
        CsvMapper mapper = new CsvMapper();
        mapper.configure(CsvGenerator.Feature.ALWAYS_QUOTE_STRINGS, true);
        CsvSchema schema = mapper.schemaFor(clazz)
                .withColumnSeparator(',')
                .withHeader();
        ObjectWriter objectWriter = mapper.writer(schema);
        objectWriter.writeValue(new File(fileName), lista);
    }
}
