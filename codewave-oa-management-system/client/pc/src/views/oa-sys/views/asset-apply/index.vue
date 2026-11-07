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
      ref="linear_layout_48"
      direction="vertical"
      :wrap="true"
    >
      <u-linear-layout
        ref="linear_layout_52"
        justify="space-between"
        :wrap="true"
      >
        <u-linear-layout
          ref="linear_layout_53"
          :wrap="true"
        ></u-linear-layout>
        <u-linear-layout
          ref="linear_layout_54"
          :wrap="true"
        ></u-linear-layout>
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_49"
        :wrap="true"
      >
        <u-linear-layout
          ref="linear_layout_65"
          direction="vertical"
        >
          <u-linear-layout ref="linear_layout_55">
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
                    ref="text_78"
                    text="申请人"
                  ></u-text>
                </template>
                <u-input
                  ref="input_1"
                  placeholder="请输入"
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
                    ref="text_79"
                    text="资产名称"
                  ></u-text>
                </template>
                <u-input
                  ref="input_2"
                  placeholder="请输入"
                  :emptyValueIsNull="true"
                ></u-input>
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
          <u-table-view
            ref="tableView_5"
            class="cw-style-text-align"
            @sync:state="(key, val) => onSyncState('tableView_5', key, val)"
            :dataSource="__tableView_5_handleDataSourceLoad()"
            valueField="userAssetMapping.id"
            :pagination="true"
            :showSizer="true"
            :pageSize="20"
            :pageNumber="1"
            v-dependencies.reload="[]"
            key="tableView_5"
            style="--cw-style-text-align: center; --table-view-th-text-align: center; text-align: center"
          >
            <u-table-view-column
              ref="table_view_column_44"
              key="table_view_column_44"
              type="index"
              :width="60"
            >
              <template
                #title

              >
                <u-text
                  ref="text_80"
                  text="序号"
                ></u-text>
              </template>
              <template
                #expander="current"

              >
                <u-table-view-expander :ref="`table_view_expander_44_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
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
              ref="table_view_column_45"
              key="table_view_column_45"
              field="userAssetMapping.createdTime"
            >
              <template
                #title

              >
                <u-text
                  ref="text_81"
                  text="申请时间"
                ></u-text>
              </template>
              <template
                #cell="current"

              >
                <u-linear-layout
                  :ref="`linear_layout_57_${(current || {}).__nodeKey || (current || {}).index}`"
                  gap="small"
                >
                  <u-text
                    :ref="`text_82_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.DateTime', (((current || {}).item || {}).userAssetMapping || {}).createdTime)"
                  ></u-text>
                </u-linear-layout>
              </template>
              <template
                #expander="current"

              >
                <u-table-view-expander :ref="`table_view_expander_45_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
              </template>
              <template
                #editcell=""

              ></template>
              <template
                #expand-content=""

              ></template>
            </u-table-view-column>
            <u-table-view-column
              ref="table_view_column_47"
              key="table_view_column_47"
              field="userAssetMapping.userName"
            >
              <template
                #title

              >
                <u-text
                  ref="text_85"
                  text="申请人"
                ></u-text>
              </template>
              <template
                #cell="current"

              >
                <u-linear-layout
                  :ref="`linear_layout_59_${(current || {}).__nodeKey || (current || {}).index}`"
                  gap="small"
                >
                  <u-text
                    :ref="`text_86_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).lcapUser || {}).userName)"
                  ></u-text>
                </u-linear-layout>
              </template>
              <template
                #expander="current"

              >
                <u-table-view-expander :ref="`table_view_expander_47_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
              </template>
              <template
                #editcell=""

              ></template>
              <template
                #expand-content=""

              ></template>
            </u-table-view-column>
            <u-table-view-column
              ref="table_view_column_48"
              key="table_view_column_48"
              field="userAssetMapping.assetid"
            >
              <template
                #title

              >
                <u-text
                  ref="text_87"
                  text="资产名称"
                ></u-text>
              </template>
              <template
                #cell="current"

              >
                <u-linear-layout
                  :ref="`linear_layout_60_${(current || {}).__nodeKey || (current || {}).index}`"
                  gap="small"
                >
                  <u-text
                    :ref="`text_88_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).name)"
                  ></u-text>
                </u-linear-layout>
              </template>
              <template
                #expander="current"

              >
                <u-table-view-expander :ref="`table_view_expander_48_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
              </template>
              <template
                #editcell=""

              ></template>
              <template
                #expand-content=""

              ></template>
            </u-table-view-column>
            <u-table-view-column
              ref="table_view_column_52"
              key="table_view_column_52"
              field="userAssetMapping.assetid"
            >
              <template
                #title

              >
                <u-text
                  ref="text_100"
                  text="规格/型号"
                ></u-text>
              </template>
              <template
                #cell="current"

              >
                <u-linear-layout
                  :ref="`linear_layout_66_${(current || {}).__nodeKey || (current || {}).index}`"
                  gap="small"
                >
                  <u-text
                    :ref="`text_101_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).specification)"
                  ></u-text>
                </u-linear-layout>
              </template>
              <template
                #expander="current"

              >
                <u-table-view-expander :ref="`table_view_expander_52_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
              </template>
              <template
                #editcell=""

              ></template>
              <template
                #expand-content=""

              ></template>
            </u-table-view-column>
            <u-table-view-column
              ref="table_view_column_53"
              key="table_view_column_53"
              field="userAssetMapping.assetid"
            >
              <template
                #title

              >
                <u-text
                  ref="text_102"
                  text="品牌"
                ></u-text>
              </template>
              <template
                #cell="current"

              >
                <u-linear-layout
                  :ref="`linear_layout_67_${(current || {}).__nodeKey || (current || {}).index}`"
                  gap="small"
                >
                  <u-text
                    :ref="`text_103_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).brand)"
                  ></u-text>
                </u-linear-layout>
              </template>
              <template
                #expander="current"

              >
                <u-table-view-expander :ref="`table_view_expander_53_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
              </template>
              <template
                #editcell=""

              ></template>
              <template
                #expand-content=""

              ></template>
            </u-table-view-column>
            <u-table-view-column
              ref="table_view_column_49"
              key="table_view_column_49"
              field="userAssetMapping.num"
            >
              <template
                #title

              >
                <u-text
                  ref="text_89"
                  text="数量"
                ></u-text>
              </template>
              <template
                #cell="current"

              >
                <u-linear-layout
                  :ref="`linear_layout_61_${(current || {}).__nodeKey || (current || {}).index}`"
                  gap="small"
                >
                  <u-text
                    :ref="`text_90_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.Long', (((current || {}).item || {}).userAssetMapping || {}).num)"
                  ></u-text>
                </u-linear-layout>
              </template>
              <template
                #expander="current"

              >
                <u-table-view-expander :ref="`table_view_expander_49_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
              </template>
              <template
                #editcell=""

              ></template>
              <template
                #expand-content=""

              ></template>
            </u-table-view-column>
            <u-table-view-column
              ref="table_view_column_50"
              key="table_view_column_50"
              field="userAssetMapping.returnTime"
            >
              <template
                #title

              >
                <u-text
                  ref="text_91"
                  text="归还时间"
                ></u-text>
              </template>
              <template
                #cell="current"

              >
                <u-linear-layout
                  :ref="`linear_layout_62_${(current || {}).__nodeKey || (current || {}).index}`"
                  gap="small"
                >
                  <u-text
                    :ref="`text_92_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.DateTime | nasl.core.String', genviewMatchExpression_0ddauan0(current))"
                  ></u-text>
                </u-linear-layout>
              </template>
              <template
                #expander="current"

              >
                <u-table-view-expander :ref="`table_view_expander_50_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
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
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_50"
        :wrap="true"
      ></u-linear-layout>
    </u-linear-layout>
    <u-modal
      ref="saveModal_1"
      :is-heading-slot-empty="true"
    >
      <template
        #title

      >
        <u-text
          ref="text_94"
          key="text_94"
          text="修改"
          v-if="isUpdate"
        ></u-text>
        <u-text
          ref="text_95"
          key="text_95"
          text="创建"
          v-if="!isUpdate"
        ></u-text>
      </template>
      <template
        #body

      >
        <u-form
          ref="saveModalForm_1"
          key="saveModalForm_1"
        >
          <u-form-item
            ref="form_item_4"
            layout="center"
          >
            <template
              #label

            >
              <u-text
                ref="text_96"
                text="借取人"
              ></u-text>
            </template>
            <u-select
              ref="select_5"
              @sync:state="(key, val) => onSyncState('select_5', key, val)"
              :clearable="true"
              placeholder="请选择借取人"
              :dataSource="__select_5_handleDataSourceLoad()"
              :pageSize="50"
              textField="lcapUser.id"
              valueField="lcapUser.userName"
              :pagination="true"
              :value.sync="input.userName"
              :emptyValueIsNull="true"
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
            ref="form_item_5"
            layout="center"
          >
            <template
              #label

            >
              <u-text
                ref="text_97"
                text="资产"
              ></u-text>
            </template>
            <u-select
              ref="select_6"
              @sync:state="(key, val) => onSyncState('select_6', key, val)"
              :clearable="true"
              placeholder="请选择资产"
              :dataSource="__select_6_handleDataSourceLoad()"
              :pageSize="50"
              textField="asset.name"
              valueField="asset.id"
              :pagination="true"
              :value.sync="input.assetid"
              :emptyValueIsNull="true"
              key="select_6"
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
            ref="form_item_6"
            layout="center"
          >
            <template
              #label

            >
              <u-text
                ref="text_98"
                text="数量"
              ></u-text>
            </template>
            <u-number-input
              ref="number_input_1"
              :value.sync="input.num"
              placeholder="请输入数量"
            ></u-number-input>
          </u-form-item>
          <u-form-item
            ref="form_item_7"
            layout="center"
          >
            <template
              #label

            >
              <u-text
                ref="text_99"
                text="归还时间"
              ></u-text>
            </template>
            <u-date-time-picker
              ref="date_time_picker_1"
              :clearable="true"
              :value.sync="input.returnTime"
              placeholder="请选择归还时间"
              :emptyValueIsNull="true"
            ></u-date-time-picker>
          </u-form-item>
        </u-form>
      </template>
      <template
        #foot

      >
        <u-linear-layout ref="linear_layout_64">
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
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/assetApply',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      userAssetMapping: window.$genInitFromSchema('app.dataSources.defaultDS.entities.UserAssetMapping', undefined),
      input: window.$genInitFromSchema('app.dataSources.defaultDS.entities.UserAssetMapping', undefined),
      filter: window.$genInitFromSchema('app.dataSources.defaultDS.entities.UserAssetMapping', undefined),
      isUpdate: undefined,
      filter_asset: undefined,
      filter_user: undefined,
      tableView_5_state_page: undefined,
      tableView_5_state_size: undefined,
      tableView_5_state_sort: undefined,
      tableView_5_state_order: undefined,
      select_5_state_page: undefined,
      select_5_state_size: undefined,
      select_6_state_page: undefined,
      select_6_state_size: undefined,
    };
  },
  meta: {
    title: '资产申领页面',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async assetApply_created(event) {
      await this.assetApply_created_init(event);
    },

    async assetApply_created_init() {
      this.$global.frontendVariables.title = '资产申领';
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.UserAssetMapping', window.$utils.Clear(this.filter, 'deep', 'app.dataSources.defaultDS.entities.UserAssetMapping'));
    },

    async button_3_click(event) {
      await this.button_3_click_updateSubmit(event);
    },

    async button_3_click_updateSubmit() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.saveModalForm_1?.validate?.()) || {}).valid) {
        window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.UserAssetMapping',
          await window.LcapRequest({
            url: '/api/user-asset-mapping',
            method: 'PUT',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/assetApply/0',
            },
            data: {
              entity: this.input,
            },
          }),
        );
        await this.$refs.saveModal_1?.close?.();
        await this.$refs.tableView_5?.reload?.();
      }
    },

    async button_4_click(event) {
      await this.button_4_click_submit(event);
    },

    async button_4_click_submit() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.saveModalForm_1?.validate?.()) || {}).valid) {
        window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.UserAssetMapping',
          await window.LcapRequest({
            url: '/api/user-asset-mapping',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/assetApply/0',
            },

            data: this.input,
          }),
        );
        await this.$refs.saveModal_1?.close?.();
        await this.$refs.tableView_5?.reload?.();
      }
    },

    async button_1_click(event) {
      await this.button_1_click_reload(event);
    },

    async button_1_click_reload() {
      await this.$refs.tableView_5?.reload?.();
    },

    genviewMatchExpression_0ddauan0(current) {
      return (() => {
        const it = (((current || {}).item || {}).userAssetMapping || {}).returnTime;
        if (window.$global.isEqual(it, undefined)) {
          return '-';
        } else {
          return (((current || {}).item || {}).userAssetMapping || {}).returnTime;
        }
      })();
    },

    __tableView_5_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tableView_5_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{asset: app.dataSources.defaultDS.entities.Asset, lcapUser: app.dataSources.defaultDS.entities.LcapUser, userAssetMapping: app.dataSources.defaultDS.entities.UserAssetMapping}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadAssetApplyTableView5',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/assetApply/0',
            },
            data: {
              page: this.tableView_5_state_page,
              size: this.tableView_5_state_size,
              sort: this.tableView_5_state_sort,
              order: this.tableView_5_state_order,
              filter: this.filter,
              user: this.filter_user,
              asset: this.filter_asset,
            },
          }),
        );
      });
    },

    __select_5_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_5_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadAssetApplySelect1LcapUser',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/assetApply/0',
            },
            data: {
              page: this.select_5_state_page,
              size: this.select_5_state_size,
            },
          }),
        );
      });
    },

    __select_6_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_6_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{asset: app.dataSources.defaultDS.entities.Asset}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadAssetApplySelect2Asset',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/assetApply/0',
            },
            data: {
              page: this.select_6_state_page,
              size: this.select_6_state_size,
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
    await this.assetApply_created();
  },
};
</script>
