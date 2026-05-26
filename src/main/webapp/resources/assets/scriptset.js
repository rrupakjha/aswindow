function is_email(email)
{
	if(!email.match(/^[A-Za-z0-9\._\-+]+@[A-Za-z0-9_\-+]+(\.[A-Za-z0-9_\-+]+)+$/))
	return false;
	return true;
}


function registerForm() 
{
	if(document.contact.txt_name.value == "Name" ) 
	{
		alert("Name can not be Blank !");
		document.contact.txt_name.focus();
		return false;
		
	} 
	else if(document.contact.txt_email.value == "Email" ) 
	{
		alert("E-Mail can not be Blank !");
		document.contact.txt_email.focus();
		return false;
	} 
	else if(! is_email( document.contact.txt_email.value))
	{
		alert("Email Address should be Valid Format !");
		document.contact.txt_email.focus();
		return false;
	} 
	
	

        else if(document.contact.txt_phone.value == "Phone" ) 
	{
		alert("Contact No. can not be Blank !");
		document.contact.txt_phone.focus();
		return false;
	} 
	
	else if(document.contact.txt_subject.value == "Subject" ) 
	{
		alert("Subject can not be Blank !");
		document.contact.txt_subject.focus();
		return false;
	} 
	
	
	else if(document.contact.txt_message.value == "Message" ) 
	{
		alert("Message can not be Blank !");
		document.contact.txt_message.focus();
		return false;
	} 
		else
	  {	   
		   document.contact.method="post";
		  document.contact.action="request.php";
		  
		  document.contact.submit(); 
		    alert("Thank You for Contacting Us.");
		   document.contact.Register.disabled = true;
		    return true;
	   }
}