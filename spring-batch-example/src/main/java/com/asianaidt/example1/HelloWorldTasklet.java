package com.asianaidt.example1;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

// 목표: 두 개의 메시지만 출력하고 끝나는 단순한 tasklet
public class HelloWorldTasklet implements Tasklet {
	
	public RepeatStatus execute(final StepContribution contribution, final ChunkContext chunkContext) {
		System.out.println("작업 시작");
		
		// 원하는 작업은 여기 아래서부터 시작
		System.out.println("작업 완료");
		
		// execute 메소드가 null 반환: RepeatStatus.FINISHED를 반환하는 것과 같은 의미
		// 반복 없이 한 번만 실행된다는 뜻.
		return null;
	}

}
