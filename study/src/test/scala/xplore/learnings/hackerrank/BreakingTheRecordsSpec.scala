package xplore.learnings.hackerrank

import xplore.learnings.BaseFunSpec

class BreakingTheRecordsSpec extends BaseFunSpec {

  val breakingTheRecords = new BreakingTheRecords
  describe("Breaking The Records") {
    it("\"10, 5, 20, 20, 4, 5, 2, 25, 1\"should be \"2 4\"") {
      assertResult(Array(2, 4))(breakingTheRecords.breakingRecords(Array(10, 5, 20, 20, 4, 5, 2, 25, 1)))
    }

    it("\"3 4 21 36 10 28 35 5 24 42\"should be \"4 0\"") {
      assertResult(Array(4, 0))(breakingTheRecords.breakingRecords(Array(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)))
    }
  }
}
