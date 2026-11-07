<template>
  <van-linear-layout
    ref="vanLinearLayout1"
    class="l-root-h5 cw-style-background-image"
    type="root"
    gap="none"
    style="--cw-style-background-image: linear-gradient(180deg, #337eff 0%, #fff 39.603960396039604%); background-image: linear-gradient(180deg, #337eff 0%, #fff 39.603960396039604%)"
  >
    <van-linear-layout
      ref="linear_layout_38"
      direction="vertical"
      gap="none"
    >
      <van-linear-layout
        ref="linear_layout_39"
        :wrap="true"
      >
        <van-cardu
          ref="cardu_1"
          class="cw-style-margin-left cw-style-margin cw-style-margin-bottom cw-style-margin-right"
          style="--cw-style-margin-left: 10px; --cw-style-margin-bottom: 20px; --cw-style-margin-right: 10px; margin-bottom: 20px; margin-left: 10px; margin-right: 10px"
        >
          <template
            #head

          >
            <van-text
              ref="text_515"
              class="cw-style-margin-right cw-style-margin"
              :text="$utils['ToString']('nasl.core.String', $utils['FormatDate']($utils['CurrDate'](`global`), `MM-dd`))"
              style="--cw-style-margin-right: 5px; margin-right: 5px"
            ></van-text>
            <van-text
              ref="text_516"
              :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_180qcxq1())"
            ></van-text>
            <van-text
              ref="text_518"
              class="cw-style-margin-left cw-style-margin cw-style-margin-right"
              text="|"
              style="--cw-style-margin-left: 5px; --cw-style-margin-right: 5px; margin-left: 5px; margin-right: 5px"
            ></van-text>
            <van-text
              ref="text_517"
              :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0xkiwcs1())"
            ></van-text>
          </template>
          <van-linear-layout
            ref="linear_layout_42"
            direction="vertical"
            gap="none"
          >
            <van-linear-layout
              ref="linear_layout_43"
              class="cw-style-margin-bottom cw-style-margin cw-style-margin-top"
              :wrap="true"
              style="--cw-style-margin-bottom: 8px; --cw-style-margin-top: 8px; margin-top: 8px; margin-bottom: 8px"
            >
              <van-row
                ref="row_1"
                gutter="0"
              >
                <van-col
                  ref="col_1"
                  class="cw-style-text-align"
                  :span="8"
                  mode="flex"
                  justify="center"
                  alignment="center"
                  style="--cw-style-text-align: center; text-align: center"
                >
                  <van-tag
                    ref="tag_1"
                    key="tag_1"
                    type="warning"
                    size="medium"
                    v-if="((clock || {}).clockIn || {}).clockType == '2'"
                  >
                    <van-text
                      ref="text_528"
                      text="迟到"
                    ></van-text>
                  </van-tag>
                  <van-text
                    ref="text_519"
                    :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0wsvpot0())"
                  ></van-text>
                </van-col>
                <van-col
                  ref="col_2"
                  class="cw-style-text-align"
                  :span="8"
                  style="--cw-style-text-align: center; text-align: center"
                >
                  <van-iconv
                    ref="iconv_2"
                    name="right-arrow"
                    icotype="only"
                  >
                    <van-text
                      ref="text_522"
                      text="图标"
                    ></van-text>
                  </van-iconv>
                </van-col>
                <van-col
                  ref="col_3"
                  class="cw-style-text-align"
                  :span="8"
                  mode="flex"
                  justify="center"
                  alignment="center"
                  style="--cw-style-text-align: center; text-align: center"
                >
                  <van-text
                    ref="text_520"
                    :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_14pjqaz1())"
                  ></van-text>
                </van-col>
              </van-row>
            </van-linear-layout>
            <van-linear-layout
              ref="linear_layout_44"
              :wrap="true"
            >
              <van-cell-group ref="cell_group_1">
                <van-cell
                  ref="cell_1"
                  class="cw-style-margin-bottom cw-style-margin"
                  :isLink="true"
                  :center="true"
                  style="--cw-style-margin-bottom: 8px; margin-bottom: 8px"
                >
                  <template
                    #title

                  >
                    <van-iconv
                      ref="iconv_4"
                      class="cw-style-font-size"
                      name="calendar"
                      icotype="only"
                      style="--cw-style-font-size: 24px; font-size: 24px"
                    >
                      <van-text
                        ref="text_526"
                        text="图标"
                      ></van-text>
                    </van-iconv>
                    <van-text
                      ref="text_523"
                      class="cw-style-margin-left cw-style-margin cw-style-font-size"
                      text="我的考勤记录"
                      style="--cw-style-margin-left: 15px; --cw-style-font-size: 15px; font-size: 15px; margin-left: 15px"
                    ></van-text>
                  </template>
                  <template
                    #rightIcon

                  ></template>
                </van-cell>
              </van-cell-group>
            </van-linear-layout>
            <van-linear-layout
              ref="linear_layout_45"
              :wrap="true"
            >
              <van-notice-bar
                ref="notice_bar_1"
                class="cw-style-height cw-style-margin-bottom cw-style-margin"
                :scrollable="false"
                style="--cw-style-height: 45px; --cw-style-margin-bottom: 8px; height: 45px; margin-bottom: 8px"
              >
                <van-text
                  ref="text_527"
                  text="移动打卡仅限本人操作，严谨代打卡等不诚信行为，如有发现后果自负。"
                ></van-text>
              </van-notice-bar>
            </van-linear-layout>
          </van-linear-layout>
        </van-cardu>
      </van-linear-layout>
      <van-linear-layout
        ref="linear_layout_40"
        class="cw-style-text-align"
        :wrap="true"
        style="--cw-style-text-align: center; text-align: center"
      >
        <van-button
          ref="button_11"
          class="cw-style-width cw-style-height cw-style-font-size"
          type="info"
          size="middle"
          :text="
                        $utils['ToString'](
                            'nasl.core.String',
                            $utils['ToString'](
                                'nasl.core.String',
                                `考勤打卡
`,
                            ) + $utils['ToString']('nasl.core.String', $utils['FormatTime'](nowTime, `HH:mm`)),
                        )
                    "
          squareroud="round"
          @click="button_11_click($event)"
          style="--cw-style-width: 160px; --cw-style-height: 160px; --cw-style-font-size: 24px; width: 160px; height: 160px; font-size: 24px"
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
          ref="linear_layout_46"
          class="cw-style-width"
          type="flex"
          :vusion-disabled-cut="true"
          style="--cw-style-width: 100%; width: 100%"
        >
          <van-button
            ref="button_12"
            class="van-button van-button--default van-dialog__cancel"
            text="取消"
            @click="button_12_click($event)"
          ></van-button>
          <van-button
            ref="button_13"
            class="van-button van-button--default van-dialog__confirm van-hairline--left"
            text="确认"
            @click="button_13_click($event)"
          ></van-button>
        </van-linear-layout>
      </template>
      <div
        ref="div_1"
        class="dialogchild cw-style-text-align"
        vusion-slot-name="default"
        :vusion-disabled-copy="true"
        :vusion-disabled-cut="true"
        env="alone"
        style="--cw-style-text-align: left; min-height: 100px; text-align: left"
      >
        <van-linear-layout
          ref="linear_layout_48"
          direction="vertical"
          gap="none"
        >
          <van-linear-layout
            ref="linear_layout_49"
            class="cw-style-text-align"
            :wrap="true"
            style="--cw-style-text-align: left; text-align: left"
          >
            <van-text
              ref="text_530"
              class="cw-style-text-align"
              text="确认进行外勤打卡吗？"
              style="--cw-style-text-align: left; text-align: left"
            ></van-text>
          </van-linear-layout>
          <van-linear-layout
            ref="linear_layout_50"
            :wrap="true"
          >
            <van-fieldtextarea
              ref="fieldtextarea_1"
              class="cw-style-text-align cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
              placeholder="请输入"
              :value.sync="clockIn.remark"
              style="--cw-style-text-align: left; --cw-style-border-style: solid; --cw-style-border-left-width: 1px; --cw-style-border-right-width: 1px; --cw-style-border-top-width: 1px; --cw-style-border-bottom-width: 1px; text-align: left; border-style: solid; border-top-width: 1px; border-left-width: 1px; border-right-width: 1px; border-bottom-width: 1px"
            ></van-fieldtextarea>
          </van-linear-layout>
        </van-linear-layout>
      </div>
    </van-dialog>
  </van-linear-layout>
