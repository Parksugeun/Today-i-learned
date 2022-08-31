//파일의 원 내용을 유지하고 새로운 내용을 추가하기

var fs =require('fs');

// 비동기식으로 파일 추가
var appendData = "\n비동기식으로 파일 내용 추가 하기 테스트 중..."
fs.appendFile(__dirname+"/dataFile/txtWrite.txt", appendData, 'utf-8', function(err){
    if(!err){
        console.log("파일내용이 정상 추가 되었습니다..");
    }else{
        console.log("파일 내용 추가 실패하였습니다.");
    }
});

// 동기식으로 파일 추가

var appData = "\n두산은 지난 21일 잠실 LG전을 앞두고 선발진의 한 축을 담당하던 이영하를 1군 엔트리에서 제외했다. 당시 김태형 감독은 선수가 거듭된 부진 탓에 심리적인 안정을 찾지 못한 상태라고 설명했다. 이영하와 면담한 권명철 투수코치도 사령탑에게 1군 엔트리 말소를 제안했던 터. 실제로 이영하는 후반기 4경기서 승리 없이 3패 평균자책점 11.17로 크게 흔들렸다. 모두가 말소를 납득할만한 성적이었다. ";
try{
    // dataFile/file_read.txt 읽기한 후 읽은 내용을 txtWrite.txt에 추가하기
    fs.readFile(__dirname+"/dataFile/file_read.txt", 'utf-8', function(err, data){
        if(err){
            console.log("read fail...");
        }else{
            fs.appendFileSync(__dirname+"/dataFile/txtWrite.txt", "\n"+data, 'utf-8');
            console.log("동기식 파일내용 추가 완료됨... ");
        }
    });
}catch(e){
    console.log("동기식 파일 추가 에러 발생...");
}