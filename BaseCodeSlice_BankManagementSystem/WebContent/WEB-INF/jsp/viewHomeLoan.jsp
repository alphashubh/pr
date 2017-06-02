<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Loan details</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">

<style>
 body{
 Margin: 0 auto;
 Width: 90%;
 background-color: #f7f7f7;
 }
 
 div{
 	
 	 background-color: #dfe3ee;
 	 border-radius:10px;
 }
 h2{
 margin-top: 100px;
 color: white;
 background-color: #3b5998;
  border-radius:10px;
 }
th{
background-color:#8b9dc3;
border-radius: 10px;
}
 td{
  border-radius:10px;
	background-color: 	#f7f7f7;
 }
 td:hover{
 background-color: 	#dfe3ee;
font-weight: bold;
 }
 input:hover{
 background-color: 	#dfe3ee;
 
 }
 </style>
</head>
<body>

<form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem/mvc/viewHomeloan" >


 <body ng-app="myApp" >
 <center><h2>Loan details</h2></center>
    <div ng-controller="EmpCtrl">
       
      <input type="text" ng-model="search.homeLoanId" placeholder="Search By homeLoanId" maxlength="50"/>
       <hr/>

        <table>
        <th>Sr. No.</th>
        <th>HomeLoan Id</th>
        <th>loan Account Number </th>
        <th>loan Amount</th>
        <th>loan Duration</th>
        <th>loan Apply Date</th>
        <th>Annual Income</th>
        <th>Company Name</th>
        <th>Designation</th>
        <th>Total Experience</th>
        <th>Current Experience</th>
            <tr ng-repeat="homeloan in List | filter: search">
                <td>{{$index + 1}}</td>
                <td>{{homeloan.homeLoanId}}</td>
              <td>{{homeloan.loanAccountNumber}}</td>
                <td>{{homeloan.loanAmount}}</td>
                <td>{{homeloan.loanDuration}}</td>
                <td>{{homeloan.loanApplyDate}}</td>
                <td>{{homeloan.annualIncome}}</td>
                 <td>{{homeloan.companyName}}</td>
                  <td>{{homeloan.designation}}</td>
                   <td>{{homeloan.totalExperience}}</td>
                <td>{{homeloan.currentExperience}}</td>
            </tr>
        </table>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script>
        var app = angular.module('myApp', []);
        app.controller('EmpCtrl', function($scope, $http){
            $http({
              method: 'GET',
              url: 'http://localhost:8084/BaseCodeSlice_BankManagementSystem/mvc/viewHomeloan1'
            }).then(res=>res.data)
            .then(data => {
            	console.log(data);
            	$scope.List = data[0].homeLoan;
            })
        
           
        })
    </script>
    </form:form>
</body> 