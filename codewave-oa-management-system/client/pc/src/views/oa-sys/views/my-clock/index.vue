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
      mode="flex"
      direction="horizontal"
      justify="start"
      alignment="start"
      style="--custom-start: auto; height: 90vh"
    >
      <u-linear-layout
        ref="linear_layout_5"
        :wrap="true"
        widthStretch="true"
      >
        <u-panel
          ref="panel_1"
          style="--panel-head-padding-y: 0px; --panel-body-padding-y: 0px; --custom-start: auto; height: 90vh"
        >
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
            mode="flex"
            justify="start"
            alignment="start"
          >
            <u-linear-layout
              ref="linear_layout_8"
              class="cw-style-width"
              direction="horizontal"
              :wrap="true"
              widthStretch="false"
              style="--cw-style-width: 272px; width: 272px"
            >
              <u-linear-layout
                ref="linear_layout_14"
                direction="vertical"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_15"
                  :wrap="true"
                >
                  <cw-antd-calendar
                    ref="cw_antd_calendar_1"
                    :value.sync="chooseDate"
                    @onSelect="cw_antd_calendar_1_onSelect($event)"
                  ></cw-antd-calendar>
                </u-linear-layout>
                <u-linear-layout
                  ref="linear_layout_16"
                  :wrap="true"
                >
                  <u-divider
                    ref="divider_1"
                    class="cw-style-color"
                    dashed="a"
                    style="--cw-style-color: #717376; color: #717376"
                  ></u-divider>
                </u-linear-layout>
                <u-linear-layout
                  ref="linear_layout_17"
                  :wrap="true"
                >
                  <u-text
                    ref="text_447"
                    class="cw-style-color"
                    text="温馨提示：
