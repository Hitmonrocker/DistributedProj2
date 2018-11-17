package Foodie;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Info {
        @JsonProperty("nearby_restaurants")
        private List<nearby_restaurants> rest;

        public List<nearby_restaurants> getRest(){
            return  rest;
        }
        public void setRest(List<nearby_restaurants> rest){
            this.rest = rest;
        }
    public String toString() {
        return "Infomation = "+rest;
    }
}
