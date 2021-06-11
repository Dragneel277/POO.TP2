package app;
import java.time.LocalDate;
import java.time.LocalDateTime;


public abstract class Epass {
    private Long codigo;
    private double saldo;
    private double precoViagem;
    protected static LocalDateTime dataEmissaoDateTime;
    private LocalDate dataCarrega;
    private LocalDate dataValida;
    private static long lcode;

    
    static{
        if(Long.valueOf(lcode)==null){
            lcode= 0;
        }
    }


    public Epass(double saldo, double precoViagem) {
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.codigo=lcode+1;
        lcode=lcode++;
    }

    public Epass(double precoViagem) {
        this.precoViagem = precoViagem;
        this.codigo=lcode+1;
        lcode=lcode++;
    }

    public Epass(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,LocalDateTime dataEmissaoDateTime) {
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.dataCarrega = dataCarrega;
        this.dataValida = dataValida;
        Epass.dataEmissaoDateTime=LocalDateTime.now();
        this.codigo=lcode+1;
        lcode=lcode++;
    }

    public Epass(double saldo, LocalDate dataCarrega) {
        this.saldo = saldo;
        this.dataCarrega = dataCarrega;
    }

    public Long getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public LocalDate getDataCarrega() {
        return dataCarrega;
    }

    public void setDataCarrega(LocalDate dataCarrega) {
        this.dataCarrega = dataCarrega;
    }

    public LocalDate getDataValida() {
        return dataValida;
    }

    public void setDataValida(LocalDate dataValida) {
        this.dataValida = dataValida;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Epass other = (Epass) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (dataCarrega == null) {
            if (other.dataCarrega != null)
                return false;
        } else if (!dataCarrega.equals(other.dataCarrega))
            return false;
        if (dataValida == null) {
            if (other.dataValida != null)
                return false;
        } else if (!dataValida.equals(other.dataValida))
            return false;
        if (Double.doubleToLongBits(precoViagem) != Double.doubleToLongBits(other.precoViagem))
            return false;
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Epass [codigo=" + codigo + ", dataCarrega=" + dataCarrega + ", dataValida=" + dataValida
                + ", precoViagem=" + precoViagem + ", saldo=" + saldo + "]";
    }

}
