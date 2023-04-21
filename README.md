# AWS-Lambda-Api

## Calling an API using AWS Lambda and API Gateway
This project demonstrates how to create and deploy an AWS Lambda function that can be invoked via an API Gateway, allowing you to call an API endpoint and trigger serverless compute with Lambda.

### Prerequisites
Before getting started, make sure you have the following:

- An AWS account with appropriate permissions to create Lambda functions and API Gateway.
- AWS CLI (Command Line Interface) installed on your local machine.
- Basic knowledge of AWS Lambda, API Gateway, and serverless computing concepts.

### Deployment Steps
Follow the steps below to deploy the Lambda function and API Gateway:

- Clone or download the project files to your local machine.

- Create an AWS Lambda function using the AWS CLI or the AWS Management Console. Make sure to specify the runtime (e.g., Node.js, Python, etc.), and optionally set up any environment variables or other configurations needed for your specific use case.

- Upload the project files to the Lambda function. You can do this using the AWS CLI, the AWS Management Console, or by using a deployment package such as AWS SAM (Serverless Application Model).

- Create an API Gateway in AWS Management Console, and configure it to trigger the Lambda function you just created. You can specify the API Gateway as the event source for the Lambda function, or configure the integration between the API Gateway and Lambda using AWS API Gateway's integration features.

- Deploy the API Gateway to create an API endpoint that can be used to call your Lambda function.

- Test the API by making requests to the API endpoint using a REST client or any other tool of your choice.

### Usage
Once the Lambda function and API Gateway are deployed, you can call the API endpoint to trigger the Lambda function and execute your desired logic. The Lambda function can process the request, perform any required operations, and return a response to the API Gateway, which in turn sends the response back to the caller.

### Cleaning up
If you want to clean up the resources created during this project, you can delete the Lambda function and API Gateway using the AWS Management Console, AWS CLI, or other AWS automation tools. Make sure to also delete any associated resources, such as IAM roles or policies, if they are no longer needed.

### Conclusion
Successfully deployed a Lambda function and API Gateway to create and call an API using serverless architecture in AWS. You can now use this pattern to build and deploy your own serverless applications, leveraging the power of Lambda and API Gateway to create scalable and cost-effective APIs.
