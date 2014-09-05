/*
 Trabalho de avaliação  WebDesign
 Scripts de automatizações
 By: Isvaldo Fernades Souza, Guilherme d Avila Vertein
 */

function GetPage(page) {
    $.ajax({
        url: "pages/"+page+'.html', success: function (ajaxresult) {
        $("main").html(ajaxresult);
    }});
}
