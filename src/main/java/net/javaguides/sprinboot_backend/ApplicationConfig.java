package net.javaguides.sprinboot_backend;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.google.gson.Gson;

import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;

@Configuration
public class ApplicationConfig {
	private Gson gson = new Gson();
	

	@Value("${aws_access_key_id}")
	private String accessKey;
	
	@Value("${aws_secret_access_key}")
	private String secretKey;
	
	@Bean
	public DataSource getDataSource() {
		AwsSecrets secrets = getSecrets();
		
		return DataSourceBuilder
			   .create()
			   //.driverClassName(null)
			   .url("jdbc:"+secrets.getEngine()+"://"+secrets.getHost()+":"+secrets.getPort()+"/testdatabase")
			   .username(secrets.getUsername())
			   .password(secrets.getPassword())
			   .build();
	}

	private AwsSecrets getSecrets() {

		String secretName = "db-credentials";
		Region region = Region.of("us-east-2");
		AWSCredentials credentials = new EnvironmentVariableCredentialsProvider().getCredentials();
		
		System.out.println(credentials.getAWSAccessKeyId()+" "+credentials.getAWSSecretKey());
		

		// Create a Secrets Manager client
		SecretsManagerClient client = SecretsManagerClient.builder().
				region(region).build();

		GetSecretValueRequest getSecretValueRequest = GetSecretValueRequest.builder().secretId(secretName).build();

		GetSecretValueResponse getSecretValueResponse;

		try {
			getSecretValueResponse = client.getSecretValue(getSecretValueRequest);
		} catch (Exception e) {

			throw e;
		}

		String secret = getSecretValueResponse.secretString();

		return gson.fromJson(secret, AwsSecrets.class);
	}

}
