var http = require('http');
var fs = require('fs');

// 모듈 추가 하는 방법 : npm
// 해당 프로젝트 위치에서 npm을 이용하여 모듈을 추가한다.
// >npm install mime@2.5.2
var mime = require('Mime');



var server = http.createServer(function(request, response){
    var url = request.url;
    console.log("url==>"+ url);
    if(url == "/"){//홈페이지
        //index.html파일을 비동기식으로 읽어 response에 쓰기
        fs.readFile(__dirname+"/html/index.html", 'utf-8', function(e, htmlData){// 콜백함수
            if(e){//파일 읽기 실패
                response.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
                response.end("파일이 존재하지 않습니다..");
            }else{//파일 읽기 성공
                response.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
                response.end(htmlData);
            }
        });
   }else if(url == "/subpage"){//서브페이지
        fs.readFile(__dirname+'/html/subpage.html','utf-8',function(e, d){
            if(!e){//정상적이면
                response.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
                response.end(d);
            }else{//읽기 실패
                response.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
                response.end("404 존재하지 않는 페이지 입니다.");
            }
        });
   }else if(url.indexOf("/images") == 0){//이미지 요청일때
        // /images/ty1.jpg
        var resource = url.substring(1);

        //마임 구하기
        var mimeName = mime.getType(resource);
        console.log("mimeName->"+ mimeName);

        if(mimeName==null) mimeName="image/jpg";

        //파일읽어 response에 쓰기를 하면 이미지가 클라이언트에게 전송된다.
        fs.readFile(__dirname+url, function(error, imgData){
            if(!error){
                response.writeHead(200, {"Content-Type":mimeName});
                response.end(imgData);
            }
        });
   }
});

server.listen(10006, function(){
    console.log("server start... http://localhost:10006");
});





