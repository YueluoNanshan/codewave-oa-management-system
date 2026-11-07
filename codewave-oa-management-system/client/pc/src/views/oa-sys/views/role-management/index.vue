<template>
  <u-linear-layout
    ref="uLinearLayout1"
    class="cw-style-height cw-style-background-color"
    type="root"
    gap="none"
    style="--cw-style-height: 100%; --cw-style-background-color: #f5f6fa; background-color: #f5f6fa; height: 100%; --custom-start: auto; min-height: 200px"
  >
    <u-router-view ref="router_view1"></u-router-view>
    <u-linear-layout
      ref="linear_layout_265"
      class="cw-style-width cw-style-height cw-style-background-color"
      direction="horizontal"
      mode="flex"
      alignment="start"
      justify="start"
      :wrap="false"
      gap="none"
      style="--cw-style-width: 100%; --cw-style-height: 100%; --cw-style-background-color: #f5f6fa; background-color: #f5f6fa; width: 100%; min-height: 200px; height: 100%"
    >
      <u-linear-layout
        ref="linear_layout_266"
        class="cw-style-width cw-style-height"
        direction="horizontal"
        widthStretch="false"
        gap="normal"
        heightStretch="false"
        mode="block"
        style="--cw-style-width: 20%; --cw-style-height: 100%; width: 20%; --space-base: 0px; height: 100%"
      >
        <u-panel
          ref="panel_2"
          class="cw-style-height cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width cw-style-border-top-right-radius cw-style-border-radius cw-style-border-bottom-right-radius"
          shadow="never"
          :bordered="false"
          style="--cw-style-height: 100%; --cw-style-border-style: solid; --cw-style-border-color: #e5e5e5; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 1px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; --cw-style-border-top-right-radius: 0px; --cw-style-border-bottom-right-radius: 0px; --panel-body-padding-x: 0px; --panel-body-padding-y: 0px; border-style: solid; border-top-width: 0px; border-left-width: 0px; border-right-width: 1px; border-bottom-width: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-color: #e5e5e5; height: 100%; min-width: 100%"
        >
          <template
            #title

          >
            <u-text
              ref="text_185"
              class="cw-style-font-size cw-style-color"
              text="角色列表"
              style="--cw-style-font-size: 16px; --cw-style-color: #020202; font-size: 16px; color: #020202"
            ></u-text>
          </template>
          <u-linear-layout
            ref="linear_layout_2"
            class="cw-style-margin-left cw-style-margin cw-style-margin-bottom cw-style-margin-top cw-style-margin-right"
            direction="vertical"
            gap="none"
            mode="block"
            style="--cw-style-margin-left: 0px; --cw-style-margin-bottom: 0px; --cw-style-margin-top: 0px; --cw-style-margin-right: 0px; margin-top: 0px; margin-left: 0px; margin-right: 0px; margin-bottom: 0px; min-width: 100%"
          >
            <u-linear-layout
              ref="linear_layout_290"
              class="cw-style-text-align cw-style-margin-bottom cw-style-margin cw-style-margin-top"
              direction="horizontal"
              mode="flex"
              justify="center"
              alignment="start"
              style="--cw-style-text-align: center; --cw-style-margin-bottom: 12px; --cw-style-margin-top: 15px; position: relative; left: 0; top: 0; text-align: center; margin-bottom: 12px; min-width: 100%; margin-top: 15px"
            >
              <u-button
                ref="button_1"
                class="cw-style-height"
                color="primary"
                text="创建角色"
                icon="add"
                size="normal"
                widthStretch="false"
                @click="button_1_click($event)"
                style="--cw-style-height: 32px; height: 32px; min-width: 90%"
              ></u-button>
            </u-linear-layout>
            <u-linear-layout
              ref="linear_layout_4"
              class="cw-style-padding-bottom cw-style-padding"
              gap="none"
              mode="block"
              direction="horizontal"
              justify="center"
              style="--cw-style-padding-bottom: 14px; min-width: 100%; padding-bottom: 14px; --custom-start: auto; min-height: calc(-210px + 100vh)"
            >
              <u-table-view
                ref="tableView"
                class="cw-style-text-align"
                @sync:state="(key, val) => onSyncState('tableView', key, val)"
                valueField="lcapRole.id"
                :dataSource="__tableView_handleDataSourceLoad()"
                :showTotal="true"
                :sorting="{ field: undefined, order: 'desc' }"
                :pagination="false"
                :showHead="false"
                :selectable="true"
                :value.sync="selectRoleId"
                :pageSize="20"
                :line="false"
                :accordion="false"
                :resizable="false"
                :configurable="false"
                :virtual="false"
                :striped="false"
                v-dependencies.reload="[]"
                :disabled="false"
                :readonly="loading"
                @select="tableView_select($event)"
                key="tableView"
                style="--cw-style-text-align: left; --table-view-row-hover-background: rgba(51, 126, 255, 0.1); text-align: left; --table-view-border-color: none; --table-view-td-padding: 0px 0px 0px 0px; min-width: 100%; min-height: 100%; --custom-start: auto; --table-view-row-selected-background: rgba(51, 119, 255, 0.1); --list-view-item-color-selected: none; --list-view-item-padding: none; --list-view-item-background-hover: none"
              >
                <u-table-view-column
                  ref="uTableViewColumn2"
                  key="uTableViewColumn2"
                  width=""
                  style="--table-view-td-padding: 0px 0px 0px 0px"
                >
                  <template
                    #cell="current"

                  >
                    <u-linear-layout
                      :ref="`uLinearLayout12_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                      gap="small"
                      layout="inline"
                      mode="flex"
                      alignment="center"
                      justify="start"
                      :wrap="false"
                      style="--cw-style-padding-left: 15px; --cw-style-padding-bottom: 10px; --cw-style-padding-top: 10px; --cw-style-padding-right: 6px; padding-left: 15px; padding-top: 10px; padding-bottom: 10px; padding-right: 6px; --custom-start: auto; cursor: pointer"
                    >
                      <i-ico
                        :ref="`ico_20_${(current || {}).__nodeKey || (current || {}).index}`"
                        class="cw-style-width cw-style-height cw-style-color"
                        name="/assets/user/jasonzcmu/1765858474045_e320a7e3039b448ab397596861ebd9c0.svg"
                        icotype="only"
                        widthStretch="false"
                        heightStretch="false"
                        :style="{ color: genviewMatchExpression_1frwyca1(current), '--cw-style-color': genviewMatchExpression_1frwyca1(current) }"
                        style="--cw-style-width: 16px; --cw-style-height: 16px; width: 16px; height: 16px; --custom-start: auto; line-height: 16px"
                      >
                        <u-text
                          :ref="`text_311_${(current || {}).__nodeKey || (current || {}).index}`"
                          text="图标"
                        ></u-text>
                      </i-ico>
                      <u-text
                        :ref="`uText8_${(current || {}).__nodeKey || (current || {}).index}`"
                        class="cw-style-color"
                        :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).lcapRole || {}).name)"
                        overflow="ellipsis"
                        :style="{ color: genviewMatchExpression_18m38t21(current), '--cw-style-color': genviewMatchExpression_18m38t21(current) }"
                      ></u-text>
                    </u-linear-layout>
                  </template>
                  <template
                    #title

                  >
                    <u-text
                      ref="text2"
                      text="角色名称"
                    ></u-text>
                  </template>
                </u-table-view-column>
                <u-table-view-column
                  ref="uTableViewColumn4"
                  key="uTableViewColumn4"
                  :width="40"
                  :style="{}"
                  style="--table-view-td-padding: 0px 0px 0px 0px"
                >
                  <template
                    #cell="current"

                  >
                    <u-linear-layout
                      :ref="`uLinearLayout14_${(current || {}).__nodeKey || (current || {}).index}`"
                      class="cw-style-height cw-style-text-align cw-style-padding-bottom cw-style-padding cw-style-padding-top"
                      gap="normal"
                      mode="flex"
                      justify="start"
                      alignment="center"
                      :wrap="false"
                      :style="{}"
                      style="--cw-style-height: 40px; --cw-style-text-align: left; --cw-style-padding-bottom: 6px; --cw-style-padding-top: 6px; text-align: left; --space-base: 0px; padding-top: 6px; padding-bottom: 6px; height: 40px; --custom-start: auto; cursor: pointer"
                    >
                      <u-popup-combination
                        :ref="`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`"
                        :key="`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`"
                        class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                        placement="right-start"
                        display="inline"
                        v-if="(((current || {}).item || {}).lcapRole || {}).editable"
                        style="--cw-style-padding-left: 0px; --cw-style-padding-bottom: 0px; --cw-style-padding-top: 0px; --cw-style-padding-right: 0px; --cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; border-top-width: 0px; border-left-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-style: solid; padding-top: 0px; padding-left: 0px; padding-right: 0px; padding-bottom: 0px"
                      >
                        <template
                          #reference

                        >
                          <i-ico
                            :ref="`ico_5_${(current || {}).__nodeKey || (current || {}).index}`"
                            class="cw-style-width cw-style-height cw-style-font-size cw-style-color"
                            name="/assets/user/jasonzcmu/1765858474127_afd043242754467ea58bf18ca0dfe3cc.svg"
                            icotype="only"
                            :style="{ color: genviewMatchExpression_1ir6vid0(current), '--cw-style-color': genviewMatchExpression_1ir6vid0(current) }"
                            style="--cw-style-width: 24px; --cw-style-height: 24px; --cw-style-font-size: 24px; width: 24px; height: 24px; font-size: 24px; --custom-start: auto; cursor: pointer; line-height: 24px"
                          >
                            <u-text
                              :ref="`text_214_${(current || {}).__nodeKey || (current || {}).index}`"
                              text="图标"
                            ></u-text>
                          </i-ico>
                        </template>
                        <u-linear-layout
                          :ref="`linear_layout_300_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-height"
                          direction="horizontal"
                          mode="flex"
                          justify="start"
                          alignment="center"
                          style="--cw-style-height: 32px; height: 32px"
                        >
                          <u-link
                            :ref="`link_4_${(current || {}).__nodeKey || (current || {}).index}`"
                            class="cw-style-width cw-style-font-size"
                            text="修改"
                            widthStretch="false"
                            heightStretch="false"
                            hoverType="underline"
                            color="default"
                            @click="link_4_click($event, current)"
                            style="--cw-style-width: 100%; --cw-style-font-size: 14px; font-size: 14px; width: 100%"
                          ></u-link>
                        </u-linear-layout>
                        <u-linear-layout
                          :ref="`linear_layout_301_${(current || {}).__nodeKey || (current || {}).index}`"
                          class="cw-style-height"
                          direction="horizontal"
                          mode="flex"
                          justify="start"
                          alignment="center"
                          style="--cw-style-height: 32px; height: 32px"
                        >
                          <u-link
                            :ref="`link_3_${(current || {}).__nodeKey || (current || {}).index}`"
                            class="cw-style-width cw-style-font-size"
                            text="删除"
                            color="danger"
                            widthStretch="false"
                            heightStretch="false"
                            @click="link_3_click($event, current)"
                            style="--cw-style-width: 100%; --cw-style-font-size: 14px; font-size: 14px; width: 100%"
                          ></u-link>
                        </u-linear-layout>
                      </u-popup-combination>
                    </u-linear-layout>
                  </template>
                  <template
                    #title

                  >
                    <u-text
                      ref="text4"
                      text="操作"
                    ></u-text>
                  </template>
                </u-table-view-column>
              </u-table-view>
            </u-linear-layout>
          </u-linear-layout>
        </u-panel>
      </u-linear-layout>
      <u-linear-layout
        ref="linear_layout_267"
        class="cw-style-width cw-style-height"
        direction="horizontal"
        mode="block"
        heightStretch="false"
        widthStretch="false"
        style="--cw-style-width: 80%; --cw-style-height: 100%; width: 80%; height: 100%"
      >
        <u-panel
          ref="panel_3"
          class="cw-style-border-style cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width cw-style-border-top-left-radius cw-style-border-radius cw-style-border-bottom-left-radius"
          :bordered="false"
          shadow="never"
          style="--cw-style-border-style: solid; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 0px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; --cw-style-border-top-left-radius: 0px; --cw-style-border-bottom-left-radius: 0px; border-left-width: 0px; border-style: solid; border-top-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-top-left-radius: 0px; border-bottom-left-radius: 0px; min-width: 944px; min-height: 100%"
        >
          <template
            #title

          >
            <u-linear-layout
              ref="linear_layout_281"
              direction="horizontal"
            >
              <u-grid-layout ref="grid_layout_4"></u-grid-layout>
            </u-linear-layout>
            <u-linear-layout
              ref="linear_layout_294"
              class="cw-style-padding-top cw-style-padding"
              direction="horizontal"
              layout="inline"
              mode="flex"
              justify="start"
              alignment="center"
              style="--cw-style-padding-top: 10px; padding-top: 10px; min-height: 62px"
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
                  ref="ico_12"
                  class="cw-style-font-size cw-style-color"
                  name="/assets/user/jasonzcmu/1765858473660_5482f951a99f4a1fad0be7c5f134a922.svg"
                  icotype="only"
                  style="--cw-style-font-size: 24px; --cw-style-color: #337eff; font-size: 24px; color: #337eff"
                >
                  <u-text
                    ref="text_303"
                    text="图标"
                  ></u-text>
                </i-ico>
              </u-linear-layout>
              <u-linear-layout
                ref="linear_layout_298"
                gap="none"
                mode="flex"
                direction="vertical"
                alignment="start"
                justify="center"
              >
                <u-text
                  ref="text_219"
                  class="cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', (selectRole || {}).name)"
                  display="block"
                  style="--cw-style-color: #020202; color: #020202"
                ></u-text>
                <u-text
                  ref="text_220"
                  class="cw-style-margin-left cw-style-margin cw-style-font-size cw-style-color"
                  :text="$utils['ToString']('nasl.core.String', (selectRole || {}).description)"
                  style="--cw-style-margin-left: 0px; --cw-style-font-size: 14px; --cw-style-color: #999; margin-left: 0px; font-size: 14px; color: #999; --custom-start: auto; font-weight: normal"
                ></u-text>
              </u-linear-layout>
            </u-linear-layout>
          </template>
          <u-tabs
            ref="tabs_1"
            appear="line"
            titleField=""
            valueField=""
            urlField=""
            closableField=""
            style="min-height: 100%"
          >
            <u-tab ref="tab_1">
              <template
                #title

              >
                <u-text
                  ref="text_198"
                  class="cw-style-color"
                  text="人员管理"
                  style="--cw-style-color: #020202; color: #020202"
                ></u-text>
              </template>
              <u-linear-layout
                ref="linear_layout_7"
                class="cw-style-width"
                direction="vertical"
                style="--cw-style-width: 100%; width: 100%"
              >
                <u-linear-layout ref="linear_layout_10">
                  <u-button
                    ref="uButton1"
                    class="cw-style-text-align cw-style-margin"
                    text="添加用户"
                    color="primary"
                    icon="add"
                    @click="uButton1_click($event)"
                    style="--cw-style-text-align: left; --cw-style-margin: 0 0 0 0; text-align: left; margin: 0 0 0 0"
                  ></u-button>
                </u-linear-layout>
                <u-linear-layout ref="linear_layout_9">
                  <u-table-view
                    ref="tableView1"
                    class="cw-style-width"
                    :dataSource="loadUserRoleByUserId"
                    valueField="lcapUserRoleMapping.id"
                    :showTotal="true"
                    :pagination="true"
                    :pageSize="20"
                    :initialLoad="false"
                    designerMode="success"
                    v-dependencies.reload="[]"
                    :pageSizeOptions="[5, 10, 20, 50]"
                    key="tableView1"
                    style="--cw-style-width: auto; width: auto"
                  >
                    <u-table-view-column
                      ref="uTableViewColumn3"
                      key="uTableViewColumn3"
                      type="index"
                      width="60"
                      :autoIndex="true"
                    >
                      <template
                        #title

                      >
                        <u-text
                          ref="text3"
                          text="序号"
                        ></u-text>
                      </template>
                    </u-table-view-column>
                    <u-table-view-column
                      ref="uTableViewColumn5"
                      key="uTableViewColumn5"
                    >
                      <template
                        #cell="current"

                      >
                        <u-linear-layout
                          :ref="`uLinearLayout4_${(current || {}).__nodeKey || (current || {}).index}`"
                          gap="small"
                        >
                          <u-text
                            :ref="`uText2_${(current || {}).__nodeKey || (current || {}).index}`"
                            :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).lcapUserRoleMapping || {}).userName)"
                          ></u-text>
                        </u-linear-layout>
                      </template>
                      <template
                        #title

                      >
                        <u-text
                          ref="text5"
                          text="用户名"
                        ></u-text>
                      </template>
                    </u-table-view-column>
                    <u-table-view-column
                      ref="uTableViewColumn6"
                      key="uTableViewColumn6"
                    >
                      <template
                        #cell="current"

                      >
                        <u-linear-layout
                          :ref="`uLinearLayout5_${(current || {}).__nodeKey || (current || {}).index}`"
                          gap="small"
                        >
                          <u-link
                            :ref="`uLink1_${(current || {}).__nodeKey || (current || {}).index}`"
                            text="移除 "
                            color="danger"
                            :disabled="(((current || {}).item || {}).lcapUserRoleMapping || {}).userName == adminName && !(selectRole || {}).editable"
                            @click="uLink1_click($event, current)"
                          ></u-link>
                        </u-linear-layout>
                      </template>
                      <template
                        #title

                      >
                        <u-text
                          ref="text6"
                          text="操作"
                        ></u-text>
                      </template>
                    </u-table-view-column>
                  </u-table-view>
                </u-linear-layout>
              </u-linear-layout>
            </u-tab>
            <u-tab ref="tab_2">
              <template
                #title

              >
                <u-text
                  ref="text_200"
                  class="cw-style-color"
                  text="功能权限 "
                  style="--cw-style-color: #020202; color: #020202"
                ></u-text>
              </template>
              <u-linear-layout
                ref="linear_layout_5"
                direction="vertical"
              >
                <u-linear-layout ref="linear_layout_6">
                  <u-button
                    ref="uButton5"
                    class="cw-style-margin"
                    text="新增功能权限"
                    :disabled="!(selectRole || {}).editable"
                    color="primary"
                    icon="add"
                    @click="uButton5_click($event)"
                    style="--cw-style-margin: 0 0 15px 0; margin: 0 0 15px 0"
                  ></u-button>
                </u-linear-layout>
                <u-linear-layout ref="linear_layout_8">
                  <u-table-view
                    ref="tableView2"
                    class="cw-style-width"
                    :dataSource="loadPermissionByRoleId"
                    :showSizer="true"
                    values=""
                    valueField="id"
                    :showTotal="true"
                    :pagination="true"
                    :pageSize="20"
                    :pageSizeOptions="[5, 10, 20, 50]"
                    key="tableView2"
                    style="--cw-style-width: auto; width: auto"
                  >
                    <u-table-view-column
                      ref="uTableViewColumn7"
                      key="uTableViewColumn7"
                      class="cw-style-width cw-style-height"
                      :width="50"
                      type="index"
                      :autoIndex="true"
                      style="--cw-style-width: 40px; --cw-style-height: auto; height: auto; width: 40px"
                    >
                      <template
                        #title

                      >
                        <u-text
                          ref="text8"
                          text="序号"
                        ></u-text>
                      </template>
                    </u-table-view-column>
                    <u-table-view-column
                      ref="uTableViewColumn8"
                      key="uTableViewColumn8"
                      type="normal"
                    >
                      <template
                        #cell="current"

                      >
                        <u-linear-layout
                          :ref="`uLinearLayout21_${(current || {}).__nodeKey || (current || {}).index}`"
                          gap="small"
                        >
                          <u-text
                            :ref="`uText16_${(current || {}).__nodeKey || (current || {}).index}`"
                            :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).name)"
                          ></u-text>
                        </u-linear-layout>
                      </template>
                      <template
                        #title

                      >
                        <u-text
                          ref="text9"
                          text="权限名称"
                        ></u-text>
                      </template>
                    </u-table-view-column>
                    <u-table-view-column
                      ref="uTableViewColumn9"
                      key="uTableViewColumn9"
                    >
                      <template
                        #cell="current"

                      >
                        <u-linear-layout
                          :ref="`uLinearLayout22_${(current || {}).__nodeKey || (current || {}).index}`"
                          gap="small"
                        >
                          <u-text
                            :ref="`uText17_${(current || {}).__nodeKey || (current || {}).index}`"
                            :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).description)"
                          ></u-text>
                        </u-linear-layout>
                      </template>
                      <template
                        #title

                      >
                        <u-text
                          ref="text14"
                          text="权限描述"
                        ></u-text>
                      </template>
                    </u-table-view-column>
                    <u-table-view-column
                      ref="uTableViewColumn10"
                      key="uTableViewColumn10"
                    >
                      <template
                        #cell="current"

                      >
                        <u-linear-layout
                          :ref="`uLinearLayout23_${(current || {}).__nodeKey || (current || {}).index}`"
                          gap="small"
                        >
                          <u-link
                            :ref="`uLink2_${(current || {}).__nodeKey || (current || {}).index}`"
                            text="移除该权限"
                            :disabled="!(selectRole || {}).editable"
                            color="danger"
                            @click="uLink2_click($event, current)"
                          ></u-link>
                        </u-linear-layout>
                      </template>
                      <template
                        #title

                      >
                        <u-text
                          ref="text15"
                          text="操作"
                        ></u-text>
                      </template>
                    </u-table-view-column>
                  </u-table-view>
                </u-linear-layout>
              </u-linear-layout>
            </u-tab>
            <u-tab ref="tab_3">
              <template
                #title

              >
                <u-text
                  ref="text_202"
                  class="cw-style-color"
                  text="数据权限"
                  style="--cw-style-color: #020202; color: #020202"
                ></u-text>
              </template>
              <u-grid-layout
                ref="grid_layout_6"
                style="min-height: 100%"
              >
                <u-grid-layout-row
                  ref="grid_layout_row_2"
                  :repeat="24"
                  gap="none"
                  justify="start"
                >
                  <u-grid-layout-column
                    ref="grid_layout_column_4"
                    :span="5"
                  >
                    <u-linear-layout
                      ref="linear_layout_310"
                      class="cw-style-padding-right cw-style-padding cw-style-border-style cw-style-border-color cw-style-border-left-width cw-style-border-width cw-style-border-right-width cw-style-border-top-width cw-style-border-bottom-width"
                      gap="normal"
                      direction="vertical"
                      mode="block"
                      style="--cw-style-padding-right: 16px; --cw-style-border-style: solid; --cw-style-border-color: #e6e7eb; --cw-style-border-left-width: 0px; --cw-style-border-right-width: 1px; --cw-style-border-top-width: 0px; --cw-style-border-bottom-width: 0px; padding-right: 16px; border-color: #e6e7eb; border-right-width: 1px; border-style: solid; border-top-width: 0px; border-left-width: 0px; border-bottom-width: 0px; --space-base: 0px; min-width: 100%; min-height: 100%"
                    >
                      <u-linear-layout
                        ref="linear_layout_311"
                        direction="horizontal"
                        :wrap="false"
                        gap="normal"
                        mode="flex"
                        justify="start"
                        alignment="center"
                        style="--space-base: 0px; min-width: 100%"
                      >
                        <u-capsules
                          ref="capsules_2"
                          class="cw-style-width"
                          :value.sync="selectDataTypeName"
                          :autoSelect="true"
                          widthStretch="true"
                          @select="capsules_2_select($event)"
                          style="--cw-style-width: 100%; width: 100%"
                        >
                          <u-capsule
                            ref="capsule_3"
                            class="cw-style-width"
                            label=""
                            value="entity"
                            style="--cw-style-width: 50%; width: 50%"
                          >
                            <u-text
                              ref="text_225"
                              text="实体"
                            ></u-text>
                          </u-capsule>
                          <u-capsule
                            ref="capsule_4"
                            value="logic"
                            style="--custom-start: auto; width: 50vh"
                          >
                            <u-text
                              ref="text_226"
                              text="逻辑"
                            ></u-text>
                          </u-capsule>
                        </u-capsules>
                      </u-linear-layout>
                      <u-linear-layout
                        ref="linear_layout_312"
                        class="cw-style-margin-bottom cw-style-margin cw-style-margin-top"
                        direction="horizontal"
                        :wrap="true"
                        style="--cw-style-margin-bottom: 12px; --cw-style-margin-top: 20px; margin-top: 20px; margin-bottom: 12px; min-width: 100%"
                      >
                        <u-input
                          ref="input_1"
                          :placeholder="genviewMatchExpression_0x8h5k60()"
                          :value.sync="searchDataMetaName"
                          prefix="search"
                          :clearable="true"
                          @input="input_1_input($event)"
                          style="min-width: 100%"
                        ></u-input>
                      </u-linear-layout>
                      <u-linear-layout
                        ref="linear_layout_313"
                        mode="block"
                        direction="horizontal"
                        gap="normal"
                        style="--space-base: 0px; min-width: 100%; --custom-start: auto; min-height: calc(100vh + -382px)"
                      >
                        <u-table-view
                          ref="tableView_1"
                          :dataSource="__tableView_1_handleDataSourceLoad()"
                          dataSchema="LoadRoleManagementTableView_1Structure"
                          :pagination="false"
                          :showSizer="true"
                          :pageSize="20"
                          :pageNumber="1"
                          :showHead="false"
                          valueField="id"
                          :initialLoad="false"
                          :selectable="true"
                          :value.sync="selectDataMeta.id"
                          :readonly="loading"
                          v-dependencies.reload="[]"
                          @select="tableView_1_select($event)"
                          @load="tableView_1_load($event)"
                          key="tableView_1"
                          style="--table-view-row-hover-background: #e8f0ff; --table-view-border-color: #ffffff; --table-view-td-color: #53576a; --table-view-td-padding: 0px 0px 0px 0px; min-height: 100%; min-width: 100%; --custom-start: auto; --table-view-row-selected-background: #e8f0ff"
                        >
                          <u-table-view-column
                            ref="table_view_column_2"
                            key="table_view_column_2"
                            field="dataName"
                          >
                            <template
                              #expander="current"

                            >
                              <u-table-view-expander :ref="`table_view_expander_2_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                            </template>
                            <template
                              #cell="current"

                            >
                              <u-linear-layout
                                :ref="`linear_layout_314_${(current || {}).__nodeKey || (current || {}).index}`"
                                class="cw-style-width cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right"
                                gap="normal"
                                mode="block"
                                direction="vertical"
                                style="--cw-style-width: auto; --cw-style-padding-left: 10px; --cw-style-padding-bottom: 5px; --cw-style-padding-top: 5px; --cw-style-padding-right: 6px; --space-base: 0px; width: auto; padding-top: 5px; padding-bottom: 5px; padding-left: 10px; padding-right: 6px; --custom-start: auto; cursor: pointer"
                              >
                                <u-text
                                  :ref="`text_235_${(current || {}).__nodeKey || (current || {}).index}`"
                                  class="cw-style-color"
                                  :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).showDataName)"
                                  overflow="ellipsis"
                                  :style="{ color: genviewMatchExpression_17cvxmd1(current), '--cw-style-color': genviewMatchExpression_17cvxmd1(current) }"
                                  style="color: #333; --custom-start: auto; white-space: nowrap"
                                ></u-text>
                                <u-text
                                  :ref="`text_282_${(current || {}).__nodeKey || (current || {}).index}`"
                                  class="cw-style-color"
                                  :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).dataDescription)"
                                  overflow="ellipsis"
                                  display="inline"
                                  widthStretch="false"
                                  style="--cw-style-color: #999; color: #999"
                                ></u-text>
                              </u-linear-layout>
                            </template>
                            <template
                              #title

                            >
                              <u-text
                                ref="text_236"
                                text="实体名"
                              ></u-text>
                            </template>
                          </u-table-view-column>
                        </u-table-view>
                      </u-linear-layout>
                    </u-linear-layout>
                  </u-grid-layout-column>
                  <u-grid-layout-column
                    ref="grid_layout_column_5"
                    :span="19"
                  >
                    <u-linear-layout
                      ref="linear_layout_315"
                      class="cw-style-padding-left cw-style-padding"
                      direction="horizontal"
                      :wrap="true"
                      gap="normal"
                      style="--cw-style-padding-left: 18px; --space-base: 0px; padding-left: 18px"
                    >
                      <u-linear-layout
                        ref="linear_layout_329"
                        class="cw-style-background-color cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                        direction="horizontal"
                        :wrap="false"
                        mode="flex"
                        alignment="start"
                        justify="space-between"
                        style="--cw-style-background-color: #f7f8fa; --cw-style-padding-left: 16px; --cw-style-padding-bottom: 16px; --cw-style-padding-top: 16px; --cw-style-padding-right: 16px; --cw-style-border-top-left-radius: 6px; --cw-style-border-top-right-radius: 6px; --cw-style-border-bottom-left-radius: 6px; --cw-style-border-bottom-right-radius: 6px; border-top-left-radius: 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px; border-bottom-left-radius: 6px; background-color: #f7f8fa; padding-top: 16px; padding-left: 16px; padding-right: 16px; padding-bottom: 16px"
                      >
                        <u-linear-layout
                          ref="linear_layout_330"
                          :wrap="false"
                          mode="flex"
                          direction="vertical"
                          alignment="start"
                          justify="start"
                          style="--custom-start: auto; flex: 1; max-width: calc(100% - 96px); display: -webkit-box; -webkit-line-clamp: 2; -webkit-box-orient: vertical; overflow: hidden"
                        >
                          <u-linear-layout
                            ref="linear_layout_331"
                            class="cw-style-margin-bottom cw-style-margin"
                            direction="horizontal"
                            :wrap="false"
                            mode="flex"
                            justify="start"
                            alignment="center"
                            style="--cw-style-margin-bottom: 8px; margin-bottom: 8px"
                          >
                            <u-text
                              ref="text_312"
                              :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0ery1ki0())"
                              overflow="normal"
                              style="--custom-start: auto; font-family: PingFang SC; font-size: 14px; font-weight: 500; line-height: 22px; letter-spacing: 0px; color: #333333; overflow: hidden; text-overflow: ellipsis"
                            ></u-text>
                            <u-linear-layout
                              ref="linear_layout_333"
                              key="linear_layout_333"
                              class="cw-style-padding-left cw-style-padding cw-style-padding-bottom cw-style-padding-top cw-style-padding-right cw-style-margin-left cw-style-margin"
                              direction="horizontal"
                              :wrap="false"
                              mode="flex"
                              alignment="center"
                              justify="center"
                              v-if="selectDataTypeName == `entity`"
                              style="--cw-style-padding-left: 8px; --cw-style-padding-bottom: 2px; --cw-style-padding-top: 2px; --cw-style-padding-right: 8px; --cw-style-margin-left: 8px; margin-left: 8px; padding-top: 2px; padding-bottom: 2px; padding-left: 8px; padding-right: 8px; --custom-start: auto; border-radius: 4px; opacity: 1; background: rgba(51, 119, 255, 0.1)"
                            >
                              <i-ico
                                ref="ico_22"
                                class="cw-style-width cw-style-height cw-style-margin-right cw-style-margin cw-style-color"
                                name="/assets/user/jasonzcmu/1765858474456_2dff6cacdda94368947e60c64e1060ea.svg"
                                icotype="only"
                                widthStretch="false"
                                heightStretch="false"
                                style="--cw-style-width: 16px; --cw-style-height: 16px; --cw-style-margin-right: 4px; --cw-style-color: #3377ff; width: 16px; height: 16px; color: #3377ff; margin-right: 4px; --custom-start: auto; line-height: 16px"
                              >
                                <u-text
                                  ref="text_314"
                                  text="图标"
                                ></u-text>
                              </i-ico>
                              <u-text
                                ref="text_315"
                                :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0yvo2yl1())"
                                style="--custom-start: auto; font-family: PingFang SC; font-size: 14px; font-weight: normal; line-height: 22px; letter-spacing: 0px; color: #3377ff"
                              ></u-text>
                            </u-linear-layout>
                          </u-linear-layout>
                          <u-linear-layout
                            ref="linear_layout_332"
                            direction="horizontal"
                            :wrap="true"
                            mode="flex"
                            justify="start"
                            alignment="end"
                          >
                            <u-text
                              ref="text_316"
                              class="cw-style-color"
                              :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1xuav9y1())"
                              overflow="normal"
                              style="--cw-style-color: #999; color: #999; --custom-start: auto; font-family: PingFang SC; font-size: 14px; font-weight: normal; line-height: 1.4; letter-spacing: 0px"
                            ></u-text>
                          </u-linear-layout>
                        </u-linear-layout>
                        <u-button
                          ref="button_3"
                          class="cw-style-margin-left cw-style-margin"
                          color="primary"
                          text="保存"
                          :disabled="saveEnabled"
                          @click="button_3_click($event)"
                          style="--cw-style-margin-left: 16px; margin-left: 16px"
                        ></u-button>
                      </u-linear-layout>
                      <u-linear-layout
                        ref="linear_layout_317"
                        class="cw-style-margin-top cw-style-margin"
                        gap="normal"
                        mode="flex"
                        :wrap="false"
                        direction="vertical"
                        justify="start"
                        alignment="start"
                        style="--cw-style-margin-top: 24px; --space-base: 0px; margin-top: 24px"
                      >
                        <u-text
                          ref="text_241"
                          class="cw-style-margin-right cw-style-margin"
                          text="行权限"
                          widthStretch="false"
                          style="--cw-style-margin-right: 30px; margin-right: 30px; --custom-start: auto; font-family: PingFang SC; font-size: 14px; font-weight: 500; line-height: 22px; letter-spacing: 0px; color: #333333"
                        ></u-text>
                        <u-radios
                          ref="radios_1"
                          class="cw-style-margin-bottom cw-style-margin cw-style-margin-top"
                          :value.sync="selectDataMeta.rowRuleType"
                          @select="radios_1_select($event)"
                          style="--cw-style-margin-bottom: 8px; --cw-style-margin-top: 8px; --radio-space-x: 14px; margin-top: 8px; margin-bottom: 8px"
                        >
                          <template
                            #item=""

                          ></template>
                          <u-radio
                            ref="radio_1"
                            label="self"
                            :autofocus="true"
                            :disabled="(selectDataMeta || {}).hasCreatedBy"
                            v-tooltip="genviewMatchExpression_0i8b4n91()"
                          >
                            <template
                              #item

                            >
                              <u-text
                                ref="text_248"
                                text="可读本人"
                              ></u-text>
                            </template>
                          </u-radio>
                          <u-radio
                            ref="radio_7"
                            label="underling"
                            :disabled="(selectDataMeta || {}).hasCreatedBy"
                            v-tooltip="genviewMatchExpression_1vnrl1f0()"
                          >
                            <template
                              #item

                            >
                              <u-text
                                ref="text_280"
                                text="可读本人及下属"
                              ></u-text>
                            </template>
                          </u-radio>
                          <u-radio
                            ref="radio_8"
                            label="department"
                            :disabled="(selectDataMeta || {}).hasCreatedBy"
                            v-tooltip="genviewMatchExpression_00nz6wm0()"
                          >
                            <template
                              #item

                            >
                              <u-text
                                ref="text_281"
                                text="可读本部门及下级部门"
                              ></u-text>
                            </template>
                          </u-radio>
                          <u-radio
                            ref="radio_2"
                            label="all"
                          >
                            <template
                              #item

                            >
                              <u-text
                                ref="text_249"
                                text="可读全部"
                              ></u-text>
                            </template>
                          </u-radio>
                          <u-radio
                            ref="radio_3"
                            label="custom"
                          >
                            <template
                              #item

                            >
                              <u-text
                                ref="text_250"
                                text="自定义"
                              ></u-text>
                            </template>
                          </u-radio>
                        </u-radios>
                      </u-linear-layout>
                      <u-linear-layout
                        ref="linear_layout_320"
                        key="linear_layout_320"
                        class="cw-style-width cw-style-margin-top cw-style-margin"
                        direction="horizontal"
                        :wrap="false"
                        mode="flex"
                        justify="start"
                        alignment="center"
                        v-if="(selectDataMeta || {}).rowRuleType == `custom`"
                        style="--cw-style-width: 100%; --cw-style-margin-top: 4px; width: 100%; margin-top: 4px"
                      >
                        <u-list-view
                          ref="list_view_1"
                          class="cw-style-width"
                          :pageNumber="1"
                          :pageSize="50"
                          widthStretch="false"
                          :dataSource="customRowRuleList"
                          :initialLoad="false"
                          :border="false"
                          height="auto"
                          designerMode="success"
                          emptyText=""
                          key="list_view_1"
                          style="--cw-style-width: 100%; min-width: 100px; width: 100%; --custom-start: auto; --list-view-item-background-hover: none; --list-view-item-padding: 0px 0px; --list-view-item-background-selected: none; --list-view-item-color-selected: none"
                        >
                          <template
                            #item="current"

                          >
                            <u-linear-layout
                              :ref="`linear_layout_324_${(current || {}).__nodeKey || (current || {}).index}`"
                              class="cw-style-padding-top cw-style-padding"
                              direction="horizontal"
                              :wrap="false"
                              mode="flex"
                              justify="start"
                              alignment="start"
                              style="--cw-style-padding-top: 4px; padding-top: 4px"
                            >
                              <u-text
                                :ref="`text_263_${(current || {}).__nodeKey || (current || {}).index}`"
                                class="cw-style-margin-top cw-style-margin cw-style-margin-right"
                                :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `条件`) + $utils['ToString']('nasl.core.Long', $global.add((current || {}).index, 1)))"
                                style="--cw-style-margin-top: 6px; --cw-style-margin-right: 8px; margin-right: 8px; margin-top: 6px; --custom-start: auto; white-space: nowrap"
                              ></u-text>
                              <u-linear-layout
                                :ref="`linear_layout_321_${(current || {}).__nodeKey || (current || {}).index}`"
                                :wrap="false"
                                mode="flex"
                                direction="vertical"
                                alignment="start"
                                justify="center"
                              >
                                <u-linear-layout
                                  :ref="`linear_layout_322_${(current || {}).__nodeKey || (current || {}).index}`"
                                  class="cw-style-width"
                                  direction="horizontal"
                                  widthStretch="false"
                                  mode="flex"
                                  justify="start"
                                  alignment="center"
                                  :wrap="false"
                                  style="--cw-style-width: 100%; width: 100%"
                                >
                                  <u-validator
                                    :ref="`validator_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                    class="cw-style-margin-right cw-style-margin"
                                    label=""
                                    :validatingValue="((current || {}).item || {}).propertyName"
                                    :rules="[{ validate: 'filled', message: `不得为空`, trigger: 'input+blur', required: true }]"
                                    message="不得为空"
                                    placement="bottom"
                                    appendTo="reference"
                                    style="--cw-style-margin-right: 8px; margin-right: 8px"
                                  >
                                    <u-select
                                      :ref="`select_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                      placeholder="请选择"
                                      :pagination="true"
                                      :pageSize="50"
                                      :value.sync="current.item.propertyName"
                                      :dataSource="((current || {}).item || {}).propertys"
                                      textField="propertyTitle"
                                      valueField="propertyName"
                                      appendTo="body"
                                      width="small"
                                      @select="select_1_select($event, current)"
                                      @change="select_1_change($event, current)"
                                      key="select_1"
                                    ></u-select>
                                  </u-validator>
                                  <u-validator
                                    :ref="`validator_2_${(current || {}).__nodeKey || (current || {}).index}`"
                                    class="cw-style-margin-right cw-style-margin"
                                    label=""
                                    :validatingValue="((current || {}).item || {}).comparison"
                                    :rules="[{ validate: 'filled', message: `不得为空`, trigger: 'input+blur', required: true }]"
                                    message="不得为空"
                                    placement="bottom"
                                    style="--cw-style-margin-right: 8px; margin-right: 8px"
                                  >
                                    <u-select
                                      :ref="`select_2_${(current || {}).__nodeKey || (current || {}).index}`"
                                      placeholder="请选择"
                                      :pagination="true"
                                      :pageSize="50"
                                      :value.sync="current.item.comparison"
                                      :dataSource="((current || {}).item || {}).comparisons"
                                      textField="text"
                                      valueField="value"
                                      sorting="{ field: undefined, order: 'asc' }"
                                      iconField=""
                                      appendTo="body"
                                      width="small"
                                      @select="select_2_select($event, current)"
                                      key="select_2"
                                    ></u-select>
                                  </u-validator>
                                  <u-validator
                                    :ref="`validator_4_${(current || {}).__nodeKey || (current || {}).index}`"
                                    label=""
                                    :validatingValue="((current || {}).item || {}).valuesType"
                                    :rules="[{ validate: 'filled', message: `不得为空`, trigger: 'input+blur', required: true }]"
                                    message="不得为空"
                                    placement="bottom"
                                  >
                                    <u-select
                                      :ref="`select_4_${(current || {}).__nodeKey || (current || {}).index}`"
                                      class="cw-style-margin-right cw-style-margin"
                                      placeholder="请选择"
                                      :pagination="true"
                                      :pageSize="50"
                                      :value.sync="current.item.valuesType"
                                      textField=""
                                      valueField=""
                                      sorting="{ field: undefined, order: 'asc' }"
                                      iconField=""
                                      appendTo="body"
                                      width="small"
                                      :dataSource="[`固定值`, `登录信息变量`]"
                                      @select="select_4_select($event, current)"
                                      key="select_4"
                                      style="--cw-style-margin-right: 8px; margin-right: 8px"
                                    ></u-select>
                                  </u-validator>
                                  <u-validator
                                    :ref="`validator_3_${(current || {}).__nodeKey || (current || {}).index}`"
                                    label=""
                                    :validatingValue="((current || {}).item || {}).values"
                                    :rules="[{ validate: 'filled', message: `不得为空`, trigger: 'input+blur', required: true }]"
                                    message="不得为空"
                                    placement="bottom"
                                  >
                                    <u-input
                                      :ref="`input_3_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :key="`input_3_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :placeholder="genviewMatchExpression_0cuvalp0(current)"
                                      :value.sync="current.item.values"
                                      @change="input_3_change($event, current)"
                                      @blur="input_3_blur($event, current)"
                                      v-if="(((current || {}).item || {}).propertyType == `String` || ((((current || {}).item || {}).comparison == `in` || ((current || {}).item || {}).comparison == `notIn`) && ((current || {}).item || {}).propertyType == `Enum`) || ((current || {}).item || {}).propertyType == `Integer` || ((current || {}).item || {}).propertyType == `Decimal` || !$utils['HasValue']({ type: 'nasl.core.String', value: ((current || {}).item || {}).propertyType })) && ((current || {}).item || {}).valuesType == `固定值`"
                                    ></u-input>
                                    <u-number-input
                                      :ref="`number_input_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :key="`number_input_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                      value=""
                                      :unit="{ type: 'prefix', value: '' }"
                                      :advancedFormat="{ value: '' }"
                                      :placeholder="genviewMatchExpression_1k1u47g0(current)"
                                      :hideButtons="true"
                                      :decimalLength="genviewMatchExpression_0v37snf0(current)"
                                      @input="number_input_1_input($event, current)"
                                      v-if="((((current || {}).item || {}).propertyType == `Integer` && ((current || {}).item || {}).comparison != `in` && ((current || {}).item || {}).comparison != `notIn`) || (((current || {}).item || {}).propertyType == `Decimal` && ((current || {}).item || {}).comparison != `in` && ((current || {}).item || {}).comparison != `notIn`)) && false && ((current || {}).item || {}).valuesType == `固定值`"
                                    ></u-number-input>
                                    <u-select
                                      :ref="`select_3_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :key="`select_3_${(current || {}).__nodeKey || (current || {}).index}`"
                                      placeholder="请选择布尔值"
                                      :pagination="true"
                                      :pageSize="50"
                                      :value.sync="current.item.values"
                                      :dataSource="[`true`, `false`]"
                                      textField=""
                                      valueField=""
                                      sorting="{ field: undefined, order: 'asc' }"
                                      iconField=""
                                      appendTo="body"
                                      @select="select_3_select($event, current)"
                                      v-if="((current || {}).item || {}).propertyType == `Boolean` && ((current || {}).item || {}).valuesType == `固定值`"
                                    ></u-select>
                                    <u-date-picker
                                      :ref="`date_picker_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :key="`date_picker_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :value.sync="current.item.values"
                                      width="normal"
                                      @change="date_picker_1_change($event, current)"
                                      v-if="((current || {}).item || {}).propertyType == `Date` && ((current || {}).item || {}).valuesType == `固定值`"
                                    ></u-date-picker>
                                    <u-time-picker
                                      :ref="`time_picker_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :key="`time_picker_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :value.sync="current.item.values"
                                      :clearable="false"
                                      showFormatter="HH:mm:ss"
                                      @change="time_picker_1_change($event, current)"
                                      v-if="((current || {}).item || {}).propertyType == `Time` && ((current || {}).item || {}).valuesType == `固定值`"
                                    ></u-time-picker>
                                    <u-date-time-picker
                                      :ref="`date_time_picker_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :key="`date_time_picker_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :value.sync="current.item.values"
                                      converter="format"
                                      placeholder="请选择日期时间"
                                      @change="date_time_picker_1_change($event, current)"
                                      v-if="((current || {}).item || {}).propertyType == `DateTime` && ((current || {}).item || {}).valuesType == `固定值`"
                                    ></u-date-time-picker>
                                    <u-select
                                      :ref="`select_5_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :key="`select_5_${(current || {}).__nodeKey || (current || {}).index}`"
                                      placeholder="请选择登录变量"
                                      :pagination="true"
                                      :pageSize="50"
                                      :value.sync="current.item.values"
                                      :dataSource="[`登录用户名`, `登录用户ID`, `登录用户部门标识`]"
                                      textField=""
                                      valueField=""
                                      sorting="{ field: undefined, order: 'asc' }"
                                      iconField=""
                                      appendTo="body"
                                      @select="select_5_select($event, current)"
                                      v-if="((current || {}).item || {}).valuesType == `登录信息变量`"
                                    ></u-select>
                                    <u-select
                                      :ref="`select_6_${(current || {}).__nodeKey || (current || {}).index}`"
                                      :key="`select_6_${(current || {}).__nodeKey || (current || {}).index}`"
                                      placeholder="请选择枚举值"
                                      :pagination="true"
                                      :pageSize="50"
                                      :value.sync="current.item.values"
                                      :dataSource="((current || {}).item || {}).propertyOptions"
                                      textField="title"
                                      valueField="code"
                                      sorting="{ field: undefined, order: 'asc' }"
                                      iconField=""
                                      appendTo="body"
                                      @select="select_6_select($event, current)"
                                      v-if="((current || {}).item || {}).comparison != `in` && ((current || {}).item || {}).comparison != `notIn` && ((current || {}).item || {}).propertyType == `Enum` && ((current || {}).item || {}).valuesType == `固定值`"
                                    ></u-select>
                                  </u-validator>
                                  <i-ico
                                    :ref="`ico_11_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :key="`ico_11_${(current || {}).__nodeKey || (current || {}).index}`"
                                    class="cw-style-width cw-style-margin-left cw-style-margin cw-style-color"
                                    name="remove"
                                    icotype="only"
                                    @click="ico_11_click($event, current)"
                                    v-if="(current || {}).index != 0"
                                    style="--cw-style-width: 16px; --cw-style-margin-left: 8px; --cw-style-color: #f24957; margin-left: 8px; width: 16px; color: #f24957"
                                  >
                                    <u-text
                                      :ref="`text_266_${(current || {}).__nodeKey || (current || {}).index}`"
                                      text="图标"
                                    ></u-text>
                                  </i-ico>
                                </u-linear-layout>
                                <u-linear-layout
                                  :ref="`linear_layout_323_${(current || {}).__nodeKey || (current || {}).index}`"
                                  class="cw-style-width cw-style-margin-bottom cw-style-margin cw-style-margin-top"
                                  direction="horizontal"
                                  :wrap="true"
                                  widthStretch="false"
                                  style="--cw-style-width: 100%; --cw-style-margin-bottom: 4px; --cw-style-margin-top: 14px; width: 100%; margin-top: 14px; margin-bottom: 4px"
                                >
                                  <u-dropdown
                                    :ref="`dropdown_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :key="`dropdown_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                    value=""
                                    appendTo="body"
                                    :router="true"
                                    trigger="hover"
                                    :opened="false"
                                    v-if="(current || {}).index == $global.minus((customRowRuleList || {}).length, 1)"
                                  >
                                    <template
                                      #title

                                    >
                                      <u-text
                                        :ref="`text_300_${(current || {}).__nodeKey || (current || {}).index}`"
                                        :text="$utils['ToString']('nasl.core.String', relationStr)"
                                      ></u-text>
                                    </template>
                                    <u-dropdown-item
                                      :ref="`dropdown_item_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                      @click="dropdown_item_1_click($event, current)"
                                    >
                                      <u-text
                                        :ref="`text_301_${(current || {}).__nodeKey || (current || {}).index}`"
                                        text="+且"
                                      ></u-text>
                                    </u-dropdown-item>
                                    <u-dropdown-item
                                      :ref="`dropdown_item_2_${(current || {}).__nodeKey || (current || {}).index}`"
                                      @click="dropdown_item_2_click($event, current)"
                                    >
                                      <u-text
                                        :ref="`text_302_${(current || {}).__nodeKey || (current || {}).index}`"
                                        text="+或"
                                      ></u-text>
                                    </u-dropdown-item>
                                  </u-dropdown>
                                  <u-text
                                    :ref="`text_271_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :key="`text_271_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :text="$utils['ToString']('nasl.core.String', $utils['Replace'](relationStr, `+`, ``))"
                                    v-if="(current || {}).index != $global.minus((customRowRuleList || {}).length, 1)"
                                  ></u-text>
                                </u-linear-layout>
                              </u-linear-layout>
                            </u-linear-layout>
                          </template>
                        </u-list-view>
                      </u-linear-layout>
                      <u-linear-layout
                        ref="linear_layout_318"
                        class="cw-style-margin-bottom cw-style-margin cw-style-margin-top"
                        direction="horizontal"
                        mode="block"
                        gap="normal"
                        style="--cw-style-margin-bottom: 8px; --cw-style-margin-top: 24px; --space-base: 0px; margin-bottom: 8px; margin-top: 24px"
                      >
                        <u-text
                          ref="text_242"
                          text="列权限"
                          style="--custom-start: auto; font-family: PingFang SC; font-size: 14px; font-weight: 500; line-height: 22px; letter-spacing: 0px; color: #333333"
                        ></u-text>
                      </u-linear-layout>
                      <u-linear-layout
                        ref="linear_layout_319"
                        direction="horizontal"
                        mode="block"
                        gap="normal"
                        style="--space-base: 0px"
                      >
                        <u-table-view
                          ref="table_view_1"
                          :pagination="true"
                          :pageSize="5"
                          :pageNumber="1"
                          :dataSource="__table_view_1_handleDataSourceLoad()"
                          :initialLoad="false"
                          key="table_view_1"
                          style="--table-view-row-hover-background: #f5f6fa; --custom-start: auto; --table-view-td-line-height: 28px; --table-view-expander-size: 0px"
                        >
                          <u-table-view-column
                            ref="table_view_column_3"
                            key="table_view_column_3"
                            type="expander"
                            width="35px"
                            v-if="selectDataTypeName == `logic`"
                          >
                            <template
                              #expander="current"

                            >
                              <u-table-view-expander
                                :ref="`table_view_expander_3_${(current || {}).__nodeKey || (current || {}).index}`"
                                :key="`table_view_expander_3_${(current || {}).__nodeKey || (current || {}).index}`"
                                class="cw-style-color"
                                expandIcon="/assets/user/jasonzcmu/1765858474663_4ec44b01cf9f4b63baf8f9e8e44db7ad.svg"
                                collapseIcon="/assets/user/jasonzcmu/1765858474681_b758b0b6b8ce4ecd9767e6ba959a14db.svg"
                                v-if="$utils['HasValue']({ type: 'nasl.collection.List<app.structures.LcapDataMetaColunmRule>', value: ((current || {}).item || {}).showPropertyNameList })"
                                style="--cw-style-color: #8d90a0; color: #8d90a0"
                              ></u-table-view-expander>
                            </template>
                            <template
                              #title

                            ></template>
                            <template
                              #cell=""

                            ></template>
                            <template
                              #expand-content="current"

                            >
                              <u-table-view
                                :ref="`table_view_2_${(current || {}).__nodeKey || (current || {}).index}`"
                                :pagination="false"
                                :pageSize="20"
                                :pageNumber="1"
                                :initialLoad="true"
                                :showHead="false"
                                :dataSource="((current || {}).item || {}).showPropertyNameList"
                                sorting="{ field: undefined, order: 'asc' }"
                                valueField=""
                                key="table_view_2"
                                style="--custom-start: auto; --table-view-td-background-color: #f5f6fa"
                              >
                                <u-table-view-column
                                  :ref="`table_view_column_6_${(current || {}).__nodeKey || (current || {}).index}`"
                                  :key="`table_view_column_6_${(current || {}).__nodeKey || (current || {}).index}`"
                                  field=""
                                >
                                  <template
                                    #expander="current1"

                                  >
                                    <u-table-view-expander :ref="`table_view_expander_6_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"></u-table-view-expander>
                                  </template>
                                  <template
                                    #title

                                  >
                                    <u-text
                                      :ref="`text_286_${(current || {}).__nodeKey || (current || {}).index}`"
                                      text="表格列"
                                    ></u-text>
                                  </template>
                                  <template
                                    #cell="current1"

                                  >
                                    <u-text
                                      :ref="`text_287_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                      :text="$utils['ToString']('nasl.core.String', ((current1 || {}).item || {}).showPropertyNameSecond)"
                                    ></u-text>
                                  </template>
                                </u-table-view-column>
                                <u-table-view-column
                                  :ref="`table_view_column_9_${(current || {}).__nodeKey || (current || {}).index}`"
                                  :key="`table_view_column_9_${(current || {}).__nodeKey || (current || {}).index}`"
                                >
                                  <template
                                    #expander="current1"

                                  >
                                    <u-table-view-expander :ref="`table_view_expander_9_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"></u-table-view-expander>
                                  </template>
                                  <template
                                    #title

                                  >
                                    <u-text
                                      :ref="`text_293_${(current || {}).__nodeKey || (current || {}).index}`"
                                      text="表格列"
                                    ></u-text>
                                  </template>
                                  <template
                                    #cell="current1"

                                  >
                                    <u-text
                                      :ref="`text_295_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                      :text="$utils['ToString']('nasl.core.String', ((current1 || {}).item || {}).propertyTitle)"
                                    ></u-text>
                                  </template>
                                </u-table-view-column>
                                <u-table-view-column
                                  :ref="`table_view_column_10_${(current || {}).__nodeKey || (current || {}).index}`"
                                  :key="`table_view_column_10_${(current || {}).__nodeKey || (current || {}).index}`"
                                >
                                  <template
                                    #expander="current1"

                                  >
                                    <u-table-view-expander :ref="`table_view_expander_10_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"></u-table-view-expander>
                                  </template>
                                  <template
                                    #title

                                  >
                                    <u-text
                                      :ref="`text_294_${(current || {}).__nodeKey || (current || {}).index}`"
                                      text="表格列"
                                    ></u-text>
                                  </template>
                                  <template
                                    #cell="current1"

                                  >
                                    <u-radios
                                      :ref="`radios_3_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                      :value.sync="current1.item.columnRule.columnRuleType"
                                      valueField=""
                                      :disabled="((current1 || {}).item || {}).isCheck"
                                      v-tooltip="genviewMatchExpression_0d1xtqo0(current1, current)"
                                      @select="radios_3_select($event, current1, current)"
                                      style="--radio-space-x: 30px"
                                    >
                                      <template
                                        #item=""

                                      ></template>
                                      <u-radio
                                        :ref="`radio_9_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                        label="none"
                                      >
                                        <template
                                          #item

                                        >
                                          <u-text
                                            :ref="`text_259_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                            text="无权限"
                                          ></u-text>
                                        </template>
                                      </u-radio>
                                      <u-radio
                                        :ref="`radio_10_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                        label="read"
                                      >
                                        <template
                                          #item

                                        >
                                          <u-text
                                            :ref="`text_260_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                            text="仅查看"
                                          ></u-text>
                                        </template>
                                      </u-radio>
                                      <u-radio
                                        :ref="`radio_11_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                        :key="`radio_11_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                        label="readWrite"
                                        v-if="selectDataTypeName == `entity`"
                                      >
                                        <template
                                          #item

                                        >
                                          <u-text
                                            :ref="`text_261_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                            text="查看并修改"
                                          ></u-text>
                                        </template>
                                      </u-radio>
                                    </u-radios>
                                  </template>
                                </u-table-view-column>
                              </u-table-view>
                            </template>
                          </u-table-view-column>
                          <u-table-view-column
                            ref="table_view_column_7"
                            key="table_view_column_7"
                            type="normal"
                          >
                            <template
                              #expander="current"

                            >
                              <u-table-view-expander :ref="`table_view_expander_7_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                            </template>
                            <template
                              #title

                            >
                              <u-text
                                ref="text_289"
                                text="属性名称"
                              ></u-text>
                            </template>
                            <template
                              #cell="current"

                            >
                              <u-text
                                :ref="`text_290_${(current || {}).__nodeKey || (current || {}).index}`"
                                :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).showPropertyName)"
                              ></u-text>
                            </template>
                            <template
                              #expand-content="current"

                            >
                              <u-table-view
                                :ref="`table_view_3_${(current || {}).__nodeKey || (current || {}).index}`"
                                :pagination="false"
                                :pageSize="20"
                                :pageNumber="1"
                                :initialLoad="true"
                                :showHead="false"
                                :dataSource="((current || {}).item || {}).showPropertyNameList"
                                sorting="{ field: undefined, order: 'asc' }"
                                valueField=""
                                key="table_view_3"
                              >
                                <u-table-view-column
                                  :ref="`table_view_column_8_${(current || {}).__nodeKey || (current || {}).index}`"
                                  :key="`table_view_column_8_${(current || {}).__nodeKey || (current || {}).index}`"
                                  field=""
                                >
                                  <template
                                    #expander="current1"

                                  >
                                    <u-table-view-expander :ref="`table_view_expander_8_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"></u-table-view-expander>
                                  </template>
                                  <template
                                    #title

                                  >
                                    <u-text
                                      :ref="`text_291_${(current || {}).__nodeKey || (current || {}).index}`"
                                      text="表格列"
                                    ></u-text>
                                  </template>
                                  <template
                                    #cell="current1"

                                  >
                                    <u-text
                                      :ref="`text_292_${(current || {}).__nodeKey || (current || {}).index}_${(current1 || {}).__nodeKey || (current1 || {}).index}`"
                                      :text="$utils['ToString']('app.structures.LcapDataMetaColunmRule', (current1 || {}).item)"
                                    ></u-text>
                                  </template>
                                </u-table-view-column>
                              </u-table-view>
                            </template>
                          </u-table-view-column>
                          <u-table-view-column
                            ref="table_view_column_4"
                            key="table_view_column_4"
                          >
                            <template
                              #expander="current"

                            >
                              <u-table-view-expander :ref="`table_view_expander_4_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                            </template>
                            <template
                              #title

                            >
                              <u-text
                                ref="text_252"
                                text="属性标题"
                              ></u-text>
                            </template>
                            <template
                              #cell="current"

                            >
                              <u-text
                                :ref="`text_255_${(current || {}).__nodeKey || (current || {}).index}`"
                                :text="$utils['ToString']('nasl.core.String', ((current || {}).item || {}).propertyTitle)"
                              ></u-text>
                            </template>
                          </u-table-view-column>
                          <u-table-view-column
                            ref="table_view_column_5"
                            key="table_view_column_5"
                            width="35%"
                          >
                            <template
                              #expander="current"

                            >
                              <u-table-view-expander :ref="`table_view_expander_5_${(current || {}).__nodeKey || (current || {}).index}`"></u-table-view-expander>
                            </template>
                            <template
                              #title

                            >
                              <u-text
                                ref="text_253"
                                text="权限"
                              ></u-text>
                            </template>
                            <template
                              #cell="current"

                            >
                              <u-radios
                                :ref="`radios_2_${(current || {}).__nodeKey || (current || {}).index}`"
                                :value.sync="current.item.columnRule.columnRuleType"
                                valueField=""
                                :disabled="((current || {}).item || {}).isCheck"
                                v-tooltip="genviewMatchExpression_1neg2xq1(current)"
                                @select="radios_2_select($event, current)"
                              >
                                <template
                                  #item=""

                                ></template>
                                <u-radio
                                  :ref="`radio_4_${(current || {}).__nodeKey || (current || {}).index}`"
                                  label="none"
                                >
                                  <template
                                    #item

                                  >
                                    <u-text
                                      :ref="`text_256_${(current || {}).__nodeKey || (current || {}).index}`"
                                      text="无权限"
                                    ></u-text>
                                  </template>
                                </u-radio>
                                <u-radio
                                  :ref="`radio_5_${(current || {}).__nodeKey || (current || {}).index}`"
                                  label="read"
                                >
                                  <template
                                    #item

                                  >
                                    <u-text
                                      :ref="`text_257_${(current || {}).__nodeKey || (current || {}).index}`"
                                      text="仅查看"
                                    ></u-text>
                                  </template>
                                </u-radio>
                                <u-radio
                                  :ref="`radio_6_${(current || {}).__nodeKey || (current || {}).index}`"
                                  :key="`radio_6_${(current || {}).__nodeKey || (current || {}).index}`"
                                  label="readWrite"
                                  v-if="selectDataTypeName == `entity`"
                                >
                                  <template
                                    #item

                                  >
                                    <u-text
                                      :ref="`text_258_${(current || {}).__nodeKey || (current || {}).index}`"
                                      text="查看并修改"
                                    ></u-text>
                                  </template>
                                </u-radio>
                              </u-radios>
                            </template>
                          </u-table-view-column>
                        </u-table-view>
                      </u-linear-layout>
                    </u-linear-layout>
                  </u-grid-layout-column>
                </u-grid-layout-row>
              </u-grid-layout>
            </u-tab>
          </u-tabs>
        </u-panel>
      </u-linear-layout>
    </u-linear-layout>
    <u-modal
      ref="saveModal"
      :showHead="true"
      :showFoot="true"
    >
      <template
        #foot

      >
        <u-linear-layout ref="uLinearLayout3">
          <u-button
            ref="uButton2"
            text="添 加"
            color="primary"
            @click="uButton2_click($event)"
          ></u-button>
          <u-button
            ref="button_5"
            text="取 消"
            @click="button_5_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-form
          ref="form2"
          key="form2"
        >
          <u-form-item ref="uFormItem2">
            <u-select
              ref="uSelect1"
              placeholder="请选择用户名，支持搜索"
              :dataSource="getRoleAddUser"
              :filterable="true"
              :value.sync="waitAddRoleUserIdList"
              :multiple="true"
              :remoteFiltering="true"
              valueField="lcapUser.userId"
              :pageable="true"
              textField="lcapUser.userName"
              :remotePaging="false"
              :clearable="true"
              :showRenderFooter="false"
              :pagination="true"
              :pageSize="10"
              v-dependencies.reload="[]"
              key="uSelect1"
            ></u-select>
            <template
              #label

            >
              <u-text
                ref="text7"
                text="用户名"
              ></u-text>
            </template>
          </u-form-item>
        </u-form>
      </template>
      <template
        #title

      >
        <div ref="div2">
          <u-text
            ref="uText1"
            text="请添加用户 "
          ></u-text>
        </div>
      </template>
    </u-modal>
    <u-modal
      ref="deleteUserRole"
      size="normal"
      icon="warning"
    >
      <template
        #foot

      >
        <u-linear-layout ref="uLinearLayout13">
          <u-button
            ref="uButton11"
            color="primary"
            text="确 定"
            @click="uButton11_click($event)"
          ></u-button>
          <u-button
            ref="uButton12"
            text="取 消"
            @click="uButton12_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-linear-layout
          ref="uLinearLayout15"
          direction="vertical"
        >
          <u-text
            ref="uText9"
            :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `移除后，该用户将失去`) + $utils['ToString']('nasl.core.String', (selectRole || {}).name) + $utils['ToString']('nasl.core.String', `对应的权限、资源关联关系！`))"
          ></u-text>
        </u-linear-layout>
        <u-linear-layout
          ref="uLinearLayout16"
          direction="vertical"
        >
          <u-text
            ref="uText10"
            text="确定移除成员："
          ></u-text>
          <u-text
            ref="uText11"
            :text="$utils['ToString']('nasl.core.String', ((deleteUserRole || {}).lcapUserRoleMapping || {}).userName)"
          ></u-text>
          <u-text
            ref="uText12"
            text="？"
          ></u-text>
        </u-linear-layout>
      </template>
      <template
        #title

      >
        <u-text
          ref="text13"
          text="移除成员"
        ></u-text>
      </template>
    </u-modal>
    <u-modal
      ref="removeResourcePopup"
      icon="warning"
    >
      <template
        #foot

      >
        <u-linear-layout ref="uLinearLayout2">
          <u-button
            ref="uButton8"
            text="确 定"
            color="primary"
            @click="uButton8_click($event)"
          ></u-button>
          <u-button
            ref="uButton13"
            text="取 消"
            @click="uButton13_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-linear-layout
          ref="linear_layout_283"
          direction="horizontal"
        >
          <u-text
            ref="uText15"
            :text="$utils['ToString']('nasl.core.String', (removePermission || {}).name)"
          ></u-text>
        </u-linear-layout>
      </template>
      <template
        #title

      >
        <u-text
          ref="uText13"
          text="确定移除下面权限？"
        ></u-text>
      </template>
    </u-modal>
    <u-modal
      ref="selectResourcePopup"
      size="huge"
    >
      <template
        #foot

      >
        <u-linear-layout ref="uLinearLayout19">
          <u-button
            ref="uButton14"
            color="primary"
            text="确 定"
            @click="uButton14_click($event)"
          ></u-button>
          <u-button
            ref="uButton15"
            text="取 消"
            @click="uButton15_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-linear-layout
          ref="uLinearLayout20"
          direction="vertical"
        >
          <u-table-view
            ref="tableView3"
            :values="alreadySelectedPermissionIdList"
            valueField="lcapPermission.id"
            :pagination="true"
            :showSizer="true"
            :dataSource="getRoleAddPermission"
            :pageSize="10"
            key="tableView3"
          >
            <u-table-view-column
              ref="uTableViewColumn11"
              key="uTableViewColumn11"
              type="checkbox"
              :width="100"
            >
              <template
                #title

              ></template>
            </u-table-view-column>
            <u-table-view-column
              ref="uTableViewColumn12"
              key="uTableViewColumn12"
            >
              <template
                #cell="current"

              >
                <u-linear-layout
                  :ref="`uLinearLayout24_${(current || {}).__nodeKey || (current || {}).index}`"
                  gap="small"
                >
                  <u-text
                    :ref="`uText18_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).lcapPermission || {}).name)"
                  ></u-text>
                </u-linear-layout>
              </template>
              <template
                #title

              >
                <u-text
                  ref="text17"
                  text="权限名称"
                ></u-text>
              </template>
            </u-table-view-column>
            <u-table-view-column
              ref="uTableViewColumn13"
              key="uTableViewColumn13"
            >
              <template
                #cell="current"

              >
                <u-linear-layout
                  :ref="`uLinearLayout25_${(current || {}).__nodeKey || (current || {}).index}`"
                  gap="small"
                >
                  <u-text
                    :ref="`uText19_${(current || {}).__nodeKey || (current || {}).index}`"
                    :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).lcapPermission || {}).description)"
                  ></u-text>
                </u-linear-layout>
              </template>
              <template
                #title

              >
                <u-text
                  ref="text18"
                  text="权限描述"
                ></u-text>
              </template>
            </u-table-view-column>
          </u-table-view>
        </u-linear-layout>
      </template>
      <template
        #title

      >
        <u-text
          ref="uText14"
          text="请勾选需要关联的权限"
        ></u-text>
      </template>
    </u-modal>
    <u-modal ref="createORUpdateRolePopup">
      <template
        #foot

      >
        <u-linear-layout ref="uLinearLayout6">
          <u-button
            ref="uButton6"
            key="uButton6"
            text="立即创建"
            color="primary"
            @click="uButton6_click($event)"
            v-if="!isUpdateRole"
          ></u-button>
          <u-button
            ref="uButton4"
            key="uButton4"
            color="primary"
            text="提交修改 "
            @click="uButton4_click($event)"
            v-if="isUpdateRole"
          ></u-button>
          <u-button
            ref="uButton7"
            text="取 消"
            @click="uButton7_click($event)"
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
            key="form1"
          >
            <u-form-item
              ref="uFormItem5"
              :required="true"
              :rules="[
                                { validate: 'filled', message: `角色名称不得为空`, trigger: 'input+blur', required: true },
                                { validate: 'excluded', args: [roleNameList], message: `该角色名称已存在`, trigger: 'input+blur' },
                                { validate: 'maxLength', args: [50], message: `不得超过${50}个字符`, trigger: 'input+blur' },
                            ]"
            >
              <u-input
                ref="uInput4"
                placeholder="请输入角色名称"
                :value.sync="inputRole.name"
                :clearable="true"
                :maxlength="50"
                @blur="uInput4_blur($event)"
              ></u-input>
              <template
                #label

              >
                <u-text
                  ref="text10"
                  text="角色名称"
                ></u-text>
              </template>
            </u-form-item>
            <u-form-item
              ref="uFormItem6"
              :rules="[{ validate: 'maxLength', args: [150], message: `不得超过${150}个字符`, trigger: 'input+blur' }]"
            >
              <u-input
                ref="uInput5"
                :value.sync="inputRole.description"
                placeholder="请输入角色描述"
                :clearable="true"
                :maxlength="150"
              ></u-input>
              <template
                #label

              >
                <u-text
                  ref="text11"
                  text="角色描述"
                ></u-text>
              </template>
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
          text="创建角色"
          v-if="!isUpdateRole"
        ></u-text>
        <u-text
          ref="text_2"
          key="text_2"
          text="修改角色"
          v-if="isUpdateRole"
        ></u-text>
      </template>
    </u-modal>
    <u-modal
      ref="deleteRolePopup"
      size="normal"
      icon="warning"
    >
      <template
        #foot

      >
        <u-linear-layout ref="uLinearLayout8">
          <u-button
            ref="uButton9"
            color="primary"
            text="确 定"
            @click="uButton9_click($event)"
          ></u-button>
          <u-button
            ref="uButton10"
            text="取 消"
            @click="uButton10_click($event)"
          ></u-button>
        </u-linear-layout>
      </template>
      <template
        #body

      >
        <u-linear-layout
          ref="uLinearLayout9"
          direction="vertical"
        >
          <u-text
            ref="uText4"
            text="删除后，该角色对应的成员、权限、资源关联关系都会被删除！"
          ></u-text>
        </u-linear-layout>
        <u-linear-layout
          ref="uLinearLayout10"
          direction="vertical"
        >
          <u-text
            ref="uText5"
            text="确定删除角色： "
          ></u-text>
          <u-text
            ref="uText6"
            :text="$utils['ToString']('nasl.core.String', (deleteRoleBody || {}).name)"
          ></u-text>
          <u-text
            ref="uText7"
            text="？"
          ></u-text>
        </u-linear-layout>
      </template>
      <template
        #title

      >
        <u-text
          ref="text12"
          text="删除角色"
        ></u-text>
      </template>
    </u-modal>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/roleManagement',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      filterRole: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', undefined),
      inputRole: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', undefined),
      deleteRoleBody: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', undefined),
      updateRoleName: undefined,
      isUpdateRole: undefined,
      selectRole: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', undefined),
      filterUser: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUserRoleMapping', undefined),
      alreadyAddRoleUserIdList: window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined),
      deleteUserRole: window.$genInitFromSchema('{lcapRole: app.dataSources.defaultDS.entities.LcapRole, lcapUserRoleMapping: app.dataSources.defaultDS.entities.LcapUserRoleMapping}', undefined),
      waitAddRoleUserIdList: window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined),
      alreadyAddPermissionIdList: window.$genInitFromSchema('nasl.collection.List<nasl.core.Long>', undefined),
      removePermission: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', undefined),
      alreadySelectedPermissionIdList: window.$genInitFromSchema('nasl.collection.List<nasl.core.Long>', undefined),
      selectRoleId: undefined,
      selectDataTypeName: undefined,
      searchDataMetaName: undefined,
      selectDataMeta: window.$genInitFromSchema('app.structures.LcapDataMetaStructure', undefined),
      saveEnabled: true,
      isSearch: false,
      dataPermission: window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDataPermission', undefined),
      updateColumnRuleList: window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', undefined),
      customRowRuleList: window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaRowRule>', undefined),
      comparisonList: window.$genInitFromSchema('nasl.collection.List<app.structures.LcapComparisonResult>', undefined),
      customColunmRuleList: window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaColunmRule>', undefined),
      isRoleSelect: false,
      relationStr: undefined,
      roleNameList: window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined),
      adminName: undefined,
      loading: false,
      tableView_state_page: undefined,
      tableView_state_size: undefined,
      tableView_state_sort: undefined,
      tableView_state_order: undefined,
    };
  },
  meta: {
    title: '角色管理',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async getRoleNameList() {
      this.roleNameList = window.$genInitFromSchema(
        'nasl.collection.List<nasl.core.String>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetRoleNameList',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },
          data: {
            roleName: (this.inputRole || {}).name,
          },
        }),
      );
      if (this.isUpdateRole) {
        window.$utils.Remove(this.roleNameList, this.updateRoleName);
      }
    },

    async loadUserRoleByUserId(params) {
      params = window.$genInitFromSchema('nasl.ui.DataSourceParams', params);
      let result = window.$genInitFromSchema('{list: nasl.collection.List<{lcapRole: app.dataSources.defaultDS.entities.LcapRole, lcapUserRoleMapping: app.dataSources.defaultDS.entities.LcapUserRoleMapping}>, total: nasl.core.Long}', undefined);
      this.filterUser.roleId = (this.selectRole || {}).id;
      result = window.$genInitFromSchema(
        '{list: nasl.collection.List<{lcapRole: app.dataSources.defaultDS.entities.LcapRole, lcapUserRoleMapping: app.dataSources.defaultDS.entities.LcapUserRoleMapping}>, total: nasl.core.Long}',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapLoadUserRoleMappingTableView',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },
          data: {
            page: (params || {}).page,
            size: (params || {}).size,
            sort: (params || {}).sort,
            order: (params || {}).order,
            filter: this.filterUser,
          },
        }),
      );
      this.alreadyAddRoleUserIdList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListTransformAsync((result || {}).list, (item) => ((item || {}).lcapUserRoleMapping || {}).userId));
      return result;
    },

    async getRoleAddUser() {
      let result = window.$genInitFromSchema('nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser}>', undefined);
      result = window.$genInitFromSchema(
        'nasl.collection.List<{lcapUser: app.dataSources.defaultDS.entities.LcapUser}>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapLoadAddRoleUserTableView',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },
          data: {
            userIds: this.alreadyAddRoleUserIdList,
            roleId: (this.selectRole || {}).id,
          },
        }),
      );
      window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.ListDistinct(this.waitAddRoleUserIdList));
      return result;
    },

    async loadPermissionByRoleId(param) {
      param = window.$genInitFromSchema('nasl.ui.DataSourceParams', param);
      let result = window.$genInitFromSchema('{list: nasl.collection.List<app.dataSources.defaultDS.entities.LcapPermission>, total: nasl.core.Long}', undefined);
      result = window.$genInitFromSchema(
        '{list: nasl.collection.List<app.dataSources.defaultDS.entities.LcapPermission>, total: nasl.core.Long}',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetPermissionByRoleId',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },
          data: {
            roleId: (this.selectRole || {}).id,
            page: (param || {}).page,
            size: (param || {}).size,
          },
        }),
      );
      if (window.$utils.HasValue({ type: 'nasl.collection.List<app.dataSources.defaultDS.entities.LcapPermission>', value: (result || {}).list })) {
        this.alreadyAddPermissionIdList = window.$genInitFromSchema('nasl.collection.List<nasl.core.Long>', await window.$utils.ListTransformAsync((result || {}).list, (item) => (item || {}).id));
      } else {
        this.alreadyAddPermissionIdList = window.$genInitFromSchema('nasl.collection.List<nasl.core.Long>', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'generic', typeNamespace: 'nasl.collection', typeName: 'List', changedTime: 1720495661409, typeArguments: [{ concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Long', name: 'T' }] }));
      }
      return result;
    },

    async getRoleAddPermission(params) {
      params = window.$genInitFromSchema('nasl.ui.DataSourceParams', params);
      let result = window.$genInitFromSchema('{list: nasl.collection.List<{lcapPermission: app.dataSources.defaultDS.entities.LcapPermission}>, total: nasl.core.Long}', undefined);
      result = window.$genInitFromSchema(
        '{list: nasl.collection.List<{lcapPermission: app.dataSources.defaultDS.entities.LcapPermission}>, total: nasl.core.Long}',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapLoadAddRolePermissionTableView',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },
          data: {
            page: (params || {}).page,
            size: (params || {}).size,
            sort: (params || {}).sort,
            order: (params || {}).order,
            permissionIdList: this.alreadyAddPermissionIdList,
            roleId: (this.selectRole || {}).id,
          },
        }),
      );
      return result;
    },

    async loadDataMeta() {
      let result = window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaStructure>', undefined);
      result = window.$genInitFromSchema(
        'nasl.collection.List<app.structures.LcapDataMetaStructure>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapLoadDataMetaManagement',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/1',
          },
          data: {
            dataType: this.selectDataTypeName,
            search: this.searchDataMetaName,
            isLogicAll: false,
          },
        }),
      );
      if (window.$utils.HasValue({ type: 'nasl.collection.List<app.structures.LcapDataMetaStructure>', value: result })) {
        if (this.isSearch) { /* empty */ } else if (this.isRoleSelect) {
          this.isRoleSelect = false;
        } else {
          this.selectDataMeta.id = (window.$genInitFromSchema('app.structures.LcapDataMetaStructure', window.$utils.ListHead(result)) || {}).id;
        }
      }
      return result;
    },

    async loadDataMetaColunmRule() {
      let entityMeta = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapEntityMeta', undefined);
      let logicMeta = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapLogicMeta', undefined);
      const dataMetaProperty = window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', undefined);
      let columnRuleList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', undefined);
      let nameList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      let logicResult = window.$genInitFromSchema('nasl.collection.Map<nasl.core.String, nasl.collection.List<app.structures.LcapDataMetaColunmRule>>', undefined);
      let logicNameList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      let mapList = window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaColunmRule>', undefined);
      let head = window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', undefined);
      const filterList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      let searchList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      let propertyNameList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      const result = window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaColunmRule>', undefined);
      window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', window.$utils.Clear(this.updateColumnRuleList, 'shallow', 'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>'));
      window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaRowRule>', window.$utils.Clear(this.customRowRuleList, 'shallow', 'nasl.collection.List<app.structures.LcapDataMetaRowRule>'));
      window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaColunmRule>', window.$utils.Clear(this.customColunmRuleList, 'shallow', 'nasl.collection.List<app.structures.LcapDataMetaColunmRule>'));
      this.saveEnabled = true;
      if (this.selectDataTypeName == 'entity') {
        entityMeta = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LcapEntityMeta',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetEntityMetaById',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
            },
            data: {
              id: (this.selectDataMeta || {}).id,
            },
          }),
        );
        this.dataPermission = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LcapDataPermission',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetDataPermissionByResourceName',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
            },
            data: {
              resourceName: (entityMeta || {}).entityName,
              resourceType: this.selectDataTypeName,
              roleId: this.selectRoleId,
            },
          }),
        );
        nameList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Split((entityMeta || {}).entityName, '.', true));
        if ((nameList || {}).length >= 2) {
          this.selectDataMeta.defaultDataSource = window.$utils.Get(nameList, 0);
          this.selectDataMeta.showDataName = window.$utils.Get(nameList, 1);
        } else {
          this.selectDataMeta.defaultDataSource = (entityMeta || {}).entityName;
          this.selectDataMeta.showDataName = (entityMeta || {}).entityName;
        }

        this.selectDataMeta.dataDescription = (entityMeta || {}).entityDescription;
        this.selectDataMeta.entityProperties = (entityMeta || {}).properties;
        this.selectDataMeta.id = (entityMeta || {}).id;
        this.selectDataMeta.logicProperties = window.$genInitFromSchema('nasl.collection.List<extensions.lcap_annotation_data_permission.structures.LogicPropertyStructure>', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'generic', typeNamespace: 'nasl.collection', typeName: 'List', changedTime: 1712734282934, typeArguments: [{ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'extensions.lcap_annotation_data_permission.structures', typeName: 'LogicPropertyStructure', name: 'T' }], returnType: null, properties: null }));
        this.selectDataMeta.relation = (this.dataPermission || {}).relation;
        this.selectDataMeta.rowRuleType = (this.dataPermission || {}).rowRuleType;
        this.selectDataMeta.dataName = (entityMeta || {}).entityName;

        columnRuleList = window.$genInitFromSchema(
          'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetColumnRuleByDataPermissionId',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
            },
            data: {
              dataPermissionId: (this.dataPermission || {}).id,
            },
          }),
        );
        const $forEachListVariable15jkgna0 = (entityMeta || {}).properties;
        const $forEachStartVariable15jkgna0 = 0;
        const $forEachEndVariable15jkgna0 = ($forEachListVariable15jkgna0 || {}).length;
        if (Array.isArray($forEachListVariable15jkgna0)) {
          for (let index = $forEachStartVariable15jkgna0; index < $forEachEndVariable15jkgna0; index++) {
            const item = $forEachListVariable15jkgna0[index];
            window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', window.$utils.Clear(dataMetaProperty, 'shallow', 'app.structures.LcapDataMetaColunmRule'));
            window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Clear(nameList, 'shallow', 'nasl.collection.List<nasl.core.String>'));
            const $forEachListVariable0q84poa0 = columnRuleList;
            const $forEachStartVariable0q84poa0 = 0;
            const $forEachEndVariable0q84poa0 = ($forEachListVariable0q84poa0 || {}).length;
            if (Array.isArray($forEachListVariable0q84poa0)) {
              for (let index1 = $forEachStartVariable0q84poa0; index1 < $forEachEndVariable0q84poa0; index1++) {
                const item1 = $forEachListVariable0q84poa0[index1];
                if ((item || {}).propertyName == (item1 || {}).propertyName) {
                  dataMetaProperty.propertyPermission = (item1 || {}).columnRuleType;
                  dataMetaProperty.columnRule = item1;
                }
              }
            }
            dataMetaProperty.propertyName = (item || {}).propertyName;
            dataMetaProperty.propertyTitle = (item || {}).propertyTitle;
            dataMetaProperty.propertyTitlePath = (item || {}).columnName;
            dataMetaProperty.propertyType = (item || {}).propertyType;
            dataMetaProperty.propertyOptions = (item || {}).propertyOptions;
            nameList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Split((item || {}).propertyName, '.', true));
            if ((nameList || {}).length >= 2) {
              dataMetaProperty.showPropertyName = window.$utils.Get(nameList, 0);
              dataMetaProperty.showPropertyNameSecond = window.$utils.Get(nameList, 1);
              if ((dataMetaProperty || {}).showPropertyNameSecond == 'id' || (dataMetaProperty || {}).showPropertyNameSecond == 'createdTime' || (dataMetaProperty || {}).showPropertyNameSecond == 'updatedTime' || (dataMetaProperty || {}).showPropertyNameSecond == 'createdBy' || (dataMetaProperty || {}).showPropertyNameSecond == 'updatedBy') {
                dataMetaProperty.isCheck = true;
              } else {
                dataMetaProperty.isCheck = false;
              }
            } else {
              dataMetaProperty.showPropertyName = (item || {}).propertyName;
              dataMetaProperty.showPropertyNameSecond = undefined;
              if ((dataMetaProperty || {}).showPropertyName == 'id' || (dataMetaProperty || {}).showPropertyName == 'createdTime' || (dataMetaProperty || {}).showPropertyName == 'updatedTime' || (dataMetaProperty || {}).showPropertyName == 'createdBy' || (dataMetaProperty || {}).showPropertyName == 'updatedBy') {
                dataMetaProperty.isCheck = true;
              } else {
                dataMetaProperty.isCheck = false;
              }
            }
            if (window.$utils.HasValue({ type: 'nasl.core.Long', value: ((dataMetaProperty || {}).columnRule || {}).id })) { /* empty */ } else {
              dataMetaProperty.columnRule = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapColumnRule', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapColumnRule', changedTime: 1758527448438 }));
              dataMetaProperty.columnRule.dataPermissionId = (this.dataPermission || {}).id;
              dataMetaProperty.columnRule.propertyName = (item || {}).propertyName;
              dataMetaProperty.columnRule.columnRuleType = dataMetaProperty.propertyPermission = 'readWrite';
            }
            window.$utils.Add(result, window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', window.$utils.Clone(dataMetaProperty)));
          }
        }

        if (window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_annotation_data_permission.structures.EntityPropertyStructure>', value: (entityMeta || {}).properties })) {
          propertyNameList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListTransformAsync((entityMeta || {}).properties, (item) => (item || {}).propertyName));
          if (!window.$utils.Contains(propertyNameList, 'createdBy')) {
            this.selectDataMeta.hasCreatedBy = true;
          } else {
            this.selectDataMeta.hasCreatedBy = false;
          }
        }
      } else {
        logicMeta = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LcapLogicMeta',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetLogicMetaById',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
            },
            data: {
              id: (this.selectDataMeta || {}).id,
            },
          }),
        );
        this.dataPermission = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LcapDataPermission',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetDataPermissionByResourceName',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/1',
            },
            data: {
              resourceName: (logicMeta || {}).logicName,
              resourceType: this.selectDataTypeName,
              roleId: this.selectRoleId,
            },
          }),
        );
        nameList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Split((logicMeta || {}).logicName, '.', true));
        if ((nameList || {}).length >= 2) {
          this.selectDataMeta.defaultDataSource = window.$utils.Get(nameList, 0);
          this.selectDataMeta.showDataName = window.$utils.Get(nameList, 1);
        } else {
          this.selectDataMeta.defaultDataSource = (logicMeta || {}).logicName;
          this.selectDataMeta.showDataName = (logicMeta || {}).logicName;
        }

        this.selectDataMeta.dataDescription = (logicMeta || {}).logicDescription;
        this.selectDataMeta.entityProperties = window.$genInitFromSchema('nasl.collection.List<extensions.lcap_annotation_data_permission.structures.EntityPropertyStructure>', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'generic', typeNamespace: 'nasl.collection', typeName: 'List', changedTime: 1712734266158, typeArguments: [{ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'extensions.lcap_annotation_data_permission.structures', typeName: 'EntityPropertyStructure', name: 'T' }], returnType: null, properties: null }));
        this.selectDataMeta.id = (logicMeta || {}).id;
        this.selectDataMeta.logicProperties = (logicMeta || {}).properties;
        this.selectDataMeta.relation = (this.dataPermission || {}).relation;
        this.selectDataMeta.rowRuleType = (this.dataPermission || {}).rowRuleType;
        this.selectDataMeta.dataName = (logicMeta || {}).logicName;

        columnRuleList = window.$genInitFromSchema(
          'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetColumnRuleByDataPermissionId',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/1',
            },
            data: {
              dataPermissionId: (this.dataPermission || {}).id,
            },
          }),
        );
        this.selectDataMeta.hasCreatedBy = true;
        const $forEachListVariable14pmc920 = (logicMeta || {}).properties;
        const $forEachStartVariable14pmc920 = 0;
        const $forEachEndVariable14pmc920 = ($forEachListVariable14pmc920 || {}).length;
        if (Array.isArray($forEachListVariable14pmc920)) {
          for (let index = $forEachStartVariable14pmc920; index < $forEachEndVariable14pmc920; index++) {
            const item = $forEachListVariable14pmc920[index];
            window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', window.$utils.Clear(dataMetaProperty, 'shallow', 'app.structures.LcapDataMetaColunmRule'));
            window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Clear(nameList, 'shallow', 'nasl.collection.List<nasl.core.String>'));
            const $forEachListVariable0pt86h50 = columnRuleList;
            const $forEachStartVariable0pt86h50 = 0;
            const $forEachEndVariable0pt86h50 = ($forEachListVariable0pt86h50 || {}).length;
            if (Array.isArray($forEachListVariable0pt86h50)) {
              for (let index1 = $forEachStartVariable0pt86h50; index1 < $forEachEndVariable0pt86h50; index1++) {
                const item1 = $forEachListVariable0pt86h50[index1];
                if ((item || {}).propertyName == (item1 || {}).propertyName) {
                  dataMetaProperty.propertyPermission = (item1 || {}).columnRuleType;
                  dataMetaProperty.columnRule = item1;
                }
              }
            }
            dataMetaProperty.propertyName = (item || {}).propertyName;
            dataMetaProperty.propertyTitle = (item || {}).propertyTitle;
            dataMetaProperty.propertyTitlePath = (item || {}).propertyTitlePath;
            dataMetaProperty.propertyType = (item || {}).propertyType;
            dataMetaProperty.propertyOptions = (item || {}).propertyOptions;
            nameList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Split((item || {}).propertyName, '.', true));
            if ((nameList || {}).length >= 2) {
              dataMetaProperty.showPropertyName = window.$utils.Get(nameList, 0);
              dataMetaProperty.showPropertyNameSecond = window.$utils.Get(nameList, 1);
              if ((dataMetaProperty || {}).showPropertyNameSecond == 'id' || (dataMetaProperty || {}).showPropertyNameSecond == 'createdTime' || (dataMetaProperty || {}).showPropertyNameSecond == 'updatedTime' || (dataMetaProperty || {}).showPropertyNameSecond == 'createdBy' || (dataMetaProperty || {}).showPropertyNameSecond == 'updatedBy') {
                dataMetaProperty.isCheck = true;
              } else {
                dataMetaProperty.isCheck = false;
              }

              if ((dataMetaProperty || {}).showPropertyNameSecond == 'createdBy') {
                this.selectDataMeta.hasCreatedBy = false;
              }
            } else {
              dataMetaProperty.showPropertyName = (item || {}).propertyName;
              dataMetaProperty.showPropertyNameSecond = undefined;
              if ((dataMetaProperty || {}).showPropertyName == 'id' || (dataMetaProperty || {}).showPropertyName == 'createdTime' || (dataMetaProperty || {}).showPropertyName == 'updatedTime' || (dataMetaProperty || {}).showPropertyName == 'createdBy' || (dataMetaProperty || {}).showPropertyName == 'updatedBy') {
                dataMetaProperty.isCheck = true;
              } else {
                dataMetaProperty.isCheck = false;
              }

              if ((dataMetaProperty || {}).showPropertyName == 'createdBy') {
                this.selectDataMeta.hasCreatedBy = false;
              }
            }
            if (window.$utils.HasValue({ type: 'nasl.core.Long', value: ((dataMetaProperty || {}).columnRule || {}).id })) { /* empty */ } else {
              dataMetaProperty.columnRule = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapColumnRule', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapColumnRule', changedTime: 1758527448447 }));
              dataMetaProperty.columnRule.dataPermissionId = (this.dataPermission || {}).id;
              dataMetaProperty.columnRule.propertyName = (item || {}).propertyName;
              dataMetaProperty.columnRule.columnRuleType = dataMetaProperty.propertyPermission = 'read';
            }
            window.$utils.Add(result, window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', window.$utils.Clone(dataMetaProperty)));
          }
        }
      }
      if ((this.selectDataMeta || {}).relation == 'or') {
        this.relationStr = '+或';
      } else if ((this.selectDataMeta || {}).relation == 'and') {
        this.relationStr = '+且';
      } else {
        this.relationStr = '+且';
        this.selectDataMeta.relation = 'and';
      }
      const $forEachListVariable0q4tp320 = result;
      const $forEachStartVariable0q4tp320 = 0;
      const $forEachEndVariable0q4tp320 = ($forEachListVariable0q4tp320 || {}).length;
      if (Array.isArray($forEachListVariable0q4tp320)) {
        for (let index = $forEachStartVariable0q4tp320; index < $forEachEndVariable0q4tp320; index++) {
          const item = $forEachListVariable0q4tp320[index];
          if ((item || {}).propertyType != 'Map' && (item || {}).propertyType != 'List' && (item || {}).propertyType != 'Entity' && (item || {}).propertyType != 'Structure' && (item || {}).propertyType != 'Others') {
            dataMetaProperty.columnRule = (item || {}).columnRule;
            dataMetaProperty.propertyName = (item || {}).propertyName;
            dataMetaProperty.propertyPermission = (item || {}).propertyPermission;
            dataMetaProperty.propertyTitle = (item || {}).propertyTitle;
            dataMetaProperty.propertyTitlePath = (item || {}).propertyTitlePath;
            dataMetaProperty.propertyType = (item || {}).propertyType;
            dataMetaProperty.propertyOptions = (item || {}).propertyOptions;

            if (window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).propertyTitle })) { /* empty */ } else {
              dataMetaProperty.propertyTitle = (item || {}).propertyName;
            }

            window.$utils.Add(this.customColunmRuleList, window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', window.$utils.Clone(dataMetaProperty)));
          }
        }
      }
      await this.loadDataMetaRowRule();
      if (this.selectDataTypeName == 'logic') {
        logicResult = window.$genInitFromSchema('nasl.collection.Map<nasl.core.String, nasl.collection.List<app.structures.LcapDataMetaColunmRule>>', await window.$utils.ListGroupByAsync(result, (item) => (item || {}).showPropertyName));
        logicNameList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.MapKeys(logicResult));
        if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: logicNameList })) {
          window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaColunmRule>', window.$utils.Clear(result, 'shallow', 'nasl.collection.List<app.structures.LcapDataMetaColunmRule>'));
          const $forEachListVariable1y80ewt0 = logicNameList;
          const $forEachStartVariable1y80ewt0 = 0;
          const $forEachEndVariable1y80ewt0 = ($forEachListVariable1y80ewt0 || {}).length;
          if (Array.isArray($forEachListVariable1y80ewt0)) {
            for (let index = $forEachStartVariable1y80ewt0; index < $forEachEndVariable1y80ewt0; index++) {
              const item = $forEachListVariable1y80ewt0[index];
              window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', window.$utils.Clear(dataMetaProperty, 'shallow', 'app.structures.LcapDataMetaColunmRule'));
              mapList = window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaColunmRule>', window.$utils.MapGet(logicResult, item));
              head = window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', window.$utils.ListHead(mapList));
              if ((mapList || {}).length == 1) {
                if (window.$utils.HasValue({ type: 'nasl.core.String', value: (head || {}).showPropertyNameSecond })) {
                  dataMetaProperty.showPropertyName = dataMetaProperty.propertyTitle = item;
                  dataMetaProperty.showPropertyNameList = mapList;
                  dataMetaProperty.columnRule = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapColumnRule', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapColumnRule', changedTime: 1758527448456 }));

                  window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Clear(filterList, 'shallow', 'nasl.collection.List<nasl.core.String>'));
                  dataMetaProperty.isCheck = true;
                  const $forEachListVariable1fr1ogh0 = mapList;
                  const $forEachStartVariable1fr1ogh0 = 0;
                  const $forEachEndVariable1fr1ogh0 = ($forEachListVariable1fr1ogh0 || {}).length;
                  if (Array.isArray($forEachListVariable1fr1ogh0)) {
                    for (let index1 = $forEachStartVariable1fr1ogh0; index1 < $forEachEndVariable1fr1ogh0; index1++) {
                      const item1 = $forEachListVariable1fr1ogh0[index1];
                      if ((item1 || {}).isCheck) { /* empty */ } else {
                        dataMetaProperty.isCheck = false;
                        window.$utils.Add(filterList, window.$utils.Clone(((item1 || {}).columnRule || {}).columnRuleType));
                      }
                    }
                  }

                  searchList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListFilterAsync(filterList, (item1) => item1 != 'none'));
                  if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: searchList })) { /* empty */ } else {
                    dataMetaProperty.propertyPermission = 'none';
                    dataMetaProperty.columnRule.columnRuleType = 'none';
                  }

                  searchList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListFilterAsync(filterList, (item1) => item1 != 'read'));
                  if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: searchList })) { /* empty */ } else {
                    dataMetaProperty.propertyPermission = 'read';
                    dataMetaProperty.columnRule.columnRuleType = 'read';
                  }

                  searchList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListFilterAsync(filterList, (item1) => item1 != 'readWrite'));
                  if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: searchList })) { /* empty */ } else {
                    dataMetaProperty.propertyPermission = 'readWrite';
                    dataMetaProperty.columnRule.columnRuleType = 'readWrite';
                  }
                } else {
                  dataMetaProperty.showPropertyNameList = window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaColunmRule>', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'generic', typeNamespace: 'nasl.collection', typeName: 'List', changedTime: 1713231634635, typeArguments: [{ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.structures', typeName: 'LcapDataMetaColunmRule', changedTime: 1753860213689, name: 'T' }] }));
                  dataMetaProperty.columnRule = (head || {}).columnRule;
                  dataMetaProperty.propertyName = (head || {}).propertyName;
                  dataMetaProperty.propertyOptions = (head || {}).propertyOptions;
                  dataMetaProperty.propertyPermission = (head || {}).propertyPermission;
                  dataMetaProperty.propertyTitle = (head || {}).propertyTitle;
                  dataMetaProperty.propertyTitlePath = (head || {}).propertyTitlePath;
                  dataMetaProperty.propertyType = (head || {}).propertyType;
                  dataMetaProperty.showPropertyName = (head || {}).showPropertyName;
                  dataMetaProperty.showPropertyNameSecond = (head || {}).showPropertyNameSecond;
                  dataMetaProperty.isCheck = (head || {}).isCheck;
                }
              } else {
                dataMetaProperty.showPropertyName = dataMetaProperty.propertyTitle = item;
                dataMetaProperty.showPropertyNameList = mapList;
                dataMetaProperty.columnRule = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapColumnRule', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapColumnRule', changedTime: 1758527448464 }));

                window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Clear(filterList, 'shallow', 'nasl.collection.List<nasl.core.String>'));
                dataMetaProperty.isCheck = true;
                const $forEachListVariable16yd0u30 = mapList;
                const $forEachStartVariable16yd0u30 = 0;
                const $forEachEndVariable16yd0u30 = ($forEachListVariable16yd0u30 || {}).length;
                if (Array.isArray($forEachListVariable16yd0u30)) {
                  for (let index1 = $forEachStartVariable16yd0u30; index1 < $forEachEndVariable16yd0u30; index1++) {
                    const item1 = $forEachListVariable16yd0u30[index1];
                    if ((item1 || {}).isCheck) { /* empty */ } else {
                      dataMetaProperty.isCheck = false;
                      window.$utils.Add(filterList, window.$utils.Clone(((item1 || {}).columnRule || {}).columnRuleType));
                    }
                  }
                }

                searchList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListFilterAsync(filterList, (item1) => item1 != 'none'));
                if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: searchList })) { /* empty */ } else {
                  dataMetaProperty.propertyPermission = 'none';
                  dataMetaProperty.columnRule.columnRuleType = 'none';
                }

                searchList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListFilterAsync(filterList, (item1) => item1 != 'read'));
                if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: searchList })) { /* empty */ } else {
                  dataMetaProperty.propertyPermission = 'read';
                  dataMetaProperty.columnRule.columnRuleType = 'read';
                }
              }
              window.$utils.Add(result, window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', window.$utils.Clone(dataMetaProperty)));
            }
          }
        }
      }
      const $forEachListVariable0iitptz1 = result;
      const $forEachStartVariable0iitptz1 = 0;
      const $forEachEndVariable0iitptz1 = ($forEachListVariable0iitptz1 || {}).length;
      if (Array.isArray($forEachListVariable0iitptz1)) {
        for (let index = $forEachStartVariable0iitptz1; index < $forEachEndVariable0iitptz1; index++) {
          const item = $forEachListVariable0iitptz1[index];
          window.$genInitFromSchema(
            'nasl.collection.List<app.structures.LcapDataMetaColunmRule>',
            await window.$utils.ListSortAsync(
              (item || {}).showPropertyNameList,
              async (item1) =>
                await (async () => {
                  const obj = {
                    asc: null,
                    by: null,
                  };
                  obj.asc = true;
                  obj.by = (item1 || {}).isCheck;
                  return obj;
                })(),
            ),
          );
        }
      }
      window.$genInitFromSchema(
        'nasl.collection.List<app.structures.LcapDataMetaColunmRule>',
        await window.$utils.ListSortAsync(
          result,
          async (item) =>
            await (async () => {
              const obj = {
                asc: null,
                by: null,
              };
              obj.asc = true;
              obj.by = (item || {}).isCheck;
              return obj;
            })(),
        ),
      );
      return result;
    },

    async loadDataMetaRowRule() {
      let rowRuleList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapRowRuleItem>', undefined);
      const customRowRule = window.$genInitFromSchema('app.structures.LcapDataMetaRowRule', undefined);
      let propertyNames = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      rowRuleList = window.$genInitFromSchema(
        'nasl.collection.List<app.dataSources.defaultDS.entities.LcapRowRuleItem>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetRowRuleByDataPermissionId',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },
          data: {
            dataPermissionId: (this.dataPermission || {}).id,
          },
        }),
      );
      window.$genInitFromSchema('nasl.collection.List<app.structures.LcapComparisonResult>', await this.loadComParisonList(''));
      if (window.$utils.HasValue({ type: 'nasl.collection.List<app.dataSources.defaultDS.entities.LcapRowRuleItem>', value: rowRuleList })) {
        propertyNames = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListTransformAsync(this.customColunmRuleList, (item) => (item || {}).propertyName));
        const $forEachListVariable0llmboo0 = rowRuleList;
        const $forEachStartVariable0llmboo0 = 0;
        const $forEachEndVariable0llmboo0 = ($forEachListVariable0llmboo0 || {}).length;
        if (Array.isArray($forEachListVariable0llmboo0)) {
          for (let index = $forEachStartVariable0llmboo0; index < $forEachEndVariable0llmboo0; index++) {
            const item = $forEachListVariable0llmboo0[index];
            if (window.$utils.Contains(propertyNames, (item || {}).propertyName)) {
              customRowRule.comparison = (item || {}).comparison;
              customRowRule.comparisons = this.comparisonList;
              customRowRule.propertyName = (item || {}).propertyName;
              customRowRule.propertys = this.customColunmRuleList;
              customRowRule.values = window.$utils.Join((item || {}).values, '，');
              customRowRule.valuesType = (item || {}).valuesType;

              if (window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).valuesType })) { /* empty */ } else {
                customRowRule.valuesType = '固定值';
              }

              window.$utils.Add(this.customRowRuleList, window.$genInitFromSchema('app.structures.LcapDataMetaRowRule', window.$utils.Clone(customRowRule)));
            }
          }
        }
      } else {
        customRowRule.comparisons = this.comparisonList;
        customRowRule.propertys = this.customColunmRuleList;
        customRowRule.valuesType = '固定值';

        window.$utils.Add(this.customRowRuleList, window.$genInitFromSchema('app.structures.LcapDataMetaRowRule', window.$utils.Clone(customRowRule)));
      }
      this.loading = false;
    },

    async loadComParisonList(propertyType) {
      let comparisonLetter;
      let comparisonLetterList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      const comparisonResultList = window.$genInitFromSchema('nasl.collection.List<app.structures.LcapComparisonResult>', undefined);
      const comparisonResult = window.$genInitFromSchema('app.structures.LcapComparisonResult', undefined);
      let comparisonStr;
      let comparisonStrList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      let result = window.$genInitFromSchema('nasl.collection.List<app.structures.LcapComparisonResult>', undefined);
      if (propertyType == 'String') {
        comparisonLetter = 'equal,notEqual,like,notLike,leftLike,rightLike,in,notIn';
        comparisonStr = '等于(=),不等于(≠),模糊关联(like),不匹配(not like),左关联(left like),右关联(right like),包含(in),不包含(not in)';
      } else if (propertyType == 'Integer' || propertyType == 'Decimal') {
        comparisonLetter = 'equal,notEqual,greater,less,greaterEquals,lessEquals,in,notIn';
        comparisonStr = '等于(=),不等于(≠),大于(＞),小于(＜),大于等于(≥),小于等于(≤),包含(in),不包含(not in)';
      } else if (propertyType == 'Date' || propertyType == 'Time' || propertyType == 'DateTime') {
        comparisonLetter = 'equal,notEqual,greater,less,greaterEquals,lessEquals';
        comparisonStr = '等于(=),不等于(≠),大于(＞),小于(＜),大于等于(≥),小于等于(≤)';
      } else if (propertyType == 'Boolean') {
        comparisonLetter = 'equal,notEqual';
        comparisonStr = '等于(=),不等于(≠)';
      } else if (propertyType == 'Enum') {
        comparisonLetter = 'equal,notEqual,in,notIn';
        comparisonStr = '等于(=),不等于(≠),包含(in),不包含(not in)';
      } else {
        comparisonLetter = 'equal,notEqual,greater,less,greaterEquals,lessEquals,like,notLike,leftLike,rightLike,in,notIn';
        comparisonStr = '等于(=),不等于(≠),大于(＞),小于(＜),大于等于(≥),小于等于(≤),模糊关联(like),不匹配(not like),左关联(left like),右关联(right like),包含(in),不包含(not in)';
        comparisonLetterList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Split(comparisonLetter, ',', true));
        comparisonStrList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Split(comparisonStr, ',', true));
        const $forEachListVariable0hr800n1 = comparisonLetterList;
        const $forEachStartVariable0hr800n1 = 0;
        const $forEachEndVariable0hr800n1 = ($forEachListVariable0hr800n1 || {}).length;
        if (Array.isArray($forEachListVariable0hr800n1)) {
          for (let index = $forEachStartVariable0hr800n1; index < $forEachEndVariable0hr800n1; index++) {
            const item = $forEachListVariable0hr800n1[index];
            comparisonResult.value = item;
            comparisonResult.text = window.$utils.Get(comparisonStrList, index);
            window.$utils.Add(comparisonResultList, window.$genInitFromSchema('app.structures.LcapComparisonResult', window.$utils.Clone(comparisonResult)));
          }
        }

        this.comparisonList = comparisonResultList;
      }
      window.$genInitFromSchema('nasl.collection.List<app.structures.LcapComparisonResult>', window.$utils.Clear(comparisonResultList, 'shallow', 'nasl.collection.List<app.structures.LcapComparisonResult>'));
      comparisonLetterList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Split(comparisonLetter, ',', true));
      comparisonStrList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Split(comparisonStr, ',', true));
      const $forEachListVariable1rc0ybu1 = comparisonLetterList;
      const $forEachStartVariable1rc0ybu1 = 0;
      const $forEachEndVariable1rc0ybu1 = ($forEachListVariable1rc0ybu1 || {}).length;
      if (Array.isArray($forEachListVariable1rc0ybu1)) {
        for (let index = $forEachStartVariable1rc0ybu1; index < $forEachEndVariable1rc0ybu1; index++) {
          const item = $forEachListVariable1rc0ybu1[index];
          comparisonResult.value = item;
          comparisonResult.text = window.$utils.Get(comparisonStrList, index);
          window.$utils.Add(comparisonResultList, window.$genInitFromSchema('app.structures.LcapComparisonResult', window.$utils.Clone(comparisonResult)));
        }
      }
      result = comparisonResultList;
      return result;
    },

    async formatValueList(value) {
      let formatList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      let temp;
      const result = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      if (window.$utils.IndexOf(value, '，', 0, true) == 0) {
        value = window.$utils.SubString(value, 1, (value || {}).length);
      }
      if (window.$utils.LastIndexOf(value, '，', true) == window.$global.minus((value || {}).length, 1)) {
        value = window.$utils.SubString(value, 0, window.$global.minus((value || {}).length, 1));
      }
      formatList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Split(value, '，', true));
      const $forEachListVariable0y0wvdl0 = formatList;
      const $forEachStartVariable0y0wvdl0 = 0;
      const $forEachEndVariable0y0wvdl0 = ($forEachListVariable0y0wvdl0 || {}).length;
      if (Array.isArray($forEachListVariable0y0wvdl0)) {
        for (let index = $forEachStartVariable0y0wvdl0; index < $forEachEndVariable0y0wvdl0; index++) {
          const item = $forEachListVariable0y0wvdl0[index];
          temp = item;
          if (window.$utils.HasValue({ type: 'nasl.core.String', value: temp })) {
            temp = window.$utils.Trim(temp);
            window.$utils.Add(result, window.$utils.Clone(temp));
          }
          temp = '';
        }
      }
      return result;
    },

    async createRoleDataPermission() {
      let dataResult = window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaStructure>', undefined);
      let dataCreate = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDataPermission', undefined);
      const columnRule = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapColumnRule', undefined);
      const columnRuleList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', undefined);
      if (window.$utils.HasValue({ type: 'nasl.core.Long', value: (this.inputRole || {}).id })) {
        dataResult = window.$genInitFromSchema(
          'nasl.collection.List<app.structures.LcapDataMetaStructure>',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapLoadDataMetaManagement',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/2',
            },
            data: {
              dataType: 'entity',
              search: '',
              isLogicAll: true,
            },
          }),
        );
        window.$utils.AddAll(
          dataResult,
          window.$genInitFromSchema(
            'nasl.collection.List<app.structures.LcapDataMetaStructure>',
            await window.LcapRequest({
              url: '/api/lcplogics/LcapLoadDataMetaManagement',
              method: 'POST',
              extraConfig: {
                serviceType: 'micro',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
              },
              data: {
                dataType: 'logic',
                search: '',
                isLogicAll: true,
              },
            }),
          ),
        );
        const $forEachListVariable0bowwcx1 = dataResult;
        const $forEachStartVariable0bowwcx1 = 0;
        const $forEachEndVariable0bowwcx1 = ($forEachListVariable0bowwcx1 || {}).length;
        if (Array.isArray($forEachListVariable0bowwcx1)) {
          for (let index = $forEachStartVariable0bowwcx1; index < $forEachEndVariable0bowwcx1; index++) {
            const item = $forEachListVariable0bowwcx1[index];
            window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapDataPermission', window.$utils.Clear(dataCreate, 'shallow', 'app.dataSources.defaultDS.entities.LcapDataPermission'));
            dataCreate.relation = 'and';
            dataCreate.resourceType = (item || {}).dataType;
            dataCreate.roleId = (this.inputRole || {}).id;
            dataCreate.resourceName = (item || {}).dataName;
            dataCreate.rowRuleType = 'all';
            dataCreate = window.$genInitFromSchema(
              'app.dataSources.defaultDS.entities.LcapDataPermission',
              await window.LcapRequest({
                url: '/api/lcplogics/LcapCreateDataPermission',
                method: 'POST',
                extraConfig: {
                  serviceType: 'micro',
                },
                headers: {
                  'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
                },
                data: {
                  dataPermission: dataCreate,
                },
              }),
            );
            window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapColumnRule', window.$utils.Clear(columnRule, 'shallow', 'app.dataSources.defaultDS.entities.LcapColumnRule'));
            if ((item || {}).dataType == 'entity') {
              const $forEachListVariable0krqizo1 = (item || {}).entityProperties;
              const $forEachStartVariable0krqizo1 = 0;
              const $forEachEndVariable0krqizo1 = ($forEachListVariable0krqizo1 || {}).length;
              if (Array.isArray($forEachListVariable0krqizo1)) {
                for (let index1 = $forEachStartVariable0krqizo1; index1 < $forEachEndVariable0krqizo1; index1++) {
                  const item1 = $forEachListVariable0krqizo1[index1];
                  columnRule.columnRuleType = 'readWrite';
                  columnRule.propertyName = (item1 || {}).propertyName;
                  columnRule.dataPermissionId = (dataCreate || {}).id;
                  window.$utils.Add(columnRuleList, window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapColumnRule', window.$utils.Clone(columnRule)));
                }
              }
            } else {
              const $forEachListVariable0tkwsoq1 = (item || {}).logicProperties;
              const $forEachStartVariable0tkwsoq1 = 0;
              const $forEachEndVariable0tkwsoq1 = ($forEachListVariable0tkwsoq1 || {}).length;
              if (Array.isArray($forEachListVariable0tkwsoq1)) {
                for (let index1 = $forEachStartVariable0tkwsoq1; index1 < $forEachEndVariable0tkwsoq1; index1++) {
                  const item1 = $forEachListVariable0tkwsoq1[index1];
                  columnRule.columnRuleType = 'read';
                  columnRule.propertyName = (item1 || {}).propertyName;
                  columnRule.dataPermissionId = (dataCreate || {}).id;
                  window.$utils.Add(columnRuleList, window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapColumnRule', window.$utils.Clone(columnRule)));
                }
              }
            }
          }
        }

        if (window.$utils.HasValue({ type: 'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', value: columnRuleList })) {
          window.$genInitFromSchema(
            'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>',
            await window.LcapRequest({
              url: '/api/lcap-column-rule/batch',
              method: 'POST',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/roleManagement/1',
              },

              data: columnRuleList,
            }),
          );
        }
      }
    },

    async deleteRoleDataPermission() {
      let deleteIdList = window.$genInitFromSchema('nasl.collection.List<nasl.core.Long>', undefined);
      deleteIdList = window.$genInitFromSchema(
        'nasl.collection.List<nasl.core.Long>',
        await window.LcapRequest({
          url: '/api/lcplogics/LcapGetDataPermissionIdByRoleId',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },
          data: {
            roleId: (this.deleteRoleBody || {}).id,
          },
        }),
      );
      if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.Long>', value: deleteIdList })) {
        await window.LcapRequest({
          url: '/api/lcap-data-permission/batch',
          method: 'DELETE',
          extraConfig: {
            serviceType: 'entity',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },

          data: deleteIdList,
        });
        await window.LcapRequest({
          url: '/api/lcap-column-rule/by',
          method: 'DELETE',
          extraConfig: {
            serviceType: 'entity',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },
          data: {
            concept: 'Function',
            name: 'filter',
            returnExpression: this.$resolveRequestData({ concept: 'BinaryExpression', operator: 'in', left: { concept: 'MemberExpression', object: { concept: 'Identifier', name: '_', label: null, description: null, folded: false, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapColumnRule' } }, property: { concept: 'Identifier', name: 'dataPermissionId', label: null, description: null, folded: false, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Long' } } }, right: { concept: 'Identifier', name: 'deleteIdList', value: deleteIdList, expression: 'deleteIdList' } }),
          },
        });
        await window.LcapRequest({
          url: '/api/lcap-row-rule-item/by',
          method: 'DELETE',
          extraConfig: {
            serviceType: 'entity',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },
          data: {
            concept: 'Function',
            name: 'filter',
            returnExpression: this.$resolveRequestData({ concept: 'BinaryExpression', operator: 'in', left: { concept: 'MemberExpression', object: { concept: 'Identifier', name: '_', label: null, description: null, folded: false, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapRowRuleItem' } }, property: { concept: 'Identifier', name: 'dataPermissionId', label: null, description: null, folded: false, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Long' } } }, right: { concept: 'Identifier', name: 'deleteIdList', value: deleteIdList, expression: 'deleteIdList' } }),
          },
        });
      }
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

    async roleManagement_created(event) {
      await this.roleManagement_created_created(event);
    },

    async roleManagement_created_created() {
      let search = window.$genInitFromSchema('nasl.collection.List<{lcapRole: app.dataSources.defaultDS.entities.LcapRole}>', undefined);
      this.$global.frontendVariables.title = '角色管理';
      search = (
        window.$genInitFromSchema(
          '{list: nasl.collection.List<{lcapRole: app.dataSources.defaultDS.entities.LcapRole}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapLoadRoleManagementTableView',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/2',
            },
            data: {
              page: 1,
              size: 10,
              sort: 'id',
              order: 'asc',
              filter: this.filterRole,
            },
          }),
        ) || {}
      ).list;
      if (window.$utils.HasValue({ type: 'nasl.collection.List<{lcapRole: app.dataSources.defaultDS.entities.LcapRole}>', value: search })) {
        this.selectRole = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', window.$utils.ListHead(window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapRole>', await window.$utils.ListTransformAsync(search, (item) => (item || {}).lcapRole))));
      } else {
        this.selectRole = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapRole', changedTime: 1758527501770 }));
      }
      this.selectRoleId = (this.selectRole || {}).id;
      this.selectDataTypeName = 'entity';
      await this.$refs.tableView_1?.reload?.();
      await this.$refs.tableView1?.reload?.();
      await this.$refs.tableView2?.reload?.();
      await (async () => {
        'use JSBlock';
        this.adminName = `DEVACC-${window.appInfo.domainName}`;
      })();
    },

    async uButton2_click(event) {
      await this.uButton2_click_onClickAddRoleUser(event);
    },

    async uButton2_click_onClickAddRoleUser() {
      let createUserAndRoleList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapUserRoleMapping>', undefined);
      let userList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapUser>', undefined);
      if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: this.waitAddRoleUserIdList })) {
        userList = window.$genInitFromSchema(
          'nasl.collection.List<app.dataSources.defaultDS.entities.LcapUser>',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapGetUserByUserIds',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
            },
            data: {
              userIds: this.waitAddRoleUserIdList,
            },
          }),
        );
        createUserAndRoleList = window.$genInitFromSchema(
          'nasl.collection.List<app.dataSources.defaultDS.entities.LcapUserRoleMapping>',
          await window.$utils.ListTransformAsync(
            this.waitAddRoleUserIdList,
            async (item) =>
              await (async () => {
                const obj = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUserRoleMapping', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapUserRoleMapping', changedTime: 1758527494765 }));
                obj.roleId = (this.selectRole || {}).id;
                obj.userId = item;
                obj.source = window.$utils.ToString('app.enums.UserSourceEnum', (window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', await window.$utils.ListFindAsync(userList, (item1) => (item1 || {}).userId == item)) || {}).source);
                obj.userName = (window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapUser', await window.$utils.ListFindAsync(userList, (item1) => (item1 || {}).userId == item)) || {}).userName;
                return obj;
              })(),
          ),
        );
        window.$genInitFromSchema(
          'nasl.collection.List<app.dataSources.defaultDS.entities.LcapUserRoleMapping>',
          await window.LcapRequest({
            url: '/api/lcap-user-role-mapping/batch',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
            },

            data: createUserAndRoleList,
          }),
        );
      }
      await this.$refs.tableView1?.reload?.();
      await this.$refs.saveModal?.close?.();
      await this.messagePrompt(
        await (async () => {
          const it = window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: this.waitAddRoleUserIdList });
          if (window.$global.isEqual(it, true)) {
            return '添加成功';
          } else if (window.$global.isEqual(it, false)) {
            return '未选择用户';
          } else { /* empty */ }
        })(),
        await (async () => {
          const it = window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: this.waitAddRoleUserIdList });
          if (window.$global.isEqual(it, true)) {
            return 'success';
          } else if (window.$global.isEqual(it, false)) {
            return 'warning';
          } else { /* empty */ }
        })(),
      );
      window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Clear(this.waitAddRoleUserIdList, 'shallow', 'nasl.collection.List<nasl.core.String>'));
    },

    async button_5_click(event) {
      await this.button_5_click_close(event);
    },

    async button_5_click_close() {
      await this.$refs.saveModal?.close?.();
    },

    async uButton11_click(event) {
      await this.uButton11_click_deleteRoleById(event);
    },

    async uButton11_click_deleteRoleById() {
      await window.LcapRequest({
        url: '/api/lcap-user-role-mapping',
        method: 'DELETE',
        extraConfig: {
          serviceType: 'entity',
        },
        params: {
          id: ((this.deleteUserRole || {}).lcapUserRoleMapping || {}).id,
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
        },
      });
      window.$genInitFromSchema('{lcapRole: app.dataSources.defaultDS.entities.LcapRole, lcapUserRoleMapping: app.dataSources.defaultDS.entities.LcapUserRoleMapping}', window.$utils.Clear(this.deleteUserRole, 'shallow', '{lcapRole: app.dataSources.defaultDS.entities.LcapRole, lcapUserRoleMapping: app.dataSources.defaultDS.entities.LcapUserRoleMapping}'));
      await this.$refs.tableView1?.reload?.();
      await this.$refs.deleteUserRole?.close?.();
      await this.messagePrompt('移除成功', 'success');
    },

    async uButton12_click(event) {
      await this.uButton12_click_close(event);
    },

    async uButton12_click_close() {
      await this.$refs.deleteUserRole?.close?.();
    },

    async uButton8_click(event) {
      await this.uButton8_click_removeRolePermissionMapping(event);
    },

    async uButton8_click_removeRolePermissionMapping() {
      await window.LcapRequest({
        url: '/api/lcplogics/LcapGetMappingDeleteByRoleIdAndPermissionId',
        method: 'POST',
        extraConfig: {
          serviceType: 'micro',
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
        },
        data: {
          roleId: (this.selectRole || {}).id,
          permissionId: (this.removePermission || {}).id,
        },
      });
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', window.$utils.Clear(this.removePermission, 'shallow', 'app.dataSources.defaultDS.entities.LcapPermission'));
      await this.$refs.tableView2?.reload?.();
      await this.$refs.removeResourcePopup?.close?.();
      await this.messagePrompt('移除成功', 'success');
    },

    async uButton13_click(event) {
      await this.uButton13_click_close(event);
    },

    async uButton13_click_close() {
      await this.$refs.removeResourcePopup?.close?.();
    },

    async uButton14_click(event) {
      await this.uButton14_click_addRolePermissionMapping(event);
    },

    async uButton14_click_addRolePermissionMapping() {
      let mappingList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapRolePerMapping>', undefined);
      if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.Long>', value: this.alreadySelectedPermissionIdList })) {
        mappingList = window.$genInitFromSchema(
          'nasl.collection.List<app.dataSources.defaultDS.entities.LcapRolePerMapping>',
          await window.$utils.ListTransformAsync(
            this.alreadySelectedPermissionIdList,
            async (item) =>
              await (async () => {
                const obj = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRolePerMapping', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapRolePerMapping', changedTime: 1758527484411 }));
                obj.roleId = (this.selectRole || {}).id;
                obj.permissionId = item;
                return obj;
              })(),
          ),
        );
        window.$genInitFromSchema(
          'nasl.collection.List<app.dataSources.defaultDS.entities.LcapRolePerMapping>',
          await window.LcapRequest({
            url: '/api/lcap-role-per-mapping/batch',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
            },

            data: mappingList,
          }),
        );
      }
      await this.$refs.tableView2?.reload?.();
      await this.$refs.selectResourcePopup?.close?.();
      await this.messagePrompt(
        await (async () => {
          const it = window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.Long>', value: this.alreadySelectedPermissionIdList });
          if (window.$global.isEqual(it, true)) {
            return '权限添加成功';
          } else if (window.$global.isEqual(it, false)) {
            return '未选择权限';
          } else { /* empty */ }
        })(),
        await (async () => {
          const it = window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.Long>', value: this.alreadySelectedPermissionIdList });
          if (window.$global.isEqual(it, true)) {
            return 'success';
          } else if (window.$global.isEqual(it, false)) {
            return 'warning';
          } else { /* empty */ }
        })(),
      );
      window.$genInitFromSchema('nasl.collection.List<nasl.core.Long>', window.$utils.Clear(this.alreadySelectedPermissionIdList, 'shallow', 'nasl.collection.List<nasl.core.Long>'));
    },

    async uButton15_click(event) {
      await this.uButton15_click_close(event);
    },

    async uButton15_click_close() {
      await this.$refs.selectResourcePopup?.close?.();
      window.$genInitFromSchema('nasl.collection.List<nasl.core.Long>', window.$utils.Clear(this.alreadySelectedPermissionIdList, 'shallow', 'nasl.collection.List<nasl.core.Long>'));
    },

    async uButton6_click(event) {
      await this.uButton6_click_submitCreateRole(event);
    },

    async uButton6_click_submitCreateRole() {
      await this.getRoleNameList();
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form1?.validate?.('submit', undefined)) || {}).valid) {
        this.inputRole = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LcapRole',
          await window.LcapRequest({
            url: '/api/lcap-role',
            method: 'POST',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
            },

            data: this.inputRole,
          }),
        );
        await this.createRoleDataPermission();
        await this.$refs.tableView?.reload?.();
        await this.$refs.createORUpdateRolePopup?.close?.();
        await this.messagePrompt('创建成功', 'success');
      }
    },

    async uButton4_click(event) {
      await this.uButton4_click_confirmUpdateRole(event);
    },

    async uButton4_click_confirmUpdateRole() {
      await this.getRoleNameList();
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs.form1?.validate?.('submit', undefined)) || {}).valid) {
        this.selectRole = window.$genInitFromSchema(
          'app.dataSources.defaultDS.entities.LcapRole',
          await window.LcapRequest({
            url: '/api/lcap-role',
            method: 'PUT',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
            },
            data: {
              entity: this.inputRole,
            },
          }),
        );
        await this.$refs.tableView?.reload?.();
        await this.$refs.createORUpdateRolePopup?.close?.();
        await this.messagePrompt('修改成功', 'success');
      }
    },

    async uButton7_click(event) {
      await this.uButton7_click_close(event);
    },

    async uButton7_click_close() {
      await this.$refs.createORUpdateRolePopup?.close?.();
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', window.$utils.Clear(this.inputRole, 'shallow', 'app.dataSources.defaultDS.entities.LcapRole'));
    },

    async uButton9_click(event) {
      await this.uButton9_click_deleteRoleById(event);
    },

    async uButton9_click_deleteRoleById() {
      let search = window.$genInitFromSchema('nasl.collection.List<{lcapRole: app.dataSources.defaultDS.entities.LcapRole}>', undefined);
      await this.deleteRoleDataPermission();
      await window.LcapRequest({
        url: '/api/lcap-role',
        method: 'DELETE',
        extraConfig: {
          serviceType: 'entity',
        },
        params: {
          id: (this.deleteRoleBody || {}).id,
        },
        headers: {
          'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
        },
      });
      search = (
        window.$genInitFromSchema(
          '{list: nasl.collection.List<{lcapRole: app.dataSources.defaultDS.entities.LcapRole}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapLoadRoleManagementTableView',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/1',
            },
            data: {
              page: 1,
              size: 10,
              sort: 'id',
              order: 'asc',
              filter: this.filterRole,
            },
          }),
        ) || {}
      ).list;
      if (window.$utils.HasValue({ type: 'nasl.collection.List<{lcapRole: app.dataSources.defaultDS.entities.LcapRole}>', value: search })) {
        this.selectRole = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', window.$utils.ListHead(window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapRole>', await window.$utils.ListTransformAsync(search, (item) => (item || {}).lcapRole))));
      } else {
        this.selectRole = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', window.$utils.New({ concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapRole', changedTime: 1758527501727 }));
      }
      this.selectRoleId = (this.selectRole || {}).id;
      await this.$refs.tableView?.reload?.();
      await this.$refs.tableView1?.reload?.();
      await this.$refs.tableView2?.reload?.();
      await this.$refs.tableView_1?.reload?.();
      await this.$refs.deleteRolePopup?.close?.();
      await this.messagePrompt('删除成功', 'success');
    },

    async uButton10_click(event) {
      await this.uButton10_click_close(event);
    },

    async uButton10_click_close() {
      await this.$refs.deleteRolePopup?.close?.();
    },

    async button_1_click(event) {
      await this.button_1_click_click(event);
    },

    async button_1_click_click() {
      this.isUpdateRole = false;
      window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', window.$utils.Clear(this.inputRole, 'shallow', 'app.dataSources.defaultDS.entities.LcapRole'));
      await this.getRoleNameList();
      await this.$refs.createORUpdateRolePopup?.open?.();
    },

    async tableView_select(event) {
      await this.tableView_select_select(event);
    },

    async tableView_select_select() {
      this.loading = true;
      this.selectRole = window.$genInitFromSchema(
        'app.dataSources.defaultDS.entities.LcapRole',
        await window.LcapRequest({
          url: '/api/lcap-role',
          method: 'GET',
          extraConfig: {
            serviceType: 'entity',
          },
          params: {
            id: this.selectRoleId,
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
          },
        }),
      );
      this.isRoleSelect = true;
      await this.$refs.tableView1?.reload?.();
      await this.$refs.tableView2?.reload?.();
      await this.$refs.tableView_1?.reload?.();
    },

    async uInput4_blur(event) {
      await this.uInput4_blur_blur(event);
    },

    async uInput4_blur_blur() {
      this.inputRole.name = window.$utils.Trim((this.inputRole || {}).name);
    },

    async uButton1_click(event) {
      await this.uButton1_click_open(event);
    },

    async uButton1_click_open() {
      window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Clear(this.waitAddRoleUserIdList, 'shallow', 'nasl.collection.List<nasl.core.String>'));
      await this.$refs.saveModal?.open?.();
    },

    async uButton5_click(event) {
      await this.uButton5_click_open(event);
    },

    async uButton5_click_open() {
      window.$genInitFromSchema('nasl.collection.List<nasl.core.Long>', window.$utils.Clear(this.alreadySelectedPermissionIdList, 'shallow', 'nasl.collection.List<nasl.core.Long>'));
      await this.$refs.selectResourcePopup?.open?.();
    },

    async capsules_2_select(event) {
      await this.capsules_2_select_select(event);
    },

    async capsules_2_select_select() {
      await this.$refs.tableView_1?.reload?.();
    },

    async input_1_input(event) {
      await this.input_1_input_input(event);
    },

    async input_1_input_input() {
      await console.info(window.$utils.ToString('nasl.core.String', '搜索...'));
      await (async () => {
        'use JSBlock';

        await this.$nextTick();
      })();
      this.isSearch = true;
      await this.$refs.tableView_1?.reload?.();
    },

    async tableView_1_select(event) {
      await this.tableView_1_select_select(event);
    },

    async tableView_1_select_select() {
      this.loading = true;
      await this.$refs.table_view_1?.reload?.();
    },

    async tableView_1_load(event) {
      await this.tableView_1_load_load(event);
    },

    async tableView_1_load_load() {
      if (this.isSearch) {
        this.isSearch = false;
      } else {
        await this.$refs.table_view_1?.reload?.();
      }
    },

    async button_3_click(event) {
      await this.button_3_click_click(event);
    },

    async button_3_click_click() {
      let hasId = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', undefined);
      let notId = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', undefined);
      let isPass = true;
      const rowRuleList = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapRowRuleItem>', undefined);
      const rowRule = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRowRuleItem', undefined);
      let temp;
      let valueList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      let tempList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      isPass = true;
      if ((this.selectDataMeta || {}).rowRuleType == 'custom') {
        const $forEachListVariable1jch7450 = this.customRowRuleList;
        const $forEachStartVariable1jch7450 = 0;
        const $forEachEndVariable1jch7450 = ($forEachListVariable1jch7450 || {}).length;
        if (Array.isArray($forEachListVariable1jch7450)) {
          for (let index = $forEachStartVariable1jch7450; index < $forEachEndVariable1jch7450; index++) {
            const item = $forEachListVariable1jch7450[index];
            if (isPass) {
              if (window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).propertyName })) { /* empty */ } else {
                await this.messagePrompt(window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 属性值不得为空'), 'error');
                isPass = false;
              }
            }
            if (isPass) {
              if (window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).comparison })) { /* empty */ } else {
                await this.messagePrompt(
                  await (async () => {
                    const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).propertyTitle });
                    if (window.$global.isEqual(it, true)) {
                      return window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 ') + window.$utils.ToString('nasl.core.String', (item || {}).propertyTitle) + window.$utils.ToString('nasl.core.String', ' 比较符号不得为空');
                    } else if (window.$global.isEqual(it, false)) {
                      return window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 ') + window.$utils.ToString('nasl.core.String', (item || {}).propertyName) + window.$utils.ToString('nasl.core.String', ' 比较符号不得为空');
                    } else { /* empty */ }
                  })(),
                  'error',
                );
                isPass = false;
              }
            }
            if (isPass) {
              if (window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).values })) { /* empty */ } else {
                await this.messagePrompt(
                  await (async () => {
                    const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).propertyTitle });
                    if (window.$global.isEqual(it, true)) {
                      return window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 ') + window.$utils.ToString('nasl.core.String', (item || {}).propertyTitle) + window.$utils.ToString('nasl.core.String', ' 比较值不得为空');
                    } else if (window.$global.isEqual(it, false)) {
                      return window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 ') + window.$utils.ToString('nasl.core.String', (item || {}).propertyName) + window.$utils.ToString('nasl.core.String', ' 比较值不得为空');
                    } else { /* empty */ }
                  })(),
                  'error',
                );
                isPass = false;
              }
            }
            if (isPass) {
              if (window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).valuesType })) { /* empty */ } else {
                await this.messagePrompt('不得为空', 'error');
                isPass = false;
              }
            }
            if (isPass) {
              if ((item || {}).propertyType == 'Integer') {
                if ((item || {}).comparison == 'in' || (item || {}).comparison == 'notIn') {
                  valueList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await this.formatValueList((item || {}).values));
                  const $forEachListVariable1s1b79u1 = valueList;
                  const $forEachStartVariable1s1b79u1 = 0;
                  const $forEachEndVariable1s1b79u1 = ($forEachListVariable1s1b79u1 || {}).length;
                  if (Array.isArray($forEachListVariable1s1b79u1)) {
                    for (let index1 = $forEachStartVariable1s1b79u1; index1 < $forEachEndVariable1s1b79u1; index1++) {
                      const item1 = $forEachListVariable1s1b79u1[index1];
                      temp = item1;
                      if (isPass) {
                        await (async () => {
                          'use JSBlock';
                          function isInteger(str) {
                            const parsedInt = parseInt(str, 10);
                            return !isNaN(parsedInt) && String(parsedInt) === str;
                          }

                          isPass = isInteger(temp);
                        })();
                      }
                    }
                  }
                } else {
                  temp = (item || {}).values;
                  await (async () => {
                    'use JSBlock';
                    function isInteger(str) {
                      const parsedInt = parseInt(str, 10);
                      return !isNaN(parsedInt) && String(parsedInt) === str;
                    }

                    isPass = isInteger(temp);
                  })();
                }

                if (isPass) { /* empty */ } else {
                  await this.messagePrompt(
                    await (async () => {
                      const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).propertyTitle });
                      if (window.$global.isEqual(it, true)) {
                        return window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 ') + window.$utils.ToString('nasl.core.String', (item || {}).propertyTitle) + window.$utils.ToString('nasl.core.String', ' 请输入正确的整数值');
                      } else if (window.$global.isEqual(it, false)) {
                        return window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 ') + window.$utils.ToString('nasl.core.String', (item || {}).propertyName) + window.$utils.ToString('nasl.core.String', ' 请输入正确的整数值');
                      } else { /* empty */ }
                    })(),
                    'error',
                  );
                }
              }
            }
            if (isPass) {
              if ((item || {}).propertyType == 'Decimal') {
                if ((item || {}).comparison == 'in' || (item || {}).comparison == 'notIn') {
                  valueList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await this.formatValueList((item || {}).values));
                  const $forEachListVariable101blga0 = valueList;
                  const $forEachStartVariable101blga0 = 0;
                  const $forEachEndVariable101blga0 = ($forEachListVariable101blga0 || {}).length;
                  if (Array.isArray($forEachListVariable101blga0)) {
                    for (let index1 = $forEachStartVariable101blga0; index1 < $forEachEndVariable101blga0; index1++) {
                      const item1 = $forEachListVariable101blga0[index1];
                      temp = item1;
                      if (isPass) {
                        await (async () => {
                          'use JSBlock';
                          function isDecimal(str) {
                            const parsedFloat = parseFloat(str);
                            return !isNaN(parsedFloat) && String(parsedFloat) === str;
                          }

                          isPass = isDecimal(temp);
                        })();
                      }
                    }
                  }
                } else {
                  temp = (item || {}).values;
                  await (async () => {
                    'use JSBlock';
                    function isDecimal(str) {
                      const parsedFloat = parseFloat(str);
                      return !isNaN(parsedFloat) && String(parsedFloat) === str;
                    }

                    isPass = isDecimal(temp);
                  })();
                }

                if (isPass) { /* empty */ } else {
                  await this.messagePrompt(
                    await (async () => {
                      const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).propertyTitle });
                      if (window.$global.isEqual(it, true)) {
                        return window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 ') + window.$utils.ToString('nasl.core.String', (item || {}).propertyTitle) + window.$utils.ToString('nasl.core.String', ' 请输入正确的小数值');
                      } else if (window.$global.isEqual(it, false)) {
                        return window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 ') + window.$utils.ToString('nasl.core.String', (item || {}).propertyName) + window.$utils.ToString('nasl.core.String', ' 请输入正确的小数值');
                      } else { /* empty */ }
                    })(),
                    'error',
                  );
                }
              }
            }
            if (isPass) {
              if ((item || {}).propertyType == 'Enum' && ((item || {}).comparison == 'in' || (item || {}).comparison == 'notIn')) {
                valueList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await this.formatValueList((item || {}).values));
                if (window.$utils.HasValue({ type: 'nasl.collection.List<extensions.lcap_annotation_data_permission.structures.PropertyOption>', value: (item || {}).propertyOptions })) {
                  tempList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListTransformAsync((item || {}).propertyOptions, (item1) => (item1 || {}).code));
                  const $forEachListVariable0w6yz6l0 = valueList;
                  const $forEachStartVariable0w6yz6l0 = 0;
                  const $forEachEndVariable0w6yz6l0 = ($forEachListVariable0w6yz6l0 || {}).length;
                  if (Array.isArray($forEachListVariable0w6yz6l0)) {
                    for (let index1 = $forEachStartVariable0w6yz6l0; index1 < $forEachEndVariable0w6yz6l0; index1++) {
                      const item1 = $forEachListVariable0w6yz6l0[index1];
                      if (window.$utils.Contains(tempList, item1)) { /* empty */ } else {
                        isPass = false;
                      }
                    }
                  }
                } else {
                  isPass = false;
                }

                if (isPass) { /* empty */ } else {
                  await this.messagePrompt(
                    await (async () => {
                      const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (item || {}).propertyTitle });
                      if (window.$global.isEqual(it, true)) {
                        return window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 ') + window.$utils.ToString('nasl.core.String', (item || {}).propertyTitle) + window.$utils.ToString('nasl.core.String', ' 请输入正确的枚举值');
                      } else if (window.$global.isEqual(it, false)) {
                        return window.$utils.ToString('nasl.core.String', '第') + window.$utils.ToString('nasl.core.Long', window.$global.add(index, 1)) + window.$utils.ToString('nasl.core.String', '行 ') + window.$utils.ToString('nasl.core.String', (item || {}).propertyName) + window.$utils.ToString('nasl.core.String', ' 请输入正确的枚举值');
                      } else { /* empty */ }
                    })(),
                    'error',
                  );
                }
              }
            }
          }
        }
      }
      if (isPass) {
        if (window.$utils.HasValue({ type: 'nasl.core.Long', value: (this.selectDataMeta || {}).id })) { /* empty */ } else {
          this.saveEnabled = true;
          return;
        }

        if (window.$utils.HasValue({ type: 'nasl.core.Long', value: (this.dataPermission || {}).id })) {
          this.dataPermission.rowRuleType = (this.selectDataMeta || {}).rowRuleType;
          this.dataPermission.relation = (this.selectDataMeta || {}).relation;

          window.$genInitFromSchema(
            'app.dataSources.defaultDS.entities.LcapDataPermission',
            await window.LcapRequest({
              url: '/api/lcap-data-permission',
              method: 'PUT',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
              },
              data: {
                entity: this.dataPermission,
                properties: ['id', 'rowRuleType', 'relation'],
              },
            }),
          );
        } else {
          this.dataPermission.resourceType = this.selectDataTypeName;
          this.dataPermission.roleId = this.selectRoleId;
          this.dataPermission.resourceName = (this.selectDataMeta || {}).dataName;
          this.dataPermission.rowRuleType = (this.selectDataMeta || {}).rowRuleType;
          this.dataPermission.relation = (this.selectDataMeta || {}).relation;

          this.dataPermission = window.$genInitFromSchema(
            'app.dataSources.defaultDS.entities.LcapDataPermission',
            await window.LcapRequest({
              url: '/api/lcap-data-permission',
              method: 'POST',
              extraConfig: {
                serviceType: 'entity',
              },
              headers: {
                'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
              },

              data: this.dataPermission,
            }),
          );
        }

        const $forEachListVariable0w1hnd50 = this.updateColumnRuleList;
        const $forEachStartVariable0w1hnd50 = 0;
        const $forEachEndVariable0w1hnd50 = ($forEachListVariable0w1hnd50 || {}).length;
        if (Array.isArray($forEachListVariable0w1hnd50)) {
          for (let index = $forEachStartVariable0w1hnd50; index < $forEachEndVariable0w1hnd50; index++) {
            const item = $forEachListVariable0w1hnd50[index];
            item.dataPermissionId = (this.dataPermission || {}).id;
          }
        }

        if (window.$utils.HasValue({ type: 'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', value: this.updateColumnRuleList })) {
          hasId = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', await window.$utils.ListFilterAsync(this.updateColumnRuleList, (item) => window.$utils.HasValue({ type: 'nasl.core.Long', value: (item || {}).id })));
          notId = window.$genInitFromSchema('nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', await window.$utils.ListFilterAsync(this.updateColumnRuleList, (item) => !window.$utils.HasValue({ type: 'nasl.core.Long', value: (item || {}).id })));
          if (window.$utils.HasValue({ type: 'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', value: hasId })) {
            window.$genInitFromSchema(
              'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>',
              await window.LcapRequest({
                url: '/api/lcap-column-rule/batch',
                method: 'PUT',
                extraConfig: {
                  serviceType: 'entity',
                },
                headers: {
                  'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
                },
                data: {
                  entities: hasId,
                  properties: ['id', 'columnRuleType', 'dataPermissionId', 'propertyName'],
                },
              }),
            );
          }
          if (window.$utils.HasValue({ type: 'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>', value: notId })) {
            window.$genInitFromSchema(
              'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>',
              await window.LcapRequest({
                url: '/api/lcap-column-rule/batch',
                method: 'POST',
                extraConfig: {
                  serviceType: 'entity',
                },
                headers: {
                  'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
                },

                data: notId,
              }),
            );
          }
        }
        if (window.$utils.HasValue({ type: 'nasl.core.Long', value: (this.dataPermission || {}).id })) {
          await window.LcapRequest({
            url: '/api/lcap-row-rule-item/by',
            method: 'DELETE',
            extraConfig: {
              serviceType: 'entity',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/1',
            },
            data: {
              concept: 'Function',
              name: 'filter',
              returnExpression: this.$resolveRequestData({ concept: 'BinaryExpression', operator: '==', left: { concept: 'MemberExpression', object: { concept: 'Identifier', name: '_', folded: false, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'reference', typeNamespace: 'app.dataSources.defaultDS.entities', typeName: 'LcapRowRuleItem' } }, property: { concept: 'Identifier', name: 'dataPermissionId', folded: false, typeAnnotation: { concept: 'TypeAnnotation', typeKind: 'primitive', typeNamespace: 'nasl.core', typeName: 'Long' } } }, right: { concept: 'MemberExpression', value: (this.dataPermission || {}).id, expression: '(this.dataPermission || {}).id' } }),
            },
          });
        }
        if ((this.selectDataMeta || {}).rowRuleType == 'custom') {
          const $forEachListVariable1l1mka40 = this.customRowRuleList;
          const $forEachStartVariable1l1mka40 = 0;
          const $forEachEndVariable1l1mka40 = ($forEachListVariable1l1mka40 || {}).length;
          if (Array.isArray($forEachListVariable1l1mka40)) {
            for (let index = $forEachStartVariable1l1mka40; index < $forEachEndVariable1l1mka40; index++) {
              const item = $forEachListVariable1l1mka40[index];
              window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Clear((rowRule || {}).values, 'shallow', 'nasl.collection.List<nasl.core.String>'));
              item.dataPermissionId = (this.dataPermission || {}).id;
              if ((item || {}).comparison == 'in' || (item || {}).comparison == 'notIn') {
                rowRule.comparison = (item || {}).comparison;
                rowRule.dataPermissionId = (item || {}).dataPermissionId;
                rowRule.propertyName = (item || {}).propertyName;
                rowRule.valuesType = (item || {}).valuesType;
                rowRule.values = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await this.formatValueList((item || {}).values));
              } else {
                rowRule.comparison = (item || {}).comparison;
                rowRule.dataPermissionId = (item || {}).dataPermissionId;
                rowRule.propertyName = (item || {}).propertyName;
                rowRule.valuesType = (item || {}).valuesType;

                window.$utils.Add((rowRule || {}).values, (item || {}).values);
              }
              window.$utils.Add(rowRuleList, window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRowRuleItem', window.$utils.Clone(rowRule)));
            }
          }

          if (window.$utils.HasValue({ type: 'nasl.collection.List<app.dataSources.defaultDS.entities.LcapRowRuleItem>', value: rowRuleList })) {
            window.$genInitFromSchema(
              'nasl.collection.List<app.dataSources.defaultDS.entities.LcapRowRuleItem>',
              await window.LcapRequest({
                url: '/api/lcap-row-rule-item/batch',
                method: 'POST',
                extraConfig: {
                  serviceType: 'entity',
                },
                headers: {
                  'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
                },

                data: rowRuleList,
              }),
            );
          }
        }
        this.saveEnabled = true;
        await this.$refs.table_view_1?.reload?.();
      }
    },

    async radios_1_select(event) {
      await this.radios_1_select_select(event);
    },

    async radios_1_select_select() {
      if ((this.dataPermission || {}).rowRuleType == (this.selectDataMeta || {}).rowRuleType) { /* empty */ } else {
        this.saveEnabled = false;
      }
    },

    async link_4_click(event, current) {
      await this.link_4_click_clickUpdateRole(event, current);
    },

    async link_4_click_clickUpdateRole(event, current) {
      this.isUpdateRole = true;
      this.inputRole = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', window.$utils.Clone(((current || {}).item || {}).lcapRole));
      this.updateRoleName = (((current || {}).item || {}).lcapRole || {}).name;
      await this.getRoleNameList();
      await this.$refs[`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`]?.close?.();
      await this.$refs.createORUpdateRolePopup?.open?.();
    },

    async link_3_click(event, current) {
      await this.link_3_click_onClickDeleteRole(event, current);
    },

    async link_3_click_onClickDeleteRole(event, current) {
      this.deleteRoleBody = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapRole', window.$utils.Clone(((current || {}).item || {}).lcapRole));
      await this.$refs[`popup_combination_1_${(current || {}).__nodeKey || (current || {}).index}`]?.close?.();
      await this.$refs.deleteRolePopup?.open?.();
    },

    async uLink1_click(event, current) {
      await this.uLink1_click_remove(event, current);
    },

    async uLink1_click_remove(event, current) {
      this.deleteUserRole = window.$genInitFromSchema('{lcapRole: app.dataSources.defaultDS.entities.LcapRole, lcapUserRoleMapping: app.dataSources.defaultDS.entities.LcapUserRoleMapping}', window.$utils.Clone((current || {}).item));
      await this.$refs.deleteUserRole?.open?.();
    },

    async uLink2_click(event, current) {
      await this.uLink2_click_onClickRemove(event, current);
    },

    async uLink2_click_onClickRemove(event, current) {
      this.removePermission = window.$genInitFromSchema('app.dataSources.defaultDS.entities.LcapPermission', window.$utils.Clone((current || {}).item));
      await this.$refs.removeResourcePopup?.open?.();
    },

    async radios_2_select(event, current) {
      await this.radios_2_select_select(event, current);
    },

    async radios_2_select_select(event, current) {
      if (window.$utils.HasValue({ type: 'nasl.collection.List<app.structures.LcapDataMetaColunmRule>', value: ((current || {}).item || {}).showPropertyNameList })) {
        if (((current || {}).item || {}).propertyPermission == (((current || {}).item || {}).columnRule || {}).columnRuleType && this.saveEnabled) { /* empty */ } else {
          this.saveEnabled = false;
          current.item.propertyPermission = '';
          const $forEachListVariable1pbqpzn1 = ((current || {}).item || {}).showPropertyNameList;
          const $forEachStartVariable1pbqpzn1 = 0;
          const $forEachEndVariable1pbqpzn1 = ($forEachListVariable1pbqpzn1 || {}).length;
          if (Array.isArray($forEachListVariable1pbqpzn1)) {
            for (let index = $forEachStartVariable1pbqpzn1; index < $forEachEndVariable1pbqpzn1; index++) {
              const item = $forEachListVariable1pbqpzn1[index];
              if ((item || {}).isCheck) { /* empty */ } else {
                item.columnRule.columnRuleType = (((current || {}).item || {}).columnRule || {}).columnRuleType;
                window.$utils.Add(this.updateColumnRuleList, (item || {}).columnRule);
                this.updateColumnRuleList = window.$genInitFromSchema(
                  'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>',
                  await window.$utils.ListDistinctByAsync(
                    this.updateColumnRuleList,
                    await (async () => {
                      const arr = [(item1) => (item1 || {}).propertyName];
                      return arr;
                    })(),
                  ),
                );
              }
            }
          }
        }
      } else if (((current || {}).item || {}).propertyPermission == (((current || {}).item || {}).columnRule || {}).columnRuleType) { /* empty */ } else {
        this.saveEnabled = false;
        window.$utils.Add(this.updateColumnRuleList, ((current || {}).item || {}).columnRule);
        this.updateColumnRuleList = window.$genInitFromSchema(
          'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>',
          await window.$utils.ListDistinctByAsync(
            this.updateColumnRuleList,
            await (async () => {
              const arr = [(item) => (item || {}).propertyName];
              return arr;
            })(),
          ),
        );
      }
    },

    async ico_11_click(event, current) {
      await this.ico_11_click_click(event, current);
    },

    async ico_11_click_click(event, current) {
      this.saveEnabled = false;
      window.$utils.Remove(this.customRowRuleList, (current || {}).item);
    },

    async select_1_select(event, current) {
      await this.select_1_select_select(event, current);
    },

    async select_1_select_select(event, current) {
      this.saveEnabled = false;
      current.item.values = '';
    },

    async select_1_change(event, current) {
      await this.select_1_change_change(event, current);
    },

    async select_1_change_change(event, current) {
      current.item.propertyType = (window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', await window.$utils.ListFindAsync(((current || {}).item || {}).propertys, (item) => (item || {}).propertyName == ((current || {}).item || {}).propertyName)) || {}).propertyType;
      current.item.comparisons = window.$genInitFromSchema('nasl.collection.List<app.structures.LcapComparisonResult>', await this.loadComParisonList(((current || {}).item || {}).propertyType));
      current.item.propertyOptions = (window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', await window.$utils.ListFindAsync(((current || {}).item || {}).propertys, (item1) => (item1 || {}).propertyName == ((current || {}).item || {}).propertyName)) || {}).propertyOptions;
      current.item.propertyTitle = (window.$genInitFromSchema('app.structures.LcapDataMetaColunmRule', await window.$utils.ListFindAsync(this.customColunmRuleList, (item1) => (item1 || {}).propertyName == ((current || {}).item || {}).propertyName)) || {}).propertyTitle;
    },

    async select_2_select(event, current) {
      await this.select_2_select_select(event, current);
    },

    async select_2_select_select() {
      this.saveEnabled = false;
    },

    async select_4_select(event, current) {
      await this.select_4_select_select(event, current);
    },

    async select_4_select_select(event, current) {
      this.saveEnabled = false;
      current.item.values = '';
      if ((window.$genInitFromSchema('nasl.ui.ValidateResult', await this.$refs[`validator_4_${(current || {}).__nodeKey || (current || {}).index}`]?.validate?.(undefined, undefined)) || {}).valid) { /* empty */ }
    },

    async input_3_change(event, current) {
      await this.input_3_change_change(event, current);
    },

    async input_3_change_change() {
      this.saveEnabled = false;
    },

    async input_3_blur(event, current) {
      await this.input_3_blur_blur(event, current);
    },

    async input_3_blur_blur(event, current) {
      current.item.values = window.$utils.Trim(((current || {}).item || {}).values);
    },

    async number_input_1_input(event, current) {
      await this.number_input_1_input_input(event, current);
    },

    async number_input_1_input_input() {
      this.saveEnabled = false;
    },

    async select_3_select(event, current) {
      await this.select_3_select_select(event, current);
    },

    async select_3_select_select() {
      this.saveEnabled = false;
    },

    async date_picker_1_change(event, current) {
      await this.date_picker_1_change_change(event, current);
    },

    async date_picker_1_change_change() {
      this.saveEnabled = false;
    },

    async time_picker_1_change(event, current) {
      await this.time_picker_1_change_change(event, current);
    },

    async time_picker_1_change_change() {
      this.saveEnabled = false;
    },

    async date_time_picker_1_change(event, current) {
      await this.date_time_picker_1_change_change(event, current);
    },

    async date_time_picker_1_change_change() {
      this.saveEnabled = false;
    },

    async select_5_select(event, current) {
      await this.select_5_select_select(event, current);
    },

    async select_5_select_select() {
      this.saveEnabled = false;
    },

    async select_6_select(event, current) {
      await this.select_6_select_select(event, current);
    },

    async select_6_select_select() {
      this.saveEnabled = false;
    },

    async dropdown_item_1_click(event, current) {
      await this.dropdown_item_1_click_click(event, current);
    },

    async dropdown_item_1_click_click() {
      const customRowRule = window.$genInitFromSchema('app.structures.LcapDataMetaRowRule', undefined);
      this.saveEnabled = false;
      if (this.relationStr == '+或') { /* empty */ } else {
        customRowRule.comparisons = this.comparisonList;
        customRowRule.propertys = this.customColunmRuleList;
        customRowRule.valuesType = '固定值';

        window.$utils.Add(this.customRowRuleList, window.$genInitFromSchema('app.structures.LcapDataMetaRowRule', window.$utils.Clone(customRowRule)));
      }
      this.relationStr = '+且';
      this.selectDataMeta.relation = 'and';
    },

    async dropdown_item_2_click(event, current) {
      await this.dropdown_item_2_click_click(event, current);
    },

    async dropdown_item_2_click_click() {
      const customRowRule = window.$genInitFromSchema('app.structures.LcapDataMetaRowRule', undefined);
      this.saveEnabled = false;
      if (this.relationStr == '+且') { /* empty */ } else {
        customRowRule.comparisons = this.comparisonList;
        customRowRule.propertys = this.customColunmRuleList;
        customRowRule.valuesType = '固定值';

        window.$utils.Add(this.customRowRuleList, window.$genInitFromSchema('app.structures.LcapDataMetaRowRule', window.$utils.Clone(customRowRule)));
      }
      this.relationStr = '+或';
      this.selectDataMeta.relation = 'or';
    },

    async radios_3_select(event, current1, current) {
      await this.radios_3_select_select(event, current1, current);
    },

    async radios_3_select_select(event, current1, current) {
      const perList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      let filterList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', undefined);
      let isSearched;
      if (((current1 || {}).item || {}).propertyPermission == (((current1 || {}).item || {}).columnRule || {}).columnRuleType && this.saveEnabled) { /* empty */ } else {
        isSearched = true;
        current1.item.propertyPermission = '';
        this.saveEnabled = false;
        window.$utils.Add(this.updateColumnRuleList, ((current1 || {}).item || {}).columnRule);
        this.updateColumnRuleList = window.$genInitFromSchema(
          'nasl.collection.List<app.dataSources.defaultDS.entities.LcapColumnRule>',
          await window.$utils.ListDistinctByAsync(
            this.updateColumnRuleList,
            await (async () => {
              const arr = [(item) => (item || {}).propertyName];
              return arr;
            })(),
          ),
        );
        window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', window.$utils.Clear(perList, 'shallow', 'nasl.collection.List<nasl.core.String>'));
        const $forEachListVariable04sh80e0 = ((current || {}).item || {}).showPropertyNameList;
        const $forEachStartVariable04sh80e0 = 0;
        const $forEachEndVariable04sh80e0 = ($forEachListVariable04sh80e0 || {}).length;
        if (Array.isArray($forEachListVariable04sh80e0)) {
          for (let index = $forEachStartVariable04sh80e0; index < $forEachEndVariable04sh80e0; index++) {
            const item = $forEachListVariable04sh80e0[index];
            if ((item || {}).isCheck) { /* empty */ } else {
              window.$utils.Add(perList, window.$utils.Clone(((item || {}).columnRule || {}).columnRuleType));
            }
          }
        }

        if (isSearched) {
          filterList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListFilterAsync(perList, (item) => item != 'none'));
          if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: filterList })) {
            current.item.columnRule.columnRuleType = '';
          } else {
            isSearched = false;
            current.item.columnRule.columnRuleType = 'none';
          }
        }
        if (isSearched) {
          filterList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListFilterAsync(perList, (item) => item != 'read'));
          if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: filterList })) {
            current.item.columnRule.columnRuleType = '';
          } else {
            isSearched = false;
            current.item.columnRule.columnRuleType = 'read';
          }
        }
        if (isSearched) {
          filterList = window.$genInitFromSchema('nasl.collection.List<nasl.core.String>', await window.$utils.ListFilterAsync(perList, (item) => item != 'readWrite'));
          if (window.$utils.HasValue({ type: 'nasl.collection.List<nasl.core.String>', value: filterList })) {
            current.item.columnRule.columnRuleType = '';
          } else {
            isSearched = false;
            current.item.columnRule.columnRuleType = 'readWrite';
          }
        }
      }
    },

    genviewMatchExpression_1frwyca1(current) {
      return (() => {
        const it = (((current || {}).item || {}).lcapRole || {}).id == (this.selectRole || {}).id;
        if (window.$global.isEqual(it, true)) {
          return '#337EFF';
        } else if (window.$global.isEqual(it, false)) {
          return '#333333';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_18m38t21(current) {
      return (() => {
        const it = (((current || {}).item || {}).lcapRole || {}).id == (this.selectRole || {}).id;
        if (window.$global.isEqual(it, true)) {
          return '#337EFF';
        } else if (window.$global.isEqual(it, false)) {
          return '#333333';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1ir6vid0(current) {
      return (() => {
        const it = (((current || {}).item || {}).lcapRole || {}).id == (this.selectRole || {}).id;
        if (window.$global.isEqual(it, true)) {
          return '#337EFF';
        } else if (window.$global.isEqual(it, false)) {
          return '#333333';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0x8h5k60() {
      return (() => {
        const it = this.selectDataTypeName;
        if (window.$global.isEqual(it, 'entity')) {
          return '实体名称';
        } else if (window.$global.isEqual(it, 'logic')) {
          return '逻辑名称';
        } else {
          return '请输入名称';
        }
      })();
    },

    genviewMatchExpression_17cvxmd1(current) {
      return (() => {
        const it = ((current || {}).item || {}).id == (this.selectDataMeta || {}).id;
        if (window.$global.isEqual(it, true)) {
          return '#337EFF';
        } else if (window.$global.isEqual(it, false)) {
          return '#333333';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0ery1ki0() {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (this.selectDataMeta || {}).showDataName });
        if (window.$global.isEqual(it, true)) {
          return window.$utils.ToString('nasl.core.String', (this.selectDataMeta || {}).showDataName);
        } else if (window.$global.isEqual(it, false)) {
          return '-';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0yvo2yl1() {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (this.selectDataMeta || {}).defaultDataSource });
        if (window.$global.isEqual(it, true)) {
          return window.$utils.ToString('nasl.core.String', (this.selectDataMeta || {}).defaultDataSource);
        } else if (window.$global.isEqual(it, false)) {
          return '-';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1xuav9y1() {
      return (() => {
        const it = window.$utils.HasValue({ type: 'nasl.core.String', value: (this.selectDataMeta || {}).dataDescription });
        if (window.$global.isEqual(it, true)) {
          return window.$utils.ToString('nasl.core.String', '描述：') + window.$utils.ToString('nasl.core.String', (this.selectDataMeta || {}).dataDescription);
        } else if (window.$global.isEqual(it, false)) {
          return '描述：-';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0i8b4n91() {
      return (() => {
        const it = (this.selectDataMeta || {}).hasCreatedBy;
        if (window.$global.isEqual(it, true)) {
          return '无创建人createdBy属性，不支持勾选';
        } else if (window.$global.isEqual(it, false)) {
          return '';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1vnrl1f0() {
      return (() => {
        const it = (this.selectDataMeta || {}).hasCreatedBy;
        if (window.$global.isEqual(it, true)) {
          return '无创建人createdBy属性，不支持勾选';
        } else if (window.$global.isEqual(it, false)) {
          return '';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_00nz6wm0() {
      return (() => {
        const it = (this.selectDataMeta || {}).hasCreatedBy;
        if (window.$global.isEqual(it, true)) {
          return '无创建人createdBy属性，不支持勾选';
        } else if (window.$global.isEqual(it, false)) {
          return '';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_0cuvalp0(current) {
      return (() => {
        const it = ((current || {}).item || {}).propertyType;
        if (window.$global.isEqual(it, 'String')) {
          return (() => {
            const it = ((current || {}).item || {}).comparison;
            if (window.$global.isEqual(it, 'in')) {
              return '请输入字符串，中文逗号分隔';
            } else if (window.$global.isEqual(it, 'notIn')) {
              return '请输入字符串，中文逗号分隔';
            } else {
              return '请输入字符串';
            }
          })();
        } else if (window.$global.isEqual(it, 'Integer')) {
          return (() => {
            const it = ((current || {}).item || {}).comparison;
            if (window.$global.isEqual(it, 'in')) {
              return '请输入整数，中文逗号分隔';
            } else if (window.$global.isEqual(it, 'notIn')) {
              return '请输入整数，中文逗号分隔';
            } else {
              return '请输入整数';
            }
          })();
        } else if (window.$global.isEqual(it, 'Decimal')) {
          return (() => {
            const it = ((current || {}).item || {}).comparison;
            if (window.$global.isEqual(it, 'in')) {
              return '请输入小数，中文逗号分隔';
            } else if (window.$global.isEqual(it, 'notIn')) {
              return '请输入小数，中文逗号分隔';
            } else {
              return '请输入小数';
            }
          })();
        } else if (window.$global.isEqual(it, 'Enum')) {
          return (() => {
            const it = ((current || {}).item || {}).comparison;
            if (window.$global.isEqual(it, 'in')) {
              return '请输入枚举值，中文逗号分隔';
            } else if (window.$global.isEqual(it, 'notIn')) {
              return '请输入枚举值，中文逗号分隔';
            } else {
              return '请输入枚举值';
            }
          })();
        } else {
          return '请输入';
        }
      })();
    },

    genviewMatchExpression_12n6bl70(current) {
      return (() => {
        const it = ((current || {}).item || {}).comparison;
        if (window.$global.isEqual(it, 'in')) {
          return '请输入字符串，中文逗号分隔';
        } else if (window.$global.isEqual(it, 'notIn')) {
          return '请输入字符串，中文逗号分隔';
        } else {
          return '请输入字符串';
        }
      })();
    },

    genviewMatchExpression_090t9oq1(current) {
      return (() => {
        const it = ((current || {}).item || {}).comparison;
        if (window.$global.isEqual(it, 'in')) {
          return '请输入整数，中文逗号分隔';
        } else if (window.$global.isEqual(it, 'notIn')) {
          return '请输入整数，中文逗号分隔';
        } else {
          return '请输入整数';
        }
      })();
    },

    genviewMatchExpression_0b2h3t41(current) {
      return (() => {
        const it = ((current || {}).item || {}).comparison;
        if (window.$global.isEqual(it, 'in')) {
          return '请输入小数，中文逗号分隔';
        } else if (window.$global.isEqual(it, 'notIn')) {
          return '请输入小数，中文逗号分隔';
        } else {
          return '请输入小数';
        }
      })();
    },

    genviewMatchExpression_0xr1qqf1(current) {
      return (() => {
        const it = ((current || {}).item || {}).comparison;
        if (window.$global.isEqual(it, 'in')) {
          return '请输入枚举值，中文逗号分隔';
        } else if (window.$global.isEqual(it, 'notIn')) {
          return '请输入枚举值，中文逗号分隔';
        } else {
          return '请输入枚举值';
        }
      })();
    },

    genviewMatchExpression_1k1u47g0(current) {
      return (() => {
        const it = ((current || {}).item || {}).propertyType;
        if (window.$global.isEqual(it, 'Integer')) {
          return '请输入整数';
        } else if (window.$global.isEqual(it, 'Decimal')) {
          return '请输入小数';
        } else {
          return '请输入整数';
        }
      })();
    },

    genviewMatchExpression_0v37snf0(current) {
      return (() => {
        const it = ((current || {}).item || {}).propertyType;
        if (window.$global.isEqual(it, 'Integer')) {
          return 0;
        } else if (window.$global.isEqual(it, 'Decimal')) {
          return 3;
        } else {
          return 0;
        }
      })();
    },

    genviewMatchExpression_0d1xtqo0(current1) {
      return (() => {
        const it = ((current1 || {}).item || {}).isCheck;
        if (window.$global.isEqual(it, true)) {
          return '系统属性不支持数据权限控制';
        } else if (window.$global.isEqual(it, false)) {
          return '';
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1neg2xq1(current) {
      return (() => {
        const it = ((current || {}).item || {}).isCheck;
        if (window.$global.isEqual(it, true)) {
          return '系统属性不支持数据权限控制';
        } else if (window.$global.isEqual(it, false)) {
          return '';
        } else { /* empty */ }
      })();
    },

    __tableView_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tableView_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{lcapRole: app.dataSources.defaultDS.entities.LcapRole}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/LcapLoadRoleManagementTableView',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/roleManagement/0',
            },
            data: {
              page: this.tableView_state_page,
              size: this.tableView_state_size,
              sort: this.tableView_state_sort,
              order: this.tableView_state_order,
              filter: this.filterRole,
            },
          }),
        );
      });
    },

    __tableView_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tableView_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaStructure>', await this.loadDataMeta());
      });
    },

    __table_view_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__table_view_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema('nasl.collection.List<app.structures.LcapDataMetaColunmRule>', await this.loadDataMetaColunmRule());
      });
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.roleManagement_created();
  },
};
</script>
