import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    HourContract(){

    }

    HourContract(LocalDate date, Double valuePerHour, Integer hours){
        this.date=date;
        this.valuePerHour=valuePerHour;
        this.hours=hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue(){
        return this.hours*this.valuePerHour;
    }
}
