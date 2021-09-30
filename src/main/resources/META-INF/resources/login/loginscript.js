const URL = 'http://localhost:8080/login';
var token;

const createUser = (e) => {
    e.preventDefault();
    const formData = new FormData(e.target);
    const user = {};

    user['username'] = formData.get()

}
