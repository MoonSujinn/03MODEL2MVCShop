<%@ page contentType="text/html; charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
<title>���� �Ϸ� ������</title>
</head>

<body>

<form name="updatePurchase" action="/updatePurchaseView.do?tranNo=0" method="post">

������ ���� ���Ű� �Ǿ����ϴ�.

<table border=1>
	<tr>
		<td>��ǰ��ȣ</td>
      <td>${product.prodNo}</td>
      	<td></td>
	</tr>
	<tr>
		<td>�����ھ��̵�</td>
		<td>${user.userId }</td>
		<td></td>
	</tr>
	<tr>
		<td>���Ź��</td>
		<td>
		
	  
            <c:if test="${product.paymentOption.trim()==1}">
      
			���ݱ���
			
			</c:if>
      
            <c:if test="${product.paymentOption.trim()==2}">
      
            �ſ뱸��
      
            </c:if>
	  
		
		</td>
		<td></td>
	</tr>
	<tr>
		<td>�������̸�</td>
		<td>${product.receiverName}</td>
		<td></td>
	</tr>
	<tr>
		<td>�����ڿ���ó</td>
		<td>${product.receiverPhone}</td>
		<td></td>
	</tr>
	<tr>
		<td>�������ּ�</td>
		<td>${product.divyAddr}</td>
		<td></td>
	</tr>
		<tr>
		<td>���ſ�û����</td>
		<td>${product.divyRequest}</td>
		<td></td>
	</tr>
	<tr>
		<td>����������</td>
		<td>${product.divyDate}</td>
		<td></td>
	</tr>
</table>
</form>

</body>
</html>