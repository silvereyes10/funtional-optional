package io.silvereyes10.sample.func.chap3.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author namseh.lee on 2019-05-23
 */

@Getter
@Setter
@ToString
public class SampleModel {
	private String sampleName;
	private int sampleNumber;

	public SampleModel(String sampleName, int sampleNumber) {
		System.out.println("Sample Model Create. Param - name: " + sampleName + " number: " + sampleNumber);

		this.sampleName = sampleName;
		this.sampleNumber = sampleNumber;
	}
}
