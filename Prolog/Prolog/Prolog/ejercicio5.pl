hombre(juan,alta,rubio,adulta).
hombre(jorge,baja,casta�o,joven).
hombre(jose,media,pelirrojo,vieja).
hombre(pedro,alta,negro,joven).
hombre(sergio,alta,rubio,adulta).

mujer(marta,media,rubio,joven).
mujer(julia,alta,casta�o,media).
mujer(pepa,alta,casta�o,media).
mujer(luisa,baja,negro,joven).
mujer(carla,baja,pelirrojo,adulta).
mujer(elsa,media,rubio,joven).

gusta(juan,pop,policiaca,tenis).
gusta(jorge,pop,aventura,natacion).
gusta(jose,jazz,aventura,natacion).
gusta(pedro,clasica,ciencia-ficcion,tenis).
gusta(sergio,jazz,policiaca,jogging).
gusta(marta,jazz,ciencia-ficcion,tenis).
gusta(julia,clasica,ciencia-ficcion,tenis).
gusta(luisa,pop,policiaca,joggin).
gusta(carla,clasica,policiaca,natacion).
gusta(elsa,clasica,aventura,tenis).
gusta(pepa,clasica,ciencia-ficcion,tenis).


busca(juan,media,rubio,adulta).
busca(jorge,alta,pelirrojo,vieja).
busca(jose,media,casta�o,adulta).
busca(pedro,alta,casta�o,media).
busca(sergio,baja,negro,vieja).
busca(luisa,media,casta�o,adulta).
busca(carla,alta,pelirrojo,vieja).
busca(elsa,baja,negro,vieja).
busca(marta,media,rubio,adulta).
busca(julia,alta,negro,joven).
busca(pepa,alta,negro,joven).


conviene_hombre(X,Y):-hombre(X,A1,C1,E1),mujer(Y,A2,C2,E2),gusta(X,M,L,D),gusta(Y,M,L,D),busca(X,A2,C2,E2),busca(Y,A1,C1,E1).
conviene_mujer(X,Y):-hombre(Y,A1,C1,E1),mujer(X,A2,C2,E2),gusta(Y,M,L,D),gusta(X,M,L,D),busca(Y,A2,C2,E2),busca(X,A1,C1,E1).

conviene(X,Y):-conviene_hombre(X,Y);conviene_mujer(X,Y).
