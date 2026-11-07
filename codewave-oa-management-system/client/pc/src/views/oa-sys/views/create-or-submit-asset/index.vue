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
        ref="crumb_item_3"
        icon="home"
      >
        <u-text
          ref="text_81"
          text="资源管理"
        ></u-text>
      </u-crumb-item>
      <u-crumb-item
        ref="crumb_item_5"
        icon="task"
        :disabled="true"
      >
        <u-text
          ref="text_83"
          :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1nvqlxy0())"
        ></u-text>
      </u-crumb-item>
    </u-crumb>
    <u-panel ref="panel_8">
      <template
        #title

      >
        <u-text
          ref="text_84"
          class="cw-style-color"
          :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1pwi25d1())"
          style="--cw-style-color: #000000; color: #000000"
        ></u-text>
      </template>
      <template
        #extra

      ></template>
      <u-linear-layout
        ref="linear_layout_48"
        direction="vertical"
        :wrap="true"
      >
        <u-linear-layout
          ref="linear_layout_49"
          :wrap="true"
        >
          <u-form
            ref="form_1"
            layout="inline-flex"
            :repeat="2"
            labelSize="small"
            key="form_1"
          >
            <u-form-item
              ref="form_item_1"
              layout="center"
              :required="true"
              :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
            >
              <template
                #label

              >
                <u-text
                  ref="text_85"
                  text="资产名称"
                ></u-text>
              </template>
              <u-input
                ref="input_1"
                :value.sync="asset.name"
                placeholder="请输入产品名称"
                :emptyValueIsNull="true"
              ></u-input>
            </u-form-item>
            <u-form-item
              ref="form_item_4"
              layout="center"
            >
              <template
                #label

              >
                <u-text
                  ref="text_88"
                  text="规格/型号"
                ></u-text>
              </template>
              <u-input
                ref="input_4"
                :value.sync="asset.specification"
                placeholder="请输入规格/型号"
                :emptyValueIsNull="true"
              ></u-input>
            </u-form-item>
            <u-form-item
              ref="form_item_3"
              layout="block"
            >
              <template
                #label

              >
                <u-text
                  ref="text_87"
                  text="详细参数"
                ></u-text>
              </template>
              <u-textarea
                ref="textarea_2"
                placeholder="请输入"
                limitPosition="outside"
                :emptyValueIsNull="true"
                :value.sync="asset.descrition"
              ></u-textarea>
            </u-form-item>
            <u-form-item
              ref="form_item_2"
              layout="center"
              :required="true"
              :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
            >
              <template
                #label

              >
                <u-text
                  ref="text_86"
                  text="品牌"
                ></u-text>
              </template>
              <u-input
                ref="input_2"
                :value.sync="asset.brand"
                placeholder="请输入品牌"
                :emptyValueIsNull="true"
              ></u-input>
            </u-form-item>
            <u-form-item
              ref="form_item_5"
              layout="center"
              :span="2"
              :required="true"
              :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
            >
              <template
                #label

              >
                <u-text
                  ref="text_89"
                  text="数量"
                ></u-text>
              </template>
              <u-number-input
                ref="number_input_1"
                :value.sync="asset.inventory"
                placeholder="请输入库存"
                unitValue=""
                :decimalPlacesOmitZero="true"
                :disabled="$utils['HasValue']({ type: 'nasl.core.Long', value: assetid })"
              ></u-number-input>
            </u-form-item>
            <u-form-item
              ref="form_item_8"
              layout="center"
            >
              <template
                #label

              >
                <u-text
                  ref="text_92"
                  text="采购价"
                ></u-text>
              </template>
              <u-number-input
                ref="number_input_3"
                :value.sync="asset.price"
                :precision="0"
                :step="0"
                placeholder="请输入采购价"
              ></u-number-input>
            </u-form-item>
            <u-form-item
              ref="form_item_10"
              layout="center"
            >
              <template
                #label

              >
                <u-text
                  ref="text_94"
                  text="供应商id"
                ></u-text>
              </template>
              <u-select
                ref="select_3"
                @sync:state="(key, val) => onSyncState('select_3', key, val)"
                :clearable="true"
                placeholder="请选择供应商id"
                :dataSource="__select_3_handleDataSourceLoad()"
                :pageSize="50"
                textField="supplier.name"
                valueField="supplier.id"
                :pagination="true"
                :value.sync="asset.supplierid"
                :emptyValueIsNull="true"
                key="select_3"
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
              ref="form_item_7"
              :rules="[
                                { validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true },
                                { validate: 'maxLength', args: [16777215], message: `不得超过${16777215}个字符`, trigger: 'input+blur' },
                            ]"
              layout="center"
              :span="2"
              :required="true"
            >
              <template
                #label

              >
                <u-text
                  ref="text_91"
                  text="图片"
                ></u-text>
              </template>
              <u-uploader
                ref="uploader_3"
                listType="card"
                accept=".png,.jpg,.jpeg,.gif,.bmp"
                url="/upload"
                urlField="filePath"
                :limit="999"
                maxSize="50MB"
                converter="json"
                :value.sync="asset.picture"
                fileConnectionGroup="lcap_default_connection"
              >
                <template
                  #file-list

                >
                  <i-ico
                    ref="ico_5"
                    class="cw-style-margin"
                    flag="file-icon"
                    name="file-default"
                    icotype="only"
                    style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                  ></i-ico>
                  <u-text
                    ref="text_99"
                    class="cw-style-margin"
                    flag="file-name"
                    text="文件名称"
                    style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; display: inherit"
                  ></u-text>
                  <u-text
                    ref="text_100"
                    class="cw-style-margin"
                    flag="file-size"
                    text="文件大小"
                    style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                  ></u-text>
                  <i-ico
                    ref="ico_6"
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
          </u-form>
        </u-linear-layout>
        <u-linear-layout
          ref="linear_layout_50"
          :wrap="true"
          justify="center"
        >
          <u-button
            ref="button_4"
            color="primary"
            :throttleTime="150"
            text="返 回"
            destination="/oaSys/assetList"
          ></u-button>
          <u-button
            ref="button_1"
            color="primary"
            text="立即提交"
            @click="button_1_click($event)"
          ></u-button>
        </u-linear-layout>
      </u-linear-layout>
    </u-panel>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/createOrSubmitAsset',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      asset: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Asset', undefined),
      assetid: Object.prototype.hasOwnProperty.call(this.$route.query, 'assetid') && !['undefined', 'null'].includes(this.$route.query.assetid) ? window.$genInitFromSchema('nasl.core.Long', this.$route.query.assetid) : undefined,
      select_3_state_page: undefined,
      select_3_state_size: undefined,
    };
  },
  meta: {
    title: '创建/修改资产',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async createOrSubmitAsset_created(event) {
      await this.createOrSubmitAsset_created_created(event);
    },

    async createOrSubmitAsset_created_created() {
      this.$global.frontendVariables.title = '创建资产';
      if (window.$utils.HasValue({ type: 'nasl.core.Long', value: this.assetid })) {
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
              'lcap-calllogic-uuid': '/oaSys/createOrSubmitAsset/0',
            },
          }),
        );
      }
    },

    async button_1_click(event) {
      await this.button_1_click_submit(event);
    },

    async button_1_click_submit() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_1?.validate?.()) || {}).valid) {
        if (window.$utils.HasValue({ type: 'nasl.core.Long', value: this.assetid })) {
          window.$genInitFromSchema(
            'app.dataSources.defaultDS.entities.Asset',
            await window.LcapRequest({
              url: '/api/asset',
              method: 'PUT',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/createOrSubmitAsset/0',
              },
              data: {
                entity: this.asset,
              },
            }),
          );
        } else {
          this.asset.residuallnventory = (this.asset || {}).inventory;
          this.asset.status = '1';

          window.$genInitFromSchema(
            'app.dataSources.defaultDS.entities.Asset',
            await window.LcapRequest({
              url: '/api/asset',
              method: 'POST',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/createOrSubmitAsset/0',
              },

              data: this.asset,
            }),
          );
          window.$destination('/oaSys/assetList', '_self', false);
        }

        await window.$global.showMessage(window.$utils.ToString('nasl.core.String', '创建成功！'));
      }
    },

    genviewMatchExpression_1nvqlxy0() {
      return (() => {
        const it = this.assetid;
        if (window.$global.isEqual(it, undefined)) {
          return '创建资产';
        } else {
          return '资产修改';
        }
      })();
    },

    genviewMatchExpression_1pwi25d1() {
      return (() => {
        const it = this.assetid;
        if (window.$global.isEqual(it, undefined)) {
          return '创建资产';
        } else {
          return '资产修改';
        }
      })();
    },

    __select_3_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_3_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{supplier: app.dataSources.defaultDS.entities.Supplier}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadCreateOrSubmitAssetSelect1Supplier',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/createOrSubmitAsset/0',
            },
            data: {
              page: this.select_3_state_page,
              size: this.select_3_state_size,
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
    await this.createOrSubmitAsset_created();
  },
};
</script>
