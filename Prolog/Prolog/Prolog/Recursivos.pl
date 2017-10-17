factorial(0,1):-!.
factorial(X,Y):-X>0, X1 is X - 1, factorial(X1,Y1), Y is X * Y1.

fibonacci(0,1):-!.
fibonacci(1,1):-!.
fibonacci(N,F):-N1 is N - 1, fibonacci(N1, F1),N2 is N - 2, fibonacci(N2, F2), F is F1 + F2.

producto_por_sumas(X,1,P):-P is X,!.
producto_por_sumas(X,Y,P):-Y1 is Y - 1, producto_por_sumas(X,Y1,P1), P is P1 + X.

potencia_por_productos(X,1,P):-P is X,!.
potencia_por_productos(X,Y,P):-Y1 is Y - 1, producto_por_sumas(X,Y1,P1), P is P1 * X.

gauss(1,1):-!.
gauss(X,R):-X1 is X - 1, gauss(X1,R1), R is R1 + X.

cociente_por_restas(X,Y,0):-X<Y,!.
cociente_por_restas(X,Y,R):-X1 is X - Y,cociente_por_restas(X1,Y,R1),R is R1 + 1.

mcd(X,X,X):-!.
mcd(X,Y,Z):-X<Y, Y1 is Y - X, mcd(X,Y1,Z),!.
mcd(X,Y,Z):-Y<X, mcd(Y,X,Z).
