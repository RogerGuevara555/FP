/**
 * EJERCICIOS — ELEMENTOS DEL LENGUAJE JAVA
 * Unidad: Sintaxis, operadores, variables, delimitadores y tipos de datos
 * Módulo: Programación — 1º DAM
 *
 * INSTRUCCIONES:
 * - Lee el enunciado de cada ejercicio (en los comentarios).
 * - Escribe tu código justo debajo del enunciado, dentro del bloque indicado.
 * - Cada ejercicio va dentro de su propio método estático.
 * - Para probar un ejercicio, llámalo desde el método main().
 *
 * @author  (escribe tu nombre aquí)
 * @version 1.0
 */

// import java.util.Scanner;

public class EjerciciosElementosJavaMon {

    public static void main(String[] args) {

       // =========================================================================
    // BLOQUE 1 — VARIABLES Y TIPOS DE DATOS (ejercicios 01 al 07)
    // =========================================================================

    // -------------------------------------------------------------------------
    // EJERCICIO 01 — Declaración e inicialización de variables
    // -------------------------------------------------------------------------
    // Declara una variable de cada tipo primitivo:
    //   int, double, boolean, char, long, float, byte, short
    // Asígnales un valor con sentido y muéstralas por pantalla
    // con System.out.println(), indicando el tipo en cada línea.
    //
    // Ejemplo de salida esperada:
    //   int:     42
    //   double:  3.14
    //   boolean: true
    //   ...
    // -------------------------------------------------------------------------
    byte numeroMuyCorto = 1;
    short numeroCorto = 10;
    int numero = 14;
    long enteroLargo = 120000000;
    float decimal = 2.71f;
    double decimalLargo = 3.1413;
    char letra = 'r';
    boolean estaLloviendo = false;
    //System.err.println(numeroMuyCorto + " byte");
    //System.err.println(numeroCorto + " short");
    //System.err.println(numero + " int");
    //System.err.println(enteroLargo + " long");
    //System.err.println(decimal + " float");
    //System.err.println(decimalLargo + " double");
    //System.err.println(letra + " char");
    //System.err.println(estaLloviendo + " boolean");
    //System.out.println();

    

    // -------------------------------------------------------------------------
    // EJERCICIO 02 — Variables final (constantes)
    // -------------------------------------------------------------------------
    // Declara tres constantes usando la palabra reservada final:
    //   - El valor de PI (3.141592653589793)
    //   - El número de meses del año (12)
    //   - El límite de velocidad en autopista en España (120)
    //
    // Muéstralas por pantalla.
    // Después, intenta modificar una de ellas y observa el error del compilador.
    // Comenta esa línea y explica el error en un comentario de línea.
    // -------------------------------------------------------------------------

    final double PI = 3.141592653589793;
    final int MESES_DEL_AÑO = 12;
    final int VELOCIDAD_LIMITE = 120;

    // MESES_DEL_AÑO = 13; las constantes no pueden ser reasignadas

    //System.out.println(PI);
    //System.out.println(MESES_DEL_AÑO);
    //System.out.println(VELOCIDAD_LIMITE);
    //System.out.println();

    // -------------------------------------------------------------------------
    // EJERCICIO 03 — Rango de tipos numéricos
    // -------------------------------------------------------------------------
    // Usando las constantes de las clases envoltorio, muestra los valores
    // máximo y mínimo de: byte, short, int y long.
    //   Pista: Integer.MAX_VALUE, Integer.MIN_VALUE, Byte.MAX_VALUE ...
    //
    // A continuación, ejecuta esta operación y observa qué ocurre:
    //   int maximo = Integer.MAX_VALUE;
    //   int desbordamiento = maximo + 1;
    // Muestra el resultado e intenta explicar por qué ocurre en un comentario.
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // EJERCICIO 04 — Variables de tipo String
    // -------------------------------------------------------------------------
    // Crea una variable String con tu nombre completo.
    // A partir de ella, muestra por pantalla:
    //   1. Su longitud (número de caracteres), usando .length()
    //   2. La primera letra, usando .charAt(0)
    //   3. El nombre en mayúsculas, usando .toUpperCase()
    //   4. El nombre en minúsculas, usando .toLowerCase()
    //   5. Si contiene la subcadena "ar" (o elige otra), usando .contains()
    //   6. La posición de la primera vocal 'a' (o la que elijas), usando .indexOf()
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // EJERCICIO 05 — Literales y notación especial
    // -------------------------------------------------------------------------
    // Declara un entero usando notación hexadecimal  (ejemplo: 0xFF)
    // Declara otro entero usando notación octal       (ejemplo: 017)
    // Declara otro entero usando notación binaria     (ejemplo: 0b1010)
    // Muéstralos en decimal con //System.out.println().
    //
    // Después, declara variables char con los caracteres de escape:
    //   '\n'  '\t'  '\\'  '\''  '\"'
    // Muestra su valor numérico (cástealos a int) y explica cada uno
    // con un comentario de línea.
    // -------------------------------------------------------------------------



    // -------------------------------------------------------------------------
    // EJERCICIO 06 — Inferencia de tipo con var (Java 10+)
    // -------------------------------------------------------------------------
    // Declara cinco variables usando la palabra reservada var, con valores
    // de distintos tipos (entero, decimal, texto, booleano, char).
    //
    // Para cada una, muestra el tipo inferido así:
    //   //System.out.println(miVariable.getClass().getSimpleName());
    // (Nota: getClass() no funciona con tipos primitivos; var los infiere
    //  como tipos primitivos, así que úsalo con tipos de referencia o
    //  comenta qué tipo esperarías en cada caso.)
    //
    // Pregunta a responder en un comentario:
    //   ¿Puedes declarar una variable var sin inicializarla? ¿Por qué?
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // EJERCICIO 07 — Ámbito de variables (scope)
    // -------------------------------------------------------------------------
    // Demuestra el concepto de ámbito con tres tipos de variables:
    //   1. Una variable de clase (campo estático), declarada fuera de este método.
    //      Accede a ella desde aquí usando NombreClase.campo o directamente.
    //   2. Una variable local declarada dentro de este método.
    //   3. Una variable declarada dentro de un bloque anidado { }.
    //
    // Intenta acceder a la variable del bloque anidado fuera de él.
    // Comenta esa línea y explica el error con un comentario.
    // -------------------------------------------------------------------------

    // PISTA: declara aquí tu campo estático de clase para el ejercicio 07:
    // static int variableDeClase = 99;



    // =========================================================================
    // BLOQUE 2 — OPERADORES (ejercicios 08 al 14)
    // =========================================================================

    // -------------------------------------------------------------------------
    // EJERCICIO 08 — Operadores aritméticos y módulo
    // -------------------------------------------------------------------------
    // Lee un número entero por teclado con Scanner.
    // A partir de él, muestra:
    //   1. Si es par o impar (usa el operador %)
    //   2. El cociente y el resto de dividirlo entre 7
    //   3. Su cuadrado usando Math.pow() — recuerda el casting necesario
    //   4. Su raíz cuadrada con Math.sqrt()
    //
    // Ejemplo de salida para el número 25:
    //   25 es impar
    //   25 / 7 = 3, resto = 4
    //   25 al cuadrado = 625
    //   Raíz cuadrada de 25 = 5.0
    // -------------------------------------------------------------------------



    // -------------------------------------------------------------------------
    // EJERCICIO 09 — Operadores de incremento y decremento
    // -------------------------------------------------------------------------
    // Declara una variable entera i = 5.
    // Demuestra la diferencia entre i++ y ++i:
    //   - Muestra el valor que se imprime al hacer: //System.out.println(i++)
    //   - Muestra el valor que se imprime al hacer: //System.out.println(++i)
    //
    // Crea un ejemplo propio donde el orden importa en una expresión:
    //   int a = 3;
    //   int b = a++ * 2;
    //   int c = ++a * 2;
    // Muestra a, b y c después de cada operación y explica por qué tienen
    // ese valor en un comentario.
    // -------------------------------------------------------------------------

    int i = 5;
    //System.out.println(i++);
    //System.out.println(++i);

    int a = 3;
    int b = a++ * 2;
    int c = ++a * 2;

    //System.out.println(a);
    //System.out.println(b);
    //System.out.println(c);
    //System.out.println();

    // -------------------------------------------------------------------------
    // EJERCICIO 10 — Operadores de asignación compuesta
    // -------------------------------------------------------------------------
    // Parte de x = 100. Aplica en secuencia y muestra el resultado tras cada paso:
    //   x += 50    (suma y asigna)
    //   x -= 30    (resta y asigna)
    //   x *= 2     (multiplica y asigna)
    //   x /= 4     (divide y asigna)
    //   x %= 7     (módulo y asigna)
    //
    // Resultado esperado (comenta los valores que calcules a mano antes
    // de ejecutarlo):
    //   Tras +=50 : ?
    //   Tras -=30 : ?
    //   ...
    // -------------------------------------------------------------------------

    int x = 100;
    x += 50; // 150
    //System.out.println(x);
    x -= 30; // 120
    //System.out.println(x);
    x *= 2;  // 240
    //System.out.println(x);
    x /= 4;  // 60
    //System.out.println(x);
    x %= 7;  // 4
    //System.out.println(x);
    //System.out.println();

    // -------------------------------------------------------------------------
    // EJERCICIO 11 — Operadores relacionales y lógicos
    // -------------------------------------------------------------------------
    // Con las variables: int a = 5, b = 10, c = 5
    // Evalúa y muestra el resultado (true/false) de al menos 8 expresiones
    // que combinen: ==  !=  >  <  >=  <=  &&  ||  !
    //
    // Ejemplos (crea al menos 5 más propios):
    //   a == c        → ?
    //   a != b        → ?
    //   a > 0 && b < 20  → ?
    //   !(a == b)     → ?
    //
    // Para cada resultado que sea inesperado, añade un comentario explicando
    // por qué el compilador lo evalúa así.
    // -------------------------------------------------------------------------

    a = 5;
    b = 10;
    c = 5;

    //System.out.println(a == c);  // true
    //System.out.println(a != b);  // true
    //System.out.println(a > 0 && b < 20);  // true
    //System.out.println(!(a == b));  // true
  
    //System.out.println(!(a == b) || a > 0 && b < 20);  // true
    //System.out.println(!(!(5 < b || b < 20)));  // true
    //System.out.println(a+c >= 2*a);  // true
    //System.out.println(50 <= 10*c);  // true
    //System.out.println(b==b && c>=a+1);  // false

    // -------------------------------------------------------------------------
    // EJERCICIO 12 — Operador ternario
    // -------------------------------------------------------------------------
    // Reescribe los siguientes tres casos como expresiones ternarias
    // (condición ? valor_si_true : valor_si_false):
    //
    //   CASO 1: Máximo de dos números leídos por teclado
    //           Si a > b → "El mayor es a", si no → "El mayor es b"
    //
    //   CASO 2: "Mayor de edad" si edad >= 18, si no "Menor de edad"
    //
    //   CASO 3: Signo de un número: "positivo", "negativo" o "cero"
    //           (ternario anidado)
    //
    // No uses if-else. Solo operadores ternarios.
    // -------------------------------------------------------------------------



    // -------------------------------------------------------------------------
    // EJERCICIO 13 — Operadores bit a bit
    // -------------------------------------------------------------------------
    // Declara: int a = 0b00001100   (12 en decimal)
    //          int b = 0b00001010   (10 en decimal)
    //
    // Calcula y muestra en binario (usa Integer.toBinaryString()) el resultado de:
    //   a & b    AND bit a bit
    //   a | b    OR  bit a bit
    //   a ^ b    XOR bit a bit
    //   ~a       NOT bit a bit
    //   a << 2   desplazamiento a la izquierda 2 posiciones
    //   a >> 1   desplazamiento a la derecha 1 posición
    //
    // Para cada operación, muestra también el resultado en decimal.
    // Explica con un comentario qué representa cada operación.
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // EJERCICIO 14 — Precedencia de operadores
    // -------------------------------------------------------------------------
    // PARTE A — Sin ejecutar, predice el resultado de cada expresión.
    // Escribe tu predicción en un comentario junto a cada línea,
    // luego ejecuta y comprueba:
    //
    //   int r1 = 2 + 3 * 4;                    // predicción: ?
    //   int r2 = 10 / 2 + 3 * 2 - 1;           // predicción: ?
    //   boolean r3 = true || false && false;    // predicción: ?
    //   boolean r4 = 8 > 3 + 4;                // predicción: ?
    //
    // PARTE B — Añade paréntesis para que cada expresión dé un resultado
    // diferente al original. Muestra ambos resultados.
    // -------------------------------------------------------------------------

    int r1 = 2 + 3 * 4;                    // predicción: 14
    int r2 = 10 / 2 + 3 * 2 - 1;           // predicción: 10
    boolean r3 = true || false && false;    // predicción: true
    boolean r4 = 8 > 3 + 4;                // predicción: true
    
    //System.out.println(r1);
    //System.out.println(r2);
    //System.out.println(r3);
    //System.out.println(r4);
    //System.out.println();
    
    r1 = (2 + 3) * 4;                    // predicción: 20
    r2 = 10 / (2 + 3) * (2 - 1);           // predicción: 2
    r3 = (true || false) && false;    // predicción: false
    r4 = (8 > ((3) + (4)));                // predicción: true
    
    //System.out.println(r1);
    //System.out.println(r2);
    //System.out.println(r3);
    //System.out.println(r4);
    //System.out.println();

    // =========================================================================
    // BLOQUE 3 — SINTAXIS Y ESTRUCTURA (ejercicios 15 al 19)
    // =========================================================================

    // -------------------------------------------------------------------------
    // EJERCICIO 15 — Estructura mínima de un programa Java
    // -------------------------------------------------------------------------
    // Este ejercicio se realiza FUERA de este archivo.
    //
    // Pasos:
    //   1. Abre un editor de texto (o usa el terminal de tu IDE).
    //   2. Crea un archivo nuevo llamado HolaMundo.java
    //   3. Escribe manualmente (sin copiar) la estructura mínima:
    //        - Declaración de clase pública
    //        - Método main con su firma correcta
    //        - Una línea que imprima "Hola, mundo!"
    //   4. Desde la terminal, compila con:   javac HolaMundo.java
    //   5. Ejecuta con:                       java HolaMundo
    //
    // Cuando lo hayas conseguido, vuelve aquí y escribe en este método
    // un comentario describiendo los pasos que seguiste y cualquier error
    // que hayas encontrado.
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // EJERCICIO 16 — Comentarios y Javadoc
    // -------------------------------------------------------------------------
    // Toma el código del ejercicio 08 y añade dentro de este método:
    //   1. Un comentario de línea (// ...) explicando una instrucción concreta
    //   2. Un bloque de comentario multilínea (/* ... */) describiendo
    //      el algoritmo general
    //   3. Un comentario Javadoc (/** ... */) sobre el propio método ejercicio16,
    //      con las etiquetas: @author, @version, @param (aunque no tenga params,
    //      explica por qué no los tiene)
    //
    // Reescribe aquí la solución del ejercicio 08 con todos los comentarios.
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // EJERCICIO 17 — Convenciones de nomenclatura
    // -------------------------------------------------------------------------
    // Identifica el error de convención en cada declaración y corrígela.
    // Para cada una escribe: la declaración incorrecta (comentada),
    // la declaración correcta y un comentario que explique la regla.
    //
    // Declaraciones con errores:
    //   int Edad
    //   final double pi_value = 3.14
    //   String nombre_Completo = "Ana"
    //   class miclase { }         (solo como comentario, no la declares aquí)
    //   int MAX_intentos = 3
    //
    // Reglas a aplicar: camelCase para variables, UPPER_SNAKE_CASE para
    // constantes, PascalCase para clases.
    // -------------------------------------------------------------------------
    
    //int Edad
    //final double pi_value = 3.14
    //String nombre_Completo = "Ana"
    //class miclase { }         (solo como comentario, no la declares aquí)
    //int MAX_intentos = 3
    
    int edad; // en camelCase 
    final double PI_VALUE = 3.14; // en UPPER_SNAKE_CASE
    String nombreCompleto = "Ana"; // en camelCase
    //class MiClase { }     en PascalCase
    final int MAX_INTENTOS = 3;
    

    // -------------------------------------------------------------------------
    // EJERCICIO 18 — Delimitadores y bloques de código
    // -------------------------------------------------------------------------
    // Escribe un pequeño programa que use correctamente:
    //   { }  — delimitadores de bloque
    //   ( )  — paréntesis en llamadas a métodos y condiciones
    //   [ ]  — corchetes (declara un array aunque sea pequeño)
    //   ;    — fin de instrucción
    //
    // PARTE OPCIONAL (hazlo en una copia aparte para no romper este archivo):
    //   Elimina deliberadamente un delimitador de cada tipo y documenta
    //   aquí (en comentarios) el mensaje de error que produce el compilador
    //   en cada caso.
    // -------------------------------------------------------------------------



    // -------------------------------------------------------------------------
    // EJERCICIO 19 — Entrada por teclado con Scanner
    // -------------------------------------------------------------------------
    // Crea un programa que pida al usuario los siguientes datos:
    //   - Nombre completo     (String  → usa nextLine())
    //   - Edad                (int     → usa nextInt())
    //   - Altura en metros    (double  → usa nextDouble())
    //
    // ATENCIÓN: hay un problema conocido al mezclar nextInt()/nextDouble()
    // con nextLine(). Investiga por qué ocurre y resuélvelo.
    //
    // Muestra los datos con printf() usando formato:
    //   "Nombre: %-20s | Edad: %3d años | Altura: %.2f m%n"
    //
    // Cierra el Scanner al final con sc.close().
    // -------------------------------------------------------------------------


    // =========================================================================
    // BLOQUE 4 — CONVERSIÓN DE TIPOS (ejercicios 20 al 22)
    // =========================================================================

    // -------------------------------------------------------------------------
    // EJERCICIO 20 — Casting implícito (widening / promoción)
    // -------------------------------------------------------------------------
    // Demuestra la conversión automática recorriendo la cadena:
    //   byte → short → int → long → float → double
    //
    // Pasos:
    //   1. Declara un byte con valor 42.
    //   2. Asígnalo a un short (sin casting explícito).
    //   3. Asigna ese short a un int, el int a un long, etc.
    //   4. Muestra cada variable confirmando que el valor se conserva.
    //
    // También demuestra la promoción en expresiones: ¿qué tipo devuelve
    // sumar un int y un double? Usa getClass() o razona con un comentario.
    // -------------------------------------------------------------------------

    byte num = 42;
    short num2 = num;
    int num3 = num2;
    long num4 = num3;
    float num5 = num4;
    double num6 = num5;

    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);
    System.out.println(num6);

