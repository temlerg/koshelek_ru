package com.example.koshelek_ru.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Post(
    @SerializedName("message")
    @Expose
    val message: List<String>,
    @SerializedName("status")
    @Expose
    val status: String
)

data class Message(
    @SerializedName("affenpinscher")
    @Expose
    val affenpinscher: List<String>,
    @SerializedName("african")
    @Expose
    val african: List<String>,
    @SerializedName("airedale")
    @Expose
    val airedale: List<String>,
    @SerializedName("akita")
    @Expose
    val akita: List<String>,
    @SerializedName("appenzeller")
    @Expose
    val appenzeller: List<String>,
    @SerializedName("australian")
    @Expose
    val australian: List<String>,
    @SerializedName("basenji")
    @Expose
    val basenji: List<String>,
    @SerializedName("beagle")
    @Expose
    val beagle: List<String>,
    @SerializedName("bluetick")
    @Expose
    val bluetick: List<String>,
    @SerializedName("borzoi")
    @Expose
    val borzoi: List<String>,
    @SerializedName("bouvier")
    @Expose
    val bouvier: List<String>,
    @SerializedName("boxer")
    @Expose
    val boxer: List<String>,
    @SerializedName("brabancon")
    @Expose
    val brabancon: List<String>,
    @SerializedName("briard")
    @Expose
    val briard: List<String>,
    @SerializedName("buhund")
    @Expose
    val buhund: List<String>,
    @SerializedName("bulldog")
    @Expose
    val bulldog: List<String>,
    @SerializedName("bullterrier")
    @Expose
    val bullterrier: List<String>,
    @SerializedName("cairn")
    @Expose
    val cairn: List<String>,
    @SerializedName("cattledog")
    @Expose
    val cattledog: List<String>,
    @SerializedName("chihuahua")
    @Expose
    val chihuahua: List<String>,
    @SerializedName("chow")
    @Expose
    val chow: List<String>,
    @SerializedName("clumber")
    @Expose
    val clumber: List<String>,
    @SerializedName("cockapoo")
    @Expose
    val cockapoo: List<String>,
    @SerializedName("collie")
    @Expose
    val collie: List<String>,
    @SerializedName("coonhound")
    @Expose
    val coonhound: List<String>,
    @SerializedName("corgi")
    @Expose
    val corgi: List<String>,
    @SerializedName("cotondetulear")
    @Expose
    val cotondetulear: List<String>,
    @SerializedName("dachshund")
    @Expose
    val dachshund: List<String>,
    @SerializedName("dalmatian")
    @Expose
    val dalmatian: List<String>,
    @SerializedName("dane")
    @Expose
    val dane: List<String>,
    @SerializedName("deerhound")
    @Expose
    val deerhound: List<String>,
    @SerializedName("dhole")
    @Expose
    val dhole: List<String>,
    @SerializedName("dingo")
    @Expose
    val dingo: List<String>,
    @SerializedName("doberman")
    @Expose
    val doberman: List<String>,
    @SerializedName("elkhound")
    @Expose
    val elkhound: List<String>,
    @SerializedName("entlebucher")
    @Expose
    val entlebucher: List<String>,
    @SerializedName("eskimo")
    @Expose
    val eskimo: List<String>,
    @SerializedName("finnish")
    @Expose
    val finnish: List<String>,
    @SerializedName("frise")
    @Expose
    val frise: List<String>,
    @SerializedName("germanshepherd")
    @Expose
    val germanshepherd: List<String>,
    @SerializedName("greyhound")
    @Expose
    val greyhound: List<String>,
    @SerializedName("groenendael")
    @Expose
    val groenendael: List<String>,
    @SerializedName("havanese")
    @Expose
    val havanese: List<String>,
    @SerializedName("hound")
    @Expose
    val hound: List<String>,
    @SerializedName("husky")
    @Expose
    val husky: List<String>,
    @SerializedName("keeshond")
    @Expose
    val keeshond: List<String>,
    @SerializedName("kelpie")
    @Expose
    val kelpie: List<String>,
    @SerializedName("komondor")
    @Expose
    val komondor: List<String>,
    @SerializedName("kuvasz")
    @Expose
    val kuvasz: List<String>,
    @SerializedName("labrador")
    @Expose
    val labrador: List<String>,
    @SerializedName("leonberg")
    @Expose
    val leonberg: List<String>,
    @SerializedName("lhasa")
    @Expose
    val lhasa: List<String>,
    @SerializedName("malamute")
    @Expose
    val malamute: List<String>,
    @SerializedName("malinois")
    @Expose
    val malinois: List<String>,
    @SerializedName("maltese")
    @Expose
    val maltese: List<String>,
    @SerializedName("mastiff")
    @Expose
    val mastiff: List<String>,
    @SerializedName("mexicanhairless")
    @Expose
    val mexicanhairless: List<String>,
    @SerializedName("mix")
    @Expose
    val mix: List<String>,
    @SerializedName("mountain")
    @Expose
    val mountain: List<String>,
    @SerializedName("newfoundland")
    @Expose
    val newfoundland: List<String>,
    @SerializedName("otterhound")
    @Expose
    val otterhound: List<String>,
    @SerializedName("ovcharka")
    @Expose
    val ovcharka: List<String>,
    @SerializedName("papillon")
    @Expose
    val papillon: List<String>,
    @SerializedName("pekinese")
    @Expose
    val pekinese: List<String>,
    @SerializedName("pembroke")
    @Expose
    val pembroke: List<String>,
    @SerializedName("pinscher")
    @Expose
    val pinscher: List<String>,
    @SerializedName("pitbull")
    @Expose
    val pitbull: List<String>,
    @SerializedName("pointer")
    @Expose
    val pointer: List<String>,
    @SerializedName("pomeranian")
    @Expose
    val pomeranian: List<String>,
    @SerializedName("poodle")
    @Expose
    val poodle: List<String>,
    @SerializedName("pug")
    @Expose
    val pug: List<String>,
    @SerializedName("puggle")
    @Expose
    val puggle: List<String>,
    @SerializedName("pyrenees")
    @Expose
    val pyrenees: List<String>,
    @SerializedName("redbone")
    @Expose
    val redbone: List<String>,
    @SerializedName("retriever")
    @Expose
    val retriever: List<String>,
    @SerializedName("ridgeback")
    @Expose
    val ridgeback: List<String>,
    @SerializedName("rottweiler")
    @Expose
    val rottweiler: List<String>,
    @SerializedName("saluki")
    @Expose
    val saluki: List<String>,
    @SerializedName("samoyed")
    @Expose
    val samoyed: List<String>,
    @SerializedName("schipperke")
    @Expose
    val schipperke: List<String>,
    @SerializedName("schnauzer")
    @Expose
    val schnauzer: List<String>,
    @SerializedName("setter")
    @Expose
    val setter: List<String>,
    @SerializedName("sheepdog")
    @Expose
    val sheepdog: List<String>,
    @SerializedName("shiba")
    @Expose
    val shiba: List<String>,
    @SerializedName("shihtzu")
    @Expose
    val shihtzu: List<String>,
    @SerializedName("spaniel")
    @Expose
    val spaniel: List<String>,
    @SerializedName("springer")
    @Expose
    val springer: List<String>,
    @SerializedName("stbernard")
    @Expose
    val stbernard: List<String>,
    @SerializedName("terrier")
    @Expose
    val terrier: List<String>,
    @SerializedName("vizsla")
    @Expose
    val vizsla: List<String>,
    @SerializedName("waterdog")
    @Expose
    val waterdog: List<String>,
    @SerializedName("weimaraner")
    @Expose
    val weimaraner: List<String>,
    @SerializedName("whippet")
    @Expose
    val whippet: List<String>,
    @SerializedName("wolfhound")
    @Expose
    val wolfhound: List<String>
)