1. 按公司规定，打卡时间以分钟作为单位。
2. 如您忘记打卡或打卡失败，请在3个工作日内提交补签卡流程进行补签。"
                    style="--cw-style-color: #867f7f; color: #867f7f"
                  ></u-text>
                </u-linear-layout>
              </u-linear-layout>
            </u-linear-layout>
            <u-linear-layout
              ref="linear_layout_12"
              class="cw-style-padding-left cw-style-padding cw-style-padding-top cw-style-padding-right cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
              direction="horizontal"
              :wrap="true"
              widthStretch="true"
              style="--cw-style-padding-left: 20px; --cw-style-padding-top: 0px; --cw-style-padding-right: 20px; --cw-style-border-style: solid; --cw-style-border-left-width: 1px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; border-left-width: 1px; border-style: solid; border-top-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-left-color: #cbeded; padding-left: 20px; padding-right: 20px; padding-top: 0px; --custom-start: auto; height: 85vh"
            >
              <u-linear-layout
                ref="linear_layout_19"
                direction="vertical"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_20"
                  :wrap="true"
                >
                  <u-text
                    ref="text_449"
                    class="cw-style-font-size cw-style-font-weight cw-style-color"
                    size="large"
                    text="每日打卡记录"
                    style="--cw-style-font-size: 20px; --cw-style-font-weight: bold; --cw-style-color: #000000; font-size: 20px; font-weight: bold; color: #000000"
                  ></u-text>
                </u-linear-layout>
                <u-linear-layout
                  ref="linear_layout_21"
                  class="cw-style-height"
                  :wrap="true"
                  style="--cw-style-height: 80vh; height: 80vh"
                >
                  <u-grid-view
                    ref="grid_view_1"
                    class="cw-style-height cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                    :pageNumber="1"
                    :pageSize="50"
                    :repeat="1"
                    :dataSource="__grid_view_1_handleDataSourceLoad()"
                    v-dependencies.reload="[]"
                    :readonly="true"
                    key="grid_view_1"
                    style="--cw-style-height: 100%; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid; height: 100%"
                  >
                    <template
                      #item="current"

                    >
                      <u-linear-layout
                        :ref="`linear_layout_22_${(current || {}).__nodeKey || (current || {}).index}`"
                        class="cw-style-background-color cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                        direction="horizontal"
                        :wrap="true"
                        style="--cw-style-background-color: #f9f9f9; --cw-style-padding-left: 8px; --cw-style-padding-bottom: 8px; --cw-style-padding-top: 8px; --cw-style-padding-right: 8px; --cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; background-color: #f9f9f9; padding-top: 8px; padding-left: 8px; padding-bottom: 8px; padding-right: 8px; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px"
                      >
                        <u-grid-layout :ref="`grid_layout_1_${(current || {}).__nodeKey || (current || {}).index}`">
                          <u-grid-layout-row
                            :ref="`grid_layout_row_1_${(current || {}).__nodeKey || (current || {}).index}`"
                            :repeat="24"
                          >
                            <u-grid-layout-column
                              :ref="`grid_layout_column_1_${(current || {}).__nodeKey || (current || {}).index}`"
                              class="cw-style-text-align"
                              :span="8"
                              :wrap="true"
                              style="--cw-style-text-align: center; text-align: center"
                            >
                              <u-text
                                :ref="`text_450_${(current || {}).__nodeKey || (current || {}).index}`"
                                class="cw-style-margin-right cw-style-margin cw-style-color"
                                :text="$utils['ToString']('nasl.core.String', $utils['FormatDate'](((current || {}).item || {}).date, `MM-dd`))"
                                style="--cw-style-margin-right: 8px; --cw-style-color: #000000; margin-right: 8px; color: #000000"
                              ></u-text>
                              <u-text
                                :ref="`text_452_${(current || {}).__nodeKey || (current || {}).index}`"
                                class="cw-style-color"
                                :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_12qri970(current))"
                                style="--cw-style-color: #000000; color: #000000"
                              ></u-text>
                            </u-grid-layout-column>
                            <u-grid-layout-column
                              :ref="`grid_layout_column_2_${(current || {}).__nodeKey || (current || {}).index}`"
                              :span="8"
                              :wrap="true"
                            >
                              <u-linear-layout
                                :ref="`linear_layout_24_${(current || {}).__nodeKey || (current || {}).index}`"
                                :key="`linear_layout_24_${(current || {}).__nodeKey || (current || {}).index}`"
                                justify="space-between"
                                :wrap="true"
                                v-if="genviewMatchExpression_14pri3g0(current)"
                              >
                                <u-linear-layout
                                  :ref="`linear_layout_25_${(current || {}).__nodeKey || (current || {}).index}`"
                                  :wrap="true"
                                >
                                  <u-text
                                    :ref="`text_453_${(current || {}).__nodeKey || (current || {}).index}`"
                                    class="cw-style-color"
                                    :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1w8h3h21(current))"
                                    style="--cw-style-color: #000000; color: #000000"
                                  ></u-text>
                                </u-linear-layout>
                                <u-linear-layout
                                  :ref="`linear_layout_26_${(current || {}).__nodeKey || (current || {}).index}`"
                                  :wrap="true"
                                >
                                  <u-text
                                    :ref="`text_454_${(current || {}).__nodeKey || (current || {}).index}`"
                                    class="cw-style-color"
                                    :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_023usqs0(current))"
                                    style="--cw-style-color: #000000; color: #000000"
                                  ></u-text>
                                </u-linear-layout>
                              </u-linear-layout>
                              <u-linear-layout
                                :ref="`linear_layout_27_${(current || {}).__nodeKey || (current || {}).index}`"
                                :key="`linear_layout_27_${(current || {}).__nodeKey || (current || {}).index}`"
                                direction="horizontal"
                                :wrap="true"
                                v-if="genviewMatchExpression_0j9fpio1(current)"
                              >
                                <u-text
                                  :ref="`text_455_${(current || {}).__nodeKey || (current || {}).index}`"
                                  text="休息日"
                                ></u-text>
                              </u-linear-layout>
                            </u-grid-layout-column>
                            <u-grid-layout-column
                              :ref="`grid_layout_column_3_${(current || {}).__nodeKey || (current || {}).index}`"
                              :span="8"
                              :wrap="true"
                            >
                              <u-popup-combination
                                :ref="`popup_combination_2_${(current || {}).__nodeKey || (current || {}).index}`"
                                :key="`popup_combination_2_${(current || {}).__nodeKey || (current || {}).index}`"
                                :opened="false"
                                v-if="$utils['HasValue']({ type: 'app.dataSources.defaultDS.entities.LeaveProcess', value: ((current || {}).item || {}).leave })"
                              >
                                <template
                                  #reference

                                >
                                  <i-ico
                                    :ref="`ico_2_${(current || {}).__nodeKey || (current || {}).index}`"
                                    name="/assets/user/jasonzcmu/1766716846876_2f0b63ca509a45b1a31b05f02a595eab.svg"
                                    icotype="only"
                                  >
                                    <u-text
                                      :ref="`text_459_${(current || {}).__nodeKey || (current || {}).index}`"
                                      text="图标"
                                    ></u-text>
                                  </i-ico>
                                </template>
                                <u-linear-layout
                                  :ref="`linear_layout_30_${(current || {}).__nodeKey || (current || {}).index}`"
                                  direction="vertical"
                                  :wrap="true"
                                >
                                  <u-linear-layout
                                    :ref="`linear_layout_31_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :wrap="true"
                                  >
                                    <u-text
                                      :ref="`text_460_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', $utils['EnumItemToText']('app.enums.LeavePtype', (((current || {}).item || {}).leave || {}).type)) + $utils['ToString']('nasl.core.String', `：`) + $utils['ToString']('nasl.core.Decimal', (((current || {}).item || {}).leave || {}).leaveTime) + $utils['ToString']('nasl.core.String', `小时`))"
                                    ></u-text>
                                  </u-linear-layout>
                                  <u-linear-layout
                                    :ref="`linear_layout_32_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :wrap="true"
                                  >
                                    <u-text
                                      :ref="`text_461_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `时间：`) + $utils['ToString']('nasl.core.Date', (((current || {}).item || {}).leave || {}).startDate) + $utils['ToString']('nasl.core.String', ` `) + $utils['ToString']('nasl.core.Time', (((current || {}).item || {}).leave || {}).startTime) + $utils['ToString']('nasl.core.String', `至`) + $utils['ToString']('nasl.core.Date', (((current || {}).item || {}).leave || {}).endDate) + $utils['ToString']('nasl.core.String', ` `) + $utils['ToString']('nasl.core.Time', (((current || {}).item || {}).leave || {}).endTime))"
                                    ></u-text>
                                  </u-linear-layout>
                                </u-linear-layout>
                              </u-popup-combination>
                            </u-grid-layout-column>
                          </u-grid-layout-row>
                        </u-grid-layout>
                      </u-linear-layout>
                    </template>
                  </u-grid-view>
                </u-linear-layout>
              </u-linear-layout>
            </u-linear-layout>
          </u-linear-layout>
        </u-panel>
      </u-linear-layout>
      <u-panel
        ref="panel_2"
        class="cw-style-width"
        style="--cw-style-width: 288px; width: 288px; --custom-start: auto; height: 90vh"
      >
        <template
          #title

        >
          <u-text
            ref="text_463"
            class="cw-style-color"
            size="large"
            text="我的假期"
            style="--cw-style-color: #000000; color: #000000"
          ></u-text>
        </template>
        <template
          #extra

        ></template>
        <u-linear-layout
          ref="linear_layout_34"
          direction="vertical"
          :wrap="true"
        >
          <u-linear-layout
            ref="linear_layout_35"
            :wrap="true"
          >
            <i-ico
              ref="ico_4"
              class="cw-style-font-size"
              name="/assets/user/jasonzcmu/1766717407878_b742e80a88f04a219c03c9fdddbe6184.svg"
              icotype="left"
              style="--cw-style-font-size: 36px; font-size: 36px"
            >
              <u-linear-layout
                ref="linear_layout_38"
                direction="vertical"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_39"
                  class="cw-style-padding-bottom cw-style-padding"
                  mode="block"
                  justify="start"
                  style="--cw-style-padding-bottom: 15px; padding-bottom: 15px"
                >
                  <u-text
                    ref="text_467"
                    class="cw-style-font-weight"
                    text="2.0"
                    style="--cw-style-font-weight: bold; font-weight: bold"
                  ></u-text>
                  <u-text
                    ref="text_472"
                    text="可用年假（天）"
                    display="block"
                  ></u-text>
                </u-linear-layout>
              </u-linear-layout>
            </i-ico>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_45"
            :wrap="true"
          >
            <i-ico
              ref="ico_6"
              class="cw-style-font-size"
              name="/assets/user/jasonzcmu/1766717572338_52708b442f6a469993a7b2e514b93fa3.svg"
              icotype="left"
              style="--cw-style-font-size: 36px; font-size: 36px"
            >
              <u-linear-layout
                ref="linear_layout_46"
                direction="vertical"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_47"
                  class="cw-style-padding-bottom cw-style-padding"
                  mode="block"
                  justify="start"
                  style="--cw-style-padding-bottom: 15px; padding-bottom: 15px"
                >
                  <u-text
                    ref="text_473"
                    class="cw-style-font-weight"
                    text="126.0"
                    style="--cw-style-font-weight: bold; font-weight: bold"
                  ></u-text>
                  <u-text
                    ref="text_474"
                    text="可用调休（小时）"
                    display="block"
                  ></u-text>
                </u-linear-layout>
              </u-linear-layout>
            </i-ico>
          </u-linear-layout>
        </u-linear-layout>
      </u-panel>
    </u-linear-layout>
    <u-linear-layout
      ref="linear_layout_6"
      :wrap="true"
    ></u-linear-layout>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/myClock',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      chooseDate: undefined,
    };
  },
  meta: {
    title: '我的考勤',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async myClock_created(event) {
      await this.myClock_created_created(event);
    },

    async myClock_created_created() {
      this.$global.frontendVariables.title = '我的考勤';
    },

    async cw_antd_calendar_1_onSelect(event) {
      await this.cw_antd_calendar_1_onSelect_onSelect(event);
    },

    async cw_antd_calendar_1_onSelect_onSelect() {
      if (window.$utils.CurrDate() < this.chooseDate) { /* empty */ } else {
        await this.$refs.grid_view_1?.reload?.();
      }
    },

    genviewMatchExpression_12qri970(current) {
      return (() => {
        const it = window.$utils.GetDateCount(((current || {}).item || {}).date, 'day-week');
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

    genviewMatchExpression_14pri3g0(current) {
      return (() => {
        const it = window.$utils.GetDateCount(((current || {}).item || {}).date, 'day-week');
        if (window.$global.isEqual(it, 1)) {
          return true;
        } else if (window.$global.isEqual(it, 2)) {
          return true;
        } else if (window.$global.isEqual(it, 3)) {
          return true;
        } else if (window.$global.isEqual(it, 4)) {
          return true;
        } else if (window.$global.isEqual(it, 5)) {
          return true;
        } else if (window.$global.isEqual(it, 6)) {
          return false;
        } else {
          return false;
        }
      })();
    },

    genviewMatchExpression_1w8h3h21(current) {
      return (() => {
        const it = ((((current || {}).item || {}).clock || {}).clockIn || {}).clockTime;
        if (window.$global.isEqual(it, undefined)) {
          return '未打卡';
        } else {
          return window.$utils.FormatTime(((((current || {}).item || {}).clock || {}).clockIn || {}).clockTime, 'HH:mm');
        }
      })();
    },

    genviewMatchExpression_023usqs0(current) {
      return (() => {
        const it = ((((current || {}).item || {}).clock || {}).clockOut || {}).clockTime;
        if (window.$global.isEqual(it, undefined)) {
          return '未打卡';
        } else {
          return window.$utils.FormatTime(((((current || {}).item || {}).clock || {}).clockOut || {}).clockTime, 'HH:mm');
        }
      })();
    },

    genviewMatchExpression_0j9fpio1(current) {
      return (() => {
        const it = window.$utils.GetDateCount(((current || {}).item || {}).date, 'day-week');
        if (window.$global.isEqual(it, 1)) {
          return false;
        } else if (window.$global.isEqual(it, 2)) {
          return false;
        } else if (window.$global.isEqual(it, 3)) {
          return false;
        } else if (window.$global.isEqual(it, 4)) {
          return false;
        } else if (window.$global.isEqual(it, 5)) {
          return false;
        } else if (window.$global.isEqual(it, 6)) {
          return true;
        } else { /* empty */ }
      })();
    },

    __grid_view_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__grid_view_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          'nasl.collection.List<app.structures.MyClockStructure>',
          await window.LcapRequest({
            url: '/api/lcplogics/loadClockRecord',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/myClock/0',
            },
            data: {
              chooseDate: this.chooseDate,
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
    await this.myClock_created();
  },
};
</script>
