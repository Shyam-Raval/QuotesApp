import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.orderlist.R
import com.example.orderlist.models.Quote


@Composable

fun QuoteListItem(quote: Quote,onClick:(quote:Quote)->Unit) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation =  4.dp
        ),
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick(quote) }
            .background(Color.White),
        colors = CardDefaults.cardColors(
                containerColor = Color.White// Change this to your desired color
                )
    ) {
        Row( modifier = Modifier
            .padding(16.dp)
        ) {
           Image(
               painter = painterResource(id = R.drawable.img2),
               alignment = Alignment.TopStart,
               modifier = Modifier
                   .size(75.dp)
                   .rotate(0F)
                   .background(Color.White),





                contentDescription ="Quote" )

            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier=Modifier.weight(1f)) {
                Text(
                    text = quote.text,
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
                Box(modifier = Modifier
                    .background(Color(0xFFEEEEE))
                    .fillMaxWidth(0.4f)
                    .height(1.dp)
                )
                Text(
                    text = quote.author,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(4.dp)
                )


            }



        }
    }
}




