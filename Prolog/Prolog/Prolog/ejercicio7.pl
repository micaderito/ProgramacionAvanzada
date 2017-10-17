es_entrada(paella,50).
es_entrada(gazpacho,25).
es_entrada(consome,65).

es_carne(filete_de_cerdo,110).
es_carne(pollo_asado,150).

es_pescado(trucha,69).
es_pescado(bacalao,47).

es_postre(flan,500).
es_postre(helado,250).
es_postre(pastel,750).

es_bebida(vino,250).
es_bebida(cerveza,350).
es_bebida(agua_mineral,100).

es_plato_principal(X,C):-es_pescado(X,C);es_carne(X,C).

es_menu(X,Y,Z,W):-es_entrada(X),es_plato_principal(Y),es_postre(Z),es_bebida(W).

calorias_menu(X,Y,Z,W,C):-es_entrada(X,C1),es_plato_principal(Y,C2),es_postre(Z,C3),es_bebida(W,C4),suma(C,C1,C2,C3,C4).

suma(S,S1,S2,S3,S4):-S is S1+S2+S3+S4.

terna(X,Y):-calorias_menu(_,_,_,_,X),calorias_menu(_,_,_,_,Y).
seleccion(X,Y):-terna(X,Y),X>Y.
proyeccion(X):-seleccion(X,_).
menor(X,Y,Z,W,C):-calorias_menu(X,Y,Z,W,C),not(proyeccion(C)).
