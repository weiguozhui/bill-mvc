package com.wgz.bill.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileUpload {
	final Logger logger = LoggerFactory.getLogger(FileUpload.class);

	@RequestMapping(value = "/upload")
	@ResponseBody
	public String fileUpload(MultipartFile multipartResolver, HttpServletRequest request, HttpServletResponse response)
			throws FileUploadException, IOException {
		
		// 获取文件名
		String filename = multipartResolver.getOriginalFilename();
		System.out.println("fileName" + filename);
		File file = new File("./" + filename);
		System.out.println(file.getAbsolutePath());
		// 保存文件
		multipartResolver.transferTo(file);
		System.out.println("==============Upload==========");

		return "success";

	}

	@RequestMapping(value = "/download")
	public ResponseEntity<byte[]> fileDowndload(HttpServletRequest request, HttpServletResponse response)
			throws FileUploadException, IOException {
		logger.debug("debug file");
		logger.info("info file");
		logger.error("error file");
		logger.warn("warn file");
		String filename = "Oracle编程艺术.pdf";
		File file = new File("D:/bill-mvc/bill-web/" + filename);

		BodyBuilder builder = ResponseEntity.ok();
		// 内容长度
		builder.contentLength(file.length());
		// application/octet-stream 二进制数据流（最常见的文件下载）
		builder.contentType(MediaType.APPLICATION_OCTET_STREAM);
		// 使用URLEncoding.decode对文件名进行解码
		filename = URLEncoder.encode("Oracle编程艺术.pdf", "UTF-8");
		// 可能会有浏览器不兼容问题
		builder.header("Content-Disposition", "attachment; filename=" + filename);
		return builder.body(FileUtils.readFileToByteArray(file));
	}
	
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(FileUpload.class);
		logger.error("Hello World");
	}

}
