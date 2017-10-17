ventas1erSem(ruben,25000).
ventas1erSem(valentina,75000).
ventas1erSem(alejandro,25000).
ventas1erSem(antar,240).
ventas1erSem(brenda,19999).%No tiene venta en 2doSem

ventas2doSem(antar,8900).
ventas2doSem(ruben,15000).
ventas2doSem(alejandro,1000).
ventas2doSem(valentina,55000).
ventas2doSem(juancito,100000).%No tiene ventas en 1erSem

%vendedor-comision
total1(X,Y):-ventas1erSem(X,N1),ventas2doSem(X,N2),(N1>20000,N2>20000),
	Y is (N1+N2)*(20/100).
total2(X,Y):-ventas1erSem(X,N1),ventas2doSem(X,N2),(N1<20000;N2<20000),
	Y is (N1+N2)*(10/100).

%Calculo TODOS los vendedores(O sea, la UNION)
union(X):-ventas1erSem(X,_);ventas2doSem(X,_).
%Vendedores que no registran ventas en algun semeestre
no_ventas1erSem(X):-union(X),not(ventas1erSem(X,_)).
no_ventas2doSem(X):-union(X),not(ventas2doSem(X,_)).
no_ventas(X):-no_ventas1erSem(X);no_ventas2doSem(X).
%Comision total
subtotal3_1(X,Y):-no_ventas(X),ventas1erSem(X,N1),Y is (N1)*(5/100).
subtotal3_2(X,Y):-no_ventas(X),ventas2doSem(X,N2),Y is (N2)*(5/100).
total3(X,Y):-subtotal3_1(X,Y);subtotal3_2(X,Y).
