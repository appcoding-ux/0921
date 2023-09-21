package ex09_FunctionInterface;

@FunctionalInterface
public interface SampleInterface {
	void sample();
	
	default void sample2() {};
}
