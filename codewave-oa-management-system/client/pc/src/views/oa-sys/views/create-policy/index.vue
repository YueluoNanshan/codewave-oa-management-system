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
        ref="linear_layout_3"
        :wrap="true"
      >
        <u-crumb
          ref="crumb_1"
          :icon="false"
        >
          <u-crumb-item
            ref="crumb_item_1"
            icon="home"
            destination="/oaSys/companyPolicy"
          >
            <u-text
              ref="text_1"
              text="政策管理"
            ></u-text>
          </u-crumb-item>
          <u-crumb-item
            ref="crumb_item_2"
            icon="user"
            :disabled="true"
          >
            <u-text
              ref="text_2"
              :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1vxsfhy1())"
            ></u-text>
          </u-crumb-item>
        </u-crumb>
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_4"
        :wrap="true"
      >
        <u-panel ref="panel_1">
          <template
            #title

          >
            <u-text
              ref="text_4"
              class="cw-style-color"
              :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1pnr17w1())"
              style="--cw-style-color: #000000; color: #000000"
            ></u-text>
          </template>
          <template
            #extra

          ></template>
          <u-linear-layout
            ref="linear_layout_6"
            direction="vertical"
            :wrap="true"
          >
            <u-linear-layout
              ref="linear_layout_7"
              :wrap="true"
            >
              <u-form
                ref="form_4"
                key="form_4"
              >
                <u-form-item
                  ref="form_item_26"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_28"
                      text="发布人"
                    ></u-text>
                  </template>
                  <u-text
                    ref="text_36"
                    :text="$utils['ToString']('nasl.core.String', ($global.userInfo || {}).UserName)"
                  ></u-text>
                </u-form-item>
                <u-form-item
                  ref="form_item_27"
                  layout="center"
                  :required="true"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_29"
                      text="标题"
                    ></u-text>
                  </template>
                  <u-input
                    ref="input_18"
                    :value.sync="companyPolicy.title"
                    placeholder="请输入标题"
                    :emptyValueIsNull="true"
                    width="large"
                  ></u-input>
                </u-form-item>
                <u-form-item
                  ref="form_item_28"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_30"
                      text="副标题"
                    ></u-text>
                  </template>
                  <u-input
                    ref="input_19"
                    :value.sync="companyPolicy.descition"
                    placeholder="请输入副标题"
                    :emptyValueIsNull="true"
                    width="large"
                  ></u-input>
                </u-form-item>
                <u-form-item
                  ref="form_item_31"
                  layout="center"
                  :required="true"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_33"
                      text="内容类型"
                    ></u-text>
                  </template>
                  <u-select
                    ref="select_7"
                    :clearable="true"
                    :value.sync="companyPolicy.type"
                    placeholder="请选择政策类型"
                    :dataSource="$utils['EnumToList']({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.enums', typeName: 'CompanyPtype' })"
                    :emptyValueIsNull="true"
                    width="large"
                    v-dependencies.reload="[]"
                    key="select_7"
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
                  ref="form_item_33"
                  layout="center"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_35"
                      text="是否置顶"
                    ></u-text>
                  </template>
                  <u-radios
                    ref="radios_4"
                    :value.sync="companyPolicy.ifTop"
                  >
                    <template
                      #item=""

                    ></template>
                    <u-radio
                      ref="radio_5"
                      :label="true"
                    >
                      <template
                        #item

                      >
                        <u-text
                          ref="text_52"
                          text="是"
                        ></u-text>
                      </template>
                    </u-radio>
                    <u-radio
                      ref="radio_6"
                      :label="false"
                    >
                      <template
                        #item

                      >
                        <u-text
                          ref="text_53"
                          text="否"
                        ></u-text>
                      </template>
                    </u-radio>
                  </u-radios>
                </u-form-item>
                <u-form-item
                  ref="form_item_29"
                  layout="center"
                  :required="true"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_31"
                      text="内容"
                    ></u-text>
                  </template>
                  <cw-wang-editor
                    ref="cw_wang_editor_2"
                    :scroll="true"
                    :value.sync="companyPolicy.concert"
                  ></cw-wang-editor>
                </u-form-item>
                <u-form-item
                  ref="form_item_32"
                  layout="center"
                  :required="true"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_34"
                      text="封面"
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
                    :value.sync="companyPolicy.picture"
                    fileConnectionGroup="lcap_default_connection"
                  >
                    <template
                      #file-list

                    >
                      <i-ico
                        ref="ico_4"
                        class="cw-style-margin"
                        flag="file-icon"
                        name="file-default"
                        icotype="only"
                        style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                      ></i-ico>
                      <u-text
                        ref="text_40"
                        class="cw-style-margin"
                        flag="file-name"
                        text="文件名称"
                        style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; display: inherit"
                      ></u-text>
                      <u-text
                        ref="text_41"
                        class="cw-style-margin"
                        flag="file-size"
                        text="文件大小"
                        style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                      ></u-text>
                      <i-ico
                        ref="ico_5"
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
                  ref="form_item_30"
                  layout="center"
                  :required="true"
                >
                  <template
                    #label

                  >
                    <u-text
                      ref="text_32"
                      text="附件"
                    ></u-text>
                  </template>
                  <u-uploader
                    ref="uploader_3"
                    display="inline"
                    url="/upload"
                    urlField="filePath"
                    :limit="999"
                    :fileIconSwitcher="true"
                    :downloadIconSwitcher="true"
                    :fileSize="true"
                    maxSize="50MB"
                    converter="json"
                    :value.sync="companyPolicy.accessory"
                    fileConnectionGroup="lcap_default_connection"
                    :multiple="true"
                  >
                    <template
                      #file-list

                    >
                      <i-ico
                        ref="ico_6"
                        class="cw-style-margin"
                        flag="file-icon"
                        name="file-default"
                        icotype="only"
                        style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                      ></i-ico>
                      <u-text
                        ref="text_42"
                        class="cw-style-margin cw-style-color"
                        flag="file-name"
                        text="文件名称"
                        style="--cw-style-margin: 0px 8px 0px 0px; --cw-style-color: #010101; margin: 0px 8px 0px 0px; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; display: inherit; color: #010101"
                      ></u-text>
                      <u-text
                        ref="text_43"
                        class="cw-style-margin cw-style-color"
                        flag="file-size"
                        text="文件大小"
                        style="--cw-style-margin: 0px 8px 0px 0px; --cw-style-color: #010101; margin: 0px 8px 0px 0px; color: #010101"
                      ></u-text>
                      <i-ico
                        ref="ico_7"
                        class="cw-style-margin"
                        flag="download-icon"
                        name="download"
                        icotype="only"
                        style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                      ></i-ico>
                    </template>
                    <u-button
                      ref="button_9"
                      color="primary"
                      icon="upload"
                      text="上传"
                    ></u-button>
                    <template
                      #dragDescription

                    ></template>
                  </u-uploader>
                </u-form-item>
              </u-form>
            </u-linear-layout>
            <u-linear-layout
              ref="linear_layout_8"
              class="cw-style-text-align"
              :wrap="true"
              style="--cw-style-text-align: center; text-align: center"
            >
              <u-button
                ref="button_6"
                text="取 消"
                color="primary_secondary"
                :throttleTime="150"
                destination="/oaSys/companyPolicy"
              ></u-button>
              <u-button
                ref="button_7"
                :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1i9o2yi1())"
                color="primary"
                :throttleTime="150"
                @click="button_7_click($event)"
              ></u-button>
            </u-linear-layout>
          </u-linear-layout>
        </u-panel>
      </u-linear-layout>
    </u-linear-layout>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/createPolicy',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      companyPolicy: window.$genInitFromSchema('app.dataSources.defaultDS.entities.CompanyPolicy', undefined),
      id: Object.prototype.hasOwnProperty.call(this.$route.query, 'id') && !['undefined', 'null'].includes(this.$route.query.id) ? window.$genInitFromSchema('nasl.core.Long', this.$route.query.id) : undefined,
    };
  },
  meta: {
    title: '创建政策/动态',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async createPolicy_created(event) {
      await this.createPolicy_created_created(event);
    },

    async createPolicy_created_created() {
      this.$global.frontendVariables.title = '创建政策/动态';
      if (window.$utils.HasValue({ type: 'nasl.core.Long', value: this.id })) {
        this.companyPolicy = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.CompanyPolicy',
          await window.LcapRequest({
            url: '/api/company-policy',
            method: 'GET',
            extraConfig: {
              serviceType: 'entity',
            },
            params: {
              id: this.id,
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/createPolicy/0',
            },
          }),
        );
      }
    },

    async button_7_click(event) {
      await this.button_7_click_click(event);
    },

    async button_7_click_click() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_4?.validate?.(undefined, undefined)) || {}).valid) {
        if (window.$utils.HasValue({ type: 'nasl.core.Long', value: this.id })) {
          if ((this.companyPolicy || {}).ifTop) {
            await window.LcapRequest({
              url: '/api/company-policy/by',
              method: 'PUT',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/createPolicy/1',
              },
              data: {
                filter: {
                  concept: 'Function',
                  name: 'filter',
                  returnExpression: this.$resolveRequestData({ concept: 'BinaryExpression', operator: '==', left: { concept: 'MemberExpression', object: { concept: 'Identifier', name: '_', folded: false, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'CompanyPolicy' } }, property: { concept: 'Identifier', name: 'ifTop', folded: false, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Boolean', inferred: null, ruleMap: null, sync: null, changedTime: null, _changedTime: null, name: null, composedBy: null, typeAnnotation: null, typeParams: null, typeArguments: null, returnType: null, properties: null } } }, right: { concept: 'BooleanLiteral', value: 'true' } }),
                },
                entity: await (async () => {
                  const obj = window.$genInitFromSchema('app.dataSources.defaultDS.entities.CompanyPolicy', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'CompanyPolicy' }));
                  obj.ifTop = false;
                  return obj;
                })(),
                properties: ['id', 'ifTop'],
              },
            });
          }
          window.$genInitFromSchema(
            'app.dataSources.defaultDS.entities.CompanyPolicy',
            await window.LcapRequest({
              url: '/api/company-policy',
              method: 'PUT',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/createPolicy/0',
              },
              data: {
                entity: this.companyPolicy,
              },
            }),
          );
        } else {
          this.companyPolicy.pv = 0;
          this.companyPolicy.createdBy = (this.$global.userInfo || {}).UserName;

          if ((this.companyPolicy || {}).ifTop) {
            await window.LcapRequest({
              url: '/api/company-policy/by',
              method: 'PUT',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/createPolicy/0',
              },
              data: {
                filter: {
                  concept: 'Function',
                  name: 'filter',
                  returnExpression: this.$resolveRequestData({ concept: 'BinaryExpression', name: null, operator: '==', left: { concept: 'MemberExpression', name: null, object: { concept: 'Identifier', namespace: null, name: '_', label: null, description: null, folded: false, breakpoint: null, changedTime: null, _changedTime: null, composedBy: null, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'CompanyPolicy' } }, property: { concept: 'Identifier', namespace: null, name: 'ifTop', label: null, description: null, folded: false, breakpoint: null, changedTime: null, _changedTime: null, composedBy: null, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Boolean', inferred: null, ruleMap: null, sync: null, changedTime: null, _changedTime: null, name: null, composedBy: null, typeAnnotation: null, typeParams: null, typeArguments: null, returnType: null, properties: null } } }, right: { concept: 'BooleanLiteral', name: null, value: 'true' } }),
                },
                entity: await (async () => {
                  const obj = window.$genInitFromSchema('app.dataSources.defaultDS.entities.CompanyPolicy', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'CompanyPolicy', inferred: null, ruleMap: null, sync: null, changedTime: null, _changedTime: null, name: null, composedBy: null, typeAnnotation: null, typeParams: null, typeArguments: null, returnType: null, properties: null }));
                  obj.ifTop = false;
                  return obj;
                })(),
                properties: ['id', 'ifTop'],
              },
            });
          }
          window.$genInitFromSchema(
            'app.dataSources.defaultDS.entities.CompanyPolicy',
            await window.LcapRequest({
              url: '/api/company-policy',
              method: 'POST',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/createPolicy/0',
              },

              data: this.companyPolicy,
            }),
          );
        }

        window.$destination('/oaSys/companyPolicy', '_self', false);
      }
    },

    genviewMatchExpression_1vxsfhy1() {
      return (() => {
        const it = this.id;
        if (window.$global.isEqual(it, undefined)) {
          return '发布政策/动态';
        } else {
          return '修改政策/动态';
        }
      })();
    },

    genviewMatchExpression_1pnr17w1() {
      return (() => {
        const it = this.id;
        if (window.$global.isEqual(it, undefined)) {
          return '发布政策/动态';
        } else {
          return '修改政策/动态';
        }
      })();
    },

    genviewMatchExpression_1i9o2yi1() {
      return (() => {
        const it = this.id;
        if (window.$global.isEqual(it, undefined)) {
          return '确认发布';
        } else {
          return '确认修改';
        }
      })();
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.createPolicy_created();
  },
};
</script>
