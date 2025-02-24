class CorreoElectronico(private val destinatario: String) : Notificable {
    override fun enviarNotificacion() {
        println("Enviando correo electrónico a $destinatario...")
    }
}
