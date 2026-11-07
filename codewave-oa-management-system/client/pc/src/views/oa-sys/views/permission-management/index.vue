<template>
  <l-root
    ref="lRoot1"
    class="cw-style-background-color cw-style-padding-bottom cw-style-padding"
    style="--cw-style-background-color: #f5f6fa; --cw-style-padding-bottom: 0px; background-color: #f5f6fa; padding-bottom: 0px"
  >
    <u-router-view ref="uRouterView1"></u-router-view>
    <u-linear-layout
      ref="linear_layout_293"
      direction="horizontal"
      gap="normal"
      style="--space-base: 0px"
    >
      <u-panel
        ref="panel_1"
        class="cw-style-width cw-style-margin-bottom cw-style-margin cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
        style="--cw-style-width: 100%; --cw-style-margin-bottom: 16px; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; margin-bottom: 16px; width: 100%; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid"
      >
        <template
          #title

        >
          <u-text
            ref="text_1"
            class="cw-style-color"
            text="功能权限管理"
            style="--cw-style-color: #010101; color: #010101"
          ></u-text>
        </template>
        <u-linear-layout
          ref="linear_layout1"
          direction="vertical"
          gap="normal"
          style="--space-base: 0px"
        >
          <u-linear-layout
            ref="linear_layout2"
            class="cw-style-margin-bottom cw-style-margin"
            justify="start"
            style="--cw-style-margin-bottom: 20px; margin-bottom: 20px"
          >
            <u-form
              ref="form1"
              layout="inline"
              labelSize="auto"
              key="form1"
            >
              <u-form-item
                ref="form_item1"
                class="cw-style-text-align cw-style-margin-bottom cw-style-margin"
                style="--cw-style-text-align: left; --cw-style-margin-bottom: 0px; text-align: left; margin-bottom: 0px"
              >
                <u-input
                  ref="input1"
                  placeholder="请输入权限名称"
                  :value.sync="filter.name"
                  :clearable="true"
                ></u-input>
                <template
                  #label

                >
                  <u-text
                    ref="text13"
                    text="权限名称"
                  ></u-text>
                </template>
              </u-form-item>
            </u-form>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_292"
            justify="space-between"
          >
            <u-button
              ref="button1"
              color="primary"
              text="查 询"
              @click="button1_click($event)"
            ></u-button>
            <u-button
              ref="button_4"
              color="primary"
              text="新增功能权限"
              icon="add"
              @click="button_4_click($event)"
            ></u-button>
          </u-linear-layout>
        </u-linear-layout>
      </u-panel>
      <u-panel
        ref="panel_2"
        class="cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
        style="--cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid; --custom-start: auto; min-height: calc(100vh - 288px)"
      >
        <template
          #title

        ></template>
        <u-table-view
          ref="tableView"
          @sync:state="(key, val) => onSyncState('tableView', key, val)"
          :dataSource="__tableView_handleDataSourceLoad()"
          dataSchema="LoadTest2TableViewStructure"
          valueField="permission.id"
          :pagination="true"
          :showSizer="true"
          :pageSize="20"
          sorting="{ field: undefined, order: 'desc' }"
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
            field="permission.name"
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
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).permission || {}).name)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text15"
                text="权限名称"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column3"
            key="table_view_column3"
            field="roleList"
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
                  :text="
                                        $utils['ToString'](
                                            'nasl.core.String',
                                            $utils['Join'](
                                                $utils['ListTransform'](((current || {}).item || {}).roleList, (item) => (item || {}).name),
                                                `、`,
                                            ),
                                        )
                                    "
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text16"
                text="权限角色"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column4"
            key="table_view_column4"
            field="permission.description"
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
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).permission || {}).description)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #title

            >
              <u-text
                ref="text17"
                text="权限描述"
              ></u-text>
            </template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column7"
            key="table_view_column7"
            :width="120"
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
                  text="修改"
                  :disabled="
                                        $utils['Contains'](
                                            $utils['ListTransform'](((current || {}).item || {}).roleList, (item) => (item || {}).editable),
                                            false,
                                        )
                                    "
                  @click="link1_click($event, current)"
                ></u-link>
                <u-link
                  :ref="`link2_${(current || {}).__nodeKey || (current || {}).index}`"
                  text="删除"
                  :disabled="
                                        $utils['Contains'](
                                            $utils['ListTransform'](((current || {}).item || {}).roleList, (item) => (item || {}).editable),
                                            false,
                                        )
                                    "
                  @click="link2_click($event, current)"
                  style="--link-color: #f24957"
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
      size="auto"
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
            text="立即新增"
            @click="button4_click($event)"
            v-if="!isUpdate"
          ></u-button>
          <u-button
            ref="uButton7"
            text="取 消"
            @click="uButton7_click($event)"
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
                            { validate: 'filled', message: `权限名称不得为空`, trigger: 'input+blur', required: true },
                            { validate: 'excluded', args: [permissionNameList], message: `该权限名已存在`, trigger: 'input+blur' },
                            { validate: 'maxLength', args: [50], message: `不得超过${50}个字符`, trigger: 'input+blur' },
                        ]"
            :ignoreValidation="false"
          >
            <u-input
              ref="input4"
              placeholder="请输入权限名称"
              :value.sync="input.name"
              :clearable="true"
              :maxlength="50"
              @blur="input4_blur($event)"
            ></u-input>
            <template
              #label

            >
              <u-text
                ref="text22"
                text="权限名称"
              ></u-text>
            </template>
          </u-form-item>
          <u-form-item
            ref="form_item10"
            :rules="[{ validate: 'maxLength', args: [150], message: `不得超过${150}个字符`, trigger: 'input+blur' }]"
          >
            <u-input
              ref="input8"
              placeholder="请输入权限描述"
              :value.sync="input.description"
              :clearable="true"
              :maxlength="150"
            ></u-input>
            <template
              #label

            >
              <u-text
                ref="text26"
                text="权限描述"
              ></u-text>
            </template>
          </u-form-item>
          <u-form-item
            ref="form_item_1"
            labelLayout="block"
          >
            <template
              #label

            >
              <u-text
                ref="text_184"
                text="关联资源"
              ></u-text>
            </template>
            <u-transfer
              ref="transfer_1"
              :showHead="true"
              sourceTitle="未选资源"
              targetTitle="已选资源"
              :source.sync="notAddResouces"
              :target.sync="addResouces"
              :filterable="true"
              valueField="value"
              textField="text"
              :clearable="true"
              style="--custom-start: auto; --transfer-width: auto"
            ></u-transfer>
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
            text="修改权限"
          ></u-text>
        </div>
        <div
          ref="div2"
          key="div2"
          v-if="!isUpdate"
        >
          <u-text
            ref="text7"
            text="新增权限"
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
          text="该权限相关的角色关联关系都会被删除！确认删除权限："
        ></u-text>
        <u-text
          ref="text10"
          :text="$utils['ToString']('nasl.core.String', (deletePermission || {}).name)"
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
          text="删除权限"
        ></u-text>
      </template>
    </u-modal>
  </l-root>
