<template>
  <u-linear-layout
    ref="uLinearLayout1"
    class="cw-style-height"
    type="root"
    gap="none"
    style="--cw-style-height: 100%; height: 100%; --custom-start: auto; min-height: 200px"
  >
    <u-router-view ref="router_view1"></u-router-view>
    <u-linear-layout
      ref="linear_layout_29"
      direction="horizontal"
      :wrap="true"
    >
      <u-linear-layout
        ref="linear_layout_30"
        direction="horizontal"
        :wrap="true"
      >
        <u-panel ref="panel_6">
          <template
            #title

          >
            <u-text
              ref="text_18"
              class="cw-style-color"
              text="供应商管理"
              style="--cw-style-color: #080808; color: #080808"
            ></u-text>
          </template>
          <template
            #extra

          ></template>
          <u-linear-layout
            ref="linear_layout_48"
            direction="vertical"
          >
            <u-linear-layout
              ref="linear_layout_83"
              justify="space-between"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_84"
                :wrap="true"
              >
                <u-form
                  ref="form_1"
                  layout="inline"
                  key="form_1"
                >
                  <u-form-item
                    ref="form_item_1"
                    layout="center"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_51"
                        text="供应商名称"
                      ></u-text>
                    </template>
                    <u-input
                      ref="input_1"
                      :value.sync="filter.name"
                      placeholder="请输入供应商名称"
                      :emptyValueIsNull="true"
                    ></u-input>
                  </u-form-item>
                  <u-form-item
                    ref="form_item_2"
                    layout="center"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_52"
                        text="状态"
                      ></u-text>
                    </template>
                    <u-select
                      ref="select_1"
                      :clearable="true"
                      :value.sync="filter.status"
                      placeholder="请选择状态"
                      :dataSource="$utils['EnumToList']({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.enums', typeName: 'StatusEnum' })"
                      :emptyValueIsNull="true"
                      key="select_1"
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
                    ref="form_item_3"
                    layout="center"
                    labelSize="auto"
                  >
                    <u-button
                      ref="button_1"
                      color="primary"
                      text="查 询"
                      @click="button_1_click($event)"
                    ></u-button>
                    <template
                      #label

                    ></template>
                  </u-form-item>
                </u-form>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_85"
                :wrap="true"
              >
                <u-button
                  ref="button_2"
                  color="primary"
                  text="创 建"
                  @click="button_2_click($event)"
                ></u-button>
              </u-linear-layout>
            </u-linear-layout>
            <u-table-view
              ref="tableView_2"
              @sync:state="(key, val) => onSyncState('tableView_2', key, val)"
              :dataSource="__tableView_2_handleDataSourceLoad()"
              valueField="supplier.id"
              :pagination="true"
              :showSizer="true"
              :pageSize="20"
              :pageNumber="1"
              key="tableView_2"
            >
              <u-table-view-column
                ref="table_view_column_9"
                key="table_view_column_9"
                type="index"
                :width="60"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_53"
                    text="序号"
                  ></u-text>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_9_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #cell=""

                ></template>
                <template
                  #editcell=""

                ></template>
                <template
                  #expand-content=""

                ></template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_11"
                key="table_view_column_11"
                field="supplier.name"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_56"
                    text="供应商名称"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_42_${(current || {}).__nodeKey || (current || {}).index}`"
                    gap="small"
                  >
                    <u-text
                      :ref="`text_57_${(current || {}).__nodeKey || (current || {}).index}`"
                      :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).supplier || {}).name)"
                    ></u-text>
                  </u-linear-layout>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_11_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #editcell=""

                ></template>
                <template
                  #expand-content=""

                ></template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_13"
                key="table_view_column_13"
                field="supplier.level"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_60"
                    text="供应商等级"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_44_${(current || {}).__nodeKey || (current || {}).index}`"
                    gap="small"
                  >
                    <u-rate
                      :ref="`rate_2_${(current || {}).__nodeKey || (current || {}).index}`"
                      :value.sync="current.item.supplier.level"
                    ></u-rate>
                  </u-linear-layout>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_13_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #editcell=""

                ></template>
                <template
                  #expand-content=""

                ></template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_12"
                key="table_view_column_12"
                field="supplier.phone"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_58"
                    text="联系电话"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_43_${(current || {}).__nodeKey || (current || {}).index}`"
                    gap="small"
                  >
                    <u-text
                      :ref="`text_59_${(current || {}).__nodeKey || (current || {}).index}`"
                      :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).supplier || {}).phone)"
                    ></u-text>
                  </u-linear-layout>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_12_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #editcell=""

                ></template>
                <template
                  #expand-content=""

                ></template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_14"
                key="table_view_column_14"
                field="supplier.status"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_62"
                    text="状态"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_45_${(current || {}).__nodeKey || (current || {}).index}`"
                    gap="small"
                  >
                    <u-text
                      :ref="`text_63_${(current || {}).__nodeKey || (current || {}).index}`"
                      :text="$utils['ToString']('app.enums.StatusEnum', (((current || {}).item || {}).supplier || {}).status)"
                    ></u-text>
                  </u-linear-layout>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_14_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #editcell=""

                ></template>
                <template
                  #expand-content=""

                ></template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_10"
                key="table_view_column_10"
                field="supplier.createdTime"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_54"
                    text="创建时间"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_41_${(current || {}).__nodeKey || (current || {}).index}`"
                    gap="small"
                  >
                    <u-text
                      :ref="`text_55_${(current || {}).__nodeKey || (current || {}).index}`"
                      :text="$utils['ToString']('nasl.core.DateTime', (((current || {}).item || {}).supplier || {}).createdTime)"
                    ></u-text>
                  </u-linear-layout>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_10_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #editcell=""

                ></template>
                <template
                  #expand-content=""

                ></template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_15"
                key="table_view_column_15"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_64"
                    text="操作"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_46_${(current || {}).__nodeKey || (current || {}).index}`"
                    gap="small"
                  >
                    <u-link
                      :ref="`link_3_${(current || {}).__nodeKey || (current || {}).index}`"
                      text="修改"
                      @click="link_3_click($event, current)"
                    ></u-link>
                    <u-link
                      :ref="`link_4_${(current || {}).__nodeKey || (current || {}).index}`"
                      text="删除"
                      @click="link_4_click($event, current)"
                    ></u-link>
                  </u-linear-layout>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_15_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #editcell=""

                ></template>
                <template
                  #expand-content=""

                ></template>
              </u-table-view-column>
              <template
                #loading

              ></template>
              <template
                #error

              ></template>
              <template
                #empty

              ></template>
              <template
                #dragGhost=""

              ></template>
            </u-table-view>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_130"
            direction="horizontal"
            :wrap="true"
          >
            <u-text
              ref="text_273"
              :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `供应商启用数：`) + $utils['ToString']('nasl.core.Long', supplierNum))"
            ></u-text>
          </u-linear-layout>
        </u-panel>
      </u-linear-layout>
    </u-linear-layout>
    <u-modal
      ref="saveModal_1"
      size="large"
      :is-heading-slot-empty="true"
    >
      <template
        #title

      >
        <u-text
          ref="text_65"
          key="text_65"
          text="修改"
          v-if="isUpdate"
        ></u-text>
        <u-text
          ref="text_66"
          key="text_66"
          text="创建"
          v-if="!isUpdate"
        ></u-text>
      </template>
      <template
        #body

      >
        <u-form
          ref="saveModalForm_1"
          labelSize="large"
          key="saveModalForm_1"
        >
          <u-form-item
            ref="form_item_4"
            layout="center"
            :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
          >
            <template
              #label

            >
              <u-text
                ref="text_67"
                text="供应商名称"
              ></u-text>
            </template>
            <u-input
              ref="input_2"
              :value.sync="input.name"
              placeholder="请输入供应商名称"
              :emptyValueIsNull="true"
            ></u-input>
          </u-form-item>
          <u-form-item
            ref="form_item_5"
            layout="center"
            :required="false"
            message=""
            :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
          >
            <template
              #label

            >
              <u-text
                ref="text_68"
                text="联系电话"
              ></u-text>
            </template>
            <u-input
              ref="input_3"
              :value.sync="input.phone"
              placeholder="请输入联系电话"
            ></u-input>
          </u-form-item>
          <u-form-item
            ref="form_item_6"
            layout="center"
          >
            <template
              #label

            >
              <u-text
                ref="text_69"
                text="供应商等级"
              ></u-text>
            </template>
            <u-rate
              ref="rate_1"
              :value.sync="input.level"
            ></u-rate>
          </u-form-item>
          <u-form-item
            ref="form_item_7"
            key="form_item_7"
            :rules="[
                            { validate: 'minLength', args: [0], message: `不得少于${0}个字符`, trigger: 'input+blur' },
                            { validate: 'maxLength', args: [255], message: `不得超过${255}个字符`, trigger: 'input+blur' },
                        ]"
            layout="center"
            v-if="isUpdate"
          >
            <template
              #label

            >
              <u-text
                ref="text_70"
                text="状态"
              ></u-text>
            </template>
            <u-select
              ref="select_2"
              :clearable="true"
              :value.sync="input.status"
              placeholder="请选择状态"
              :dataSource="$utils['EnumToList']({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.enums', typeName: 'StatusEnum' })"
              :emptyValueIsNull="true"
              key="select_2"
            >
              <template
                #option=""

              ></template>
              <template
                #renderFooter

              ></template>
            </u-select>
          </u-form-item>
        </u-form>
      </template>
      <template
        #foot

      >
        <u-linear-layout ref="linear_layout_47">
          <u-button
            ref="button_3"
            key="button_3"
            color="primary"
            text="提交修改"
            @click="button_3_click($event)"
            v-if="isUpdate"
          ></u-button>
          <u-button
            ref="button_4"
            key="button_4"
            color="primary"
            text="立即创建"
            @click="button_4_click($event)"
            v-if="!isUpdate"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #heading

      ></template>
    </u-modal>
    <u-modal
      ref="modal_1"
      icon="warning"
      :is-heading-slot-empty="true"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_129"
          justify="center"
        >
          <u-button
            ref="button_19"
            color="primary"
            text="确定删除"
            @click="button_19_click($event)"
          ></u-button>
          <u-button
            ref="button_20"
            text="取 消"
            @click="button_20_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-text
          ref="text_270"
          text="是否删除该供应商数据？"
        ></u-text>
        <u-text
          ref="text_272"
          text="数据删除后将无法恢复！"
          display="block"
        ></u-text>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_271"
          text="请确认"
        ></u-text>
      </template>
      <template
        #heading

      ></template>
    </u-modal>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/supplierList',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      supplier: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Supplier', undefined),
      input: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Supplier', undefined),
      filter: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Supplier', undefined),
      isUpdate: undefined,
      deleted: undefined,
      supplierNum: undefined,
      tableView_2_state_page: undefined,
      tableView_2_state_size: undefined,
      tableView_2_state_sort: undefined,
      tableView_2_state_order: undefined,
    };
  },
  meta: {
    title: '供应商列表',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async supplierList_created(event) {
      await this.supplierList_created_init(event);
    },

    async supplierList_created_init() {
      this.$global.frontendVariables.title = '供应商列表';
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.Supplier', window.$utils.Clear(this.filter, 'deep', 'app.dataSources.defaultDS.entities.Supplier'));
      this.supplierNum = await window.LcapRequest({
        url: '/api/lcplogics/loadSupplierStatus',
        method: 'POST',
        extraConfig: {
          serviceType: 'micro',
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/supplierList/0',
        },
        data: {},
      });
    },

    async button_3_click(event) {
      await this.button_3_click_updateSubmit(event);
    },

    async button_3_click_updateSubmit() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.saveModalForm_1?.validate?.()) || {}).valid) {
        window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.Supplier',
          await window.LcapRequest({
            url: '/api/supplier',
            method: 'PUT',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/supplierList/0',
            },
            data: {
              entity: this.input,
            },
          }),
        );
        await this.$refs.saveModal_1?.close?.();
        await this.$refs.tableView_2?.reload?.();
      }
    },

    async button_4_click(event) {
      await this.button_4_click_submit(event);
    },

    async button_4_click_submit() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.saveModalForm_1?.validate?.()) || {}).valid) {
        window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.Supplier',
          await window.LcapRequest({
            url: '/api/supplier',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/supplierList/0',
            },

            data: this.input,
          }),
        );
        await this.$refs.saveModal_1?.close?.();
        await this.$refs.tableView_2?.reload?.();
      }
    },

    async button_19_click(event) {
      await this.button_19_click_click(event);
    },

    async button_19_click_click() {
      await window.LcapRequest({
        url: '/api/supplier',
        method: 'DELETE',
        extraConfig: {
          serviceType: 'entity',
        },
        params: {
          id: this.deleted,
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/supplierList/0',
        },
      });
      await this.$refs.modal_1?.close?.();
      await this.$refs.tableView_2?.reload?.();
    },

    async button_20_click(event) {
      await this.button_20_click_click(event);
    },

    async button_20_click_click() {
      await this.$refs.modal_1?.close?.();
    },

    async button_2_click(event) {
      await this.button_2_click_create(event);
    },

    async button_2_click_create() {
      this.isUpdate = false;
      this.input = window.$genInitFromSchema('app.dataSources.defaultDS.entities.Supplier', window.$utils.Clone(this.supplier));
      await this.$refs.saveModal_1?.open?.();
    },

    async button_1_click(event) {
      await this.button_1_click_reload(event);
    },

    async button_1_click_reload() {
      await this.$refs.tableView_2?.reload?.();
    },

    async link_3_click(event, current) {
      await this.link_3_click_modify(event, current);
    },

    async link_3_click_modify(event, current) {
      this.isUpdate = true;
      this.input = window.$genInitFromSchema('app.dataSources.defaultDS.entities.Supplier', window.$utils.Clone(((current || {}).item || {}).supplier));
      await this.$refs.saveModal_1?.open?.();
    },

    async link_4_click(event, current) {
      await this.link_4_click_remove(event, current);
    },

    async link_4_click_remove(event, current) {
      this.deleted = (((current || {}).item || {}).supplier || {}).id;
      await this.$refs.modal_1?.open?.();
    },

    __tableView_2_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tableView_2_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{supplier: app.dataSources.defaultDS.entities.Supplier}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadSupplierListTableView2',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/supplierList/0',
            },
            data: {
              page: this.tableView_2_state_page,
              size: this.tableView_2_state_size,
              sort: this.tableView_2_state_sort,
              order: this.tableView_2_state_order,
              filter: this.filter,
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
    await this.supplierList_created();
  },
};
</script>
