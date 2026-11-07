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
      ref="linear_layout_2"
      direction="vertical"
      :wrap="true"
    >
      <u-linear-layout
        ref="linear_layout_6"
        justify="space-between"
        :wrap="true"
      >
        <u-linear-layout
          ref="linear_layout_7"
          :wrap="true"
        ></u-linear-layout>
        <u-linear-layout
          ref="linear_layout_8"
          :wrap="true"
        ></u-linear-layout>
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_3"
        :wrap="true"
      >
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
          key="tableView_5"
          style="--cw-style-text-align: center; --table-view-th-text-align: center; text-align: center"
        >
          <u-table-view-column
            ref="table_view_column_37"
            key="table_view_column_37"
            type="index"
            :width="60"
          >
            <template
              #title

            >
              <u-text
                ref="text_65"
                text="序号"
              ></u-text>
            </template>
            <template
              #expander="current"

            >
              <u-table-view-expander :ref="`table_view_expander_37_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
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
            ref="table_view_column_38"
            key="table_view_column_38"
            field="userAssetMapping.createdTime"
          >
            <template
              #title

            >
              <u-text
                ref="text_66"
                class="cw-style-text-align"
                text="申请时间"
                style="--cw-style-text-align: left; text-align: left"
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
                  :ref="`text_67_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.DateTime', (((current || {}).item || {}).userAssetMapping || {}).createdTime)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #expander="current"

            >
              <u-table-view-expander :ref="`table_view_expander_38_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
            </template>
            <template
              #editcell=""

            ></template>
            <template
              #expand-content=""

            ></template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column_40"
            key="table_view_column_40"
            field="userAssetMapping.userName"
          >
            <template
              #title

            >
              <u-text
                ref="text_70"
                text="申请人"
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
                  :ref="`text_71_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).lcapUser || {}).userName)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #expander="current"

            >
              <u-table-view-expander :ref="`table_view_expander_40_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
            </template>
            <template
              #editcell=""

            ></template>
            <template
              #expand-content=""

            ></template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column_41"
            key="table_view_column_41"
            field="userAssetMapping.assetid"
          >
            <template
              #title

            >
              <u-text
                ref="text_72"
                text="资产名称"
              ></u-text>
            </template>
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout_44_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-text
                  :ref="`text_73_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).name)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #expander="current"

            >
              <u-table-view-expander :ref="`table_view_expander_41_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
            </template>
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
            field="userAssetMapping.assetid"
          >
            <template
              #title

            >
              <u-text
                ref="text_79"
                text="规格/型号"
              ></u-text>
            </template>
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout_48_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-text
                  :ref="`text_80_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).specification)"
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
            ref="table_view_column_46"
            key="table_view_column_46"
            field="userAssetMapping.assetid"
          >
            <template
              #title

            >
              <u-text
                ref="text_81"
                text="品牌"
              ></u-text>
            </template>
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout_49_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-text
                  :ref="`text_82_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).brand)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #expander="current"

            >
              <u-table-view-expander :ref="`table_view_expander_46_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
            </template>
            <template
              #editcell=""

            ></template>
            <template
              #expand-content=""

            ></template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column_42"
            key="table_view_column_42"
            field="userAssetMapping.num"
          >
            <template
              #title

            >
              <u-text
                ref="text_74"
                text="数量"
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
                  :ref="`text_75_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.Long', (((current || {}).item || {}).userAssetMapping || {}).num)"
                ></u-text>
              </u-linear-layout>
            </template>
            <template
              #expander="current"

            >
              <u-table-view-expander :ref="`table_view_expander_42_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
            </template>
            <template
              #editcell=""

            ></template>
            <template
              #expand-content=""

            ></template>
          </u-table-view-column>
          <u-table-view-column
            ref="table_view_column_44"
            key="table_view_column_44"
          >
            <template
              #title

            >
              <u-text
                ref="text_78"
                text="操作"
              ></u-text>
            </template>
            <template
              #cell="current"

            >
              <u-linear-layout
                :ref="`linear_layout_47_${(current || {}).__nodeKey || (current || {}).index}`"
                gap="small"
              >
                <u-link
                  :ref="`link_9_${(current || {}).__nodeKey || (current || {}).index}`"
                  text="归还资产"
                  @click="link_9_click($event, current)"
                ></u-link>
              </u-linear-layout>
            </template>
            <template
              #expander="current"

            >
              <u-table-view-expander :ref="`table_view_expander_44_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
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
        ref="linear_layout_4"
        :wrap="true"
      ></u-linear-layout>
    </u-linear-layout>
    <u-modal
      ref="modal_1"
      :is-heading-slot-empty="true"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_150"
          justify="center"
        >
          <u-button
            ref="button_30"
            color="primary"
            text="确认归还"
            @click="button_30_click($event)"
          ></u-button>
          <u-button
            ref="button_31"
            text="取 消"
            @click="button_31_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-text
          ref="text_331"
          text="请确认是否归还资产？"
          display="block"
        ></u-text>
        <u-text
          ref="text_333"
          class="cw-style-color"
          text="（申请归还后，请于线下归还资产）"
          style="--cw-style-color: #ff0000; color: #ff0000"
        ></u-text>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_332"
          text="确认归还资产"
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
  name: '/oaSys/myAsset',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      record: window.$genInitFromSchema('app.dataSources.defaultDS.entities.UserAssetMapping', undefined),
      asset: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', undefined),
      tableView_5_state_page: undefined,
      tableView_5_state_size: undefined,
      tableView_5_state_sort: undefined,
      tableView_5_state_order: undefined,
    };
  },
  meta: {
    title: '我的资产',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async myAsset_created(event) {
      await this.myAsset_created_created(event);
    },

    async myAsset_created_created() {
      this.$global.frontendVariables.title = '我的资产';
    },

    async button_30_click(event) {
      await this.button_30_click_click(event);
    },

    async button_30_click_click() {
      this.record.returnTime = window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime('global'));
      window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.UserAssetMapping',
        await window.LcapRequest({
          url: '/api/user-asset-mapping',
          method: 'PUT',
          extraConfig: {
            serviceType: 'entity',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/myAsset/0',
          },
          data: {
            entity: this.record,
          },
        }),
      );
      this.asset.residuallnventory = window.$global.add((this.asset || {}).residuallnventory, 1);
      window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.Asset',
        await window.LcapRequest({
          url: '/api/asset',
          method: 'PUT',
          extraConfig: {
            serviceType: 'entity',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/myAsset/0',
          },
          data: {
            entity: this.asset,
          },
        }),
      );
      await this.$refs.tableView_5?.reload?.();
      await this.$refs.modal_1?.close?.();
    },

    async button_31_click(event) {
      await this.button_31_click_click(event);
    },

    async button_31_click_click() {
      await this.$refs.modal_1?.close?.();
    },

    async link_9_click(event, current) {
      await this.link_9_click_click(event, current);
    },

    async link_9_click_click(event, current) {
      await this.$refs.modal_1?.open?.();
      this.record = ((current || {}).item || {}).userAssetMapping;
      this.asset = ((current || {}).item || {}).asset;
    },

    __tableView_5_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tableView_5_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{asset: app.dataSources.defaultDS.entities.Asset, lcapUser: app.dataSources.defaultDS.entities.LcapUser, userAssetMapping: app.dataSources.defaultDS.entities.UserAssetMapping}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadMyAssetTableView5',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/myAsset/0',
            },
            data: {
              page: this.tableView_5_state_page,
              size: this.tableView_5_state_size,
              sort: this.tableView_5_state_sort,
              order: this.tableView_5_state_order,
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
    await this.myAsset_created();
  },
};
</script>
