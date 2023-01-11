const obj = {
  name: "Peter",
  age: 25,
};
if (obj.name === "Jason" && obj.age >= 25) {
  console.log("안녕!" + obj.name + "너의나이는" + obj.age);
} else {
  console.log("you are not a member!");
}
const messageContainer = document.querySelector("#d-day-message");
const container = document.querySelector("#d-day-container");

//container.style.display = "none";
messageContainer.innerHTML = "<h3>D-Day를 입력해 주세요.</h3>";

const dateFormMaker = function () {
  const inputYear = document.querySelector("#target-year-input").value;
  const inputMonth = document.querySelector("#target-month-input").value;
  const inputDate = document.querySelector("#target-date-input").value;

  //const dateFormat = inputYear + '-' + inputMonth + '-' + inputDate
  const dateFormat = `${inputYear}-${inputMonth}-${inputDate}`; // ` 백틱에서는 문자열안에서 바로 변수 데이터를 만들 수 있다.
  return dateFormat;
  //console.log(inputYear,inputMonth,inputDate);
};
const counterMaker = function () {
  const targetDateInput = dateFormMaker();
  console.log(targetDateInput);
  const nowDate = new Date();
  const targetDate = new Date(targetDateInput).setHours(0, 0, 0, 0);
  const remaining = (targetDate - nowDate) / 1000;
  // 만약, remaining이 0 이라면, 타이머가 종료 되었습니다. 출력
  // 수도코드(한글로 코드를 작성하는 것)

  if (remaining <= 0) {
    messageContainer.innerHTML = "<h3>타이머가 종료되었습니다.</h3>";
  } else if (isNaN(remaining)) {
    // 만약, 잘못된 날짜가 들어왔다면, 유효한 시간대가 아닙니다. 출력
    messageContainer.innerHTML = "<h3>유효한 시간대가 아닙니다.</h3>";
  }
  /*
  const remainingDate = Math.floor(remaining / 3600 / 24);
  const remainingHours = Math.floor(remaining / 3600) % 24;
  const remainingMin = Math.floor(remaining / 60) % 60;
  const remainingSec = Math.floor(remaining) % 60;
*/
  const remainingObj = {
    remainingDate: Math.floor(remaining / 3600 / 24),
    remainingHours: Math.floor(remaining / 3600) % 24,
    remainingMin: Math.floor(remaining / 60) % 60,
    remainingSec: Math.floor(remaining) % 60,
  };
  /*
  const days = document.getElementById("days");
  const hours = document.getElementById("hours");
  const min = document.getElementById("min");
  const sec = document.getElementById("sec");
*/
  const documentObj = {
    days: document.getElementById("days"),
    hours: document.getElementById("hours"),
    min: document.getElementById("min"),
    sec: document.getElementById("sec"),
  };

  documentObj["days"].textContent = remainingObj["remainingDate"];
  documentObj["hours"].textContent = remainingObj["remainingHours"];
  documentObj["min"].textContent = remainingObj["remainingMin"];
  documentObj["sec"].textContent = remainingObj["remainingSec"];
};
