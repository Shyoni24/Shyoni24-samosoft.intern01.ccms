import React, { useState, useEffect } from 'react';

function App() {
  const [clients, setClients] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/clients')
      .then(response => response.json())
      .then(data => setClients(data))
      .catch(error => console.error('Error:', error));
  }, []);

  return (
    <div>
      <h1>Clients</h1>
      <ul>
        {clients.map(client => (
          <li key={client.id}>
            {client.name} - {client.email}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
