package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/upload.do")
public class UploadController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		req.getRequestDispatcher("uploadform.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String path=req.getRealPath("/up");
		//System.out.println(path);
		int maxsize=1024*1024*10;// 1mb==1024kb==1024*1024byte
		DefaultFileRenamePolicy dfrp = new DefaultFileRenamePolicy();
		MultipartRequest mr = new MultipartRequest(req, path,maxsize,"utf-8",dfrp);
		
		System.out.println(mr.getParameter("sabun"));
		
		String origin=mr.getOriginalFileName("file");
		String rename=mr.getFilesystemName("file");
		req.setAttribute("fname", rename);
		req.setAttribute("origin", origin);
		
		req.getRequestDispatcher("download.jsp").forward(req, resp);
	}

}














