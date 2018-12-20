package com.bit.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.do")
public class DownController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filename=request.getParameter("file");
		String origin=request.getParameter("fname");
		String saveDirectory = request.getRealPath("/up");
		
		File file=new File(saveDirectory+"\\"+filename);
		
		FileInputStream is =null;
		ServletOutputStream os=null;
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition","attachment; filename="+origin);
		try{
			is= new FileInputStream(file);
			os= response.getOutputStream();
			
			bis=new BufferedInputStream(is);
			bos=new BufferedOutputStream(os);
			
			byte[] buf=new byte[1024];
			
			int su=0;
			while((su=bis.read(buf, 0, buf.length))>0){
				bos.write(buf, 0, su);
			}
			bos.flush();
		}finally{
			if(bis!=null)bis.close();
			if(bos!=null)bos.close();
			if(is!=null)is.close();
			if(os!=null)os.close();
		}
	}

}




















