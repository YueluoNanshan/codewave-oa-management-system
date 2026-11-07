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
      ref="linear_layout_26"
      direction="vertical"
      :wrap="true"
    >
      <u-linear-layout
        ref="linear_layout_27"
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
              :text="$utils['ToString']('app.enums.CompanyPtype', (policy || {}).type)"
            ></u-text>
          </u-crumb-item>
        </u-crumb>
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_28"
        class="cw-style-margin-left cw-style-margin cw-style-margin-right"
        :wrap="true"
        style="--cw-style-margin-left: 20px; --cw-style-margin-right: 20px; margin-left: 20px; margin-right: 20px"
      >
        <u-linear-layout
          ref="linear_layout_30"
          class="cw-style-padding-left cw-style-padding cw-style-padding-right"
          direction="vertical"
          :wrap="true"
          style="--cw-style-padding-left: 60px; --cw-style-padding-right: 60px; padding-left: 60px; padding-right: 60px"
        >
          <u-linear-layout
            ref="linear_layout_31"
            class="cw-style-font-size"
            :wrap="true"
            justify="center"
            style="--cw-style-font-size: 20px; font-size: 20px"
          >
            <u-text
              ref="text_4"
              class="cw-style-font-size cw-style-color"
              size="large"
              :text="$utils['ToString']('nasl.core.String', (policy || {}).title)"
              style="--cw-style-font-size: 24px; --cw-style-color: #000000; font-size: 24px; color: #000000"
            ></u-text>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_32"
            :wrap="true"
          >
            <u-linear-layout
              ref="linear_layout_34"
              direction="vertical"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_35"
                :wrap="true"
                justify="center"
              >
                <u-text
                  ref="text_11"
                  color="secondary"
                  :text="$utils['ToString']('nasl.core.String', (policy || {}).createdBy)"
                ></u-text>
                <u-text
                  ref="text_12"
                  color="secondary"
                  :text="$utils['ToString']('nasl.core.DateTime', (policy || {}).createdTime)"
                ></u-text>
                <u-text
                  ref="text_13"
                  color="secondary"
                  :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.Long', (policy || {}).pv) + $utils['ToString']('nasl.core.String', `浏览`))"
                ></u-text>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_36"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_38"
                  direction="vertical"
                  :wrap="true"
                >
                  <u-linear-layout
                    ref="linear_layout_39"
                    :wrap="true"
                  >
                    <cw-wang-editor
                      ref="cw_wang_editor_1"
                      class="cw-style-color"
                      :scroll="false"
                      :value.sync="policy.concert"
                      :readOnly="true"
                      style="--cw-style-color: #080808; color: #080808"
                    ></cw-wang-editor>
                  </u-linear-layout>
                  <u-linear-layout
                    ref="linear_layout_40"
                    :wrap="true"
                  >
                    <u-linear-layout
                      ref="linear_layout_42"
                      direction="vertical"
                      :wrap="true"
                    >
                      <u-linear-layout
                        ref="linear_layout_43"
                        :wrap="true"
                      >
                        <u-divider
                          ref="divider_1"
                          dashed="a"
                        ></u-divider>
                      </u-linear-layout>
                      <u-linear-layout
                        ref="linear_layout_44"
                        :wrap="true"
                      >
                        <u-text
                          ref="text_144"
                          class="cw-style-color"
                          size="large"
                          text="相关附件"
                          style="--cw-style-color: #030303; color: #030303"
                        ></u-text>
                      </u-linear-layout>
                      <u-linear-layout
                        ref="linear_layout_45"
                        :wrap="true"
                      >
                        <u-uploader
                          ref="uploader_1"
                          class="cw-style-color"
                          display="inline"
                          url="/upload"
                          urlField="filePath"
                          :limit="999"
                          :fileIconSwitcher="true"
                          :downloadIconSwitcher="true"
                          :fileSize="true"
                          maxSize="50MB"
                          converter="json"
                          :value.sync="policy.accessory"
                          fileConnectionGroup="lcap_default_connection"
                          style="--cw-style-color: #3dd7ab; color: #3dd7ab"
                        >
                          <template
                            #file-list

                          >
                            <i-ico
                              ref="ico_1"
                              class="cw-style-margin"
                              flag="file-icon"
                              name="file-default"
                              icotype="only"
                              style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                            ></i-ico>
                            <u-text
                              ref="text_17"
                              class="cw-style-margin cw-style-color"
                              flag="file-name"
                              text="文件名称"
                              style="--cw-style-margin: 0px 8px 0px 0px; --cw-style-color: #080808; margin: 0px 8px 0px 0px; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; display: inherit; color: #080808"
                            ></u-text>
                            <u-text
                              ref="text_18"
                              class="cw-style-margin cw-style-color"
                              flag="file-size"
                              text="文件大小"
                              style="--cw-style-margin: 0px 8px 0px 0px; --cw-style-color: #080808; margin: 0px 8px 0px 0px; color: #080808"
                            ></u-text>
                            <i-ico
                              ref="ico_2"
                              class="cw-style-margin cw-style-color"
                              flag="download-icon"
                              name="download"
                              icotype="only"
                              style="--cw-style-margin: 0px 8px 0px 0px; --cw-style-color: #080808; margin: 0px 8px 0px 0px; color: #080808"
                            ></i-ico>
                          </template>
                          <template
                            #dragDescription

                          ></template>
                        </u-uploader>
                      </u-linear-layout>
                      <u-linear-layout
                        ref="linear_layout_46"
                        :wrap="true"
                      >
                        <u-divider
                          ref="divider_2"
                          dashed="a"
                        ></u-divider>
                      </u-linear-layout>
                    </u-linear-layout>
                  </u-linear-layout>
                </u-linear-layout>
              </u-linear-layout>
            </u-linear-layout>
          </u-linear-layout>
        </u-linear-layout>
      </u-linear-layout>
    </u-linear-layout>
    <u-linear-layout
      ref="linear_layout_47"
      :wrap="true"
      justify="center"
    >
      <u-text
        ref="text_19"
        color="secondary"
        :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `所有内容最终解释权归“`) + $utils['ToString']('nasl.core.String', (policy || {}).createdBy) + $utils['ToString']('nasl.core.String', `”所属`))"
      ></u-text>
    </u-linear-layout>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/policyDetail',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      policy: window.$genInitFromSchema('app.dataSources.defaultDS.entities.CompanyPolicy', undefined),
      id: Object.prototype.hasOwnProperty.call(this.$route.query, 'id') && !['undefined', 'null'].includes(this.$route.query.id) ? window.$genInitFromSchema('nasl.core.Long', this.$route.query.id) : undefined,
    };
  },
  meta: {
    title: '政策详情',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async policyDetail_created(event) {
      await this.policyDetail_created_created(event);
    },

    async policyDetail_created_created() {
      this.$global.frontendVariables.title = '政策详情';
      this.policy = window.$genInitFromSchema(
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
            'lcap-calllogic-uuid': '/oaSys/policyDetail/0',
          },
        }),
      );
      this.policy.pv = window.$global.add((this.policy || {}).pv, 1);
      window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.CompanyPolicy',
        await window.LcapRequest({
          url: '/api/company-policy',
          method: 'PUT',
          extraConfig: {
            serviceType: 'entity',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/policyDetail/0',
          },
          data: {
            entity: this.policy,
            properties: ['id', 'pv'],
          },
        }),
      );
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.policyDetail_created();
  },
};
</script>
