class NotificacionPush(private val dispositivo: String) : Notificable {
    override fun enviarNotificacion() {
        println("Enviando notificación push al dispositivo $dispositivo...")
    }
}
