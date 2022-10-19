package io;

import model.Statistics;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XlsWriter {
    public static void writeTable (List<Statistics> statistics,String fileNameStatistics){
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Статистика");
        int rowNum = 0;
        Row row = sheet.createRow(rowNum);
        row.createCell(0).setCellValue("Профиль обучения");
        row.createCell(1).setCellValue("Средний бал за экзамен");
        row.createCell(2).setCellValue("Количество студентов по профилю");
        row.createCell(3).setCellValue("Количество унивеситетов по профилю");
        row.createCell(4).setCellValue("Названия унивеситетов ");
        for (Statistics dataModel : statistics) {
            createSheetHeader(sheet, ++rowNum, dataModel);
        }
        try (FileOutputStream out = new FileOutputStream(new File(fileNameStatistics))) {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel файл успешно создан!");
    }


    private static void createSheetHeader(HSSFSheet sheet, int rowNum, Statistics dataModel) {
        Row row = sheet.createRow(rowNum);

        row.createCell(0).setCellValue(String.valueOf(dataModel.getMainProfile()));
        row.createCell(1).setCellValue(dataModel.getAvgExamScore());
        row.createCell(2).setCellValue(dataModel.getAmountStudentProfile());
        row.createCell(3).setCellValue(dataModel.getAmountUnivercityProfile());
        row.createCell(4).setCellValue(dataModel.getNameUnivercity());
    }


}