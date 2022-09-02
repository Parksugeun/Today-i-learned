var http = require('http');
var fs = require('fs');
var mime = require('Mime');
var server = http.createServer(function(request, response){
    
    var mapping = request.url; //       ./img/05.jpg , ./img/02.jfif

    if(mapping == '/'){
        fs.readFile(__dirname+ '/html/video_play_ex.html','utf-8',function(error, htmlData){
            if(!error){
                response.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
                response.end(htmlData);
            }else{
                response.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
                response.end("404 error Page...");
            }
        });
    }else if(mapping.indexOf("/img/") == 0){//이미지 접속
        mapping = mapping.replace("/img/","/images/"); //주소를 바꿔줌 ./img/05.jpg ->./images/05.jpg, ./img/02.jfif -> ./images/02.jfif
        mimeType = mime.getType(mapping.substring(1));

        fs.readFile(__dirname+mapping,'',function(error, imgData){
            if(!error){
                response.writeHead(200, {"Content-Type":mimeType});
                response.end(imgData);
            }
        });
    }else if(mapping.indexOf("/video/")==0){//동영상 보내기
        //1. streaming 처리를 하는 객체를 생성 /video/Wildlife.mp4
        // 한번에 읽어오는 byte수는 65535byte이다.
        var stream = fs.createReadStream(mapping.substring(1)); //stream처리를 할 수 있게 하는 함수
        var cnt = 0; //스트리밍 횟수

        //2. 데이터를 읽어왔을 때 처리할 이벤트
        //          이벤트 종류
        stream.on('data', function(videoData){//콜백함수
            response.write(videoData);
            console.log(++cnt +"번째, size="+ videoData.length);
        });
        //3. 데이터를 마지막으로 읽어왔을 때 처리할 이벤트
        stream.on('end',function(){
            response.end();
            console.log("end 스트리밍...");
        });
        //4. 데이터를 읽기 중 에러 발생했을 때 처리하는 이벤트
        stream.on('error', function(){
            response.end();
            console.log("error 스트리밍...");
        });
    }else if(mapping.indexOf("/js_css/")==0){//css ./js_css/style.css      /js_css/script.js
        var extension = mapping.substring(mapping.lastIndexOf(".")+1);

        if(extension == "css"){//스타일시트
            fs.readFile(__dirname+mapping, 'utf-8',function(error, cssData){
                if(!error){
                    response.writeHead(200,{"Content-Type":"text/css"});
                    response.end(cssData);
                }
            });
        }else{//자바스크립트
            fs.readFile(__dirname+mapping,'utf-8',function(error, jsData){
                if(!error){
                    response.writeHead(200, {"Content-Type":"text/javascript"});
                    response.end(jsData);
                }
            });
        }
    }else{
        response.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
        response.end("404 error Page...");
    }


    /*
    var url = request.url;
    console.log("url==>"+ url);
    if(url == "/"){
        fs.readFile(__dirname+"/html/video_play.html", 'utf-8', function(error, htmlData){
            if(error){
                response.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
                response.end("파일이 존재하지 않습니다..");
            }else{
                response.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
                response.end(htmlData);
            }
        });
    }else if(url.indexOf("/images") == 0){
        var resource = url.substring(1);

        var mimeName = mime.getType(resource);
        console.log("mimeName=>"+ mimeName);
        
        if(mimeName==null) mimeName="images/jpg";
        fs.readFile(__dirname+url, function(error, imgData){
            if(!error){
                response.writeHead(200, {"Content-Type":mimeName});
                response.end(imgData);
            }
        });

    }*/
});

server.listen(10008, function(){
    console.log("server start... http://localhost:10008/");
});

