import React, { useEffect, useState } from 'react';
import axios from 'axios';

function ClientList() {
    const [clients, setClients] = useState([]);

    useEffect(() => {
        // Fetch client configurations from backend API
        axios.get('http://localhost:8080/api/clients')
            .then(response => setClients(response.data))
            .catch(error => console.error(error));
    }, []);

    return (
        <div>
            <h2>Client Configurations</h2>
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

export default ClientList;
