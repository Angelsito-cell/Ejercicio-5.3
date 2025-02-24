class MensajeDeTexto(private val numeroTelefono: String) : Notificable {
    override fun enviarNotificacion() {
        println("Enviando mensaje de texto al número $numeroTelefono...")
    }
}
