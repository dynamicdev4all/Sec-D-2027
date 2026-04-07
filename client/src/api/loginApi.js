import axios from "axios";
import api from "./api";

const studentLogin = async (id, email, pass) => {
    try {
        // const res2 = axios.post("http://localhost:9090/student/login", {
        //     id,
        //     email,
        //     pass
        // })
        const res = api.post("/student/login", {
            id,
            email,
            pass
        });
        return res.data;
    } catch (error) {
        console.log(error);
    }
}

export default studentLogin