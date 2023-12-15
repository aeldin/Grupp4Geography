import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;


    @Entity
    @Table(name = "capital")
    public class Capital {


        @Id
        @Column(name = "CapitalId")
        private int capitalId;

        @Column(name = "capitalName")
        private String capitalName;

        @Column(name = "capitalPopulation")
        private Integer capitalPopulation;

        @Column(name = "timezone")
        private String timezone;

        @Column(name = "areaInKm2")
        private Integer areaInKm2;

        public int getCapitalId() {
            return capitalId;
        }

        public void setCapitalId(int capitalId) {
            this.capitalId = capitalId;
        }

        public String getCapitalName() {
            return capitalName;
        }

        public void setCapitalName(String capitalName) {
            this.capitalName = capitalName;
        }

        public Integer getCapitalPopulation() {
            return capitalPopulation;
        }

        public void setCapitalPopulation(Integer capitalPopulation) {
            this.capitalPopulation = capitalPopulation;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public Integer getAreaInKm2() {
            return areaInKm2;
        }

        public void setAreaInKm2(Integer areaInKm2) {
            this.areaInKm2 = areaInKm2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Capital capital = (Capital) o;
            return capitalId == capital.capitalId && Objects.equals(capitalName, capital.capitalName) && Objects.equals(capitalPopulation, capital.capitalPopulation) && Objects.equals(timezone, capital.timezone) && Objects.equals(areaInKm2, capital.areaInKm2);
        }

        @Override
        public int hashCode() {
            return Objects.hash(capitalId, capitalName, capitalPopulation, timezone, areaInKm2);
        }

        @Override
        public String toString() {
            return "Capital{" +
                    "capitalId=" + capitalId +
                    ", capitalName='" + capitalName + '\'' +
                    ", capitalPopulation=" + capitalPopulation +
                    ", timezone='" + timezone + '\'' +
                    ", areaInKm2=" + areaInKm2 +
                    '}';
        }
    }





