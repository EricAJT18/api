package api_employees.api.model;



import javax.persistence.*;

@Entity
@Table(name= "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String apellido;
    private String departamento;
    private Integer cedula;
    private Integer teléfono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(Integer teléfono) {
        this.teléfono = teléfono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String depatamento) {
        this.departamento = depatamento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;




    }

    public Employee(){

    }

    public Employee(String nombre, String apellido, String departamento, Integer cedula, Integer teléfono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.cedula = cedula;
        this.teléfono = teléfono;
    }
}
