package Assignment10;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentUtilityFunc {

    // 1. Get a list of student names for a specific course.
    public static List<String> getStudentNamesByCourse(List<Student> students, String course) {
        return students.stream()
                .filter(s -> s.getCourse().equals(course))
                .map(Student::getName) // Corrected from Students::getName to Student::getName
                .collect(Collectors.toList());
    }

    // 2. Get students with a GPA higher than a given minimum GPA.
    public static List<Student> getStudentWithHighGPA(List<Student> students, double minGPA) {
        return students.stream()
                .filter(s -> s.getGpa() > minGPA)
                .collect(Collectors.toList());
    }

    // 3. Get a set of all unique cities where students reside.
    public static Set<String> getAllCities(List<Student> students) {
        return students.stream()
                .map(Student::getCity)
                .collect(Collectors.toSet());
    }

    // 4. Group students and count them by course.
    public static Map<String, Long> getStudentCountByCourse(List<Student> students) { // Changed key type from Course to String
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCourse, Collectors.counting()));
    }

    // 5. Calculate the average GPA of all students.
    public static double getAverageGPA(List<Student> students) {
        return students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
    }

    // 6. Get a specified number of students with the highest GPAs.
    public static List<Student> getTopStudentsByGPA(List<Student> students, int limit) {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed()) // Corrected sorting logic
                .limit(limit)
                .collect(Collectors.toList());
    }

    // 7. Get a list of students sorted alphabetically by name.
    public static List<Student> getStudentsSortedByName(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getName)) // Corrected from Comparators to Comparator
                .collect(Collectors.toList());
    }

    // 8. Get a list of students enrolled after a specific date.
    public static List<Student> getStudentEnrolledAfter(List<Student> students, LocalDate date) {
        return students.stream()
                .filter(s -> s.getEnrollmentDate().isAfter(date)) // Corrected method call
                .collect(Collectors.toList());
    }
}