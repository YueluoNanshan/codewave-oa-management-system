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
      ref="linear_layout_68"
      direction="vertical"
      gap="normal"
    >
      <u-linear-layout
        ref="linear_layout_66"
        class="cw-style-text-align"
        style="--cw-style-text-align: center; text-align: center"
      >
        <fl-process-button ref="fl_process_button_1">
          <u-linear-layout
            ref="linear_layout_79"
            key="linear_layout_79"
            class="cw-style-padding-bottom cw-style-padding cw-style-padding-top"
            direction="horizontal"
            :wrap="true"
            mode="flex"
            alignment="center"
            justify="center"
            v-if="$utils['HasValue']({ type: 'nasl.collection.Map<nasl.core.String, extensions.lcap_process_framework.structures.TaskOperationPermission>', value: processButtonMap })"
            style="--cw-style-padding-bottom: 24px; --cw-style-padding-top: 24px; padding-top: 24px; padding-bottom: 24px"
          >
            <u-linear-layout
              ref="linear_layout_69"
              direction="horizontal"
              :wrap="true"
              mode="flex"
              alignment="center"
              justify="center"
            >
              <u-button
                ref="button_5"
                key="button_5"
                color="primary"
                :text="$utils['ToString']('nasl.core.String', ($utils['MapGet'](processButtonMap, `submit`) || {}).displayText)"
                widthStretch="false"
                @click="button_5_click($event)"
                v-if="$utils['HasValue']({ type: 'nasl.collection.Map<nasl.core.String, extensions.lcap_process_framework.structures.TaskOperationPermission>', value: processButtonMap }, { type: 'extensions.lcap_process_framework.structures.TaskOperationPermission', value: $utils['MapGet'](processButtonMap, `submit`) })"
              ></u-button>
              <u-button
                ref="button_6"
                key="button_6"
                color="primary"
                :text="$utils['ToString']('nasl.core.String', ($utils['MapGet'](processButtonMap, `approve`) || {}).displayText)"
                widthStretch="false"
                @click="button_6_click($event)"
                v-if="$utils['HasValue']({ type: 'nasl.collection.Map<nasl.core.String, extensions.lcap_process_framework.structures.TaskOperationPermission>', value: processButtonMap }, { type: 'extensions.lcap_process_framework.structures.TaskOperationPermission', value: $utils['MapGet'](processButtonMap, `approve`) })"
              ></u-button>
              <u-button
                ref="button_7"
                key="button_7"
                :text="$utils['ToString']('nasl.core.String', ($utils['MapGet'](processButtonMap, `reject`) || {}).displayText)"
                widthStretch="false"
                @click="button_7_click($event)"
                v-if="$utils['HasValue']({ type: 'nasl.collection.Map<nasl.core.String, extensions.lcap_process_framework.structures.TaskOperationPermission>', value: processButtonMap }, { type: 'extensions.lcap_process_framework.structures.TaskOperationPermission', value: $utils['MapGet'](processButtonMap, `reject`) })"
              ></u-button>
              <u-button
                ref="button_8"
                key="button_8"
                :text="$utils['ToString']('nasl.core.String', ($utils['MapGet'](processButtonMap, `reassign`) || {}).displayText)"
                widthStretch="false"
                @click="button_8_click($event)"
                v-if="$utils['HasValue']({ type: 'nasl.collection.Map<nasl.core.String, extensions.lcap_process_framework.structures.TaskOperationPermission>', value: processButtonMap }, { type: 'extensions.lcap_process_framework.structures.TaskOperationPermission', value: $utils['MapGet'](processButtonMap, `reassign`) })"
              ></u-button>
              <u-button
                ref="button_9"
                key="button_9"
                :text="$utils['ToString']('nasl.core.String', ($utils['MapGet'](processButtonMap, `addSign`) || {}).displayText)"
                widthStretch="false"
                @click="button_9_click($event)"
                v-if="$utils['HasValue']({ type: 'nasl.collection.Map<nasl.core.String, extensions.lcap_process_framework.structures.TaskOperationPermission>', value: processButtonMap }, { type: 'extensions.lcap_process_framework.structures.TaskOperationPermission', value: $utils['MapGet'](processButtonMap, `addSign`) })"
              ></u-button>
              <u-button
                ref="button_10"
                key="button_10"
                :text="$utils['ToString']('nasl.core.String', ($utils['MapGet'](processButtonMap, `withdraw`) || {}).displayText)"
                widthStretch="false"
                @click="button_10_click($event)"
                v-if="$utils['HasValue']({ type: 'nasl.collection.Map<nasl.core.String, extensions.lcap_process_framework.structures.TaskOperationPermission>', value: processButtonMap }, { type: 'extensions.lcap_process_framework.structures.TaskOperationPermission', value: $utils['MapGet'](processButtonMap, `withdraw`) })"
              ></u-button>
              <u-button
                ref="button_11"
                key="button_11"
                :text="$utils['ToString']('nasl.core.String', ($utils['MapGet'](processButtonMap, `revert`) || {}).displayText)"
                widthStretch="false"
                @click="button_11_click($event)"
                v-if="$utils['HasValue']({ type: 'nasl.collection.Map<nasl.core.String, extensions.lcap_process_framework.structures.TaskOperationPermission>', value: processButtonMap }, { type: 'extensions.lcap_process_framework.structures.TaskOperationPermission', value: $utils['MapGet'](processButtonMap, `revert`) })"
              ></u-button>
            </u-linear-layout>
          </u-linear-layout>
        </fl-process-button>
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_67"
        direction="vertical"
        justify="start"
        alignment="start"
      >
        <u-card ref="card_1">
          <template
            #title

          >
            <u-text
              ref="text_516"
              class="cw-style-font-size cw-style-font-weight cw-style-color"
              text="流程信息"
              style="--cw-style-font-size: 16px; --cw-style-font-weight: bold; --cw-style-color: #030303; font-size: 16px; font-weight: bold; color: #030303"
            ></u-text>
          </template>
          <fl-process-info ref="fl_process_info_1">
            <u-linear-layout
              ref="linear_layout_85"
              direction="horizontal"
              :wrap="true"
              mode="flex"
              justify="start"
              alignment="center"
              gap="normal"
              style="--space-base: 0px"
            >
              <u-linear-layout
                ref="linear_layout_80"
                class="cw-style-width"
                direction="horizontal"
                :wrap="true"
                widthStretch="false"
                mode="flex"
                justify="start"
                alignment="center"
                style="--cw-style-width: 20%; width: 20%"
              >
                <u-text
                  ref="text_556"
                  class="cw-style-color"
                  text="发起人："
                  style="--cw-style-color: #999999; color: #999999"
                ></u-text>
                <u-text
                  ref="text_557"
                  class="cw-style-width cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1uadxp90())"
                  overflow="ellipsis"
                  widthStretch="true"
                  style="--cw-style-width: 20%; --cw-style-color: #000000; width: 20%; color: #000000"
                ></u-text>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_81"
                class="cw-style-width cw-style-padding-left cw-style-padding"
                direction="horizontal"
                :wrap="true"
                widthStretch="false"
                mode="flex"
                justify="start"
                alignment="center"
                style="--cw-style-width: 20%; --cw-style-padding-left: 10px; width: 20%; padding-left: 10px"
              >
                <u-text
                  ref="text_558"
                  class="cw-style-color"
                  text="发起时间："
                  style="--cw-style-color: #999999; color: #999999"
                ></u-text>
                <u-text
                  ref="text_559"
                  class="cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_06tz0v40())"
                  overflow="ellipsis"
                  widthStretch="true"
                  style="--cw-style-color: #000000; color: #000000"
                ></u-text>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_82"
                class="cw-style-width cw-style-padding-left cw-style-padding"
                direction="horizontal"
                :wrap="true"
                widthStretch="false"
                mode="flex"
                justify="start"
                alignment="center"
                style="--cw-style-width: 20%; --cw-style-padding-left: 10px; width: 20%; padding-left: 10px"
              >
                <u-text
                  ref="text_560"
                  class="cw-style-color"
                  text="当前状态："
                  style="--cw-style-color: #999999; color: #999999"
                ></u-text>
                <u-text
                  ref="text_561"
                  class="cw-style-background-color cw-style-padding-left cw-style-padding cw-style-padding-right cw-style-color cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                  :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1hfut8f1())"
                  overflow="ellipsis"
                  widthStretch="false"
                  :style="{ color: genviewMatchExpression_1kt438f1(), '--cw-style-color': genviewMatchExpression_1kt438f1(), 'background-color': genviewMatchExpression_0y4y5wq1() }"
                  style="--cw-style-padding-left: 8px; --cw-style-padding-right: 8px; --cw-style-border-top-left-radius: 4px; --cw-style-border-top-right-radius: 4px; --cw-style-border-bottom-left-radius: 4px; --cw-style-border-bottom-right-radius: 4px; color: #333333; padding-left: 8px; padding-right: 8px; border-top-left-radius: 4px; border-top-right-radius: 4px; border-bottom-right-radius: 4px; border-bottom-left-radius: 4px; --custom-start: auto; max-width: calc(100% - 70px)"
                ></u-text>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_83"
                class="cw-style-width cw-style-padding-left cw-style-padding"
                direction="horizontal"
                :wrap="true"
                widthStretch="false"
                mode="flex"
                justify="start"
                alignment="center"
                style="--cw-style-width: 20%; --cw-style-padding-left: 10px; width: 20%; padding-left: 10px"
              >
                <u-text
                  ref="text_562"
                  class="cw-style-color"
                  text="当前节点："
                  style="--cw-style-color: #999999; color: #999999"
                ></u-text>
                <u-text
                  ref="text_563"
                  class="cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1rjfkjn0())"
                  overflow="ellipsis"
                  widthStretch="true"
                  style="--cw-style-color: #000000; color: #000000"
                ></u-text>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_84"
                class="cw-style-width cw-style-padding-left cw-style-padding"
                direction="horizontal"
                :wrap="true"
                widthStretch="false"
                mode="flex"
                justify="start"
                alignment="center"
                style="--cw-style-width: 20%; --cw-style-padding-left: 10px; width: 20%; padding-left: 10px"
              >
                <u-text
                  ref="text_564"
                  class="cw-style-color"
                  text="参与人："
                  style="--cw-style-color: #999999; color: #999999"
                ></u-text>
                <u-text
                  ref="text_565"
                  class="cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0gniymh1())"
                  overflow="ellipsis"
                  widthStretch="true"
                  style="--cw-style-color: #000000; color: #000000"
                ></u-text>
              </u-linear-layout>
            </u-linear-layout>
          </fl-process-info>
        </u-card>
        <u-card
          ref="card_2"
          class="cw-style-margin-top cw-style-margin"
          style="--cw-style-margin-top: 10px; margin-top: 10px"
        >
          <template
            #title

          >
            <u-text
              ref="text_517"
              class="cw-style-font-size cw-style-font-weight cw-style-color"
              text="表单信息"
              style="--cw-style-font-size: 16px; --cw-style-font-weight: bold; --cw-style-color: #060606; font-size: 16px; font-weight: bold; color: #060606"
            ></u-text>
          </template>
          <div id="dynamicRenderContainer"></div>
          <u-form
            ref="form_5"
            id="dynamicRenderContainer"
            processPrefix="leaveProcess"
            v-if="false"
            key="form_5"
          >
            <u-grid-layout ref="grid_layout_6">
              <u-grid-layout-row
                ref="grid_layout_row_6"
                :repeat="12"
              >
                <u-grid-layout-column
                  ref="grid_layout_column_14"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_24"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_518"
                        text="创建时间"
                      ></u-text>
                    </template>
                    <u-date-time-picker
                      ref="date_time_picker_1"
                      :clearable="true"
                      :value.sync="leaveProcess.data.createdTime"
                      placeholder="请选择创建时间"
                      :emptyValueIsNull="true"
                    ></u-date-time-picker>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_15"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_25"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_519"
                        text="更新时间"
                      ></u-text>
                    </template>
                    <u-date-time-picker
                      ref="date_time_picker_2"
                      :clearable="true"
                      :value.sync="leaveProcess.data.updatedTime"
                      placeholder="请选择更新时间"
                      :emptyValueIsNull="true"
                    ></u-date-time-picker>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_16"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_26"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_520"
                        text="创建者"
                      ></u-text>
                    </template>
                    <u-input
                      ref="input_5"
                      :value.sync="leaveProcess.data.createdBy"
                      placeholder="请输入创建者"
                      :emptyValueIsNull="true"
                    ></u-input>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_17"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_27"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_521"
                        text="更新者"
                      ></u-text>
                    </template>
                    <u-input
                      ref="input_6"
                      :value.sync="leaveProcess.data.updatedBy"
                      placeholder="请输入更新者"
                      :emptyValueIsNull="true"
                    ></u-input>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_18"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_28"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_522"
                        text="请假类型"
                      ></u-text>
                    </template>
                    <u-select
                      ref="select_2"
                      :clearable="true"
                      :value.sync="leaveProcess.data.type"
                      placeholder="请选择请假类型"
                      :dataSource="$utils['EnumToList']({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.enums', typeName: 'LeavePtype' })"
                      :emptyValueIsNull="true"
                      key="select_2"
                    ></u-select>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_19"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_29"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_523"
                        text="标题"
                      ></u-text>
                    </template>
                    <u-input
                      ref="input_7"
                      :value.sync="leaveProcess.data.title"
                      placeholder="请输入标题"
                      :emptyValueIsNull="true"
                    ></u-input>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_20"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_30"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_524"
                        text="开始日期"
                      ></u-text>
                    </template>
                    <u-date-picker
                      ref="date_picker_2"
                      :clearable="true"
                      :value.sync="leaveProcess.data.startDate"
                      placeholder="请选择开始日期"
                      :emptyValueIsNull="true"
                    ></u-date-picker>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_21"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_31"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_525"
                        text="结束日期"
                      ></u-text>
                    </template>
                    <u-date-picker
                      ref="date_picker_3"
                      :clearable="true"
                      :value.sync="leaveProcess.data.endDate"
                      placeholder="请选择结束日期"
                      :emptyValueIsNull="true"
                    ></u-date-picker>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_22"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_32"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_526"
                        text="开始时间"
                      ></u-text>
                    </template>
                    <u-time-picker
                      ref="time_picker_1"
                      :value.sync="leaveProcess.data.startTime"
                      placeholder="请选择开始时间"
                      :emptyValueIsNull="true"
                    ></u-time-picker>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_23"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_33"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_527"
                        text="结束时间"
                      ></u-text>
                    </template>
                    <u-time-picker
                      ref="time_picker_2"
                      :value.sync="leaveProcess.data.endTime"
                      placeholder="请选择结束时间"
                      :emptyValueIsNull="true"
                    ></u-time-picker>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_24"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_34"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_528"
                        text="请假原因"
                      ></u-text>
                    </template>
                    <u-input
                      ref="input_8"
                      :value.sync="leaveProcess.data.reason"
                      placeholder="请输入请假原因"
                      :emptyValueIsNull="true"
                    ></u-input>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_25"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_35"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_529"
                        text="附件"
                      ></u-text>
                    </template>
                    <u-input
                      ref="input_9"
                      :value.sync="leaveProcess.data.accessory"
                      placeholder="请输入附件"
                      :emptyValueIsNull="true"
                    ></u-input>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_26"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_36"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_530"
                        text="流程状态"
                      ></u-text>
                    </template>
                    <u-select
                      ref="select_3"
                      :clearable="true"
                      :value.sync="leaveProcess.data.status"
                      placeholder="请选择流程状态"
                      :dataSource="$utils['EnumToList']({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.enums', typeName: 'LeavePstatus' })"
                      :emptyValueIsNull="true"
                      key="select_3"
                    ></u-select>
                  </u-form-item>
                </u-grid-layout-column>
                <u-grid-layout-column
                  ref="grid_layout_column_27"
                  class="cw-style-margin-bottom cw-style-margin"
                  :span="6"
                  style="--cw-style-margin-bottom: 24px; margin-bottom: 24px"
                >
                  <u-form-item
                    ref="form_item_37"
                    layout="center"
                    labelLayout="inline"
                    style="--form-item-label-width: 100px"
                  >
                    <template
                      #label

                    >
                      <u-text
                        ref="text_531"
                        text="请假时长"
                      ></u-text>
                    </template>
                    <u-number-input
                      ref="number_input_1"
                      :value.sync="leaveProcess.data.leaveTime"
                      :precision="0"
                      :step="0"
                      placeholder="请输入请假时长"
                    ></u-number-input>
                  </u-form-item>
                </u-grid-layout-column>
              </u-grid-layout-row>
            </u-grid-layout>
          </u-form>
        </u-card>
        <u-card
          ref="card_3"
          class="cw-style-margin-top cw-style-margin"
          style="--cw-style-margin-top: 10px; margin-top: 10px"
        >
          <template
            #title

          >
            <u-text
              ref="text_532"
              class="cw-style-font-size cw-style-font-weight"
              text="审批记录"
              style="--cw-style-font-size: 16px; --cw-style-font-weight: bold; font-size: 16px; font-weight: bold"
            ></u-text>
          </template>
          <fl-process-record ref="fl_process_record_1">
            <u-table-view
              ref="table_view_record_1"
              @sync:state="(key, val) => onSyncState('table_view_record_1', key, val)"
              :dataSource="__table_view_record_1_handleDataSourceLoad()"
              :pagination="true"
              :showSizer="true"
              :pageSize="20"
              :pageNumber="1"
              key="table_view_record_1"
            >
              <u-table-view-column
                ref="table_view_column_1"
                key="table_view_column_1"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_566"
                    text="流程节点"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-text
                    :ref="`text_567_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1t5ewz20(current))"
                  ></u-text>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_1_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_2"
                key="table_view_column_2"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_568"
                    text="处理人"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-text
                    :ref="`text_569_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1ix8sa50(current))"
                  ></u-text>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_2_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_3"
                key="table_view_column_3"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_570"
                    text="处理时间"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-text
                    :ref="`text_571_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1bloror1(current))"
                  ></u-text>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_3_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_4"
                key="table_view_column_4"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_572"
                    text="审批操作"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_86_${(current || {}).__nodeKey || (current || {}).index}`"
                    direction="horizontal"
                    :wrap="true"
                    mode="flex"
                    justify="start"
                    alignment="center"
                  >
                    <u-text
                      :ref="`text_573_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-width cw-style-background-color cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-color cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                      overflow="ellipsis"
                      widthStretch="false"
                      display="inline"
                      :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).nodeOperationDisplayText)"
                      :style="{ color: genviewMatchExpression_16tnf3u0(current), '--cw-style-color': genviewMatchExpression_16tnf3u0(current), 'background-color': genviewMatchExpression_1d6q0mh1(current) }"
                      style="--cw-style-width: auto; --cw-style-padding-left: 8px; --cw-style-padding-bottom: 1px; --cw-style-padding-top: 1px; --cw-style-padding-right: 8px; --cw-style-border-top-left-radius: 4px; --cw-style-border-top-right-radius: 4px; --cw-style-border-bottom-left-radius: 4px; --cw-style-border-bottom-right-radius: 4px; padding-left: 8px; padding-right: 8px; border-top-left-radius: 4px; border-top-right-radius: 4px; border-bottom-right-radius: 4px; border-bottom-left-radius: 4px; padding-top: 1px; padding-bottom: 1px; width: auto"
                    ></u-text>
                  </u-linear-layout>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_4_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_5"
                key="table_view_column_5"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_574"
                    text="审批意见"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-text
                    :ref="`text_575_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1b7i8ic1(current))"
                  ></u-text>
                </template>
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_5_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
              </u-table-view-column>
            </u-table-view>
          </fl-process-record>
        </u-card>
      </u-linear-layout>
    </u-linear-layout>
    <fl-process-graph
      ref="fl_process_graph_1"
      :dataSource="__fl_process_graph_1_handleDataSourceLoad()"
    ></fl-process-graph>
    <u-modal
      ref="button_modal_1"
      size="auto"
      @open="button_modal_1_open($event)"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_71"
          direction="horizontal"
          :wrap="true"
          gap="normal"
          justify="space-between"
        >
          <u-linear-layout
            ref="linear_layout_70"
            justify="center"
          >
            <u-button
              ref="button_12"
              text="取 消"
              @click="button_12_click($event)"
            ></u-button>
            <u-button
              ref="button_13"
              color="primary"
              text="提 交"
              @click="button_13_click($event)"
            ></u-button>
          </u-linear-layout>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-form
          ref="form_buttonModal_1"
          labelLayout="block"
          gapHeight="none"
          key="form_buttonModal_1"
          style="--custom-start: auto; min-width: 350px"
        >
          <u-form-item
            ref="form_item_38"
            key="form_item_38"
            :required="(processButtonItem || {}).commentRequired"
            layout="center"
            :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
            :ignoreValidation="!(processButtonItem || {}).commentRequired"
            :labelEllipsis="true"
            v-if="(processButtonItem || {}).name != `reassign` && (processButtonItem || {}).name != `addSign`"
          >
            <template
              #label

            >
              <u-text
                ref="text_533"
                text="审批意见"
              ></u-text>
            </template>
            <u-textarea
              ref="textarea_1"
              class="cw-style-width"
              placeholder="请输入"
              limitPosition="outside"
              :emptyValueIsNull="true"
              :value.sync="processButtonBody.comment"
              style="--cw-style-width: 100%; width: 100%"
            ></u-textarea>
          </u-form-item>
          <u-form-item
            ref="form_item_39"
            key="form_item_39"
            class="cw-style-padding-bottom cw-style-padding"
            :required="true"
            :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
            :ignoreValidation="false"
            :labelEllipsis="true"
            v-if="(processButtonItem || {}).name == `addSign`"
            style="--cw-style-padding-bottom: 20px; padding-bottom: 20px"
          >
            <template
              #label

            >
              <u-text
                ref="text_534"
                text="加签方式"
              ></u-text>
            </template>
            <u-radios
              ref="radios_addSign_1"
              class="cw-style-width cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
              :value.sync="processButtonBody.policyForAddSign"
              :column="genviewMatchExpression_1kswaid0()"
              style="--cw-style-width: 580px; --cw-style-padding-left: 0px; --cw-style-padding-bottom: 0px; --cw-style-padding-top: 0px; --cw-style-padding-right: 0px; padding-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; --radio-space-x: 6px; width: 580px"
            >
              <u-radio
                ref="radio_7"
                class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                label="CurrentNode"
                style="--cw-style-padding-left: 16px; --cw-style-padding-bottom: 8px; --cw-style-padding-top: 8px; --cw-style-padding-right: 16px; --cw-style-border-style: solid; --cw-style-border-color: #dadee8; --cw-style-border-left-width: 2px; --cw-style-border-right-width: 2px; --cw-style-border-top-width: 2px; --cw-style-border-bottom-width: 2px; --cw-style-border-top-left-radius: 4px; --cw-style-border-top-right-radius: 4px; --cw-style-border-bottom-left-radius: 4px; --cw-style-border-bottom-right-radius: 4px; padding-top: 8px; padding-left: 16px; padding-right: 16px; padding-bottom: 8px; border-top-left-radius: 4px; border-top-right-radius: 4px; border-bottom-right-radius: 4px; border-bottom-left-radius: 4px; border-top-width: 2px; border-left-width: 2px; border-right-width: 2px; border-bottom-width: 2px; border-style: solid; border-color: #dadee8"
              >
                <template
                  #item

                >
                  <u-linear-layout
                    ref="linear_layout_72"
                    mode="flex"
                    direction="vertical"
                    justify="start"
                    alignment="start"
                    gap="normal"
                    style="--space-base: 0px; --custom-start: auto; display: inline-flex"
                  >
                    <u-text
                      ref="text_535"
                      text="当前节点加签"
                      style="--custom-start: auto; font-weight: 500"
                    ></u-text>
                    <u-text
                      ref="text_536"
                      text="和被加签人一起审批"
                    ></u-text>
                  </u-linear-layout>
                </template>
              </u-radio>
              <u-radio
                ref="radio_8"
                key="radio_8"
                class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                label="PreviousNode"
                v-if="processButtonApprovalPolicy == `simple`"
                style="--cw-style-padding-left: 16px; --cw-style-padding-bottom: 8px; --cw-style-padding-top: 8px; --cw-style-padding-right: 16px; --cw-style-border-style: solid; --cw-style-border-color: #dadee8; --cw-style-border-left-width: 2px; --cw-style-border-right-width: 2px; --cw-style-border-top-width: 2px; --cw-style-border-bottom-width: 2px; --cw-style-border-top-left-radius: 4px; --cw-style-border-top-right-radius: 4px; --cw-style-border-bottom-left-radius: 4px; --cw-style-border-bottom-right-radius: 4px; padding-top: 8px; padding-left: 16px; padding-right: 16px; padding-bottom: 8px; border-top-left-radius: 4px; border-top-right-radius: 4px; border-bottom-right-radius: 4px; border-bottom-left-radius: 4px; border-top-width: 2px; border-left-width: 2px; border-right-width: 2px; border-bottom-width: 2px; border-style: solid; border-color: #dadee8"
              >
                <template
                  #item

                >
                  <u-linear-layout
                    ref="linear_layout_73"
                    mode="flex"
                    direction="vertical"
                    justify="start"
                    alignment="start"
                    gap="normal"
                    style="--space-base: 0px; --custom-start: auto; display: inline-flex"
                  >
                    <u-text
                      ref="text_537"
                      text="前加签"
                      style="--custom-start: auto; font-weight: 500"
                    ></u-text>
                    <u-text
                      ref="text_538"
                      text="被加签人先处理"
                    ></u-text>
                  </u-linear-layout>
                </template>
              </u-radio>
              <u-radio
                ref="radio_9"
                key="radio_9"
                class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                label="NextNode"
                v-if="processButtonApprovalPolicy == `simple`"
                style="--cw-style-padding-left: 16px; --cw-style-padding-bottom: 8px; --cw-style-padding-top: 8px; --cw-style-padding-right: 16px; --cw-style-border-style: solid; --cw-style-border-color: #dadee8; --cw-style-border-left-width: 2px; --cw-style-border-right-width: 2px; --cw-style-border-top-width: 2px; --cw-style-border-bottom-width: 2px; --cw-style-border-top-left-radius: 4px; --cw-style-border-top-right-radius: 4px; --cw-style-border-bottom-left-radius: 4px; --cw-style-border-bottom-right-radius: 4px; padding-top: 8px; padding-left: 16px; padding-right: 16px; padding-bottom: 8px; border-top-left-radius: 4px; border-top-right-radius: 4px; border-bottom-right-radius: 4px; border-bottom-left-radius: 4px; border-top-width: 2px; border-left-width: 2px; border-right-width: 2px; border-bottom-width: 2px; border-style: solid; border-color: #dadee8"
              >
                <template
                  #item

                >
                  <u-linear-layout
                    ref="linear_layout_74"
                    mode="flex"
                    direction="vertical"
                    justify="start"
                    alignment="start"
                    gap="normal"
                    style="--space-base: 0px; --custom-start: auto; display: inline-flex"
                  >
                    <u-text
                      ref="text_539"
                      text="后加签并通过"
                      style="--custom-start: auto; font-weight: 500"
                    ></u-text>
                    <u-text
                      ref="text_540"
                      text="被加签人后处理"
                    ></u-text>
                  </u-linear-layout>
                </template>
              </u-radio>
            </u-radios>
          </u-form-item>
          <u-form-item
            ref="form_item_40"
            key="form_item_40"
            :required="true"
            :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
            :ignoreValidation="false"
            :labelEllipsis="true"
            v-if="(processButtonItem || {}).name == `reassign` || (processButtonItem || {}).name == `addSign`"
          >
            <template
              #label

            >
              <u-text
                ref="text_541"
                key="text_541"
                text="请选择人员"
                v-if="(processButtonItem || {}).name == `reassign`"
              ></u-text>
              <u-text
                ref="text_542"
                key="text_542"
                text="加签人员"
                v-if="(processButtonItem || {}).name == `addSign`"
              ></u-text>
            </template>
            <u-select
              ref="select_4"
              class="cw-style-width"
              @sync:state="(key, val) => onSyncState('select_4', key, val)"
              placeholder="请选择"
              :pagination="true"
              :pageSize="20"
              :emptyValueIsNull="true"
              :optionIsSlot="true"
              :value.sync="processButtonBody.userForOperate"
              :dataSource="__select_4_handleDataSourceLoad()"
              valueField="userName"
              :initialLoad="true"
              :filterable="true"
              key="select_4"
              style="--cw-style-width: 100%; width: 100%"
            >
              <template
                #option="current"

              >
                <u-text
                  :ref="`text_543_${(current || {}).__nodeKey || (current || {}).index}`"
                  :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_02n0vhu1(current))"
                  overflow="ellipsis"
                ></u-text>
              </template>
            </u-select>
          </u-form-item>
        </u-form>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_544"
          :text="$utils['ToString']('nasl.core.String', (processButtonItem || {}).displayText)"
        ></u-text>
      </template>
    </u-modal>
    <u-modal
      ref="button_backModal_1"
      class="cw-style-width"
      size="auto"
      style="--cw-style-width: auto; width: auto; min-width: 400px"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_76"
          class="cw-style-text-align"
          direction="horizontal"
          :wrap="true"
          gap="normal"
          justify="space-between"
          style="--cw-style-text-align: right; text-align: right"
        >
          <u-linear-layout
            ref="linear_layout_75"
            justify="center"
          >
            <u-button
              ref="button_14"
              text="取 消"
              @click="button_14_click($event)"
            ></u-button>
            <u-button
              ref="button_15"
              color="primary"
              text="确 定"
              @click="button_15_click($event)"
            ></u-button>
          </u-linear-layout>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-linear-layout
          ref="linear_layout_77"
          key="linear_layout_77"
          class="cw-style-width"
          direction="horizontal"
          :wrap="true"
          gap="normal"
          mode="flex"
          justify="start"
          alignment="center"
          v-if="(processButtonItem || {}).name == `withdraw`"
          style="--cw-style-width: 350px; --space-base: 0px; width: 350px"
        >
          <u-text
            ref="text_545"
            text="请确认是否"
          ></u-text>
          <u-text
            ref="text_546"
            :text="$utils['ToString']('nasl.core.String', (processButtonItem || {}).displayText)"
          ></u-text>
          <u-text
            ref="text_547"
            text="流程？"
          ></u-text>
        </u-linear-layout>
        <u-linear-layout
          ref="linear_layout_78"
          key="linear_layout_78"
          direction="horizontal"
          :wrap="true"
          v-if="(processButtonItem || {}).name == `revert`"
        >
          <u-form
            ref="form_revert_1"
            labelLayout="block"
            gapHeight="none"
            key="form_revert_1"
            style="--custom-start: auto; min-width: 350px"
          >
            <u-form-item
              ref="form_item_41"
              class="cw-style-padding-bottom cw-style-padding"
              :required="true"
              :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
              :ignoreValidation="false"
              :labelEllipsis="true"
              style="--cw-style-padding-bottom: 24px; padding-bottom: 24px"
            >
              <template
                #label

              >
                <u-text
                  ref="text_548"
                  text="流转到"
                ></u-text>
              </template>
              <u-radios
                ref="radios_revert_flow_1"
                class="cw-style-width cw-style-margin-top cw-style-margin"
                :value.sync="processButtonBody.nodeId"
                :dataSource="__radios_revert_flow_1_handleDataSourceLoad()"
                valueField="nodeId"
                style="--cw-style-width: 546px; --cw-style-margin-top: 4px; width: 546px; --radio-space-y: 8px; --radio-space-x: 40px; margin-top: 4px"
              >
                <template
                  #item="current"

                >
                  <u-text
                    :ref="`text_549_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).nodeName)"
                  ></u-text>
                </template>
              </u-radios>
            </u-form-item>
            <u-form-item
              ref="form_item_42"
              key="form_item_42"
              class="cw-style-padding-bottom cw-style-padding"
              :required="true"
              :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
              :ignoreValidation="false"
              :labelEllipsis="true"
              v-if="(processButtonItem || {}).afterComplete == `runtimeSpecify`"
              style="--cw-style-padding-bottom: 24px; padding-bottom: 24px"
            >
              <template
                #label

              >
                <u-text
                  ref="text_550"
                  text="重新提交后"
                ></u-text>
              </template>
              <u-radios
                ref="radios_revert_resubmit_1"
                class="cw-style-width cw-style-margin-top cw-style-margin"
                :value.sync="processButtonBody.afterComplete"
                valueField=""
                style="--cw-style-width: 546px; --cw-style-margin-top: 4px; width: 546px; --radio-space-x: 40px; --radio-space-y: 8px; margin-top: 4px"
              >
                <template
                  #item="current"

                >
                  <u-text
                    :ref="`text_551_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', (current || {}).item)"
                  ></u-text>
                </template>
                <u-radio
                  ref="radio_10"
                  label="reExecute"
                >
                  <template
                    #item

                  >
                    <u-text
                      ref="text_552"
                      text="按流程顺序审批"
                    ></u-text>
                  </template>
                </u-radio>
                <u-radio
                  ref="radio_11"
                  label="jumpToSource"
                >
                  <template
                    #item

                  >
                    <u-text
                      ref="text_553"
                      text="直接回到当前节点审批"
                    ></u-text>
                  </template>
                </u-radio>
              </u-radios>
            </u-form-item>
            <u-form-item
              ref="form_item_43"
              class="cw-style-width cw-style-margin-top cw-style-margin"
              :required="(processButtonItem || {}).commentRequired"
              layout="center"
              :rules="[{ validate: 'filled', message: `表单项不得为空`, trigger: 'input+blur', required: true }]"
              :ignoreValidation="!(processButtonItem || {}).commentRequired"
              :labelEllipsis="true"
              style="--cw-style-width: 100%; --cw-style-margin-top: 4px; width: 100%; margin-top: 4px"
            >
              <template
                #label

              >
                <u-text
                  ref="text_554"
                  text="审批意见"
                ></u-text>
              </template>
              <u-textarea
                ref="textarea_2"
                class="cw-style-width cw-style-margin-top cw-style-margin"
                placeholder="请输入"
                limitPosition="outside"
                :emptyValueIsNull="true"
                :value.sync="processButtonBody.comment"
                style="--cw-style-width: 100%; --cw-style-margin-top: 4px; width: 100%; margin-top: 4px"
              ></u-textarea>
            </u-form-item>
          </u-form>
        </u-linear-layout>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_555"
          :text="$utils['ToString']('nasl.core.String', (processButtonItem || {}).displayText)"
        ></u-text>
      </template>
    </u-modal>
    <u-toast-single
      ref="button_toast_1"
      text="无可流转节点，请联系管理员"
      :duration="2000"
      color="error"
    ></u-toast-single>
  </u-linear-layout>
