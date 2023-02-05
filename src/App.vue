<template>
  <div>
  <!--  头部-->
    <Header/>
  <!--  主体-->
    <div style="display: flex">
  <!--    侧边栏-->
      <Aside/>
  <!--    内容区域-->
      <router-view style="flex: 1"/>
    </div>
  </div>

  <el-config-provider :locale="locale">
    <slot name="app"></slot>
  </el-config-provider>
</template>

<style>

</style>

<script>

import Header from "@/components/Header.vue";
import Aside from "@/components/Aside.vue";

//引入vue方法
import { ElConfigProvider } from 'element-plus'
//中文包
import zhCn from 'element-plus/lib/locale/lang/zh-cn'

export default {
  name: "Layout",
  components: {
    Header,
    Aside,
    [ElConfigProvider.name]: ElConfigProvider
  },
  setup() {
    let locale = zhCn
    return {
      locale,
      size:'small'
    }
  }
}
</script>

<style scoped lang='scss'>
</style>
