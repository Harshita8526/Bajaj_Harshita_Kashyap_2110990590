const axios = require("axios");

const url = "https://customer-analytics-34146.my.salesforce-sites.com/services/apexrest/createAccount";

const data = {
  name: "Harshita Kashyap",
  email: "harshita0590.be21@chitkara.edu.in",
  rollNumber: 2110990590,
  phone: 8278950177,
};

async function makeReq() {
  try {
    const response = await axios.post(url, data);
    console.log("Success:", response.data);
  } catch (error) {
    console.error("Error:", error.message);
  }
}

makeReq();



 accountNumber: 'BFHL0018679'