</template>
<script>
const processDetailFromMixin = {
  data() {
    return {
      processDetailFormData: {},
      leaveProcess: {
        data: {},
      },
      formTemplate: '', // 表单模版
      formVM: null, // 表单实例
      needReplaced: false, // 是否需要替换模版
    };
  },
  methods: {
    sliceStrByTag(tag, referIndex, startIndex = 0, endIndex = Infinity) {
      const sliceEndIndex = this.formTemplate.indexOf(`</${tag}>`, referIndex);
      if (sliceEndIndex > -1 && sliceEndIndex < endIndex) {
        const sliceStartIndex = this.formTemplate.lastIndexOf(`<${tag} `, sliceEndIndex);
        if (sliceStartIndex > -1 && sliceStartIndex > startIndex) {
          return this.formTemplate.substring(sliceStartIndex, sliceEndIndex + `</${tag}>`.length);
        }
      }
      return '';
    },
    modifyFieldTemplateByPermission(replaceTemplateList, propertyName, fieldStr, permission, tag, relationDataName) {
      let startIndex = 0;
      let endIndex = Infinity;
      if (relationDataName) {
        const tableIndexConfig = this.getRelationDataStartAndEndIndex(relationDataName);
        startIndex = tableIndexConfig.tableStartIndex;
        endIndex = tableIndexConfig.tableEndIndex;
      }
      let itemStr = '';
      const replaceStr = `<span text=${fieldStr}></span>`;
      const fieldStrIndex = this.formTemplate.indexOf(fieldStr, startIndex);
      if (fieldStrIndex > -1 && fieldStrIndex < endIndex) {
        itemStr = this.sliceStrByTag(tag, fieldStrIndex, startIndex, endIndex);
        if (permission === 'hidden') {
          this.formTemplate = this.formTemplate.replace(itemStr, '');
          return startIndex;
        } else if (['readOnly', 'preview'].includes(permission)) {
          const newItemStr = itemStr.replace(fieldStr, `${fieldStr} preview `);
          this.formTemplate = this.formTemplate.replace(itemStr, newItemStr);
          itemStr = newItemStr;
        }
        replaceTemplateList.push({
          propertyName,
          origin: itemStr,
          replace: replaceStr,
        });
      }
      return startIndex;
    },
    getRelationDataStartAndEndIndex(relationDataName) {
      const tag = 'u-table-view';
      let tableStartIndex = -1;
      let tableEndIndex = -1;
      const reg = new RegExp(`dataSource(?:\\.sync)?="[^"]*processDetailFormData[^"]*\\.${relationDataName}"`, 'g');
      const match = this.formTemplate.match(reg);
      if (match && match.length) {
        const relationDataStr = match[0];
        const relationDataStrIndex = this.formTemplate.indexOf(relationDataStr);
        tableEndIndex = this.formTemplate.indexOf(`</${tag}>`, relationDataStrIndex);
        if (tableEndIndex > -1) {
          tableStartIndex = this.formTemplate.lastIndexOf(`<${tag} `, tableEndIndex);
          // console.log('tableStr', this.formTemplate.slice(startIndex, endIndex + tag.length + 3));
        }
      }
      return { tableStartIndex, tableEndIndex };
    },
    dynamicRender(vmRoot, formTemplate) {
      const Local = Vue.extend({
        router: window?.VueRouterInstance,
        template: formTemplate,
        data() {
          return {
            ...vmRoot.$data,
          };
        },
        methods: Object.assign(
          {},
          ...Object.entries(vmRoot.$options.methods).map(([key, method]) => ({
            [key]: method.bind(vmRoot),
          })),
        ),
      });
      this.formVM = new Local();
      this.formVM.$refs = vmRoot.$refs;
      this.formVM._i18n = vmRoot._i18n;
      this.formVM.$mount();
      this.needReplaced = !this.formVM?.$el?.firstChild; // 判断当前模版是否渲染成功
    },
    renderForm({ fieldReplTemplates, vmRoot, isSubForm, formTemplate }) {
      for (let i = 0; i <= fieldReplTemplates.length; i++) {
        const { propertyName, origin, replace } = fieldReplTemplates[i] || {};
        // step1: 如果上一次渲染失败，更换为替换模版
        if (this.needReplaced && i > 0) {
          fieldReplTemplates[i - 1].isError = true;
        }
        // 避免有下拉框等会多次调用接口，再还原回去
        if (i > 0) {
          const { origin: lastOrigin, replace: lastReplace } = fieldReplTemplates[i - 1];
          formTemplate = formTemplate.replace(lastOrigin, lastReplace);
        }
        // step2: 如果子表单的首次渲染失败，则不在继续替换后续模版，直接取消掉该子表单的渲染
        if (isSubForm && this.needReplaced && i === 1) {
          for (let j = 1; j <= fieldReplTemplates.length; j++) {
            fieldReplTemplates[j].isError = true;
          }
          break;
        }
        // step3: 尝试用原始模板渲染
        if (propertyName) formTemplate = formTemplate.replace(replace, origin);
        // step4: 动态渲染
        if (propertyName || this.needReplaced || i === 0) this.dynamicRender(vmRoot, formTemplate);
      }
      this.needReplaced = false;
    },
    cutStrByTag(template, tag, filterReferStr) {
      const filterReferStrIndex = template.indexOf(filterReferStr);
      const endIndex = template.indexOf(`</${tag}>`, filterReferStrIndex);
      if (endIndex > -1) {
        const startIndex = template.lastIndexOf(`<${tag} `, endIndex);
        if (startIndex > -1) {
          const targetStr = template.substring(startIndex, endIndex + `</${tag}>`.length);
          return template.replace(targetStr, '');
        }
      }
      return template;
    },
    previewSubFormTemplate(stencilStr) {
      stencilStr = this.cutStrByTag(stencilStr, 'u-button', ':subFormBtnType="`add`"');
      stencilStr = this.cutStrByTag(stencilStr, 'u-button', ':subFormBtnType="`export`"');
      stencilStr = this.cutStrByTag(stencilStr, 'u-table-view-column', ':subFormInitialColumn="`action`"');
      return stencilStr;
    },
    reDynamicRenderForm(vmRoot, templateData) {
      let formTemplateForRender = this.formTemplate;
      const replaceFormTemplateToReplacer = (fieldReplTemplates) => {
        for (let i = 0; i < fieldReplTemplates.length; i++) {
          const { origin, replace } = fieldReplTemplates[i];
          formTemplateForRender = formTemplateForRender.replace(origin, replace);
        }
      };
      replaceFormTemplateToReplacer(templateData.mainReplTemplates);
      templateData.subReplTemplates.forEach((fieldReplTemplates) => {
        replaceFormTemplateToReplacer(fieldReplTemplates);
      });
      // 动态渲染主表单
      this.renderForm({
        fieldReplTemplates: templateData.mainReplTemplates,
        vmRoot,
        isSubForm: false,
        formTemplate: formTemplateForRender,
      });
      // 动态渲染子表单
      templateData.subReplTemplates.forEach((fieldReplTemplates) => {
        this.renderForm({
          fieldReplTemplates,
          vmRoot,
          isSubForm: true,
          formTemplate: formTemplateForRender,
        });
      });

      // 替换掉有错误的选项
      const replaceFormTemplateOrigin = (fieldReplTemplates) => {
        for (let i = 0; i < fieldReplTemplates.length; i++) {
          const { origin, replace, isError } = fieldReplTemplates[i];
          if (isError) {
            this.formTemplate = this.formTemplate.replace(origin, replace);
          }
        }
      };
      replaceFormTemplateOrigin(templateData.mainReplTemplates);
      templateData.subReplTemplates.forEach((fieldReplTemplates) => {
        replaceFormTemplateOrigin(fieldReplTemplates);
      });
      this.dynamicRender(vmRoot, this.formTemplate);
    },
  },
  async mounted() {
    try {
      const { taskId } = this.$route.query;
      if (!taskId) return;
      // 获取表单定义
      const templateProcessDetailFrom = await this.$processV2.getProcessFormDefinition({
        body: { taskId },
      });

      this.formTemplate = eval(`\`${templateProcessDetailFrom?.data?.replace(/[`$]/g, (m) => `\\${m}`)}\``);

      // 获取表单数据
      let formData = await this.$processV2.getTaskInstanceForm({ body: { taskId } });
      formData = formData?.data;
      // 获取流程变量
      let processVars = await this.$processV2.getProcVariable({ body: { taskId } });
      processVars = processVars?.data;
      formData = { ...formData, ...processVars };
      // 获取字段权限
      // let fieldPermission = await this.$processV2.fieldPermissionDetail({ body: { taskId } }) // 旧接口
      const fieldPermission = await this.$processV2.getFieldPermissionDetail({ body: { taskId } });

      const itemTag = 'u-form-item';

      // 主表单的字段权限
      const mainPerms = fieldPermission?.data?.[0]?.subFieldPermissions || [];
      // 主表字段渲染错误时的替换模版
      const mainReplTemplates = [];
      mainPerms.forEach(({ propertyName, permission }) => {
        const fieldStrReg = new RegExp(`"[^"]*processDetailFormData[^"]*\\.data[^"]*\\.${propertyName}"`, 'g');
        const fieldStr = this.formTemplate.match(fieldStrReg)?.[0];
        if (!fieldStr) return;
        this.modifyFieldTemplateByPermission(mainReplTemplates, propertyName, fieldStr, permission, itemTag);
      });

      // n个子表单的字段权限 (n>=0)
      const subPerms = fieldPermission?.data?.slice(1) || [];
      // 子字段渲染错误时的替换模版
      const subReplTemplates = [];
      if (subPerms.length && true) {
        const fieldTag = 'u-table-view-column';
        const stencilTag = 'u-grid-layout-column';
        // 遍历每个子表单
        subPerms.forEach((relationData) => {
          const { propertyName, subFieldPermissions, permission } = relationData;
          // step1: 判断是否存在当前子表单
          let { tableStartIndex, tableEndIndex } = this.getRelationDataStartAndEndIndex(propertyName);
          if (tableStartIndex === -1 || tableEndIndex === -1) return;
          let stencilStr = this.sliceStrByTag(stencilTag, tableStartIndex);
          // step2: 根据子表单整体权限，控制子表单的部分节点 或 整个子表单 的隐藏
          if (['readOnly', 'preview'].includes(permission)) {
            const newStencilStr = this.previewSubFormTemplate(stencilStr);
            this.formTemplate = this.formTemplate.replace(stencilStr, newStencilStr);
            stencilStr = newStencilStr;
          } else if (permission === 'hidden') {
            this.formTemplate = this.formTemplate.replace(stencilStr, '');
            return;
          }
          // step3: 初始化存放槽位
          const curReplTemplates = [];
          subReplTemplates.push(curReplTemplates);
          // step4: 遍历当前子表单的字段权限
          subFieldPermissions.forEach(({ propertyName: fieldName, permission: fieldPermission }, index) => {
            const fieldStr = `"current.item.${fieldName}"`;
            tableStartIndex = this.modifyFieldTemplateByPermission(curReplTemplates, fieldName, fieldStr, fieldPermission, fieldTag, propertyName);
            // step5: 当前子表单首次渲染时，会去除掉所有列，来检查当前子表单内是否有其他因素导致渲染失败
            if (index === subFieldPermissions.length - 1) {
              stencilStr = this.sliceStrByTag(stencilTag, tableStartIndex);
              const replaceStencilStr = `<span text="processDetailFormData.${propertyName}"></span>`;
              curReplTemplates.unshift({
                propertyName,
                origin: stencilStr,
                replace: replaceStencilStr,
              });
            }
          });
        });
      }

      if (formData) this.processDetailFormData = formData;
      // 使processDetailFormData内每一个key具备双向绑定能力
      Object.keys(this.processDetailFormData).forEach((key) => {
        this.$set(this.processDetailFormData, key, this.processDetailFormData[key]);
      });

      const container = document.getElementById('dynamicRenderContainer');
      if (!container) return;
      const vmRoot = this;

      // 先渲染，如果报错，再一个个item渲染，去除报错的item
      this.dynamicRender(vmRoot, this.formTemplate);

      if (this.needReplaced) {
        this.reDynamicRenderForm(vmRoot, {
          mainReplTemplates,
          subReplTemplates,
        });
      }
      const parentElement = container.parentNode;
      const regex = /ref-name="([^"]+)"/;
      const match = this.formTemplate.match(regex);
      parentElement.replaceChild(this.formVM?.$el, container);
      window.__processDetailFromMixinFormVm__ = this.formVM?.$refs[match[1]];
      const processVarsKeys = Object.keys(processVars);
      const data = {};
      for (const key in this.processDetailFormData) {
        if (!processVarsKeys.includes(key)) {
          data[key] = this.processDetailFormData[key];
        }
      }
      window.__processDetailFromMixinFormData__ = data;
    } catch (error) {
      console.warn('processDetailFromMixin warn', error);
    }
  },
};
export default {
  name: '/oaSys/approveLeaveProcess',
  mixins: [processDetailFromMixin, window.$mixins.dataSourceUtils()],
  data() {
    return {
      processButtonMap: window.$genInitFromSchema('nasl.collection.Map<nasl.core.String, extensions.lcap_process_framework.structures.TaskOperationPermission>', undefined),
      processButtonItem: window.$genInitFromSchema('extensions.lcap_process_framework.structures.TaskOperationPermission', undefined),
      processButtonApprovalPolicy: undefined,
      processButtonBody: window.$genInitFromSchema('{afterComplete: nasl.core.String, comment: nasl.core.String, nodeId: nasl.core.String, policyForAddSign: nasl.core.String, task: nasl.core.String, userForOperate: nasl.core.String}', undefined),
      processInfo: window.$genInitFromSchema('{currNodeParticipants: nasl.collection.List<nasl.core.String>, currNodeTitles: nasl.collection.List<nasl.core.String>, procInstInitiator: nasl.core.String, procInstStartTime: nasl.core.DateTime, procInstStatus: nasl.core.String}', undefined),
      taskId: Object.prototype.hasOwnProperty.call(this.$route.query, 'taskId') && !['undefined', 'null'].includes(this.$route.query.taskId) ? window.$genInitFromSchema('nasl.core.String', this.$route.query.taskId) : undefined,
      dataId: Object.prototype.hasOwnProperty.call(this.$route.query, 'dataId') && !['undefined', 'null'].includes(this.$route.query.dataId) ? window.$genInitFromSchema('nasl.core.Long', this.$route.query.dataId) : undefined,
      table_view_record_1_state_page: undefined,
      table_view_record_1_state_size: undefined,
      select_4_state_page: undefined,
      select_4_state_size: undefined,
      select_4_state_filterText: undefined,
    };
  },
  meta: {
    title: '流程审批页面',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async getTaskOperationPermissions() {
      let permissionDetails = window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.TaskOperationPermission>', undefined);
      let data = window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.TaskOperationPermission>', undefined);
      data = window.$genInitFromSchema(
        'nasl.collection.List<extensions.lcap_process_framework.structures.TaskOperationPermission>',
        await window.LcapRequest({
          url: '/api/lcap_process_framework/getTaskOperationPermissions',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
          },
          data: {
            taskId: this.taskId,
          },
        }),
      );
      if (window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.TaskOperationPermission>', value: data })) {
        permissionDetails = window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.TaskOperationPermission>', await window.$utils.ListFilterAsync(data, (item) => (item || {}).operationEnabled));
        if (window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.TaskOperationPermission>', value: permissionDetails })) {
          this.processButtonMap = window.$genInitFromSchema(
            'nasl.collection.Map<nasl.core.String, extensions.lcap_process_framework.structures.TaskOperationPermission>',
            await window.$utils.ListToMapAsync(
              permissionDetails,
              (item) => (item || {}).name,
              (item) => item,
            ),
          );
          if (window.$utils.HasValue({ type: 'extensions.lcap_process_framework.structures.TaskOperationPermission', value: window.$genInitFromSchema('extensions.lcap_process_framework.structures.TaskOperationPermission', window.$utils.MapGet(this.processButtonMap, 'addSign')) })) {
            this.processButtonApprovalPolicy = await this.getSignOptions();
          }
        }
      }
    },

    async getSignOptions() {
      let taskInst = window.$genInitFromSchema('extensions.lcap_process_framework.structures.TaskInst', undefined);
      let result;
      taskInst = window.$genInitFromSchema(
        'extensions.lcap_process_framework.structures.TaskInst',
        await window.LcapRequest({
          url: '/api/lcap_process_framework/getTaskInfo',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
          },
          data: {
            taskId: this.taskId,
          },
        }),
      );
      if (window.$utils.HasValue({ type: 'extensions.lcap_process_framework.structures.TaskInst', value: taskInst }, { type: 'nasl.core.String', value: (taskInst || {}).approvalPolicy })) {
        if (
          window.$utils.Contains(
            await (async () => {
              const arr = ['simple', 'parallel', 'sequence'];
              return arr;
            })(),
            (taskInst || {}).approvalPolicy,
          )
        ) {
          result = (taskInst || {}).approvalPolicy;
        }
      }
      return result;
    },

    async openButtonModal(name) {
      let hasForm;
      let valid;
      /* 流程表单是否存在 */ /* 表单校验是否通过 */ window.$genInitFromSchema('{afterComplete: nasl.core.String, comment: nasl.core.String, nodeId: nasl.core.String, policyForAddSign: nasl.core.String, task: nasl.core.String, userForOperate: nasl.core.String}', window.$utils.Clear(this.processButtonBody, 'deep', '{afterComplete: nasl.core.String, comment: nasl.core.String, nodeId: nasl.core.String, policyForAddSign: nasl.core.String, task: nasl.core.String, userForOperate: nasl.core.String}'));
      this.processButtonItem = window.$genInitFromSchema('extensions.lcap_process_framework.structures.TaskOperationPermission', window.$utils.MapGet(this.processButtonMap, name));
      {
        const it = name;
        if (window.$global.isEqual(it, 'withdraw') || window.$global.isEqual(it, 'revert')) {
          if (name == 'revert' && (this.processButtonItem || {}).afterComplete == 'runtimeSpecify') {
            this.processButtonBody.afterComplete = 'reExecute';
          }
          await this.$refs.button_backModal_1?.open?.();
        } else {
          await (async () => {
            'use JSBlock';
            // 流程表单验证，通过脚本获取流程表单校验结果
            if (window.__processDetailFromMixinFormVm__ && window.__processDetailFromMixinFormVm__.validate) {
              hasForm = true;
              const validateResult = await window.__processDetailFromMixinFormVm__.validate();
              if (validateResult.valid) {
                valid = true;
              }
            } else {
              hasForm = false;
            }
          })();
          if (hasForm) {
            if (valid) {
              /*  如果为submit按钮，直接走提交事件  */
              if (name == 'submit') {
                await this.submitButton(name);
                return;
              }
            } else {
              return;
            }
          } else {
            /*  无流程表单直接弹窗！  */
          }
          if ((this.processButtonItem || {}).name == 'addSign') {
            this.processButtonBody.policyForAddSign = 'CurrentNode';
          }
          await this.$refs.button_modal_1?.open?.();
        }
      }
    },

    async getUser(name, page, size, filterText) {
      let result = window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>, total: nasl.core.Long}', undefined);
      {
        const it = name;
        if (window.$global.isEqual(it, 'addSign')) {
          result = window.$genInitFromSchema(
            '{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>, total: nasl.core.Long}',
            await window.LcapRequest({
              url: '/api/lcap_process_framework/getUsersForAddSign',
              method: 'POST',
              extraConfig: {
                serviceType: 'micro',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
              },
              data: {
                taskId: this.taskId,
                page,
                size,
                userName: filterText,
              },
            }),
          );
        } else if (window.$global.isEqual(it, 'reassign')) {
          result = window.$genInitFromSchema(
            '{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>, total: nasl.core.Long}',
            await window.LcapRequest({
              url: '/api/lcap_process_framework/getUsersForReassign',
              method: 'POST',
              extraConfig: {
                serviceType: 'micro',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
              },
              data: {
                taskId: this.taskId,
                page,
                size,
                userName: filterText,
              },
            }),
          );
        } else { /* empty */ }
      }
      return result;
    },

    async submitButton(name) {
      {
        const it = name;
        if (window.$global.isEqual(it, 'reassign')) {
          await window.LcapRequest({
            url: '/api/lcap_process_framework/reassignTask',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
            },
            data: {
              taskId: this.taskId,
              userForReassign: (this.processButtonBody || {}).userForOperate,
            },
          });
        } else if (window.$global.isEqual(it, 'addSign')) {
          await window.LcapRequest({
            url: '/api/lcap_process_framework/addSignTask',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
            },
            data: {
              taskId: this.taskId,
              userForAddSign: (this.processButtonBody || {}).userForOperate,
              policyForAddSign: (this.processButtonBody || {}).policyForAddSign,
            },
          });
        } else if (window.$global.isEqual(it, 'withdraw')) {
          await window.LcapRequest({
            url: '/api/lcap_process_framework/withdrawTask',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
            },
            data: {
              taskId: this.taskId,
            },
          });
        } else if (window.$global.isEqual(it, 'revert')) {
          await window.LcapRequest({
            url: '/api/lcap_process_framework/revertTask',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
            },
            data: {
              taskId: this.taskId,
              nodeId: (this.processButtonBody || {}).nodeId,
              afterComplete: (this.processButtonBody || {}).afterComplete,
              comment: (this.processButtonBody || {}).comment,
            },
          });
        } else {
          await (async () => {
            'use JSBlock';
            const operate = `${name}Task`;
            const body = {
              taskId: this.taskId,
            };
            // 审批同意、提交表单等操作时获取流程表单数据，接口调用也可使用流程逻辑
            if (window.__processDetailFromMixinFormData__) {
              body.data = window.__processDetailFromMixinFormData__;
            }
            if (name !== 'submit') {
              body.comment = this.processButtonBody.comment;
            }
            const res = await this.$processV2.setTaskInstance({
              path: {
                operate,
              },
              body,
            });
          })();
        }
      }
      await (async () => {
        'use JSBlock';
        // 刷新页面
        window.location.reload();
      })();
    },

    async getBackNodes() {
      let result = window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.RevertFlowNode>', undefined);
      result = window.$genInitFromSchema(
        'nasl.collection.List<extensions.lcap_process_framework.structures.RevertFlowNode>',
        await window.LcapRequest({
          url: '/api/lcap_process_framework/getBackNodes',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
          },
          data: {
            taskId: this.taskId,
          },
        }),
      );
      if (window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.RevertFlowNode>', value: result })) {
        this.processButtonBody.nodeId = (window.$genInitFromSchema('extensions.lcap_process_framework.structures.RevertFlowNode', window.$utils.ListHead(result)) || {}).nodeId;
      }
      return result;
    },

    async getProcInstInfo() {
      let processInfoData = window.$genInitFromSchema('extensions.lcap_process_framework.structures.ProcInstInfo', undefined);
      let processInfoCurrNodes = window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>', undefined);
      /* 流程信息数据 */ /* 流程信息当前节点 */ if (window.$utils.HasValue({ type: 'nasl.core.String', value: this.taskId })) {
        processInfoData = window.$genInitFromSchema(
          'extensions.lcap_process_framework.structures.ProcInstInfo',
          await window.LcapRequest({
            url: '/api/lcap_process_framework/getProcInstInfo',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
            },
            data: {
              taskId: this.taskId,
            },
          }),
        );
        if (window.$utils.HasValue({ type: 'extensions.lcap_process_framework.structures.ProcInstInfo', value: processInfoData })) {
          this.processInfo.procInstStartTime = (processInfoData || {}).procInstStartTime;
          this.processInfo.procInstStatus = (processInfoData || {}).procInstStatus;
          this.processInfo.procInstInitiator = await (async () => {
            const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((processInfoData || {}).procInstInitiator || {}).displayName });
            if (window.$global.isEqual(it, false)) {
              return ((processInfoData || {}).procInstInitiator || {}).userName;
            } else if (window.$global.isEqual(it, true)) {
              return ((processInfoData || {}).procInstInitiator || {}).displayName;
            } else { /* empty */ }
          })();
          if (window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>', value: (processInfoData || {}).procInstCurrNodes })) {
            this.processInfo.currNodeTitles = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListTransformAsync((processInfoData || {}).procInstCurrNodes, (item) => (item || {}).currNodeTitle));
            processInfoCurrNodes = window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>', await window.$utils.ListFilterAsync((processInfoData || {}).procInstCurrNodes, (item) => window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>', value: (item || {}).currNodeParticipants })));
            if (window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.CurrNode>', value: processInfoCurrNodes })) {
              this.processInfo.currNodeParticipants = window.$genInitFromSchema(
                'nasl.collection.List<nasl.core.String>',
                window.$utils.ListDistinct(
                  window.$genInitFromSchema(
                    'nasl.collection.List<nasl.core.String>',
                    await window.$utils.ListTransformAsync(
                      window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>', window.$utils.ListFlatten(window.$genInitFromSchema('nasl.collection.List<nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>>', await window.$utils.ListTransformAsync(processInfoCurrNodes, (item) => (item || {}).currNodeParticipants)))),
                      async (item) =>
                        await (async () => {
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
              );
            }
          }
        }
      }
    },

    async getProcInstRecords(page, size) {
      let result = window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcInstRecord>, total: nasl.core.Long}', undefined);
      if (window.$utils.HasValue({ type: 'nasl.core.String', value: this.taskId })) {
        result = window.$genInitFromSchema(
          '{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcInstRecord>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcap_process_framework/getProcInstRecords',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
            },
            data: {
              taskId: this.taskId,
              page,
              size,
            },
          }),
        );
      }
      return result;
    },

    async getProcInstGraph() {
      let result = window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.ProcInstGraph>', undefined);
      result = await (async () => {
        const arr = [
          window.$genInitFromSchema(
            'extensions.lcap_process_framework.structures.ProcInstGraph',
            await window.LcapRequest({
              url: '/api/lcap_process_framework/getProcInstGraph',
              method: 'POST',
              extraConfig: {
                serviceType: 'micro',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/approveLeaveProcess/0',
              },
              data: {
                taskId: this.taskId,
              },
            }),
          ),
        ];
        return arr;
      })();
      return result;
    },

    async approveLeaveProcess_created(event) {
      await this.approveLeaveProcess_created_created1(event);
      await this.approveLeaveProcess_created_created(event);
    },

    async approveLeaveProcess_created_created1() {
      this.$global.frontendVariables.title = '流程审批';
      await this.getProcInstInfo();
    },

    async approveLeaveProcess_created_created() {
      await (async () => {
        'use JSBlock';
        const style = document.createElement('style');
        // 设置 CSS 块的内容
        style.innerHTML = '.__processV2_button_modal_radios_signOptions:has([class^=u-radios_radio_radio__][selected]){ border-color: #37f !important; }';
        // 将 style 标签插入到 head 元素中
        document.head.appendChild(style);
        this.$on('hook:beforeDestroy', () => {
          document.head.removeChild(style);
        });
      })();
      await this.getTaskOperationPermissions();
    },

    async button_modal_1_open(event) {
      await this.button_modal_1_open_open(event);
    },

    async button_modal_1_open_open() {
      await (async () => {
        'use JSBlock';
        // 延迟100ms加载
        setTimeout(() => {
          const element = this.$refs.radios_addSign_1?.$el;
          if (element) {
            const elements = element.querySelectorAll('[class^="u-radios_radio___"]');
            elements.forEach((el) => {
              el.classList.add('__processV2_button_modal_radios_signOptions');
            });
          }
        }, 100);
      })();
    },

    async button_12_click(event) {
      await this.button_12_click_click(event);
    },

    async button_12_click_click() {
      await this.$refs.button_modal_1?.close?.();
    },

    async button_13_click(event) {
      await this.button_13_click_click(event);
    },

    async button_13_click_click() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_buttonModal_1?.validate?.(undefined, undefined)) || {}).valid) {
        await this.submitButton((this.processButtonItem || {}).name);
      }
    },

    async button_14_click(event) {
      await this.button_14_click_click(event);
    },

    async button_14_click_click() {
      await this.$refs.button_backModal_1?.close?.();
    },

    async button_15_click(event) {
      await this.button_15_click_click(event);
    },

    async button_15_click_click() {
      if ((this.processButtonItem || {}).name == 'revert') {
        if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_revert_1?.validate?.(undefined, undefined)) || {}).valid) { /* empty */ } else {
          if (window.$utils.HasValue({ type: 'nasl.core.String', value: (this.processButtonBody || {}).nodeId })) { /* empty */ } else {
            await this.$refs.button_toast_1?.open?.();
          }

          return;
        }
      }
      await this.submitButton((this.processButtonItem || {}).name);
    },

    async button_5_click(event) {
      await this.button_5_click_click(event);
    },

    async button_5_click_click() {
      await this.openButtonModal('submit');
    },

    async button_6_click(event) {
      await this.button_6_click_click(event);
    },

    async button_6_click_click() {
      await this.openButtonModal('approve');
    },

    async button_7_click(event) {
      await this.button_7_click_click(event);
    },

    async button_7_click_click() {
      await this.openButtonModal('reject');
    },

    async button_8_click(event) {
      await this.button_8_click_click(event);
    },

    async button_8_click_click() {
      await this.openButtonModal('reassign');
    },

    async button_9_click(event) {
      await this.button_9_click_click(event);
    },

    async button_9_click_click() {
      await this.openButtonModal('addSign');
    },

    async button_10_click(event) {
      await this.button_10_click_click(event);
    },

    async button_10_click_click() {
      await this.openButtonModal('withdraw');
    },

    async button_11_click(event) {
      await this.button_11_click_click(event);
    },

    async button_11_click_click() {
      await this.openButtonModal('revert');
    },

    genviewMatchExpression_1uadxp90() {
      return (() => {
        const it = window.$utils.HasValue({ type: '{currNodeParticipants: nasl.collection.List<nasl.core.String>, currNodeTitles: nasl.collection.List<nasl.core.String>, procInstInitiator: nasl.core.String, procInstStartTime: nasl.core.DateTime, procInstStatus: nasl.core.String}', value: this.processInfo }, { type: 'nasl.core.String', value: (this.processInfo || {}).procInstInitiator });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return (this.processInfo || {}).procInstInitiator;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_06tz0v40() {
      return (() => {
        const it = window.$utils.HasValue({ type: '{currNodeParticipants: nasl.collection.List<nasl.core.String>, currNodeTitles: nasl.collection.List<nasl.core.String>, procInstInitiator: nasl.core.String, procInstStartTime: nasl.core.DateTime, procInstStatus: nasl.core.String}', value: this.processInfo }, { type: 'nasl.core.DateTime', value: (this.processInfo || {}).procInstStartTime });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.FormatDateTime((this.processInfo || {}).procInstStartTime, 'yyyy-MM-dd HH:mm:ss', 'global');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1hfut8f1() {
      return (() => {
        const it = window.$utils.HasValue({ type: '{currNodeParticipants: nasl.collection.List<nasl.core.String>, currNodeTitles: nasl.collection.List<nasl.core.String>, procInstInitiator: nasl.core.String, procInstStartTime: nasl.core.DateTime, procInstStatus: nasl.core.String}', value: this.processInfo }, { type: 'nasl.core.String', value: (this.processInfo || {}).procInstStatus });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.EnumItemToText('nasl.processV2.enums.ProcInstStatusEnum', window.$genInitFromSchema('nasl.processV2.enums.ProcInstStatusEnum', window.$utils.ToEnumItem((this.processInfo || {}).procInstStatus, { concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'nasl.processV2.enums', typeName: 'ProcInstStatusEnum' })));
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1kt438f1() {
      return (() => {
        const it = (this.processInfo || {}).procInstStatus;
        if (window.$global.isEqual(it, 'Approved')) {
          return '#666666';
        } else if (window.$global.isEqual(it, 'Approving')) {
          return '#337EFF';
        } else {
          return '';
        }
      })();
    },

    genviewMatchExpression_0y4y5wq1() {
      return (() => {
        const it = (this.processInfo || {}).procInstStatus;
        if (window.$global.isEqual(it, 'Approved')) {
          return '#F5F5F5';
        } else if (window.$global.isEqual(it, 'Approving')) {
          return '#EAF2FF';
        } else {
          return '';
        }
      })();
    },

    genviewMatchExpression_1rjfkjn0() {
      return (() => {
        const it = window.$utils.HasValue({ type: '{currNodeParticipants: nasl.collection.List<nasl.core.String>, currNodeTitles: nasl.collection.List<nasl.core.String>, procInstInitiator: nasl.core.String, procInstStartTime: nasl.core.DateTime, procInstStatus: nasl.core.String}', value: this.processInfo }, { type: 'nasl.collection.List<nasl.core.String>', value: (this.processInfo || {}).currNodeTitles });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.Join((this.processInfo || {}).currNodeTitles, '，');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0gniymh1() {
      return (() => {
        const it = window.$utils.HasValue({ type: '{currNodeParticipants: nasl.collection.List<nasl.core.String>, currNodeTitles: nasl.collection.List<nasl.core.String>, procInstInitiator: nasl.core.String, procInstStartTime: nasl.core.DateTime, procInstStatus: nasl.core.String}', value: this.processInfo }, { type: 'nasl.collection.List<nasl.core.String>', value: (this.processInfo || {}).currNodeParticipants });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.Join((this.processInfo || {}).currNodeParticipants, '，');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1t5ewz20(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).nodeTitle });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).nodeTitle;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1ix8sa50(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).recordUser || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return (() => {
            const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).recordUser || {}).userName });
            if (window.$global.isEqual(it, false)) {
              return '-';
            } else if (window.$global.isEqual(it, true)) {
              return (((current || {}).item || {}).recordUser || {}).userName;
            } else { /* empty */ }
          })();
        } else if (window.$global.isEqual(it, true)) {
          return (((current || {}).item || {}).recordUser || {}).displayName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0q9akdm1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (((current || {}).item || {}).recordUser || {}).userName });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return (((current || {}).item || {}).recordUser || {}).userName;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1bloror1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.DateTime', value: ((current || {}).item || {}).recordCreatedTime });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return window.$utils.FormatDateTime(((current || {}).item || {}).recordCreatedTime, 'yyyy-MM-dd HH:mm:ss', 'global');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_16tnf3u0(current) {
      return (() => {
        const it = ((current || {}).item || {}).nodeOperation;
        if (window.$global.isEqual(it, 'end') || window.$global.isEqual(it, 'terminate')) {
          return '#666666';
        } else if (window.$global.isEqual(it, 'revert') || window.$global.isEqual(it, 'withdraw')) {
          return '#FF8024';
        } else if (window.$global.isEqual(it, 'reject')) {
          return '#F24957';
        } else if (window.$global.isEqual(it, 'approve')) {
          return '#26BD71';
        } else if (window.$global.isEqual(it, 'launch') || window.$global.isEqual(it, 'submit') || window.$global.isEqual(it, 'reassign') || window.$global.isEqual(it, 'addSign') || window.$global.isEqual(it, 'cc')) {
          return '#337EFF';
        } else {
          return '#666666';
        }
      })();
    },

    genviewMatchExpression_1d6q0mh1(current) {
      return (() => {
        const it = ((current || {}).item || {}).nodeOperation;
        if (window.$global.isEqual(it, 'end') || window.$global.isEqual(it, 'terminate')) {
          return '#F5F5F5';
        } else if (window.$global.isEqual(it, 'revert') || window.$global.isEqual(it, 'withdraw')) {
          return '#FFF2E9';
        } else if (window.$global.isEqual(it, 'reject')) {
          return '#FEEDEF';
        } else if (window.$global.isEqual(it, 'approve')) {
          return '#E9F8F0';
        } else if (window.$global.isEqual(it, 'launch') || window.$global.isEqual(it, 'submit') || window.$global.isEqual(it, 'reassign') || window.$global.isEqual(it, 'addSign') || window.$global.isEqual(it, 'cc')) {
          return '#EAF2FF';
        } else {
          return '#F5F5F5';
        }
      })();
    },

    genviewMatchExpression_1b7i8ic1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).nodeOperationComment });
        if (window.$global.isEqual(it, false)) {
          return '-';
        } else if (window.$global.isEqual(it, true)) {
          return ((current || {}).item || {}).nodeOperationComment;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1kswaid0() {
      return (() => {
        const it = this.processButtonApprovalPolicy == 'simple';
        if (window.$global.isEqual(it, false)) {
          return 1;
        } else if (window.$global.isEqual(it, true)) {
          return 3;
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_02n0vhu1(current) {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: ((current || {}).item || {}).displayName });
        if (window.$global.isEqual(it, false)) {
          return ((current || {}).item || {}).userName;
        } else if (window.$global.isEqual(it, true)) {
          return window.$global.add(window.$global.add(window.$global.add(((current || {}).item || {}).displayName, '（'), ((current || {}).item || {}).userName), '）');
        } else { /* empty */ }
      })();
    },

    __table_view_record_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__table_view_record_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcInstRecord>, total: nasl.core.Long}', await this.getProcInstRecords(this.table_view_record_1_state_page, this.table_view_record_1_state_size));
      });
    },

    __fl_process_graph_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__fl_process_graph_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.ProcInstGraph>', await this.getProcInstGraph());
      });
    },

    __select_4_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_4_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.ProcessUser>, total: nasl.core.Long}', await this.getUser((this.processButtonItem || {}).name, this.select_4_state_page, this.select_4_state_size, this.select_4_state_filterText));
      });
    },

    __radios_revert_flow_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__radios_revert_flow_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.RevertFlowNode>', await this.getBackNodes());
      });
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.approveLeaveProcess_created();
  },
};
</script>
