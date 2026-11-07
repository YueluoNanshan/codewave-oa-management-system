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
      ref="linear_layout_40"
      direction="vertical"
      :wrap="true"
    >
      <u-linear-layout
        ref="linear_layout_41"
        :wrap="true"
      ></u-linear-layout>
      <u-linear-layout
        ref="linear_layout_42"
        :wrap="true"
      >
        <u-linear-layout
          ref="linear_layout_44"
          direction="horizontal"
          :wrap="true"
        >
          <u-panel ref="panel_1">
            <template
              #title

            ></template>
            <template
              #extra

            ></template>
            <u-linear-layout
              ref="linear_layout_50"
              direction="vertical"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_51"
                :wrap="true"
              >
                <i-ico
                  ref="ico_5"
                  class="cw-style-font-size cw-style-color"
                  name="left-arrow"
                  icotype="only"
                  destination="/oaSys/homePage"
                  style="--cw-style-font-size: 30px; --cw-style-color: #0b0b0b; font-size: 30px; color: #0b0b0b"
                >
                  <u-text
                    ref="text_453"
                    text="图标"
                  ></u-text>
                </i-ico>
                <u-text
                  ref="text_454"
                  key="text_454"
                  class="cw-style-font-size cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', (leaveProcess || {}).title)"
                  size="large"
                  v-if="boolean1"
                  style="--cw-style-font-size: 18px; --cw-style-color: #0b0b0b; font-size: 18px; color: #0b0b0b"
                ></u-text>
                <u-input
                  ref="input_1"
                  key="input_1"
                  placeholder="请输入"
                  :emptyValueIsNull="true"
                  :value.sync="title"
                  width="large"
                  v-if="!boolean1"
                ></u-input>
                <i-ico
                  ref="ico_7"
                  key="ico_7"
                  class="cw-style-font-size cw-style-color"
                  name="edit"
                  icotype="only"
                  @click="ico_7_click($event)"
                  v-if="boolean1"
                  style="--cw-style-font-size: 26px; --cw-style-color: #0b0b0b; font-size: 26px; color: #0b0b0b"
                >
                  <u-text
                    ref="text_456"
                    text="图标"
                  ></u-text>
                </i-ico>
                <i-ico
                  ref="ico_11"
                  key="ico_11"
                  class="cw-style-font-size cw-style-color"
                  name="correct"
                  icotype="only"
                  @click="ico_11_click($event)"
                  v-if="!boolean1"
                  style="--cw-style-font-size: 26px; --cw-style-color: #0b0b0b; font-size: 26px; color: #0b0b0b"
                >
                  <u-text
                    ref="text_460"
                    text="图标"
                  ></u-text>
                </i-ico>
                <i-ico
                  ref="ico_12"
                  key="ico_12"
                  class="cw-style-font-size cw-style-color"
                  name="qingkong"
                  icotype="only"
                  @click="ico_12_click($event)"
                  v-if="!boolean1"
                  style="--cw-style-font-size: 26px; --cw-style-color: #0b0b0b; font-size: 26px; color: #0b0b0b"
                >
                  <u-text
                    ref="text_461"
                    text="图标"
                  ></u-text>
                </i-ico>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_52"
                :wrap="true"
              >
                <u-selectable-steps
                  ref="selectable_steps_1"
                  class="cw-style-width"
                  :readonly="true"
                  style="--cw-style-width: 750px; width: 750px"
                >
                  <u-selectable-step
                    ref="selectable_step_1"
                    status="passed"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_462"
                        text="申请人"
                      ></u-text>
                    </template>
                    <template
                      #desc

                    ></template>
                  </u-selectable-step>
                  <u-selectable-step ref="selectable_step_2">
                    <template
                      #title

                    >
                      <u-text
                        ref="text_463"
                        text="部门管理员"
                      ></u-text>
                    </template>
                    <template
                      #desc

                    ></template>
                  </u-selectable-step>
                  <u-selectable-step ref="selectable_step_3">
                    <template
                      #title

                    >
                      <u-text
                        ref="text_464"
                        text="超级管理员"
                      ></u-text>
                    </template>
                    <template
                      #desc

                    ></template>
                  </u-selectable-step>
                  <template
                    #title=""

                  ></template>
                  <template
                    #desc=""

                  ></template>
                </u-selectable-steps>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_56"
                :wrap="true"
              ></u-linear-layout>
            </u-linear-layout>
          </u-panel>
        </u-linear-layout>
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_43"
        :wrap="true"
      >
        <u-panel ref="panel_2">
          <template
            #title

          ></template>
          <template
            #extra

          ></template>
          <u-linear-layout
            ref="linear_layout_58"
            direction="vertical"
            :wrap="true"
          >
            <u-linear-layout
              ref="linear_layout_60"
              :wrap="true"
            >
              <u-collapse ref="collapse_1">
                <u-collapse-item
                  ref="collapse_item_1"
                  expanded=""
                  style="--collapse-item-fill-background: #ffffff; --collapse-border-color: #ffffff"
                >
                  <template
                    #title

                  >
                    <u-text
                      ref="text_473"
                      text="申请人信息"
                    ></u-text>
                  </template>
                  <u-grid-layout ref="grid_layout_2">
                    <u-grid-layout-row
                      ref="grid_layout_row_2"
                      :repeat="24"
                    >
                      <u-grid-layout-column
                        ref="grid_layout_column_4"
                        :span="12"
                        :wrap="true"
                      >
                        <u-text
                          ref="text_480"
                          class="cw-style-color"
                          :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `员工名称：`) + $utils['ToString']('nasl.core.String', ($global.userInfo || {}).UserName))"
                          style="--cw-style-color: #000000; color: #000000"
                        ></u-text>
                      </u-grid-layout-column>
                    </u-grid-layout-row>
                  </u-grid-layout>
                </u-collapse-item>
              </u-collapse>
            </u-linear-layout>
            <u-linear-layout
              ref="linear_layout_61"
              :wrap="true"
            >
              <u-collapse ref="collapse_2">
                <u-collapse-item
                  ref="collapse_item_4"
                  expanded=""
                  :disabled="true"
                  style="--collapse-item-fill-background: #b7b7b7"
                >
                  <template
                    #title

                  >
                    <u-text
                      ref="text_486"
                      text="申请内容"
                    ></u-text>
                  </template>
                  <u-alert
                    ref="alert_2"
                    class="cw-style-width cw-style-padding-bottom cw-style-padding cw-style-margin-bottom cw-style-margin cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                    type="info"
                    :showIcon="false"
                    :bordered="true"
                    style="--cw-style-width: 475px; --cw-style-padding-bottom: 2px; --cw-style-margin-bottom: 10px; --cw-style-border-top-left-radius: 6px; --cw-style-border-top-right-radius: 6px; --cw-style-border-bottom-left-radius: 6px; --cw-style-border-bottom-right-radius: 6px; width: 475px; --alert-background-color-info: #f5e79aa1; --alert-color-info: #fff58a; border-top-left-radius: 6px; border-bottom-left-radius: 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px; padding-bottom: 2px; margin-bottom: 10px"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_503"
                        text="温馨提示：如对考勤申请有任何问题或者疑问，可与部门考勤员联系。"
                      ></u-text>
                    </template>
                  </u-alert>
                  <u-form
                    ref="form_3"
                    key="form_3"
                  >
                    <u-form-item
                      ref="form_item_15"
                      :required="true"
                    >
                      <template
                        #label

                      >
                        <u-text
                          ref="text_497"
                          text="申请类型"
                        ></u-text>
                      </template>
                      <u-select
                        ref="select_1"
                        placeholder="请选择"
                        :pagination="true"
                        :pageSize="50"
                        :value.sync="leaveProcess.type"
                        :dataSource="$utils['EnumToList']({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.enums', typeName: 'LeavePtype', changedTime: 1766486741309 })"
                        v-dependencies.reload="[]"
                        sorting="{ field: undefined, order: 'asc' }"
                        textField="请选择请假类型"
                        key="select_1"
                      >
                        <template
                          #option=""

                        ></template>
                        <template
                          #renderFooter

                        ></template>
                        <u-select-item
                          ref="select_item_5"
                          value="0"
                        >
                          <u-text
                            ref="text_516"
                            text="病假"
                          ></u-text>
                        </u-select-item>
                        <u-select-item
                          ref="select_item_6"
                          value="1"
                        >
                          <u-text
                            ref="text_517"
                            text="年假"
                          ></u-text>
                        </u-select-item>
                        <u-select-item
                          ref="select_item_7"
                          value="2"
                        >
                          <u-text
                            ref="text_518"
                            text="事假"
                          ></u-text>
                        </u-select-item>
                      </u-select>
                    </u-form-item>
                    <u-form-item ref="form_item_17">
                      <template
                        #label

                      ></template>
                      <u-alert
                        ref="alert_3"
                        class="cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                        type="info"
                        :showIcon="false"
                        :bordered="true"
                        style="--cw-style-border-top-left-radius: 6px; --cw-style-border-top-right-radius: 6px; --cw-style-border-bottom-left-radius: 6px; --cw-style-border-bottom-right-radius: 6px; --alert-background-color-info: #f5e79aa1; --alert-color-info: #fff58a; border-top-left-radius: 6px; border-bottom-left-radius: 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px"
                      >
                        <template
                          #title

                        >
                          <u-text
                            ref="text_506"
                            :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0j5j5t10())"
                          ></u-text>
                        </template>
                      </u-alert>
                    </u-form-item>
                    <u-form-item
                      ref="form_item_18"
                      :required="true"
                    >
                      <template
                        #label

                      >
                        <u-text
                          ref="text_500"
                          text="开始时间"
                        ></u-text>
                      </template>
                      <u-linear-layout
                        ref="linear_layout_62"
                        direction="horizontal"
                        :wrap="true"
                      >
                        <u-grid-layout ref="grid_layout_4">
                          <u-grid-layout-row
                            ref="grid_layout_row_4"
                            :repeat="24"
                          >
                            <u-grid-layout-column
                              ref="grid_layout_column_9"
                              :span="4"
                              :wrap="true"
                            >
                              <u-date-picker
                                ref="date_picker_2"
                                :emptyValueIsNull="true"
                                :value.sync="leaveProcess.startDate"
                                placeholder="开始日期"
                                @blur="date_picker_2_blur($event)"
                              ></u-date-picker>
                            </u-grid-layout-column>
                            <u-grid-layout-column
                              ref="grid_layout_column_10"
                              :span="4"
                              :wrap="true"
                            >
                              <u-time-picker
                                ref="time_picker_1"
                                :value.sync="leaveProcess.startTime"
                                placeholder="开始时间"
                                minUnit="minute"
                                minTime="09:29:00"
                                maxTime="17:30:00"
                              ></u-time-picker>
                            </u-grid-layout-column>
                          </u-grid-layout-row>
                        </u-grid-layout>
                      </u-linear-layout>
                    </u-form-item>
                    <u-form-item
                      ref="form_item_19"
                      :required="true"
                    >
                      <template
                        #label

                      >
                        <u-text
                          ref="text_501"
                          text="结束时间"
                        ></u-text>
                      </template>
                      <u-grid-layout ref="grid_layout_6">
                        <u-grid-layout-row
                          ref="grid_layout_row_6"
                          :repeat="24"
                        >
                          <u-grid-layout-column
                            ref="grid_layout_column_14"
                            :span="4"
                            :wrap="true"
                          >
                            <u-date-picker
                              ref="date_picker_3"
                              :emptyValueIsNull="true"
                              :value.sync="leaveProcess.endDate"
                              placeholder="结束日期"
                            ></u-date-picker>
                          </u-grid-layout-column>
                          <u-grid-layout-column
                            ref="grid_layout_column_15"
                            :span="4"
                            :wrap="true"
                          >
                            <u-time-picker
                              ref="time_picker_2"
                              :value.sync="leaveProcess.endTime"
                              placeholder="结束时间"
                              minUnit="minute"
                              maxTime="17:30:"
                              minTime="09:29:00"
                              @change="time_picker_2_change($event)"
                            ></u-time-picker>
                          </u-grid-layout-column>
                        </u-grid-layout-row>
                      </u-grid-layout>
                    </u-form-item>
                    <u-form-item
                      ref="form_item_20"
                      :required="true"
                    >
                      <template
                        #label

                      >
                        <u-text
                          ref="text_502"
                          text="总时长"
                        ></u-text>
                      </template>
                      <u-number-input
                        ref="number_input_1"
                        :decimalPlacesOmitZero="false"
                        :value.sync="leaveProcess.leaveTime"
                        :decimalPlacesValue="1"
                        unitType="suffix"
                        unitValue="小时"
                        :hideButtons="true"
                      ></u-number-input>
                    </u-form-item>
                    <u-form-item
                      ref="form_item_21"
                      :required="true"
                    >
                      <template
                        #label

                      >
                        <u-text
                          ref="text_504"
                          text="申请原因"
                        ></u-text>
                      </template>
                      <u-textarea
                        ref="textarea_1"
                        placeholder="请输入请假原因"
                        limitPosition="outside"
                        :emptyValueIsNull="true"
                        :value.sync="leaveProcess.reason"
                        size="large"
                      ></u-textarea>
                    </u-form-item>
                    <u-form-item ref="form_item_22">
                      <template
                        #label

                      >
                        <u-text
                          ref="text_505"
                          text="相关文档"
                        ></u-text>
                      </template>
                      <u-uploader
                        ref="uploader_1"
                        display="inline"
                        url="/upload"
                        urlField="filePath"
                        :limit="999"
                        :fileIconSwitcher="true"
                        :downloadIconSwitcher="true"
                        :fileSize="true"
                        maxSize="1GB"
                        converter="json"
                        :value.sync="leaveProcess.accessory"
                        fileConnectionGroup="lcap_default_connection"
                        :multiple="true"
                        accept=""
                      >
                        <template
                          #file-list

                        >
                          <i-ico
                            ref="ico_13"
                            class="cw-style-margin"
                            flag="file-icon"
                            name="file-default"
                            icotype="only"
                            style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                          ></i-ico>
                          <u-text
                            ref="text_512"
                            class="cw-style-margin"
                            flag="file-name"
                            text="文件名称"
                            style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; display: inherit"
                          ></u-text>
                          <u-text
                            ref="text_513"
                            class="cw-style-margin"
                            flag="file-size"
                            text="文件大小"
                            style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                          ></u-text>
                          <i-ico
                            ref="ico_14"
                            class="cw-style-margin"
                            flag="download-icon"
                            name="download"
                            icotype="only"
                            style="--cw-style-margin: 0px 8px 0px 0px; margin: 0px 8px 0px 0px"
                          ></i-ico>
                        </template>
                        <u-button
                          ref="button_5"
                          color="primary"
                          icon="upload"
                          text="上传附件"
                        ></u-button>
                        <template
                          #dragDescription

                        ></template>
                      </u-uploader>
                    </u-form-item>
                  </u-form>
                </u-collapse-item>
              </u-collapse>
            </u-linear-layout>
          </u-linear-layout>
        </u-panel>
      </u-linear-layout>
    </u-linear-layout>
    <u-linear-layout
      ref="linear_layout_66"
      direction="horizontal"
      mode="block"
      justify="center"
    >
      <u-button
        ref="button_6"
        color="primary"
        :throttleTime="150"
        text="提 交"
        @click="button_6_click($event)"
      ></u-button>
      <u-button
        ref="button_7"
        color="primary_secondary"
        :throttleTime="150"
        text="取 消"
        destination="/oaSys/homePage"
      ></u-button>
    </u-linear-layout>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/newProcess',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      leaveProcess: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LeaveProcess', undefined),
      title: undefined,
      boolean1: true,
      department: undefined,
      starttype: window.$genInitFromSchema('app.enums.LeavePtype', '2'),
    };
  },
  meta: {
    title: '新建流程',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async newProcess_created(event) {
      await this.newProcess_created_created(event);
    },

    async newProcess_created_created() {
      this.$global.frontendVariables.title = '新建流程';
      this.leaveProcess.type = this.starttype;
      this.leaveProcess.title = window.$utils.ToString('nasl.core.String', '考勤申请-') + window.$utils.ToString('nasl.core.String', (this.$global.userInfo || {}).UserName) + window.$utils.ToString('nasl.core.String', '-') + window.$utils.ToString('nasl.core.Time', window.$utils.CurrTime('global'));
      this.department = await window.LcapRequest({
        url: '/api/lcplogics/loadDepartment',
        method: 'POST',
        extraConfig: {
          serviceType: 'micro',
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/newProcess/0',
        },
        data: {},
      });
    },

    async button_6_click(event) {
      await this.button_6_click_click(event);
    },

    async button_6_click_click() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_3?.validate?.(undefined, undefined)) || {}).valid) {
        this.leaveProcess.status = '0';
        this.leaveProcess = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LeaveProcess',
          await window.LcapRequest({
            url: '/api/leave-process',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/newProcess/0',
            },

            data: this.leaveProcess,
          }),
        );
        await window.LcapRequest({
          url: '/api/lcap_process_framework/launchProcess',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/newProcess/0',
          },
          data: {
            data: await (async () => {
              const obj = {
                data: null,
              };
              obj.data = this.leaveProcess;
              return obj;
            })(),
            procDefKey: 'Process_739388f0',
          },
        });
        window.$destination('/oaSys/homePage', '_self', false);
      }
    },

    async ico_7_click(event) {
      await this.ico_7_click_click(event);
    },

    async ico_7_click_click() {
      this.boolean1 = !this.boolean1;
      this.title = (this.leaveProcess || {}).title;
    },

    async ico_11_click(event) {
      await this.ico_11_click_click(event);
    },

    async ico_11_click_click() {
      this.leaveProcess.title = this.title;
      this.boolean1 = !this.boolean1;
    },

    async ico_12_click(event) {
      await this.ico_12_click_click(event);
    },

    async ico_12_click_click() {
      this.boolean1 = !this.boolean1;
    },

    async time_picker_2_change(event) {
      await this.time_picker_2_change_change(event);
    },

    async time_picker_2_change_change() {
      if (window.$utils.HasValue({ type: 'nasl.core.Date', value: (this.leaveProcess || {}).startDate }, { type: 'nasl.core.Date', value: (this.leaveProcess || {}).endDate }, { type: 'nasl.core.Time', value: (this.leaveProcess || {}).startTime }, { type: 'nasl.core.Time', value: (this.leaveProcess || {}).endTime })) {
        if ((this.leaveProcess || {}).startDate == (this.leaveProcess || {}).endDate) {
          this.leaveProcess.leaveTime = window.$utils.DateDiff(window.$utils.Convert(window.$utils.ToString('nasl.core.Time', (this.leaveProcess || {}).startTime) + window.$utils.ToString('nasl.core.String', ':00'), { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Time' }), window.$utils.Convert(window.$utils.ToString('nasl.core.Time', (this.leaveProcess || {}).endTime) + window.$utils.ToString('nasl.core.String', ':00'), { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Time' }), 'h', true);
        } else {
          this.leaveProcess.leaveTime = window.$utils.DateDiff(window.$genInitFromSchema('nasl.core.DateTime', window.$utils.Convert(window.$utils.ToString('nasl.core.Date', (this.leaveProcess || {}).startDate) + window.$utils.ToString('nasl.core.String', ' ') + window.$utils.ToString('nasl.core.Time', (this.leaveProcess || {}).startTime) + window.$utils.ToString('nasl.core.String', ':00'), { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'DateTime', changedTime: 1766487427430 })), window.$genInitFromSchema('nasl.core.DateTime', window.$utils.Convert(window.$utils.ToString('nasl.core.Date', (this.leaveProcess || {}).endDate) + window.$utils.ToString('nasl.core.String', ' ') + window.$utils.ToString('nasl.core.Time', (this.leaveProcess || {}).endTime) + window.$utils.ToString('nasl.core.String', ':00'), { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'DateTime', changedTime: 1766487431952 })), 'h', true);
          this.leaveProcess.leaveTime = window.$global.minus((this.leaveProcess || {}).leaveTime, window.$global.multiply(window.$utils.DateDiff((this.leaveProcess || {}).startDate, (this.leaveProcess || {}).endDate, 'd', true), '16'));
        }
      }
    },

    async date_picker_2_blur(event) {
      await this.date_picker_2_blur_blur(event);
    },

    async date_picker_2_blur_blur() {
      if (window.$utils.HasValue({ type: 'nasl.core.Date', value: (this.leaveProcess || {}).endDate })) { /* empty */ } else {
        this.leaveProcess.endDate = (this.leaveProcess || {}).startDate;
      }
    },

    genviewMatchExpression_0j5j5t10() {
      return (() => {
        const it = (this.leaveProcess || {}).type;
        if (window.$global.isEqual(it, '0')) {
          return `*普通病假为非全薪病假，病假期间扣除40%日薪，病假扣款=基本工资÷21.75×病假天数×40%。
*申请材料：挂号证明、医生开具的病假建议书、相关病历记录。`;
        } else if (window.$global.isEqual(it, '1')) {
          return `*年假以0.5天为单位，每次休假不少于0.5天。
*时长按照每4小时=0.5天机算。当天请假不足4小时按照0.5天计，当天请假超过4小时按照1天计算。`;
        } else if (window.$global.isEqual(it, '2')) {
          return '*事假为无薪假期，事假期间扣除100%日薪，事假扣款=基本天数÷21.75×事假天数';
        } else { /* empty */ }
      })();
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.newProcess_created();
  },
};
</script>
