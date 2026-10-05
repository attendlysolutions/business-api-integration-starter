import React from 'react';
import { createRoot } from 'react-dom/client';
import './styles.css';

const API = import.meta.env.VITE_API_URL ?? 'http://localhost:8080';

function App() {
  const [count, setCount] = React.useState(0);
  const [message, setMessage] = React.useState('');
  async function loadIntegrations() {
    setMessage('Loading…');
    try { const r = await fetch(`${API}/api/v1/integrations`); if (!r.ok) throw new Error(`HTTP ${r.status}`); const data = await r.json(); setCount(data.length); setMessage(`Connected. ${data.length} integration(s) configured.`); }
    catch { setMessage('Could not reach the API. Start Spring Boot on port 8080 and try again.'); }
  }
  return <main><section className="card"><p className="eyebrow">Developer starter</p><h1>Business API Integration Starter</h1><p>React + TypeScript frontend for a Spring Boot and PostgreSQL business-integration API.</p><button onClick={loadIntegrations}>Check API</button>{message && <p role="status">{message}</p>}<small>API: {API}</small></section></main>;
}

createRoot(document.getElementById('root')!).render(<React.StrictMode><App /></React.StrictMode>);
