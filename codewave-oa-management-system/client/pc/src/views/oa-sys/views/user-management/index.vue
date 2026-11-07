<template>
  <l-root
    ref="lRoot1"
    class="cw-style-height cw-style-background-color"
    style="--cw-style-height: 100%; --cw-style-background-color: #f5f6fa; background-color: #f5f6fa; height: 100%; --custom-start: auto; min-height: 200px"
  >
    <u-router-view ref="uRouterView1"></u-router-view>
    <u-linear-layout
      ref="linear_layout_5"
      class="cw-style-width cw-style-height"
      direction="vertical"
      justify="start"
      alignment="start"
      style="--cw-style-width: 100%; --cw-style-height: 100%; height: 100%; width: 100%; --custom-start: auto; min-height: 200px"
    >
      <u-linear-layout
        ref="linear_layout11"
        class="cw-style-width cw-style-margin-bottom cw-style-margin"
        direction="horizontal"
        style="--cw-style-width: 100%; --cw-style-margin-bottom: 10px; width: 100%; margin-bottom: 10px"
      >
        <u-alert
          ref="alert1"
          class="cw-style-width"
          type="info"
          style="--cw-style-width: 100%; width: 100%"
        >
          <template
            #title

          >
            <u-text
              ref="text29"
              text="开发者可根据需求情况，自行修改权限中心页面"
            ></u-text>
          </template>
        </u-alert>
      </u-linear-layout>
      <u-panel
        ref="panel_1"
        class="cw-style-width cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
        style="--cw-style-width: 100%; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; width: 100%; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid"
      >
        <template
          #title

        >
          <u-text
            ref="text_1"
            class="cw-style-color"
            text="用户管理"
            style="--cw-style-color: #090909; color: #090909"
          ></u-text>
        </template>
        <u-linear-layout
          ref="linear_layout1"
          direction="vertical"
          gap="normal"
          style="--space-base: 16px"
        >
          <u-linear-layout
            ref="linear_layout_2"
            mode="block"
            gap="normal"
            style="--space-base: 16px"
          >
            <u-linear-layout
              ref="linear_layout_3"
              class="cw-style-margin-bottom cw-style-margin"
              style="--cw-style-margin-bottom: 20px; margin-bottom: 20px"
            >
              <u-text
                ref="text30"
                class="cw-style-color"
                text="用户名"
                style="--cw-style-color: #090909; color: #090909"
              ></u-text>
              <u-input
                ref="input3"
                class="cw-style-margin-right cw-style-margin"
                placeholder="请输入用户名"
                :value.sync="filter.userName"
                :clearable="true"
                style="--cw-style-margin-right: 20px; margin-right: 20px"
              ></u-input>
              <u-text
                ref="text_12"
                class="cw-style-color"
                text="手机号"
                style="--cw-style-color: #090909; color: #090909"
              ></u-text>
              <u-input
                ref="input_1"
                placeholder="请输入手机号"
                :value.sync="filter.phone"
                :clearable="true"
              ></u-input>
            </u-linear-layout>
            <u-linear-layout
              ref="linear_layout_4"
              justify="space-between"
            >
              <u-button
                ref="button7"
                color="primary"
                text="查 询"
                @click="button7_click($event)"
              ></u-button>
              <u-button
                ref="button2"
                color="primary"
                text="创建普通用户"
                icon="add"
                @click="button2_click($event)"
              ></u-button>
            </u-linear-layout>
          </u-linear-layout>
        </u-linear-layout>
      </u-panel>
      <u-panel
        ref="panel_3"
        class="cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
        style="--cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid; --custom-start: auto; min-height: calc(100vh - 330px)"
      >
        <template
          #title

        ></template>
        <u-table-view
          ref="tableView"
          @sync:state="(key, val) => onSyncState('tableView', key, val)"
          :dataSource="__tableView_handleDataSourceLoad()"
          dataSchema="LoadTest2TableViewStructure"
          valueField="user.id"
          :pagination="true"
          :showSizer="true"
          :showTotal="true"
          :pageSizeOptions="[5, 10, 20, 50]"
          key="tableView"
        >
          <u-table-view-column
            ref="table_view_column1"
            key="table_view_column1"
            type="index"
            width="60"
            :autoIndex="true"
          >
            <template
              #title

            >
              <u-text
                ref="text14"
                text="序号"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column2"
            key="table_view_column2"
            field="user.userName"
          >
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout3_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-text
                  :ref="`text1_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).user || {}).userName)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text15"
                text="用户名"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column3"
            key="table_view_column3"
            field="user.phone"
          >
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout4_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-text
                  :ref="`text2_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).user || {}).phone)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text16"
                text="手机号"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column4"
            key="table_view_column4"
            field="user.email"
          >
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout5_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-text
                  :ref="`text3_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).user || {}).email)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text17"
                text="邮箱"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column5"
            key="table_view_column5"
            field="user.displayName"
          >
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout6_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-text
                  :ref="`text4_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).user || {}).displayName)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text18"
                text="昵称"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column_2"
            key="table_view_column_2"
            field="deptUser"
          >
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout_329_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-text
                  :ref="`text_287_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).deptUser)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text_286"
                text="直属主管"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column_1"
            key="table_view_column_1"
            field="dept.name"
            width="15%"
          >
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout_328_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="none"
                mode="flex"
                direction="vertical"
                alignment="start"
                justify="center"
                :wrap="true"
              >
                <u-text
                  :ref="`text_284_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).dept || {}).name)"
                ></u-text>
                <u-text
                  :ref="`text_285_${(current || {}).__nodeKey || (current || {}).index}`"
                  class="cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).dept || {}).deptId)"
                  style="--cw-style-color: #999; color: #999"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text_281"
                text="部门"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column6"
            key="table_view_column6"
            field="user.status"
          >
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout7_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <i-ico
                  :ref="`ico_2_${(current || {}).__nodeKey || (current || {}).index}`"
                  :key="`ico_2_${(current || {}).__nodeKey || (current || {}).index}`"
                  class="cw-style-font-size"
                  name="/assets/user/jasonzcmu/1765858473650_32903546aecd4a7780907d8b52da328d.svg"
                  icotype="only"
                  v-if="(((current || {}).item || {}).user || {}).status == 'Normal'"
                  :style="{}"
                  style="--cw-style-font-size: 12px; font-size: 12px"
                >
                  <u-text
                    :ref="`text_14_${(current || {}).__nodeKey || (current || {}).index}`"
                    text="图标"
                  ></u-text>
                </i-ico>
                <i-ico
                  :ref="`ico_3_${(current || {}).__nodeKey || (current || {}).index}`"
                  :key="`ico_3_${(current || {}).__nodeKey || (current || {}).index}`"
                  class="cw-style-font-size"
                  name="/assets/user/jasonzcmu/1765858473769_aecfa92f60c043288e486d811cdf2971.svg"
                  icotype="only"
                  v-if="(((current || {}).item || {}).user || {}).status == 'Forbidden'"
                  :style="{}"
                  style="--cw-style-font-size: 12px; font-size: 12px"
                >
                  <u-text
                    :ref="`text_15_${(current || {}).__nodeKey || (current || {}).index}`"
                    text="图标"
                  ></u-text>
                </i-ico>
                <i-ico
                  :ref="`ico_4_${(current || {}).__nodeKey || (current || {}).index}`"
                  :key="`ico_4_${(current || {}).__nodeKey || (current || {}).index}`"
                  class="cw-style-font-size"
                  name="/assets/user/jasonzcmu/1765858473984_a8872c5c30454a3394b432268e1903b7.svg"
                  icotype="only"
                  v-if="false"
                  :style="{}"
                  style="--cw-style-font-size: 12px; font-size: 12px"
                >
                  <u-text
                    :ref="`text_16_${(current || {}).__nodeKey || (current || {}).index}`"
                    text="图标"
                  ></u-text>
                </i-ico>
                <u-text
                  :ref="`text5_${(current || {}).__nodeKey || (current || {}).index}`"
                  class="cw-style-margin-left cw-style-margin"
                  :text="$utils['ToString']('nasl.core.String', $utils['EnumItemToText']('app.enums.UserStatusEnum', (((current || {}).item || {}).user || {}).status))"
                  style="--cw-style-margin-left: -5px; margin-left: -5px"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text19"
                text="状态"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column8"
            key="table_view_column8"
            field="user.source"
          >
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout12_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-text
                  :ref="`text12_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', $utils['EnumItemToText']('app.enums.UserSourceEnum', (((current || {}).item || {}).user || {}).source))"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text20"
                text="登录方式"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column7"
            key="table_view_column7"
            :width="160"
          >
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout8_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-link
                  :ref="`link1_${(current || {}).__nodeKey || (current || {}).index}`"
                  text="编辑"
                  :disabled="($global.userInfo || {}).UserName != adminName && (((current || {}).item || {}).user || {}).userName == adminName"
                  @click="link1_click($event, current)"
                ></u-link>
                <u-link
                  :ref="`link_1_${(current || {}).__nodeKey || (current || {}).index}`"
                  :key="`link_1_${(current || {}).__nodeKey || (current || {}).index}`"
                  text="修改密码"
                  :disabled="(((current || {}).item || {}).user || {}).userName == adminName"
                  @click="link_1_click($event, current)"
                  v-if="(((current || {}).item || {}).user || {}).source == 'Normal'"
                ></u-link>
                <u-link
                  :ref="`link2_${(current || {}).__nodeKey || (current || {}).index}`"
                  text="删除"
                  :disabled="(((current || {}).item || {}).user || {}).userName == ($global.userInfo || {}).UserName || (((current || {}).item || {}).user || {}).userName == adminName"
                  color="danger"
                  @click="link2_click($event, current)"
                  style="--link-color-danger: #f24957"
                ></u-link>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text21"
                text="操作"
              ></u-text>
            </template>
          </u-table-view-column>
        </u-table-view>
      </u-panel>
    </u-linear-layout>
    <u-modal
      ref="saveModal"
      size="large"
    >
      <template
        #foot

      >
        <u-linear-layout ref="linear_layout9">
          <u-button
            ref="button3"
            key="button3"
            color="primary"
            text="提交修改"
            @click="button3_click($event)"
            v-if="isUpdate"
          ></u-button>
          <u-button
            ref="button4"
            key="button4"
            color="primary"
            text="立即创建"
            @click="button4_click($event)"
            v-if="!isUpdate"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-form
          ref="saveModalForm"
          key="saveModalForm"
        >
          <u-form-item
            ref="form_item6"
            :required="true"
            :rules="[
                            { validate: 'filled', message: `用户名不得为空`, trigger: 'input+blur', required: true },
                            { validate: 'excluded', args: [userNameList], message: `该用户名已存在`, trigger: 'input+blur' },
                            { validate: 'maxLength', args: [50], message: `不得超过${50}个字符`, trigger: 'input+blur' },
                        ]"
            :ignoreValidation="isUpdate"
          >
            <u-input
              ref="input4"
              placeholder="请输入用户名"
              :value.sync="input.userName"
              :disabled="isUpdate"
              :clearable="!isUpdate"
              :maxlength="50"
              @blur="input4_blur($event)"
            ></u-input>
            <template
              #label

            >
              <u-text
                ref="text22"
                text="用户名"
              ></u-text>
            </template>
          </u-form-item>
          <u-form-item
            ref="form_item7"
            key="form_item7"
            :required="true"
            :rules="[
                            { validate: 'filled', message: `密码不得为空`, trigger: 'input+blur', required: true },
                            { validate: 'rangeLength', args: [8, 12], message: `请输入${8}-${12}个字符`, trigger: 'input+blur' },
                            { validate: '^azAZ09-_$', message: `以字母、数字、'-'或'_'组成`, trigger: 'input+blur' },
                        ]"
            :ignoreValidation="false"
            v-if="(input || {}).source == 'Normal' && !isUpdate"
          >
            <u-input
              ref="input5"
              placeholder="请输入8-12位普通登录密码"
              :value.sync="input.password"
              :password="true"
              type="password"
              :clearable="true"
            ></u-input>
            <template
              #label

            >
              <u-text
                ref="text23"
                text="登录密码"
              ></u-text>
            </template>
          </u-form-item>
          <u-form-item
            ref="form_item8"
            :rules="[{ validate: 'mobile', args: [`zh-CN`, undefined], message: `请输入合法的手机号码`, trigger: 'input+blur' }]"
          >
            <u-input
              ref="input6"
              placeholder="请输入手机号"
              :value.sync="input.phone"
              :clearable="true"
              :emptyValueIsNull="true"
            ></u-input>
            <template
              #label

            >
              <u-text
                ref="text24"
                text="手机号"
              ></u-text>
            </template>
          </u-form-item>
          <u-form-item
            ref="form_item10"
            :rules="[{ validate: 'maxLength', args: [50], message: `不得超过${50}个字符`, trigger: 'input+blur' }]"
          >
            <template
              #label

            >
              <u-text
                ref="text26"
                text="头像"
              ></u-text>
            </template>
            <u-uploader
              ref="uploader_2"
              listType="card"
              accept=".png,.jpg,.jpeg,.gif,.bmp"
              url="/upload"
              urlField="filePath"
              :limit="999"
              maxSize="50MB"
              converter="json"
              :value.sync="input.picture"
              fileConnectionGroup="lcap_default_connection"
              :openCropper="true"
            >
              <template
                #file-list

              >
                <i-ico
                  ref="ico_7"
                  class="cw-style-margin"
                  flag="file-icon"
                  name="file-default"
                  icotype="only"
                  style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                ></i-ico>
                <u-text
                  ref="text_334"
                  class="cw-style-margin"
                  flag="file-name"
                  text="文件名称"
                  style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; display: inherit"
                ></u-text>
                <u-text
                  ref="text_335"
                  class="cw-style-margin"
                  flag="file-size"
                  text="文件大小"
                  style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                ></u-text>
                <i-ico
                  ref="ico_8"
                  class="cw-style-margin"
                  flag="download-icon"
                  name="download"
                  icotype="only"
                  style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                ></i-ico>
              </template>
              <template
                #dragDescription

              ></template>
            </u-uploader>
          </u-form-item>
          <u-form-item
            ref="form_item_46"
            :rules="[{ validate: 'maxLength', args: [50], message: `不得超过${50}个字符`, trigger: 'input+blur' }]"
          >
            <u-input
              ref="input_22"
              placeholder="请输入昵称"
              :value.sync="input.displayName"
              :clearable="true"
              :emptyValueIsNull="true"
              :maxlength="50"
            ></u-input>
            <template
              #label

            >
              <u-text
                ref="text_331"
                text="昵称"
              ></u-text>
            </template>
          </u-form-item>
          <u-form-item
            ref="form_item_47"
            :rules="[{ validate: 'maxLength', args: [50], message: `不得超过${50}个字符`, trigger: 'input+blur' }]"
          >
            <template
              #label

            >
              <u-text
                ref="text_337"
                text="徽章"
              ></u-text>
            </template>
            <u-select
              ref="select_5"
              placeholder="请选择"
              :pagination="true"
              :pageSize="50"
              :emptyValueIsNull="true"
              :value.sync="input.badge"
              :dataSource="[`用户`, `热爱`, `创新`]"
              v-dependencies.reload="[]"
              sorting="{ field: undefined, order: 'asc' }"
              :multiple="true"
              valueField=""
              iconField=""
              key="select_5"
            >
              <template
                #option=""

              ></template>
              <template
                #renderFooter

              ></template>
            </u-select>
          </u-form-item>
          <u-form-item
            ref="form_item_10"
            :required="false"
            :rules="[]"
          >
            <template
              #label

            >
              <u-text
                ref="text_283"
                text="直属主管"
              ></u-text>
            </template>
            <u-select
              ref="select_1"
              @sync:state="(key, val) => onSyncState('select_1', key, val)"
              :clearable="true"
              placeholder="请选择直属主管"
              :dataSource="__select_1_handleDataSourceLoad()"
              :pageSize="50"
              dataSchema="LoadUserManagementSelect_1Structure"
              textField="lcapUser.userName"
              valueField="lcapUser.userId"
              :pagination="true"
              :value.sync="input.directLeaderId"
              :filterable="true"
              key="select_1"
            ></u-select>
          </u-form-item>
        </u-form>
      </template>
      <template
        #title

      >
        <div
          ref="div1"
          key="div1"
          v-if="isUpdate"
        >
          <u-text
            ref="text6"
            text="修改用户"
          ></u-text>
        </div>
        <div
          ref="div2"
          key="div2"
          v-if="!isUpdate"
        >
          <u-text
            ref="text7"
            text="创建普通用户"
          ></u-text>
        </div>
      </template>
    </u-modal>
    <u-modal
      ref="deleteModal"
      icon="warning"
    >
      <template
        #foot

      >
        <u-linear-layout ref="linear_layout10">
          <u-button
            ref="button5"
            color="primary"
            text="确 定"
            @click="button5_click($event)"
          ></u-button>
          <u-button
            ref="button6"
            text="取 消"
            @click="button6_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-text
          ref="text8"
          text="该用户相关的角色关联关系都会被删除！"
          display="block"
        ></u-text>
        <u-text
          ref="text10"
          text="确认删除用户："
        ></u-text>
        <u-text
          ref="text_11"
          :text="$utils['ToString']('nasl.core.String', (deleteUserBody || {}).userName)"
        ></u-text>
        <u-text
          ref="text11"
          text=" ？"
        ></u-text>
      </template>
      <template
        #title

      >
        <u-text
          ref="text9"
          text="删除用户 "
        ></u-text>
      </template>
    </u-modal>
    <u-modal ref="updatePasswordModal">
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_330"
          justify="center"
        >
          <u-button
            ref="button_1"
            color="primary"
            text="确 定"
            @click="button_1_click($event)"
          ></u-button>
          <u-button
            ref="button_2"
            text="取 消"
            @click="button_2_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-form
          ref="form_1"
          key="form_1"
        >
          <u-form-item
            ref="form_item_11"
            :required="true"
            layout="center"
            :rules="[
                            { validate: 'filled', message: `新密码不得为空`, trigger: 'input+blur', required: true },
                            { validate: 'rangeLength', args: [8, 12], message: `请输入${8}-${12}个字符`, trigger: 'input+blur' },
                            { validate: '^azAZ09-_$', message: `以字母、数字、'-'或'_'组成`, trigger: 'input+blur' },
                        ]"
          >
            <template
              #label

            >
              <u-text
                ref="text_290"
                text="新密码"
              ></u-text>
            </template>
            <u-input
              ref="input_2"
              placeholder="请输入8-12位新密码"
              :value.sync="input.password"
              :clearable="true"
              type="password"
              :password="true"
              :preview="false"
            ></u-input>
          </u-form-item>
          <u-form-item
            ref="form_item_14"
            :required="true"
            layout="center"
            :rules="[
                            { validate: 'filled', message: `确认密码不得为空`, trigger: 'input+blur', required: true },
                            { validate: 'equals', args: [(input || {}).password], message: `与新密码不一致`, trigger: 'input+blur' },
                        ]"
          >
            <template
              #label

            >
              <u-text
                ref="text_294"
                text="确认密码"
              ></u-text>
            </template>
            <u-input
              ref="input_3"
              placeholder="请确认您的密码"
              :value.sync="confirmPassword"
              type="password"
              :clearable="true"
              :password="true"
            ></u-input>
          </u-form-item>
        </u-form>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_289"
          text="修改密码"
        ></u-text>
      </template>
    </u-modal>
  </l-root>
