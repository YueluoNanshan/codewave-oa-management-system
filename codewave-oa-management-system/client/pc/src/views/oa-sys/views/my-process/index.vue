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
      <fl-process-my-process ref="fl_process_my_process_3">
        <u-tabs
          ref="tabs_2"
          class="cw-style-color"
          :value.sync="myProcessTabValue"
          :loadOnActive="true"
          appear="line"
          @select="tabs_2_select($event)"
          style="--cw-style-color: #3dd7ab; color: #3dd7ab"
        >
          <u-tab
            ref="tab_5"
            value="待办"
          >
            <template
              #title

            >
              <u-text
                ref="text_511"
                text="我的待办"
              ></u-text>
            </template>
            <u-linear-layout
              ref="linear_layout_45"
              direction="vertical"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_43"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_42"
                  :wrap="false"
                  mode="flex"
                  direction="horizontal"
                  alignment="start"
                  justify="space-between"
                >
                  <u-linear-layout
                    ref="linear_layout_40"
                    gap="normal"
                    mode="flex"
                    justify="start"
                    alignment="center"
                    widthStretch="true"
                    style="--space-base: 0px"
                  >
                    <u-linear-layout
                      ref="linear_layout_37"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_512"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="流程"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-select
                        ref="select_9"
                        placeholder="请选择"
                        :pagination="false"
                        :pageSize="20"
                        :emptyValueIsNull="true"
                        :value.sync="myProcessFilter.procDefKey"
                        :dataSource="__select_9_handleDataSourceLoad()"
                        textField="procDefTitle"
                        valueField="procDefKey"
                        :filterable="true"
                        :clearable="true"
                        widthStretch="false"
                        key="select_9"
                      >
                        <template
                          #option=""

                        ></template>
                        <template
                          #renderFooter

                        ></template>
                      </u-select>
                    </u-linear-layout>
                    <u-linear-layout
                      ref="linear_layout_38"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_513"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="发起时间"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-date-picker
                        ref="date_picker_5"
                        :clearable="true"
                        :emptyValueIsNull="true"
                        :startDate.sync="myProcessFilter.procInstStartTimeAfter"
                        :endDate.sync="myProcessFilter.procInstStartTimeBefore"
                        :range="true"
                        placeholder="开始日期"
                        placeholderRight="结束日期"
                        converter="date"
                      ></u-date-picker>
                    </u-linear-layout>
                    <u-linear-layout
                      ref="linear_layout_39"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_514"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="发起人"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-select
                        ref="select_10"
                        @sync:state="(key, val) => onSyncState('select_10', key, val)"
                        placeholder="请选择"
                        :pagination="true"
                        :pageSize="20"
                        :emptyValueIsNull="true"
                        :value.sync="myProcessFilter.procInstInitiator"
                        :dataSource="__select_10_handleDataSourceLoad()"
                        valueField="userName"
                        :optionIsSlot="true"
                        :clearable="true"
                        :filterable="true"
                        key="select_10"
                      >
                        <template
                          #option="current"

                        >
                          <u-text
                            :ref="`text_515_${(current || {}).__nodeKey || (current || {}).index}`"
                            :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_013gc860(current))"
                            overflow="ellipsis"
                          ></u-text>
                        </template>
                        <template
                          #renderFooter

                        ></template>
                      </u-select>
                    </u-linear-layout>
                  </u-linear-layout>
                  <u-linear-layout
                    ref="linear_layout_41"
                    :wrap="true"
                  >
                    <u-button
                      ref="button_11"
                      color="primary"
                      text="查 询"
                      @click="button_11_click($event)"
                    ></u-button>
                  </u-linear-layout>
                </u-linear-layout>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_44"
                :wrap="true"
              >
                <u-table-view
                  ref="table_view_5"
                  @sync:state="(key, val) => onSyncState('table_view_5', key, val)"
                  :pagination="true"
                  :pageSize="20"
                  :pageNumber="1"
                  :dataSource="__table_view_5_handleDataSourceLoad()"
                  key="table_view_5"
                >
                  <u-table-view-column
                    ref="table_view_column_27"
                    key="table_view_column_27"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_516"
                        text="流程标题"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_517_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_04r4uom0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_27_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_28"
                    key="table_view_column_28"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_518"
                        text="流程类型"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_519_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1t73fj71(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_28_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_29"
                    key="table_view_column_29"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_520"
                        text="当前节点"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_521_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1qqzkof0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_29_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_30"
                    key="table_view_column_30"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_522"
                        text="发起人"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_523_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0fdp8qc0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_30_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_31"
                    key="table_view_column_31"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_524"
                        text="发起时间"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_525_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0mu8ozt1(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_31_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_32"
                    key="table_view_column_32"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_526"
                        text="操作"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-link
                        :ref="`link_5_${(current || {}).__nodeKey || (current || {}).index}`"
                        text="审批"
                        @click="link_5_click($event, current)"
                      ></u-link>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_32_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
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
            </u-linear-layout>
          </u-tab>
          <u-tab
            ref="tab_6"
            value="已办"
          >
            <template
              #title

            >
              <u-text
                ref="text_527"
                text="我的已办"
              ></u-text>
            </template>
            <u-linear-layout
              ref="linear_layout_54"
              direction="vertical"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_52"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_51"
                  :wrap="false"
                  mode="flex"
                  direction="horizontal"
                  alignment="start"
                  justify="space-between"
                >
                  <u-linear-layout
                    ref="linear_layout_49"
                    gap="normal"
                    mode="flex"
                    justify="start"
                    alignment="center"
                    widthStretch="true"
                    style="--space-base: 0px"
                  >
                    <u-linear-layout
                      ref="linear_layout_46"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_528"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="流程"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-select
                        ref="select_11"
                        placeholder="请选择"
                        :pagination="false"
                        :pageSize="20"
                        :emptyValueIsNull="true"
                        :value.sync="myProcessFilter.procDefKey"
                        :dataSource="__select_11_handleDataSourceLoad()"
                        textField="procDefTitle"
                        valueField="procDefKey"
                        :filterable="true"
                        :clearable="true"
                        widthStretch="false"
                        key="select_11"
                      >
                        <template
                          #option=""

                        ></template>
                        <template
                          #renderFooter

                        ></template>
                      </u-select>
                    </u-linear-layout>
                    <u-linear-layout
                      ref="linear_layout_47"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_529"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="发起时间"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-date-picker
                        ref="date_picker_6"
                        :clearable="true"
                        :emptyValueIsNull="true"
                        :startDate.sync="myProcessFilter.procInstStartTimeAfter"
                        :endDate.sync="myProcessFilter.procInstStartTimeBefore"
                        :range="true"
                        placeholder="开始日期"
                        placeholderRight="结束日期"
                        converter="date"
                      ></u-date-picker>
                    </u-linear-layout>
                    <u-linear-layout
                      ref="linear_layout_48"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_530"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="发起人"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-select
                        ref="select_12"
                        @sync:state="(key, val) => onSyncState('select_12', key, val)"
                        placeholder="请选择"
                        :pagination="true"
                        :pageSize="20"
                        :emptyValueIsNull="true"
                        :value.sync="myProcessFilter.procInstInitiator"
                        :dataSource="__select_12_handleDataSourceLoad()"
                        valueField="userName"
                        :optionIsSlot="true"
                        :clearable="true"
                        :filterable="true"
                        key="select_12"
                      >
                        <template
                          #option="current"

                        >
                          <u-text
                            :ref="`text_531_${(current || {}).__nodeKey || (current || {}).index}`"
                            :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_17vxn3a1(current))"
                            overflow="ellipsis"
                          ></u-text>
                        </template>
                        <template
                          #renderFooter

                        ></template>
                      </u-select>
                    </u-linear-layout>
                  </u-linear-layout>
                  <u-linear-layout
                    ref="linear_layout_50"
                    :wrap="true"
                  >
                    <u-button
                      ref="button_12"
                      color="primary"
                      text="查 询"
                      @click="button_12_click($event)"
                    ></u-button>
                  </u-linear-layout>
                </u-linear-layout>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_53"
                :wrap="true"
              >
                <u-table-view
                  ref="table_view_6"
                  @sync:state="(key, val) => onSyncState('table_view_6', key, val)"
                  :pagination="true"
                  :pageSize="20"
                  :pageNumber="1"
                  :dataSource="__table_view_6_handleDataSourceLoad()"
                  key="table_view_6"
                >
                  <u-table-view-column
                    ref="table_view_column_33"
                    key="table_view_column_33"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_532"
                        text="流程标题"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_533_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0h8mtuu0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_33_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_34"
                    key="table_view_column_34"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_534"
                        text="流程类型"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_535_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0rcksug0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_34_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_35"
                    key="table_view_column_35"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_536"
                        text="处理节点"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_537_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1d6a1qo1(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_35_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_36"
                    key="table_view_column_36"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_538"
                        text="发起人"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_539_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_13gox2z1(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_36_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_37"
                    key="table_view_column_37"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_540"
                        text="发起时间"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_541_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0aa6e2m0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_37_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_38"
                    key="table_view_column_38"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_542"
                        text="操作"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-link
                        :ref="`link_6_${(current || {}).__nodeKey || (current || {}).index}`"
                        text="查看"
                        @click="link_6_click($event, current)"
                      ></u-link>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_38_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
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
            </u-linear-layout>
          </u-tab>
          <u-tab
            ref="tab_7"
            value="发起"
          >
            <template
              #title

            >
              <u-text
                ref="text_543"
                text="我的发起"
              ></u-text>
            </template>
            <u-linear-layout
              ref="linear_layout_62"
              direction="vertical"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_60"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_59"
                  :wrap="false"
                  mode="flex"
                  direction="horizontal"
                  alignment="start"
                  justify="space-between"
                >
                  <u-linear-layout
                    ref="linear_layout_57"
                    gap="normal"
                    mode="flex"
                    justify="start"
                    alignment="center"
                    widthStretch="true"
                    style="--space-base: 0px"
                  >
                    <u-linear-layout
                      ref="linear_layout_55"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_544"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="流程"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-select
                        ref="select_13"
                        placeholder="请选择"
                        :pagination="false"
                        :pageSize="20"
                        :emptyValueIsNull="true"
                        :value.sync="myProcessFilter.procDefKey"
                        :dataSource="__select_13_handleDataSourceLoad()"
                        textField="procDefTitle"
                        valueField="procDefKey"
                        :filterable="true"
                        :clearable="true"
                        widthStretch="false"
                        key="select_13"
                      >
                        <template
                          #option=""

                        ></template>
                        <template
                          #renderFooter

                        ></template>
                      </u-select>
                    </u-linear-layout>
                    <u-linear-layout
                      ref="linear_layout_56"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_545"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="发起时间"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-date-picker
                        ref="date_picker_7"
                        :clearable="true"
                        :emptyValueIsNull="true"
                        :startDate.sync="myProcessFilter.procInstStartTimeAfter"
                        :endDate.sync="myProcessFilter.procInstStartTimeBefore"
                        :range="true"
                        placeholder="开始日期"
                        placeholderRight="结束日期"
                        converter="date"
                      ></u-date-picker>
                    </u-linear-layout>
                  </u-linear-layout>
                  <u-linear-layout
                    ref="linear_layout_58"
                    :wrap="true"
                  >
                    <u-button
                      ref="button_13"
                      color="primary"
                      text="查 询"
                      @click="button_13_click($event)"
                    ></u-button>
                  </u-linear-layout>
                </u-linear-layout>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_61"
                :wrap="true"
              >
                <u-table-view
                  ref="table_view_7"
                  @sync:state="(key, val) => onSyncState('table_view_7', key, val)"
                  :pagination="true"
                  :pageSize="20"
                  :pageNumber="1"
                  :dataSource="__table_view_7_handleDataSourceLoad()"
                  key="table_view_7"
                >
                  <u-table-view-column
                    ref="table_view_column_39"
                    key="table_view_column_39"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_546"
                        text="流程标题"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_547_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_16s3uk31(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_39_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_40"
                    key="table_view_column_40"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_548"
                        text="流程类型"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_549_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0nt3f0j0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_40_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_41"
                    key="table_view_column_41"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_550"
                        text="当前节点"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_551_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1ou4cjk0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_41_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_42"
                    key="table_view_column_42"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_552"
                        text="当前处理人"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_553_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0z869v40(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_42_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_43"
                    key="table_view_column_43"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_554"
                        text="发起人"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_555_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1ead28z0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_43_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_44"
                    key="table_view_column_44"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_556"
                        text="发起时间"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_557_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1fuezhs0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_44_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_45"
                    key="table_view_column_45"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_558"
                        text="操作"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-link
                        :ref="`link_7_${(current || {}).__nodeKey || (current || {}).index}`"
                        text="查看"
                        @click="link_7_click($event, current)"
                      ></u-link>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_45_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
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
            </u-linear-layout>
          </u-tab>
          <u-tab
            ref="tab_8"
            value="抄送"
          >
            <template
              #title

            >
              <u-text
                ref="text_559"
                text="抄送我的"
              ></u-text>
            </template>
            <u-linear-layout
              ref="linear_layout_72"
              direction="vertical"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_70"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_69"
                  :wrap="false"
                  mode="flex"
                  direction="horizontal"
                  alignment="start"
                  justify="space-between"
                >
                  <u-linear-layout
                    ref="linear_layout_67"
                    gap="normal"
                    mode="flex"
                    justify="start"
                    alignment="center"
                    widthStretch="true"
                    style="--space-base: 0px"
                  >
                    <u-linear-layout
                      ref="linear_layout_63"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_560"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="流程"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-select
                        ref="select_14"
                        placeholder="请选择"
                        :pagination="false"
                        :pageSize="20"
                        :emptyValueIsNull="true"
                        :value.sync="myProcessFilter.procDefKey"
                        :dataSource="__select_14_handleDataSourceLoad()"
                        textField="procDefTitle"
                        valueField="procDefKey"
                        :filterable="true"
                        :clearable="true"
                        widthStretch="false"
                        key="select_14"
                      >
                        <template
                          #option=""

                        ></template>
                        <template
                          #renderFooter

                        ></template>
                      </u-select>
                    </u-linear-layout>
                    <u-linear-layout
                      ref="linear_layout_64"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_561"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="发起时间"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-date-picker
                        ref="date_picker_8"
                        :clearable="true"
                        :emptyValueIsNull="true"
                        :startDate.sync="myProcessFilter.procInstStartTimeAfter"
                        :endDate.sync="myProcessFilter.procInstStartTimeBefore"
                        :range="true"
                        placeholder="开始日期"
                        placeholderRight="结束日期"
                        converter="date"
                      ></u-date-picker>
                    </u-linear-layout>
                    <u-linear-layout
                      ref="linear_layout_65"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_562"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="发起人"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-select
                        ref="select_15"
                        @sync:state="(key, val) => onSyncState('select_15', key, val)"
                        placeholder="请选择"
                        :pagination="true"
                        :pageSize="20"
                        :emptyValueIsNull="true"
                        :value.sync="myProcessFilter.procInstInitiator"
                        :dataSource="__select_15_handleDataSourceLoad()"
                        valueField="userName"
                        :optionIsSlot="true"
                        :clearable="true"
                        :filterable="true"
                        key="select_15"
                      >
                        <template
                          #option="current"

                        >
                          <u-text
                            :ref="`text_563_${(current || {}).__nodeKey || (current || {}).index}`"
                            :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1dgtkrs0(current))"
                            overflow="ellipsis"
                          ></u-text>
                        </template>
                        <template
                          #renderFooter

                        ></template>
                      </u-select>
                    </u-linear-layout>
                    <u-linear-layout
                      ref="linear_layout_66"
                      class="cw-style-margin-bottom cw-style-margin cw-style-margin-right"
                      direction="horizontal"
                      :wrap="true"
                      mode="flex"
                      alignment="center"
                      justify="end"
                      gap="normal"
                      widthStretch="false"
                      style="--cw-style-margin-bottom: 20px; --cw-style-margin-right: 16px; margin-bottom: 20px; margin-right: 16px"
                    >
                      <u-text
                        ref="text_564"
                        class="cw-style-width cw-style-text-align cw-style-padding-right cw-style-padding"
                        text="查看状态"
                        widthStretch="false"
                        style="--cw-style-width: 76px; --cw-style-text-align: right; --cw-style-padding-right: 20px; width: 76px; text-align: right; padding-right: 20px"
                      ></u-text>
                      <u-select
                        ref="select_16"
                        placeholder="请选择"
                        :pagination="false"
                        :pageSize="20"
                        :emptyValueIsNull="true"
                        :clearable="true"
                        :value.sync="myProcessFilter.viewed"
                        widthStretch="false"
                        key="select_16"
                      >
                        <u-select-item
                          ref="select_item_3"
                          :value="false"
                          text="未查看"
                        ></u-select-item>
                        <u-select-item
                          ref="select_item_4"
                          :value="true"
                          text="已查看"
                        ></u-select-item>
                        <template
                          #option=""

                        ></template>
                        <template
                          #renderFooter

                        ></template>
                      </u-select>
                    </u-linear-layout>
                  </u-linear-layout>
                  <u-linear-layout
                    ref="linear_layout_68"
                    :wrap="true"
                  >
                    <u-button
                      ref="button_14"
                      color="primary"
                      text="查 询"
                      @click="button_14_click($event)"
                    ></u-button>
                  </u-linear-layout>
                </u-linear-layout>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_71"
                :wrap="true"
              >
                <u-table-view
                  ref="table_view_8"
                  @sync:state="(key, val) => onSyncState('table_view_8', key, val)"
                  :pagination="true"
                  :pageSize="20"
                  :pageNumber="1"
                  :dataSource="__table_view_8_handleDataSourceLoad()"
                  key="table_view_8"
                >
                  <u-table-view-column
                    ref="table_view_column_46"
                    key="table_view_column_46"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_565"
                        text="流程标题"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_566_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1co234q0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_46_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_47"
                    key="table_view_column_47"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_567"
                        text="流程类型"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_568_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0pswfl51(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_47_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_48"
                    key="table_view_column_48"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_569"
                        text="当前节点"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_570_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1yp5lox1(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_48_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_49"
                    key="table_view_column_49"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_571"
                        text="当前处理人"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_572_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1558qrc0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_49_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_50"
                    key="table_view_column_50"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_573"
                        text="发起人"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_574_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0d4f47h0(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_50_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_51"
                    key="table_view_column_51"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_575"
                        text="发起时间"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-text
                        :ref="`text_576_${(current || {}).__nodeKey || (current || {}).index}`"
                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1vo8bb51(current))"
                      ></u-text>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_51_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                    </template>
                    <template
                      #editcell=""

                    ></template>
                    <template
                      #expand-content=""

                    ></template>
                  </u-table-view-column>
                  <u-table-view-column
                    ref="table_view_column_52"
                    key="table_view_column_52"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_577"
                        text="操作"
                      ></u-text>
                    </template>
                    <template
                      #cell="current"

                    >
                      <u-link
                        :ref="`link_8_${(current || {}).__nodeKey || (current || {}).index}`"
                        text="查看"
                        @click="link_8_click($event, current)"
                      ></u-link>
                    </template>
                    <template
                      #expander="current"

                    >
                      <u-table-view-expander :ref="`table_view_expander_52_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
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
            </u-linear-layout>
          </u-tab>
          <template
            #extra

          ></template>
          <template
            #title=""

          ></template>
          <template
            #content=""

          ></template>
        </u-tabs>
      </fl-process-my-process>
    </u-panel>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/myProcess',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      myProcessTabValue: undefined,
      myProcessFilter: window.$genInitFromSchema('{procDefKey: nasl.core.String, procInstInitiator: nasl.core.String, procInstStartTimeAfter: nasl.core.DateTime, procInstStartTimeBefore: nasl.core.DateTime, viewed: nasl.core.Boolean}', undefined),
      select_10_state_page: undefined,
      select_10_state_size: undefined,
      select_10_state_filterText: undefined,
      table_view_5_state_page: undefined,
      table_view_5_state_size: undefined,
      select_12_state_page: undefined,
      select_12_state_size: undefined,
      select_12_state_filterText: undefined,
      table_view_6_state_page: undefined,
      table_view_6_state_size: undefined,
      table_view_7_state_page: undefined,
      table_view_7_state_size: undefined,
      select_15_state_page: undefined,
      select_15_state_size: undefined,
      select_15_state_filterText: undefined,
      table_view_8_state_page: undefined,
      table_view_8_state_size: undefined,
    };
  },
  meta: {
    title: '我的流程',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async reloadFilter() {
      this.myProcessFilter.procDefKey = undefined;
      this.myProcessFilter.procInstInitiator = undefined;
      this.myProcessFilter.procInstStartTimeAfter = undefined;
      this.myProcessFilter.procInstStartTimeBefore = undefined;
      this.myProcessFilter.viewed = false;
    },

    async getMyPendingTasks(page, size) {
      let result = window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>, total: nasl.core.Long}', undefined);
      result = window.$genInitFromSchema(
        '{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>, total: nasl.core.Long}',
        await window.LcapRequest({
          url: '/api/lcap_process_framework/getMyPendingTasks',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/myProcess/0',
          },
          data: {
            procDefKey: (this.myProcessFilter || {}).procDefKey,
            procInstStartTimeAfter: (this.myProcessFilter || {}).procInstStartTimeAfter,
            procInstStartTimeBefore: (this.myProcessFilter || {}).procInstStartTimeBefore,
            procInstInitiator: (this.myProcessFilter || {}).procInstInitiator,
            page,
            size,
          },
        }),
      );
      return result;
    },

    async getMyCompletedTasks(page, size) {
      let result = window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyCompletedTask>, total: nasl.core.Long}', undefined);
      result = window.$genInitFromSchema(
        '{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyCompletedTask>, total: nasl.core.Long}',
        await window.LcapRequest({
          url: '/api/lcap_process_framework/getMyCompletedTasks',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/myProcess/0',
          },
          data: {
            procDefKey: (this.myProcessFilter || {}).procDefKey,
            procInstStartTimeAfter: (this.myProcessFilter || {}).procInstStartTimeAfter,
            procInstStartTimeBefore: (this.myProcessFilter || {}).procInstStartTimeBefore,
            procInstInitiator: (this.myProcessFilter || {}).procInstInitiator,
            page,
            size,
          },
        }),
      );
      return result;
    },

    async getMyInitiatedTasks(page, size) {
      let result = window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyInitiatedTask>, total: nasl.core.Long}', undefined);
      result = window.$genInitFromSchema(
        '{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyInitiatedTask>, total: nasl.core.Long}',
        await window.LcapRequest({
          url: '/api/lcap_process_framework/getMyInitiatedTasks',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/myProcess/0',
          },
          data: {
            procDefKey: (this.myProcessFilter || {}).procDefKey,
            procInstStartTimeAfter: (this.myProcessFilter || {}).procInstStartTimeAfter,
            procInstStartTimeBefore: (this.myProcessFilter || {}).procInstStartTimeBefore,
            page,
            size,
          },
        }),
      );
      return result;
    },

    async getMyCCTasks(page, size) {
      let result = window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyCCTask>, total: nasl.core.Long}', undefined);
      result = window.$genInitFromSchema(
        '{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyCCTask>, total: nasl.core.Long}',
        await window.LcapRequest({
          url: '/api/lcap_process_framework/getMyCCTasks',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/myProcess/0',
          },
          data: {
            procDefKey: (this.myProcessFilter || {}).procDefKey,
            procInstStartTimeAfter: (this.myProcessFilter || {}).procInstStartTimeAfter,
            procInstStartTimeBefore: (this.myProcessFilter || {}).procInstStartTimeBefore,
            procInstInitiator: (this.myProcessFilter || {}).procInstInitiator,
            viewed: (this.myProcessFilter || {}).viewed,
            page,
            size,
          },
        }),
      );
      return result;
    },

    async getProcInstInitiators(page, size, filterText) {
      let result = window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>, total: nasl.core.Long}', undefined);
      result = window.$genInitFromSchema(
        '{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>, total: nasl.core.Long}',
        await window.LcapRequest({
          url: '/api/lcap_process_framework/getProcInstInitiators',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/myProcess/0',
          },
          data: {
            page,
            size,
            userName: filterText,
          },
        }),
      );
      return result;
    },

    async goToPage(itemTaskId) {
      let url;
      url = await window.LcapRequest({
        url: '/api/lcap_process_framework/getTaskDestinationUrl',
        method: 'POST',
        extraConfig: {
          serviceType: 'micro',
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/myProcess/0',
        },
        data: {
          taskId: itemTaskId,
        },
      });
      await (async () => {
        'use JSBlock';
        // 拼接全量url
        url = window.location.origin + url;
      })();
      window.$link(`${url}`, '_self');
      /*  这个地方的翻译没有按照nasl2ts，原始翻译是nasl.ui.gotoLink(url, undefined */
    },

    async myProcess_created(event) {
      await this.myProcess_created_created(event);
    },

    async myProcess_created_created() {
      this.$global.frontendVariables.title = '我的流程';
    },

    async tabs_2_select(event) {
      await this.tabs_2_select_select(event);
    },

    async tabs_2_select_select() {
      await this.reloadFilter();
    },

    async button_11_click(event) {
      await this.button_11_click_click(event);
    },

    async button_11_click_click() {
      await this.$refs.table_view_5?.reload?.();
    },

    async button_12_click(event) {
      await this.button_12_click_click(event);
    },

    async button_12_click_click() {
      await this.$refs.table_view_6?.reload?.();
    },

    async button_13_click(event) {
      await this.button_13_click_click(event);
    },

    async button_13_click_click() {
      await this.$refs.table_view_7?.reload?.();
    },

    async button_14_click(event) {
      await this.button_14_click_click(event);
    },

    async button_14_click_click() {
      await this.$refs.table_view_8?.reload?.();
    },

    async link_5_click(event, current) {
      await this.link_5_click_click(event, current);
    },

    async link_5_click_click(event, current) {
      await this.goToPage(((current || {}).item || {}).taskId);
    },

    async link_6_click(event, current) {
      await this.link_6_click_click(event, current);
    },

    async link_6_click_click(event, current) {
      await this.goToPage(((current || {}).item || {}).taskId);
    },

    async link_7_click(event, current) {
      await this.link_7_click_click(event, current);
    },

    async link_7_click_click(event, current) {
      await this.goToPage(((current || {}).item || {}).taskId);
    },

    async link_8_click(event, current) {
      await this.link_8_click_click(event, current);
    },

    async link_8_click_click(event, current) {
      await window.LcapRequest({
        url: '/api/lcap_process_framework/viewCCTask',
        method: 'POST',
        extraConfig: {
          serviceType: 'micro',
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/myProcess/0',
        },
        data: {
          taskId: ((current || {}).item || {}).taskId,
        },
      });
      await this.goToPage(((current || {}).item || {}).taskId);
    },

    genviewMatchExpression_013gc860(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return ((current || {}).item || {}).userName;
        } else if (window.$global.isEqual(it, true)) {
          return window.$global.add(window.$global.add(window.$global.add(((current || {}).item || {}).displayName, '（'), ((current || {}).item || {}).userName), '）');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_04r4uom0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).procInstTitle });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).procInstTitle;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1t73fj71(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).procDefTitle });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).procDefTitle;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1qqzkof0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>', value: ((current || {}).item || {}).procInstCurrNodes });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.Join(
            window.$genInitFromSchema(
              'nasl.collection.List<nasl.core.String>',
              window.$utils.ListTransform(((current || {}).item || {}).procInstCurrNodes, (item) => (item || {}).currNodeTitle),
            ),
            '，',
          );
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0fdp8qc0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return (() => {
            const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).userName });
            if (window.$global.isEqual(it, false)) {
              return '-';
            } else if (window.$global.isEqual(it, true)) {
              return (((current || {}).item || {}).procInstInitiator || {}).userName;
            } else { /* empty */ }
          })();
        } else if (window.$global.isEqual(it, true)) {
          return (((current || {}).item || {}).procInstInitiator || {}).displayName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_04d2fqc1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).userName });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return (((current || {}).item || {}).procInstInitiator || {}).userName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0mu8ozt1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.DateTime', value: ((current || {}).item || {}).procInstStartTime });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.FormatDateTime(((current || {}).item || {}).procInstStartTime, 'yyyy-MM-dd HH:mm:ss', 'global');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_17vxn3a1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return ((current || {}).item || {}).userName;
        } else if (window.$global.isEqual(it, true)) {
          return window.$global.add(window.$global.add(window.$global.add(((current || {}).item || {}).displayName, '（'), ((current || {}).item || {}).userName), '）');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0h8mtuu0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).procInstTitle });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).procInstTitle;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0rcksug0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).procDefTitle });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).procDefTitle;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1d6a1qo1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).nodeTitle });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).nodeTitle;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_13gox2z1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return (() => {
            const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).userName });
            if (window.$global.isEqual(it, false)) {
              return '-';
            } else if (window.$global.isEqual(it, true)) {
              return (((current || {}).item || {}).procInstInitiator || {}).userName;
            } else { /* empty */ }
          })();
        } else if (window.$global.isEqual(it, true)) {
          return (((current || {}).item || {}).procInstInitiator || {}).displayName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1al421d0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).userName });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return (((current || {}).item || {}).procInstInitiator || {}).userName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0aa6e2m0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.DateTime', value: ((current || {}).item || {}).procInstStartTime });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.FormatDateTime(((current || {}).item || {}).procInstStartTime, 'yyyy-MM-dd HH:mm:ss', 'global');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_16s3uk31(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).procInstTitle });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).procInstTitle;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0nt3f0j0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).procDefTitle });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).procDefTitle;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1ou4cjk0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>', value: ((current || {}).item || {}).procInstCurrNodes });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.Join(
            window.$genInitFromSchema(
              'nasl.collection.List<nasl.core.String>',
              window.$utils.ListTransform(((current || {}).item || {}).procInstCurrNodes, (item) => (item || {}).currNodeTitle),
            ),
            '，',
          );
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0z869v40(current) {
      return (() => {
        const it = window.$utils.HasValue(
          { type: 'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>', value: ((current || {}).item || {}).procInstCurrNodes },
          {
            type: 'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>',
            value: window.$genInitFromSchema(
              'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>',
              window.$utils.ListFilter(((current || {}).item || {}).procInstCurrNodes, (item) => window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>', value: (item || {}).currNodeParticipants })),
            ),
          },
        );
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.Join(
            window.$genInitFromSchema(
              'nasl.collection.List<nasl.core.String>',
              window.$utils.ListDistinct(
                window.$genInitFromSchema(
                  'nasl.collection.List<nasl.core.String>',
                  window.$utils.ListTransform(
                    window.$genInitFromSchema(
                      'nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>',
                      window.$utils.ListFlatten(
                        window.$genInitFromSchema(
                          'nasl.collection.List<nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>>',
                          window.$utils.ListTransform(
                            window.$genInitFromSchema(
                              'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>',
                              window.$utils.ListFilter(((current || {}).item || {}).procInstCurrNodes, (item) => window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>', value: (item || {}).currNodeParticipants })),
                            ),
                            (item) => (item || {}).currNodeParticipants,
                          ),
                        ),
                      ),
                    ),
                    (item) =>
                      (() => {
                        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).displayName });
                        if (window.$global.isEqual(it, false)) {
                          return (item || {}).userName;
                        } else if (window.$global.isEqual(it, true)) {
                          return (item || {}).displayName;
                        } else { /* empty */ }
                      })(),
                  ),
                ),
              ),
            ),
            '，',
          );
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_155tbq50(current, item) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return (item || {}).userName;
        } else if (window.$global.isEqual(it, true)) {
          return (item || {}).displayName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1ead28z0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return (() => {
            const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).userName });
            if (window.$global.isEqual(it, false)) {
              return '-';
            } else if (window.$global.isEqual(it, true)) {
              return (((current || {}).item || {}).procInstInitiator || {}).userName;
            } else { /* empty */ }
          })();
        } else if (window.$global.isEqual(it, true)) {
          return (((current || {}).item || {}).procInstInitiator || {}).displayName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1a34fof1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).userName });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return (((current || {}).item || {}).procInstInitiator || {}).userName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1fuezhs0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.DateTime', value: ((current || {}).item || {}).procInstStartTime });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.FormatDateTime(((current || {}).item || {}).procInstStartTime, 'yyyy-MM-dd HH:mm:ss', 'global');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1dgtkrs0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return ((current || {}).item || {}).userName;
        } else if (window.$global.isEqual(it, true)) {
          return window.$global.add(window.$global.add(window.$global.add(((current || {}).item || {}).displayName, '（'), ((current || {}).item || {}).userName), '）');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1co234q0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).procInstTitle });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).procInstTitle;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0pswfl51(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).procDefTitle });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).procDefTitle;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1yp5lox1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>', value: ((current || {}).item || {}).procInstCurrNodes });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.Join(
            window.$genInitFromSchema(
              'nasl.collection.List<nasl.core.String>',
              window.$utils.ListTransform(((current || {}).item || {}).procInstCurrNodes, (item) => (item || {}).currNodeTitle),
            ),
            '，',
          );
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1558qrc0(current) {
      return (() => {
        const it = window.$utils.HasValue(
          { type: 'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>', value: ((current || {}).item || {}).procInstCurrNodes },
          {
            type: 'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>',
            value: window.$genInitFromSchema(
              'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>',
              window.$utils.ListFilter(((current || {}).item || {}).procInstCurrNodes, (item) => window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>', value: (item || {}).currNodeParticipants })),
            ),
          },
        );
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.Join(
            window.$genInitFromSchema(
              'nasl.collection.List<nasl.core.String>',
              window.$utils.ListDistinct(
                window.$genInitFromSchema(
                  'nasl.collection.List<nasl.core.String>',
                  window.$utils.ListTransform(
                    window.$genInitFromSchema(
                      'nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>',
                      window.$utils.ListFlatten(
                        window.$genInitFromSchema(
                          'nasl.collection.List<nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>>',
                          window.$utils.ListTransform(
                            window.$genInitFromSchema(
                              'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>',
                              window.$utils.ListFilter(((current || {}).item || {}).procInstCurrNodes, (item) => window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>', value: (item || {}).currNodeParticipants })),
                            ),
                            (item) => (item || {}).currNodeParticipants,
                          ),
                        ),
                      ),
                    ),
                    (item) =>
                      (() => {
                        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).displayName });
                        if (window.$global.isEqual(it, false)) {
                          return (item || {}).userName;
                        } else if (window.$global.isEqual(it, true)) {
                          return (item || {}).displayName;
                        } else { /* empty */ }
                      })(),
                  ),
                ),
              ),
            ),
            '，',
          );
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1auyibv0(current, item) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return (item || {}).userName;
        } else if (window.$global.isEqual(it, true)) {
          return (item || {}).displayName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0d4f47h0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return (() => {
            const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).userName });
            if (window.$global.isEqual(it, false)) {
              return '-';
            } else if (window.$global.isEqual(it, true)) {
              return (((current || {}).item || {}).procInstInitiator || {}).userName;
            } else { /* empty */ }
          })();
        } else if (window.$global.isEqual(it, true)) {
          return (((current || {}).item || {}).procInstInitiator || {}).displayName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_10ifmwy0(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).procInstInitiator || {}).userName });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return (((current || {}).item || {}).procInstInitiator || {}).userName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1vo8bb51(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.DateTime', value: ((current || {}).item || {}).procInstStartTime });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.FormatDateTime(((current || {}).item || {}).procInstStartTime, 'yyyy-MM-dd HH:mm:ss', 'global');
        } else { /* empty */ }
      })();
    },

    __select_9_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_9_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          'nasl.collection.List<extensions.lcap_process_framework.structures.ProcDef>',
          await window.LcapRequest({
            url: '/api/lcap_process_framework/getProcDefInfos',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/myProcess/0',
            },
            data: {},
          }),
        );
      });
    },

    __select_10_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_10_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>, total: nasl.core.Long}', await this.getProcInstInitiators(this.select_10_state_page, this.select_10_state_size, this.select_10_state_filterText));
      });
    },

    __table_view_5_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__table_view_5_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>, total: nasl.core.Long}', await this.getMyPendingTasks(this.table_view_5_state_page, this.table_view_5_state_size));
      });
    },

    __select_11_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_11_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          'nasl.collection.List<extensions.lcap_process_framework.structures.ProcDef>',
          await window.LcapRequest({
            url: '/api/lcap_process_framework/getProcDefInfos',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/myProcess/3',
            },
            data: {},
          }),
        );
      });
    },

    __select_12_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_12_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>, total: nasl.core.Long}', await this.getProcInstInitiators(this.select_12_state_page, this.select_12_state_size, this.select_12_state_filterText));
      });
    },

    __table_view_6_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__table_view_6_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyCompletedTask>, total: nasl.core.Long}', await this.getMyCompletedTasks(this.table_view_6_state_page, this.table_view_6_state_size));
      });
    },

    __select_13_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_13_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          'nasl.collection.List<extensions.lcap_process_framework.structures.ProcDef>',
          await window.LcapRequest({
            url: '/api/lcap_process_framework/getProcDefInfos',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/myProcess/2',
            },
            data: {},
          }),
        );
      });
    },

    __table_view_7_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__table_view_7_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyInitiatedTask>, total: nasl.core.Long}', await this.getMyInitiatedTasks(this.table_view_7_state_page, this.table_view_7_state_size));
      });
    },

    __select_14_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_14_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          'nasl.collection.List<extensions.lcap_process_framework.structures.ProcDef>',
          await window.LcapRequest({
            url: '/api/lcap_process_framework/getProcDefInfos',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/myProcess/1',
            },
            data: {},
          }),
        );
      });
    },

    __select_15_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_15_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>, total: nasl.core.Long}', await this.getProcInstInitiators(this.select_15_state_page, this.select_15_state_size, this.select_15_state_filterText));
      });
    },

    __table_view_8_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__table_view_8_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyCCTask>, total: nasl.core.Long}', await this.getMyCCTasks(this.table_view_8_state_page, this.table_view_8_state_size));
      });
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.myProcess_created();
  },
};
</script>
