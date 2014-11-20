<%@include file="/init.jsp"  %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	List<TYStudent> students = ActionUtil.getStudentsInClass(
			TYServiceUtil.getCurrentCourse(), tyClass.getClassId());
%>

