# Inventario Programación Orientada a Objetos.
Este repositorio contiene el Diagrama de clase sobre el Módulo de Invetario de un restaurante.
# Docente de la materia:
Ing. Edison Coronel.
# Los integrantes del grupo son: 
- Tayron Morales.
  tayron.morales@unl.edu.ec
- Mathias Medina. 
  mathias.medina@unl.edu.ec
- Santiago Villamagua.
  santiago.villamagua@unl.edu.ec
- Leonardo Sánchez.
  leonardo.sanchez@unl.edu.ec
- Luis Blacio.
  luis.blacio@unl.edu.ec
# Descripción 
El siguiente diagrama de clases continen los siguientes requerimientos:
- Registrar todos los insumos del restaurante, con información como nombre, cantidad, unidad de medida y nivel de reorden.
- Permitir registrar entradas al inventario (compras de insumos) y salidas del inventario (uso de insumos).
- Actualizar en tiempo real la cantidad disponible de cada insumo según el uso en los pedidos.
- Generar alertas automáticas cuando la cantidad de un insumo está por debajo del nivel de reorden.
- Generar reportes sobre el consumo de insumos en un período determinado, permitiendo identificar los más utilizados.
- Mantener un historial de las entradas y salidas para fines de auditoría y control.


# Diagrama Visual Paradimg 

