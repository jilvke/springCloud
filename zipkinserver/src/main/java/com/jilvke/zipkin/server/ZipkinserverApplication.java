package com.jilvke.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

@EnableZipkinStreamServer
@EnableDiscoveryClient
@SpringBootApplication
public class ZipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinserverApplication.class, args);
	}
}
