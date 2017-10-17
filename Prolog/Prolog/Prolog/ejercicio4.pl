es_transporte(roma,20).
es_transporte(londres,30).
es_transporte(tunez,10).

es_alojamiento(roma,hotel,50).
es_alojamiento(roma,hostal,30).
es_alojamiento(roma,camping,10).
es_alojamiento(londres,hotel,60).
es_alojamiento(londres,hostal,40).
es_alojamiento(londres,camping,20).
es_alojamiento(tunez,hotel,40).
es_alojamiento(tunez,hostal,20).
es_alojamiento(tunez,camping,5).

multiplicar(P,X,Y):-P is X*Y.
sumar(S,X,Y):-S is X+Y.
menor(X,Y):-X<Y.

viaje(C,S,H,P):-es_alojamiento(C,H,PA),es_transporte(C,PT),multiplicar(PAS,S,PA),sumar(P,PAS,PT).

viajeeconomico(C,S,H,P,Pmax):-viaje(C,S,H,P),menor(P,Pmax).
