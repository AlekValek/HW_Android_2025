package com.alekvalek.consecutivepractices.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.alekvalek.consecutivepractices.ui.theme.Spacing
import androidx.compose.ui.tooling.preview.Preview
import com.alekvalek.consecutivepractices.R


@Composable
fun RatingBox(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodySmall,
        color = Color.White,
        modifier = Modifier
            .background(colorResource(R.color.gray), shape = MaterialTheme.shapes.small)
            .padding(horizontal = Spacing.small, vertical = Spacing.extraSmall)
            .height(15.dp)
            .widthIn(125.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun RatingBoxPreview() {
    RatingBox(text = "КиноПоиск: 8.5")
}
