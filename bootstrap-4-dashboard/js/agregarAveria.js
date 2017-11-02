$(function() {


	/*Esta función añade Averías*/
	$(document).on("click", ".btn-aceptar", function(){
		let nombre = $("#name").val();
		let correo = $("#email").val();
		let averia = $("#message").val();

		$("#listaAverias").append(
			'<div class="card mb-2 card-nota"><div class="card-block"><div class="dropdown card-title-btn-container">'
			+'<button class="btn btn-sm btn-subtle dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">'
			+'<em class="fa fa-cog"></em></button><div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuButton"><a class="dropdown-item" href="#">'
			+'<em class="fa fa-search mr-1"></em> Ayuda</a><a class="dropdown-item" href="#"><em class="fa fa-thumb-tack mr-1"></em>Guardar borrador</a>'
			+'</div></div><h3 class="card-subtitle mb-2 text-muted">Avería Registrada</h3><form class="form-horizontal" action="" method="post">'
			+'<fieldset><div class="form-group"><h5>Name</h5><div class="col-12 no-padding">'
			+'<div class="col-12 no-padding">'+ nombre+'</div></div></div><div class="form-group">'
			+'<h5>Correo</h5><div class="col-12 no-padding">'
			+'<div class="col-12 no-padding">'+ correo+'</div></div></div><div class="form-group">'
			+'<h5>Avería</h5><div class="col-12 no-padding">'+ averia+'</div>'
			+'</div><div class="form-group"><div class="col-12 widget-right no-padding"></div></div></fieldset></form><button class="btn btn-danger float-right">'
			+'Eliminar</button></div></div>');


		$('#exampleModal').modal('hide');
	});



	/*Esta Función resetea el formulario para añadir averías*/
	$(document).on("hidden.bs.modal", function(){
		$(this).find('form')[0].reset();
	});



	$(document).on("click",".btn-danger", function(){
	  
	  let tituloCard = $(this).closest(".card").find(".card-title").text();
      let selectorCard = $(this).closest(".card-nota");
      
      selectorCard.remove();
	});

});
