
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Muli:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

<link href="content/css/save.css" rel="stylesheet">
</head>
<body>

		    <div class="form-group">
			<label for="student_id_input" class="text-blue " >Id</label> 
			<input  id="student_id_input" class="form-control border-blue" type="text"  name="id">
			</div>
			
			<div class="form-group">
			<label for="student_name_input" class="text-blue " >Name</label> 
			<input  id="student_name_input" class="form-control border-blue" type="text"  name="name">
			</div>
			
		<button class="btn btn-success btn-icon-split float-right add_save" type="submit">
									
										<span class="icon text-white-50" >
											<i  class="fas fa-save"></i>
										<i class=" spinner-border spinner-border-sm d-flex mt-1"></i> -->
										</span>
										<span class="text">Save</span>									
	   </button>	
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript" src="/content/js/save.js"></script>
<script type="text/javascript">
init_save_student();
</script>
</body>
</html>