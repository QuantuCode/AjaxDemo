//var id = document.getElementById('student_id_input').val();
//var name = document.getElementById('student_name_input').val();

// this line is added

function init_save_student(){
	$(".add_save").click(function(){	
		console.log("add_save");
		add_function();		
		});	
		
}		
		
function add_function()	
{
	console.log("inside ajax function");
	$.ajax({
		type: "POST",
	    url: "jsp/home/save",	    
	    contentType: "application/json;charset=utf-8",
	    dataType: "json",
	    data:  JSON.stringify({ 
	    	
	    	"id" : "1",	    	
          "name":  "ravi",
	    }),
		success:function(data)
		{
		console.log(data)
		}
	});	
	console.log("ajax function end");
	
}	
		
		
	
	
