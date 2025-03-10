package org.wikipedia.homeworks.homework11

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.uiautomator.UiSelector
import com.kaspersky.kaspresso.device.exploit.Exploit
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import java.util.Locale

class DeviceTest : TestCase() {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun deviceTest() {
        before { // выполнится до совершения run
            device.network.disable()
        }.after { // блок выполнится в любом случае после завершения секции run
            device.network.enable()
            device.language.switchInApp(Locale.ENGLISH)

        }.run {
            device.uiDevice.findObject(UiSelector().text("").index(23))
            device.files
            Thread.sleep(3000)
            device.exploit.setOrientation(Exploit.DeviceOrientation.Landscape)
            device.language.switchInApp(Locale.CHINESE)
            adbServer.performAdb()
//            device.network.toggleWiFi(false)


        }
    }

    @Test
    fun deviceCheckOrientationTest() {
        before {

        }.after {
            device.uiDevice.setOrientationNatural()

        }.run {
            device.uiDevice.setOrientationRight()
            device.uiDevice.isNaturalOrientation

            // выключение экрана, включение и проверка отображения элемента (любого)

            device.uiDevice.sleep()
            Thread.sleep(3000)
            device.uiDevice.wakeUp()
            Thread.sleep(3000)
            device.uiDevice.findObject(UiSelector().text("").index(1))
        }
    }

    @Test
    fun deviceSleepTest() {
        before {
            device.uiDevice.sleep()
            Thread.sleep(3000)
        }.after {


        }.run {
            // выключение экрана, включение и проверка отображения элемента (любого)
            device.uiDevice.wakeUp()
            Thread.sleep(3000)
            device.uiDevice.findObject(UiSelector().text("").index(1))
        }
    }

    @Test
    fun deviceWrapAppTest() {
        before {
            // "свернуть" приложение кнопкой home
            device.uiDevice.pressHome()
        }.after {


        }.run {
            // развернуть дважды нажав recent apps и проверить отображение элемента (любого)
            device.uiDevice.pressRecentApps()
            device.uiDevice.pressRecentApps()
            device.uiDevice.findObject(UiSelector().text("").index(2))
        }
    }

    @Test
    fun deviceNetworkTest() {
        before {
            //  выключить сеть
            device.network.toggleWiFi(false)

        }.after {
            //Включить сеть и нажать Retry,
            // проверить отображение заголовка (может работать некорректно, в этом случае забить на тест)
            device.network.toggleWiFi(true)
        }.run {
            // перейти в статью и проверить отображение ошибки и кнопки Retry.
            device.uiDevice.findObject(UiSelector().text("").index(1)).click()

            device.uiDevice.findObject(UiSelector().text("Ошибка сети"))
            device.uiDevice.findObject(UiSelector().text("Retry"))

        }
    }

    //- поменять язык приложения и проверить текст какой-нибудь кнопки (не через ресурсы)
    @Test
    fun deviceLanguageTest() {
        before {
            //   device.language.switchInApp(Locale.FRENCH)

        }.after {
            device.language.switchInApp(Locale.ENGLISH)

        }.run {
            device.language.switchInApp(Locale.FRENCH)
            Thread.sleep(3000)

            device.uiDevice.findObject(UiSelector().text("Skip"))
        }
    }

    //- проверить, что сейчас активна MainActivity.
    @Test
    fun deviceMainActivityActiveTest() {
        run {
            device.activities.isCurrent(MainActivity::class.java)
//            device.uiDevice.currentActivityName.equals(MainActivity)
//
        }
    }

    //3. Задание повышенной сложности: сделать скриншот экрана, скопировать его с девайса на хост в директорию build из теста с использованием adbServer объекта.
}