</template>
<script>
export default {
  name: '/oaSys/permissionManagement',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      input: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', undefined),
      filter: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', undefined),
      isUpdate: undefined,
      deletePermission: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', undefined),
      permissionNameList: window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined),
      notAddResouces: window.$genInitFromSchema('nasl.collection.List<app.structures.LcapPermissionAndResource>', undefined),
      addResouces: window.$genInitFromSchema('nasl.collection.List<app.structures.LcapPermissionAndResource>', undefined),
      permissionOldIdList: window.$genInitFromSchema('nasl.collection.List<nasl.core.Long>', undefined),
      currentName: undefined,
      tableView_state_page: undefined,
      tableView_state_size: undefined,
    };
  },
  meta: {
    title: '权限管理',
    crumb: '',
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async getPermissionNameList() {
      this.permissionNameList = window.$genInitFromSchema(
        'nasl.collection.List<nasl.core.String>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetPermissionNameList',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/permissionManagement/0',
          },
          data: {
            permissionName: (this.input || {}).name,
          },
        }),
      );
      if (this.isUpdate) {
        window.$utils.Remove(this.permissionNameList, this.currentName);
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

    async permissionManagement_created(event) {
      await this.permissionManagement_created_init(event);
    },

    async permissionManagement_created_init() {
      this.$global.frontendVariables.title = '权限管理';
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', window.$utils.Clear(this.filter, 'shallow', 'app.dataSources.defaultDS.entities.LcapPermission'));
    },

    async button3_click(event) {
      await this.button3_click_submit(event);
    },

    async button3_click_submit() {
      let mappingList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapPerResMapping>', undefined);
      await this.getPermissionNameList();
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.saveModalForm?.validate?.(undefined, undefined)) || {}).valid) {
        window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LcapPermission',
          await window.LcapRequest({
            url: '/api/lcap-permission',
            method: 'PUT',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/permissionManagement/0',
            },
            data: {
              entity: this.input,
              properties: ['id', 'name', 'description'],
            },
          }),
        );
        if (window.$utils.HasValue({ type: 'nasl.collection.List<app.structures.LcapPermissionAndResource>', value: this.addResouces })) {
          mappingList = window.$genInitFromSchema(
            'nasl.collection.List<app.dataSources.defaultDS.entities.LcapPerResMapping>',
            await window.$utils.ListTransformAsync(
              this.addResouces,
              async (item) =>
                await (async () => {
                  const obj = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPerResMapping', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapPerResMapping', changedTime: 1758527489631 }));
                  obj.permissionId = (this.input || {}).id;
                  obj.resourceId = (item || {}).value;
                  return obj;
                })(),
            ),
          );
          window.$genInitFromSchema(
            'nasl.collection.List<app.dataSources.defaultDS.entities.LcapPerResMapping>',
            await window.LcapRequest({
              url: '/api/lcap-per-res-mapping/batch',
              method: 'POST',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/permissionManagement/0',
              },

              data: mappingList,
            }),
          );
        }
        if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.Long>', value: this.permissionOldIdList })) {
          await window.LcapRequest({
            url: '/api/lcap-per-res-mapping/batch',
            method: 'DELETE',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/permissionManagement/0',
            },

            data: this.permissionOldIdList,
          });
        }
        await this.$refs.tableView?.reload?.();
        await this.$refs.saveModal?.close?.();
        await this.messagePrompt('修改成功', 'success');
      }
    },

    async button4_click(event) {
      await this.button4_click_submit(event);
    },

    async button4_click_submit() {
      let mappingList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapPerResMapping>', undefined);
      let permissionCreated = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', undefined);
      await this.getPermissionNameList();
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.saveModalForm?.validate?.()) || {}).valid) {
        permissionCreated = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LcapPermission',
          await window.LcapRequest({
            url: '/api/lcap-permission',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/permissionManagement/0',
            },

            data: this.input,
          }),
        );
        if (window.$utils.HasValue({ type: 'nasl.collection.List<app.structures.LcapPermissionAndResource>', value: this.addResouces })) {
          mappingList = window.$genInitFromSchema(
            'nasl.collection.List<app.dataSources.defaultDS.entities.LcapPerResMapping>',
            await window.$utils.ListTransformAsync(
              this.addResouces,
              async (item) =>
                await (async () => {
                  const obj = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPerResMapping', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapPerResMapping', changedTime: 1758527489644 }));
                  obj.resourceId = (item || {}).value;
                  obj.permissionId = (permissionCreated || {}).id;
                  return obj;
                })(),
            ),
          );
          window.$genInitFromSchema(
            'nasl.collection.List<app.dataSources.defaultDS.entities.LcapPerResMapping>',
            await window.LcapRequest({
              url: '/api/lcap-per-res-mapping/batch',
              method: 'POST',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/permissionManagement/1',
              },

              data: mappingList,
            }),
          );
        }
        await this.$refs.tableView?.reload?.();
        await this.$refs.saveModal?.close?.();
        await this.messagePrompt('新增成功', 'success');
      }
    },

    async uButton7_click(event) {
      await this.uButton7_click_close(event);
    },

    async uButton7_click_close() {
      await this.$refs.saveModal?.close?.();
    },

    async button5_click(event) {
      await this.button5_click_remove(event);
    },

    async button5_click_remove() {
      await window.LcapRequest({
        url: '/api/lcap-permission',
        method: 'DELETE',
        extraConfig: {
          serviceType: 'entity',
        },
        params: {
          id: (this.deletePermission || {}).id,
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/permissionManagement/0',
        },
      });
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

    async button1_click(event) {
      await this.button1_click_reload(event);
    },

    async button1_click_reload() {
      await this.$refs.tableView?.reload?.();
    },

    async button_4_click(event) {
      await this.button_4_click_create(event);
    },

    async button_4_click_create() {
      this.isUpdate = false;
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', window.$utils.Clear(this.input, 'shallow', 'app.dataSources.defaultDS.entities.LcapPermission'));
      window.$genInitFromSchema('nasl.collection.List<app.structures.LcapPermissionAndResource>', window.$utils.Clear(this.notAddResouces, 'shallow', 'nasl.collection.List<app.structures.LcapPermissionAndResource>'));
      window.$genInitFromSchema('nasl.collection.List<app.structures.LcapPermissionAndResource>', window.$utils.Clear(this.addResouces, 'shallow', 'nasl.collection.List<app.structures.LcapPermissionAndResource>'));
      await this.getPermissionNameList();
      this.notAddResouces = window.$genInitFromSchema(
        'nasl.collection.List<app.structures.LcapPermissionAndResource>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetPermissionResourseNotRelated',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/permissionManagement/0',
          },
          data: {
            permissionId: undefined,
          },
        }),
      );
      await this.$refs.saveModal?.open?.();
    },

    async input4_blur(event) {
      await this.input4_blur_blur(event);
    },

    async input4_blur_blur() {
      this.input.name = window.$utils.Trim((this.input || {}).name);
    },

    async link1_click(event, current) {
      await this.link1_click_modify(event, current);
    },

    async link1_click_modify(event, current) {
      this.isUpdate = true;
      this.input = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', window.$utils.Clone(((current || {}).item || {}).permission));
      window.$genInitFromSchema('nasl.collection.List<app.structures.LcapPermissionAndResource>', window.$utils.Clear(this.notAddResouces, 'shallow', 'nasl.collection.List<app.structures.LcapPermissionAndResource>'));
      window.$genInitFromSchema('nasl.collection.List<app.structures.LcapPermissionAndResource>', window.$utils.Clear(this.addResouces, 'shallow', 'nasl.collection.List<app.structures.LcapPermissionAndResource>'));
      this.addResouces = window.$genInitFromSchema(
        'nasl.collection.List<app.structures.LcapPermissionAndResource>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetPermissionResourceRelated',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/permissionManagement/0',
          },
          data: {
            permissinId: (((current || {}).item || {}).permission || {}).id,
          },
        }),
      );
      this.currentName = (((current || {}).item || {}).permission || {}).name;
      await this.getPermissionNameList();
      this.notAddResouces = window.$genInitFromSchema(
        'nasl.collection.List<app.structures.LcapPermissionAndResource>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetPermissionResourseNotRelated',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/permissionManagement/1',
          },
          data: {
            permissionId: (((current || {}).item || {}).permission || {}).id,
          },
        }),
      );
      this.permissionOldIdList = window.$genInitFromSchema(
        'nasl.collection.List<nasl.core.Long>',
        await window.$utils.ListTransformAsync(
          window.$genInitFromSchema(
            'nasl.collection.List<{lcapPerResMapping: app.dataSources.defaultDS.entities.LcapPerResMapping}>',
            await window.LcapRequest({
              url: '/api/lcplogics/LcapGetPerResMappingByPermissionId',
              method: 'POST',
              extraConfig: {
                serviceType: 'micro',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/permissionManagement/0',
              },
              data: {
                permissionId: (((current || {}).item || {}).permission || {}).id,
              },
            }),
          ),
          (item) => ((item || {}).lcapPerResMapping || {}).id,
        ),
      );
      await this.$refs.saveModal?.open?.();
    },

    async link2_click(event, current) {
      await this.link2_click_deleteUser(event, current);
    },

    async link2_click_deleteUser(event, current) {
      this.deletePermission = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', window.$utils.Clone(((current || {}).item || {}).permission));
      await this.$refs.deleteModal?.open?.();
    },

    __tableView_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tableView_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<app.structures.LcapGetPermissionResult>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapLoadPermissionManagementTableView',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/permissionManagement/0',
            },
            data: {
              filter: this.filter,
              page: this.tableView_state_page,
              size: this.tableView_state_size,
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
    await this.permissionManagement_created();
  },
};
</script>
