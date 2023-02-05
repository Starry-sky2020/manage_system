<template>
  <div class="home" style="padding: 10px">
<!--    功能区-->
    <div style="margin: 10px 0">
      <el-button type="primary" @click="add()">新增</el-button>
      <el-button type="primary">导入</el-button>
      <el-button type="primary">新出</el-button>
    </div>
<!--    搜索区-->
    <div style="margin: 10px 0">
      <el-input v-model="search" placeholder="请输入关键字" style="width: 20%"/>
      <el-button type="primary" style="margin-left: 5px">查询</el-button>
    </div>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column prop="id" label="Id" sortable/>
      <el-table-column prop="username" label="用户名" />
      <el-table-column prop="nickName" label="昵称" />
      <el-table-column prop="age" label="年龄" />
      <el-table-column prop="sex" label="性别" />
      <el-table-column prop="address" label="地址" />
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

<!--        <el-button text @click="dialogVisible = true">-->
<!--          Click to open Dialog-->
<!--        </el-button>-->

        <el-dialog v-model="dialogVisible" title="Tips" width="30%" draggable>
          <el-form :model="form" label-width=120px>
            <el-form-item label="用户名">
              <el-input v-model="form.username" style="width: 80%">
              </el-input>
            </el-form-item>
            <el-form-item label="昵称">
              <el-input v-model="form.nickName" style="width: 80%">
              </el-input>
            </el-form-item>
            <el-form-item label="年龄">
              <el-input v-model="form.age" style="width: 80%">
              </el-input>
            </el-form-item>
            <el-form-item label="性别">
              <el-radio v-model="form.sex"  label="男">男</el-radio>
              <el-radio v-model="form.sex"  label="女">女</el-radio>
              <el-radio v-model="form.sex"  label="未知">未知</el-radio>
            </el-form-item>
            <el-form-item label="地址">
              <el-input type="textarea" v-model="form.address" style="width: 80%">
              </el-input>
            </el-form-item>
          </el-form>
          <template #footer>
      <span class="dialog-footer">
        <el-button @click="dialogVisible = false">取消</el-button>
        <el-button type="primary" @click="save">
          确定
        </el-button>
      </span>
          </template>
        </el-dialog>
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
      dialogVisible:false,
      form:{},
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
    add() {
      this.dialogVisible = true,
      this.form = {}
    },
    save(){

    },
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
