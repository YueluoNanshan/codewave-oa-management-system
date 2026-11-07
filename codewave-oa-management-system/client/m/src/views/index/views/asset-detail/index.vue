<template>
  <van-linear-layout
    ref="vanLinearLayout1"
    class="l-root-h5"
    type="root"
    gap="none"
  >
    <van-linear-layout
      ref="linear_layout_3"
      direction="vertical"
      gap="none"
    >
      <van-linear-layout
        ref="linear_layout_4"
        :wrap="true"
      >
        <van-row
          ref="row_2"
          gutter="0"
        >
          <van-col
            ref="col_4"
            :span="8"
            mode="flex"
            justify="center"
            alignment="center"
          >
            <van-image
              ref="image_1"
              class="cw-style-text-align"
              :src="(asset || {}).picture"
              fit="contain"
              :preview="true"
              style="--cw-style-text-align: center; text-align: center"
            ></van-image>
          </van-col>
          <van-col
            ref="col_5"
            :span="16"
          >
            <van-cell-group ref="cell_group_1">
              <van-cell
                ref="cell_2"
                class="cw-style-height"
                :isLink="false"
                :center="true"
                style="--cw-style-height: 30px; min-height: 30px; height: 30px"
              >
                <template
                  #title

                >
                  <van-text
                    ref="text_7"
                    text="资产名称"
                  ></van-text>
                </template>
                <van-text
                  ref="text_8"
                  :text="$utils['ToString']('nasl.core.String', (asset || {}).name)"
                ></van-text>
                <template
                  #rightIcon

                ></template>
              </van-cell>
              <van-cell
                ref="cell_3"
                class="cw-style-height"
                :isLink="false"
                :center="true"
                style="--cw-style-height: 30px; min-height: 30px; height: 30px"
              >
                <template
                  #title

                >
                  <van-text
                    ref="text_10"
                    text="规格/型号"
                  ></van-text>
                </template>
                <van-text
                  ref="text_9"
                  :text="$utils['ToString']('nasl.core.String', (asset || {}).specification)"
                ></van-text>
                <template
                  #rightIcon

                ></template>
              </van-cell>
              <van-cell
                ref="cell_4"
                class="cw-style-height"
                :isLink="false"
                :center="true"
                style="--cw-style-height: 30px; min-height: 30px; height: 30px"
              >
                <template
                  #title

                >
                  <van-text
                    ref="text_12"
                    text="详细参数"
                  ></van-text>
                </template>
                <van-text
                  ref="text_11"
                  :text="$utils['ToString']('nasl.core.String', (asset || {}).descrition)"
                ></van-text>
                <template
                  #rightIcon

                ></template>
              </van-cell>
              <van-cell
                ref="cell_5"
                class="cw-style-height"
                :isLink="false"
                :center="true"
                style="--cw-style-height: 30px; min-height: 30px; height: 30px"
              >
                <template
                  #title

                >
                  <van-text
                    ref="text_14"
                    text="品牌"
                  ></van-text>
                </template>
                <van-text
                  ref="text_13"
                  :text="$utils['ToString']('nasl.core.String', (asset || {}).brand)"
                ></van-text>
                <template
                  #rightIcon

                ></template>
              </van-cell>
            </van-cell-group>
          </van-col>
        </van-row>
      </van-linear-layout>
      <van-linear-layout
        ref="linear_layout_5"
        class="cw-style-text-align cw-style-margin-top cw-style-margin"
        :wrap="true"
        style="--cw-style-text-align: center; --cw-style-margin-top: 20px; text-align: center; margin-top: 20px"
      >
        <van-button
          ref="button_1"
          type="info"
          size="middle"
          text="归还资产"
          squareroud="round"
          @click="button_1_click($event)"
        ></van-button>
      </van-linear-layout>
    </van-linear-layout>
    <van-dialog
      ref="dialog_1"
      :safeAreaInsetBottom="true"
    >
      <template
        #footer

      >
        <van-linear-layout
          ref="linear_layout_6"
          class="cw-style-width"
          type="flex"
          :vusion-disabled-cut="true"
          style="--cw-style-width: 100%; width: 100%"
        >
          <van-button
            ref="button_2"
            class="van-button van-button--default van-dialog__cancel"
            text="取消"
            @click="button_2_click($event)"
          ></van-button>
          <van-button
            ref="button_3"
            class="van-button van-button--default van-dialog__confirm van-hairline--left"
            text="确认"
            @click="button_3_click($event)"
          ></van-button>
        </van-linear-layout>
      </template>
      <div
        ref="div_1"
        class="dialogchild"
        vusion-slot-name="default"
        :vusion-disabled-copy="true"
        :vusion-disabled-cut="true"
        env="alone"
        style="min-height: 100px"
      >
        <van-text
          ref="text_15"
          :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `确认归还资产“`) + $utils['ToString']('nasl.core.String', (asset || {}).name) + $utils['ToString']('nasl.core.String', `”吗？`))"
        ></van-text>
      </div>
    </van-dialog>
  </van-linear-layout>
</template>
<script>
export default {
  name: '/index/assetDetail',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      mapping: window.$genInitFromSchema('app.dataSources.defaultDS.entities.UserAssetMapping', undefined),
      asset: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', undefined),
      id: Object.prototype.hasOwnProperty.call(this.$route.query, 'id') && !['undefined', 'null'].includes(this.$route.query.id) ? window.$genInitFromSchema('nasl.core.Long', this.$route.query.id) : undefined,
    };
  },
  meta: {
    title: '资产详情',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: undefined,
  },
  methods: {
    async assetDetail_created(event) {
      await this.assetDetail_created_created(event);
    },

    async assetDetail_created_created() {
      this.mapping = window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.UserAssetMapping',
        await window.LcapRequest({
          url: '/api/user-asset-mapping',
          method: 'GET',
          extraConfig: {
            serviceType: 'entity',
          },
          params: {
            id: this.id,
          },
          headers: {
            'lcap-calllogic-uuid': '/m/index/assetDetail/0',
          },
        }),
      );
      this.asset = window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.Asset',
        await window.LcapRequest({
          url: '/api/asset',
          method: 'GET',
          extraConfig: {
            serviceType: 'entity',
          },
          params: {
            id: (this.mapping || {}).assetid,
          },
          headers: {
            'lcap-calllogic-uuid': '/m/index/assetDetail/0',
          },
        }),
      );
    },

    async button_1_click(event) {
      await this.button_1_click_click(event);
    },

    async button_1_click_click() {
      await this.$refs.dialog_1?.openModal?.();
    },

    async button_2_click(event) {
      await this.button_2_click_click(event);
    },

    async button_2_click_click() {
      await this.$refs.dialog_1?.closeModal?.();
    },

    async button_3_click(event) {
      await this.button_3_click_click(event);
    },

    async button_3_click_click() {
      this.mapping.returnTime = window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime());
      window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.UserAssetMapping',
        await window.LcapRequest({
          url: '/api/user-asset-mapping',
          method: 'PUT',
          extraConfig: {
            serviceType: 'entity',
          },
          headers: {
            'lcap-calllogic-uuid': '/m/index/assetDetail/0',
          },
          data: {
            entity: this.mapping,
            properties: ['id', 'returnTime'],
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
            'lcap-calllogic-uuid': '/m/index/assetDetail/0',
          },
          data: {
            entity: this.asset,
            properties: ['id', 'residuallnventory'],
          },
        }),
      );
      window.$destination('/m/index/myAsset', '_self', false);
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.assetDetail_created();
  },
};
</script>
