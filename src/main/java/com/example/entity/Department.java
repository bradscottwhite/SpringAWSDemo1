package com.example.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class Department {

	@DynamoDBAttribute
	private String departmentName;
	
	@DynamoDBAttribute
	private String departmentCode;

}
