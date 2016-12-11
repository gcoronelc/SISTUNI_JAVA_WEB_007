
// Dialogos

function fnShowError(message){
	message = "<br/><p style='color:red;'>" + message + "</p><br/>";
	$("<div></div>").html(message).dialog({
        title: "EUREKA - Error",
        resizable: false,
        modal: true,
        buttons: {
            "Ok": function() 
            {
                $( this ).dialog( "close" );
            }
        }
    });
}

function fnShowInfo(message){
	message = "<br/><p style='color:blue;'>" + message + "</p><br/>";
	$("<div></div>").html(message).dialog({
        title: "EUREKA - Info",
        resizable: false,
        modal: true,
        buttons: {
            "Ok": function() 
            {
                $( this ).dialog( "close" );
            }
        }
    });
}



// Opciones del menu


$("#menuConSaldo").click(function(){
	$("#egcc_content").load("conSaldo.jsp");
});

$("#menuProcRetiro").click(function(){
	$("#egcc_content").load("procRetiro.jsp");
});

$("#menuConMovimientos").click(function(){
	$("#egcc_content").load("conMovimientos.jsp");
});
