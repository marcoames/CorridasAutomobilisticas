const API_BASE_URL = 'http://localhost:8080/ctrlCorridas';

// Function to fetch and display Pilotos
function fetchPilotos() {
    fetch(`${API_BASE_URL}/piloto`)
        .then(response => response.json())
        .then(data => {
            const pilotoList = document.getElementById('pilotoList');
            pilotoList.innerHTML = ''; // Clear previous list

            data.forEach(piloto => {
                const li = document.createElement('li');
                const carModels = piloto.carros.map(carro => carro.modelo).join(', ');

                li.textContent = `${piloto.nome} (${piloto.idade} years old, ${piloto.nacionalidade}) - Cars: ${carModels}`;
                pilotoList.appendChild(li);
            });
        })
        .catch(error => console.error('Error fetching Pilotos:', error));
}

// Function to fetch and display Carros
function fetchCarros() {
    fetch(`${API_BASE_URL}/carro`)
        .then(response => response.json())
        .then(data => {
            const carroList = document.getElementById('carroList');
            carroList.innerHTML = ''; // Clear previous list

            data.forEach(carro => {
                const li = document.createElement('li');
                li.textContent = `${carro.modelo} (${carro.marca}, ${carro.ano})`;
                carroList.appendChild(li);
            });
        })
        .catch(error => console.error('Error fetching Carros:', error));
}

// Function to fetch and display Corridas
function fetchCorridas() {
    fetch(`${API_BASE_URL}/corrida`)
        .then(response => response.json())
        .then(data => {
            const corridaList = document.getElementById('corridaList');
            corridaList.innerHTML = ''; // Clear previous list

            data.forEach(corrida => {
                const corridaDiv = document.createElement('div');
                corridaDiv.classList.add('corrida');

                const corridaHeader = document.createElement('div');
                corridaHeader.classList.add('corrida-header');
                corridaHeader.innerHTML = `<strong>Date:</strong> ${corrida.data} <strong>Location:</strong> ${corrida.local}`;
                corridaDiv.appendChild(corridaHeader);

                const pilotosList = document.createElement('ul');
                pilotosList.classList.add('pilotos-list');

                corrida.pilotos.forEach(piloto => {
                    const pilotoItem = document.createElement('li');
                    const carModels = piloto.carros.map(carro => carro.modelo).join(', ');
                    pilotoItem.innerHTML = `
              <strong>${piloto.nome}</strong> (${piloto.idade} years old, ${piloto.nacionalidade})<br>
              <span>Cars: ${carModels}</span>
            `;
                    pilotosList.appendChild(pilotoItem);
                });

                corridaDiv.appendChild(pilotosList);
                corridaList.appendChild(corridaDiv);
            });
        })
        .catch(error => console.error('Error fetching Corridas:', error));
}