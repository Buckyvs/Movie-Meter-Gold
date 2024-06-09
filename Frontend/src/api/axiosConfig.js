import axios from 'axios';

export default axios.create({
    baseURL:'https://46e1-45-250-227-253.ngrok-free.app',
    headers: {"ngrok-skip-browser-warning": "true"}
});