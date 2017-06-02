<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
<title>Insert title here</title>

<style>

	
body{
 Margin: 0 auto;
 Width: 70%;
 background-color: #f7f7f7;

 }
 
 .operation{
 Margin: 100px 200px;;
 
 }
 
 button {
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    width:100px;
    height:50px;
    border: 2px solid #3b5998;
   
}

button:hover {
    background-color: #3b5998; 
   color: green;
}
 
 h2{
 margin-top: 100px;
 color: white;
 background-color: #3b5998;
 border-radius:10px;
 }
 </style>
</head>
<body>
<div class="operation">

<button><a href="http://localhost:8084/BaseCodeSlice_BankManagementSystem/mvc/performtransaction">Perform Transaction</a>
	</button>
<button><a href="http://localhost:8084/BaseCodeSlice_BankManagementSystem/mvc/viewtransaction">View Transaction</a>
</button>

<button><a href="http://localhost:8084/BaseCodeSlice_BankManagementSystem/mvc/addEducationLoan">Apply Education Loan</a>
	</button>
<button><a href="http://localhost:8084/BaseCodeSlice_BankManagementSystem/mvc/view">View Education Loan</a>
</button>

<button><a href="http://localhost:8084/BaseCodeSlice_BankManagementSystem/mvc/applyHomeLoan">Apply Home Loan</a>
	</button>
<button><a href="http://localhost:8084/BaseCodeSlice_BankManagementSystem/mvc/viewHomeloan">View Home Loan</a>
</button>
</div>
</body>
</html>