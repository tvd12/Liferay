<%@ include file="/init.jsp" %>
<%
	int courses = TYServiceUtil.getCurrentCourse();
	long groupId = themeDisplay.getScopeGroupId();
	long companyId = themeDisplay.getCompanyId();
	int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
	String filePath = application.getRealPath("/excel");
	
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	List<TYSubject> subjects = ActionUtil.getSubjectsOfClassByUserRole(courses, 
		user.getUserId(), RoleKeys.TYPE_POINT);
		
	TYSubject subject = subjects.get(0);
	
	TVDSheet sheet = DataExcelCreator.createByC_S(tyClass.getClassId(), subjects.get(0));
	List<TVDSheet> sheets = new ArrayList<TVDSheet>();
	sheets.add(sheet);
	
	WriteExcelFileService writeExcel = new WriteExcelFileServiceImpl();
	writeExcel.setSheets(sheets);
	String fileName = "Lop_" + tyClass.getClassCode() + "_Mon_" + subject.getSubjectCode() + 
		"_" + user.getUserId() + "_" + courses + "_hk" + semester + ".xls";
	filePath = filePath + "/" + fileName;
	writeExcel.write(filePath);
	

	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
%>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/teacher-admin/view.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>
<liferay-ui:header title="" />	

<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<a href="<%= contextPathImg + "/excel/" +  fileName  %>">Download</a>
