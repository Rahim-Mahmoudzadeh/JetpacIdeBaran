package ir.rahimmahmoudzadeh.idebaransampel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import ir.rahimmahmoudzadeh.idebaransampel.ui.theme.IdeBaranSampelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IdeBaranSampelTheme {
                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                    Surface(color = MaterialTheme.colors.background) {
                        ShowData(R.string.data)
                    }
                }
            }
        }
    }
}

@Composable()
fun ShowData(data: Int) {
    Column(
        modifier = Modifier.padding(8.dp, 6.dp, 8.dp, 6.dp)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)) {
            Text(
                stringResource(id = data),
                color = MaterialTheme.colors.surface,
                textAlign = TextAlign.Left,
                modifier = Modifier.fillMaxWidth()
            )
        }
        ShowTapImage()

    }
}

@Composable
fun ShowTapImage() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column(modifier = Modifier.weight(2.6f)) {
            Image(
                painterResource(id = R.drawable.untitled),
                contentDescription = "عکس",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp)
            )
        }
        Column(modifier = Modifier
            .weight(1f)
            .padding(5.dp)) {
            SingleCard(name = R.string.not_send_clock, R.drawable.laye)
        }
        Column(modifier = Modifier
            .weight(1.3f)
            .padding(2.dp)) {
            ThreeCard(
                intArrayOf(
                    R.drawable.car,
                    R.string.missionUser,
                    R.drawable.clock,
                    R.string.leave,
                    R.drawable.calendar,
                    R.string.reports
                )
            )
        }

        Column(modifier = Modifier
            .weight(1f)
            .padding(5.dp)) {
            SingleCard(R.string.clockLogin_clockExit, R.drawable.location)

        }
        Column(modifier = Modifier
            .weight(1.3f)
            .padding(2.dp)) {
            ThreeCard(
                intArrayOf(
                    R.drawable.car,
                    R.string.add_mission,
                    R.drawable.clock_engenier,
                    R.string.login_exist,
                    R.drawable.message,
                    R.string.message
                )
            )
        }


    }
}

@Composable
fun SingleCard(name: Int, image: Int) {
    Card(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(10.dp),
        elevation = 8.dp,
        backgroundColor = MaterialTheme.colors.onBackground
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(7.dp)
        ) {
            Image(
                painter = painterResource(id = image), contentDescription = "ساعت",
                modifier = Modifier
                    .width(46.dp)
                    .height(46.dp)
            )

            Text(
                stringResource(id = name), color = MaterialTheme.colors.surface,
                textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun ThreeCard(name: IntArray) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 8.dp,
            backgroundColor = MaterialTheme.colors.onBackground,
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .padding(5.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Image(
                    painterResource(id = name[0]), contentDescription = "ماموریت",
                    modifier = Modifier
                        .width(46.dp)
                        .height(46.dp)
                )
                Text(stringResource(id = name[1]), color = MaterialTheme.colors.surface)
            }
        }
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 8.dp,
            backgroundColor = MaterialTheme.colors.onBackground,
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .padding(5.dp)


        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painterResource(id = name[2]), contentDescription = "مرخصی",
                    modifier = Modifier
                        .width(46.dp)
                        .height(46.dp)
                )
                Text(stringResource(id = name[3]), color = MaterialTheme.colors.surface)
            }
        }
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 8.dp,
            backgroundColor = MaterialTheme.colors.onBackground,
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .padding(5.dp)

        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painterResource(id = name[4]), contentDescription = "گزارشات",
                    modifier = Modifier
                        .width(46.dp)
                        .height(46.dp)
                )
                Text(stringResource(id = name[5]), color = MaterialTheme.colors.surface)
            }
        }

    }
}
