## Guava BloomFilter  vs alexandrnikitin BloomFilter

### Benchmark output

```bash
# Run complete. Total time: 00:27:03

Benchmark                           (length)   Mode  Cnt        Score       Error  Units
c.g.guava.StringBenchmark.guavaGet      1024  thrpt  200  7313688.796 ± 65483.415  ops/s
c.g.guava.StringBenchmark.guavaPut      1024  thrpt  200  7337575.934 ± 83655.019  ops/s
c.g.scala.StringBenchmark.myGet         1024  thrpt  200  9570203.488 ± 83381.127  ops/s
c.g.scala.StringBenchmark.myPut         1024  thrpt  200  9509229.915 ± 80613.494  ops/s
```

### Jconsole output
> input dataset : ip_514.csv
* Guava
    * 堆内：80M
    * 堆外：55M
* alexandrnikitin
    * 堆内 500M
    * 对外 20M

