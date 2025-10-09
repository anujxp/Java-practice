/*
Problem 3: Online Learning Platform 🎓

Abstract class Course:

title, duration fields

abstract method startCourse(), endCourse()

concrete method courseDetails()

Subclasses:

VideoCourse

LiveCourse

Interface CertificateProvider with generateCertificate() method.

Only VideoCourse provides certificates.

In main method, simulate starting, ending, and generating certificates.
*/


interface CertificateProvider {
    void generateCertificate();
}

abstract class Course {
    String title;
    int duration;

    Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    abstract void startCourse();
    abstract void endCourse();

    void courseDetails() {
        System.out.println("Course Title: " + title);
        System.out.println("Duration: " + duration + " hours");
    }
}

class VideoCourse extends Course implements CertificateProvider {
    VideoCourse(String title, int duration) {
        super(title, duration);
    }

    @Override
    void startCourse() {
        System.out.println("Starting video course: " + title);
    }

    @Override
    void endCourse() {
        System.out.println("Ending video course: " + title);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Certificate generated for video course: " + title);
    }
}

class LiveCourse extends Course {
    LiveCourse(String title, int duration) {
        super(title, duration);
    }

    @Override
    void startCourse() {
        System.out.println("Starting live course: " + title);
    }

    @Override
    void endCourse() {
        System.out.println("Ending live course: " + title);
    }
}
class OnlineLearningPlatform {
    public static void main(String[] args) {
        VideoCourse c1 = new VideoCourse("Java Programming", 40);
        LiveCourse c2 = new LiveCourse("Data Structures - Live", 20);

        c1.courseDetails();
        c1.startCourse();
        c1.endCourse();
        c1.generateCertificate();
        System.out.println("----------------------");

        c2.courseDetails();
        c2.startCourse();
        c2.endCourse();
    }
}
