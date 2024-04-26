### **Patrón de Diseño Prototype**

El patrón de diseño Prototype es un patrón creacional que se utiliza para crear nuevos objetos a 
partir de un prototipo existente, evitando la necesidad de crear subclases para cada tipo de objeto
que se desea instanciar. En lugar de construir un objeto desde cero, el patrón Prototype permite clonar
un objeto existente y luego modificar sus propiedades según sea necesario.

### **_Principales Componentes del Patrón Prototype:_**

**Prototipo:** Define una interfaz o una clase abstracta que declara un método para clonarse a sí misma. 
Este prototipo actúa como el modelo base para la creación de nuevos objetos. 

**Implementación Concreta del Prototipo:** Clases concretas que implementan la interfaz o heredan de la 
clase abstracta del prototipo. Estas clases proporcionan la implementación específica de cómo clonarse 
a sí mismas.

### Ventajas del Patrón Prototype:

**Flexibilidad:** Permite la creación de nuevos objetos con configuraciones predefinidas sin necesidad de conocer
los detalles de su implementación.

**Eficiencia:** Reduce el tiempo y la complejidad asociados con la creación de nuevos objetos, especialmente cuando
la inicialización de un objeto es costosa.

**Facilidad de Extensión:** Facilita la creación de nuevas variantes de objetos al permitir la clonación y modificación
de prototipos existentes.

### Implementación en Java:

En Java, el patrón Prototype se implementa mediante la definición de una interfaz o clase abstracta que declare un 
método para clonarse a sí misma. Luego, las clases concretas que representan diferentes variantes de objetos 
implementan este método de clonación proporcionando su propia lógica de copia. Una vez creado el prototipo, 
los nuevos objetos se pueden crear mediante la clonación del prototipo y ajustando sus propiedades según sea
necesario.

### Sobre éste Proyecto - About This Repository:

Ahora bien acerca de la funcionalidad de éste Repositorio tenemos que éste: busca **_Clonar_** una cantidad 
de **_Objetos_** especifica, definiendo de antemano un objeto tipo **_Prototypo_** del producto a **_Clonar_**. Mediante el proceso 
de **Clonado** de los **_objetos_** buscamos llevar a cabo facil y rapidamente la **creacion de un sistema de** 
**_producción y manufactura_** de un lote de marcos para bicicletas o chasis tipo - Bmx,
aplicando los conceptos básicos de la Poo y el Patrón de diseño creacional **_Prototype_**, el cual hace uso
de la interfaz **_Cloneable_**, para clonar el prototypo especifico cuantas veces se requiera.

**_Diagrama PlantUml:_**

![img.png](img.png)

![img_1.png](img_1.png)

Cómo bien se observa, contamos con nuestro programa principal llamado: **_Main_**, una Clase adicional 
llamada **_FrameDesign_**, desde la cual se capturan los datos a través de, métodos de **_entrada (Scanner)**_ 
ingresados por el usuario. Además tenemos: la **_Clase FramesBmx_** mediante la cual representaremos 
el objeto que vamos a proceder a: **_Crear, Prototypar y Clonar_** multiples veces haciendo uso del **_Patrón_**
de diseño creacional **_Prototype_**. Siguiendo el **_diagrama Uml_**, tenemso que nuestra Clase **_FramesBmx_** **_Implementa_**
una **_Interfaz nativa, llamada Cloneable(I)_**, proporcionada por la JDK de Java y es a través de ésta, que 
podemos Clonar nuevos objetos, fácilmente.

Clonar un objeto será tan sencillo como lanzar una excepción controlada como la siguiente:

try {
      FramesBmx clonado = framesBmx.clonar();
      clonado.id = clonado.id + 1;
      System.out.println("\nid Clone: " + clonado.id + "\nClone Size Frame clone: " + clonado.sizeWheel + "\nSize Superior tube: " + clonado.sizeTubeSup + "\nWeight Frame Clone: " + clonado.weightFrame + "\nType Box Frame Clone: " + clonado.typeBox + "\nClone Frame Color: " + clonado.color + "\nMaterial Clone Frame: " + clonado.material);
    } catch (CloneNotSupportedException e){
      System.out.println("El objeto no se puede Clonal: " + e.getMessage());
}

En este ejemplo **_clonamos**_ un Objeto **_(Prototypo)_** previamente definido, pero ahora le modificamos únicamente su id
consecutivamente en la medida que se van generando nuevos clones. Así hemos desarrollado mediante un nuevo tipo
de Patrón de diseño creacional, la capacidad de crear nuevos Objetos, Clonados a partir de un objeto especifico
tipo (Prototypo).

**_Pantallazos de los resultados por Consola:_**

![img_5.png](img_5.png)

![img_6.png](img_6.png)

![img_7.png](img_7.png)

![img_8.png](img_8.png)

![img_9.png](img_9.png)