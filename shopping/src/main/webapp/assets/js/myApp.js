$(function(){
	
	switch(menu){
	
	case 'About':
		$('#about').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	case 'All products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	
	}
	
});