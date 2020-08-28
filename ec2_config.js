
var mysql = require('mysql');

var connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'password',
    port:'3306',
    database:'Carbcon',
    multipleStatements: true
});

//exported- to be used outside this file
module.exports = connection;
