import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ExcelIO excelIO=new ExcelIO();
        excelIO.parse("src/main/resources/universityInfo.xlsx");


   }
}
