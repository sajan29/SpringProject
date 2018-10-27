$(document).ready(function(){
	
	switch(menu)
	{
		case 'about':
			$("#about").addClass("active");
			break;
		case 'contact':
			$("#contact").addClass("active");
			break;
		case 'allproducts':
			$("#products").addClass("active");
			break;
		default:
			$("#products").addClass("active");
			$("#a_"+menu).addClass("active");
			break;
	}
		
	
});