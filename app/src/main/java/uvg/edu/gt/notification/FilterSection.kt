package uvg.edu.gt.notification

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FilterSection(selectedType: NotificationType?, onFilterSelected: (NotificationType) -> Unit) {
    Column(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Tipos de notificaciones",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Row {
            NotificationType.entries.forEach { type ->
                FilterButton(
                    type = type,
                    isSelected = selectedType == type,
                    onClick = { onFilterSelected(type) }
                )
            }
        }
    }
}

@Composable
fun FilterButton(type: NotificationType, isSelected: Boolean, onClick: () -> Unit) {
    val backgroundColor = if (isSelected) MaterialTheme.colorScheme.secondary else MaterialTheme.colorScheme.tertiary
    val textColor = if (isSelected) MaterialTheme.colorScheme.onSecondary else MaterialTheme.colorScheme.onTertiary

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor)
    ) {
        Text(text = type.name, color = textColor)
    }
}
