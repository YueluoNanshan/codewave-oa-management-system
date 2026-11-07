<template>
  <u-linear-layout
    ref="uLinearLayout1"
    class="cw-style-height"
    type="root"
    gap="none"
    style="--cw-style-height: 100%; height: 100%; --custom-start: auto; min-height: 200px"
  >
    <u-router-view ref="router_view1"></u-router-view>
    <u-crumb
      ref="crumb_1"
      :icon="false"
    >
      <u-crumb-item
        ref="crumb_item_1"
        icon="home"
        destination="/oaSys/assetList"
      >
        <u-text
          ref="text_76"
          text="资产管理"
        ></u-text>
      </u-crumb-item>
      <u-crumb-item
        ref="crumb_item_3"
        icon="task"
        :disabled="true"
      >
        <u-text
          ref="text_78"
          text="资产详情"
        ></u-text>
      </u-crumb-item>
    </u-crumb>
    <u-panel ref="panel_8">
      <template
        #title

      >
        <u-text
          ref="text_79"
          class="cw-style-color"
          text="资产详情"
          style="--cw-style-color: #000000; color: #000000"
        ></u-text>
      </template>
      <template
        #extra

      >
        <u-button
          ref="button_2"
          text="修改信息"
          color="primary_secondary"
          :throttleTime="150"
          :destination="`/oaSys/createOrSubmitAsset${$toQueryString({ assetid: assetid })}`"
        ></u-button>
      </template>
      <u-linear-layout
        ref="linear_layout_47"
        direction="vertical"
        :wrap="true"
      >
        <u-linear-layout
          ref="linear_layout_48"
          :wrap="true"
        >
          <u-collapse ref="collapse_1">
            <u-collapse-item ref="collapse_item_1">
              <template
                #title

              >
                <i-ico
                  ref="ico_2"
                  name="task"
                  icotype="left"
                >
                  <u-text
                    ref="text_422"
                    text="基本信息"
                  ></u-text>
                </i-ico>
              </template>
              <u-form
                ref="form_2"
                layout="inline-flex"
                :repeat="2"
                key="form_2"
              >
                <u-form-item
                  ref="form_item_4"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_427"
                      text="资产名称"
                    ></u-text>
                  </template>
                  <u-text
                    ref="text_429"
                    class="cw-style-color"
                    :text="$utils['ToString']('nasl.core.String', (asset || {}).name)"
                    style="--cw-style-color: #040404; color: #040404"
                  ></u-text>
                </u-form-item>
                <u-form-item
                  ref="form_item_6"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_428"
                      text="规格/型号"
                      display="inline"
                      size="default"
                      overflow="nowrap"
                    ></u-text>
                  </template>
                  <u-text
                    ref="text_436"
                    class="cw-style-color"
                    :text="$utils['ToString']('nasl.core.String', (asset || {}).specification)"
                    style="--cw-style-color: #040404; color: #040404"
                  ></u-text>
                </u-form-item>
              </u-form>
              <u-form
                ref="form_3"
                layout="inline-flex"
                :repeat="2"
                key="form_3"
              >
                <u-form-item
                  ref="form_item_7"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_431"
                      text="品牌"
                    ></u-text>
                  </template>
                  <u-text
                    ref="text_430"
                    class="cw-style-color"
                    :text="$utils['ToString']('nasl.core.String', (asset || {}).brand)"
                    style="--cw-style-color: #040404; color: #040404"
                  ></u-text>
                </u-form-item>
                <u-form-item
                  ref="form_item_8"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_432"
                      text="详细参数"
                    ></u-text>
                  </template>
                  <u-text
                    ref="text_437"
                    class="cw-style-color"
                    :text="$utils['ToString']('nasl.core.String', (asset || {}).descrition)"
                    style="--cw-style-color: #040404; color: #040404"
                  ></u-text>
                </u-form-item>
              </u-form>
              <u-form
                ref="form_4"
                layout="inline-flex"
                :repeat="2"
                key="form_4"
              >
                <u-form-item
                  ref="form_item_9"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_434"
                      text="采购价"
                    ></u-text>
                  </template>
                  <u-text
                    ref="text_433"
                    class="cw-style-color"
                    :text="$utils['ToString']('nasl.core.Decimal', (asset || {}).price)"
                    style="--cw-style-color: #040404; color: #040404"
                  ></u-text>
                </u-form-item>
                <u-form-item
                  ref="form_item_10"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_435"
                      text="供应商"
                    ></u-text>
                  </template>
                  <u-text
                    ref="text_438"
                    class="cw-style-color"
                    :text="$utils['ToString']('nasl.core.String', (supplier || {}).name)"
                    style="--cw-style-color: #040404; color: #040404"
                  ></u-text>
                </u-form-item>
              </u-form>
            </u-collapse-item>
            <u-collapse-item ref="collapse_item_2">
              <template
                #title

              >
                <u-text
                  ref="text_417"
                  text="库存信息"
                ></u-text>
              </template>
              <u-form
                ref="form_5"
                labelLayout="inline"
                layout="inline-flex"
                :repeat="2"
                key="form_5"
              >
                <u-form-item
                  ref="form_item_12"
                  :required="false"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_441"
                      text="可用库存"
                    ></u-text>
                  </template>
                  <u-text
                    ref="text_446"
                    class="cw-style-color"
                    :text="$utils['ToString']('nasl.core.Long', (asset || {}).residuallnventory)"
                    style="--cw-style-color: #040404; color: #040404"
                  ></u-text>
                </u-form-item>
                <u-form-item
                  ref="form_item_15"
                  :required="false"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_445"
                      text="总库存"
                    ></u-text>
                  </template>
                  <u-text
                    ref="text_447"
                    class="cw-style-color"
                    :text="$utils['ToString']('nasl.core.Long', (asset || {}).inventory)"
                    style="--cw-style-color: #040404; color: #040404"
                  ></u-text>
                </u-form-item>
              </u-form>
            </u-collapse-item>
            <u-collapse-item ref="collapse_item_3">
              <template
                #title

              >
                <u-text
                  ref="text_419"
                  text="实物信息"
                ></u-text>
              </template>
              <u-form
                ref="form_6"
                key="form_6"
              >
                <u-form-item
                  ref="form_item_16"
                  :required="false"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_448"
                      text="图片"
                    ></u-text>
                  </template>
                  <u-image
                    ref="image_2"
                    class="cw-style-width cw-style-height"
                    :src="(asset || {}).picture"
                    fit="scale-down"
                    style="--cw-style-width: 200px; --cw-style-height: 200px; width: 200px; height: 200px"
                  ></u-image>
                </u-form-item>
              </u-form>
            </u-collapse-item>
          </u-collapse>
        </u-linear-layout>
        <u-linear-layout
          ref="linear_layout_49"
          :wrap="true"
        ></u-linear-layout>
      </u-linear-layout>
    </u-panel>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/assetDetalls',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      supplier: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Supplier', undefined),
      asset: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', undefined),
      assetid: Object.prototype.hasOwnProperty.call(this.$route.query, 'assetid') && !['undefined', 'null'].includes(this.$route.query.assetid) ? window.$genInitFromSchema('nasl.core.Long', this.$route.query.assetid) : undefined,
    };
  },
  meta: {
    title: '资产详情',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async assetDetalls_created(event) {
      await this.assetDetalls_created_created(event);
    },

    async assetDetalls_created_created() {
      this.$global.frontendVariables.title = '资产详情';
      this.asset = window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.Asset',
        await window.LcapRequest({
          url: '/api/asset',
          method: 'GET',
          extraConfig: {
            serviceType: 'entity',
          },
          params: {
            id: this.assetid,
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/assetDetalls/0',
          },
        }),
      );
      this.supplier = window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.Supplier',
        await window.LcapRequest({
          url: '/api/supplier',
          method: 'GET',
          extraConfig: {
            serviceType: 'entity',
          },
          params: {
            id: (this.asset || {}).supplierid,
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/assetDetalls/0',
          },
        }),
      );
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.assetDetalls_created();
  },
};
</script>
