<!-- PageHome.vue -->
<template>
    <div id="base" class="content">
      <div class="home">
        <div class="home home-black">
          <div class="landing">
            <div class="hero">
              <div class="content">
                <h1 class="content__heading">
                  영화,TV시리즈 스포츠 스트리밍 가이드
                </h1>
                <p class="content__subheading">
                  신작,인기작,개봉예정 엔터테인먼트를 바로 볼수 있는 곳을 JustWatch와 함께 찾아보세요
                </p>
                <div class="call-to-action">
                  <button type="button" class="basic-button call-to-action__discover primary lg rounded">
                    <div class="basic-button__content">
                      영화 및 TV 시리즈 검색하기
                    </div>
                  </button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  // @ is an alias to /src
  
  
  export default {
   
  }
  </script>
  <style>
  *, :after, :before {
    box-sizing: border-box;
}
  .basic-button.lg.rounded {
      border-radius: 8px;
  }
  .call-to-action__discover[data-v-62d62740] {
      -webkit-margin-end: 30px;
      margin-inline-end: 30px;
      font-size: 16px;
      font-weight: 700;
  }
  .basic-button.primary {
      font-weight: 700;
      background-color: #fbc500;
      color: #000;
  }
  .basic-button.rounded {
      border-radius: 4px;
  }
  .basic-button.lg {
      font-size: 18px;
      padding: 1.6rem 4rem;
  }
  .basic-button {
      background: none;
      border: none;
      margin: 0;
      padding: 0;
      outline: none;
      white-space: nowrap;
      cursor: pointer;
  }
  </style>