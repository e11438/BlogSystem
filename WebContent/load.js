$(document).ready(function() {

	window.batch="";
	window.batch1="";
	
	$.ajaxSetup({cache: false});
	setInterval(read, 3000);	//call read function every 3 sec
	setInterval(readnot1, 3000);//call readnot1 function every 3 sec
	
	setInterval(getInput, 2000);	//call getInput function every 2 sec
	
	function read(){
		var filepath="files/"+batch+".txt";
		$.get(filepath, function(data) {
			data = data.replace("\n","<br>");
			var notices = data.split("***");
			
			//get the latest notice
			var parts=notices[0].split("\n");
			var str ="";
			for(i=2;i<parts.length;i++){
				str=str+parts[i];
			}
			$("#topic").html("<h2>"+parts[1]+"<h2>");
			$("#content").html("<h3>"+str+"<h3>");
			
		}, 'text');	
	}
	//read the sub notice and display 
	function readnot1(){
		var filepath="files/"+batch1+".txt";
		$.get(filepath, function(data) {
			data = data.replace("\n","<br>");
			var notices = data.split("***");
			// /[0-9]{2}-[0-9]{2}-[0-9]{4}/
			var parts=notices[0].split("\n");
			var str =parts[1]+"<br>";
			for(i=2;i<parts.length;i++){
				str=str+parts[i];
			}			
			$("#notice1").html(str);
			
		}, 'text');	
	}
	
	//function to get input from a file
	function getInput(){	
		$.get('files/input.txt', function(data) {	
			var parts=data.split("\n");		
			batch=parts[0].trim();
			batch1=parts[1].trim();
			batch2=parts[2].trim();
			$("#subtle").html("Showing latest notice for "+batch+" batch");
		}, 'text');	
	}
});

