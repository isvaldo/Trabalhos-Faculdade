var centerX = 200;
var centerY = 200;


noStroke();
// ears
fill(89, 52, 17);
ellipse(centerX-60, centerY-60, 70, 70);
ellipse(centerX+60, centerY-60, 70, 70);
// face
fill(163, 113, 5);
ellipse(centerX, centerY, 150, 150);
// eyes (outer ring) 
var eyeRadius = 29;

// proporções

var bolinha =eyeRadius/4;
var centraOlho = centerY-25;

fill(207, 147, 56);
ellipse(centerX-30, centraOlho, eyeRadius, eyeRadius);
ellipse(centerX+30, centraOlho, eyeRadius, eyeRadius);
// pupils
fill(0, 0, 0);
ellipse(centerX-30, centraOlho, bolinha, bolinha);
ellipse(centerX+30, centraOlho, bolinha, bolinha);
// mouth
fill(89, 52, 17);
ellipse(centerX, centerY+25, 70, 40);
stroke(0, 0, 0);
line(centerX-10, centerY+30, centerX-10, centerY+20);
line(centerX+10, centerY+30, centerX+10, centerY+20);
