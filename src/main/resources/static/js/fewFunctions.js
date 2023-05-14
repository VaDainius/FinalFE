
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