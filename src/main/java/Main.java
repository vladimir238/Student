import java.io.IOException;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;


public class Main {
    private static List<Student> students;
    private static List<University> universities;
    private static final Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
        logger.log(INFO, "Application started, Logger configured");

        ExcelIO excelIO = new ExcelIO();
        logger.info("Читаем данные из файла Student ");
        students = excelIO.addliststudent("src/main/resources/universityInfo.xlsx");
        logger.info("Читаем данные из файла Univercity ");
        universities = excelIO.addlistunivercity("src/main/resources/universityInfo.xlsx");
        logger.info("\n\n Пишем данные в файл Statistics  ");
        XlsWriter.writeTable(StatisticUtil.createStatistics(students, universities), "src/main/resources/statistics.xlsx");
        List<Statistics> st = StatisticUtil.createStatistics(students, universities);
        st.forEach(System.out::println);
    }


}



