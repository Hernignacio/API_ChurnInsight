document.getElementById("churnForm").addEventListener("submit", async function (e) {
    e.preventDefault();

    const data = {
        tiempoContratoMeses: parseInt(document.getElementById("tiempoContratoMeses").value),
        retrasosPago: parseInt(document.getElementById("retrasosPago").value),
        usoMensual: parseFloat(document.getElementById("usoMensual").value),
        plan: document.getElementById("plan").value
    };

    try {
        const response = await fetch("http://localhost:8080/predict", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(data)
        });

        const result = await response.json();

        const divResultado = document.getElementById("resultado");
        divResultado.classList.remove("hidden");
        divResultado.innerHTML = `
            <h3>Resultado</h3>
            <p><strong>Predicción:</strong> ${result.prevision}</p>
            <p><strong>Probabilidad:</strong> ${(result.probabilidad * 100).toFixed(2)}%</p>
        `;

    } catch (error) {
        alert("Error al conectar con la API");
    }
});
