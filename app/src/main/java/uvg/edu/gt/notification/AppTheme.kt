package uvg.edu.gt.notification

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = Color(0xFF388E3C),   // Verde oscuro para el TopAppBar
            onPrimary = Color.White,       // Blanco para el texto e iconos del TopAppBar
            secondary = Color(0xFF4CAF50), // Verde medio para botones de filtro seleccionados
            onSecondary = Color.White,     // Blanco sobre botones seleccionados
            tertiary = Color(0xFF81C784),  // Verde claro para botones de filtro no seleccionados
            onTertiary = Color.Black,      // Negro sobre botones no seleccionados
            surface = Color(0xFFE0E0E0),   // Gris claro para fondo de tarjetas de notificación
            onSurface = Color.Black,       // Negro sobre superficies grises
            background = Color(0xFFF5F5F5),// Fondo general gris muy claro
            onBackground = Color.Black     // Negro sobre el fondo general
        ),
        typography = Typography(),
        content = content
    )
}