</template>
<script>
export default {
  name: '/index/clockPage',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      clock: window.$genInitFromSchema('app.structures.DayStructure', undefined),
      nowTime: undefined,
      checkIn: window.$genInitFromSchema('app.dataSources.defaultDS.entities.AttendanceSetting', undefined),
      clockIn: window.$genInitFromSchema('app.dataSources.defaultDS.entities.AttendanceRecord', undefined),
    };
  },
  meta: {
    title: '考勤打卡',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: undefined,
  },
  methods: {
    async loadTime() {
      this.nowTime = window.$utils.CurrTime();
    },

    async clockPage_created(event) {
      await this.clockPage_created_created(event);
    },

    async clockPage_created_created() {
      this.clock = window.$genInitFromSchema(
        'app.structures.DayStructure',
        await window.LcapRequest({
          url: '/api/lcplogics/loadDayClock',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/m/index/clockPage/0',
          },
          data: {
            day: window.$utils.CurrDate(),
          },
        }),
      );
      this.checkIn = window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.AttendanceSetting',
        await window.LcapRequest({
          url: '/api/lcplogics/loadCheckIn',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/m/index/clockPage/0',
          },
          data: {},
        }),
      );
      await (async () => {
        setInterval(() => {
          this.loadTime();
        }, 1000);
      })();
    },

    async button_11_click(event) {
      await this.button_11_click_click(event);
    },

    async button_11_click_click() {
      const time1 = '13:00:00';
      if ((await window.$global.getDistance((this.checkIn || {}).location, await window.$global.getLocation())) >= (this.checkIn || {}).radius) {
        await this.$refs.dialog_1?.openModal?.();
      } else {
        this.clockIn.clockTime = window.$utils.CurrTime('global');
        this.clockIn.clockDate = window.$utils.CurrDate('global');
        this.clockIn.ifOutWork = false;
        this.clockIn.attendanceId = this.checkIn;

        if (window.$utils.CurrTime() <= time1) {
          if (window.$utils.CurrTime() <= (this.checkIn || {}).startTime) {
            this.clockIn.clockType = '0';
          } else {
            this.clockIn.clockType = '2';
          }
        } else if ((this.checkIn || {}).endTime <= window.$utils.CurrTime()) {
          this.clockIn.clockType = '1';
        } else {
          this.clockIn.clockType = '3';
        }

        window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.AttendanceRecord',
          await window.LcapRequest({
            url: '/api/attendance-record',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/m/index/clockPage/0',
            },

            data: this.clockIn,
          }),
        );
        await window.$global.showMessage(window.$utils.ToString('nasl.core.String', '打卡成功！'));
        this.clock = window.$genInitFromSchema(
          'app.structures.DayStructure',
          await window.LcapRequest({
            url: '/api/lcplogics/loadDayClock',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/m/index/clockPage/2',
            },
            data: {
              day: window.$utils.CurrDate(),
            },
          }),
        );
      }
    },

    async button_12_click(event) {
      await this.button_12_click_click(event);
    },

    async button_12_click_click() {
      await this.$refs.dialog_1?.closeModal?.();
    },

    async button_13_click(event) {
      await this.button_13_click_click(event);
    },

    async button_13_click_click() {
      const time1 = '13:00:00';
      if (false) { /* empty */ } else {
        this.clockIn.clockTime = window.$utils.CurrTime('global');
        this.clockIn.clockDate = window.$utils.CurrDate('global');
        this.clockIn.ifOutWork = false;
        this.clockIn.attendanceId = this.checkIn;

        if (window.$utils.CurrTime() <= time1) {
          if (window.$utils.CurrTime() <= (this.checkIn || {}).startTime) {
            this.clockIn.clockType = '0';
          } else {
            this.clockIn.clockType = '2';
          }
        } else if ((this.checkIn || {}).endTime <= window.$utils.CurrTime()) {
          this.clockIn.clockType = '1';
        } else {
          this.clockIn.clockType = '3';
        }

        window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.AttendanceRecord',
          await window.LcapRequest({
            url: '/api/attendance-record',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/m/index/clockPage/1',
            },

            data: this.clockIn,
          }),
        );
        await window.$global.showMessage(window.$utils.ToString('nasl.core.String', '打卡成功！'));
        this.clock = window.$genInitFromSchema(
          'app.structures.DayStructure',
          await window.LcapRequest({
            url: '/api/lcplogics/loadDayClock',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/m/index/clockPage/1',
            },
            data: {
              day: window.$utils.CurrDate(),
            },
          }),
        );
        await this.$refs.dialog_1?.closeModal?.();
        window.$genInitFromSchema('app.dataSources.defaultDS.entities.AttendanceRecord', window.$utils.Clear(this.clockIn, 'deep', 'app.dataSources.defaultDS.entities.AttendanceRecord'));
      }
    },

    genviewMatchExpression_180qcxq1() {
      return (() => {
        const it = window.$utils.GetDateCount(window.$utils.CurrDate('global'), 'day-week');
        if (window.$global.isEqual(it, 1)) {
          return '周一';
        } else if (window.$global.isEqual(it, 2)) {
          return '周二';
        } else if (window.$global.isEqual(it, 3)) {
          return '周三';
        } else if (window.$global.isEqual(it, 4)) {
          return '周四';
        } else if (window.$global.isEqual(it, 5)) {
          return '周五';
        } else if (window.$global.isEqual(it, 6)) {
          return '周六';
        } else {
          return '周日';
        }
      })();
    },

    genviewMatchExpression_0xkiwcs1() {
      return (() => {
        const it = window.$utils.GetDateCount(window.$utils.CurrDate('global'), 'day-week');
        if (window.$global.isEqual(it, 1)) {
          return '班';
        } else if (window.$global.isEqual(it, 2)) {
          return '班';
        } else if (window.$global.isEqual(it, 3)) {
          return '班';
        } else if (window.$global.isEqual(it, 4)) {
          return '班';
        } else if (window.$global.isEqual(it, 5)) {
          return '班';
        } else if (window.$global.isEqual(it, 6)) {
          return '休';
        } else {
          return '休';
        }
      })();
    },

    genviewMatchExpression_0wsvpot0() {
      return (() => {
        const it = ((this.clock || {}).clockIn || {}).clockTime;
        if (window.$global.isEqual(it, undefined)) {
          return '上班打卡';
        } else {
          return window.$utils.FormatTime(((this.clock || {}).clockIn || {}).clockTime, 'HH:mm');
        }
      })();
    },

    genviewMatchExpression_14pjqaz1() {
      return (() => {
        const it = ((this.clock || {}).clockOut || {}).clockTime;
        if (window.$global.isEqual(it, undefined)) {
          return '下班打卡';
        } else {
          return window.$utils.FormatTime(((this.clock || {}).clockOut || {}).clockTime, 'HH:mm');
        }
      })();
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.clockPage_created();
  },
};
</script>
