 function buttonone() {
	 document.getElementById("charts").style.display="";
	  document.getElementById("tables").style.display="none";//Òþ²Ø
     var button = document.getElementById('button1');
	  var font = document.getElementById('font1');  
     button.style.backgroundColor="#3399FF";
	  font.color="white";
	  
	  var button = document.getElementById('button2');
	  var font = document.getElementById('font2');  
     button.style.backgroundColor="#999999";
	  font.color="black";
  
}; 
function buttontwo() {
	 document.getElementById("tables").style.display="";//Òþ²Øcharts
	 document.getElementById("charts").style.display="none";
     var button = document.getElementById('button1');
	  var font = document.getElementById('font1');  
     button.style.backgroundColor="#999999";
	  font.color="black";
	  
	  var button = document.getElementById('button2');
	  var font = document.getElementById('font2');  
     button.style.backgroundColor="#3399FF";
	  font.color="white";
}; 
 