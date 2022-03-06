

fun main(){
    sharingwidget.incrementfblike()
    sharingwidget.incrementfblike()
    sharingwidget.incrementinstalike()
    sharingwidget.incrementfblike()
    sharingwidget.displaylikes()
}
object sharingwidget{
    var fblikes:Int=0
    var instalikes:Int=0
    fun incrementfblike()= fblikes++
    fun incrementinstalike()= instalikes++

    fun displaylikes()= println(" fb like->$fblikes and insta like->$instalikes")

}