<h1>Encapsulamiento en Java</h1>
<p>El encapsulamiento es un principio fundamental de la programación orientada a objetos (POO) que consiste en ocultar los detalles internos de una clase y permitir el acceso a esos detalles solo a través de métodos públicos definidos. Esto ayuda a proteger los datos y a garantizar que los objetos mantengan un estado válido.</p>
<h3>Beneficios del encapsulamiento</h3>
<ul>
    <li><strong>Protección de datos:</strong> Al hacer que los atributos sean privados, se evita el acceso directo desde fuera de la clase, lo que protege los datos de modificaciones no autorizadas o incorrectas.</li>
    <li><strong>Control sobre la modificación de datos:</strong> Los métodos públicos proporcionan un control sobre cómo se accede y modifica el estado interno de la clase. Esto permite validar las entradas y mantener un estado coherente.</li>
    <li><strong>Facilidad de mantenimiento:</strong> Al encapsular la implementación interna, los cambios en la lógica interna no afectan al código externo que utiliza la clase. Solo se necesita modificar los métodos públicos si la interfaz externa necesita cambiar.</li>

</ul>
<hr />
<p>Este repositorio muestra un ejemplo de encapsulamiento utilizando una clase CuentaBancaria</p>
Explicación del código:

    Atributos privados:
        numeroCuenta y saldo son atributos privados. Esto significa que no pueden ser accedidos directamente desde fuera de la clase CuentaBancaria.

    Constructor:
        El constructor inicializa los atributos numeroCuenta y saldo.

    Métodos públicos (getters):
        getNumeroCuenta y getSaldo son métodos públicos que permiten acceder a los valores de numeroCuenta y saldo de forma controlada.

    Métodos públicos (para modificar el estado):
        depositar y retirar son métodos públicos que permiten modificar el saldo de la cuenta. Estos métodos incluyen validaciones para asegurar que las operaciones sean válidas (por ejemplo, no permitir depósitos negativos o retiros mayores al saldo disponible).

    Clase Main:
        La clase Main muestra cómo utilizar la clase CuentaBancaria. Se crea una cuenta, se realizan depósitos y retiros, y se muestra el saldo actualizado.