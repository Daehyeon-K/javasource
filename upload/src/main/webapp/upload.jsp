
<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.UUID"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// request에서 upload 요청 있는 지 확인
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	
	if(isMultipart){
		// 전송된 파일을 디스크에 저장하기 위한 객체
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Parse the request
		List<FileItem> items = upload.parseRequest(request);
		
		// Form 데이터인지 file 데이터인지 구분하는 작업
		String fieldName = "", fileName="", value="";
		Iterator<FileItem> iter = items.iterator();
		while (iter.hasNext()) {
		    FileItem item = iter.next();
		
		    if (item.isFormField()) { // FormField : type="text", "password", "email", ...
		        fieldName=item.getFieldName();
		    	value=item.getString("utf-8");
		    	out.print("<h3>일반 데이터</h3>");
		    	out.print(fieldName+" : "+value+"<br>");
		    } else {
		    	fieldName = item.getFieldName();
		    	fileName = item.getName();
		    	long size = item.getSize();
		    	
		    	out.print("<h3>파일 데이터</h3>");
		    	out.print(fieldName+" : "+fileName+" - "+size+"<br>");
		    	
		    	// 서버에 파일저장
		    	// 동일한 파일명이 들어올 경우, 중복되지 않은 고유 값을 파일명에 추가해 처리
		    	if(!fileName.isEmpty()){
		    		String path = "c:\\Users\\User\\Documents\\upload";
		    		
		    		UUID uuid = UUID.randomUUID();
		    		
		    		File uploadFile = new File(path + "\\"+uuid.toString()+"_"+fileName);
		    		
		    		item.write(uploadFile);
		    		
		    		// 파일명에 특수문자 깨지는 것 해결
		    		String encodeName = URLEncoder.encode(uploadFile.getName(), "utf-8");
		    		
		    		out.print("<p>");
		    		out.print("<a href='download.jsp?fileName="+encodeName+"'>"+fileName+"</a>");
		    		out.print("</p>");
		    		
		    	}
		    }
		}
		
	}
			
	
%>