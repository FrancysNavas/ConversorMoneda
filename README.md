## :dart: Challenge: CONVERSOR DE MONEDA ##
Este challenge es un conversor de monedas/divisas en Java que permite a los usuarios calcular cambios entre diferentes monedas, utilizando tasas de cambio obtenidas de una API. El programa está diseñado para ser fácil de usar y puede manejar múltiples conversiones de manera eficiente.

## :hammer: Funcionalidades del proyecto ##
Consulta las tasas de cambio entre varias monedas. Conversión en tiempo real basada en datos actualizados. Manejo de varias divisas y tasas de cambio. Actualización automática de tasas de cambio en intervalos definidos.

## :memo: Estructura del Proyecto ##

El proyecto está estructurado en varias clases:

Principal: Punto de entrada del programa. Maneja la interacción principal del usuario.

ConsultaConversor: Responsable de realizar las consultas a la API para obtener las tasas de cambio.

Conversor: Maneja las opciones de divisas disponibles para la conversión.

GenerarArchivo: Uso de Gson para manejar archivos json y guardar en archivos con la extensión .json.

## :clipboard: Requisitos ##
Para ejecutar este proyecto:

Java 8 o superior. 

Conexión a internet (para obtener las tasas de cambio en tiempo real).

## :currency_exchange: Uso del programa
El programa está diseñado para solicitar al usuario que seleccione un aopción de acuerdo al cambio que quiera realizar, luego ingresar el monto a cambiar y el sistema uzando la API de de ExchangeRate-API utilizando la API-KEY, devuleve el código de las monedas seleccionadas, el monto ingrsado y su cambio a la tasa actual. El menú tiene la opción de seguir funcionando o salir de la ejecución.

## :chart:API Utilizada
Este proyecto consume la API Exchange Rate API de divisas que proporciona las tasas de cambio actualizadas. 
