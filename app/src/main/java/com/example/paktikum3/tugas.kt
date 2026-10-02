package com.example.paktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paktikum3.ui.theme.Paktikum3Theme

@Composable
fun HalamanLogin(modifier: Modifier = Modifier) {
    val background = painterResource(id = R.drawable.bg_login)
    val logo = painterResource(id = R.drawable.logo_umy)
    val foto = painterResource(id = R.drawable.foto_profil)

    Box(modifier = modifier.fillMaxSize()) {
        // Gambar latar penuh layar
        Image(
            painter = background,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        // Lapisan gelap agar teks terbaca di atas background
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Black.copy(alpha = 0.55f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Bagian atas: judul dan logo
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Login",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Text(
                    text = "Ini adalah halaman login,",
                    fontSize = 16.sp,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    painter = logo,
                    contentDescription = "Logo UMY",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(130.dp)
                        .clip(CircleShape)
                )
            }

            // Bagian tengah: identitas
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Nama",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red
                )
                Text(
                    text = "Zaki Anis Fauzan",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Text(
                    text = "20240140010",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            // Bagian bawah: foto dalam lingkaran
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = foto,
                    contentDescription = "Foto profil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(180.dp)
                        .clip(CircleShape)
                        .border(width = 3.dp, color = Color.Yellow, shape = CircleShape)
                )
                Spacer(modifier = Modifier.height(40.dp))
            }
        }
    }
}
