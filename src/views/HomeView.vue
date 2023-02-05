<template>
  <div class="home" style="padding: 10px">
<!--    功能区-->
    <div style="margin: 10px 0">
      <el-button type="primary">新增</el-button>
      <el-button type="primary">导入</el-button>
      <el-button type="primary">新出</el-button>
    </div>
<!--    搜索区-->
    <div style="margin: 10px 0">
      <el-input v-model="search" placeholder="请输入关键字" style="width: 20%"/>
      <el-button type="primary" style="margin-left: 5px">查询</el-button>
    </div>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column prop="date" label="Date" sortable/>
      <el-table-column prop="name" label="Name" />
      <el-table-column prop="address" label="Address" />
      <el-table-column  label="Operations" >
        <template #default>
          <el-button type="primary" @click="handleClick(scope.$index,scope.rows)">编辑</el-button>
          <el-popconfirm title="确认删除吗?">
            <template #reference>
              <el-button size="mini" type="danger" @click="handleDelete(scope.$index,scope.rows)">删除</el-button>
            </template>
          </el-popconfirm>
        </template>
      </el-table-column>
    </el-table>
    <div style="margin: 10px 0">
      <div class="demo-pagination-block">
        <div class="demonstration">All combined</div>
        <el-pagination
            v-model:current-page="currentPage"
            v-model:page-size="pageSize"
            :page-sizes="[5, 10, 20]"
            :small="small"
            :disabled="disabled"
            :background="background"
            layout="total, sizes, prev, pager, next, jumper"
            :total="total"
            @size-change="handleSizeChange"
            @current-change="handleCurrentChange"
        />
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'HomeView',
  components: {

  },
  data(){
    return {
      search:'',
      currentPage:1,
      pageSize:10,
      total:10,
      tableData: [
        {
          date: '2016-05-03',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
        {
          date: '2016-05-02',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
        {
          date: '2016-05-04',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
        {
          date: '2016-05-01',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
      ]
    }
  },
  methods:{
    handleClick() {

    },
    handleDelete(){

    },
    handleSizeChange(){

    },
    handleCurrentChange(){

    }

  }

}
</script>
