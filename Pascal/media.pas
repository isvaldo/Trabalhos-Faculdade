PROGRAM TEMP_MEDIA ;

VAR
i: integer;
soma, media: real;
temp: array [1..6] of real;

BEGIN
writeln ('Introduza os valores das 6 temperaturas');
FOR i := 1 TO 6 DO
readln (temp[i])
soma := 0; {Cálculo da média}
FOR i := 1 TO 6 DO
soma := soma + temp[i];
media := soma / 6;
FOR i := 1 TO 6 DO {Valores acima da média}
BEGIN
IF temp[i] > media THEN
writeln ('Temperatura acima da média: ', temp[i]);
END;
readln
END.
