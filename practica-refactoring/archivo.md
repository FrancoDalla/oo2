<h1>EJERCICIO 1: Algo huele mal</h1>

Malos olores en el codigo:


<h2>1.1 Protocolo de cliente: </h2>

/** 
* Retorna el límite de crédito del cliente
*/
public double lmtCrdt() {...

/** 
* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtFcE(LocalDate f1, LocalDate f2) {...

/** 
* Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2
*/
private double mtCbE(LocalDate f1, LocalDate f2) {...


RTA:
¿mtFcE y mtCbE son lo mismo?
Si esto es lo que hay que observar ¿Que refactorings se pueden aplicar?

    >Extract method:
        -Crear nuevo metodo que explique el propósito.
        -Copiar el código a extraer al nuevo método.
        -Revisar las variables locales del original.
        -Si se usa solo en el código extraído, mover la declaración.
        -Revisar si alguna variable local es modificada por el código extraido. Si es solo una,
          tratar como query y asignar. Si hay más de una no se puede extraer.
        -Pasar como parámetro las variables que el método nuevo lee.
    
    >Pull up method:
        -Asegurarse de que los metodos sean idénticos. Si no, parametrizar.
        -Si el selector del método es diferente en cada subclase, renombrar.
        -Si el método llama a otro que no está en la superclase, declararlo como abstracto en la
          superclase, declararlo como abstracto en la superclase.
        -Si el metodo llama a un atributo declarado en las subclases, usar "pull up field" o 
          "self encapsulate field" y declarar los getters abstractos en la superclase.
        -Crear un nuevo método en la superclase, copiar el cuerpo de uno de los métodos a el
          ajustar, compilar.
        -Borrar el método de una de las subclases.
        -Compilar y testear.

@@@@@@@@@@@@@

<h2>1.2 Participación en proyectos</h2>
Al revisar el siguiente diseño inicial (Figura 1), se decidió realizar un cambio para evitar lo que se consideraba un mal olor. El diseño modificado se muestra en la Figura 2. Indique qué tipo de cambio se realizó y si lo considera apropiado. Justifique su respuesta.

El tipo de cambio que se realizo es el refactoring de "move method". Considero que es el apropiado porque en su diseño inicial la clase persona cumple el mal olor de "Feature envy". 

@@@@@@@@@@@@@

<h2>1.3 Cálculos </h2>
Analizar el código a continuación. Indicar code smells y como corregirlos.

public void imprimirValores() {
	int totalEdades = 0;
	double promedioEdades = 0;
	double totalSalarios = 0;
	
	for (Empleado empleado : personal) {
		totalEdades = totalEdades + empleado.getEdad();
		totalSalarios = totalSalarios + empleado.getSalario();
	}
	promedioEdades = totalEdades / personal.size();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
}

rta:
En la explicación práctica sale como malos olores: 
    >long method
        >Es un metodo largo que podría ser dividido en distintas tareas (relacionado a la envidia de atributos que se plantea posteriormente)
    >reinventa la rueda.
        -Hace uso de un for con distintas operaciones cuando podría hacerse simplemente utilizando funciones lambda.
    >temporary field.
        -Se crean variables temporales e innecesarias en el codigo.
ademas, consultando con IA (deepsek) esta opina que el codigo no respeta el principio de responsabilidad unica ya que el metodo:
    >Calcula la suma de edades.
    >Calcula el promedio.
    >calcula la suma de salarios
    >formatea e imprime resultados

Opino con esto que los malos olores en este codigo son:
    >long method.
    >reinvención de la rueda
    >temporary field.
    >feature envy.

long method puede resolverse aplicando los refactoring:
    >Replace temp with query.(lo que tmabien resuelve temporary field)
    >Extract method (lo que también funcionara para feature envy).


<h1>EJERCICIO 2</h1>
Para cada ejercicio:
  1.Indicar mal olor
  2.Indicar refactorings a aplicar
  3.Aplicar, mostrar resultado final
  si se vuelve a encontrar mal olor volver a paso 1


<h2>2.1 Empleados</h2>

public class EmpleadoTemporario {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
public double sueldo() {
  return this.sueldoBasico
         +(this.horasTrabajadas * 500) 
         +(this.cantidadHijos * 1000) 
         -(this.sueldoBasico * 0.13);
  }

}

public class EmpleadoPlanta {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico 
              + (this.cantidadHijos * 2000)
              - (this.sueldoBasico * 0.13);
    }
}

public class EmpleadoPasante {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}

<h3>Malos olores</h3>
  >codigo duplicado
    -Todos los tipos de empleados tienen variables que son comunes entre ellos.
    -Todos los tipos de empleados tienen un metodo para calcular su sueldo.
      -Este metodo tiene comportamiento generico.

  >falta de jerarquía(relacionado con lo previo)
    -Hay razones de sobra para implementar una jerarquía.
  >falta de encapsulamiento
    -Las variables de todas las clases estan como publicas

<h3>Refactorings a aplicar</h3>
1.Extract superclass
  -Para corregir la falta de una jerarquía evidente.
2.Pull up field
  -Para volver común los datos que comparten estas variables.
    se haria con las variables nombre, apellido, sueldoBasico.
3.Encapsulate field
  -Para encapsular los datos de las mismas.
    Se haria con las variables compartidas en la superclase y las que quedan en los hijos.



<h3>RESULTADO</h3>



