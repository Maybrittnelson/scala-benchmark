package com.geshaofeng.bloomfilter.guava

import java.nio.charset.Charset

import scala.util.Random
import com.google.common.hash.{BloomFilter, Funnels}
import org.openjdk.jmh.annotations.{Benchmark, Param, Scope, State}

@State(Scope.Benchmark)
class StringBenchmark {

  private val itemsExpected = 1157039L
  private val falsePositiveRate = 0.01
  private val random = new Random()

  private val bf = BloomFilter.create[String](Funnels.stringFunnel(Charset.forName("UTF-8")), itemsExpected, falsePositiveRate)

  @Param(Array("1024"))
  var length: Int = _

  private val item = random.nextString(length)
  bf.put(item)

  @Benchmark
  def guavaPut(): Unit = {
    bf.put(item)
  }

  @Benchmark
  def guavaGet(): Unit = {
    bf.mightContain(item)
  }

}
