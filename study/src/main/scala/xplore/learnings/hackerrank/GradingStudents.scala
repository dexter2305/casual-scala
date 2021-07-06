package xplore.learnings.hackerrank

class GradingStudents {

  def gradingStudents(grades: Array[Int]): Array[Int] = {
    val saturatedGrade: Int => Int = n => {
      if (n < 38) n
      else {
        val diff = 5 - (n % 5)
        if (diff < 3) n + diff
        else n
      }
    }
    grades.map(saturatedGrade(_))
  }

}
