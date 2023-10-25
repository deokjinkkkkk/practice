const { defineConfig } = require('@vue/cli-service')
module.exports = {  
  outputDir: "../src/main/resources/static",  		// npm run build 빌드 시 파일이 생성되는 위치
  indexPath: "index.html",  			// index.html 파일이 생성될 위치
  devServer: {  					// Back-End, Spring Boot의 내장 was 주소 입력
  	port: 8081, //vue 개발서버
    proxy: "http://localhost:8080"  // springBoot was주소 (backend)
  },  
  chainWebpack: config => {  
    const svgRule = config.module.rule("svg");    
    svgRule.uses.clear();    
    svgRule.use("vue-svg-loader").loader("vue-svg-loader");  
  }  
};
