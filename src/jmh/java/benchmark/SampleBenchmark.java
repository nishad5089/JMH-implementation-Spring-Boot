package benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

/**
 * @author Abdur Rahim Nishad
 * @since 1.0.0
 */
@State(Scope.Benchmark)
public class SampleBenchmark {
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Fork(value = 1)
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    public void fibClassic() {
        Fib.fibClassic(30);
    }

    @Benchmark
    public void fibTailRec(Blackhole bh) {
       Fib.tailRecFib(30);
    }
}
