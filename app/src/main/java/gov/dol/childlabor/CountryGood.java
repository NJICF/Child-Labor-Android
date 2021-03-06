package gov.dol.childlabor;

import java.io.Serializable;

/**
 * Created by trjohnson on 10/21/2015.
 */
public class CountryGood implements Serializable {

    private String goodName, countryName;
    private Boolean hasChildLabor, hasForcedLabor, hasForcedChildLabor;

    public CountryGood() {
        hasChildLabor = hasForcedLabor = hasForcedChildLabor = false;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String name) {
        this.countryName = name;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String name) {
        this.goodName = name;
    }

    public Boolean hasChildLabor() {
        return hasChildLabor;
    }

    public void setChildLabor(Boolean hasChildLabor) {
        this.hasChildLabor = hasChildLabor;
    }

    public Boolean hasForcedLabor() {
        return hasForcedLabor;
    }

    public void setForcedLabor(Boolean hasForcedLabor) {
        this.hasForcedLabor = hasForcedLabor;
    }

    public Boolean hasForcedChildLabor() {
        return hasForcedChildLabor;
    }

    public void setForcedChildLabor(Boolean hasForcedChildLabor) {
        this.hasForcedChildLabor = hasForcedChildLabor;
    }

}
