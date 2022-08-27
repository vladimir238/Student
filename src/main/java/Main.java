import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ExcelIO excelIO=new ExcelIO();
        printList(excelIO.addliststudent("src/main/resources/universityInfo.xlsx"));
        printListu(excelIO.addlistunivercity("src/main/resources/universityInfo.xlsx"));


   }
   public static void printList(List<Student> asd){
       for (Object w : asd) {
           System.out.println(w);
       }
   }
    public static void printListu(List<University> asd){
        for (Object w : asd) {
            System.out.println(w);
        }
    }
}
