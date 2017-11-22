package com.example.demo;

import java.io.File;

import com.example.models.Application;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;


public class YamlParserApplication {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            Application user = mapper.readValue(new File("C:\\Users\\gangya\\Documents\\workspace-sts-3.9.0.RELEASE\\YamlParser\\src\\main\\resources\\user.yaml"), Application.class);
            System.out.println(user.getName()+"\n"+user.getAddress());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
