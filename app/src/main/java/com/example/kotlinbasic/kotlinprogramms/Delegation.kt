package com.example.kotlinbasic.kotlinprogramms


fun main() {
    val mediaFile = MediaFile(FileDownloader("Compete.mp3"),FilePlayer("Compete.mp3"))
    mediaFile.download()
    mediaFile.play()

}

class FileDownloader(var file:String):Downloader {
    override fun download() {
        println("$file Downloaded")
    }
}

class FilePlayer(var file:String):Players {
    override fun play() {
        println("$file playing")
    }
}
/*
class MediaFile(
        val downloader: Downloader,
        val player: Players
):Downloader,Players {
    override fun download() {
        downloader.download()
    }

    override fun play() {
        player.play()
    }
}*/
class MediaFile(
        private val downloader: Downloader,
        private val player: Players
):Downloader by downloader,Players by player


interface Downloader{
    fun download()
}
interface Players{
    fun play()
}


