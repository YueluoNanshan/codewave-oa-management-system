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
      ref="linear_layout_150"
      direction="vertical"
      :wrap="true"
    >
      <u-linear-layout
        ref="linear_layout_151"
        :wrap="true"
      >
        <u-text
          ref="text_331"
          size="huge"
          text="资产管理"
        ></u-text>
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_152"
        :wrap="true"
      >
        <u-panel
          ref="panel_8"
          class="cw-style-margin-left cw-style-margin cw-style-margin-top cw-style-margin-right"
          style="--cw-style-margin-left: 20px; --cw-style-margin-top: 20px; --cw-style-margin-right: 20px; margin-top: 20px; margin-left: 20px; margin-right: 20px"
        >
          <template
            #title

          >
            <u-text
              ref="text_73"
              class="cw-style-color"
              text="资产列表"
              style="--cw-style-color: #000000; color: #000000"
            ></u-text>
          </template>
          <template
            #extra

          ></template>
          <u-linear-layout
            ref="linear_layout_41"
            direction="vertical"
            :wrap="true"
          >
            <u-linear-layout
              ref="linear_layout_43"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_129"
                direction="vertical"
              >
                <u-linear-layout ref="linear_layout_119">
                  <u-linear-layout
                    ref="linear_layout_132"
                    justify="space-between"
                    :wrap="true"
                  >
                    <u-linear-layout
                      ref="linear_layout_133"
                      :wrap="true"
                    >
                      <u-form
                        ref="form_1"
                        layout="inline"
                        key="form_1"
                      >
                        <u-form-item
                          ref="form_item_43"
                          layout="center"
                        >
                          <template
                            #label

                          >
                            <u-text
                              ref="text_238"
                              text="产品名称"
                            ></u-text>
                          </template>
                          <u-input
                            ref="input_20"
                            :value.sync="filter.name"
                            placeholder="请输入产品名称"
                            :emptyValueIsNull="true"
                          ></u-input>
                        </u-form-item>
                        <u-form-item
                          ref="form_item_44"
                          layout="center"
                        >
                          <template
                            #label

                          >
                            <u-text
                              ref="text_239"
                              text="品牌"
                            ></u-text>
                          </template>
                          <u-input
                            ref="input_21"
                            :value.sync="filter.brand"
                            placeholder="请输入品牌"
                            :emptyValueIsNull="true"
                          ></u-input>
                        </u-form-item>
                        <u-form-item
                          ref="form_item_45"
                          layout="center"
                          labelSize="auto"
                        >
                          <u-button
                            ref="button_15"
                            color="primary"
                            text="查 询"
                            @click="button_15_click($event)"
                          ></u-button>
                          <template
                            #label

                          ></template>
                        </u-form-item>
                      </u-form>
                    </u-linear-layout>
                    <u-linear-layout
                      ref="linear_layout_134"
                      :wrap="true"
                    >
                      <u-linear-layout
                        ref="linear_layout_120"
                        mode="flex"
                        alignment="start"
                        justify="end"
                      >
                        <u-button
                          ref="button_16"
                          color="primary"
                          text="创 建"
                          destination="/oaSys/createOrSubmitAsset"
                          @click="button_16_click($event)"
                          v-if="$auth.has('/oaSys/assetList/button_16')"
                        ></u-button>
                      </u-linear-layout>
                    </u-linear-layout>
                  </u-linear-layout>
                </u-linear-layout>
              </u-linear-layout>
            </u-linear-layout>
            <u-linear-layout
              ref="linear_layout_147"
              direction="horizontal"
              :wrap="true"
            >
              <u-button
                ref="button_29"
                text="变更资产状态"
                color="primary_secondary"
                :throttleTime="150"
                @click="button_29_click($event)"
                v-if="$auth.has('/oaSys/assetList/button_29')"
              ></u-button>
            </u-linear-layout>
            <u-linear-layout
              ref="linear_layout_44"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_145"
                direction="vertical"
              >
                <u-table-view
                  ref="table_view_1"
                  @sync:state="(key, val) => onSyncState('table_view_1', key, val)"
                  :pagination="true"
                  :pageSize="10"
                  :pageNumber="1"
                  :values.sync="list_asset"
                  :dataSource="__table_view_1_handleDataSourceLoad()"
                  v-dependencies.reload="[]"
                  sorting="{ field: undefined, order: 'asc' }"
                  valueField="asset"
                  key="table_view_1"
                >
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
                  <u-table-view-column
                    ref="table_view_column_25"
                    key="table_view_column_25"
                    type="checkbox"
                    :width="50"
                  >
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander
                        :ref="`table_view_expander_25_${(current || {}).__nodeKey || (current || {}).index}`"
                        :item="(current || {}).item"
                      ></u-table-view-expander>
                    </template>
                    <template
                      #title

                    >
                      <u-text ref="text_324"></u-text>
                    </template>
                    <template
                      #cell=""

                    ></template>
                    <template
                      #editcell=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_17"
                    key="table_view_column_17"
                  >
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander
                        :ref="`table_view_expander_17_${(current || {}).__nodeKey || (current || {}).index}`"
                        :item="(current || {}).item"
                      ></u-table-view-expander>
                    </template>
                    <template
                      #title

                    >
                      <u-text
                        ref="text_309"
                        text="资产名称"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-link
                        :ref="`link_5_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).name)"
                        :destination="`/oaSys/assetDetalls${$toQueryString({ assetid: (((current || {}).item || {}).asset || {}).id })}`"
                      ></u-link>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_18"
                    key="table_view_column_18"
                  >
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander
                        :ref="`table_view_expander_18_${(current || {}).__nodeKey || (current || {}).index}`"
                        :item="(current || {}).item"
                      ></u-table-view-expander>
                    </template>
                    <template
                      #title

                    >
                      <u-text
                        ref="text_310"
                        text="品牌"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_311_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).brand)"
                      ></u-text>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_19"
                    key="table_view_column_19"
                  >
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander
                        :ref="`table_view_expander_19_${(current || {}).__nodeKey || (current || {}).index}`"
                        :item="(current || {}).item"
                      ></u-table-view-expander>
                    </template>
                    <template
                      #title

                    >
                      <u-text
                        ref="text_312"
                        text="规格/型号"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_313_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).specification)"
                      ></u-text>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_20"
                    key="table_view_column_20"
                  >
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander
                        :ref="`table_view_expander_20_${(current || {}).__nodeKey || (current || {}).index}`"
                        :item="(current || {}).item"
                      ></u-table-view-expander>
                    </template>
                    <template
                      #title

                    >
                      <u-text
                        ref="text_314"
                        text="剩余库存"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_315_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.Long', (((current || {}).item || {}).asset || {}).residuallnventory)"
                      ></u-text>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_21"
                    key="table_view_column_21"
                  >
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander
                        :ref="`table_view_expander_21_${(current || {}).__nodeKey || (current || {}).index}`"
                        :item="(current || {}).item"
                      ></u-table-view-expander>
                    </template>
                    <template
                      #title

                    >
                      <u-text
                        ref="text_316"
                        text="图片"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-image
                        :ref="`image_7_${(current || {}).__nodeKey || (current || {}).index}`"
                        :src="(((current || {}).item || {}).asset || {}).picture"
                        fit="contain"
                      ></u-image>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_23"
                    key="table_view_column_23"
                  >
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander
                        :ref="`table_view_expander_23_${(current || {}).__nodeKey || (current || {}).index}`"
                        :item="(current || {}).item"
                      ></u-table-view-expander>
                    </template>
                    <template
                      #title

                    >
                      <u-text
                        ref="text_321"
                        text="入库日期"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_322_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', $utils['FormatDateTime']((((current || {}).item || {}).asset || {}).createdTime, `yyyy-MM-dd`, `global`))"
                      ></u-text>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_22"
                    key="table_view_column_22"
                  >
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander
                        :ref="`table_view_expander_22_${(current || {}).__nodeKey || (current || {}).index}`"
                        :item="(current || {}).item"
                      ></u-table-view-expander>
                    </template>
                    <template
                      #title

                    >
                      <u-text
                        ref="text_319"
                        text="资产状态"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-label
                        :ref="`label_1_${(current || {}).__nodeKey || (current || {}).index}`"
                        :key="`label_1_${(current || {}).__nodeKey || (current || {}).index}`"
                        color="success"
                        text="正常"
                        v-if="(((current || {}).item || {}).asset || {}).status == '1'"
                      ></u-label>
                      <u-label
                        :ref="`label_3_${(current || {}).__nodeKey || (current || {}).index}`"
                        :key="`label_3_${(current || {}).__nodeKey || (current || {}).index}`"
                        color="default"
                        text="下架"
                        v-if="(((current || {}).item || {}).asset || {}).status == '0'"
                      ></u-label>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_24"
                    key="table_view_column_24"
                  >
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander
                        :ref="`table_view_expander_24_${(current || {}).__nodeKey || (current || {}).index}`"
                        :item="(current || {}).item"
                      ></u-table-view-expander>
                    </template>
                    <template
                      #title

                    >
                      <u-text
                        ref="text_323"
                        text="操作 "
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-link
                        :ref="`link_6_${(current || {}).__nodeKey || (current || {}).index}`"
                        :key="`link_6_${(current || {}).__nodeKey || (current || {}).index}`"
                        text="申请资产"
                        display="block"
                        @click="link_6_click($event, current)"
                        v-if="(((current || {}).item || {}).asset || {}).residuallnventory > 0 && (((current || {}).item || {}).asset || {}).status == '1'"
                      ></u-link>
                      <u-link
                        :ref="`link_4_${(current || {}).__nodeKey || (current || {}).index}`"
                        text="删除"
                        @click="link_4_click($event, current)"
                      ></u-link>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                  </u-table-view-column>
                </u-table-view>
              </u-linear-layout>
            </u-linear-layout>
          </u-linear-layout>
        </u-panel>
      </u-linear-layout>
    </u-linear-layout>
    <u-modal
      ref="modal_2"
      icon="warning"
      :is-heading-slot-empty="true"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_146"
          justify="center"
        >
          <u-button
            ref="button_26"
            color="primary"
            text="确定删除"
            @click="button_26_click($event)"
          ></u-button>
          <u-button
            ref="button_27"
            text="取 消"
            @click="button_27_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-text
          ref="text_298"
          :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `确定要删除“`) + $utils['ToString']('nasl.core.String', (deleted || {}).name) + $utils['ToString']('nasl.core.String', `”吗？`))"
          display="block"
        ></u-text>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_299"
          text="请确认"
        ></u-text>
      </template>
      <template
        #heading

      ></template>
    </u-modal>
    <u-modal
      ref="modal_3"
      :is-heading-slot-empty="true"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_148"
          justify="center"
        >
          <u-button
            ref="button_30"
            color="primary"
            text="确认申请"
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
          ref="text_325"
          :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `确定要申请“`) + $utils['ToString']('nasl.core.String', (applyAsset || {}).name) + $utils['ToString']('nasl.core.String', `”吗？`))"
          display="block"
        ></u-text>
        <u-text
          ref="text_327"
          text="确认后请前往相关部门领取"
        ></u-text>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_326"
          text="申请资产"
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
  name: '/oaSys/assetList',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      asset: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', undefined),
      input: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', undefined),
      filter: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', undefined),
      isUpdate: undefined,
      deleted: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', undefined),
      list_asset: window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.Asset>', undefined),
      applyAsset: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', undefined),
      table_view_1_state_page: undefined,
      table_view_1_state_size: undefined,
      table_view_1_state_sort: undefined,
      table_view_1_state_order: undefined,
    };
  },
  meta: {
    title: '资产列表',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async assetList_created(event) {
      await this.assetList_created_init(event);
    },

    async assetList_created_init() {
      this.$global.frontendVariables.title = '资产列表';
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', window.$utils.Clear(this.filter, 'deep', 'app.dataSources.defaultDS.entities.Asset'));
    },

    async button_26_click(event) {
      await this.button_26_click_click(event);
    },

    async button_26_click_click() {
      await window.LcapRequest({
        url: '/api/asset',
        method: 'DELETE',
        extraConfig: {
          serviceType: 'entity',
        },
        params: {
          id: (this.deleted || {}).id,
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/assetList/0',
        },
      });
      await this.$refs.modal_2?.close?.();
      await this.$refs.table_view_1?.reload?.();
    },

    async button_27_click(event) {
      await this.button_27_click_click(event);
    },

    async button_27_click_click() {
      await this.$refs.modal_2?.close?.();
    },

    async button_30_click(event) {
      await this.button_30_click_click(event);
    },

    async button_30_click_click() {
      let mapping = window.$genInitFromSchema('app.dataSources.defaultDS.entities.UserAssetMapping', undefined);
      this.applyAsset.residuallnventory = window.$global.minus((this.applyAsset || {}).residuallnventory, 1);
      window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.Asset',
        await window.LcapRequest({
          url: '/api/asset',
          method: 'PUT',
          extraConfig: {
            serviceType: 'entity',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/assetList/0',
          },
          data: {
            entity: this.applyAsset,
            properties: ['id', 'residuallnventory'],
          },
        }),
      );
      mapping = await (async () => {
        const obj = window.$genInitFromSchema('app.dataSources.defaultDS.entities.UserAssetMapping', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'UserAssetMapping' }));
        obj.userName = (this.$global.userInfo || {}).UserName;
        obj.assetid = (this.applyAsset || {}).id;
        obj.num = 1;
        return obj;
      })();
      window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.UserAssetMapping',
        await window.LcapRequest({
          url: '/api/user-asset-mapping',
          method: 'POST',
          extraConfig: {
            serviceType: 'entity',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/assetList/0',
          },

          data: mapping,
        }),
      );
      await this.$refs.modal_3?.close?.();
      await this.$refs.table_view_1?.reload?.();
    },

    async button_31_click(event) {
      await this.button_31_click_click(event);
    },

    async button_31_click_click() {
      await this.$refs.modal_3?.close?.();
    },

    async button_29_click(event) {
      await this.button_29_click_click(event);
    },

    async button_29_click_click() {
      if (window.$utils.HasValue({ type: 'nasl.collection.List<app.dataSources.defaultDS.entities.Asset>', value: this.list_asset })) {
        const $forEachListVariable1ty5nlg1 = this.list_asset;
        const $forEachStartVariable1ty5nlg1 = 0;
        const $forEachEndVariable1ty5nlg1 = ($forEachListVariable1ty5nlg1 || {}).length;
        if (Array.isArray($forEachListVariable1ty5nlg1)) {
          for (let index = $forEachStartVariable1ty5nlg1; index < $forEachEndVariable1ty5nlg1; index++) {
            const item = $forEachListVariable1ty5nlg1[index];
            if ((item || {}).status == '1') {
              item.status = '0';
            } else {
              item.status = '1';
            }
          }
        }

        window.$genInitFromSchema(
          'nasl.collection.List<app.dataSources.defaultDS.entities.Asset>',
          await window.LcapRequest({
            url: '/api/asset/batch',
            method: 'PUT',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/assetList/0',
            },
            data: {
              entities: this.list_asset,
              properties: ['id', 'status'],
            },
          }),
        );
      } else {
        await window.$global.showMessage(window.$utils.ToString('nasl.core.String', ' 请先选择数据'));
      }
    },

    async link_6_click(event, current) {
      await this.link_6_click_click(event, current);
    },

    async link_6_click_click(event, current) {
      this.applyAsset = window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', window.$utils.Clone(((current || {}).item || {}).asset));
      await this.$refs.modal_3?.open?.();
    },

    async link_4_click(event, current) {
      await this.link_4_click_remove(event, current);
    },

    async link_4_click_remove(event, current) {
      this.deleted = ((current || {}).item || {}).asset;
      await this.$refs.modal_2?.open?.();
    },

    async button_16_click(event) {
      await this.button_16_click_click(event);
    },

    async button_16_click_click() {
      window.$destination('/oaSys/createOrSubmitAsset', '_self', false);
    },

    async button_15_click(event) {
      await this.button_15_click_click(event);
    },

    async button_15_click_click() {
      await this.$refs.table_view_1?.reload?.();
    },

    __table_view_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__table_view_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{asset: app.dataSources.defaultDS.entities.Asset, supplier: app.dataSources.defaultDS.entities.Supplier}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadAssetListTableView1',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/assetList/0',
            },
            data: {
              page: this.table_view_1_state_page,
              size: this.table_view_1_state_size,
              sort: this.table_view_1_state_sort,
              order: this.table_view_1_state_order,
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
    await this.assetList_created();
  },
};
</script>
