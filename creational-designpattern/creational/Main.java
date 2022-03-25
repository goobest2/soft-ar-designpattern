package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Current usage
//        BookMetadataFormatter formatter = null;
//        try {
//            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
//            formatter.append(TestData.dragonBook);
//            formatter.append(TestData.dinosaurBook);
//            System.out.print(formatter.getMetadataString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }

        // Expected usage
        BookMetadataExporter exporter1 = new CSVBookMetadataExporter();
        exporter1.add(TestData.sailboatBook);
        exporter1.add(TestData.GoFBook);
        exporter1.export(System.out);

        BookMetadataExporter exporter2 = new JSONBookMetadataExporter();
        exporter2.add(TestData.sailboatBook);
        exporter2.add(TestData.GoFBook);
        exporter2.export(System.out);

        BookMetadataExporter exporter3 = new XMLBookMetadataExporter();
        exporter3.add(TestData.sailboatBook);
        exporter3.add(TestData.GoFBook);
        exporter3.export(System.out);
    }
}
