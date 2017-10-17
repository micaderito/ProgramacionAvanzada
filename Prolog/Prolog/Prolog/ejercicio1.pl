es_entrada(paella).
es_entrada(gazpacho).
es_entrada(consome).

es_carne(filete_de_cerdo).
es_carne(pollo_asado).

es_pescado(trucha).
es_pescado(bacalao).

es_postre(flan).
es_postre(helado).
es_postre(pastel).

es_bebida(vino).
es_bebida(cerveza).
es_bebida(agua_mineral).

es_plato_principal(X):-es_pescado(X);es_carne(X).

es_menu(X,Y,Z):-es_entrada(X),es_plato_principal(Y),es_postre(Z).
es_menu1(X,Y,Z,W):-es_entrada(X),es_plato_principal(Y),es_postre(Z),es_bebida(W).
es_menu_consome(X,Y,Z,W):-es_menu1(X,Y,Z,W),X==consome.
es_menu_sinflan(X,Y,Z,W):-es_menu1(X,Y,Z,W),not(Z==flan).

