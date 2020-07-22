package com.example.koshelek_ru.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Post(
    @SerializedName("message")
    @Expose
    val message: Message,
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
    val australian: Australian,
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
    val buhund: Buhund,
    @SerializedName("bulldog")
    @Expose
    val bulldog: Bulldog,
    @SerializedName("bullterrier")
    @Expose
    val bullterrier: Bullterrier,
    @SerializedName("cairn")
    @Expose
    val cairn: List<String>,
    @SerializedName("cattledog")
    @Expose
    val cattledog: Cattledog,
    @SerializedName("chihuahua")
    @Expose
    val chihuahua: List<String>,
    @SerializedName("chow")
    @Expose
    val chow: Bullterrier,
    @SerializedName("clumber")
    @Expose
    val clumber: List<String>,
    @SerializedName("cockapoo")
    @Expose
    val cockapoo: List<String>,
    @SerializedName("collie")
    @Expose
    val collie: Collie,
    @SerializedName("coonhound")
    @Expose
    val coonhound: List<String>,
    @SerializedName("corgi")
    @Expose
    val corgi: Corgi,
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
    val dane: Dane,
    @SerializedName("deerhound")
    @Expose
    val deerhound: Deerhound,
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
    val elkhound: Elkhound,
    @SerializedName("entlebucher")
    @Expose
    val entlebucher: List<String>,
    @SerializedName("eskimo")
    @Expose
    val eskimo: List<String>,
    @SerializedName("finnish")
    @Expose
    val finnish: Finnish,
    @SerializedName("frise")
    @Expose
    val frise: Frise,
    @SerializedName("germanshepherd")
    @Expose
    val germanshepherd: List<String>,
    @SerializedName("greyhound")
    @Expose
    val greyhound: Greyhound,
    @SerializedName("groenendael")
    @Expose
    val groenendael: List<String>,
    @SerializedName("havanese")
    @Expose
    val havanese: List<String>,
    @SerializedName("hound")
    @Expose
    val hound: Hound,
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
    val mastiff: Mastiff,
    @SerializedName("mexicanhairless")
    @Expose
    val mexicanhairless: List<String>,
    @SerializedName("mix")
    @Expose
    val mix: List<String>,
    @SerializedName("mountain")
    @Expose
    val mountain: Mountain,
    @SerializedName("newfoundland")
    @Expose
    val newfoundland: List<String>,
    @SerializedName("otterhound")
    @Expose
    val otterhound: List<String>,
    @SerializedName("ovcharka")
    @Expose
    val ovcharka: Ovcharka,
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
    val pinscher: Pinscher,
    @SerializedName("pitbull")
    @Expose
    val pitbull: List<String>,
    @SerializedName("pointer")
    @Expose
    val pointer: Pointer,
    @SerializedName("pomeranian")
    @Expose
    val pomeranian: List<String>,
    @SerializedName("poodle")
    @Expose
    val poodle: Poodle,
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
    val retriever: Retriever,
    @SerializedName("ridgeback")
    @Expose
    val ridgeback: Ridgeback,
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
    val schnauzer: Schnauzer,
    @SerializedName("setter")
    @Expose
    val setter: Setter,
    @SerializedName("sheepdog")
    @Expose
    val sheepdog: Sheepdog,
    @SerializedName("shiba")
    @Expose
    val shiba: List<String>,
    @SerializedName("shihtzu")
    @Expose
    val shihtzu: List<String>,
    @SerializedName("spaniel")
    @Expose
    val spaniel: Spaniel,
    @SerializedName("springer")
    @Expose
    val springer: Springer,
    @SerializedName("stbernard")
    @Expose
    val stbernard: List<String>,
    @SerializedName("terrier")
    @Expose
    val terrier: Terrier,
    @SerializedName("vizsla")
    @Expose
    val vizsla: List<String>,
    @SerializedName("waterdog")
    @Expose
    val waterdog: Waterdog,
    @SerializedName("weimaraner")
    @Expose
    val weimaraner: List<String>,
    @SerializedName("whippet")
    @Expose
    val whippet: List<String>,
    @SerializedName("wolfhound")
    @Expose
    val wolfhound: Wolfhound
)

data class Australian(
    @SerializedName("shepherd")
    @Expose
    val shepherd: String
)

data class Buhund(
    @SerializedName("norwegian")
    @Expose
    val norwegian: String
)

data class Bulldog(
    @SerializedName("boston")
    @Expose
    val boston: String,
    @SerializedName("english")
    @Expose
    val english: String,
    @SerializedName("french")
    @Expose
    val french: String
)

data class Bullterrier(
    @SerializedName("staffordshire")
    @Expose
    val staffordshire: String
)

data class Cattledog(
    @SerializedName("australian")
    @Expose
    val australian: String
)

data class Collie(
    @SerializedName("border")
    @Expose
    val border: String
)

data class Corgi(
    @SerializedName("cardigan")
    @Expose
    val cardigan: String
)

data class Dane(
    @SerializedName("great")
    @Expose
    val great: String
)

data class Deerhound(
    @SerializedName("scottish")
    @Expose
    val scottish: String
)