    // -------------------------------------------------------------------------
    // EJERCICIO 21 — Casting explícito (narrowing) y pérdida de datos
    // -------------------------------------------------------------------------
    // Realiza y documenta las siguientes conversiones con cast explícito:
    //
    //   CASO 1: double → int
    //     double d = 9.99;
    //     ¿Qué valor tiene (int) d? ¿Se redondea o se trunca?
    //
    //   CASO 2: int → byte con desbordamiento
    //     int grande = 130;
    //     ¿Qué valor tiene (byte) grande? Explica el resultado.
    //
    //   CASO 3: char ↔ int
    //     Muestra el código ASCII/Unicode de los chars 'A', 'a', '0'.
    //     Y al revés: muestra el char correspondiente a los ints 65, 90, 48.
    //
    // Para cada caso, escribe un comentario que explique la pérdida de datos.
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // EJERCICIO 22 — Conversión entre String y tipos primitivos
    // -------------------------------------------------------------------------
    // PARTE A — De String a tipo primitivo (parsing):
    //   String num1 = "42";
    //   String num2 = "3.14";
    //   String flag = "true";
    //   Conviértelos al tipo correspondiente con parseInt, parseDouble, parseBoolean.
    //   Suma num1 + 8 y muestra el resultado.
    //
    // PARTE B — De tipo primitivo a String:
    //   Convierte un int, un double y un boolean a String usando:
    //     - String.valueOf()
    //     - Concatenación con "" (cadena vacía)
    //   ¿Producen el mismo resultado? Compruébalo con equals().
    //
    // PARTE C — Manejo de error:
    //   Intenta parsear "abc" como entero. ¿Qué excepción lanza?
    //   Documéntalo en un comentario (no hace falta capturarla todavía).
    // -------------------------------------------------------------------------


