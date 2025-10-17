package StepikScalaCourse.step3



object step3_1_7 {

  class Instructor(val instructorId: Int, name: String, surname: String) {
    def fullName(): String = {
      this.name(0).toUpper + this.name.substring(1) + " " + this.surname(0).toUpper + this.surname.substring(1)
    }
  }

  class Course(courseId: Int, title: String, val releaseYear: String, instructor: Instructor) {

    def getId(): String = {
      this.courseId.toString + this.instructor.instructorId
    }

    def isTaughtBy(instructor: Instructor): Boolean = {
      this.instructor.instructorId.equals(instructor.instructorId) && this.instructor.fullName().equals(instructor.fullName())
    }

    def copyCourse(newReleaseYear: String): Course = {
      new Course(this.courseId, this.title, newReleaseYear, this.instructor)
    }
  }

  def main(args: Array[String]): Unit = {

    val instructor = new Instructor(1, "John", "Brown")
    val course = new Course(1, "Scala", "2023", instructor)
    println(course.getId())
    println(course.isTaughtBy(instructor))
    val newCourse = course.copyCourse("2024")
    println(newCourse.releaseYear)
  }
}