data class Elkhound(
    @SerializedName("norwegian")
    @Expose
    val norwegian: String
)

data class Finnish(
    @SerializedName("lapphund")
    @Expose
    val lapphund: String
)

data class Frise(
    @SerializedName("bichon")
    @Expose
    val bichon: String
)

data class Greyhound(
    @SerializedName("italian")
    @Expose
    val italian: String
)

data class Hound(
    @SerializedName("afghan")
    @Expose
    val afghan: String,
    @SerializedName("basset")
    @Expose
    val basset: String,
    @SerializedName("blood")
    @Expose
    val blood: String,
    @SerializedName("english")
    @Expose
    val english: String,
    @SerializedName("ibizan")
    @Expose
    val ibizan: String,
    @SerializedName("plott")
    @Expose
    val plott: String,
    @SerializedName("walker")
    @Expose
    val walker: String
)

data class Mastiff(
    @SerializedName("bull")
    @Expose
    val bull: String,
    @SerializedName("english")
    @Expose
    val english: String,
    @SerializedName("tibetan")
    @Expose
    val tibetan: String
)

data class Mountain(
    @SerializedName("bernese")
    @Expose
    val bernese: String,
    @SerializedName("swiss")
    @Expose
    val swiss: String
)

data class Ovcharka(
    @SerializedName("caucasian")
    @Expose
    val caucasian: String
)

data class Pinscher(
    @SerializedName("miniature")
    @Expose
    val miniature: String
)

data class Pointer(
    @SerializedName("german")
    @Expose
    val german: String,
    @SerializedName("germanlonghair")
    @Expose
    val germanlonghair: String
)

data class Poodle(
    @SerializedName("miniature")
    @Expose
    val miniature: String,
    @SerializedName("standard")
    @Expose
    val standard: String,
    @SerializedName("toy")
    @Expose
    val toy: String
)

data class Retriever(
    @SerializedName("chesapeake")
    @Expose
    val chesapeake: String,
    @SerializedName("curly")
    @Expose
    val curly: String,
    @SerializedName("flatcoated")
    @Expose
    val flatcoated: String,
    @SerializedName("golden")
    @Expose
    val golden: String
)

data class Ridgeback(
    @SerializedName("rhodesian")
    @Expose
    val rhodesian: String
)

data class Schnauzer(
    @SerializedName("giant")
    @Expose
    val giant: String,
    @SerializedName("miniature")
    @Expose
    val miniature: String
)

data class Setter(
    @SerializedName("english")
    @Expose
    val english: String,
    @SerializedName("gordon")
    @Expose
    val gordon: String,
    @SerializedName("irish")
    @Expose
    val irish: String
)

data class Sheepdog(
    @SerializedName("english")
    @Expose
    val english: String,
    @SerializedName("shetland")
    @Expose
    val shetland: String
)

data class Spaniel(
    @SerializedName("blenheim")
    @Expose
    val blenheim: String,
    @SerializedName("brittany")
    @Expose
    val brittany: String,
    @SerializedName("cocker")
    @Expose
    val cocker: String,
    @SerializedName("irish")
    @Expose
    val irish: String,
    @SerializedName("japanese")
    @Expose
    val japanese: String,
    @SerializedName("sussex")
    @Expose
    val sussex: String,
    @SerializedName("welsh")
    @Expose
    val welsh: String
)

data class Springer(
    @SerializedName("english")
    @Expose
    val english: String
)

data class Terrier(
    @SerializedName("american")
    @Expose
    val american: String,
    @SerializedName("australian")
    @Expose
    val australian: String,
    @SerializedName("bedlington")
    @Expose
    val bedlington: String,
    @SerializedName("border")
    @Expose
    val border: String,
    @SerializedName("dandie")
    @Expose
    val dandie: String,
    @SerializedName("fox")
    @Expose
    val fox: String,
    @SerializedName("irish")
    @Expose
    val irish: String,
    @SerializedName("kerryblue")
    @Expose
    val kerryblue: String,
    @SerializedName("lakeland")
    @Expose
    val lakeland: String,
    @SerializedName("norfolk")
    @Expose
    val norfolk: String,
    @SerializedName("norwich")
    @Expose
    val norwich: String,
    @SerializedName("patterdale")
    @Expose
    val patterdale: String,
    @SerializedName("russell")
    @Expose
    val russell: String,
    @SerializedName("scottish")
    @Expose
    val scottish: String,
    @SerializedName("sealyham")
    @Expose
    val sealyham: String,
    @SerializedName("silky")
    @Expose
    val silky: String,
    @SerializedName("tibetan")
    @Expose
    val tibetan: String,
    @SerializedName("toy")
    @Expose
    val toy: String,
    @SerializedName("westhighland")
    @Expose
    val westhighland: String,
    @SerializedName("wheaten")
    @Expose
    val wheaten: String,
    @SerializedName("yorkshire")
    @Expose
    val yorkshire: String
)

data class Waterdog(
    @SerializedName("spanish")
    @Expose
    val spanish: String
)

data class Wolfhound(
    @SerializedName("irish")
    @Expose
    val irish: String
)