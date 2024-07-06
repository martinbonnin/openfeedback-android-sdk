package io.openfeedback.m3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.openfeedback.resources.LocalStrings
import io.openfeedback.resources.Res
import io.openfeedback.resources.openfeedback_dark
import io.openfeedback.resources.openfeedback_light
import org.jetbrains.compose.resources.painterResource

@Composable
internal fun PoweredBy(
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.bodyMedium,
    color: Color = MaterialTheme.colorScheme.onBackground
) {
    val logo =
        if (MaterialTheme.colorScheme.background.luminance() > 0.5) Res.drawable.openfeedback_light
        else Res.drawable.openfeedback_dark
    val poweredBy = LocalStrings.current.strings.poweredBy
    Row(
        modifier = modifier.semantics(mergeDescendants = true) {
            contentDescription = "$poweredBy Openfeedback"
        },
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.Top
    ) {
        Text(text = poweredBy, style = style, color = color)
        Image(
            painter = painterResource(logo),
            contentDescription = null,
            modifier = Modifier.height(style.fontSize.value.dp + 13.dp)
        )
    }
}
