package Dto.Cargo;

public class CargoDto {
    public String Descripcion;

    public CargoDto() {
    }

    public CargoDto(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
