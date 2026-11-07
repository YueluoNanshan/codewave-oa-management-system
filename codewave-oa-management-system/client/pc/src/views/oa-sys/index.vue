<template>
  <u-linear-layout
    ref="uLinearLayout1"
    class="cw-style-height"
    type="root"
    gap="none"
    style="--cw-style-height: 100%; height: 100%; --custom-start: auto; min-height: 200px"
  >
    <u-multi-layout
      ref="multi_layout_1"
      direction="vertical"
    >
      <u-multi-layout-item
        ref="multi_layout_item_1"
        class="cw-style-height"
        style="--cw-style-height: 60px; height: 60px"
      >
        <u-navbar-multi
          ref="navbar_multi_1"
          class="cw-style-width cw-style-height cw-style-background-color cw-style-margin-left cw-style-margin"
          style="--cw-style-width: auto; --cw-style-height: 59.999996185302734px; --cw-style-background-color: #fbfbfb; --cw-style-margin-left: 200px; margin-left: 200px; background-color: #fbfbfb; position: fixed; width: auto; height: 59.999996185302734px; left: 0px; top: 0px; right: 0px"
        >
          <template
            #right

          >
            <u-multi-layout-item
              ref="multi_layout_item_5"
              class="cw-style-text-align"
              alignItems="center"
              mode="flex"
              justify="end"
              alignment="center"
              style="--cw-style-text-align: right; text-align: right"
            >
              <i-ico
                ref="ico_10"
                class="cw-style-margin-right cw-style-margin cw-style-font-size cw-style-color"
                name="position"
                icotype="left"
                style="--cw-style-margin-right: 8px; --cw-style-font-size: 20px; --cw-style-color: #050505; font-size: 20px; margin-right: 8px; color: #050505"
              >
                <u-text
                  ref="text_476"
                  class="cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', (($global.frontendVariables.weather || {}).result || {}).city)"
                  style="--cw-style-color: #060606; color: #060606"
                ></u-text>
              </i-ico>
              <u-text
                ref="text_477"
                class="cw-style-margin-right cw-style-margin cw-style-color"
                :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `AQI：`) + $utils['ToString']('nasl.core.String', ((($global.frontendVariables.weather || {}).result || {}).realtime || {}).aqi))"
                style="--cw-style-margin-right: 8px; --cw-style-color: #040404; margin-right: 8px; color: #040404"
              ></u-text>
              <u-label
                ref="label_2"
                class="cw-style-background-color cw-style-padding-left cw-style-padding cw-style-padding-right cw-style-margin-right cw-style-margin cw-style-color cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                color="primary"
                :text="$utils['ToString']('nasl.core.String', $global.frontendVariables.aqiString)"
                :style="{ 'background-color': genviewMatchExpression_0j0c2xp1(), '--cw-style-background-color': genviewMatchExpression_0j0c2xp1() }"
                style="--cw-style-padding-left: 4px; --cw-style-padding-right: 4px; --cw-style-margin-right: 8px; --cw-style-color: #040404; --cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px; padding-left: 4px; padding-right: 4px; margin-right: 8px; color: #040404"
              ></u-label>
              <u-dropdown
                ref="dropdown_1"
                class="cw-style-margin-right cw-style-margin cw-style-color"
                style="--cw-style-margin-right: 10px; --cw-style-color: #060606; margin-right: 10px; color: #060606"
              >
                <template
                  #title

                >
                  <u-linear-layout
                    ref="linear_layout_1"
                    key="linear_layout_1"
                    gap="small"
                    v-if="$global.userInfo"
                  >
                    <fl-process-task-box
                      ref="fl_process_task_box_1"
                      class="cw-style-width"
                      style="--cw-style-width: 40px; width: 40px"
                    >
                      <u-popup-combination
                        ref="popup_combination_1"
                        placement="bottom"
                        @before-open="popup_combination_1_beforeopen($event)"
                      >
                        <template
                          #reference

                        >
                          <u-linear-layout
                            ref="linear_layout_2"
                            class="cw-style-width cw-style-height"
                            direction="horizontal"
                            :wrap="true"
                            mode="flex"
                            justify="center"
                            alignment="center"
                            style="--cw-style-width: 40px; --cw-style-height: 58px; width: 40px; height: 58px; cursor: pointer"
                          >
                            <u-badge
                              ref="badge_1"
                              :value="(taskBoxConfig || {}).total"
                              :corner="true"
                              style="--custom-start: auto; --badge-box-shadow: 0 0 0 0 #fff"
                            >
                              <i-ico
                                ref="ico_17"
                                class="cw-style-font-size"
                                name="notice"
                                icotype="only"
                                style="--cw-style-font-size: 24px; font-size: 24px"
                              ></i-ico>
                            </u-badge>
                          </u-linear-layout>
                        </template>
                        <u-linear-layout
                          ref="linear_layout_6"
                          class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                          direction="horizontal"
                          mode="inline"
                          style="--cw-style-padding-left: 16px; --cw-style-padding-bottom: 16px; --cw-style-padding-top: 16px; --cw-style-padding-right: 16px; padding-top: 16px; padding-left: 16px; padding-bottom: 16px; padding-right: 16px; min-width: 360px; --custom-start: auto; max-width: calc(100vw - 24px)"
                        >
                          <u-linear-layout
                            ref="linear_layout_3"
                            class="cw-style-width cw-style-padding-bottom cw-style-padding cw-style-color"
                            direction="horizontal"
                            :wrap="true"
                            style="--cw-style-width: 100%; --cw-style-padding-bottom: 16px; --cw-style-color: #337eff; width: 100%; padding-bottom: 16px; color: #337eff; --custom-start: auto; font-size: 1.17em; font-weight: bold"
                          >
                            <u-text
                              ref="text_488"
                              class="cw-style-margin-right cw-style-margin"
                              text="待处理任务 ("
                              style="--cw-style-margin-right: 0px; margin-right: 0px"
                            ></u-text>
                            <u-text
                              ref="text_489"
                              class="cw-style-margin-right cw-style-margin"
                              :text="$utils['ToString']('nasl.core.Long', (taskBoxConfig || {}).total)"
                              style="--cw-style-margin-right: 0px; margin-right: 0px"
                            ></u-text>
                            <u-text
                              ref="text_490"
                              text=")"
                            ></u-text>
                          </u-linear-layout>
                          <u-linear-layout
                            ref="linear_layout_5"
                            direction="horizontal"
                            :wrap="true"
                            gap="normal"
                            style="--space-base: 0px"
                          >
                            <u-list-view
                              ref="list_view_1"
                              key="list_view_1"
                              class="cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                              :pageNumber="1"
                              :pageSize="20"
                              height="auto"
                              width="auto"
                              :dataSource="(taskBoxConfig || {}).data"
                              :border="true"
                              :rowStyle="(current) => genList_view_1_bindAttrs_rowStyle(current)"
                              @select="list_view_1_select($event)"
                              v-if="(taskBoxConfig || {}).total > 0"
                              style="--cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; border-style: solid; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; --custom-start: auto; --list-view-item-background-selected: #f4f6f9; --list-view-item-color-selected: #333333; --list-view-item-background-hover: #f4f6f9; --list-view-item-padding: 0px"
                            >
                              <template
                                #item="current"

                              >
                                <u-linear-layout
                                  :ref="`linear_layout_4_${(current || {}).__nodeKey || (current || {}).index}`"
                                  class="cw-style-width cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                                  direction="horizontal"
                                  :wrap="true"
                                  mode="flex"
                                  justify="space-between"
                                  alignment="center"
                                  style="--cw-style-width: 100%; --cw-style-padding-left: 8px; --cw-style-padding-bottom: 15px; --cw-style-padding-top: 15px; --cw-style-padding-right: 8px; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 1px; width: 100%; padding-top: 15px; padding-bottom: 15px; padding-left: 8px; padding-right: 8px; border-bottom-width: 1px; border-style: solid; border-left-width: 0px; border-top-width: 0px; border-right-width: 0px"
                                >
                                  <u-link
                                    :ref="`link_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).taskTitle)"
                                    hoverType="color"
                                    style="--link-color: #333333; --custom-start: auto; display: inline-block; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; max-width: calc(100vw - 200px); line-height: 1em"
                                  ></u-link>
                                  <u-text
                                    :ref="`text_491_${(current || {}).__nodeKey || (current || {}).index}`"
                                    class="cw-style-width cw-style-font-size cw-style-color"
                                    :text="$utils['ToString']('nasl.core.DateTime', ((current || {}).item || {}).procInstStartTime)"
                                    overflow="nowrap"
                                    widthStretch="false"
                                    style="--cw-style-width: 120px; --cw-style-font-size: 12px; --cw-style-color: #ccc; width: 120px; font-size: 12px; color: #ccc; line-height: 1em"
                                  ></u-text>
                                </u-linear-layout>
                              </template>
                              <template
                                #empty

                              ></template>
                            </u-list-view>
                            <u-pagination
                              ref="pagination_1"
                              class="cw-style-margin-top cw-style-margin"
                              :total="11"
                              :simple="true"
                              :page.sync="taskBoxConfig.page"
                              :pageSize.sync="taskBoxConfig.size"
                              :totalItems="(taskBoxConfig || {}).total"
                              @change="pagination_1_change($event)"
                              style="--cw-style-margin-top: 16px; margin-top: 16px"
                            ></u-pagination>
                          </u-linear-layout>
                        </u-linear-layout>
                      </u-popup-combination>
                    </fl-process-task-box>
                    <span
                      ref="span_1"
                      class="cw-style-margin-left cw-style-margin cw-style-margin-right"
                      style="--cw-style-margin-left: 10px; --cw-style-margin-right: 10px; display: inline-block; vertical-align: top; margin-left: 10px; margin-right: 10px"
                    >
                      <i-ico
                        ref="ico_16"
                        class="cw-style-color"
                        name="/assets/user/jasonzcmu/1766830318436_7d906895fd2b4dd8867b6283dc0a3f1e.svg"
                        icotype="left"
                        style="--cw-style-color: #ffffff; color: #ffffff"
                      >
                        <u-text
                          ref="text_483"
                          class="cw-style-color"
                          text="更多"
                          style="--cw-style-color: #030303; color: #030303"
                        ></u-text>
                      </i-ico>
                    </span>
                  </u-linear-layout>
                </template>
                <u-dropdown-item
                  #default
                  ref="dropdown_item_1"
                >
                  <u-text
                    ref="text_1"
                    text="安全退出"
                    @click="text_1_click($event)"
                  ></u-text>
                </u-dropdown-item>
              </u-dropdown>
            </u-multi-layout-item>
          </template>
          <template
            #left

          >
            <u-text
              ref="text_487"
              class="cw-style-margin-left cw-style-margin cw-style-color"
              size="large"
              :text="$utils['ToString']('nasl.core.String', $global.frontendVariables.title)"
              style="--cw-style-margin-left: 20px; --cw-style-color: #010101; color: #010101; margin-left: 20px"
            ></u-text>
          </template>
        </u-navbar-multi>
      </u-multi-layout-item>
      <u-multi-layout-item ref="multi_layout_item_2">
        <u-multi-layout ref="multi_layout_2">
          <u-multi-layout-item
            ref="multi_layout_item_3"
            class="cw-style-width"
            style="--cw-style-width: 200px; width: 200px"
          >
            <u-sidebar
              ref="sidebar_1"
              class="cw-style-width cw-style-height cw-style-background-color"
              :router="true"
              style="--cw-style-width: 199.99998474121094px; --cw-style-height: 1490.302978515625px; --cw-style-background-color: #000000; background-color: #000000; --sidebar-item-background-selected: #000000; --sidebar-item-background-hover: #070707; --sidebar-item-background: #000000; --sidebar-group-head-color-hover: #fefefe; --sidebar-group-head-background-hover: #050505; --sidebar-item-color-hover: #fcfcfc; --sidebar-item-icon-color-hover: #ffffff; position: fixed; width: 199.99998474121094px; height: 1490.302978515625px; left: 0px; top: 0px; --sidebar-item-color: #ffffff"
            >
              <u-sidebar-item
                ref="sidebar_item_22"
                class="cw-style-height cw-style-text-align cw-style-padding-left cw-style-padding"
                style="--cw-style-height: 70px; --cw-style-text-align: center; --cw-style-padding-left: 10px; padding-left: 10px; height: 70px; text-align: center"
              >
                <u-image
                  ref="image_2"
                  class="cw-style-width cw-style-height cw-style-margin"
                  fit="cover"
                  src="/assets/user/jasonzcmu/1764917008339_25ba316b06e84b038b88666acba70d33.webp"
                  style="--cw-style-width: 28px; --cw-style-height: 28px; --cw-style-margin: 16px 14px; width: 28px; height: 28px; margin: 16px 14px; --custom-start: auto; vertical-align: middle"
                ></u-image>
                <u-text
                  ref="text_3"
                  text="OA管理系统"
                  size="large"
                  style="--custom-start: auto; vertical-align: middle"
                ></u-text>
              </u-sidebar-item>
              <u-sidebar-item
                ref="sidebar_item_19"
                class="cw-style-text-align cw-style-padding-left cw-style-padding"
                style="--cw-style-text-align: center; --cw-style-padding-left: 8px; text-align: center; padding-left: 8px"
              >
                <u-button
                  ref="button_2"
                  class="cw-style-width cw-style-height"
                  color="primary"
                  :throttleTime="150"
                  text="新建流程"
                  icon="add"
                  iconPosition="left"
                  destination="/oaSys/newProcess"
                  size="normal"
                  style="--cw-style-width: 160px; --cw-style-height: 31.990741729736328px; position: static; width: 160px; height: 31.990741729736328px"
                ></u-button>
              </u-sidebar-item>
              <u-sidebar-item
                ref="sidebar_item_1"
                value="1"
                destination="/oaSys/homePage"
              >
                <u-text
                  ref="text_6"
                  text="主页"
                ></u-text>
              </u-sidebar-item>
              <u-sidebar-group
                ref="sidebar_group_3"
                :collapsible="true"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_94"
                    class="cw-style-color"
                    text="我的"
                    style="--cw-style-color: #fcfcfc; color: #fcfcfc"
                  ></u-text>
                </template>
                <u-sidebar-item
                  ref="sidebar_item_20"
                  class="cw-style-padding-left cw-style-padding"
                  destination="/oaSys/myProcess"
                  style="--cw-style-padding-left: 50px; padding-left: 50px"
                >
                  <u-text
                    ref="text_441"
                    class="cw-style-color"
                    text="我的流程"
                    style="--cw-style-color: #fcfcfc; color: #fcfcfc"
                  ></u-text>
                </u-sidebar-item>
                <u-sidebar-item
                  ref="sidebar_item_21"
                  class="cw-style-padding-left cw-style-padding"
                  destination="/oaSys/myClock"
                  style="--cw-style-padding-left: 50px; padding-left: 50px"
                >
                  <u-text
                    ref="text_442"
                    text="我的考勤"
                  ></u-text>
                </u-sidebar-item>
                <u-sidebar-item
                  ref="sidebar_item_11"
                  class="cw-style-padding-left cw-style-padding"
                  destination="/oaSys/myAsset"
                  style="--cw-style-padding-left: 50px; padding-left: 50px"
                >
                  <u-text
                    ref="text_95"
                    text="我的资产"
                  ></u-text>
                </u-sidebar-item>
                <u-sidebar-item
                  ref="sidebar_item_16"
                  class="cw-style-padding-left cw-style-padding"
                  destination="/oaSys/mySchedule"
                  style="--cw-style-padding-left: 50px; padding-left: 50px"
                >
                  <u-text
                    ref="text_101"
                    text="我的日程"
                  ></u-text>
                </u-sidebar-item>
              </u-sidebar-group>
              <u-sidebar-group
                ref="sidebar_group_1"
                :collapsible="true"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_9"
                    class="cw-style-color"
                    text="资产管理"
                    style="--cw-style-color: #fcfcfc; color: #fcfcfc"
                  ></u-text>
                </template>
                <u-sidebar-item
                  ref="sidebar_item_4"
                  class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                  destination="/oaSys/assetList"
                  style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; padding-top: undefined; padding-left: 50px; padding-right: undefined; padding-bottom: undefined"
                >
                  <u-text
                    ref="text_10"
                    text="资产列表"
                  ></u-text>
                </u-sidebar-item>
                <u-sidebar-item
                  ref="sidebar_item_5"
                  class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                  destination="/oaSys/assetApply"
                  v-if="$auth.has('/oaSys/sidebar_item_5')"
                  style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; padding-top: undefined; padding-left: 50px; padding-right: undefined; padding-bottom: undefined"
                >
                  <u-text
                    ref="text_11"
                    text="资产申领明细"
                  ></u-text>
                </u-sidebar-item>
                <u-sidebar-item
                  ref="sidebar_item_6"
                  class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                  destination="/oaSys/supplierList"
                  v-if="$auth.has('/oaSys/sidebar_item_6')"
                  style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; padding-top: undefined; padding-left: 50px; padding-right: undefined; padding-bottom: undefined"
                >
                  <u-text
                    ref="text_12"
                    text="供应商管理"
                  ></u-text>
                </u-sidebar-item>
              </u-sidebar-group>
              <u-sidebar-group
                ref="sidebar_group_4"
                :collapsible="true"
                :disabled="false"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_96"
                    class="cw-style-color"
                    text="公司信息"
                    style="--cw-style-color: #fcfcfc; color: #fcfcfc"
                  ></u-text>
                </template>
                <u-sidebar-item
                  ref="sidebar_item_12"
                  class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                  destination="/oaSys/companyPolicy"
                  style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; padding-top: undefined; padding-left: 50px; padding-right: undefined; padding-bottom: undefined"
                >
                  <u-text
                    ref="text_97"
                    text="公司政策/动态"
                  ></u-text>
                </u-sidebar-item>
                <u-sidebar-item
                  ref="sidebar_item_13"
                  class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                  destination="/oaSys/createPolicy"
                  v-if="$auth.has('/oaSys/sidebar_item_13')"
                  style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; padding-top: undefined; padding-left: 50px; padding-right: undefined; padding-bottom: undefined"
                >
                  <u-text
                    ref="text_98"
                    text="发布政策/动态"
                  ></u-text>
                </u-sidebar-item>
              </u-sidebar-group>
              <u-sidebar-group
                ref="sidebar_group_6"
                :collapsible="true"
                v-if="$auth.has('/oaSys/sidebar_group_6')"
              >
                <template
                  #title


                >
                  <u-text
                    ref="text_439"
                    class="cw-style-color"
                    text="部门组织"
                    style="--cw-style-color: #fcfcfc; color: #fcfcfc"
                  ></u-text>
                </template>
                <u-sidebar-item
                  ref="sidebar_item_18"
                  class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                  destination="/oaSys/departmentManagement"
                  v-if="$auth.has('/oaSys/sidebar_item_18')"
                  style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; padding-top: undefined; padding-left: 50px; padding-right: undefined; padding-bottom: undefined"
                >
                  <u-text
                    ref="text_440"
                    text="部门管理"
                  ></u-text>
                </u-sidebar-item>
              </u-sidebar-group>
              <u-sidebar-group
                ref="sidebar_group_5"
                :collapsible="true"
                v-if="$auth.has('/oaSys/sidebar_group_5')"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_437"
                    class="cw-style-color"
                    text="考勤管理"
                    style="--cw-style-color: #fcfcfc; color: #fcfcfc"
                  ></u-text>
                </template>
                <u-sidebar-item
                  ref="sidebar_item_17"
                  class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                  destination="/oaSys/setClock"
                  style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; padding-top: undefined; padding-left: 50px; padding-right: undefined; padding-bottom: undefined"
                >
                  <u-text
                    ref="text_438"
                    text="考勤设置"
                  ></u-text>
                </u-sidebar-item>
              </u-sidebar-group>
              <u-sidebar-group
                ref="sidebar_group_2"
                :collapsible="true"
                v-if="$auth.has('/oaSys/sidebar_group_2')"
              >
                <template
                  #title

                >
                  <u-text
                    ref="text_13"
                    class="cw-style-color"
                    text="权限管理"
                    style="--cw-style-color: #fcfcfc; color: #fcfcfc"
                  ></u-text>
                </template>
                <u-sidebar-item
                  ref="sidebar_item_7"
                  class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                  destination="/oaSys/userManagement"
                  style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; padding-top: undefined; padding-left: 50px; padding-right: undefined; padding-bottom: undefined"
                >
                  <u-text
                    ref="text_14"
                    text="人员管理"
                  ></u-text>
                </u-sidebar-item>
                <u-sidebar-item
                  ref="sidebar_item_8"
                  class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                  destination="/oaSys/roleManagement"
                  style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; padding-top: undefined; padding-left: 50px; padding-right: undefined; padding-bottom: undefined"
                >
                  <u-text
                    ref="text_15"
                    text="角色管理"
                  ></u-text>
                </u-sidebar-item>
                <u-sidebar-item
                  ref="sidebar_item_9"
                  class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                  destination="/oaSys/permissionManagement"
                  style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; padding-top: undefined; padding-left: 50px; padding-right: undefined; padding-bottom: undefined"
                >
                  <u-text
                    ref="text_16"
                    text="权限管理"
                  ></u-text>
                </u-sidebar-item>
              </u-sidebar-group>
            </u-sidebar>
          </u-multi-layout-item>
          <u-multi-layout-item
            ref="multi_layout_item_4"
            class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-color"
            style="--cw-style-padding-left: 50px; --cw-style-padding-bottom: undefined; --cw-style-padding-top: undefined; --cw-style-padding-right: undefined; --cw-style-color: #fcfcfc; color: #fcfcfc; padding-left: 50px; padding-top: undefined; padding-right: undefined; padding-bottom: undefined"
          >
            <u-router-view
              ref="router_view1"
              class="cw-style-width cw-style-margin-left cw-style-margin cw-style-margin-top cw-style-margin-right cw-style-color"
              style="--cw-style-width: auto; --cw-style-margin-left: 20px; --cw-style-margin-top: 20px; --cw-style-margin-right: 20px; --cw-style-color: #000000; margin-top: 20px; margin-left: 20px; margin-right: 20px; position: absolute; left: 220px; top: 0px; right: 0px; width: auto; color: #000000"
            ></u-router-view>
          </u-multi-layout-item>
        </u-multi-layout>
      </u-multi-layout-item>
    </u-multi-layout>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      taskBoxInterval: 30,
      taskBoxConfig: window.$genInitFromSchema('{data: nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>, page: nasl.core.Long, size: nasl.core.Long, total: nasl.core.Long}', undefined),
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
      tableView_1_state_page: undefined,
      tableView_1_state_size: undefined,
      tableView_1_state_sort: undefined,
      tableView_1_state_order: undefined,
      tableView_5_state_page: undefined,
      tableView_5_state_size: undefined,
      tableView_5_state_sort: undefined,
      tableView_5_state_order: undefined,
      select_5_state_page: undefined,
      select_5_state_size: undefined,
      select_6_state_page: undefined,
      select_6_state_size: undefined,
      select_3_state_page: undefined,
      select_3_state_size: undefined,
      table_view_1_state_page: undefined,
      table_view_1_state_size: undefined,
      table_view_1_state_sort: undefined,
      table_view_1_state_order: undefined,
      tableView_2_state_page: undefined,
      tableView_2_state_size: undefined,
      tableView_2_state_sort: undefined,
      tableView_2_state_order: undefined,
      tableView_3_state_page: undefined,
      tableView_3_state_size: undefined,
      tableView_3_state_sort: undefined,
      tableView_3_state_order: undefined,
      tableView_state_page: undefined,
      tableView_state_size: undefined,
      tableView_state_sort: undefined,
      tableView_state_order: undefined,
      select_1_state_page: undefined,
      select_1_state_size: undefined,
      select_1_state_filterText: undefined,
      select_2_state_page: undefined,
      select_2_state_size: undefined,
      select_2_state_filterText: undefined,
      table_view_record_1_state_page: undefined,
      table_view_record_1_state_size: undefined,
      select_4_state_page: undefined,
      select_4_state_size: undefined,
      select_4_state_filterText: undefined,
    };
  },
  meta: {
    title: 'oa管理系统',
    crumb: undefined,
    crumbI18n: undefined,
    first: 'homePage',
    auth: 'loginAuth',
  },
  methods: {
    async getMyPendingTasks() {
      let result = window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>, total: nasl.core.Long}', undefined);
      if (window.$utils.HasValue({ type: 'nasl.core.Long', value: (this.taskBoxConfig || {}).page })) { /* empty */ } else {
        this.taskBoxConfig.page = 1;
      }
      if (window.$utils.HasValue({ type: 'nasl.core.Long', value: (this.taskBoxConfig || {}).size })) { /* empty */ } else {
        this.taskBoxConfig.size = 5;
      }
      result = window.$genInitFromSchema(
        '{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>, total: nasl.core.Long}',
        await window.LcapRequest({
          url: '/api/lcap_process_framework/getMyPendingTasks',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/0',
          },
          data: {
            page: (this.taskBoxConfig || {}).page,
            size: (this.taskBoxConfig || {}).size,
          },
        }),
      );
      if (window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>', value: (result || {}).list })) {
        this.taskBoxConfig.data = (result || {}).list;
      }
      this.taskBoxConfig.total = (result || {}).total;
      return result;
    },

    async oaSys_created(event) {
      await this.oaSys_created_created1(event);
      await this.oaSys_created_created(event);
    },

    async oaSys_created_created1() {
      window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>, total: nasl.core.Long}', await this.getMyPendingTasks());
      if (this.taskBoxInterval < 3) {
        this.taskBoxInterval = 3;
      }
      await (async () => {
        'use JSBlock';
        // 设置定时器，定时刷新任务箱
        const _this = this;
        window._processV2TaskBoxInterval = setInterval(() => {
          _this.getMyPendingTasks();
        }, _this.taskBoxInterval * 1000);
      })();
    },

    async oaSys_created_created() {
      this.$global.frontendVariables.weather = window.$genInitFromSchema(
        'apis.oaapight.structures.ApiReturnOfWeather',
        await window.LcapRequest({
          url: '/api/lcplogics/loadWeather',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/0',
          },
          data: {
            ip: await window.$global.getCurrentIp(),
          },
        }),
      );
      if (window.$utils.Convert((((this.$global.frontendVariables.weather || {}).result || {}).realtime || {}).aqi, { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Long' }) < 50) {
        this.$global.frontendVariables.aqiString = '优';
      } else if (window.$utils.Convert((((this.$global.frontendVariables.weather || {}).result || {}).realtime || {}).aqi, { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Long' }) < 100) {
        this.$global.frontendVariables.aqiString = '良';
      } else {
        this.$global.frontendVariables.aqiString = '差';
      }
    },

    async oaSys_destroyed(event) {
      await this.oaSys_destroyed_destroyed(event);
    },

    async oaSys_destroyed_destroyed() {
      await (async () => {
        'use JSBlock';
        // 清除任务箱定时器
        const intervalId = window._processV2TaskBoxInterval;
        if (intervalId !== null && typeof intervalId === 'number') {
          window.clearInterval(intervalId);
        }
      })();
    },

    async text_1_click(event) {
      await this.text_1_click_click(event);
    },

    async text_1_click_click() {
      await window.$global.logout({});
    },

    async popup_combination_1_beforeopen(event) {
      await this.popup_combination_1_beforeOpen_beforeopen(event);
    },

    async popup_combination_1_beforeOpen_beforeopen() {
      window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>, total: nasl.core.Long}', await this.getMyPendingTasks());
    },

    async list_view_1_select(event) {
      await this.list_view_1_select_select(event);
    },

    async list_view_1_select_select(event) {
      let url;
      url = await window.LcapRequest({
        url: '/api/lcap_process_framework/getTaskDestinationUrl',
        method: 'POST',
        extraConfig: {
          serviceType: 'micro',
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/0',
        },
        data: {
          taskId: ((event || {}).item || {}).taskId,
        },
      });
      await (async () => {
        'use JSBlock';
        // 拼接全量url
        url = window.location.origin + url;
      })();
      window.$link(`${url}`, '_self');
    },

    async pagination_1_change(event) {
      await this.pagination_1_change_change(event);
    },

    async pagination_1_change_change(event) {
      this.taskBoxConfig.page = (event || {}).page;
      window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>, total: nasl.core.Long}', await this.getMyPendingTasks());
    },

    genviewMatchExpression_0j0c2xp1() {
      return (() => {
        const it = this.$global.frontendVariables.aqiString;
        if (window.$global.isEqual(it, '优')) {
          return 'green';
        } else if (window.$global.isEqual(it, '良')) {
          return 'orange';
        } else {
          return 'grey';
        }
      })();
    },

    genviewMatchExpression_0cnm38j0(current) {
      return (() => {
        const it = (current || {}).index == 0 || (current || {}).index % 2 == 0;
        if (window.$global.isEqual(it, false)) {
          return '';
        } else if (window.$global.isEqual(it, true)) {
          return '#f4f6f9';
        } else { /* empty */ }
      })();
    },

    genList_view_1_bindAttrs_rowStyle(current) {
      return ((current) =>
        (() => {
          const obj = {
            backgroundColor: null,
            color: null,
          };
          obj.backgroundColor = (() => {
            const it = (current || {}).index == 0 || (current || {}).index % 2 == 0;
            if (window.$global.isEqual(it, false)) {
              return '';
            } else if (window.$global.isEqual(it, true)) {
              return '#f4f6f9';
            } else { /* empty */ }
          })();
          obj.color = '#333333';
          return obj;
        })())(current);
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.oaSys_created();
  },

  async destroyed() {
    await this.oaSys_destroyed();
  },
};
</script>