</template>
<script>
export default {
  name: '/oaSys/userManagement',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      input: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', undefined),
      filter: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', undefined),
      isUpdate: undefined,
      deleteUserBody: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', undefined),
      userNameList: window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined),
      currentName: undefined,
      adminName: undefined,
      confirmPassword: undefined,
      currentUser: window.$genInitFromSchema('app.structures.LcapGetUserResult', undefined),
      tableView_state_page: undefined,
      tableView_state_size: undefined,
      select_1_state_page: undefined,
      select_1_state_size: undefined,
      select_1_state_filterText: undefined,
    };
  },
  meta: {
    title: '用户管理',
    crumb: '',
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async submit() {
      let inputCopy = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', undefined);
      await this.getUserNameList();
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.saveModalForm?.validate?.()) || {}).valid) {
        inputCopy = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clone(this.input));
        if (this.isUpdate) {
          this.currentUser.user.directLeaderId = (this.input || {}).directLeaderId;
          this.currentUser.user.displayName = (this.input || {}).displayName;
          this.currentUser.user.email = (this.input || {}).email;
          this.currentUser.user.phone = (this.input || {}).phone;
          this.currentUser.user.source = (this.input || {}).source;
          this.currentUser.user.status = (this.input || {}).status;
          this.currentUser.user.userName = (this.input || {}).userName;
          this.currentUser.deptUser = await window.LcapRequest({
            url: '/api/lcplogics/LcapGetUserNameByUserId',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/userManagement/0',
            },
            data: {
              userId: (this.input || {}).directLeaderId,
            },
          });

          await window.LcapRequest({
            url: '/api/lcplogics/LcapUpdateNormalUser',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/userManagement/1',
            },
            data: {
              user: inputCopy,
              isUpdate: true,
            },
          });
        } else {
          await window.LcapRequest({
            url: '/api/lcplogics/LcapCreateNormalUser',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/userManagement/0',
            },
            data: {
              user: inputCopy,
            },
          });
          await this.$refs.tableView?.reload?.();
        }

        await this.$refs.saveModal?.close?.();
        await this.messagePrompt(
          await (async () => {
            const it = this.isUpdate;
            if (window.$global.isEqual(it, true)) {
              return '修改成功';
            } else if (window.$global.isEqual(it, false)) {
              return '创建成功';
            } else { /* empty */ }
          })(),
          'success',
        );
      }
    },

    async getUserNameList() {
      this.userNameList = window.$genInitFromSchema(
        'nasl.collection.List<nasl.core.String>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetUserNameList',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/userManagement/0',
          },
          data: {
            userName: (this.input || {}).userName,
          },
        }),
      );
      if (this.isUpdate) {
        window.$utils.Remove(this.userNameList, this.currentName);
      }
    },

    async messagePrompt(msg, type) {
      let flag;
      await (async () => {
        'use JSBlock';

        switch (type) {
          case 'success':
            this.$toast.success(msg);
            break;
          case 'error':
            this.$toast.error(msg);
            break;
          case 'warning':
            this.$toast.warning(msg);
            break;
          default:
            console.log('type is unknow');
        }
      })();
      flag = msg;
      flag = type;
    },

    async userManagement_created(event) {
      await this.userManagement_created_init(event);
    },

    async userManagement_created_init() {
      this.$global.frontendVariables.title = '用户管理';
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clear(this.filter, 'shallow', 'app.dataSources.defaultDS.entities.LcapUser'));
      await (async () => {
        'use JSBlock';
        this.adminName = `DEVACC-${window.appInfo.domainName}`;
      })();
    },

    async button3_click(event) {
      await this.button3_click_submit(event);
    },

    async button3_click_submit() {
      await this.submit();
    },

    async button4_click(event) {
      await this.button4_click_submit(event);
    },

    async button4_click_submit() {
      await this.submit();
    },

    async button5_click(event) {
      await this.button5_click_remove(event);
    },

    async button5_click_remove() {
      await window.LcapRequest({
        url: '/api/lcap-user',
        method: 'DELETE',
        extraConfig: {
          serviceType: 'entity',
        },
        params: {
          id: (this.deleteUserBody || {}).id,
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/userManagement/0',
        },
      });
      await window.LcapRequest({
        url: '/api/lcap-user-dept-mapping/by',
        method: 'DELETE',
        extraConfig: {
          serviceType: 'entity',
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/userManagement/0',
        },
        data: {
          concept: 'Function',
          name: 'filter',
          returnExpression: this.$resolveRequestData({ concept: 'BinaryExpression', operator: '==', left: { concept: 'MemberExpression', object: { concept: 'Identifier', name: '_', label: null, description: null, folded: false, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapUserDeptMapping' } }, property: { concept: 'Identifier', name: 'userId', label: null, description: null, folded: false, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'String' } } }, right: { concept: 'MemberExpression', value: (this.deleteUserBody || {}).userId, expression: '(this.deleteUserBody || {}).userId' } }),
        },
      });
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clear(this.deleteUserBody, 'shallow', 'app.dataSources.defaultDS.entities.LcapUser'));
      await this.$refs.tableView?.reload?.();
      await this.$refs.deleteModal?.close?.();
      await this.messagePrompt('删除成功', 'success');
    },

    async button6_click(event) {
      await this.button6_click_close(event);
    },

    async button6_click_close() {
      await this.$refs.deleteModal?.close?.();
    },

    async button_1_click(event) {
      await this.button_1_click_click(event);
    },

    async button_1_click_click() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_1?.validate?.(undefined, undefined)) || {}).valid) {
        await window.LcapRequest({
          url: '/api/lcplogics/LcapUpdateNormalUser',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/userManagement/0',
          },
          data: {
            user: this.input,
            isUpdate: false,
          },
        });
        await this.$refs.updatePasswordModal?.close?.();
        await this.messagePrompt('修改成功', 'success');
      }
    },

    async button_2_click(event) {
      await this.button_2_click_click(event);
    },

    async button_2_click_click() {
      await this.$refs.updatePasswordModal?.close?.();
    },

    async input4_blur(event) {
      await this.input4_blur_blur(event);
    },

    async input4_blur_blur() {
      this.input.userName = window.$utils.Trim((this.input || {}).userName);
    },

    async button7_click(event) {
      await this.button7_click_reload(event);
    },

    async button7_click_reload() {
      await this.$refs.tableView?.reload?.();
    },

    async button2_click(event) {
      await this.button2_click_create(event);
    },

    async button2_click_create() {
      this.isUpdate = false;
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clear(this.input, 'shallow', 'app.dataSources.defaultDS.entities.LcapUser'));
      this.input.source = 'Normal';
      await this.getUserNameList();
      await this.$refs.saveModal?.open?.();
    },

    async link1_click(event, current) {
      await this.link1_click_modify(event, current);
    },

    async link1_click_modify(event, current) {
      this.isUpdate = true;
      this.currentUser = (current || {}).item;
      this.input = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clone(((current || {}).item || {}).user));
      this.currentName = (((current || {}).item || {}).user || {}).userName;
      await this.getUserNameList();
      await this.$refs.saveModal?.open?.();
    },

    async link_1_click(event, current) {
      await this.link_1_click_modify(event, current);
    },

    async link_1_click_modify(event, current) {
      this.input = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clone(((current || {}).item || {}).user));
      this.confirmPassword = undefined;
      await this.$refs.updatePasswordModal?.open?.();
    },

    async link2_click(event, current) {
      await this.link2_click_deleteUser(event, current);
    },

    async link2_click_deleteUser(event, current) {
      this.deleteUserBody = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clone(((current || {}).item || {}).user));
      await this.$refs.deleteModal?.open?.();
    },

    __tableView_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tableView_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<app.structures.LcapGetUserResult>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetUserTableView',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/userManagement/0',
            },
            data: {
              page: this.tableView_state_page,
              size: this.tableView_state_size,
              filter: this.filter,
            },
          }),
        );
      });
    },

    __select_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapLoadUserManagementSelect',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/userManagement/0',
            },
            data: {
              page: this.select_1_state_page,
              size: this.select_1_state_size,
              userId: (this.input || {}).userId,
              name: this.select_1_state_filterText,
            },
          }),
        );
      });
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.userManagement_created();
  },
};
</script>
