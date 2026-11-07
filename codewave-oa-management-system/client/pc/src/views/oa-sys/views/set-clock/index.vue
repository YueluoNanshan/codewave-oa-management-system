<template>
  <u-linear-layout
    ref="uLinearLayout1"
    class="cw-style-height"
    type="root"
    gap="none"
    style="--cw-style-height: 100%; height: 100%; --custom-start: auto; min-height: 200px"
  >
    <u-router-view ref="router_view1"></u-router-view>
    <u-panel ref="panel_1">
      <template
        #title

      ></template>
      <template
        #extra

      ></template>
      <u-linear-layout
        ref="linear_layout_138"
        direction="vertical"
        :wrap="true"
      >
        <u-linear-layout
          ref="linear_layout_139"
          :wrap="true"
        >
          <u-form
            ref="form_2"
            class="cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
            key="form_2"
            style="--cw-style-border-style: solid; --cw-style-border-color: #d2d2d2; --cw-style-border-left-width: 1px; --cw-style-border-right-width: 1px; --cw-style-border-top-width: 1px; --cw-style-border-bottom-width: 1px; --cw-style-border-top-left-radius: 6px; --cw-style-border-top-right-radius: 6px; --cw-style-border-bottom-left-radius: 6px; --cw-style-border-bottom-right-radius: 6px; --form-item-label-width: 120px; border-top-left-radius: 6px; border-bottom-left-radius: 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px; border-style: solid; border-color: #d2d2d2; border-top-color: #d2d2d2; border-bottom-color: #d2d2d2; border-left-color: #d2d2d2; border-right-color: #d2d2d2; border-top-width: 1px; border-left-width: 1px; border-right-width: 1px; border-bottom-width: 1px"
          >
            <u-form-item
              ref="form_item_8"
              class="cw-style-height cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
              layout="center"
              :required="true"
              :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
              style="--cw-style-height: 50px; --cw-style-border-style: solid; --cw-style-border-color: #e3e3e3; --cw-style-border-left-width: 1px; --cw-style-border-right-width: 1px; --cw-style-border-top-width: 1px; --cw-style-border-bottom-width: 1px; height: 50px; border-style: solid; border-color: #e3e3e3; border-top-color: #e3e3e3; border-bottom-color: #e3e3e3; border-left-color: #e3e3e3; border-right-color: #e3e3e3; border-top-width: 1px; border-left-width: 1px; border-right-width: 1px; border-bottom-width: 1px"
            >
              <template
                #label

              >
                <u-text
                  ref="text_447"
                  text="上班时间"
                ></u-text>
              </template>
              <u-time-picker
                ref="time_picker_3"
                :value.sync="attendanceSetting.startTime"
                placeholder="请选择上班时间"
                :emptyValueIsNull="true"
                :disabled="bottonBoolean"
                minUnit="minute"
              ></u-time-picker>
            </u-form-item>
            <u-form-item
              ref="form_item_9"
              class="cw-style-height cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
              layout="center"
              :required="true"
              :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
              style="--cw-style-height: 50px; --cw-style-border-style: solid; --cw-style-border-left-width: 1px; --cw-style-border-right-width: 1px; --cw-style-border-top-width: 1px; --cw-style-border-bottom-width: 1px; height: 50px; border-bottom-color: #e3e3e3; border-style: solid; border-top-color: #fffbfb; border-left-color: #e0e0e0; border-right-color: #f8f8f8; border-top-width: 1px; border-left-width: 1px; border-right-width: 1px; border-bottom-width: 1px"
            >
              <template
                #label

              >
                <u-text
                  ref="text_448"
                  text="下班时间"
                ></u-text>
              </template>
              <u-time-picker
                ref="time_picker_4"
                :value.sync="attendanceSetting.endTime"
                placeholder="请选择下班时间"
                :emptyValueIsNull="true"
                :disabled="bottonBoolean"
                minUnit="minute"
              ></u-time-picker>
            </u-form-item>
            <u-form-item
              ref="form_item_10"
              class="cw-style-height cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
              layout="center"
              :required="true"
              :rules="[]"
              style="--cw-style-height: 70px; --cw-style-border-style: solid; --cw-style-border-left-width: 1px; --cw-style-border-right-width: 1px; --cw-style-border-top-width: 1px; --cw-style-border-bottom-width: 1px; height: 70px; border-top-color: #ffffff; border-bottom-color: #e3e3e3; border-left-color: #ffffff; border-right-color: #ffffff; border-style: solid; border-left-width: 1px; border-top-width: 1px; border-right-width: 1px; border-bottom-width: 1px"
            >
              <template
                #label

              >
                <u-text
                  ref="text_449"
                  text="打卡地点"
                ></u-text>
              </template>
              <u-linear-layout
                ref="linear_layout_142"
                class="cw-style-margin-bottom cw-style-margin"
                direction="vertical"
                :wrap="true"
                style="--cw-style-margin-bottom: 8px; margin-bottom: 8px"
              >
                <u-linear-layout
                  ref="linear_layout_143"
                  :wrap="true"
                >
                  <u-link
                    ref="link_7"
                    text="点击进入地图选点"
                    :disabled="bottonBoolean"
                    @click="link_7_click($event)"
                  ></u-link>
                </u-linear-layout>
                <u-linear-layout
                  ref="linear_layout_144"
                  :wrap="true"
                >
                  <cw-amap-nav
                    ref="cw_amap_nav_1"
                    :lalg="(attendanceSetting || {}).location"
                    :label="(attendanceSetting || {}).locationName"
                    target="_blank"
                  ></cw-amap-nav>
                </u-linear-layout>
              </u-linear-layout>
            </u-form-item>
            <u-form-item
              ref="form_item_11"
              class="cw-style-height"
              layout="center"
              :required="true"
              :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
              style="--cw-style-height: 50px; height: 50px"
            >
              <template
                #label

              >
                <u-text
                  ref="text_450"
                  text="打卡半径"
                ></u-text>
              </template>
              <u-number-input
                ref="number_input_2"
                :value.sync="attendanceSetting.radius"
                placeholder="请输入打卡半径"
                unitType="suffix"
                unitValue="米"
                :hideButtons="true"
                :min="0"
                :disabled="bottonBoolean"
              ></u-number-input>
            </u-form-item>
          </u-form>
        </u-linear-layout>
        <u-linear-layout
          ref="linear_layout_140"
          :wrap="true"
        >
          <u-button
            ref="button_5"
            key="button_5"
            color="primary"
            :throttleTime="150"
            text="设 置"
            @click="button_5_click($event)"
            v-if="bottonBoolean"
          ></u-button>
          <u-button
            ref="button_6"
            key="button_6"
            color="primary_secondary"
            :throttleTime="150"
            text="保 存"
            @click="button_6_click($event)"
            v-if="!bottonBoolean"
          ></u-button>
          <u-button
            ref="button_7"
            key="button_7"
            color="primary_secondary"
            :throttleTime="150"
            text="取 消"
            @click="button_7_click($event)"
            v-if="!bottonBoolean"
          ></u-button>
        </u-linear-layout>
      </u-linear-layout>
    </u-panel>
    <u-modal
      ref="modal_1"
      size="huge"
      :is-heading-slot-empty="true"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_145"
          justify="center"
        >
          <u-button
            ref="button_3"
            color="primary"
            text="确 定"
            @click="button_3_click($event)"
          ></u-button>
          <u-button
            ref="button_4"
            text="取 消"
            @click="button_4_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <cw-amap-poi
          ref="cw_amap_poi_1"
          city="杭州"
          @select="cw_amap_poi_1_select($event)"
        ></cw-amap-poi>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_452"
          text="地图选点"
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
  name: '/oaSys/setClock',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      attendanceSetting: window.$genInitFromSchema('app.dataSources.defaultDS.entities.AttendanceSetting', undefined),
      poiinfo: window.$genInitFromSchema('nasl.ui.PoiInfo', undefined),
      location: undefined,
      name: undefined,
      bottonBoolean: true,
    };
  },
  meta: {
    title: '考勤设置',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async setClock_created(event) {
      await this.setClock_created_created(event);
    },

    async setClock_created_created() {
      this.$global.frontendVariables.title = '考勤设置';
      this.attendanceSetting = window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.AttendanceSetting',
        await window.LcapRequest({
          url: '/api/lcplogics/loadsetClock',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/setClock/0',
          },
          data: {},
        }),
      );
    },

    async cw_amap_poi_1_select(event) {
      await this.cw_amap_poi_1_select_select(event);
    },

    async cw_amap_poi_1_select_select(event) {
      await console.info(
        window.$utils.ToString(
          'nasl.core.String',
          window.$utils.ToString(
            'nasl.core.String',
            `111
`,
          ) +
                        window.$utils.ToString('nasl.core.any', event) +
                        window.$utils.ToString(
                          'nasl.core.String',
                          `
`,
                        ),
        ),
      );
      await (async () => {
        this.eventJSON = JSON.parse(event);
        this.name = this.eventJSON.name;
        this.location = this.eventJSON.location;
      })();
      await console.info(
        window.$utils.ToString(
          'nasl.core.String',
          window.$utils.ToString('nasl.core.String', '2') +
                        window.$utils.ToString('nasl.core.String', this.name) +
                        window.$utils.ToString(
                          'nasl.core.String',
                          `
3`,
                        ) +
                        window.$utils.ToString('nasl.core.String', this.location),
        ),
      );
    },

    async button_5_click(event) {
      await this.button_5_click_click(event);
    },

    async button_5_click_click() {
      this.bottonBoolean = !this.bottonBoolean;
    },

    async button_6_click(event) {
      await this.button_6_click_click(event);
    },

    async button_6_click_click() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_2?.validate?.(undefined, undefined)) || {}).valid) {
        window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.AttendanceSetting',
          await window.LcapRequest({
            url: '/api/attendance-setting/createOrUpdate',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/setClock/0',
            },
            data: {
              entity: this.attendanceSetting,
            },
          }),
        );
        await window.$global.showMessage(window.$utils.ToString('nasl.core.String', '保存成功！'));
        this.bottonBoolean = !this.bottonBoolean;
      }
    },

    async button_7_click(event) {
      await this.button_7_click_click(event);
    },

    async button_7_click_click() {
      this.bottonBoolean = !this.bottonBoolean;
    },

    async button_3_click(event) {
      await this.button_3_click_click(event);
    },

    async button_3_click_click() {
      this.attendanceSetting.location = this.location;
      this.attendanceSetting.locationName = this.name;
      await this.$refs.modal_1?.close?.();
    },

    async button_4_click(event) {
      await this.button_4_click_click(event);
    },

    async button_4_click_click() {
      await this.$refs.modal_1?.close?.();
    },

    async link_7_click(event) {
      await this.link_7_click_click(event);
    },

    async link_7_click_click() {
      await this.$refs.modal_1?.open?.();
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.setClock_created();
  },
};
</script>
