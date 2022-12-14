//package com.example.salaryproject.day20220914;
//
//import okhttp3.ConnectionPool;
//import okhttp3.OkHttpClient;
//import org.apache.http.conn.ssl.SSLSocketFactory;
//import org.apache.tomcat.util.net.SSLContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.X509TrustManager;
//import java.security.KeyManagementException;
//import java.security.NoSuchAlgorithmException;
//import java.security.SecureRandom;
//import java.security.cert.CertificateException;
//import java.security.cert.X509Certificate;
//import java.util.concurrent.TimeUnit;
//
///**
// * @program: SalaryProject
// * @description: okhttp 服务端
// * @author: kangwei
// * @create: 2022-09-14 10:06
// **/
//@Configuration
//public class OkHttpConfig {
//    @Bean
//    public OkHttpClient okHttpClient() {
//        return new OkHttpClient.Builder()
//                //.sslSocketFactory(sslSocketFactory(), x509TrustManager())
//                .retryOnConnectionFailure(false)
//                .connectionPool(pool())
//                .connectTimeout(30, TimeUnit.SECONDS)
//                .readTimeout(30, TimeUnit.SECONDS)
//                .writeTimeout(30,TimeUnit.SECONDS)
//                .build();
//    }
//    @Bean
//    public X509TrustManager x509TrustManager() {
//        return new X509TrustManager() {
//            @Override
//            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
//            }
//            @Override
//            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
//            }
//            @Override
//            public X509Certificate[] getAcceptedIssuers() {
//                return new X509Certificate[0];
//            }
//        };
//    }
//    @Bean
//    public SSLSocketFactory sslSocketFactory() {
//        try {
//            //信任任何链接
//            SSLContext sslContext = SSLContext.getInstance("TLS");
//            sslContext.init(null, new TrustManager[]{x509TrustManager()}, new SecureRandom());
//            return sslContext.getSocketFactory();
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        } catch (KeyManagementException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    /**
//     * Create a new connection pool with tuning parameters appropriate for a single-user application.
//     * The tuning parameters in this pool are subject to change in future OkHttp releases. Currently
//     */
//    @Bean
//    public ConnectionPool pool() {
//        return new ConnectionPool(200, 5, TimeUnit.MINUTES);
//    }
//}
