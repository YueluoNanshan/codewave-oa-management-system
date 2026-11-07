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
      ref="linear_layout_4"
      direction="vertical"
      :wrap="true"
    >
      <u-linear-layout
        ref="linear_layout_5"
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
            ref="linear_layout_7"
            direction="horizontal"
            :wrap="true"
          >
            <i-ico
              ref="ico_5"
              class="cw-style-font-size"
              name="left-arrow"
              icotype="only"
              style="--cw-style-font-size: 24px; font-size: 24px"
            >
              <u-text
                ref="text_134"
                text="图标"
              ></u-text>
            </i-ico>
            <u-link
              ref="link_1"
              class="cw-style-font-size cw-style-color"
              text="新建日程"
              destination="/oaSys/mySchedule"
              style="--cw-style-font-size: 24px; --cw-style-color: #000000; font-size: 24px; color: #000000"
            ></u-link>
          </u-linear-layout>
          <u-form
            ref="form_1"
            class="cw-style-text-align cw-style-margin-left cw-style-margin cw-style-margin-right"
            key="form_1"
            style="--cw-style-text-align: left; --cw-style-margin-left: 160px; --cw-style-margin-right: 60px; margin-left: 160px; margin-right: 60px; text-align: left"
          >
            <u-form-item
              ref="form_item_1"
              layout="center"
              :required="true"
              :rules="[{ validate: 'filled', message: `请填写日程标题`, trigger: 'input+blur', required: true }]"
            >
              <template
                #label

              >
                <u-text
                  ref="text_107"
                  text="日程标题"
                ></u-text>
              </template>
              <u-input
                ref="input_2"
                :value.sync="schedule.title"
                placeholder="请输入标题"
                :emptyValueIsNull="true"
                width="huge"
              ></u-input>
            </u-form-item>
            <u-form-item
              ref="form_item_2"
              layout="center"
              :rules="[]"
              :required="true"
            >
              <template
                #label

              >
                <u-text
                  ref="text_108"
                  text="日程时间"
                ></u-text>
              </template>
              <u-date-picker
                ref="date_picker_1"
                class="cw-style-width cw-style-margin-right cw-style-margin"
                :clearable="true"
                :value.sync="schedule.startDate"
                :emptyValueIsNull="true"
                width="normal"
                style="--cw-style-width: 190px; --cw-style-margin-right: 10px; margin-right: 10px; width: 190px"
              ></u-date-picker>
              <u-time-picker
                ref="time_picker_1"
                key="time_picker_1"
                class="cw-style-margin-right cw-style-margin"
                :value.sync="schedule.start"
                placeholder="请选择开始时间"
                :emptyValueIsNull="true"
                width="small"
                minUnit="minute"
                v-if="(schedule || {}).ifAllDay == false"
                style="--cw-style-margin-right: 10px; margin-right: 10px"
              ></u-time-picker>
              <i-ico
                ref="ico_7"
                name="d-right-arrow"
                icotype="only"
              >
                <u-text
                  ref="text_136"
                  text="图标"
                ></u-text>
              </i-ico>
              <u-date-picker
                ref="date_picker_2"
                class="cw-style-width cw-style-margin-left cw-style-margin cw-style-margin-right"
                :clearable="true"
                :value.sync="schedule.endDate"
                :emptyValueIsNull="true"
                width="normal"
                style="--cw-style-width: 190px; --cw-style-margin-left: 10px; --cw-style-margin-right: 10px; margin-right: 10px; margin-left: 10px; width: 190px"
              ></u-date-picker>
              <u-time-picker
                ref="time_picker_2"
                key="time_picker_2"
                class="cw-style-margin-right cw-style-margin"
                :value.sync="schedule.end"
                placeholder="请选择结束时间"
                :emptyValueIsNull="true"
                width="small"
                minUnit="minute"
                v-if="(schedule || {}).ifAllDay == false"
                style="--cw-style-margin-right: 10px; margin-right: 10px"
              ></u-time-picker>
              <u-text
                ref="text_118"
                class="cw-style-margin-right cw-style-margin"
                text="全天"
                style="--cw-style-margin-right: 10px; margin-right: 10px"
              ></u-text>
              <u-switch
                ref="switch_1"
                :value.sync="schedule.ifAllDay"
                :withText="false"
              ></u-switch>
            </u-form-item>
            <u-form-item
              ref="form_item_9"
              layout="center"
              :required="true"
            >
              <template
                #label

              >
                <u-text
                  ref="text_115"
                  text="日程地点"
                ></u-text>
              </template>
              <u-input
                ref="input_5"
                :value.sync="schedule.place"
                placeholder="请输入日程地点"
                :emptyValueIsNull="true"
                width="huge"
              ></u-input>
            </u-form-item>
            <u-form-item
              ref="form_item_6"
              class="cw-style-height"
              layout="center"
              :required="true"
              :rules="[{ validate: 'filled', message: `请选择日程类型`, trigger: 'input+blur', required: true }]"
              style="--cw-style-height: 35px; height: 35px"
            >
              <template
                #label

              >
                <u-text
                  ref="text_112"
                  text="日程类型"
                ></u-text>
              </template>
              <u-radios
                ref="radios_1"
                :value.sync="schedule.type"
              >
                <template
                  #item=""

                ></template>
                <u-radio
                  ref="radio_1"
                  label="1"
                >
                  <template
                    #item

                  >
                    <u-text
                      ref="text_126"
                      text="流程"
                    ></u-text>
                  </template>
                </u-radio>
                <u-radio
                  ref="radio_2"
                  label="2"
                >
                  <template
                    #item

                  >
                    <u-text
                      ref="text_127"
                      text="会议"
                    ></u-text>
                  </template>
                </u-radio>
                <u-radio
                  ref="radio_3"
                  label="3"
                >
                  <template
                    #item

                  >
                    <u-text
                      ref="text_128"
                      text="面试"
                    ></u-text>
                  </template>
                </u-radio>
                <u-radio
                  ref="radio_4"
                  label="0"
                >
                  <template
                    #item

                  >
                    <u-text
                      ref="text_129"
                      text="自定义"
                    ></u-text>
                    <u-input
                      ref="input_7"
                      key="input_7"
                      class="cw-style-margin-left cw-style-margin"
                      placeholder="请输入"
                      :emptyValueIsNull="true"
                      :value.sync="schedule.defined"
                      v-if="(schedule || {}).type == '0'"
                      style="--cw-style-margin-left: 10px; margin-left: 10px"
                    ></u-input>
                  </template>
                </u-radio>
              </u-radios>
            </u-form-item>
            <u-form-item
              ref="form_item_8"
              layout="center"
            >
              <template
                #label

              >
                <u-text
                  ref="text_114"
                  text="备注"
                ></u-text>
              </template>
              <u-textarea
                ref="textarea_1"
                placeholder="请输入"
                limitPosition="outside"
                :emptyValueIsNull="true"
                :value.sync="schedule.remark"
                size="huge"
              ></u-textarea>
            </u-form-item>
            <u-form-item
              ref="form_item_11"
              layout="center"
            >
              <u-button
                ref="button_2"
                class="cw-style-margin-right cw-style-margin"
                color="primary"
                text="新建"
                @click="button_2_click($event)"
                style="--cw-style-margin-right: 20px; margin-right: 20px"
              ></u-button>
              <u-button
                ref="button_3"
                color="primary_secondary"
                text="取消"
                @click="button_3_click($event)"
              ></u-button>
              <template
                #label

              ></template>
            </u-form-item>
          </u-form>
        </u-panel>
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_6"
        :wrap="true"
      ></u-linear-layout>
    </u-linear-layout>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/newSchedule',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      schedule: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Schedule', undefined),
    };
  },
  meta: {
    title: '新建日程',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async button_2_click(event) {
      await this.button_2_click_submit(event);
    },

    async button_2_click_submit() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_1?.validate?.()) || {}).valid) {
        window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.Schedule',
          await window.LcapRequest({
            url: '/api/schedule',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/newSchedule/0',
            },

            data: this.schedule,
          }),
        );
        window.$destination('/oaSys/mySchedule', '_self', false);
      }
    },

    async button_3_click(event) {
      await this.button_3_click_submit(event);
    },

    async button_3_click_submit() {
      window.$destination('/oaSys/mySchedule', '_self', false);
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
};
</script>
