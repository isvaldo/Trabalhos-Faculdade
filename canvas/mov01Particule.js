window.onload = function () {
  var canvas =  document.createElement("canvas");
  var c = canvas.getContext("2d");
  canvas.width = 800;
  canvas.heigth = 500;
  document.body.appendChild(canvas);
  
  var x = 20;
  var y = 100;
  c.fillStyle = "black";
  c.fillRect(0,0,canvas.width, canvas.height);
  
  setInterval(function(){
  c.fillStyle = "black";
  c.fillRect(0,0,canvas.width,canvas.heigth);
  

  x += 1;
  y += -0.25;
  c.beginPath();
  c.fillStyle = "white";
  c.arc(x,y,10,0,Math.PI*2,true);
  c.closePath();
  c.fill();
    
  },30);
  
};

