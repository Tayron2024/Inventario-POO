# Inventario Programación Orientada a Objetos.
Este repositorio contiene el Diagrama de clase sobre el Módulo de Invetario de un restaurante.
# Docente de la materia:
Ing. Edison Coronel.
# Los integrantes del grupo son: 
- Tayron Morales.
- Mathias Medina. 
- Santiago Villamagua.
- Leonardo Sánchez.
- Luis Blacio.
# Descripción 
El siguiente diagrama de clases continen los siguientes requerimientos:
- Registrar todos los insumos del restaurante, con información como nombre, cantidad, unidad de medida y nivel de reorden.
- Permitir registrar entradas al inventario (compras de insumos) y salidas del inventario (uso de insumos).
- Actualizar en tiempo real la cantidad disponible de cada insumo según el uso en los pedidos.
- Generar alertas automáticas cuando la cantidad de un insumo está por debajo del nivel de reorden.
- Generar reportes sobre el consumo de insumos en un período determinado, permitiendo identificar los más utilizados.
- Mantener un historial de las entradas y salidas para fines de auditoría y control.


# Diagrama Visual Paradimg
![POO3](https://github.com/user-attachments/assets/e5f33a57-ef34-4768-a9cc-b1ecc1a8a727)

**Link del diagrama para ver más claro**

https://drive.google.com/file/d/10IeCt2Xld8nPt5jeL-ac2Uvd9UMeTvwy/view?usp=sharing


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

proveedor: Referencia a la clase Proveedor.

fechaVencimiento: Fecha de caducidad del insumo.

categoría: Referencia a la clase Categoría.

precioUnitario: Precio por unidad del insumo.

**Métodos:**

registrarInsumo()

actualizarCantidad(cantidad)

verificarReorden()

verificarVencimiento()


**2. Clase Entrada**
**Atributos:**

id: Identificador único de la entrada.

insumo: Referencia a Insumo.

cantidad: Cantidad recibida.

fechaRegistro: Fecha de registro.

proveedor: Referencia a Proveedor.

costoTotal: Costo total de la entrada.

**Métodos:**

registrarEntrada()

obtenerHistorial()


**3. Clase Salida**
**Atributos:**

id: Identificador único de la salida.

insumo: Referencia a Insumo.

cantidad: Cantidad utilizada.

fechaUso: Fecha de uso.

pedido: Referencia a Pedido.

motivo: Motivo de la salida (uso, desperdicio, etc.).


**Métodos:**

registrarSalida()

obtenerHistorial()


**4. Clase Inventario**
**Atributos:**

listaInsumos: Lista de insumos.

listaCategorías: Lista de categorías.

listaProveedores: Lista de proveedores.


**Métodos:**

agregarInsumo(insumo)

eliminarInsumo(insumo)

buscarInsumo(nombre)

actualizarInventario()

generarAlertas()

obtenerValorTotalInventario(): Calcula el valor total de los insumos en inventario.


**5. Clase Alerta**
**Atributos:**

insumo: Referencia a Insumo.

mensaje: Mensaje de alerta.

fecha: Fecha de alerta.

tipoAlerta: Tipo de alerta (bajo stock, vencimiento).


**Métodos:**

generarAlerta()

enviarNotificacion()


**6. Clase Reporte**
**Atributos:**

tipoReporte: Tipo de reporte.

periodo: Período de tiempo.

datos: Datos del reporte.

generador: Referencia a la clase Usuario que generó el reporte.

**Métodos:**

generarReporte()

exportarReporte()


**7. Clase Historial**
**Atributos:**

listaEntradas: Lista de entradas.

listaSalidas: Lista de salidas.

fechaConsulta: Fecha de consulta.

**Métodos:**

registrarEntrada(entrada)

registrarSalida(salida)

consultarHistorial()


**8. Clase Proveedor**
**Atributos:**

id: Identificador único.

nombre: Nombre del proveedor.

contacto: Nombre del contacto.

telefono: Número de teléfono.

email: Correo electrónico.

direccion: Dirección del proveedor.

calificacion: Calificación del proveedor basada en evaluaciones.

**Métodos:**

registrarProveedor()

actualizarProveedor()

consultarProveedores()


**9. Clase Pedido**
**Atributos:**

id: Identificador único.

cliente: Información del cliente.

listaPlatos: Lista de platos.

fecha: Fecha del pedido.

estado: Estado del pedido (pendiente, completado, cancelado).

**Métodos:**

realizarPedido()

cancelarPedido()

agregarPlato(plato)


**10. Clase Plato**
**Atributos:**

id: Identificador único.

nombre: Nombre del plato.

listaInsumos: Lista de insumos necesarios.

precio: Precio del plato.

**Métodos:**

crearPlato()

actualizarPlato()

calcularCostoPlato(): Calcula el costo basado en los insumos.



**11. Clase Categoría**
*Descripción: Permite clasificar los insumos en categorías, facilitando la gestión del inventario.*
**Atributos:**

id: Identificador único.

nombre: Nombre de la categoría.

descripcion: Descripción de la categoría.

**Métodos:**

registrarCategoria()

actualizarCategoria()

consultarCategorias()


**12. Clase Usuario**
*Descripción: Representa a los usuarios del sistema que gestionan el inventario.*
**Atributos:**

id: Identificador único del usuario.

nombre: Nombre del usuario.

rol: Rol del usuario (administrador, empleado, etc.).

email: Correo electrónico.

**Métodos:**

registrarUsuario()

actualizarUsuario()

consultarUsuarios()


**13. Clase gestionInvetario**
**Atributos:**

*Ninguna Especificada*

**Metodos:**

agregarItem(ItemInventario item)

eliminarItem(ItemInventario item)

buscarItem(String nombre)

actualizarInventario(): void


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
 
# Link del Documento
https://github.com/Tayron2024/Inventario-POO/blob/main/POO.pdf 
