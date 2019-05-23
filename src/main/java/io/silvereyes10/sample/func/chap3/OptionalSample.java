package io.silvereyes10.sample.func.chap3;

import java.util.Optional;

import io.silvereyes10.sample.func.chap3.model.SampleModel;

/**
 * @author namseh.lee on 2019-05-23
 */

public class OptionalSample {
	public static void main(String[] args) {
		// Value 가 null 인 Optional. Optional 내부에 static 으로 선언 되어 있음.
		Optional<SampleModel> emptySampleModel = Optional.empty();

		// Value가 null이 아닌 객체를 담고 있는 Optional. null이 넘어온 경우, NPE 발생
		Optional<SampleModel> aSampleModelOptional = Optional.of(new SampleModel("sample name1", 1));

		// 담고 있는 value가 null 인지 확신 할 수 없는 Optional. null이 전달된 경우, Optional.empty() 반환
		Optional<SampleModel> nullableSampleModelOptional = Optional.ofNullable(null);


		// get() -> Optional의 value를 반환
		SampleModel sampleModel1 = aSampleModelOptional.get();
		System.out.println(sampleModel1.toString());

		// orElse() -> Optional의 value를 반환, null 인 경우 orElse()의 파라미터를 전달.
		SampleModel sampleModel2 = nullableSampleModelOptional.orElse(new SampleModel("sample name2", 2));
		System.out.println(sampleModel2.toString());

		// orElseGet() -> Optional의 value를 반환, null 인 경우 orElseGet()의 파라미터로 전달된 Supplier 통해 객체를 생성해 전달.
		SampleModel sampleModel3 = nullableSampleModelOptional.orElseGet(() -> new SampleModel("sample name3", 3));
		System.out.println(sampleModel3.toString());

		// orElseThrow() -> Optional의 value를 반환, null 인 경우 orElseThrow()의 파라미터로 전달된 Supplier를 통해 Exception을 생성하여 Throw.
		try {
			nullableSampleModelOptional.orElseThrow(() -> new NullPointerException("의도된 예외"));
		} catch (NullPointerException exception) {
			exception.printStackTrace();
		}

		// isPresent() -> value가 null 인지 확인
		/*
			SampleModel sampleModel;
			if (sampleModel == null) {
				System.out.println("sampleModel is null");
			}
		*/
		System.out.println("isPresent() -> " + aSampleModelOptional.isPresent());

		// ifPresent() -> value가 null이 아니면, 파라미터로 전달 된 Consumer 로직 수행
		aSampleModelOptional.ifPresent(model -> System.out.println(model));

		// map() -> Stream의 map과 같이, 파라미터로 전달 된 Function 로직 수행
		System.out.println(aSampleModelOptional.map(model -> model.getSampleName()));

		// filter() -> Stream의 filter와 같이, 파라미터로 전달 된 Predicate 로직 수행하여 일치하면, 객채 반환. 일치하지 않으면, Optional.empty 반환
		System.out.println(aSampleModelOptional.filter(model -> model.getSampleNumber() == 1));
		System.out.println(aSampleModelOptional.filter(model -> model.getSampleNumber() == 2));
	}
}
