package uvg.edu.gt.notification

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NotificationList(notifications: List<Notification>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(8.dp)
    ) {
        items(notifications) { notification ->
            NotificationItem(notification = notification)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
