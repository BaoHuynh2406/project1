
package Entity;

import java.util.Objects;

public class Areas {
    private int ID_Area;
    private String AreaName;

    public Areas(int ID_Area, String AreaName) {
        this.ID_Area = ID_Area;
        this.AreaName = AreaName;
    }

    public Areas() {
    }

    public int getID_Area() {
        return ID_Area;
    }

    public void setID_Area(int ID_Area) {
        this.ID_Area = ID_Area;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }
    
    @Override
    public String toString() {
        return this.AreaName;
    }
   @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Areas other = (Areas) obj;
        return ID_Area == other.ID_Area && Objects.equals(AreaName, other.AreaName);
    }
}