    // =========================================================================
    // BLOQUE 5 — EJERCICIOS MIXTOS E INTEGRADORES (ejercicios 23 al 25)
    // =========================================================================

    // -------------------------------------------------------------------------
    // EJERCICIO 23 — Calculadora de IMC
    // -------------------------------------------------------------------------
    // Lee por teclado el peso en kg (double) y la altura en metros (double).
    //
    // Calcula el Índice de Masa Corporal:
    //   IMC = peso / (altura * altura)
    //
    // Muestra el IMC con exactamente 2 decimales.
    //
    // Clasifica el resultado usando el operador ternario (o variables auxiliares):
    //   IMC < 18.5          → "Bajo peso"
    //   18.5 ≤ IMC < 25.0   → "Peso normal"
    //   25.0 ≤ IMC < 30.0   → "Sobrepeso"
    //   IMC ≥ 30.0          → "Obesidad"
    //
    // Ejemplo de salida:
    //   Peso: 70.0 kg | Altura: 1.75 m
    //   IMC: 22.86 → Peso normal
    // -------------------------------------------------------------------------
 

    // -------------------------------------------------------------------------
    // EJERCICIO 24 — Conversor de temperaturas y unidades
    // -------------------------------------------------------------------------
    // Declara las siguientes constantes de conversión:
    //   final double FACTOR_PIES_A_METROS = 0.3048;
    //   final double FACTOR_MS_A_KMH      = 3.6;
    //
    // Implementa (usando variables, operadores y casting) las conversiones:
    //   1. Celsius  → Fahrenheit:  F = C * 9/5 + 32
    //      ATENCIÓN: ¿qué ocurre si usas 9/5 con enteros? Soluciona el problema.
    //   2. Fahrenheit → Celsius:   C = (F - 32) * 5/9
    //   3. Kelvin   → Celsius:     C = K - 273.15
    //   4. Metros   → Pies
    //   5. km/h     → m/s
    //
    // Lee los valores por teclado y muestra los resultados con 2 decimales.
    // -------------------------------------------------------------------------
 


    // -------------------------------------------------------------------------
    // EJERCICIO 25 — Análisis de una expresión matemática compleja
    // -------------------------------------------------------------------------
    // Lee dos enteros a y b por teclado (los catetos de un triángulo rectángulo).
    //
    // Evalúa esta expresión (hipotenusa redondeada a 2 decimales):
    //   double resultado = (int)(Math.sqrt(a*a + b*b) * 100) / 100.0;
    //
    // TAREA PRINCIPAL: analiza paso a paso todas las conversiones de tipo
    // que ocurren en esa expresión. Para cada subexpresión, indica en un
    // comentario el tipo resultante:
    //
    //   a * a                      → tipo: ?
    //   a*a + b*b                  → tipo: ?
    //   Math.sqrt(a*a + b*b)       → tipo: ?
    //   ... * 100                  → tipo: ?
    //   (int)(... * 100)           → tipo: ?, ¿se pierde información?
    //   (int)(...) / 100.0         → tipo: ?, ¿por qué divide bien?
    //
    // Comprueba tu análisis imprimiendo el resultado para a=3, b=4 (debe dar 5.0)
    // y para a=1, b=1 (debe dar 1.41).
    // -------------------------------------------------------------------------

    }  // end of main

} // end of class
