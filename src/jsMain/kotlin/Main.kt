//DM import kotlinx.browser.document
import web.dom.document
import react.create
import react.dom.client.createRoot

fun main() {
    //DM document.getElementById("root")?.innerHTML = "Hello, Kotlin/JS! :)"
    val container = document.getElementById("root") ?: error("Couldn't find container!")
    //DM val container = document.createElement("div")
    //DM document.body!!.appendChild(container)

    //DM val welcome = Welcome.create {
    //DM    name = "Kotlin/JS"
    //DM}
    //DMcreateRoot(container).render(welcome)
    createRoot(container).render(App.create())
}