package com.moz.ates.traffic.common.component;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Component;

@Component
public class ExcelDownlodComponent {

	/**
     * @brief : 엑셀 다운로드
     * @details : 엑셀 다운로드
     * @author : KC.KIM
     * @date : 2024.04.25
     * @param : resp
     * @param : headerArray(헤더 데이터)
     * @param : bodyList(데이터 리스트)
     * @param : fileName(파일명)
     * @return : 
	 * @throws IOException 
     */
	public void excelDownload(HttpServletResponse resp, String[] headerArray, List<Object> bodyList, String fileName) {
		SXSSFWorkbook workbook = new SXSSFWorkbook();
		SXSSFSheet sheet = workbook.createSheet(fileName);
		sheet.trackAllColumnsForAutoSizing();
		int rowNo = 0;
		
		SXSSFRow row = sheet.createRow(rowNo++);

		int headLength = makeHeader(row, headerArray);

		row = sheet.createRow(rowNo);
		if(null != bodyList && !bodyList.isEmpty()){
			makeBody(sheet, row, bodyList, headLength, rowNo);
		}

		for(int i=0;i<headLength;i++){
			sheet.autoSizeColumn(i);
		}

		try {
			resp.setContentType("ms-vnd/excel");
			resp.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xls");

			workbook.write(resp.getOutputStream());
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public int makeHeader(SXSSFRow row, String[] exHeader) {
		for(int i=0; i < exHeader.length; i++) {
			row.createCell(i).setCellValue(exHeader[i]);
		}
		return exHeader.length;
	}
	
	public void makeBody(SXSSFSheet sheet, SXSSFRow row, List<Object> bodyList, int headLength, int rowNo) {
		int cellNo = 0;
		
		for(int i=0; i < bodyList.size(); i++) {
			if(i % headLength  == 0) {
				row = sheet.createRow(rowNo++);
				cellNo = 0;
			}
			row.createCell(cellNo).setCellValue(String.valueOf(bodyList.get(i)));
			cellNo++;
			
		}
	}
}
