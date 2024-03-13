package com.example.chatcompose

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatcompose.itemlista.UsuarioItem
import com.example.chatcompose.model.Usuario
import com.example.chatcompose.ui.theme.ChatComposeTheme
import com.example.chatcompose.ui.theme.GREEN200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatComposeTheme {
                HomePage()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Chat")
                },
            )
        }
    ) {
        ListaUsuarios(modifier = Modifier.padding(it))
    }
}

@Composable
fun ListaUsuarios(modifier: Modifier) {
    val listaUsuarios: MutableList<Usuario> = mutableListOf(
        Usuario("Maria", R.drawable.woman),
        Usuario("Ana", R.drawable.woman),
        Usuario("Maria", R.drawable.woman),
        Usuario("Ana", R.drawable.woman),
        Usuario("Maria", R.drawable.woman),
        Usuario("Ana", R.drawable.woman),
        Usuario("Maria", R.drawable.woman),
        Usuario("Ana", R.drawable.woman),
        Usuario("Maria", R.drawable.woman),
        Usuario("Ana", R.drawable.woman),
        Usuario("Maria", R.drawable.woman),
        Usuario("Ana", R.drawable.woman),
        Usuario("Maria", R.drawable.woman),
        Usuario("Ana", R.drawable.woman),
        Usuario("Maria", R.drawable.woman),
        Usuario("Ana", R.drawable.woman),
        Usuario("Maria", R.drawable.woman),
        Usuario("Ana", R.drawable.woman),
        Usuario("Maria", R.drawable.woman),
        Usuario("Ana", R.drawable.woman),
    )

    LazyColumn {
        itemsIndexed(listaUsuarios) { index, item ->
            UsuarioItem(usuario = item)

        }
    }
}