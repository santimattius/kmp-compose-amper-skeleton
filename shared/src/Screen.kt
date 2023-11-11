import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import theme.AppTheme
import ui.components.AppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen() {
    AppTheme {
        Scaffold(
            topBar = { AppBar(title = "Amper") }
        ) {
            Box(
                    modifier = Modifier.fillMaxSize().padding(it),
                    contentAlignment = Alignment.Center,
            ) {
                BasicText("Hello, ${World().get()}!")
            }
        }
    }
}
