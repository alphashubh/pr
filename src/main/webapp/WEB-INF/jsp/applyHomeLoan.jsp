<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <html>
  <head>
  <title>Apply Home Loan</title>
     <link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
  
  <style>
	.cssClass {
		background-color: red;
	}
	body{
 Margin: 0 auto;
 Width: 90%;
 background-color: #f7f7f7;
 }
 
 div{
 	
 	 background-color: #dfe3ee;
 	 border-radius:10px;
 	 height: 410px;
 }
 h2{
	Margin-top:100px;
 color: white;
 background-color: #3b5998;
  border-radius:10px;
 }
th{
background-color:#8b9dc3;
border-radius: 10px;
}
.C:hover{
 font-weight: bold;

}
 td{
  border-radius:10px;
	background-color: 	#f7f7f7;
	
 }
 tr{
 height:10px;
 }
/*  td:hover{
 background-color: 	#dfe3ee;
font-weight: bold;
 } */
 input:hover{
 background-color: 	#dfe3ee;
 
 }
  button {
 	margin-top: 20px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    width:90px;
    height:50px;
    border: 2px solid #3b5998;
     }

button:hover {
    background-color: #3b5998; /* Green */
    color: white;
}</style>
  </head>
  <body>
  <center><h2>Home Loan Application</h2></center>
  <form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem/mvc/applyHomeLoan" modelAttribute="homeLoan">
  <table>
<tr>
	<td>
  <table>
     
   <tr>
          <td class="C">Loan Amount :</td>
          <td><form:input path="loanAmount" placeholder="Loan Amount" maxlength="15" /></td>
          <td><form:errors path="loanAmount" cssClass="error" /></td>
      </tr>
      <tr>
      
          <%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy");%>
          <td class="C">Loan Apply Date  :</td>
          <td><form:input path="loanApplyDate" type="hidden" value="<%= df.format(new java.util.Date())%>"  disabled="disabled"/><%= df.format(new java.util.Date())%></td>
       
          <td><form:errors path="loanApplyDate" cssClass="error" /></td>
      </tr>
      <tr>
          <td class="C">Duration of the loan  :</td>
         <td><form:select  path="loanDuration" maxlength="2" class="form-control"
						id="loan Duration" placeholder="Loan Duration" >
						<option value="" disabled selected>Select Loan Duration</option>
						<option value="5">5</option>
						<option value="10">10</option>
						<option value="15">15</option>
						<option value="20">20</option>
						</form:select></td>
						 <td><form:errors path="loanDuration" cssClass="error" /></td>
         
          
      </tr>
      <tr>
          <td class="C">Annual Income   :</td>
          <td><form:input path="annualIncome" placeholder="Annual Income" maxlength="15"/></td>
          <td><form:errors path="annualIncome" cssClass="error" /></td>
      </tr>
      
       </table>
    </td>
    <td>
    <table>
      <tr>
          <td class="C">Company Name   :</td>
          <td><form:input path="companyName" placeholder="Company Name" maxlength="40"/></td>
          <td><form:errors path="companyName" cssClass="error" /></td>
      </tr>
      <tr>
          <td class="C">Designation   :</td>
          <td><form:input path="designation" placeholder="Designation" maxlength="50"/></td>
          <td><form:errors path="designation" cssClass="error" /></td>
      </tr>
      <tr>
          <td class="C">Total Exp   :</td>
          <td><form:input path="totalExperience" placeholder="Total Exp" maxlength="4"/></td>
          <td><form:errors path="totalExperience" cssClass="error" /></td>
      </tr>
      <tr>
          <td class="C">Exp with Current company  :</td>
          <td><form:input path="currentExperience" placeholder="Exp with Current"  maxlength="4"/></td>
          <td><form:errors path="currentExperience" cssClass="error" /></td>
      </tr>
       </table>
   <td>
    </tr>
    </table>
     <!--  <tr>
          <td colspan="2"><input type="submit" value="Apply Loan"></td>
      </tr> -->
  
  <center><button type="submit" value="Apply Loan">Add</button></center>
  </form:form>
  
  </body>
  </html> 