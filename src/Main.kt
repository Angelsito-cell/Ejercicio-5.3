fun main() {
    val notificaciones: List<Notificable> = listOf(
        CorreoElectronico("slipheryhyena404@gmail.com"),
        MensajeDeTexto("649-04-73-06"),
        NotificacionPush("Redmi Note 12 - 5g")
    )

    notificaciones.forEach { it.enviarNotificacion() }
}
