 window.onload = function(){
            // criando objeto canvas e colocando ele na tela
            var canvas = document.createElement("canvas");
            var c = canvas.getContext("2d");
            canvas.width = 800;
            canvas.height = 200;
            document.body.appendChild(canvas);
            // preenche tela com preto
            c.fillStyle = "black";
            c.fillRect(0, 0, canvas.width, canvas.height);

            var x = canvas.width/2;
            var y  = canvas.height/2;
            var process = setInterval(function() {
                        y += 0.5;
                        console.log(y);

                        c.fillStyle = "black";
                        c.fillRect(0, 0, canvas.width, canvas.height);


                        c.fillStyle = "white";
                        // quando chegar no "chão"
                        if (y == canvas.height -10) {
                            c.fillStyle = "red";
                            c.beginPath();
                            c.arc(x, y, 10, 0, Math.PI * 2, true);
                            c.closePath();
                            c.fill();
                            clearInterval(process);
                        }
                        c.beginPath();
                        c.arc(x, y, 10, 0, Math.PI * 2, true);
                        c.closePath();
                        c.fill();
                    }
                    , 30);

        };
