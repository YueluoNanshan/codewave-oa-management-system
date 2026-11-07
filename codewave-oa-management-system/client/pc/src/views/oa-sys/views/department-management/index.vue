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
      ref="linear_layout_265"
      class="cw-style-width cw-style-height cw-style-background-color cw-style-color"
      direction="horizontal"
      mode="flex"
      alignment="start"
      justify="start"
      :wrap="false"
      gap="none"
      style="--cw-style-width: 100%; --cw-style-height: 100%; --cw-style-background-color: #f5f6fa; --cw-style-color: #000000; background-color: #f5f6fa; width: 100%; min-height: 200px; height: 100%; color: #000000"
    >
      <u-linear-layout
        ref="linear_layout_266"
        class="cw-style-width cw-style-height"
        direction="horizontal"
        widthStretch="false"
        heightStretch="false"
        gap="none"
        style="--cw-style-width: 20%; --cw-style-height: 100%; width: 20%; height: 100%"
      >
        <u-panel
          ref="panel_2"
          class="cw-style-height cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width cw-style-border-top-right-radius cw-style-border-radius cw-style-border-bottom-right-radius"
          shadow="never"
          :bordered="false"
          style="--cw-style-height: 100%; --cw-style-border-style: solid; --cw-style-border-color: #e5e5e5; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 1px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; --cw-style-border-top-right-radius: 0px; --cw-style-border-bottom-right-radius: 0px; --panel-body-padding-x: 0px; --panel-body-padding-y: 0px; border-style: solid; border-top-width: 0px; border-left-width: 0px; border-right-width: 1px; border-bottom-width: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-color: #e5e5e5; height: 100%"
        >
          <template
            #title

          >
            <u-text
              ref="text_185"
              class="cw-style-font-size"
              text="部门列表"
              style="--cw-style-font-size: 16px; font-size: 16px"
            ></u-text>
          </template>
          <u-linear-layout
            ref="linear_layout_290"
            class="cw-style-width cw-style-margin-top cw-style-margin"
            gap="none"
            direction="horizontal"
            mode="flex"
            alignment="start"
            justify="center"
            heightStretch="false"
            style="--cw-style-width: 100%; --cw-style-margin-top: 15px; position: relative; left: 0; top: 0; width: 100%; margin-top: 15px"
          >
            <u-button
              ref="button_1"
              class="cw-style-width cw-style-height"
              color="primary"
              text="添加部门"
              icon="add"
              size="normal"
              widthStretch="false"
              heightStretch="false"
              @click="button_1_click($event)"
              style="--cw-style-width: 90%; --cw-style-height: 32px; width: 90%; height: 32px"
            ></u-button>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_302"
            class="cw-style-width cw-style-margin-bottom cw-style-margin cw-style-margin-top"
            gap="none"
            direction="horizontal"
            mode="flex"
            alignment="start"
            justify="center"
            heightStretch="false"
            style="--cw-style-width: 100%; --cw-style-margin-bottom: 12px; --cw-style-margin-top: 12px; position: relative; left: 0; top: 0; width: 100%; margin-top: 12px; margin-bottom: 12px"
          >
            <u-input
              ref="input_2"
              class="cw-style-width"
              placeholder="搜索部门"
              :value.sync="search"
              prefix="search"
              widthStretch="false"
              :clearable="true"
              @input="input_2_input($event)"
              style="--cw-style-width: 90%; width: 90%"
            ></u-input>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_2"
            class="cw-style-height cw-style-margin-left cw-style-margin cw-style-margin-bottom cw-style-margin-top cw-style-margin-right"
            direction="vertical"
            gap="none"
            mode="flex"
            justify="start"
            alignment="start"
            style="--cw-style-height: 100%; --cw-style-margin-left: 0px; --cw-style-margin-bottom: 0px; --cw-style-margin-top: 0px; --cw-style-margin-right: 0px; margin-top: 0px; margin-left: 0px; margin-right: 0px; margin-bottom: 0px; height: 100%; min-width: 100%; --custom-start: auto; overflow-x: auto"
          >
            <u-linear-layout
              ref="linear_layout_324"
              key="linear_layout_324"
              gap="none"
              mode="flex"
              direction="vertical"
              justify="start"
              alignment="center"
              widthStretch="false"
              v-if="$utils['HasValue']({ type: 'nasl.core.String', value: search })"
              style="min-width: 100%"
            >
              <u-linear-layout
                ref="linear_layout_325"
                key="linear_layout_325"
                class="cw-style-width"
                gap="none"
                mode="flex"
                direction="vertical"
                justify="start"
                alignment="start"
                widthStretch="false"
                v-if="$utils['HasValue']({ type: 'nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>', value: searchDeptList })"
                style="--cw-style-width: 90%; width: 90%"
              >
                <u-linear-layout
                  ref="linear_layout_326"
                  class="cw-style-width cw-style-padding-bottom cw-style-padding cw-style-padding-top cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                  direction="horizontal"
                  gap="none"
                  widthStretch="false"
                  mode="flex"
                  justify="start"
                  alignment="center"
                  style="--cw-style-width: 100%; --cw-style-padding-bottom: 5px; --cw-style-padding-top: 5px; --cw-style-border-style: solid; --cw-style-border-color: #d8d8d8; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 1px; width: 100%; padding-top: 5px; padding-bottom: 5px; border-bottom-width: 1px; border-style: solid; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-color: #d8d8d8"
                >
                  <u-text
                    ref="text_281"
                    text="部门"
                    style="--custom-start: auto; font-family: PingFang SC; font-size: 14px; font-weight: 500; line-height: 22px; letter-spacing: 0px; color: #999999"
                  ></u-text>
                </u-linear-layout>
                <u-list-view
                  ref="list_view_1"
                  class="cw-style-width cw-style-height cw-style-margin-top cw-style-margin cw-style-color cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                  :pageNumber="1"
                  :pageSize="50"
                  :dataSource="searchDeptList"
                  :border="false"
                  heightStretch="false"
                  key="list_view_1"
                  style="--cw-style-width: 100%; --cw-style-height: auto; --cw-style-margin-top: 4px; --cw-style-color: #000000; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; width: 100%; min-width: 100px; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid; margin-top: 4px; height: auto; color: #000000; --custom-start: auto; --list-view-item-background-hover: #edf3ff; --list-view-item-padding: 0px 0px; --list-view-item-background-selected: #edf3ff; --list-view-item-color-selected: #333"
                >
                  <template
                    #item="current"

                  >
                    <u-linear-layout
                      :ref="`linear_layout_328_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-background-color cw-style-padding-bottom cw-style-padding cw-style-padding-top"
                      gap="none"
                      mode="flex"
                      :wrap="false"
                      direction="horizontal"
                      alignment="center"
                      justify="space-between"
                      @click="linear_layout_328_click($event, current)"
                      :style="{ 'background-color': genviewMatchExpression_1ngkurn1(current), '--cw-style-background-color': genviewMatchExpression_1ngkurn1(current) }"
                      style="--cw-style-padding-bottom: 2px; --cw-style-padding-top: 2px; padding-bottom: 2px; padding-top: 2px"
                    >
                      <u-linear-layout
                        :ref="`linear_layout_335_${(current || {}).__nodeKey || (current || {}).index}`"
                        :wrap="true"
                        direction="vertical"
                        mode="flex"
                        alignment="start"
                        justify="center"
                        gap="normal"
                        style="--space-base: 0px; min-width: 80%"
                      >
                        <u-text
                          :ref="`text_282_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-color"
                          :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).name)"
                          overflow="break"
                          :style="{ color: genviewMatchExpression_0rjyaxr0(current), '--cw-style-color': genviewMatchExpression_0rjyaxr0(current) }"
                          style="max-width: 162px"
                        ></u-text>
                        <u-text
                          :ref="`text_283_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-color"
                          :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).deptId)"
                          overflow="break"
                          style="--cw-style-color: #999; color: #999; max-width: 162px"
                        ></u-text>
                      </u-linear-layout>
                      <u-popup-combination
                        :ref="`popup_combination_2_${(current || {}).__nodeKey || (current || {}).index}`"
                        class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                        placement="bottom"
                        display="inline"
                        widthStretch="false"
                        style="--cw-style-padding-left: 0px; --cw-style-padding-bottom: 0px; --cw-style-padding-top: 0px; --cw-style-padding-right: 0px; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid; padding-top: 0px; padding-left: 0px; padding-right: 0px; padding-bottom: 0px"
                      >
                        <template
                          #reference

                        >
                          <i-ico
                            :ref="`ico_6_${(current || {}).__nodeKey || (current || {}).index}`"
                            class="cw-style-width cw-style-height cw-style-font-size cw-style-color"
                            name="/assets/user/jasonzcmu/1765858474286_4c72f5c04b294311ad6fa61e91d59e5b.svg"
                            icotype="only"
                            :style="{ color: genviewMatchExpression_11x0k5t0(current), '--cw-style-color': genviewMatchExpression_11x0k5t0(current) }"
                            style="--cw-style-width: 24px; --cw-style-height: 24px; --cw-style-font-size: 24px; width: 24px; height: 24px; font-size: 24px; --custom-start: auto; cursor: pointer; line-height: 24px"
                          >
                            <u-text
                              :ref="`text_215_${(current || {}).__nodeKey || (current || {}).index}`"
                              text="图标"
                            ></u-text>
                          </i-ico>
                        </template>
                        <u-linear-layout
                          :ref="`linear_layout_315_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-height"
                          direction="horizontal"
                          mode="flex"
                          justify="start"
                          alignment="center"
                          style="--cw-style-height: 32px; height: 32px"
                        >
                          <u-link
                            :ref="`link_12_${(current || {}).__nodeKey || (current || {}).index}`"
                            class="cw-style-font-size"
                            text="编辑部门"
                            hoverType="color"
                            display="block"
                            widthStretch="true"
                            heightStretch="false"
                            @click="link_12_click($event, current)"
                            :style="{}"
                            style="--cw-style-font-size: 14px; font-size: 14px; --link-color: #333; --link-color-hover: #337eff"
                          ></u-link>
                        </u-linear-layout>
                        <u-linear-layout
                          :ref="`linear_layout_317_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-height"
                          direction="horizontal"
                          mode="flex"
                          justify="start"
                          alignment="center"
                          style="--cw-style-height: 32px; height: 32px"
                        >
                          <u-link
                            :ref="`link_13_${(current || {}).__nodeKey || (current || {}).index}`"
                            class="cw-style-font-size"
                            text="添加子部门"
                            hoverType="color"
                            display="block"
                            widthStretch="true"
                            heightStretch="false"
                            @click="link_13_click($event, current)"
                            :style="{}"
                            style="--cw-style-font-size: 14px; font-size: 14px; --link-color: #333; --link-color-hover: #337eff"
                          ></u-link>
                        </u-linear-layout>
                        <u-linear-layout
                          :ref="`linear_layout_327_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-height"
                          direction="horizontal"
                          mode="flex"
                          justify="start"
                          alignment="center"
                          style="--cw-style-height: 32px; height: 32px"
                        >
                          <u-link
                            :ref="`link_14_${(current || {}).__nodeKey || (current || {}).index}`"
                            class="cw-style-font-size"
                            text="设置部门主管"
                            hoverType="color"
                            display="block"
                            widthStretch="true"
                            heightStretch="false"
                            @click="link_14_click($event, current)"
                            :style="{}"
                            style="--cw-style-font-size: 14px; font-size: 14px; --link-color: #333; --link-color-hover: #337eff"
                          ></u-link>
                        </u-linear-layout>
                        <u-linear-layout
                          :ref="`linear_layout_334_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-height"
                          direction="horizontal"
                          mode="flex"
                          justify="start"
                          alignment="center"
                          style="--cw-style-height: 32px; height: 32px"
                        >
                          <u-link
                            :ref="`link_15_${(current || {}).__nodeKey || (current || {}).index}`"
                            class="cw-style-font-size"
                            text="删除"
                            hoverType="color"
                            display="block"
                            widthStretch="true"
                            heightStretch="false"
                            :disabled="((current || {}).item || {}).deptId == rootDeptId"
                            color="danger"
                            @click="link_15_click($event, current)"
                            :style="{}"
                            style="--cw-style-font-size: 14px; font-size: 14px; --link-color: #333; --link-color-hover: #337eff"
                          ></u-link>
                        </u-linear-layout>
                      </u-popup-combination>
                    </u-linear-layout>
                  </template>
                </u-list-view>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_329"
                key="linear_layout_329"
                class="cw-style-width cw-style-margin-top cw-style-margin"
                gap="none"
                mode="flex"
                direction="vertical"
                justify="start"
                alignment="start"
                widthStretch="false"
                v-if="$utils['HasValue']({ type: 'nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser, lcapUserDeptMapping: app.dataSources.defaultDS.entities.LcapUserDeptMapping}>', value: searchUserList })"
                style="--cw-style-width: 90%; --cw-style-margin-top: 8px; width: 90%; margin-top: 8px"
              >
                <u-linear-layout
                  ref="linear_layout_330"
                  class="cw-style-width cw-style-padding-bottom cw-style-padding cw-style-padding-top cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                  direction="horizontal"
                  gap="none"
                  widthStretch="false"
                  mode="flex"
                  justify="start"
                  alignment="center"
                  style="--cw-style-width: 100%; --cw-style-padding-bottom: 5px; --cw-style-padding-top: 5px; --cw-style-border-style: solid; --cw-style-border-color: #d8d8d8; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 1px; width: 100%; padding-top: 5px; padding-bottom: 5px; border-bottom-width: 1px; border-style: solid; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-color: #d8d8d8"
                >
                  <u-text
                    ref="text_284"
                    text="成员"
                    style="--custom-start: auto; font-family: PingFang SC; font-size: 14px; font-weight: 500; line-height: 22px; letter-spacing: 0px; color: #999999"
                  ></u-text>
                </u-linear-layout>
                <u-list-view
                  ref="list_view_2"
                  class="cw-style-width cw-style-height cw-style-margin-top cw-style-margin cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                  :pageNumber="1"
                  :pageSize="50"
                  :dataSource="searchUserList"
                  :border="false"
                  heightStretch="false"
                  key="list_view_2"
                  style="--cw-style-width: 100%; --cw-style-height: auto; --cw-style-margin-top: 4px; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; width: 100%; min-width: 100px; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid; margin-top: 4px; height: auto; --custom-start: auto; --list-view-item-background-hover: #edf3ff; --list-view-item-padding: 0px 0px; --list-view-item-background-selected: #edf3ff; --list-view-item-color-selected: #333"
                >
                  <template
                    #item="current"

                  >
                    <u-linear-layout
                      :ref="`linear_layout_331_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-background-color cw-style-padding-bottom cw-style-padding cw-style-padding-top"
                      gap="normal"
                      mode="flex"
                      direction="horizontal"
                      alignment="center"
                      justify="start"
                      :wrap="false"
                      @click="linear_layout_331_click($event, current)"
                      :style="{ 'background-color': genviewMatchExpression_0aayx4a1(current), '--cw-style-background-color': genviewMatchExpression_0aayx4a1(current) }"
                      style="--cw-style-padding-bottom: 8px; --cw-style-padding-top: 8px; padding-top: 8px; padding-bottom: 8px; --space-base: 0px"
                    >
                      <u-text
                        :ref="`text_285_${(current || {}).__nodeKey || (current || {}).index}`"
                        class="cw-style-color"
                        :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).lcapUser || {}).userName)"
                        :style="{ color: genviewMatchExpression_08m2m8a0(current), '--cw-style-color': genviewMatchExpression_08m2m8a0(current) }"
                      ></u-text>
                    </u-linear-layout>
                  </template>
                </u-list-view>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_332"
                key="linear_layout_332"
                class="cw-style-width"
                direction="horizontal"
                widthStretch="false"
                mode="flex"
                alignment="start"
                justify="center"
                v-if="(searchDeptList || {}).length <= 0 && (searchUserList || {}).length <= 0"
                style="--cw-style-width: 90%; width: 90%"
              >
                <u-text
                  ref="text_287"
                  class="cw-style-margin-top cw-style-margin cw-style-color"
                  text="未搜到相关内容"
                  style="--cw-style-margin-top: 80px; --cw-style-color: #999; margin-top: 80px; color: #999"
                ></u-text>
              </u-linear-layout>
            </u-linear-layout>
            <u-linear-layout
              ref="linear_layout_4"
              key="linear_layout_4"
              class="cw-style-padding-bottom cw-style-padding"
              gap="none"
              mode="block"
              direction="horizontal"
              justify="start"
              heightStretch="false"
              widthStretch="false"
              v-if="!$utils['HasValue']({ type: 'nasl.core.String', value: search })"
              style="--cw-style-padding-bottom: 14px; overflow: auto; padding-bottom: 14px; min-width: 100%; --custom-start: auto; overflow-x: auto"
            >
              <u-tree-view-new
                ref="tree_view_new_1"
                class="cw-style-height"
                :value.sync="selectDept.deptId"
                :dataSource="__tree_view_new_1_handleDataSourceLoad()"
                textField="lcapDepartment.name"
                valueField="lcapDepartment.deptId"
                parentField="lcapDepartment.parentDeptId"
                expandTrigger="click-expander"
                :checkControlled="false"
                @select="tree_view_new_1_select($event)"
                style="--cw-style-height: auto; --tree-view-node-color-selected: #337eff; --tree-view-node-expander-color-selected: #999; height: auto; min-width: 100%; --custom-start: auto; border: 0px; --tree-view-node-background-active: rgba(51, 126, 255, 0.12); --tree-view-node-background-selected: rgba(51, 126, 255, 0.12); --tree-view-node-expander-size: 40px; --tree-view-node-text-padding: 0px 0px"
              >
                <template
                  #item="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_306_${(current || {}).__nodeKey || (current || {}).index}`"
                    class="cw-style-height"
                    direction="horizontal"
                    gap="none"
                    mode="flex"
                    alignment="center"
                    justify="space-between"
                    :wrap="false"
                    @mouseenter="linear_layout_306_mouseenter($event, current)"
                    @mouseleave="linear_layout_306_mouseleave($event, current)"
                    style="--cw-style-height: 40px; height: 40px"
                  >
                    <u-text
                      :ref="`text_221_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-width cw-style-color"
                      :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).lcapDepartment || {}).name)"
                      widthStretch="false"
                      overflow="ellipsis"
                      :style="{ color: genviewMatchExpression_0ynizzx0(current), '--cw-style-color': genviewMatchExpression_0ynizzx0(current) }"
                      style="--cw-style-width: 85%; width: 85%"
                    ></u-text>
                    <u-popup-combination
                      :ref="`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`"
                      :key="`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-margin-bottom cw-style-margin cw-style-margin-right cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                      placement="bottom"
                      display="inline"
                      widthStretch="false"
                      v-if="(((current || {}).item || {}).lcapDepartment || {}).deptId == (selectDept || {}).deptId || (((current || {}).item || {}).lcapDepartment || {}).deptId == iconShow"
                      style="--cw-style-padding-left: 0px; --cw-style-padding-bottom: 0px; --cw-style-padding-top: 0px; --cw-style-padding-right: 0px; --cw-style-margin-bottom: 2px; --cw-style-margin-right: 12px; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid; margin-right: 12px; margin-bottom: 2px; padding-top: 0px; padding-left: 0px; padding-right: 0px; padding-bottom: 0px"
                    >
                      <template
                        #reference

                      >
                        <i-ico
                          :ref="`ico_5_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-width cw-style-height cw-style-font-size cw-style-color"
                          name="/assets/user/jasonzcmu/1765858474127_afd043242754467ea58bf18ca0dfe3cc.svg"
                          icotype="only"
                          :style="{ color: genviewMatchExpression_1ehfbie0(current), '--cw-style-color': genviewMatchExpression_1ehfbie0(current) }"
                          style="--cw-style-width: 24px; --cw-style-height: 24px; --cw-style-font-size: 24px; width: 24px; height: 24px; font-size: 24px; --custom-start: auto; cursor: pointer; line-height: 24px"
                        >
                          <u-text
                            :ref="`text_214_${(current || {}).__nodeKey || (current || {}).index}`"
                            text="图标"
                          ></u-text>
                        </i-ico>
                      </template>
                      <u-linear-layout
                        :ref="`linear_layout_308_${(current || {}).__nodeKey || (current || {}).index}`"
                        class="cw-style-height"
                        direction="horizontal"
                        mode="flex"
                        justify="start"
                        alignment="center"
                        style="--cw-style-height: 32px; height: 32px"
                      >
                        <u-link
                          :ref="`link_8_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-font-size"
                          text="编辑部门"
                          hoverType="color"
                          display="block"
                          widthStretch="true"
                          heightStretch="false"
                          @click="link_8_click($event, current)"
                          :style="{}"
                          style="--cw-style-font-size: 14px; font-size: 14px; --link-color: #333; --link-color-hover: #337eff"
                        ></u-link>
                      </u-linear-layout>
                      <u-linear-layout
                        :ref="`linear_layout_311_${(current || {}).__nodeKey || (current || {}).index}`"
                        class="cw-style-height"
                        direction="horizontal"
                        mode="flex"
                        justify="start"
                        alignment="center"
                        style="--cw-style-height: 32px; height: 32px"
                      >
                        <u-link
                          :ref="`link_11_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-font-size"
                          text="添加子部门"
                          hoverType="color"
                          display="block"
                          widthStretch="true"
                          heightStretch="false"
                          @click="link_11_click($event, current)"
                          :style="{}"
                          style="--cw-style-font-size: 14px; font-size: 14px; --link-color: #333; --link-color-hover: #337eff"
                        ></u-link>
                      </u-linear-layout>
                      <u-linear-layout
                        :ref="`linear_layout_310_${(current || {}).__nodeKey || (current || {}).index}`"
                        class="cw-style-height"
                        direction="horizontal"
                        mode="flex"
                        justify="start"
                        alignment="center"
                        style="--cw-style-height: 32px; height: 32px"
                      >
                        <u-link
                          :ref="`link_10_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-font-size"
                          text="设置部门主管"
                          hoverType="color"
                          display="block"
                          widthStretch="true"
                          heightStretch="false"
                          @click="link_10_click($event, current)"
                          :style="{}"
                          style="--cw-style-font-size: 14px; font-size: 14px; --link-color: #333; --link-color-hover: #337eff"
                        ></u-link>
                      </u-linear-layout>
                      <u-linear-layout
                        :ref="`linear_layout_309_${(current || {}).__nodeKey || (current || {}).index}`"
                        class="cw-style-height"
                        direction="horizontal"
                        mode="flex"
                        justify="start"
                        alignment="center"
                        style="--cw-style-height: 32px; height: 32px"
                      >
                        <u-link
                          :ref="`link_9_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-font-size"
                          text="删除"
                          hoverType="color"
                          display="block"
                          widthStretch="true"
                          heightStretch="false"
                          :disabled="(((current || {}).item || {}).lcapDepartment || {}).deptId == rootDeptId"
                          color="danger"
                          @click="link_9_click($event, current)"
                          :style="{}"
                          style="--cw-style-font-size: 14px; font-size: 14px; --link-color: #333; --link-color-hover: #337eff"
                        ></u-link>
                      </u-linear-layout>
                    </u-popup-combination>
                  </u-linear-layout>
                </template>
              </u-tree-view-new>
            </u-linear-layout>
          </u-linear-layout>
        </u-panel>
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_267"
        class="cw-style-width cw-style-height"
        direction="horizontal"
        mode="block"
        widthStretch="false"
        heightStretch="false"
        gap="none"
        style="--cw-style-width: 80%; --cw-style-height: 100%; width: 80%; height: 100%"
      >
        <u-panel
          ref="panel_3"
          class="cw-style-height cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width cw-style-border-top-left-radius cw-style-border-radius cw-style-border-bottom-left-radius"
          :bordered="false"
          shadow="never"
          style="--cw-style-height: 100%; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; --cw-style-border-top-left-radius: 0px; --cw-style-border-bottom-left-radius: 0px; border-left-width: 0px; border-style: solid; height: 100%; border-top-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-top-left-radius: 0px; border-bottom-left-radius: 0px"
        >
          <template
            #title

          >
            <u-linear-layout
              ref="linear_layout_294"
              class="cw-style-padding-bottom cw-style-padding cw-style-padding-top cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
              direction="horizontal"
              layout="inline"
              mode="flex"
              justify="start"
              alignment="center"
              style="--cw-style-padding-bottom: 16px; --cw-style-padding-top: 10px; --cw-style-border-style: solid; --cw-style-border-color: #e5e5e5; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 1px; padding-bottom: 16px; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 1px; border-style: solid; border-color: #e5e5e5; padding-top: 10px; min-height: 62px"
            >
              <u-linear-layout
                ref="linear_layout_297"
                class="cw-style-width cw-style-height cw-style-background-color cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                direction="horizontal"
                widthStretch="false"
                heightStretch="false"
                layout="none"
                mode="flex"
                alignment="center"
                justify="center"
                style="--cw-style-width: 45px; --cw-style-height: 45px; --cw-style-background-color: #ebf2ff; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; --cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; width: 45px; height: 45px; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid; background-color: #ebf2ff; border-top-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px; border-bottom-left-radius: 8px"
              >
                <i-ico
                  ref="ico_9"
                  class="cw-style-font-size cw-style-color"
                  name="/assets/user/jasonzcmu/1765858475743_bc35f9acb3a64d9d8f855ce987a26829.svg"
                  icotype="only"
                  style="--cw-style-font-size: 24px; --cw-style-color: #337eff; font-size: 24px; color: #337eff"
                >
                  <u-text
                    ref="text_298"
                    text="图标"
                  ></u-text>
                </i-ico>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_298"
                heightStretch="false"
                mode="flex"
                direction="vertical"
                alignment="start"
                justify="center"
                gap="normal"
                :wrap="false"
                style="--space-base: 0px"
              >
                <u-text
                  ref="text_219"
                  class="cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', (selectDept || {}).name)"
                  display="block"
                  style="--cw-style-color: #000000; color: #000000"
                ></u-text>
                <u-text
                  ref="text_220"
                  class="cw-style-margin-left cw-style-margin cw-style-font-size cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', (selectDept || {}).deptId)"
                  style="--cw-style-margin-left: 0px; --cw-style-font-size: 14px; --cw-style-color: #999; margin-left: 0px; font-size: 14px; color: #999; --custom-start: auto; font-weight: normal"
                ></u-text>
              </u-linear-layout>
            </u-linear-layout>
          </template>
          <u-linear-layout
            ref="linear_layout_313"
            class="cw-style-margin-bottom cw-style-margin"
            direction="horizontal"
            gap="none"
            mode="flex"
            justify="start"
            alignment="center"
            style="--cw-style-margin-bottom: 16px; margin-bottom: 16px"
          >
            <u-button
              ref="button_4"
              class="cw-style-padding-left cw-style-padding cw-style-padding-right cw-style-margin-right cw-style-margin"
              color="primary"
              text="添加用户"
              icon="add"
              widthStretch="false"
              size="normal"
              @click="button_4_click($event)"
              style="--cw-style-padding-left: 16px; --cw-style-padding-right: 16px; --cw-style-margin-right: 12px; margin-right: 12px; padding-left: 16px; padding-right: 16px"
            ></u-button>
            <u-dropdown
              ref="dropdown_2"
              type="normal"
            >
              <template
                #title

              >
                <u-text
                  ref="text_241"
                  text="批量管理"
                ></u-text>
              </template>
              <u-dropdown-item
                ref="dropdown_item_5"
                @click="dropdown_item_5_click($event)"
              >
                <u-text
                  ref="text_243"
                  text="调整部门"
                ></u-text>
              </u-dropdown-item>
              <u-dropdown-item
                ref="dropdown_item_6"
                class="cw-style-color"
                :disabled="(selectDept || {}).deptId == rootDeptId"
                @click="dropdown_item_6_click($event)"
                :style="{ color: genviewMatchExpression_1mf3pi60(), '--cw-style-color': genviewMatchExpression_1mf3pi60() }"
              >
                <u-text
                  ref="text_244"
                  text="批量移除"
                  color="default"
                  :style="{}"
                ></u-text>
              </u-dropdown-item>
            </u-dropdown>
          </u-linear-layout>
          <u-linear-layout
            ref="linear_layout_314"
            class="cw-style-height"
            direction="horizontal"
            gap="none"
            mode="flex"
            justify="start"
            alignment="start"
            style="--cw-style-height: 100%; height: 100%"
          >
            <u-table-view
              ref="table_view_1"
              class="cw-style-width cw-style-height"
              @sync:state="(key, val) => onSyncState('table_view_1', key, val)"
              :pagination="true"
              :pageSize="20"
              :pageNumber="1"
              :values.sync="userIds"
              :dataSource="__table_view_1_handleDataSourceLoad()"
              :showTotal="true"
              valueField="lcapUser.userId"
              widthStretch="false"
              :initialLoad="false"
              heightStretch="false"
              :pageSizeOptions="[5, 10, 20, 50]"
              v-dependencies.reload="[]"
              key="table_view_1"
              style="--cw-style-width: 100%; --cw-style-height: auto; width: 100%; height: auto"
            >
              <u-table-view-column
                ref="table_view_column_1"
                key="table_view_column_1"
                type="checkbox"
                width="5%"
              >
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_1_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #title

                ></template>
                <template
                  #cell=""

                ></template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_2"
                key="table_view_column_2"
                width=""
                field="lcapUser.userId"
              >
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_2_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #title

                >
                  <u-text
                    ref="text_249"
                    text="名称"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_316_${(current || {}).__nodeKey || (current || {}).index}`"
                    direction="horizontal"
                    gap="none"
                    mode="flex"
                    justify="start"
                    alignment="center"
                    :wrap="false"
                  >
                    <u-text
                      :ref="`text_251_${(current || {}).__nodeKey || (current || {}).index}`"
                      :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).lcapUser || {}).userName)"
                      overflow="ellipsis"
                    ></u-text>
                    <u-label
                      :ref="`label_2_${(current || {}).__nodeKey || (current || {}).index}`"
                      :key="`label_2_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-background-color cw-style-margin-left cw-style-margin cw-style-color cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                      color="success"
                      text="部门主管"
                      v-if="(((current || {}).item || {}).lcapUserDeptMapping || {}).isDeptLeader == 1"
                      style="--cw-style-background-color: #e9f8f1; --cw-style-margin-left: 8px; --cw-style-color: #26bd71; --cw-style-border-top-left-radius: 4px; --cw-style-border-top-right-radius: 4px; --cw-style-border-bottom-left-radius: 4px; --cw-style-border-bottom-right-radius: 4px; background-color: #e9f8f1; color: #26bd71; border-top-left-radius: 4px; border-top-right-radius: 4px; border-bottom-right-radius: 4px; border-bottom-left-radius: 4px; margin-left: 8px"
                    ></u-label>
                  </u-linear-layout>
                </template>
              </u-table-view-column>
              <u-table-view-column
                ref="table_view_column_3"
                key="table_view_column_3"
                width=""
              >
                <template
                  #expander="current"

                >
                  <u-table-view-expander :ref="`table_view_expander_3_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                </template>
                <template
                  #title

                >
                  <u-text
                    ref="text_250"
                    text="操作"
                  ></u-text>
                </template>
                <template
                  #cell="current"

                >
                  <u-linear-layout
                    :ref="`linear_layout_318_${(current || {}).__nodeKey || (current || {}).index}`"
                    direction="horizontal"
                    gap="none"
                    mode="flex"
                    justify="start"
                    alignment="center"
                  >
                    <u-link
                      :ref="`link_18_${(current || {}).__nodeKey || (current || {}).index}`"
                      :key="`link_18_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-margin-right cw-style-margin"
                      text="设置为部门主管"
                      @click="link_18_click($event, current)"
                      v-if="(((current || {}).item || {}).lcapUserDeptMapping || {}).isDeptLeader == 0"
                      style="--cw-style-margin-right: 24px; margin-right: 24px"
                    ></u-link>
                    <u-link
                      :ref="`link_19_${(current || {}).__nodeKey || (current || {}).index}`"
                      :key="`link_19_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-margin-right cw-style-margin"
                      text="取消部门主管"
                      @click="link_19_click($event, current)"
                      v-if="(((current || {}).item || {}).lcapUserDeptMapping || {}).isDeptLeader == 1"
                      style="--cw-style-margin-right: 38px; margin-right: 38px"
                    ></u-link>
                    <u-link
                      :ref="`link_20_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-margin-right cw-style-margin"
                      text="调整部门"
                      @click="link_20_click($event, current)"
                      style="--cw-style-margin-right: 28px; margin-right: 28px"
                    ></u-link>
                    <u-link
                      :ref="`link_21_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-margin-right cw-style-margin"
                      text="移除"
                      color="danger"
                      :disabled="(((current || {}).item || {}).lcapUserDeptMapping || {}).deptId == rootDeptId"
                      @click="link_21_click($event, current)"
                      style="--cw-style-margin-right: 28px; margin-right: 28px"
                    ></u-link>
                  </u-linear-layout>
                </template>
              </u-table-view-column>
            </u-table-view>
          </u-linear-layout>
        </u-panel>
      </u-linear-layout>
    </u-linear-layout>
    <u-modal ref="createORUpdateDeptPopup">
      <template
        #foot

      >
        <u-linear-layout
          ref="uLinearLayout6"
          class="cw-style-text-align"
          style="--cw-style-text-align: right; text-align: right"
        >
          <u-button
            ref="uButton7"
            text="取 消"
            @click="uButton7_click($event)"
          ></u-button>
          <u-button
            ref="uButton4"
            color="primary"
            text="确 定"
            @click="uButton4_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-linear-layout
          ref="uLinearLayout7"
          direction="vertical"
        >
          <u-form
            ref="form1"
            labelLayout="block"
            key="form1"
          >
            <u-form-item
              ref="uFormItem5"
              :required="true"
              :rules="[
                                { validate: 'filled', message: `部门名称不得为空`, trigger: 'input+blur', required: true },
                                { validate: 'excluded', args: [deptNameList], message: `目标位置存在相同名称的部门`, trigger: 'input+blur' },
                                { validate: 'maxLength', args: [50], message: `不得超过${50}个字符`, trigger: 'input+blur' },
                            ]"
              labelLayout="block"
            >
              <u-input
                ref="uInput4"
                placeholder="请输入部门名称"
                :value.sync="inputDept.name"
                :clearable="true"
                width="full"
                :maxlength="50"
                @blur="uInput4_blur($event)"
              ></u-input>
              <template
                #label

              >
                <u-text
                  ref="text10"
                  text="部门名称"
                ></u-text>
              </template>
            </u-form-item>
            <u-form-item
              ref="uFormItem6"
              labelLayout="block"
              :required="true"
              :rules="[
                                { validate: 'filled', message: `部门标识不得为空`, trigger: 'input+blur', required: true },
                                { validate: 'excluded', args: [deptIdList], message: `该部门标识已存在`, trigger: 'input+blur' },
                                { validate: 'maxLength', args: [50], message: `不得超过${50}个字符`, trigger: 'input+blur' },
                            ]"
            >
              <u-input
                ref="uInput5"
                :value.sync="inputDept.deptId"
                placeholder="请输入部门标识"
                width="full"
                :clearable="true"
                :maxlength="50"
                @blur="uInput5_blur($event)"
              ></u-input>
              <template
                #label

              >
                <u-text
                  ref="text11"
                  text="部门标识"
                ></u-text>
              </template>
            </u-form-item>
            <u-form-item
              ref="form_item_1"
              key="form_item_1"
              labelLayout="block"
              :required="!(isUpdateDept == 0 && (rootDeptId == undefined || rootDeptId == ``))"
              :rules="[{ validate: 'filled', message: `上级部门不得为空`, trigger: 'input+blur', required: true }]"
              :ignoreValidation="isUpdateDept == 0 && (rootDeptId == undefined || rootDeptId == ``)"
              v-if="!((selectDept || {}).deptId == rootDeptId && isUpdateDept == 1)"
            >
              <template
                #label

              >
                <u-text
                  ref="text_222"
                  text="上级部门"
                ></u-text>
              </template>
              <u-tree-select-new
                ref="tree_select_new_1"
                placeholder="请选择部门"
                :value.sync="inputDept.parentDeptId"
                :dataSource="__tree_select_new_1_handleDataSourceLoad()"
                textField="lcapDepartment.name"
                valueField="lcapDepartment.deptId"
                parentField="lcapDepartment.parentDeptId"
                :clearable="false"
                width="full"
                appendTo="reference"
                :disabled="isUpdateDept == 2"
                @select="tree_select_new_1_select($event)"
                style="--tree-select-new-popper-width: 100%; --custom-start: auto; --tree-view-node-background-active: rgba(51, 126, 255, 0.12); --tree-view-node-background-selected: rgba(51, 126, 255, 0.12); --tree-view-node-color-selected: #337eff; --tree-view-node-expander-color-selected: #999"
              >
                <template
                  #item=""

                ></template>
              </u-tree-select-new>
            </u-form-item>
          </u-form>
        </u-linear-layout>
      </template>
      <template
        #title

      >
        <u-text
          ref="uText3"
          key="uText3"
          text="添加部门"
          v-if="isUpdateDept == 0"
        ></u-text>
        <u-text
          ref="text_2"
          key="text_2"
          text="编辑部门"
          v-if="isUpdateDept == 1"
        ></u-text>
        <u-text
          ref="text_233"
          key="text_233"
          text="添加子部门"
          v-if="isUpdateDept == 2"
        ></u-text>
      </template>
    </u-modal>
    <u-modal ref="modal_1">
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_312"
          class="cw-style-text-align"
          justify="center"
          style="--cw-style-text-align: right; text-align: right"
        >
          <u-button
            ref="button_3"
            text="取 消"
            @click="button_3_click($event)"
          ></u-button>
          <u-button
            ref="button_2"
            color="primary"
            text="确 定"
            @click="button_2_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-form
          ref="form_1"
          labelLayout="block"
          key="form_1"
        >
          <u-form-item
            ref="form_item_2"
            :required="true"
            layout="center"
            labelLayout="block"
            :rules="[{ validate: 'filled', message: `部门主管不能为空`, trigger: 'input+blur', required: true }]"
          >
            <template
              #label

            >
              <u-text
                ref="text_236"
                text="部门主管"
              ></u-text>
            </template>
            <u-select
              ref="select_1"
              @sync:state="(key, val) => onSyncState('select_1', key, val)"
              :clearable="true"
              placeholder="请选择部门主管"
              :dataSource="__select_1_handleDataSourceLoad()"
              :pageSize="50"
              dataSchema="LoadDepartmentManagementSelect_1Structure"
              textField="lcapUser.userName"
              valueField="lcapUser.userId"
              :pagination="true"
              :value.sync="userId"
              width="full"
              :filterable="true"
              v-dependencies.reload="[]"
              key="select_1"
            ></u-select>
          </u-form-item>
        </u-form>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_235"
          text="设置部门主管"
        ></u-text>
      </template>
    </u-modal>
    <u-modal ref="modal_2">
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_319"
          class="cw-style-text-align"
          justify="center"
          style="--cw-style-text-align: right; text-align: right"
        >
          <u-button
            ref="button_7"
            text="取 消"
            @click="button_7_click($event)"
          ></u-button>
          <u-button
            ref="button_6"
            color="primary"
            text="确 定"
            @click="button_6_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-form
          ref="form_2"
          labelLayout="block"
          key="form_2"
        >
          <u-form-item
            ref="form_item_3"
            :required="true"
            layout="center"
            labelLayout="block"
            :rules="[{ validate: 'notEquals', args: [`[]`], message: `用户名称不得为空`, trigger: 'input+blur' }]"
          >
            <template
              #label

            >
              <u-text
                ref="text_258"
                text="用户名称"
              ></u-text>
            </template>
            <u-select
              ref="select_2"
              @sync:state="(key, val) => onSyncState('select_2', key, val)"
              :clearable="true"
              placeholder="请选择用户"
              :dataSource="__select_2_handleDataSourceLoad()"
              :pageSize="50"
              dataSchema="LoadDepartmentManagementSelect_2Structure"
              textField="lcapUser.userName"
              valueField="lcapUser.userId"
              :pagination="true"
              :value.sync="inputUser"
              :multiple="true"
              width="full"
              converter="json"
              tagsOverflow="collapse"
              :filterable="true"
              emptyText="暂无数据"
              :showEmptyText="true"
              v-dependencies.reload="[]"
              key="select_2"
            ></u-select>
          </u-form-item>
          <u-form-item
            ref="form_item_6"
            :required="true"
            layout="center"
            labelLayout="block"
          >
            <template
              #label

            >
              <u-text
                ref="text_262"
                text="所属部门"
              ></u-text>
            </template>
            <u-input
              ref="input_4"
              class="cw-style-width"
              placeholder="请选择部门名称"
              :value.sync="selectDept.name"
              type="text"
              :readonly="false"
              :disabled="true"
              width="full"
              style="--cw-style-width: 100%; width: 100%"
            ></u-input>
          </u-form-item>
        </u-form>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_257"
          text="添加用户"
        ></u-text>
      </template>
      <u-text
        ref="text_263"
        text="普通文本"
      ></u-text>
    </u-modal>
    <u-modal
      ref="modal_3"
      icon="warning"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_320"
          class="cw-style-text-align"
          justify="center"
          style="--cw-style-text-align: right; text-align: right"
        >
          <u-button
            ref="button_10"
            text="取 消"
            @click="button_10_click($event)"
          ></u-button>
          <u-button
            ref="button_9"
            color="primary"
            text="确 定"
            @click="button_9_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-linear-layout
          ref="uLinearLayout10"
          gap="none"
          mode="flex"
          direction="vertical"
          justify="center"
          alignment="start"
        >
          <u-text
            ref="uText5"
            :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0ffm2sw0())"
          ></u-text>
        </u-linear-layout>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_268"
          key="text_268"
          text="设置为部门主管"
          v-if="!isCancelLeader"
        ></u-text>
        <u-text
          ref="text_270"
          key="text_270"
          text="取消部门主管"
          v-if="isCancelLeader"
        ></u-text>
      </template>
    </u-modal>
    <u-modal ref="modal_4">
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_321"
          class="cw-style-text-align"
          justify="center"
          style="--cw-style-text-align: right; text-align: right"
        >
          <u-button
            ref="button_12"
            text="取 消"
            @click="button_12_click($event)"
          ></u-button>
          <u-button
            ref="button_11"
            color="primary"
            text="确 定"
            @click="button_11_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-form
          ref="form_3"
          key="form_3"
        >
          <u-form-item
            ref="form_item_7"
            :required="true"
            layout="center"
            labelLayout="block"
            :rules="[{ validate: 'filled', message: `所属部门不得为空`, trigger: 'input+blur', required: true }]"
          >
            <template
              #label

            >
              <u-text
                ref="text_273"
                text="所属部门"
              ></u-text>
            </template>
            <u-tree-select-new
              ref="tree_select_new_2"
              placeholder="请选择部门"
              :value.sync="batchDeptId"
              :dataSource="__tree_select_new_2_handleDataSourceLoad()"
              textField="lcapDepartment.name"
              valueField="lcapDepartment.deptId"
              parentField="lcapDepartment.parentDeptId"
              :clearable="false"
              width="full"
              appendTo="reference"
              :disabled="false"
              style="--tree-select-new-popper-width: 100%; --custom-start: auto; --tree-view-node-background-active: rgba(51, 126, 255, 0.12); --tree-view-node-background-selected: rgba(51, 126, 255, 0.12); --tree-view-node-color-selected: #337eff; --tree-view-node-expander-color-selected: #999"
            >
              <template
                #item=""

              ></template>
            </u-tree-select-new>
          </u-form-item>
        </u-form>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_272"
          text="调整部门"
        ></u-text>
      </template>
    </u-modal>
    <u-modal
      ref="deleteDeptPopup"
      size="normal"
      icon="warning"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="uLinearLayout8"
          class="cw-style-text-align"
          style="--cw-style-text-align: right; text-align: right"
        >
          <u-button
            ref="uButton10"
            text="取 消"
            @click="uButton10_click($event)"
          ></u-button>
          <u-button
            ref="uButton9"
            color="primary"
            text="确 定"
            @click="uButton9_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-linear-layout
          ref="uLinearLayout9"
          gap="none"
          mode="flex"
          direction="vertical"
          justify="center"
          alignment="start"
        >
          <u-text
            ref="uText4"
            key="uText4"
            text="确定删除所选部门？"
            v-if="isDeptDelete"
          ></u-text>
          <u-text
            ref="text_277"
            key="text_277"
            text="确定移除所选成员？"
            v-if="!isDeptDelete"
          ></u-text>
        </u-linear-layout>
      </template>
      <template
        #title

      >
        <u-text
          ref="text12"
          key="text12"
          text="删除"
          v-if="isDeptDelete"
        ></u-text>
        <u-text
          ref="text_288"
          key="text_288"
          text="移除"
          v-if="!isDeptDelete"
        ></u-text>
      </template>
    </u-modal>
    <u-modal
      ref="modal_5"
      size="normal"
      icon="warning"
    >
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_322"
          class="cw-style-text-align"
          style="--cw-style-text-align: right; text-align: right"
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
      </template>
      <template
        #body

      >
        <u-linear-layout
          ref="linear_layout_323"
          gap="none"
          mode="flex"
          direction="vertical"
          justify="center"
          alignment="start"
        >
          <u-text
            ref="text_279"
            :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `确定移除“`) + $utils['ToString']('nasl.core.String', (currentUser || {}).userName) + $utils['ToString']('nasl.core.String', `”吗？`))"
          ></u-text>
        </u-linear-layout>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_278"
          text="移除"
        ></u-text>
      </template>
    </u-modal>
    <u-modal ref="modal_6">
      <template
        #foot

      >
        <u-linear-layout
          ref="linear_layout_333"
          class="cw-style-text-align"
          justify="center"
          style="--cw-style-text-align: right; text-align: right"
        >
          <u-button
            ref="button_17"
            text="取 消"
            @click="button_17_click($event)"
          ></u-button>
          <u-button
            ref="button_16"
            color="primary"
            text="确 定"
            @click="button_16_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-form
          ref="form_4"
          key="form_4"
        >
          <u-form-item
            ref="form_item_8"
            :required="true"
            layout="center"
          >
            <template
              #label

            >
              <u-text
                ref="text_291"
                text="用户名称"
              ></u-text>
            </template>
            <u-text
              ref="text_296"
              :text="$utils['ToString']('nasl.core.String', (searchUser || {}).userName)"
            ></u-text>
          </u-form-item>
          <u-form-item
            ref="form_item_11"
            :required="true"
            layout="center"
            :rules="[{ validate: 'filled', message: `所属部门不得为空`, trigger: 'input+blur', required: true }]"
            labelLayout="block"
          >
            <template
              #label

            >
              <u-text
                ref="text_295"
                text="所属部门"
              ></u-text>
            </template>
            <u-tree-select-new
              ref="tree_select_new_3"
              placeholder="请选择部门"
              :value.sync="searchDeptId"
              :dataSource="__tree_select_new_3_handleDataSourceLoad()"
              textField="lcapDepartment.name"
              valueField="lcapDepartment.deptId"
              parentField="lcapDepartment.parentDeptId"
              :clearable="false"
              width="full"
              appendTo="reference"
              :disabled="false"
              style="--tree-select-new-popper-width: 100%; --custom-start: auto; --tree-view-node-background-active: rgba(51, 126, 255, 0.12); --tree-view-node-background-selected: rgba(51, 126, 255, 0.12); --tree-view-node-color-selected: #337eff; --tree-view-node-expander-color-selected: #999"
            >
              <template
                #item=""

              ></template>
            </u-tree-select-new>
          </u-form-item>
        </u-form>
      </template>
      <template
        #title

      >
        <u-text
          ref="text_290"
          text="编辑用户"
        ></u-text>
      </template>
    </u-modal>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/departmentManagement',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      search: undefined,
      isUpdateDept: undefined,
      inputDept: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDepartment', undefined),
      selectDept: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDepartment', undefined),
      rootDeptId: undefined,
      userId: undefined,
      userIds: window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined),
      deleteParentId: undefined,
      inputUser: undefined,
      currentUser: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', undefined),
      isCancelLeader: undefined,
      batchDeptId: undefined,
      isDeptDelete: undefined,
      isBatchDept: undefined,
      searchDeptList: window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>', undefined),
      searchUserList: window.$genInitFromSchema('nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser, lcapUserDeptMapping: app.dataSources.defaultDS.entities.LcapUserDeptMapping}>', undefined),
      selectDeptIdTemp: undefined,
      searchUser: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', undefined),
      searchDeptId: undefined,
      searchOldDeptId: undefined,
      iconShow: undefined,
      deptIdList: window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined),
      deptNameList: window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined),
      table_view_1_state_page: undefined,
      table_view_1_state_size: undefined,
      select_1_state_page: undefined,
      select_1_state_size: undefined,
      select_1_state_filterText: undefined,
      select_2_state_page: undefined,
      select_2_state_size: undefined,
      select_2_state_filterText: undefined,
    };
  },
  meta: {
    title: '部门管理',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async submit() {
      await this.getDeptIdAndNameList();
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form1?.validate?.(undefined, undefined)) || {}).valid) {
        if (this.isUpdateDept == 1) {
          await window.LcapRequest({
            url: '/api/lcplogics/LcapUpdateDepartment',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
            },
            data: {
              department: this.inputDept,
              oldDeptId: (this.selectDept || {}).deptId,
              oldParentDeptId: (this.selectDept || {}).parentDeptId,
            },
          });
        } else {
          this.inputDept = window.$genInitFromSchema(
            'app.dataSources.defaultDS.entities.LcapDepartment',
            await window.LcapRequest({
              url: '/api/lcplogics/LcapCreateDepartment',
              method: 'POST',
              extraConfig: {
                serviceType: 'micro',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
              },
              data: {
                department: this.inputDept,
              },
            }),
          );
        }

        this.searchDeptList = (
          window.$genInitFromSchema(
            '{list: nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>, total: nasl.core.Long}',
            await window.LcapRequest({
              url: '/api/lcplogics/LcapSearchDepts',
              method: 'POST',
              extraConfig: {
                serviceType: 'micro',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
              },
              data: {
                name: this.search,
              },
            }),
          ) || {}
        ).list;
        if (((this.selectDept || {}).deptId == this.rootDeptId && this.isUpdateDept == 1) || (this.isUpdateDept == 0 && (this.rootDeptId == undefined || this.rootDeptId == ''))) {
          await this.deptInit();
        }
        this.selectDept = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDepartment', window.$utils.Clone(this.inputDept));
        this.selectDeptIdTemp = (this.inputDept || {}).deptId;
        await this.$refs.tree_view_new_1?.reload?.();
        await this.userReload();
        await this.$refs.createORUpdateDeptPopup?.close?.();
        await this.messagePrompt(
          await (async () => {
            const it = this.isUpdateDept == 1;
            if (window.$global.isEqual(it, true)) {
              return '编辑成功';
            } else if (window.$global.isEqual(it, false)) {
              return '添加成功';
            } else { /* empty */ }
          })(),
          'success',
        );
      }
    },

    async getDeptIdAndNameList() {
      let deptList = window.$genInitFromSchema('nasl.collection.List<{lcapDepartment: app.dataSources.defaultDS.entities.LcapDepartment}>', undefined);
      let deptChildList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>', undefined);
      deptChildList = (
        window.$genInitFromSchema(
          '{list: nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetChildDepts',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/2',
            },
            data: {
              deptId: await (async () => {
                const it = (this.selectDept || {}).deptId == (this.inputDept || {}).parentDeptId && this.isUpdateDept != 2;
                if (window.$global.isEqual(it, true)) {
                  return await (async () => {
                    const it = (this.selectDept || {}).deptId == this.rootDeptId;
                    if (window.$global.isEqual(it, true)) {
                      return this.rootDeptId;
                    } else if (window.$global.isEqual(it, false)) {
                      return (this.selectDept || {}).parentDeptId;
                    } else { /* empty */ }
                  })();
                } else if (window.$global.isEqual(it, false)) {
                  return (this.inputDept || {}).parentDeptId;
                } else { /* empty */ }
              })(),
            },
          }),
        ) || {}
      ).list;
      this.deptNameList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListTransformAsync(deptChildList, (item) => window.$utils.ToLower((item || {}).name)));
      if (window.$utils.Contains(this.deptNameList, window.$utils.ToLower((this.inputDept || {}).name))) {
        window.$utils.Add(this.deptNameList, (this.inputDept || {}).name);
      }
      window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.ListDistinct(this.deptNameList));
      if (this.isUpdateDept == 1 && ((this.inputDept || {}).parentDeptId == (this.selectDept || {}).parentDeptId || (this.inputDept || {}).parentDeptId == (this.selectDept || {}).deptId)) {
        window.$utils.Remove(this.deptNameList, (this.selectDept || {}).name);
      }
      deptList = window.$genInitFromSchema(
        'nasl.collection.List<{lcapDepartment: app.dataSources.defaultDS.entities.LcapDepartment}>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetDeptList',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/departmentManagement/5',
          },
          data: {},
        }),
      );
      this.deptIdList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListTransformAsync(deptList, (item) => window.$utils.ToLower(((item || {}).lcapDepartment || {}).deptId)));
      if (window.$utils.Contains(this.deptIdList, window.$utils.ToLower((this.inputDept || {}).deptId))) {
        window.$utils.Add(this.deptIdList, (this.inputDept || {}).deptId);
      }
      window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.ListDistinct(this.deptIdList));
      if (this.isUpdateDept == 1) {
        window.$utils.Remove(this.deptIdList, (this.selectDept || {}).deptId);
      }
    },

    async deptInit() {
      let deptList = window.$genInitFromSchema('nasl.collection.List<{lcapDepartment: app.dataSources.defaultDS.entities.LcapDepartment}>', undefined);
      deptList = window.$genInitFromSchema(
        'nasl.collection.List<{lcapDepartment: app.dataSources.defaultDS.entities.LcapDepartment}>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetDeptList',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/departmentManagement/1',
          },
          data: {},
        }),
      );
      if (window.$utils.HasValue({ type: 'nasl.collection.List<{lcapDepartment: app.dataSources.defaultDS.entities.LcapDepartment}>', value: deptList })) {
        this.selectDept = (window.$genInitFromSchema('{lcapDepartment: app.dataSources.defaultDS.entities.LcapDepartment}', await window.$utils.ListFindAsync(deptList, async (item) => !window.$utils.HasValue({ type: 'nasl.core.String', value: ((item || {}).lcapDepartment || {}).parentDeptId }) || !window.$utils.Contains(window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListTransformAsync(deptList, (item1) => ((item1 || {}).lcapDepartment || {}).deptId)), ((item || {}).lcapDepartment || {}).parentDeptId))) || {}).lcapDepartment;
      } else {
        await this.createRootDept();
      }
      this.rootDeptId = (this.selectDept || {}).deptId;
      this.selectDeptIdTemp = (this.selectDept || {}).deptId;
      await this.userReload();
    },

    async userReload() {
      window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Clear(this.userIds, 'shallow', 'nasl.collection.List<nasl.core.String>'));
      await this.$refs.table_view_1?.reload?.();
    },

    async searchDeptUser() {
      if (window.$utils.HasValue({ type: 'nasl.core.String', value: this.search })) {
        this.searchDeptList = (
          window.$genInitFromSchema(
            '{list: nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>, total: nasl.core.Long}',
            await window.LcapRequest({
              url: '/api/lcplogics/LcapSearchDepts',
              method: 'POST',
              extraConfig: {
                serviceType: 'micro',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/departmentManagement/1',
              },
              data: {
                name: this.search,
              },
            }),
          ) || {}
        ).list;
        this.searchUserList = (
          window.$genInitFromSchema(
            '{list: nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser, lcapUserDeptMapping: app.dataSources.defaultDS.entities.LcapUserDeptMapping}>, total: nasl.core.Long}',
            await window.LcapRequest({
              url: '/api/lcplogics/LcapSearchDeptUsers',
              method: 'POST',
              extraConfig: {
                serviceType: 'micro',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
              },
              data: {
                name: this.search,
              },
            }),
          ) || {}
        ).list;
      } else {
        window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>', window.$utils.Clear(this.searchDeptList, 'shallow', 'nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>'));
        window.$genInitFromSchema('nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser, lcapUserDeptMapping: app.dataSources.defaultDS.entities.LcapUserDeptMapping}>', window.$utils.Clear(this.searchUserList, 'shallow', 'nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser, lcapUserDeptMapping: app.dataSources.defaultDS.entities.LcapUserDeptMapping}>'));
      }
    },

    async createRootDept() {
      this.selectDept = window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.LcapDepartment',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapCreateRootDept',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
          },
          data: {},
        }),
      );
      await this.$refs.tree_view_new_1?.reload?.();
    },

    async messagePrompt(msg, type) {
      let flag;
      await (async () => {
        'use JSBlock';

        switch (type) {
          case 'success':
            this.$toast.success(msg);
            break;
          case 'error':
            this.$toast.error(msg);
            break;
          case 'warning':
            this.$toast.warning(msg);
            break;
          default:
            console.log('type is unknow');
        }
      })();
      flag = msg;
      flag = type;
    },

    async departmentManagement_created(event) {
      await this.departmentManagement_created_created(event);
    },

    async departmentManagement_created_created() {
      this.$global.frontendVariables.title = '部门管理';
      await this.deptInit();
    },

    async uButton7_click(event) {
      await this.uButton7_click_close(event);
    },

    async uButton7_click_close() {
      await this.$refs.createORUpdateDeptPopup?.close?.();
    },

    async uButton4_click(event) {
      await this.uButton4_click_confirmDept(event);
    },

    async uButton4_click_confirmDept() {
      await this.submit();
    },

    async button_3_click(event) {
      await this.button_3_click_click(event);
    },

    async button_3_click_click() {
      await this.$refs.modal_1?.close?.();
    },

    async button_2_click(event) {
      await this.button_2_click_click(event);
    },

    async button_2_click_click() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_1?.validate?.(undefined, undefined)) || {}).valid) {
        await window.LcapRequest({
          url: '/api/lcplogics/LcapSetDeptLeader',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/departmentManagement/1',
          },
          data: {
            deptId: (this.selectDept || {}).deptId,
            userId: this.userId,
          },
        });
        await this.$refs.modal_1?.close?.();
        await this.userReload();
        await this.messagePrompt('已设为主管', 'success');
      }
    },

    async button_7_click(event) {
      await this.button_7_click_click(event);
    },

    async button_7_click_click() {
      await this.$refs.modal_2?.close?.();
    },

    async button_6_click(event) {
      await this.button_6_click_click(event);
    },

    async button_6_click_click() {
      let addList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_2?.validate?.(undefined, undefined)) || {}).valid) {
        addList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.JsonDeserialize(this.inputUser));
        await window.LcapRequest({
          url: '/api/lcplogics/LcapBatchAddDeptUser',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
          },
          data: {
            userIds: addList,
            deptId: (this.selectDept || {}).deptId,
          },
        });
        await this.userReload();
        await this.$refs.modal_2?.close?.();
        await this.messagePrompt('添加成功', 'success');
      }
    },

    async button_10_click(event) {
      await this.button_10_click_click(event);
    },

    async button_10_click_click() {
      await this.$refs.modal_3?.close?.();
    },

    async button_9_click(event) {
      await this.button_9_click_click(event);
    },

    async button_9_click_click() {
      if (this.isCancelLeader) {
        await window.LcapRequest({
          url: '/api/lcplogics/LcapCancelDeptLeader',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
          },
          data: {
            deptId: (this.selectDept || {}).deptId,
            userId: (this.currentUser || {}).userId,
          },
        });
      } else {
        await window.LcapRequest({
          url: '/api/lcplogics/LcapSetDeptLeader',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
          },
          data: {
            deptId: (this.selectDept || {}).deptId,
            userId: (this.currentUser || {}).userId,
          },
        });
      }
      await this.userReload();
      await this.$refs.modal_3?.close?.();
      await this.messagePrompt(
        await (async () => {
          const it = this.isCancelLeader;
          if (window.$global.isEqual(it, true)) {
            return '已取消主管';
          } else if (window.$global.isEqual(it, false)) {
            return '已设为主管';
          } else { /* empty */ }
        })(),
        'success',
      );
    },

    async button_12_click(event) {
      await this.button_12_click_click(event);
    },

    async button_12_click_click() {
      await this.$refs.modal_4?.close?.();
    },

    async button_11_click(event) {
      await this.button_11_click_click(event);
    },

    async button_11_click_click() {
      let msg;
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_3?.validate?.(undefined, undefined)) || {}).valid) {
        if (this.isBatchDept) {
          msg = await window.LcapRequest({
            url: '/api/lcplogics/LcapBatchUpdateDeptUser',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/1',
            },
            data: {
              userIds: this.userIds,
              deptId: this.batchDeptId,
              oldDeptId: (this.selectDept || {}).deptId,
            },
          });
        } else {
          msg = await window.LcapRequest({
            url: '/api/lcplogics/LcapBatchUpdateDeptUser',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
            },
            data: {
              userIds: await (async () => {
                const arr = [(this.currentUser || {}).userId];
                return arr;
              })(),
              deptId: this.batchDeptId,
              oldDeptId: (this.selectDept || {}).deptId,
            },
          });
        }

        await this.userReload();
        await this.$refs.modal_4?.close?.();
        await this.messagePrompt(
          await (async () => {
            const it = window.$utils.HasValue({ type: 'nasl.core.String', value: msg });
            if (window.$global.isEqual(it, true)) {
              return msg;
            } else if (window.$global.isEqual(it, false)) {
              return '调整成功';
            } else { /* empty */ }
          })(),
          await (async () => {
            const it = window.$utils.HasValue({ type: 'nasl.core.String', value: msg });
            if (window.$global.isEqual(it, true)) {
              return 'error';
            } else if (window.$global.isEqual(it, false)) {
              return 'success';
            } else { /* empty */ }
          })(),
        );
      }
    },

    async uButton10_click(event) {
      await this.uButton10_click_close(event);
    },

    async uButton10_click_close() {
      await this.$refs.deleteDeptPopup?.close?.();
    },

    async uButton9_click(event) {
      await this.uButton9_click_deleteDeptById(event);
    },

    async uButton9_click_deleteDeptById() {
      let msg;
      if (this.isDeptDelete) {
        msg = await window.LcapRequest({
          url: '/api/lcplogics/LcapBatchDeleteDepartment',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
          },
          data: {
            ids: await (async () => {
              const arr = [(this.selectDept || {}).id];
              return arr;
            })(),
          },
        });
        if (msg == '200') {
          this.selectDept = window.$genInitFromSchema(
            'app.dataSources.defaultDS.entities.LcapDepartment',
            await window.LcapRequest({
              url: '/api/lcplogics/LcapGetDept',
              method: 'POST',
              extraConfig: {
                serviceType: 'micro',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/departmentManagement/1',
              },
              data: {
                deptId: this.deleteParentId,
              },
            }),
          );
          this.selectDeptIdTemp = (this.selectDept || {}).deptId;
          await this.$refs.tree_view_new_1?.reload?.();
          await this.userReload();
          this.searchDeptList = (
            window.$genInitFromSchema(
              '{list: nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>, total: nasl.core.Long}',
              await window.LcapRequest({
                url: '/api/lcplogics/LcapSearchDepts',
                method: 'POST',
                extraConfig: {
                  serviceType: 'micro',
                },
                headers: {
                  'lcap-calllogic-uuid': '/oaSys/departmentManagement/2',
                },
                data: {
                  name: this.search,
                },
              }),
            ) || {}
          ).list;
          await this.$refs.deleteDeptPopup?.close?.();
          await this.messagePrompt('删除成功', 'success');
        } else {
          await this.messagePrompt(msg, 'warning');
        }
      } else {
        msg = await window.LcapRequest({
          url: '/api/lcplogics/LcapBatchRemoveDeptUser',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
          },
          data: {
            userIds: this.userIds,
            deptId: (this.selectDept || {}).deptId,
          },
        });
        await this.userReload();
        await this.$refs.deleteDeptPopup?.close?.();
        await this.messagePrompt(
          await (async () => {
            const it = window.$utils.HasValue({ type: 'nasl.core.String', value: msg });
            if (window.$global.isEqual(it, true)) {
              return msg;
            } else if (window.$global.isEqual(it, false)) {
              return '移除成功';
            } else { /* empty */ }
          })(),
          await (async () => {
            const it = window.$utils.HasValue({ type: 'nasl.core.String', value: msg });
            if (window.$global.isEqual(it, true)) {
              return 'error';
            } else if (window.$global.isEqual(it, false)) {
              return 'success';
            } else { /* empty */ }
          })(),
        );
      }
    },

    async button_14_click(event) {
      await this.button_14_click_close(event);
    },

    async button_14_click_close() {
      await this.$refs.modal_5?.close?.();
    },

    async button_15_click(event) {
      await this.button_15_click_deleteDeptById(event);
    },

    async button_15_click_deleteDeptById() {
      const msg = await window.LcapRequest({
        url: '/api/lcplogics/LcapBatchRemoveDeptUser',
        method: 'POST',
        extraConfig: {
          serviceType: 'micro',
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/departmentManagement/1',
        },
        data: {
          userIds: await (async () => {
            const arr = [(this.currentUser || {}).userId];
            return arr;
          })(),
          deptId: (this.selectDept || {}).deptId,
        },
      });
      await this.userReload();
      await this.$refs.modal_5?.close?.();
      await this.messagePrompt(
        await (async () => {
          const it = window.$utils.HasValue({ type: 'nasl.core.String', value: msg });
          if (window.$global.isEqual(it, true)) {
            return msg;
          } else if (window.$global.isEqual(it, false)) {
            return '移除成功';
          } else { /* empty */ }
        })(),
        await (async () => {
          const it = window.$utils.HasValue({ type: 'nasl.core.String', value: msg });
          if (window.$global.isEqual(it, true)) {
            return 'error';
          } else if (window.$global.isEqual(it, false)) {
            return 'success';
          } else { /* empty */ }
        })(),
      );
    },

    async button_17_click(event) {
      await this.button_17_click_click(event);
    },

    async button_17_click_click() {
      await this.$refs.modal_6?.close?.();
    },

    async button_16_click(event) {
      await this.button_16_click_click(event);
    },

    async button_16_click_click() {
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form_4?.validate?.(undefined, undefined)) || {}).valid) {
        if (this.searchDeptId == this.searchOldDeptId) { /* empty */ } else {
          await window.LcapRequest({
            url: '/api/lcplogics/LcapBatchUpdateDeptUser',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/2',
            },
            data: {
              userIds: await (async () => {
                const arr = [(this.searchUser || {}).userId];
                return arr;
              })(),
              deptId: this.searchDeptId,
              oldDeptId: this.searchOldDeptId,
            },
          });
        }

        await this.searchDeptUser();
        await this.userReload();
        await this.$refs.modal_6?.close?.();
      }
    },

    async button_1_click(event) {
      await this.button_1_click_click(event);
    },

    async button_1_click_click() {
      this.isUpdateDept = 0;
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDepartment', window.$utils.Clear(this.inputDept, 'shallow', 'app.dataSources.defaultDS.entities.LcapDepartment'));
      this.inputDept.parentDeptId = this.rootDeptId;
      await this.getDeptIdAndNameList();
      await this.$refs.createORUpdateDeptPopup?.open?.();
    },

    async input_2_input(event) {
      await this.input_2_input_input(event);
    },

    async input_2_input_input() {
      await console.info(window.$utils.ToString('nasl.core.String', '搜索~'));
      await (async () => {
        'use JSBlock';

        await this.$nextTick();
      })();
      await this.searchDeptUser();
    },

    async button_4_click(event) {
      await this.button_4_click_click(event);
    },

    async button_4_click_click() {
      this.inputUser = '[]';
      await this.$refs.modal_2?.open?.();
    },

    async tree_view_new_1_select(event) {
      await this.tree_view_new_1_select_select(event);
    },

    async tree_view_new_1_select_select() {
      if (this.selectDeptIdTemp == (this.selectDept || {}).deptId) { /* empty */ } else {
        this.selectDept = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LcapDepartment',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetDept',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
            },
            data: {
              deptId: (this.selectDept || {}).deptId,
            },
          }),
        );
        await this.userReload();
      }
      this.selectDeptIdTemp = (this.selectDept || {}).deptId;
    },

    async dropdown_item_5_click(event) {
      await this.dropdown_item_5_click_click(event);
    },

    async dropdown_item_5_click_click() {
      if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: this.userIds })) {
        this.isBatchDept = true;
        this.batchDeptId = (this.selectDept || {}).deptId;
        await this.$refs.modal_4?.open?.();
      } else {
        await this.messagePrompt('请先选择部门成员', 'warning');
      }
    },

    async dropdown_item_6_click(event) {
      await this.dropdown_item_6_click_click(event);
    },

    async dropdown_item_6_click_click() {
      if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: this.userIds })) {
        this.isDeptDelete = false;
        await this.$refs.deleteDeptPopup?.open?.();
      } else {
        await this.messagePrompt('请先选择部门成员', 'warning');
      }
    },

    async uInput4_blur(event) {
      await this.uInput4_blur_blur(event);
    },

    async uInput4_blur_blur() {
      this.inputDept.name = window.$utils.Trim((this.inputDept || {}).name);
    },

    async uInput5_blur(event) {
      await this.uInput5_blur_blur(event);
    },

    async uInput5_blur_blur() {
      this.inputDept.deptId = window.$utils.Trim((this.inputDept || {}).deptId);
    },

    async tree_select_new_1_select(event) {
      await this.tree_select_new_1_select_select(event);
    },

    async tree_select_new_1_select_select() {
      await this.getDeptIdAndNameList();
    },

    async linear_layout_306_mouseenter(event, current) {
      await this.linear_layout_306_mouseenter_mouseenter(event, current);
    },

    async linear_layout_306_mouseenter_mouseenter(event, current) {
      this.iconShow = (((current || {}).item || {}).lcapDepartment || {}).deptId;
    },

    async linear_layout_306_mouseleave(event, current) {
      await this.linear_layout_306_mouseleave_mouseleave(event, current);
    },

    async linear_layout_306_mouseleave_mouseleave() {
      this.iconShow = undefined;
    },

    async linear_layout_328_click(event, current) {
      await this.linear_layout_328_click_click(event, current);
    },

    async linear_layout_328_click_click(event, current) {
      if (((current || {}).item || {}).deptId == (this.selectDept || {}).deptId) { /* empty */ } else {
        this.selectDept = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LcapDepartment',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetDept',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/2',
            },
            data: {
              deptId: ((current || {}).item || {}).deptId,
            },
          }),
        );
        await this.userReload();
      }
      this.selectDeptIdTemp = (this.selectDept || {}).deptId;
    },

    async linear_layout_331_click(event, current) {
      await this.linear_layout_331_click_click(event, current);
    },

    async linear_layout_331_click_click(event, current) {
      this.searchUser = ((current || {}).item || {}).lcapUser;
      this.searchDeptId = (((current || {}).item || {}).lcapUserDeptMapping || {}).deptId;
      this.searchOldDeptId = (((current || {}).item || {}).lcapUserDeptMapping || {}).deptId;
      await this.$refs.modal_6?.open?.();
    },

    async link_18_click(event, current) {
      await this.link_18_click_click(event, current);
    },

    async link_18_click_click(event, current) {
      this.isCancelLeader = false;
      this.currentUser = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clone(((current || {}).item || {}).lcapUser));
      await this.$refs.modal_3?.open?.();
    },

    async link_19_click(event, current) {
      await this.link_19_click_click(event, current);
    },

    async link_19_click_click(event, current) {
      this.isCancelLeader = true;
      this.currentUser = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clone(((current || {}).item || {}).lcapUser));
      await this.$refs.modal_3?.open?.();
    },

    async link_20_click(event, current) {
      await this.link_20_click_click(event, current);
    },

    async link_20_click_click(event, current) {
      this.isBatchDept = false;
      this.currentUser = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clone(((current || {}).item || {}).lcapUser));
      this.batchDeptId = (this.selectDept || {}).deptId;
      await this.$refs.modal_4?.open?.();
    },

    async link_21_click(event, current) {
      await this.link_21_click_click(event, current);
    },

    async link_21_click_click(event, current) {
      this.currentUser = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', window.$utils.Clone(((current || {}).item || {}).lcapUser));
      await this.$refs.modal_5?.open?.();
    },

    async link_8_click(event, current) {
      await this.link_8_click_onClickEditDept(event, current);
    },

    async link_8_click_onClickEditDept(event, current) {
      this.isUpdateDept = 1;
      this.inputDept = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDepartment', window.$utils.Clone(((current || {}).item || {}).lcapDepartment));
      await this.getDeptIdAndNameList();
      await this.$refs[`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`]?.close?.();
      await this.$refs.createORUpdateDeptPopup?.open?.();
    },

    async link_11_click(event, current) {
      await this.link_11_click_onClickAddChildDept(event, current);
    },

    async link_11_click_onClickAddChildDept(event, current) {
      this.isUpdateDept = 2;
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDepartment', window.$utils.Clear(this.inputDept, 'shallow', 'app.dataSources.defaultDS.entities.LcapDepartment'));
      this.inputDept.parentDeptId = (((current || {}).item || {}).lcapDepartment || {}).deptId;
      await this.getDeptIdAndNameList();
      await this.$refs[`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`]?.close?.();
      await this.$refs.createORUpdateDeptPopup?.open?.();
    },

    async link_10_click(event, current) {
      await this.link_10_click_onClickSetLeader(event, current);
    },

    async link_10_click_onClickSetLeader(event, current) {
      this.userId = undefined;
      await this.$refs[`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`]?.close?.();
      await this.$refs.modal_1?.open?.();
    },

    async link_9_click(event, current) {
      await this.link_9_click_onClickDeleteDept(event, current);
    },

    async link_9_click_onClickDeleteDept(event, current) {
      let childList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>', undefined);
      this.isDeptDelete = true;
      childList = (
        window.$genInitFromSchema(
          '{list: nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetChildDepts',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/1',
            },
            data: {
              deptId: (((current || {}).item || {}).lcapDepartment || {}).parentDeptId,
            },
          }),
        ) || {}
      ).list;
      this.deleteParentId = undefined;
      if ((childList || {}).length > 1) {
        const $forEachListVariable0rei1sn0 = childList;
        const $forEachStartVariable0rei1sn0 = 0;
        const $forEachEndVariable0rei1sn0 = ($forEachListVariable0rei1sn0 || {}).length;
        if (Array.isArray($forEachListVariable0rei1sn0)) {
          for (let index = $forEachStartVariable0rei1sn0; index < $forEachEndVariable0rei1sn0; index++) {
            const item = $forEachListVariable0rei1sn0[index];
            if (!window.$utils.HasValue({ type: 'nasl.core.String', value: this.deleteParentId }) && (((current || {}).item || {}).lcapDepartment || {}).deptId != (item || {}).deptId) {
              this.deleteParentId = (item || {}).deptId;
            }
          }
        }
      } else {
        this.deleteParentId = (((current || {}).item || {}).lcapDepartment || {}).parentDeptId;
      }
      await this.$refs[`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`]?.close?.();
      await this.$refs.deleteDeptPopup?.open?.();
    },

    async link_12_click(event, current) {
      await this.link_12_click_onClickEditDept(event, current);
    },

    async link_12_click_onClickEditDept(event, current) {
      this.isUpdateDept = 1;
      this.inputDept = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDepartment', window.$utils.Clone((current || {}).item));
      await this.getDeptIdAndNameList();
      await this.$refs[`popup_combination_2_${(current || {}).__nodeKey || (current || {}).index}`]?.close?.();
      await this.$refs.createORUpdateDeptPopup?.open?.();
    },

    async link_13_click(event, current) {
      await this.link_13_click_onClickAddChildDept(event, current);
    },

    async link_13_click_onClickAddChildDept(event, current) {
      this.isUpdateDept = 2;
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDepartment', window.$utils.Clear(this.inputDept, 'shallow', 'app.dataSources.defaultDS.entities.LcapDepartment'));
      this.inputDept.parentDeptId = ((current || {}).item || {}).deptId;
      await this.getDeptIdAndNameList();
      await this.$refs[`popup_combination_2_${(current || {}).__nodeKey || (current || {}).index}`]?.close?.();
      await this.$refs.createORUpdateDeptPopup?.open?.();
    },

    async link_14_click(event, current) {
      await this.link_14_click_onClickSetLeader(event, current);
    },

    async link_14_click_onClickSetLeader(event, current) {
      this.userId = undefined;
      await this.$refs[`popup_combination_2_${(current || {}).__nodeKey || (current || {}).index}`]?.close?.();
      await this.$refs.modal_1?.open?.();
    },

    async link_15_click(event, current) {
      await this.link_15_click_onClickDeleteDept(event, current);
    },

    async link_15_click_onClickDeleteDept(event, current) {
      let childList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>', undefined);
      this.isDeptDelete = true;
      childList = (
        window.$genInitFromSchema(
          '{list: nasl.collection.List<app.dataSources.defaultDS.entities.LcapDepartment>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetChildDepts',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
            },
            data: {
              deptId: ((current || {}).item || {}).parentDeptId,
            },
          }),
        ) || {}
      ).list;
      this.deleteParentId = undefined;
      if ((childList || {}).length > 1) {
        const $forEachListVariable0vwbmwx0 = childList;
        const $forEachStartVariable0vwbmwx0 = 0;
        const $forEachEndVariable0vwbmwx0 = ($forEachListVariable0vwbmwx0 || {}).length;
        if (Array.isArray($forEachListVariable0vwbmwx0)) {
          for (let index = $forEachStartVariable0vwbmwx0; index < $forEachEndVariable0vwbmwx0; index++) {
            const item = $forEachListVariable0vwbmwx0[index];
            if (!window.$utils.HasValue({ type: 'nasl.core.String', value: this.deleteParentId }) && ((current || {}).item || {}).deptId != (item || {}).deptId) {
              this.deleteParentId = (item || {}).deptId;
            }
          }
        }
      } else {
        this.deleteParentId = ((current || {}).item || {}).parentDeptId;
      }
      await this.$refs[`popup_combination_2_${(current || {}).__nodeKey || (current || {}).index}`]?.close?.();
      await this.$refs.deleteDeptPopup?.open?.();
    },

    genviewMatchExpression_1ngkurn1(current) {
      return (() => {
        const it = ((current || {}).item || {}).deptId == (this.selectDept || {}).deptId;
        if (window.$global.isEqual(it, true)) {
          return '#edf3ff';
        } else if (window.$global.isEqual(it, false)) {
          return '#fff';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0rjyaxr0(current) {
      return (() => {
        const it = ((current || {}).item || {}).deptId == (this.selectDept || {}).deptId;
        if (window.$global.isEqual(it, true)) {
          return '#337EFF';
        } else if (window.$global.isEqual(it, false)) {
          return '#333333';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_11x0k5t0(current) {
      return (() => {
        const it = ((current || {}).item || {}).deptId == (this.selectDept || {}).deptId;
        if (window.$global.isEqual(it, true)) {
          return '#337EFF';
        } else if (window.$global.isEqual(it, false)) {
          return '#333333';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0aayx4a1(current) {
      return (() => {
        const it = (((current || {}).item || {}).lcapUser || {}).userId == (this.searchUser || {}).userId;
        if (window.$global.isEqual(it, true)) {
          return '#edf3ff';
        } else if (window.$global.isEqual(it, false)) {
          return '#fff';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_08m2m8a0(current) {
      return (() => {
        const it = (((current || {}).item || {}).lcapUser || {}).userId == (this.searchUser || {}).userId;
        if (window.$global.isEqual(it, true)) {
          return '#337EFF';
        } else if (window.$global.isEqual(it, false)) {
          return '#333333';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0ynizzx0(current) {
      return (() => {
        const it = (((current || {}).item || {}).lcapDepartment || {}).deptId == (this.selectDept || {}).deptId;
        if (window.$global.isEqual(it, true)) {
          return '#337EFF';
        } else if (window.$global.isEqual(it, false)) {
          return '#333333';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1ehfbie0(current) {
      return (() => {
        const it = (((current || {}).item || {}).lcapDepartment || {}).deptId == (this.selectDept || {}).deptId;
        if (window.$global.isEqual(it, true)) {
          return '#337EFF';
        } else if (window.$global.isEqual(it, false)) {
          return '#333333';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1mf3pi60() {
      return (() => {
        const it = (this.selectDept || {}).deptId == this.rootDeptId;
        if (window.$global.isEqual(it, true)) {
          return '#d9d0cc';
        } else if (window.$global.isEqual(it, false)) {
          return '#f24957';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0ffm2sw0() {
      return (() => {
        const it = this.isCancelLeader;
        if (window.$global.isEqual(it, true)) {
          return window.$utils.ToString('nasl.core.String', '确定取消“') + window.$utils.ToString('nasl.core.String', (this.currentUser || {}).userName) + window.$utils.ToString('nasl.core.String', '”的部门主管吗？');
        } else if (window.$global.isEqual(it, false)) {
          return window.$utils.ToString('nasl.core.String', '确定将“') + window.$utils.ToString('nasl.core.String', (this.currentUser || {}).userName) + window.$utils.ToString('nasl.core.String', '”设为部门主管吗？');
        } else { /* empty */ }
      })();
    },

    __tree_view_new_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tree_view_new_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          'nasl.collection.List<{lcapDepartment: app.dataSources.defaultDS.entities.LcapDepartment}>',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetDeptList',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/4',
            },
            data: {},
          }),
        );
      });
    },

    __table_view_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__table_view_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser, lcapUserDeptMapping: app.dataSources.defaultDS.entities.LcapUserDeptMapping}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetDeptUsers',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
            },
            data: {
              deptIds: await (async () => {
                const arr = [(this.selectDept || {}).deptId];
                return arr;
              })(),
              page: this.table_view_1_state_page,
              size: this.table_view_1_state_size,
            },
          }),
        );
      });
    },

    __tree_select_new_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tree_select_new_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          'nasl.collection.List<{lcapDepartment: app.dataSources.defaultDS.entities.LcapDepartment}>',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetDeptList',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/3',
            },
            data: {},
          }),
        );
      });
    },

    __select_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser, lcapUserDeptMapping: app.dataSources.defaultDS.entities.LcapUserDeptMapping}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapLoadDeptSetLeaderSelect',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
            },
            data: {
              page: this.select_1_state_page,
              size: this.select_1_state_size,
              deptId: (this.selectDept || {}).deptId,
              filter: this.select_1_state_filterText,
            },
          }),
        );
      });
    },

    __select_2_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__select_2_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapLoadDeptAddUserSelect',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
            },
            data: {
              page: this.select_2_state_page,
              size: this.select_2_state_size,
              deptId: (this.selectDept || {}).deptId,
              search: this.select_2_state_filterText,
            },
          }),
        );
      });
    },

    __tree_select_new_2_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tree_select_new_2_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          'nasl.collection.List<{lcapDepartment: app.dataSources.defaultDS.entities.LcapDepartment}>',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetDeptList',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/2',
            },
            data: {},
          }),
        );
      });
    },

    __tree_select_new_3_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tree_select_new_3_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          'nasl.collection.List<{lcapDepartment: app.dataSources.defaultDS.entities.LcapDepartment}>',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetDeptList',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/departmentManagement/0',
            },
            data: {},
          }),
        );
      });
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.departmentManagement_created();
  },
};
</script>
