package uvg.edu.gt.notification

data class Notification(
    val id: Int,
    val type: NotificationType,
    val title: String,
    val content: String,
    val date: String,
    val time: String
)

enum class NotificationType {
    INFO, CAPACITACION, REMINDER
}

fun generateFakeNotifications(): List<Notification> {
    return listOf(
        Notification(1, NotificationType.INFO, "Nueva versión disponible", "La aplicación ha sido actualizada a v1.1.0.", "19 ago", "2:30 p.m."),
        Notification(2, NotificationType.CAPACITACION, "Nueva capacitación", "El día Martes 21 de Agosto tendremos una nueva capacitación en el INTECAP.", "15 ago", "3:00 p.m."),
        Notification(3, NotificationType.REMINDER, "¡Mañana capacitación de ICTA!", "No te olvides de asistir a esta capacitación mañana, a las 6pm, en el Intecap.", "5 ago", "11:30 a.m."),
    )
}
