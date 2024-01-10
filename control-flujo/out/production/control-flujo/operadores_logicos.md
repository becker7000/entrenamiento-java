# Operadores lógicos

Estos operadores generan circuitos de ejecución 
del código.

Operador NOT (!): este operador es *unario* y es 
*prefijo*, su lógica es que devuelve un valor 
falso si la expresión es verdadera y viceversa.

```
    x   !x
    V    F
    F    V
```

Operador AND (&&): este operador es *binario* y es
*infijo*, su lógica es que devuelve un valor
verdadero si y sólo si ambas expresiones son 
verdaderas, falso en cualquier otro caso.

```
    x   y    x&&y
    V   V     V
    V   F     F
    F   V     F
    F   F     F
```

Operador OR(||): este operador es *binario* y es
*infijo*, su lógica es que devuelve un valor
verdadero si por lo menos una de sus expresiones 
es verdadera, falso en cualquier otro caso.

```
    x   y    x||y
    V   V     V
    V   F     V     
    F   V     V
    F   F     F
```

*Nota: * el número de resultados de una tabla
de verdad depende del número de expresiones (x,y,z...)
el número de resultados será siempre 2 elevado 
a la número de expresiones.


