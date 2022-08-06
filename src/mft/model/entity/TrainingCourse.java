package mft.model.entity;

import java.time.format.DateTimeFormatter;

public class TrainingCourse {

    private int trainingCourseId;
    private String trainingCourseTitle;
    private Employee trainingCourseAttendee;
    private String trainingCourseType;
    private String trainingCourseDescription;
    private DateTimeFormatter trainingCourseStarDate;
    private DateTimeFormatter trainingCourseEndDate;
    private byte trainingCourseHours;

    public TrainingCourse() {
    }

    public TrainingCourse(int trainingCourseId, String trainingCourseTitle,
                          Employee trainingCourseAttendee, String trainingCourseType,
                          String trainingCourseDescription, DateTimeFormatter trainingCourseStarDate,
                          DateTimeFormatter trainingCourseEndDate, byte trainingCourseHours) {
        this.trainingCourseId = trainingCourseId;
        this.trainingCourseTitle = trainingCourseTitle;
        this.trainingCourseAttendee = trainingCourseAttendee;
        this.trainingCourseType = trainingCourseType;
        this.trainingCourseDescription = trainingCourseDescription;
        this.trainingCourseStarDate = trainingCourseStarDate;
        this.trainingCourseEndDate = trainingCourseEndDate;
        this.trainingCourseHours = trainingCourseHours;
    }

    public TrainingCourse(String trainingCourseTitle, Employee trainingCourseAttendee,
                          String trainingCourseType, String trainingCourseDescription,
                          DateTimeFormatter trainingCourseStarDate,
                          DateTimeFormatter trainingCourseEndDate, byte trainingCourseHours) {
        this.trainingCourseTitle = trainingCourseTitle;
        this.trainingCourseAttendee = trainingCourseAttendee;
        this.trainingCourseType = trainingCourseType;
        this.trainingCourseDescription = trainingCourseDescription;
        this.trainingCourseStarDate = trainingCourseStarDate;
        this.trainingCourseEndDate = trainingCourseEndDate;
        this.trainingCourseHours = trainingCourseHours;
    }

    public int getTrainingCourseId() {
        return trainingCourseId;
    }

    public TrainingCourse setTrainingCourseId(int trainingCourseId) {
        this.trainingCourseId = trainingCourseId;
        return this;
    }

    public String getTrainingCourseTitle() {
        return trainingCourseTitle;
    }

    public TrainingCourse setTrainingCourseTitle(String trainingCourseTitle) {
        this.trainingCourseTitle = trainingCourseTitle;
        return this;
    }

    public Employee getTrainingCourseAttendee() {
        return trainingCourseAttendee;
    }

    public TrainingCourse setTrainingCourseAttendee(Employee trainingCourseAttendee) {
        this.trainingCourseAttendee = trainingCourseAttendee;
        return this;
    }

    public String getTrainingCourseType() {
        return trainingCourseType;
    }

    public TrainingCourse setTrainingCourseType(String trainingCourseType) {
        this.trainingCourseType = trainingCourseType;
        return this;
    }

    public String getTrainingCourseDescription() {
        return trainingCourseDescription;
    }

    public TrainingCourse setTrainingCourseDescription(String trainingCourseDescription) {
        this.trainingCourseDescription = trainingCourseDescription;
        return this;
    }

    public DateTimeFormatter getTrainingCourseStarDate() {
        return trainingCourseStarDate;
    }

    public TrainingCourse setTrainingCourseStarDate(DateTimeFormatter trainingCourseStarDate) {
        this.trainingCourseStarDate = trainingCourseStarDate;
        return this;
    }

    public DateTimeFormatter getTrainingCourseEndDate() {
        return trainingCourseEndDate;
    }

    public TrainingCourse setTrainingCourseEndDate(DateTimeFormatter trainingCourseEndDate) {
        this.trainingCourseEndDate = trainingCourseEndDate;
        return this;
    }

    public byte getTrainingCourseHours() {
        return trainingCourseHours;
    }

    public TrainingCourse setTrainingCourseHours(byte trainingCourseHours) {
        this.trainingCourseHours = trainingCourseHours;
        return this;
    }

    @Override
    public String toString() {
        return "TrainingCourse{" +
                "trainingCourseId=" + trainingCourseId +
                ", trainingCourseTitle='" + trainingCourseTitle + '\'' +
                ", trainingCourseAttendee=" + trainingCourseAttendee +
                ", trainingCourseType='" + trainingCourseType + '\'' +
                ", trainingCourseDescription='" + trainingCourseDescription + '\'' +
                ", trainingCourseStarDate=" + trainingCourseStarDate +
                ", trainingCourseEndDate=" + trainingCourseEndDate +
                ", trainingCourseHours=" + trainingCourseHours +
                '}';
    }
}
