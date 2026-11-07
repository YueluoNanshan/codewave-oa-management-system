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
      ref="linear_layout_1"
      direction="horizontal"
      :wrap="true"
      mode="flex"
      justify="start"
      alignment="start"
    >
      <u-panel
        ref="panel_2"
        class="cw-style-width"
        style="--cw-style-width: 290px; width: 290px"
      >
        <template
          #title

        ></template>
        <template
          #extra

        ></template>
        <u-linear-layout
          ref="linear_layout_3"
          direction="vertical"
          :wrap="true"
        >
          <u-linear-layout
            ref="linear_layout_4"
            class="cw-style-text-align"
            :wrap="true"
            style="--cw-style-text-align: center; text-align: center"
          >
            <u-button
              ref="button_1"
              class="cw-style-width cw-style-text-align"
              color="primary"
              :throttleTime="150"
              text="新建日程"
              destination="/oaSys/newSchedule"
              style="--cw-style-width: 202px; --cw-style-text-align: center; width: 202px; text-align: center"
            ></u-button>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_5"
            :wrap="true"
          >
            <u-text
              ref="text_105"
              class="cw-style-font-weight"
              size="large"
              text="日程类型"
              style="--cw-style-font-weight: bold; font-weight: bold"
            ></u-text>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_6"
            :wrap="true"
          >
            <u-checkboxes
              ref="checkboxes_1"
              class="cw-style-padding-left cw-style-padding"
              :value.sync="list_type"
              style="--cw-style-padding-left: 20px; padding-left: 20px; --checkbox-background: #ea534e"
            >
              <template
                #item=""

              ></template>
              <template
                #checkAll

              ></template>
              <u-checkbox
                ref="checkbox_1"
                label="1"
              >
                <template
                  #item

                >
                  <u-text
                    ref="text_106"
                    text="流程"
                  ></u-text>
                </template>
              </u-checkbox>
            </u-checkboxes>
            <u-checkboxes
              ref="checkboxes_2"
              class="cw-style-padding-left cw-style-padding cw-style-margin-top cw-style-margin"
              :value.sync="list_type"
              style="--cw-style-padding-left: 20px; --cw-style-margin-top: 16px; padding-left: 20px; --checkbox-background: #ea534e; margin-top: 16px"
            >
              <template
                #item=""

              ></template>
              <template
                #checkAll

              ></template>
              <u-checkbox
                ref="checkbox_2"
                label="2"
              >
                <template
                  #item

                >
                  <u-text
                    ref="text_107"
                    text="会议"
                  ></u-text>
                </template>
              </u-checkbox>
            </u-checkboxes>
            <u-checkboxes
              ref="checkboxes_3"
              class="cw-style-padding-left cw-style-padding cw-style-margin-top cw-style-margin"
              :value.sync="list_type"
              style="--cw-style-padding-left: 20px; --cw-style-margin-top: 16px; padding-left: 20px; --checkbox-background: #ea534e; margin-top: 16px"
            >
              <template
                #item=""

              ></template>
              <template
                #checkAll

              ></template>
              <u-checkbox
                ref="checkbox_3"
                label="3"
              >
                <template
                  #item

                >
                  <u-text
                    ref="text_108"
                    text="面试"
                  ></u-text>
                </template>
              </u-checkbox>
            </u-checkboxes>
            <u-checkboxes
              ref="checkboxes_4"
              class="cw-style-padding-left cw-style-padding cw-style-margin-top cw-style-margin"
              :value.sync="list_type"
              style="--cw-style-padding-left: 20px; --cw-style-margin-top: 16px; padding-left: 20px; --checkbox-background: #ea534e; margin-top: 16px"
            >
              <template
                #item=""

              ></template>
              <template
                #checkAll

              ></template>
              <u-checkbox
                ref="checkbox_4"
                label="0"
              >
                <template
                  #item

                >
                  <u-text
                    ref="text_109"
                    text="自定义"
                  ></u-text>
                </template>
              </u-checkbox>
            </u-checkboxes>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_7"
            :wrap="true"
          >
            <cw-antd-calendar ref="cw_antd_calendar_1"></cw-antd-calendar>
          </u-linear-layout>
        </u-linear-layout>
      </u-panel>
      <u-panel
        ref="panel_3"
        widthStretch="true"
      >
        <template
          #title

        ></template>
        <template
          #extra

        ></template>
        <my-full-calendar
          ref="my_full_calendar_1"
          class="cw-style-color"
          v-dependencies.reload="[]"
          :dataSource="__my_full_calendar_1_handleDataSourceLoad()"
          @event-click="my_full_calendar_1_eventclick($event)"
          @event-delete="my_full_calendar_1_eventdelete($event)"
          style="--cw-style-color: #040404; color: #040404"
        ></my-full-calendar>
      </u-panel>
    </u-linear-layout>
    <u-modal
      ref="modal_1"
      size="huge"
      :is-heading-slot-empty="true"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_8"
          justify="center"
        >
          <u-button
            ref="button_5"
            color="primary"
            text="确 定"
            @click="button_5_click($event)"
          ></u-button>
          <u-button
            ref="button_6"
            text="取 消"
            @click="button_6_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-linear-layout
          ref="linear_layout_9"
          direction="horizontal"
          :wrap="true"
        >
          <u-form
            ref="form_1"
            class="cw-style-text-align cw-style-margin-right cw-style-margin"
            key="form_1"
            style="--cw-style-text-align: left; --cw-style-margin-right: 60px; margin-right: 60px; text-align: left"
          >
            <u-form-item
              ref="form_item_1"
              layout="center"
              :required="true"
            >
              <template
                #label

              >
                <u-text
                  ref="text_110"
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
            >
              <template
                #label

              >
                <u-text
                  ref="text_111"
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
                style="--cw-style-width: 140px; --cw-style-margin-right: 5px; margin-right: 5px; width: 140px"
              ></u-date-picker>
              <u-time-picker
                ref="time_picker_1"
                key="time_picker_1"
                class="cw-style-width cw-style-margin-right cw-style-margin"
                :value.sync="schedule.start"
                placeholder="请选择开始时间"
                :emptyValueIsNull="true"
                width="small"
                minUnit="minute"
                v-if="(schedule || {}).ifAllDay == false"
                style="--cw-style-width: 130px; --cw-style-margin-right: 5px; margin-right: 5px; width: 130px"
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
                style="--cw-style-width: 140px; --cw-style-margin-left: 5px; --cw-style-margin-right: 5px; margin-right: 5px; margin-left: 5px; width: 140px"
              ></u-date-picker>
              <u-time-picker
                ref="time_picker_2"
                key="time_picker_2"
                class="cw-style-width cw-style-margin-right cw-style-margin"
                :value.sync="schedule.end"
                placeholder="请选择结束时间"
                :emptyValueIsNull="true"
                width="small"
                minUnit="minute"
                v-if="(schedule || {}).ifAllDay == false"
                style="--cw-style-width: 130px; --cw-style-margin-right: 10px; margin-right: 10px; width: 130px"
              ></u-time-picker>
              <u-linear-layout
                ref="linear_layout_10"
                direction="horizontal"
                :wrap="true"
              >
                <u-text
                  ref="text_118"
                  class="cw-style-margin-right cw-style-margin"
                  text="全天"
                  display="inline"
                  style="--cw-style-margin-right: 10px; margin-right: 10px"
                ></u-text>
                <u-switch
                  ref="switch_1"
                  :value.sync="schedule.ifAllDay"
                  :withText="false"
                ></u-switch>
              </u-linear-layout>
            </u-form-item>
            <u-form-item
              ref="form_item_9"
              layout="center"
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
          </u-form>
        </u-linear-layout>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_137"
          text="修改日程"
        ></u-text>
      </template>
      <template
        #heading

      ></template>
    </u-modal>
    <u-modal
      ref="modal_2"
      icon="warning"
      :is-heading-slot-empty="true"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_136"
          justify="center"
        >
          <u-button
            ref="button_7"
            color="primary"
            text="确 定"
            @click="button_7_click($event)"
          ></u-button>
          <u-button
            ref="button_8"
            text="取 消"
            @click="button_8_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-text
          ref="text_437"
          text="是否删除该日程"
        ></u-text>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_438"
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
  name: '/oaSys/mySchedule',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      list_type: window.$genInitFromSchema(
        'nasl.collection.List<app.enums.ScheduleType>',
        (() => {
          const arr = ['1', '2', '3', '0'];
          return arr;
        })(),
      ),
      schedule: window.$genInitFromSchema('app.dataSources.defaultDS.entities.Schedule', undefined),
      scheduleId: undefined,
    };
  },
  meta: {
    title: '我的日程',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async mySchedule_created(event) {
      await this.mySchedule_created_created(event);
    },

    async mySchedule_created_created() {
      this.$global.frontendVariables.title = '我的日程';
    },

    async my_full_calendar_1_eventclick(event) {
      await this.my_full_calendar_1_eventClick_eventclick(event);
    },

    async my_full_calendar_1_eventClick_eventclick(event) {
      await this.$refs.modal_1?.open?.();
      this.schedule = window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.Schedule',
        await window.LcapRequest({
          url: '/api/schedule',
          method: 'GET',
          extraConfig: {
            serviceType: 'entity',
          },
          params: {
            id: window.$utils.Convert((event || {}).id, { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Long', changedTime: 1766137947001 }),
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/mySchedule/0',
          },
        }),
      );
    },

    async my_full_calendar_1_eventdelete(event) {
      await this.my_full_calendar_1_eventDelete_eventdelete(event);
    },

    async my_full_calendar_1_eventDelete_eventdelete(event) {
      await this.$refs.modal_2?.open?.();
      this.scheduleId = window.$utils.FromString((event || {}).id, 'nasl.core.Long');
    },

    async button_5_click(event) {
      await this.button_5_click_click(event);
    },

    async button_5_click_click() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_1?.validate?.(undefined, undefined)) || {}).valid) {
        window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.Schedule',
          await window.LcapRequest({
            url: '/api/schedule',
            method: 'PUT',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/mySchedule/0',
            },
            data: {
              entity: this.schedule,
            },
          }),
        );
        await this.$refs.modal_1?.close?.();
        await this.$refs.my_full_calendar_1?.reload?.();
      }
    },

    async button_6_click(event) {
      await this.button_6_click_click(event);
    },

    async button_6_click_click() {
      await this.$refs.modal_1?.close?.();
    },

    async button_7_click(event) {
      await this.button_7_click_click(event);
    },

    async button_7_click_click() {
      await window.LcapRequest({
        url: '/api/schedule',
        method: 'DELETE',
        extraConfig: {
          serviceType: 'entity',
        },
        params: {
          id: this.scheduleId,
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/mySchedule/0',
        },
      });
      await this.$refs.my_full_calendar_1?.reload?.();
      await this.$refs.modal_2?.close?.();
    },

    async button_8_click(event) {
      await this.button_8_click_click(event);
    },

    async button_8_click_click() {
      await this.$refs.modal_2?.close?.();
    },

    __my_full_calendar_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__my_full_calendar_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          'nasl.collection.List<app.structures.ScheduleStructure>',
          await window.LcapRequest({
            url: '/api/lcplogics/loadSchedule',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/mySchedule/0',
            },
            data: {
              list: this.list_type,
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
    await this.mySchedule_created();
  },
};
</script>
