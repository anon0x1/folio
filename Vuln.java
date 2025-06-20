public class VulnerableApp {
    
    // General Credentials (Simulated with placeholder values)
    private static final String password = "password123";  // User password
    private static final String passwd = "my_password_456";  // Another variant for password
    private static final String secret = "secretKey1234";  // API or encryption secret
    private static final String api_key = "apikey1234567890";  // Hardcoded API Key
    private static final String access_token = "access_token_0987654321";  // OAuth Access Token
    private static final String auth_token = "auth_token_12345678";  // JWT or session token
    private static final String authorization = "Bearer abcdefghijklmnop";  // Authorization header example
    private static final String access_key = "access_key_abcdef123";  // AWS or similar access key
    private static final String secret_key = "secret_key_9876543210";  // AWS or API secret key
    private static final String api_secret = "api_secret_abcdef098";  // API Secret Key
    private static final String app_key = "app_key_xyz987";  // App key
    private static final String private_key = "private_key_1234567890";  // SSH or API private key
    private static final String public_key = "public_key_9876543210";  // SSH or API public key
    private static final String client_secret = "client_secret_12345abcde";  // Client secret
    private static final String client_id = "client_id_67890xyz";  // Client ID (OAuth)
    private static final String jwt_token = "jwt_token_xyz123456";  // JWT Token
    
    // Database Credentials (Simulated with placeholder values)
    private static final String db_password = "dbPassword12345";  // DB Password
    private static final String db_user = "dbUserAdmin";  // DB Username
    private static final String mysql_password = "mysqlDbPassword123";  // MySQL DB Password
    private static final String postgres_password = "postgresDbPassword567";  // PostgreSQL DB Password
    private static final String oracle_db_password = "oracleDbPasswordXYZ";  // Oracle DB Password
    private static final String mongo_db_password = "mongodbPassword456";  // MongoDB DB Password
    private static final String mssql_password = "mssqlDbPassword789";  // MSSQL DB Password
    private static final String sql_server_password = "sqlServerDbPassword000";  // SQL Server DB Password
    
    // AWS Credentials (Simulated with placeholder values)
    private static final String aws_secret_access_key = "aws_secret_key_98765";  // AWS Secret Access Key
    private static final String aws_access_key_id = "aws_access_key_abcdef12345";  // AWS Access Key ID
    private static final String aws_session_token = "aws_session_token_abcdef";  // AWS Session Token
    private static final String s3_access_key = "s3_access_key_0987654321";  // AWS S3 Access Key
    
    // Hardcoded Payment API Keys (Simulated with placeholder values)
    private static final String stripe_api_key = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";  // Stripe API Key
    private static final String paypal_api_key = "A21AAJ2BAtcF0XG5zYmC3dhD7Jhd71BvFxN2AewQ3MKj2qBOgOIB6YdkBQgr6xFcz0x";  // PayPal API Key
    
    // Other Potential Credentials (Simulated with placeholder values)
    private static final String firebase_api_key = "AIzaSyA-1234Fake-5678Key";  // Firebase API Key
    private static final String twilio_account_sid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";  // Twilio Account SID
    private static final String twilio_auth_token = "your_auth_token";  // Twilio Auth Token
    private static final String github_token = "ghp_exampleToken1234";  // GitHub Access Token
    
    // Sample function for demonstration purposes
    public static void main(String[] args) {
        
        // Simulated Output for Vulnerabilities (Hardcoded Credentials in the code)
        System.out.println("********** Hardcoded Credentials Detected **********");

        // General Credentials
        System.out.println("General Credentials:");
        System.out.println("Password: " + password);
        System.out.println("Passwd: " + passwd);
        System.out.println("Secret Key: " + secret);
        System.out.println("API Key: " + api_key);
        System.out.println("Access Token: " + access_token);
        System.out.println("Authorization Token: " + authorization);

        // Database Credentials
        System.out.println("\nDatabase Credentials:");
        System.out.println("DB Password: " + db_password);
        System.out.println("DB User: " + db_user);
        System.out.println("MySQL Password: " + mysql_password);
        System.out.println("Postgres Password: " + postgres_password);
        System.out.println("Oracle DB Password: " + oracle_db_password);

        // AWS Credentials
        System.out.println("\nAWS Credentials:");
        System.out.println("AWS Secret Access Key: " + aws_secret_access_key);
        System.out.println("AWS Access Key ID: " + aws_access_key_id);
        System.out.println("AWS Session Token: " + aws_session_token);
        System.out.println("S3 Access Key: " + s3_access_key);

        // Payment API Keys
        System.out.println("\nPayment API Keys:");
        System.out.println("Stripe API Key: " + stripe_api_key);
        System.out.println("PayPal API Key: " + paypal_api_key);

        // Other Credentials
        System.out.println("\nOther Credentials:");
        System.out.println("Firebase API Key: " + firebase_api_key);
        System.out.println("Twilio Account SID: " + twilio_account_sid);
        System.out.println("Twilio Auth Token: " + twilio_auth_token);
        System.out.println("GitHub Token: " + github_token);

        System.out.println("\n*********************************************");
    }
}
