public class Cierre_caja {

    private int Ganancias;

    public int getGanancias() {
        return Ganancias;
    }

    public void setGanancias(int ganancias) {
        Ganancias = ganancias;
    }

    public Cierre_caja(int ganancias) {
        Ganancias = ganancias;
    }

    public static class Servicio {

        private String  Nombre_ser;

        public Servicio(String nombre_ser, int precio_ser) {
            Nombre_ser = nombre_ser;
            Precio_ser = precio_ser;
        }

        public String getNombre_ser() {
            return Nombre_ser;
        }

        public void setNombre_ser(String nombre_ser) {
            Nombre_ser = nombre_ser;
        }

        public int getPrecio_ser() {
            return Precio_ser;
        }

        public void setPrecio_ser(int precio_ser) {
            Precio_ser = precio_ser;
        }

        private int Precio_ser;
    }
}
