package uvg.edu.gt.notification

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Event
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NotificationItem(notification: Notification) {
    val backgroundColor = when (notification.type) {
        NotificationType.INFO -> MaterialTheme.colorScheme.secondary
        NotificationType.CAPACITACION -> MaterialTheme.colorScheme.tertiary
        NotificationType.REMINDER -> MaterialTheme.colorScheme.error
    }

    val icon = when (notification.type) {
        NotificationType.INFO -> Icons.Default.Notifications
        NotificationType.CAPACITACION -> Icons.Default.School
        NotificationType.REMINDER -> Icons.Default.Event
    }

    val iconTint = MaterialTheme.colorScheme.onSecondary

    Card(
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Icon(imageVector = icon, contentDescription = null, tint = iconTint)
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = notification.title, style = MaterialTheme.typography.bodyLarge)
                Text(text = notification.content, style = MaterialTheme.typography.bodyMedium)
                Text(text = "${notification.date} • ${notification.time}", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}
