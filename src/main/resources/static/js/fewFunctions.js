
//document.querySelectorAll('[id^="buy_"]').forEach((element) => {
//  element.addEventListener("click", () => {
//    alert("Added to cart");
//    location.href = "/cart";
//  });
//});
document.querySelectorAll('[id^="buy_"]').forEach((element) => {
  element.addEventListener("mouseenter", () => {
    element.style.backgroundColor = "darkgrey";
   });

  element.addEventListener("mouseleave", () => {
    element.style.backgroundColor = "azure";
  });
});

function changeLanguage() {
    var selectElement = document.getElementById("languageSelect");
    var selectedLanguage = selectElement.value;
//    if (selectedLanguage === "lt") {
//        window.location.href = "*/?lang=lt";
//    } else-if (selectedLanguage === "en") {
//        window.location.href = "*/?lang=en";
//    }
        if (selectedLanguage === "lt") {
            window.location.href = "/?lang=lt";
        } else if (selectedLanguage === "en") {
            window.location.href = "/?lang=en";
        }
}