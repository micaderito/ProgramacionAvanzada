es_hombre(pedro).
es_hombre(manuel).
es_hombre(arturo).
es_mujer(mar�a).
es_padre(pedro, manuel).
es_padre(pedro, arturo).
es_padre(pedro, mar�a) .

ni�o(X,Y):-es_padre(Y,X).
hijo(X,Y):-es_padre(Y,X),es_hombre(X).
hija(X,Y):-es_padre(Y,X),es_mujer(X).
hermano_o_hermana(X,Y):-ni�o(X,Z),ni�o(Y,Z),dif(X,Y).
hermano(X,Y):-ni�o(X,Z),ni�o(Y,Z),es_hombre(X),dif(X,Y).
hermana(X,Y):-ni�o(X,Z),ni�o(Y,Z),es_mujer(X),dif(X,Y).
