import axios from "axios";

const api = axios.create({
    baseURL : "http://localhost:9090/"
});

export default api;