package com.wgz.bill.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.hssf.eventusermodel.HSSFEventFactory;
import org.apache.poi.hssf.eventusermodel.HSSFListener;
import org.apache.poi.hssf.eventusermodel.HSSFRequest;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class FileUtils{
	
	public static boolean creatExcel(String filePath) {
		try {
			FileOutputStream out= new FileOutputStream("workbook.xls");
		
		
		
		// 创建一个workbook对象
		Workbook wb = new HSSFWorkbook();
		// 通过workbook对象创建一个sheet页签
		Sheet s = wb.createSheet();
		// 定义一个rows对象，对应的是excel里的行
		// 它只有一个evaluate方法
		Row r=null;
		//单元格，这是一个接口对象
		Cell c=null;
		// 创建 3 单元格样式
		CellStyle cs = wb.createCellStyle();
		CellStyle cs2 = wb.createCellStyle();
		CellStyle cs3 = wb.createCellStyle();
		// 创建数据模板
		DataFormat df = wb.createDataFormat();
		
		// 创建 2 字体 对象
		Font f = wb.createFont();
		Font f2 = wb.createFont();
		
		//设置 字体 1 to 12号
		f.setFontHeightInPoints((short) 12);
		// 设置字体颜色为蓝色
		f.setColor( (short)0xc );
		// 字体加粗
		f.setBold(true);
		
		//字体大小为10号
		f2.setFontHeightInPoints((short) 10);
		//设置为红色
		f2.setColor( (short)Font.COLOR_RED );
		//加粗
		f2.setBold(true);
		// 自定义
		f2.setStrikeout( true );
		
		
		// 设置sheet工作薄的名称,并且是Unicode的字符方式
		wb.setSheetName(0, "你好" );
		// 以下方式为 ascii格式
		// wb.setSheetName(0, "HSSF Test");
		// 创建一个有30行的sheet工作薄 (0-29)
		int rownum;
		for (rownum = (short) 0; rownum < 30; rownum++)
		{
		    // 创建一行
		    r = s.createRow(rownum);
		    // on every other row
		    if ((rownum % 2) == 0)
		    {
		        // 设置行高为 bigger  (in twips - 1/20 of a point)
		        r.setHeight((short) 0x249);
		    }
		    //r.setRowNum(( short ) rownum);
		    // 每行创建10个单元格 10 cells (0-9) (the += 2 becomes apparent later
		    for (short cellnum = (short) 0; cellnum < 10; cellnum += 2)
		    {
		        // 创建单元格 a numeric cell
		        c = r.createCell(cellnum);
		        // 给单元格赋值
		        // do some goofy math to demonstrate decimals
//		        c.setCellValue(rownum * 10000 + cellnum
//		                + (((double) rownum / 1000)
//		                + ((double) cellnum / 10000)));
		        c.setCellValue("hello world");
		        String cellValue;
		        // create a string cell (see why += 2 in the
		        c = r.createCell((short) (cellnum + 1));
		        
		        // on every other row
		        if ((rownum % 2) == 0)
		        {
		            // 设置单元格样式 set this cell to the first cell style we defined
		            c.setCellStyle(cs);
		            // 设置单元格值set the cell's string value to "Test"
		            c.setCellValue( "Test" );
		        }
		        else
		        {
		            c.setCellStyle(cs2);
		            // set the cell's string value to "\u0422\u0435\u0441\u0442"
		            c.setCellValue( "干掉全世界" );
		        }
		        // make this column a bit wider
		        // 设置单元格边框
		        s.setColumnWidth((short) (cellnum + 1), (short) ((50 * 8) / ((double) 1 / 20)));
		    }
		}
		//draw a thick black border on the row at the bottom using BLANKS
		// advance 2 rows
		rownum++;
		rownum++;
		r = s.createRow(rownum);
		// define the third style to be the default
		// 设置单元格底边边框 except with a thick black border at the bottom
		cs3.setBorderBottom(BorderStyle.THICK);
		//create 50 cells
		for (short cellnum = (short) 0; cellnum < 50; cellnum++)
		{
		    //create a blank type cell (no value)
		    c = r.createCell(cellnum);
		    // set it to the thick black border style
		    c.setCellStyle(cs3);
		}
		//end draw thick black border
		// demonstrate adding/naming and deleting a sheet
		// create a sheet, set its title then delete it
		s = wb.createSheet();
		wb.setSheetName(1, "DeletedSheet");
		wb.removeSheetAt(1);
		//end deleted sheet
		// write the workbook to the output stream
		// close our file (don't blow out our file handles
		wb.write(out);
		out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public static void parseExcel(String filePath) {
		try {
			filePath="workbook.xls";
            File excel = new File(filePath);
            if (excel.isFile() && excel.exists()) {   //判断文件是否存在
                FileInputStream fis = new FileInputStream(excel);   //文件流对象
                Workbook wb=new HSSFWorkbook(fis);
                //开始解析
                Sheet sheet = wb.getSheetAt(0);     //读取sheet 0

                int firstRowIndex = sheet.getFirstRowNum()+1;   //第一行是列名，所以不读
                int lastRowIndex = sheet.getLastRowNum();
                System.out.println("firstRowIndex: "+firstRowIndex);
                System.out.println("lastRowIndex: "+lastRowIndex);

                for(int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) {   //遍历行
                    System.out.println("rIndex: " + rIndex);
                    Row row = sheet.getRow(rIndex);
                    if (row != null) {
                        int firstCellIndex = row.getFirstCellNum();
                        int lastCellIndex = row.getLastCellNum();
                        for (int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex++) {   //遍历列
                            Cell cell = row.getCell(cIndex);
                            if (cell != null) {
                                System.out.println(cell.toString());
                            }
                        }
                    }
                }
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		creatExcel("hello");
		parseExcel("");
	}

	

}
