/*
 Trabalho de avaliação  WebDesign
 Scripts de automatizações
 By: Isvaldo Fernades Souza, Guilherme d Avila Vertein
 */

function limpaform(id){
    /*Limpa todos os campos um a um
    * recebe id*/
    $('#'+id).each (function(){
        this.reset();
    });
}
function IsEmail(email) {
    /*Retorna se o email é valido ou não*/
    var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    return regex.test(email);
}

function valida_contato(){
    /*è acionada depois do submit, avisa atravez se email é valido*/
    //Evita que form seja enviado
    event.preventDefault();
    //as validações de preenchimento o atributo required já resolve, isso é so para reforçar
    if ( $('#nome').val() && IsEmail($('#email').val()) && $('#nascimento').val() && $('#message').val()) {
        alert('Obrigado '+$('#nome').val()+'. Sua mensagem foi enviada com sucesso');
        limpaform('contactform');
    }else{
        // unico erro possivel apos submit
        alert('digite um email valido');
        $('#email').focus();
    }
    return false;
}

// adiciona um comentario de forma fake na pagina
function comentario(){
    event.preventDefault();
    var nome = $('#nome').val();
    var email = $('#email').val();
    if (!IsEmail(email)) {
        alert('digite um email valido');
        $('#email').focus();
        return False;
    }
    var message = $('#message').val();
    // pegando data de hj
    var d = new Date();
    var month = d.getMonth()+1;
    var day = d.getDate();
    var output = d.getFullYear() + '/' +
        (month<10 ? '0' : '') + month + '/' +
        (day<10 ? '0' : '') + day;

    var msg =
        ['<article>',
         '<header class="mensagem">',
            '<h1>Comentario</h1>',
            'Data: <time class="updated" pubdate>'+output+'</time>',
            'Nome:<p>'+nome+'</p>',
            '</header>',
            '<p class="mensagem">'+message+'</p>',
            '</article>'
        ].join('\n');
    $('section:first').append(msg).hide().fadeIn(1000);
    limpaform('contactform');
    return false;
}
// retorna uma pagina por ajax pelo nome
function GetPage(page) {
    $.ajax({
        url: "pages/"+page+'.html', success: function (ajaxresult) {
            $("main").html(ajaxresult);
        }});
    return false;
}


