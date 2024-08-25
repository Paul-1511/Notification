package uvg.edu.gt.notification

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NotificationScreen() {
    val notifications = remember { generateFakeNotifications() }
    var selectedType by remember { mutableStateOf<NotificationType?>(null) }

    Column(modifier = Modifier.padding(top = 64.dp, start = 16.dp, end = 16.dp)) {
        FilterSection(selectedType) { newType ->
            selectedType = if (selectedType == newType) null else newType
        }

        NotificationList(
            notifications = if (selectedType == null) notifications else notifications.filter { it.type == selectedType }
        )
    }
}
