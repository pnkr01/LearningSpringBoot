package com.pawan.restservice;

import org.springframework.stereotype.Repository;

@Repository
public record Greeting(long id, String name,int statusCode) {
}
