const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s+/).map(Number);

let a = input[0];
let b = input[1];
let c = input[2];

// code here
if (a >= b && a >= c) {
    console.log(a);
} else if (b >= a && b >= c) {
    console.log(b);
} else {
    console.log(c);
}