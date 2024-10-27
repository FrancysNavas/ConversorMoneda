Challenge: CONVERSOR DE MONEDA
## :dart: About ##

Este es un conversor de monedas en Java utilizando la API de  que permite convertir entre diferentes divisas utilizando tasas de cambio actualizadas desde una API externa.

#hammer funcionalidades-del-proyecto
Consulta las tasas de cambio entre varias monedas. Conversión en tiempo real basada en datos actualizados. Manejo de varias divisas y tasas de cambio. Actualización automática de tasas de cambio en intervalos definidos.

Estructura del Proyecto
El proyecto está estructurado en varias clases clave:

Main: Punto de entrada del programa. Maneja la interacción principal del usuario.

ConsultaDivisa: Responsable de realizar las consultas a la API para obtener las tasas de cambio.

Divisa: Contiene información sobre una divisa, incluyendo la fecha de la última actualización y las tasas de cambio. Utiliza un Map<String, Double> para almacenar las tasas.

OpcionesMoneda: Maneja las opciones de divisas disponibles para la conversión.

Requisitos
Para ejecutar este proyecto, asegúrate de tener instalado lo siguiente: Java 8 o superior. Conexión a internet (para obtener las tasas de cambio en tiempo real).

Uso
Al iniciar el programa, se te solicitará ingresar las monedas de origen. Luego, introduce la cantidad a convertir y posteriormente se dsplegara un menú con todas las opciones disponibles dentro de la API. Despues se solicita la moneda destino para que asi, el programa te mostre la cantidad convertida con base en las tasas actuales. Al final se muestra un pequeño menú para preguntar si deseass realizar alguna otra conversión, ya sea con la moneda inicial, cambiar de moneda o salir del programa.

API Utilizada
Este proyecto consume la API Exchange Rate API de divisas que proporciona las tasas de cambio actualizadas. Asegúrate de tener acceso a una API válida. Las tasas de conversión se guardan temporalmente en el sistema para evitar consultas frecuentes.

Contribuciones
Las contribuciones son bienvenidas. Si encuentras algún problema o tienes sugerencias de mejora, por favor abre un issue o envía un pull request.
