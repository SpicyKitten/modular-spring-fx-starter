package io.github.spicykitten.modularspringfx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(classes =
	{ModularSpringFxApplication.class})
public class ModularSpringFxApplicationTests
{
	@Test
	@ExtendWith(OutputCaptureExtension.class)
	void testOutput(CapturedOutput capturedOutput)
	{
		var logger = LoggerFactory.getLogger(ModularSpringFxApplicationTests.class);
		logger.info("Test run successfully.");
		Assertions.assertTrue(capturedOutput.getOut().contains("Test run successfully."));
	}

	@SuppressWarnings("serial")
	static class CustomException extends Exception
	{
		public CustomException(String message)
		{
			super(message);
		}

		public static void raise() throws CustomException
		{
			throw new CustomException("Custom exception thrown!");
		}
	}

	@Test
	void testException()
	{
		Assertions.assertThrowsExactly(CustomException.class, CustomException::raise,
			"Custom exception thrown!");
	}
}
