package com.example.bustrans.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DefaultTextField (
    modifier: Modifier,
    value: String,
    label: String,
    icon: ImageVector,
    onValueChange: (value: String) -> Unit,
    keyboardType: KeyboardType=KeyboardType.Text,
    hideText: Boolean = false
) {
    Box(
        modifier = modifier
            .height(55.dp)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(topStart = 15.dp, bottomEnd = 15.dp)
            )

    ){
        TextField(
            value= value,
            onValueChange={ text ->
                onValueChange(text)
            },
            label={
                Text(text = label)
            },
            leadingIcon = {
                Row{
                    Icon(
                        icon,
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Spacer(
                        modifier = Modifier
                            .height(20.dp)
                            .width(1.dp)
                            .background(color= Color.Black)
                    )
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            visualTransformation = if(hideText) PasswordVisualTransformation() else VisualTransformation.None,
            colors= TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
            )

        )
    }
}

































