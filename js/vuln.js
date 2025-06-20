// General Credentials (Simulated with placeholder values)
const password = "password123";  // User password
const passwd = "my_password_456";  // Another variant for password
const secret = "secretKey1234";  // API or encryption secret
const apiKey = "apikey1234567890";  // Hardcoded API Key
const accessToken = "access_token_0987654321";  // OAuth Access Token
const authToken = "auth_token_12345678";  // JWT or session token
const authorization = "Bearer abcdefghijklmnop";  // Authorization header example
const accessKey = "access_key_abcdef123";  // AWS or similar access key
const secretKey = "secret_key_9876543210";  // AWS or API secret key
const apiSecret = "api_secret_abcdef098";  // API Secret Key
const appKey = "app_key_xyz987";  // App key
const privateKey = "private_key_1234567890";  // SSH or API private key
const publicKey = "public_key_9876543210";  // SSH or API public key
const clientSecret = "client_secret_12345abcde";  // Client secret
const clientId = "client_id_67890xyz";  // Client ID (OAuth)
const jwtToken = "jwt_token_xyz123456";  // JWT Token

// Database Credentials (Simulated with placeholder values)
const dbPassword = "dbPassword12345";  // DB Password
const dbUser = "dbUserAdmin";  // DB Username
const mysqlPassword = "mysqlDbPassword123";  // MySQL DB Password
const postgresPassword = "postgresDbPassword567";  // PostgreSQL DB Password
const oracleDbPassword = "oracleDbPasswordXYZ";  // Oracle DB Password
const mongoDbPassword = "mongodbPassword456";  // MongoDB DB Password
const mssqlPassword = "mssqlDbPassword789";  // MSSQL DB Password
const sqlServerPassword = "sqlServerDbPassword000";  // SQL Server DB Password

// AWS Credentials (Simulated with placeholder values)
const awsSecretAccessKey = "aws_secret_key_98765";  // AWS Secret Access Key
const awsAccessKeyId = "aws_access_key_abcdef12345";  // AWS Access Key ID
const awsSessionToken = "aws_session_token_abcdef";  // AWS Session Token
const s3AccessKey = "s3_access_key_0987654321";  // AWS S3 Access Key

// Hardcoded Payment API Keys (Simulated with placeholder values)
const stripeApiKey = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";  // Stripe API Key
const paypalApiKey = "A21AAJ2BAtcF0XG5zYmC3dhD7Jhd71BvFxN2AewQ3MKj2qBOgOIB6YdkBQgr6xFcz0x";  // PayPal API Key

// Other Potential Credentials (Simulated with placeholder values)
const firebaseApiKey = "AIzaSyA-1234Fake-5678Key";  // Firebase API Key
const twilioAccountSid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";  // Twilio Account SID
const twilioAuthToken = "your_auth_token";  // Twilio Auth Token
const githubToken = "ghp_exampleToken1234";  // GitHub Access Token

// Sample function for demonstration purposes
function displayCredentials() {
    console.log("********** Hardcoded Credentials Detected **********");

    // General Credentials
    console.log("General Credentials:");
    console.log("Password: " + password);
    console.log("Passwd: " + passwd);
    console.log("Secret Key: " + secret);
    console.log("API Key: " + apiKey);
    console.log("Access Token: " + accessToken);
    console.log("Authorization Token: " + authorization);

    // Database Credentials
    console.log("\nDatabase Credentials:");
    console.log("DB Password: " + dbPassword);
    console.log("DB User: " + dbUser);
    console.log("MySQL Password: " + mysqlPassword);
    console.log("Postgres Password: " + postgresPassword);
    console.log("Oracle DB Password: " + oracleDbPassword);

    // AWS Credentials
    console.log("\nAWS Credentials:");
    console.log("AWS Secret Access Key: " + awsSecretAccessKey);
    console.log("AWS Access Key ID: " + awsAccessKeyId);
    console.log("AWS Session Token: " + awsSessionToken);
    console.log("S3 Access Key: " + s3AccessKey);

    // Payment API Keys
    console.log("\nPayment API Keys:");
    console.log("Stripe API Key: " + stripeApiKey);
    console.log("PayPal API Key: " + paypalApiKey);

    // Other Credentials
    console.log("\nOther Credentials:");
    console.log("Firebase API Key: " + firebaseApiKey);
    console.log("Twilio Account SID: " + twilioAccountSid);
    console.log("Twilio Auth Token: " + twilioAuthToken);
    console.log("GitHub Token: " + githubToken);

    console.log("\n*********************************************");
}

// Run the function to display the simulated hardcoded credentials
displayCredentials();
