numero(1).
numero(2).
numero(3).

terna(X,Y,Z):-numero(X),numero(Y),numero(Z).

%FUNCION COMPUESTA
funcion(X,Y):- X < 0,Y is -1*X,!.
funcion(X,0):- X == 0,!.
funcion(X,X):- X>0.


%CONSEGUIR UN MAXIMO
terna(X,Y):-numero(X),numero(Y).
seleccion(X,Y):-terna(X,Y),X<Y.
proyeccion(X):-seleccion(X,_).
maximo(X):-numero(X),not(proyeccion(X)).

%CONSEGUIR EL MES DE MAYOR IMPORTE DE VENTAS:

ventas(enero,1342).
ventas(febrero,4231).
ventas(marzo,5121).
ventas(abril,5121).
ventas(mayo,5121).


terna1(X,Y):-ventas(_,X),ventas(_,Y).
seleccion1(X,Y):-terna1(X,Y),X<Y.
proyeccion1(X):-seleccion1(X,_).
maximo1(M,X):-ventas(M,X),not(proyeccion1(X)).























