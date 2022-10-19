import comparator.StudComparator;
import enums.ChoiceEnum;
import enums.StudentEnum;
import enums.UnivercityEnum;
import io.ExcelIO;
import io.JsonWriter;
import io.XlsWriter;
import io.XmlWriter;
import model.FullInfo;
import model.Statistics;
import model.Student;
import model.University;
import util.StatisticUtil;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;


public class Main {
    private static List<Student> students;
    private static List<University> universities;
    private static List<Statistics> statisticsList;

    private static final Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) throws JAXBException {
        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
        logger.log(INFO, "Application started, Logger configured");

        ExcelIO excelIO = new ExcelIO();
        logger.info("Читаем данные из файла model.Student ");
        students = excelIO.addliststudent("src/main/resources/universityInfo.xlsx");
        StudComparator studComparator = ChoiceEnum.getMyComparator(StudentEnum.SORTAVGEXAMSCORE);
        students.sort(studComparator);

        logger.info("Читаем данные из файла Univercity ");
        universities = excelIO.addlistunivercity("src/main/resources/universityInfo.xlsx");
        universities.sort(ChoiceEnum.getMyUnComparator(UnivercityEnum.SORTYEAR));
        logger.info("\n\n Пишем данные в файл model.Statistics  ");
        XlsWriter.writeTable(StatisticUtil.createStatistics(students, universities), "src/main/resources/statistics.xlsx");
        List<Statistics> statisticsList = StatisticUtil.createStatistics(students, universities);
        statisticsList.forEach(System.out::println);
//        File file=new File("XmlNew.xml");
//        model.Student student=new model.Student("Станкин","123-u",3,4.3f);
////       JAXBContext context=JAXBContext.newInstance(model.Student.class);
////        Marshaller marshaller=context.createMarshaller();
////        marshaller.marshal(student,System.out);
//        students.forEach(System.out::println);
 //       io.XlsWriter.writeXml(students,"src/main/resources/Save","\\test.xml");
        FullInfo fullInfo = new FullInfo()
                .setStudentList(students)
                .setUniversityList(universities)
                .setStatisticsList(statisticsList)
                .setProcessDate(new Date());
        XmlWriter.generateXmlReq(fullInfo);
        JsonWriter.writeJsonReq(fullInfo);
        logger.log(INFO, "Application finished");
    }


}



