function Valregistration(){
    var first=document.getElementById("first").value;
    var second=document.getElementById("second").value;
    var phone=document.getElementById("phno").value;
    var email=document.getElementById("email").value;
    var lettersOnly = /^[A-Za-z]+$/;
     if (first =="" && !first.match(lettersOnly)){
                  alert('Invalid input. Please enter only letters.');
                  return false;
              }
     if (second ==""){
                  alert("Please enter lastname");
                  return false;
              }
     if (phone ==""){
                  alert("Please enter phone number");
                  return false;
              }
     if (email ==""){
                  alert("Please enter email");
                  return false;
              }
          return true;    
              
}
 