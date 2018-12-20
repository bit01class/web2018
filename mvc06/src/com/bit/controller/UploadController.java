package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/upload.do")
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String saveDirectory;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		saveDirectory=request.getRealPath("/up");
		int maxsize=1024*1024*10;
		DefaultFileRenamePolicy dfrp = new DefaultFileRenamePolicy();
		MultipartRequest mr = new MultipartRequest(request, saveDirectory,maxsize,"utf-8",dfrp);
		String origin=mr.getOriginalFileName("file1");
		String rename=mr.getFilesystemName("file1");
		
		request.setAttribute("fname", origin);
		request.setAttribute("file", rename);
		
		request.getRequestDispatcher("download.jsp").forward(request, response);
		
	}

}








