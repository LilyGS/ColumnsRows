package mx.lasallebajio.columnsrows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.lasallebajio.columnsrows.ui.theme.ColumnsRowsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnsRowsTheme {
                ColumnsRows()

            }
        }
    }
}

@Composable
fun ColumnsRows() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            CalculatorButton("1")
            CalculatorButton("2")
            CalculatorButton("3")
            CalculatorButton("+")
        }

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            CalculatorButton("4")
            CalculatorButton("5")
            CalculatorButton("6")
            CalculatorButton("-")
        }

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            CalculatorButton("7")
            CalculatorButton("8")
            CalculatorButton("9")
            CalculatorButton("*")
        }

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            CalculatorButton("0")
            CalculatorButton("C")
            CalculatorButton("=")
            CalculatorButton("/")
        }
    }

}

@Composable
fun CalculatorButton(valor: String){
    Button(onClick = {/* To Do */},
        shape = CircleShape,
        modifier = Modifier.size(60.dp).padding(2.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xCC4527A0) )
        ) {
        Text(text = valor, fontSize = 20.sp, color = Color.White)

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ColumnsRowsTheme {
        ColumnsRows()
    }
}