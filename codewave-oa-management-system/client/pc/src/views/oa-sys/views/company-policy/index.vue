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
      ref="linear_layout_7"
      direction="vertical"
      :wrap="true"
    >
      <u-linear-layout
        ref="linear_layout_8"
        :wrap="true"
      >
        <u-panel
          ref="panel_1"
          class="cw-style-margin-left cw-style-margin cw-style-margin-right"
          style="--cw-style-margin-left: 60px; --cw-style-margin-right: 60px; margin-left: 60px; margin-right: 60px"
        >
          <template
            #title

          ></template>
          <template
            #extra

          ></template>
          <u-absolute-layout
            ref="absolute_layout_1"
            class="cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
            @click="absolute_layout_1_click($event)"
            style="--cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px"
          >
            <u-image
              ref="image_2"
              class="cw-style-width cw-style-height cw-style-text-align cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
              :src="(topPolicy || {}).picture"
              fit="fill"
              style="--cw-style-width: 100%; --cw-style-height: 300px; --cw-style-text-align: center; --cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; width: 100%; left: calc(50% - 0.21063232421875px); top: calc(50% - 0.011566162109375px); right: unset; bottom: unset; z-index: 1; visibility: visible; --constraint-x: center; --constraint-y: center; transform: translate(-50%, -50%); height: 300px; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px; text-align: center"
            ></u-image>
            <u-text
              ref="text_54"
              class="cw-style-font-size cw-style-color"
              :text="$utils['ToString']('nasl.core.String', (topPolicy || {}).title)"
              style="--cw-style-font-size: 16px; --cw-style-color: #ffffff; left: 56.00001525878906px; top: unset; right: unset; bottom: 33.45832824707031px; z-index: 2; visibility: visible; --constraint-x: left; --constraint-y: bottom; transform: none; font-size: 16px; color: #ffffff"
            ></u-text>
          </u-absolute-layout>
          <u-linear-layout
            ref="linear_layout_9"
            class="cw-style-margin-bottom cw-style-margin cw-style-margin-top"
            :wrap="true"
            style="--cw-style-margin-bottom: 16px; --cw-style-margin-top: 20px; margin-top: 20px; margin-bottom: 16px"
          >
            <u-capsules
              ref="capsules_3"
              :value.sync="tab"
              @change="capsules_3_change($event)"
            >
              <u-capsules-group ref="capsules_group_1">
                <u-capsule
                  ref="capsule_8"
                  :value="0"
                >
                  <u-text
                    ref="text_62"
                    text="全部"
                  ></u-text>
                </u-capsule>
              </u-capsules-group>
              <u-capsules-group ref="capsules_group_4">
                <u-capsule
                  ref="capsule_13"
                  :value="1"
                >
                  <u-text
                    ref="text_67"
                    text="公司政策"
                  ></u-text>
                </u-capsule>
              </u-capsules-group>
              <u-capsules-group ref="capsules_group_5">
                <u-capsule
                  ref="capsule_14"
                  :value="2"
                >
                  <u-text
                    ref="text_68"
                    text="公司动态"
                  ></u-text>
                </u-capsule>
              </u-capsules-group>
            </u-capsules>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_10"
            :wrap="true"
          >
            <u-table-view
              ref="tableView_1"
              @sync:state="(key, val) => onSyncState('tableView_1', key, val)"
              :dataSource="__tableView_1_handleDataSourceLoad()"
              dataSchema="LoadCompanyPolicyTableView1Structure"
              valueField="companyPolicy.id"
              :pagination="true"
              :showSizer="true"
              :pageSize="20"
              :pageNumber="1"
              :showHead="false"
              v-dependencies.reload="[]"
              key="tableView_1"
            >
              <u-table-view-column
                ref="table_view_column_2"
                key="table_view_column_2"
              >
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_2_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #cell="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_11_${(current || {}).__nodeKey || (current || {}).index}`"
                    class="cw-style-width"
                    gap="small"
                    style="--cw-style-width: 1200px; width: 1200px"
                  >
                    <u-linear-layout
                      :ref="`linear_layout_18_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-width"
                      direction="horizontal"
                      :wrap="true"
                      style="--cw-style-width: 1150.67px; width: 1150.67px"
                    ></u-linear-layout>
                    <u-linear-layout
                      :ref="`linear_layout_21_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-width"
                      justify="space-between"
                      :wrap="true"
                      style="--cw-style-width: 1130px; width: 1130px"
                    >
                      <u-linear-layout
                        :ref="`linear_layout_22_${(current || {}).__nodeKey || (current || {}).index}`"
                        :wrap="true"
                      >
                        <u-linear-layout
                          :ref="`linear_layout_25_${(current || {}).__nodeKey || (current || {}).index}`"
                          direction="vertical"
                          :wrap="true"
                          @click="linear_layout_25_click($event, current)"
                        >
                          <u-linear-layout
                            :ref="`linear_layout_26_${(current || {}).__nodeKey || (current || {}).index}`"
                            :wrap="true"
                          >
                            <u-text
                              :ref="`text_73_${(current || {}).__nodeKey || (current || {}).index}`"
                              :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `【`) + $utils['ToString']('nasl.core.String', $utils['EnumItemToText']('app.enums.CompanyPtype', (((current || {}).item || {}).companyPolicy || {}).type)) + $utils['ToString']('nasl.core.String', `】`) + $utils['ToString']('nasl.core.String', (((current || {}).item || {}).companyPolicy || {}).title))"
                            ></u-text>
                          </u-linear-layout>
                          <u-linear-layout
                            :ref="`linear_layout_27_${(current || {}).__nodeKey || (current || {}).index}`"
                            :wrap="true"
                          >
                            <u-text
                              :ref="`text_74_${(current || {}).__nodeKey || (current || {}).index}`"
                              :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).companyPolicy || {}).descition)"
                            ></u-text>
                          </u-linear-layout>
                          <u-linear-layout
                            :ref="`linear_layout_28_${(current || {}).__nodeKey || (current || {}).index}`"
                            :wrap="true"
                          >
                            <u-text
                              :ref="`text_75_${(current || {}).__nodeKey || (current || {}).index}`"
                              :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).companyPolicy || {}).createdBy)"
                            ></u-text>
                            <u-text
                              :ref="`text_76_${(current || {}).__nodeKey || (current || {}).index}`"
                              :text="$utils['ToString']('nasl.core.String', $utils['FormatDateTime']((((current || {}).item || {}).companyPolicy || {}).createdTime, `yyyy-MM-dd`, `global`))"
                            ></u-text>
                            <u-text
                              :ref="`text_77_${(current || {}).__nodeKey || (current || {}).index}`"
                              :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.Long', (((current || {}).item || {}).companyPolicy || {}).pv) + $utils['ToString']('nasl.core.String', `浏览`))"
                            ></u-text>
                          </u-linear-layout>
                        </u-linear-layout>
                      </u-linear-layout>
                      <u-linear-layout
                        :ref="`linear_layout_23_${(current || {}).__nodeKey || (current || {}).index}`"
                        :wrap="true"
                      >
                        <u-image
                          :ref="`image_3_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-width cw-style-height cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                          :src="(((current || {}).item || {}).companyPolicy || {}).picture"
                          fit="contain"
                          style="--cw-style-width: 150px; --cw-style-height: 100px; --cw-style-border-top-left-radius: 6px; --cw-style-border-top-right-radius: 6px; --cw-style-border-bottom-left-radius: 6px; --cw-style-border-bottom-right-radius: 6px; width: 150px; height: 100px; border-top-left-radius: 6px; border-bottom-left-radius: 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px"
                        ></u-image>
                      </u-linear-layout>
                    </u-linear-layout>
                    <u-popup-combination
                      :ref="`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`"
                      display="inline"
                      v-if="$auth.has('/oaSys/companyPolicy/popup_combination_1')"
                    >
                      <template
                        #reference

                      >
                        <i-ico
                          :ref="`ico_3_${(current || {}).__nodeKey || (current || {}).index}`"
                          name="more"
                          icotype="only"
                        >
                          <u-text
                            :ref="`text_444_${(current || {}).__nodeKey || (current || {}).index}`"
                            text="图标"
                          ></u-text>
                        </i-ico>
                      </template>
                      <u-linear-layout
                        :ref="`linear_layout_36_${(current || {}).__nodeKey || (current || {}).index}`"
                        direction="vertical"
                        :wrap="true"
                      >
                        <u-linear-layout
                          :ref="`linear_layout_37_${(current || {}).__nodeKey || (current || {}).index}`"
                          :wrap="true"
                        >
                          <u-link
                            :ref="`link_1_${(current || {}).__nodeKey || (current || {}).index}`"
                            text="修改"
                            :destination="`/oaSys/createPolicy${$toQueryString({ id: (((current || {}).item || {}).companyPolicy || {}).id })}`"
                          ></u-link>
                        </u-linear-layout>
                        <u-linear-layout
                          :ref="`linear_layout_38_${(current || {}).__nodeKey || (current || {}).index}`"
                          :wrap="true"
                        >
                          <u-link
                            :ref="`link_2_${(current || {}).__nodeKey || (current || {}).index}`"
                            text="删除"
                            @click="link_2_click($event, current)"
                          ></u-link>
                        </u-linear-layout>
                      </u-linear-layout>
                    </u-popup-combination>
                  </u-linear-layout>
                </template>
                <template
                  #title

                >
                  <u-text
                    ref="text_71"
                    text="标题"
                  ></u-text>
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
        </u-panel>
      </u-linear-layout>
    </u-linear-layout>
    <u-modal
      ref="modal_1"
      icon="warning"
      :is-heading-slot-empty="true"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_39"
          justify="center"
        >
          <u-button
            ref="button_2"
            color="primary"
            text="确 定"
            @click="button_2_click($event)"
          ></u-button>
          <u-button
            ref="button_3"
            text="取 消"
            @click="button_3_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-text
          ref="text_445"
          text="确定是否删除？"
        ></u-text>
        <u-text
          ref="text_447"
          text="删除后无法恢复"
          display="block"
        ></u-text>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_446"
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
  name: '/oaSys/companyPolicy',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      tab: 0,
      topPolicy: window.$genInitFromSchema('app.dataSources.defaultDS.entities.CompanyPolicy', undefined),
      deleteid: undefined,
      tableView_1_state_page: undefined,
      tableView_1_state_size: undefined,
      tableView_1_state_sort: undefined,
      tableView_1_state_order: undefined,
    };
  },
  meta: {
    title: '政策/动态',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async companyPolicy_created(event) {
      await this.companyPolicy_created_created(event);
    },

    async companyPolicy_created_created() {
      this.$global.frontendVariables.title = '政策/动态';
      this.topPolicy = window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.CompanyPolicy',
        await window.LcapRequest({
          url: '/api/lcplogics/loadTopPolicy',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/companyPolicy/0',
          },
          data: {},
        }),
      );
    },

    async absolute_layout_1_click(event) {
      await this.absolute_layout_1_click_click(event);
    },

    async absolute_layout_1_click_click() {
      window.$destination(`/oaSys/policyDetail${window.$toQueryString({ id: (this.topPolicy || {}).id })}`, '_self', false);
    },

    async button_2_click(event) {
      await this.button_2_click_click(event);
    },

    async button_2_click_click() {
      await window.LcapRequest({
        url: '/api/company-policy',
        method: 'DELETE',
        extraConfig: {
          serviceType: 'entity',
        },
        params: {
          id: this.deleteid,
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/companyPolicy/0',
        },
      });
      await this.$refs.tableView_1?.reload?.();
      await this.$refs.modal_1?.close?.();
    },

    async button_3_click(event) {
      await this.button_3_click_click(event);
    },

    async button_3_click_click() {
      await this.$refs.modal_1?.close?.();
    },

    async capsules_3_change(event) {
      await this.capsules_3_change_change(event);
    },

    async capsules_3_change_change() {
      await this.$refs.tableView_1?.reload?.();
    },

    async linear_layout_25_click(event, current) {
      await this.linear_layout_25_click_click(event, current);
    },

    async linear_layout_25_click_click(event, current) {
      window.$destination(`/oaSys/policyDetail${window.$toQueryString({ id: (((current || {}).item || {}).companyPolicy || {}).id })}`, '_self', false);
    },

    async link_2_click(event, current) {
      await this.link_2_click_click(event, current);
    },

    async link_2_click_click(event, current) {
      this.deleteid = (((current || {}).item || {}).companyPolicy || {}).id;
      await this.$refs.modal_1?.open?.();
    },

    __tableView_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tableView_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{companyPolicy: app.dataSources.defaultDS.entities.CompanyPolicy}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadCompanyPolicyTableView1',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/companyPolicy/0',
            },
            data: {
              page: this.tableView_1_state_page,
              size: this.tableView_1_state_size,
              sort: this.tableView_1_state_sort,
              order: this.tableView_1_state_order,
              tab: this.tab,
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
    await this.companyPolicy_created();
  },
};
</script>