![](https://github.com/Tayron2024/Inventario-POO/blob/main/Captura%20de%20pantalla%202024-11-24%20235152.png)


**Link del diagrama para ver más claro**

[https://drive.google.com/file/d/18Kq8SLEKILQhCcDv8P9eVicaKOjdHkyM/view?usp=sharing](https://drive.google.com/file/d/1wfMxD3OUQ34B9QFpzEsLgm_LE8zuqh4E/view?usp=sharing)


# Analisis del Diagrama

# Módulo de Inventario para Restaurante
## Descripción General
El módulo de inventario gestiona los insumos y productos necesarios para la preparación de platos en un restaurante, incorporando funcionalidades avanzadas para optimizar el seguimiento y control del inventario.

## Clases y Módulos Detallados

                                      
**1.Clase Insumo**
**Atributos:**

id: Identificador único del insumo.

nombre: Nombre del insumo.

cantidadDisponible: Cantidad actual en stock.

unidadMedida: Unidad de medida (kg, litros, unidades, etc.).

nivelReorden: Cantidad mínima para activar una alerta de reorden.

fechaVencimiento: Fecha de caducidad del insumo.

precioUnitario: Precio por unidad del insumo.

ubicacion: ubicacion del producto en el almacen

**Métodos:**

registrarInsumo()

actualizarCantidad(cantidad)

verificarReorden()

verificarVencimiento()


**2. Clase Inventario**
**Atributos:**

almacenamiento: almacen donde se guardan los insumos


**Métodos:**

agregarInsumo(insumo)

eliminarInsumo(insumo)

actualizarInventario()

generarAlertas()

obtenerValorTotalInventario(): Calcula el valor total de los insumos en inventario.


**3. Clase Alerta**
**Atributos:**

mensaje: Mensaje de alerta.

fecha: Fecha de alerta.

tipo: Tipo de alerta (bajo stock, vencimiento).


**Métodos:**

generarAlerta()

enviarNotificacion()

**4. Clase Administrador**
**Atributos**

revision: revision de bodega 

control: control de cantidad de insumos en inventario

**Metodos**

crearReporte():



**5. Clase ReporteConsumo**
**Atributos:**

tipo: Tipo de reporte.

periodoInicio: Fecha de inicio.

periodoFin: Fecha de fin.

datos: Datos del reporte.

**Métodos:**

generarReporte()

exportarReporte()


**6. ReporteBodega**
**Atributos:**

datos: reporte del inventario

tipo: tipo de insumo 

**Metodos:**

generarReporte():

actualizarReporte():

**7. Bodega**
**Atributos**

cantidadUtileria: Cantidad de utileria disponible.

cantidadCondimentos: Cantidad de condimentos disponibles.

cantidadVerduras: Cantidad de verduras disponibles.

cantidadCarnes: Cantidad de carnes disponibles.


**Metodos**
*Ninguno especificado*


**8. Clase Historial**
**Atributos:**

actualizacion: de Insumo, ReporteConsumo, ReporteBodega

**Métodos:**

registrarEntrada(entrada)

registrarSalida(salida)

consultarHistorial()


**9. Clase Proveedor**
**Atributos:**

email: Correo electrónico.

direccion: Dirección del proveedor.

contacto: Nombre del contacto.


**Métodos:**

registrarProveedor()

consultarProveedores()

actualizarProveedor()


**10. Clase Pedido**
**Atributos:**

cliente: Información del cliente.

fecha: Fecha del pedido.

estado: Estado del pedido (pendiente, completado, cancelado).

**Métodos:**

realizarPedido()

cancelarPedido()


**11. Clase Categoría**
*Descripción: Permite clasificar los insumos en categorías, facilitando la gestión del inventario.*
**Atributos:**

nombre: Nombre de la categoría.

descripcion: Descripción de la categoría.

**Métodos:**

registrarCategoria()

actualizarCategoria()

consultarCategorias()


**12. Clase Usuario**
*Descripción: Representa a los usuarios del sistema que gestionan el inventario.*
**Atributos:**

nombre: Nombre del usuario.

rol: Rol del usuario (administrador, empleado, etc.).

email: Correo electrónico.

**Métodos:**

registrarUsuario()

actualizarUsuario()

consultarUsuarios()


**13. Clase GestionInvetario**
**Atributos:**

*Ninguna Especificada*

**Métodos:**

agregarItem(ItemInventario item)

eliminarItem(ItemInventario item)

buscarItem(String nombre)

actualizar(): void


**14. Clase Producto** 
**Atributos**

nombre: Nombre del producto

precio: precio del Producto

**Métodos**

crearPlato():

actualizarPlato():

calcularCosto():


**15. Clase Persona**
**Atributos**

edad: Edad de la persona

nombre : Nombre de la persona.

apellido: Apellido de la persona.

**Métodos**

*no cuenta con metodos especificados*

**16. Clase Operacion**

fechaRegistro: fecha y hora en que se realiza la operación

cantidad: indica la canridad de insumos involucrados

costoTotal: Costo total relacionado con la operación.

motivoSalida: Especifica la razón de la operacion(salida de insumos).

## Reflexiones

**1. ABSTRACCION DE INVENTARIO**
En el diseño UML del módulo de "INVENTARIO", la abstracción se utiliza para representar conceptos clave de gestión de inventario y operaciones en un restaurante. Las clases como Inventario, Insumo, Producto y Pedido abstraen componentes esenciales del negocio, proporcionando una interfaz clara con métodos que reflejan las acciones que se pueden realizar en el sistema. Por ejemplo, Insumo encapsulo atributos como "cantidadDisponible " , "unidadMedida" y "fechaVencimiento, ofreciendo métodos como "actualizarCantidad" o "verificarVencimiento" para manipular estos datos de manera lógica. Esto permitió que el diseño se centrara en kos conportamientos relevantes sin incluir detalles de inplementación innescesarios en esta etapa.

**2.ENACPSULACION DE INVENTARIO**

La encapsulación se implementó al proteger los datos sensibles de cada clase y proporcionar acceso controlado mediante métodos públicos. Por ejemplo, la clase Inventario adminitra sus datos internos relacionados con bodega e insumos y exponen métodos como "agregarInsumo" y "obtenerValorTotalInventario". Así, los datos como la lista de insumos se mantienen privados y se modifican únicamente a través de métodos específicos que aseguran la integridad de la información. este enfoque minimiza el riesgo de acceso indebido o modificaciones incorrectas de los datos.

**3. HERENCIA DE INVENTARIO**
Se incluye herencia para represenatr relaciones entre entidades. Por ejemplo, la clase "Usuario" extiende de la clase "Persona", lo que evita redundancias al reutilizar atributos comunes como "nombre", "apellido" y "email". De forma similar, otras entidades podrían haber heredado funcionalidades comunes si el sistema crece en complejidad. Este diseño favorece la extensibilidad, ya que facilita la creación de nuevas clases que cokmparten características comunes conlas clases existentes.


**4. POLIMORFISMO**

Se puede evidenciar el uso del POLIMORFISMO en el uso de interfaces y métodos compartidos. Por ejemplo, la interfaz "GestionInventario" declara métodos como "agregarItem", "eliminarItem" y "buscarItem", los cuales pueden ser implementados por diferentes clases, permitiendo que cada clase maneje estas operaciones de acuerdo a su lógica específica. De la misma manera, el uso de métodos como "generarReporte" en clases como ReporteConsumo y ReporteBodega muestra cómo una misma acción puede tener diferentes implementaciones dependiendo del contexto.

**DESICIONES DE DISEÑO PARA INVENTARIO**

**1.Centralizacion del inventario:** 

La clase "Inventario" actúa como punto de control principal para gestionar "Insumo" y "Bodega". Esto asegura que las operaciones relacionadas con el inventario estén organizadas y centralizadas, evitando la duplicación de responsabilidades.

**2.SEPARACIÓN DE RESPONSABILIDADES:**  

Clases como "Historial" y "Operacionse" encargan de aspectos específicos del manejo de entradas y salidas, manteniendo el principio de responsabilidad única. Esto facilita el mantenimiento y evolución del sistema.

**3. REPORTES PERSONALIZABLES:** 

Al crear clases independientes para reportes ( "ReporteConsumo" y "ReporteBodega"), se permite manejar diferentes tipos de información sin mezclar  responsabilidades.

**4. ESCABILIDAD:**
El diseño basado en relaciones claras y encapsulación permite agregar nuevas funcionalidades, como incluir un sistema más complejo de pedidos o integrar análisis de consumo, sin afectar las partes existentes del sistema.


## CAMBIOS RELAIZADOS

**1. NUEVAS CALSES:**

-*Operación* : Unifica las transacciones de entrada y salida con atributos como fechaRegistro, cantidad, costoTotal, y motivoSalida.

-*ReporteConsumo y ReporteBodega* : Especializan los reportes según el área.

-*Bodega* : Permite la gestión por ubicaciones físicas de los insumos.

-*Historial* : Centraliza el registro de transacciones en vez de manejar listas separadas de entradas y salidas.

**2. CAMBIOS EN INSUMO:**

-*Nuevos métodos*: actualizarCantidad(float Cantidad) y verificarVencimiento().

-Introducción del atributo ubicación.

**3. CAMBIOS EN GESTION DEL INVENTARIO**

-Inventariose relaciona con Bodegapara gestionar múltiples ubicaciones físicas.

-Se agregó el método generarAlertas() conectado con la clase Alerta.

**4. ESTRUCTURA DE LOS INFORMES:**

- *Clases específicas*( ReporteConsumoy ReporteBodega) con métodos especializados.

**5. USUARIO Y PERSONA:**

- La clase Usuariohereda de Persona, reutilizando atributos comunes como nombrey email.

**6. HISTORIAL:**

Centraliza las transacciones utilizando la clase Operación, para mejorar el manejo de transacciones.

**7. PEDIDO:**

Relacionadamente limpia Pedido con Producto para reflejar que un pedido contiene productos específicos.

**8. MEJORAS EN ALERTA:**

Se conecta Alerta directamente con Inventario, automatizando la generación de notificaciones.

**9. MODULARIDAD Y POLIMORFISMO:**

Métodos como generarReporte() en distintas clases ( ReporteConsumo, ReporteBodega) implementan polimorfismo.



## Conexiones realizadas entre clases 

**Insumo ↔ Proveedor:** Cada insumo está asociado a un proveedor, permitiendo una gestión clara de las compras.

**Insumo ↔ Categoría:** Los insumos se clasifican en categorías para una mejor organización.

**Entrada ↔ Insumo:** Cada entrada está vinculada a un insumo.

**Salida ↔ Insumo y Pedido:** Las salidas están asociadas a insumos y pedidos, facilitando el seguimiento del uso.

**Pedido ↔ Plato:** Cada pedido contiene una lista de platos, cada uno con sus insumos.

**Reporte ↔ Insumo y Usuario:** Los reportes pueden generarse sobre el consumo de insumos y son generados por un usuario específico.

**Historial ↔ Entrada y Salida:** Se lleva un registro de todas las entradas y salidas.

**Usuario ↔ Todas las operaciones:** Los usuarios pueden realizar operaciones en el sistema, desde registrar insumos hasta generar reportes.

**Pseudo Codigo**

**Inicio**
*Registrar Insumos*

*Se crea una instancia de Insumo y se llama a registrarInsumo().*

*Gestion de Inventario*

*Entrada de Insumos*

*Se crea una instancia de Entrada y se llama a registrarEntrada().*

*Salida de Insumos*

*Se crea una instancia de Salida y se llama a registrarSalida().*

*Actualizar Inventario*

*Se llama a actualizarInventario().*

*Se llama a generarAlertas().*

*Verificar Vencimientos*

*Se llama a verificarVencimiento() en cada Insumo.*

*Generar Reportes*

*Se crea una instancia de Reporte y se llama a generarReporte() y exportarReporte().*

*Historial de Entradas y Salidas*

*Se crea una instancia de Historial y se llama a consultarHistorial().*

*Gestionar Proveedores*

*Se crea una instancia de Proveedor y se llama a registrarProveedor().*

*Gestionar Categorías*

*Se crea una instancia de Categoría y se llama a registrarCategoria().*

*Gestionar Pedidos*

*Se crea una instancia de Pedido y se llama a realizarPedido().*

*Gestionar Usuarios*

*Se crea una instancia de Usuario y se llama a registrarUsuario().*

*Fin*

**Interconexión:** Las clases interactúan de manera eficiente, optimizando la gestión del inventario.

**Categorías y Clasificación:** Las categorías mejoran la organización y el análisis del inventario.

**Usuarios y Roles:** La inclusión de usuarios permite controlar quién puede acceder y modificar información en el sistema.
 
# Link del Código

https://github.com/Tayron2024/Inventario-POO/blob/main/InventarioPOO/src/main.java

# Explicación del código

El código se originó después de elaborar el diagrama UML en Visual Paradigm, con ello se pudo codificar en la herramienta IntelliJ IDEA siempre y cuando el diagrama este sin errores.


