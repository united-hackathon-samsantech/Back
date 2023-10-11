package com.example.back.global.config;

//@Configuration
//public class S3Config {
//
//    @Value("${cloud.aws.credentials.access_key}")
//    private String accessKey;
//    @Value("${cloud.aws.credentials.secret_key}")
//    private String secretKey;
//    @Value("${cloud.aws.region.static}")
//    private String region;
//
//    @Bean
//    public AmazonS3 s3Client() {
//        AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
//        return AmazonS3ClientBuilder.standard()
//                .withCredentials(new AWSStaticCredentialsProvider(credentials))
//                .withRegion(region).build();
//    }
//}
