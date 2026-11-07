<template>
  <u-linear-layout
    ref="uLinearLayout1"
    class="cw-style-height"
    type="root"
    gap="none"
    style="--cw-style-height: 100%; height: 100%; --custom-start: auto; min-height: 200px"
  >
    <u-router-view ref="router_view1"></u-router-view>
    <u-grid-layout ref="grid_layout_2">
      <u-grid-layout-row
        ref="grid_layout_row_2"
        :repeat="24"
      >
        <u-grid-layout-column
          ref="grid_layout_column_4"
          class="cw-style-background-color cw-style-color"
          :span="16"
          :wrap="true"
          style="--cw-style-background-color: #f7f9fa; --cw-style-color: #0d0d0d; background-color: #f7f9fa; color: #0d0d0d"
        >
          <u-linear-layout
            ref="linear_layout_2"
            direction="vertical"
            :wrap="true"
          >
            <u-linear-layout
              ref="linear_layout_3"
              :wrap="true"
            >
              <u-panel
                ref="panel_1"
                class="cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                style="--cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px"
              >
                <template
                  #title

                ></template>
                <template
                  #extra

                ></template>
                <u-linear-layout
                  ref="linear_layout_27"
                  direction="vertical"
                  :wrap="true"
                >
                  <u-linear-layout
                    ref="linear_layout_28"
                    :wrap="true"
                  >
                    <u-grid-layout ref="grid_layout_15">
                      <u-grid-layout-row
                        ref="grid_layout_row_15"
                        :repeat="24"
                      >
                        <u-grid-layout-column
                          ref="grid_layout_column_39"
                          :span="12"
                          :wrap="true"
                        >
                          <u-absolute-layout
                            ref="absolute_layout_17"
                            class="cw-style-height cw-style-background-color cw-style-background-image cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                            @click="absolute_layout_17_click($event)"
                            style="--cw-style-height: 144px; --cw-style-background-color: #bf1515; --cw-style-background-image: url(/assets/user/jasonzcmu/1765412937304_02a852183c1c4755ab3ff21cda3d16f3.webp); --cw-style-border-top-left-radius: 25px; --cw-style-border-top-right-radius: 25px; --cw-style-border-bottom-left-radius: 25px; --cw-style-border-bottom-right-radius: 25px; height: 144px; background-color: #bf1515; background-image: url(/assets/user/jasonzcmu/1765412937304_02a852183c1c4755ab3ff21cda3d16f3.webp); background-size: cover; background-repeat: no-repeat; background-position: center center; border-top-left-radius: 25px; border-bottom-left-radius: 25px; border-top-right-radius: 25px; border-bottom-right-radius: 25px"
                          >
                            <u-text
                              ref="text_47"
                              class="cw-style-width cw-style-height cw-style-font-size cw-style-color"
                              :text="$utils['ToString']('nasl.core.Long', toDo)"
                              color="default"
                              :style="{}"
                              style="--cw-style-width: 30px; --cw-style-height: 34.9896px; --cw-style-font-size: 30px; --cw-style-color: #ffffff; left: 32.85417175292969px; top: 10px; right: unset; bottom: unset; z-index: 1; visibility: visible; --constraint-x: left; --constraint-y: top; transform: none; width: 30px; height: 34.9896px; font-size: 30px; color: #ffffff"
                            ></u-text>
                            <u-text
                              ref="text_48"
                              class="cw-style-width cw-style-height cw-style-font-size cw-style-color"
                              text="我的待办"
                              color="default"
                              :style="{}"
                              style="--cw-style-width: 245.385px; --cw-style-height: 21.5417px; --cw-style-font-size: 30px; --cw-style-color: #ffffff; visibility: visible; width: 245.385px; height: 21.5417px; font-size: 30px; color: #ffffff; --constraint-x: left; --constraint-y: top; right: unset; left: 32.85417175292969px; top: 50.45832824707031px; bottom: unset; transform: none; z-index: 2"
                            ></u-text>
                            <i-ico
                              ref="ico_3"
                              class="cw-style-color"
                              name="right-arrow"
                              icotype="only"
                              style="--cw-style-color: #ffffff; left: 32.85417175292969px; top: unset; z-index: 3; right: unset; bottom: 18.135421752929688px; --constraint-x: left; --constraint-y: bottom; transform: none; color: #ffffff"
                            >
                              <u-text
                                ref="text_51"
                                text="图标"
                              ></u-text>
                            </i-ico>
                          </u-absolute-layout>
                        </u-grid-layout-column>
                        <u-grid-layout-column
                          ref="grid_layout_column_43"
                          :span="12"
                          :wrap="true"
                        >
                          <u-absolute-layout
                            ref="absolute_layout_21"
                            class="cw-style-height cw-style-background-color cw-style-background-image cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                            @click="absolute_layout_21_click($event)"
                            style="--cw-style-height: 144px; --cw-style-background-color: #bf1515; --cw-style-background-image: url(/assets/user/jasonzcmu/1765414099120_97443ec761da425184ea1c403bd56fb1.webp); --cw-style-border-top-left-radius: 25px; --cw-style-border-top-right-radius: 25px; --cw-style-border-bottom-left-radius: 25px; --cw-style-border-bottom-right-radius: 25px; height: 144px; background-color: #bf1515; background-image: url(/assets/user/jasonzcmu/1765414099120_97443ec761da425184ea1c403bd56fb1.webp); background-size: cover; background-repeat: no-repeat; background-position: center center; border-top-left-radius: 25px; border-bottom-left-radius: 25px; border-top-right-radius: 25px; border-bottom-right-radius: 25px"
                          >
                            <u-text
                              ref="text_61"
                              class="cw-style-width cw-style-height cw-style-font-size cw-style-color"
                              :text="$utils['ToString']('nasl.core.Long', notFinish)"
                              color="default"
                              :style="{}"
                              style="--cw-style-width: 30px; --cw-style-height: 34.9896px; --cw-style-font-size: 30px; --cw-style-color: #ffffff; left: 32.85418701171875px; top: 10px; right: unset; bottom: unset; z-index: 1; visibility: visible; --constraint-x: left; --constraint-y: top; transform: none; width: 30px; height: 34.9896px; font-size: 30px; color: #ffffff"
                            ></u-text>
                            <u-text
                              ref="text_62"
                              class="cw-style-width cw-style-height cw-style-font-size cw-style-color"
                              text="我的发起（未完成）"
                              color="default"
                              :style="{}"
                              style="--cw-style-width: 292.302px; --cw-style-height: 43.1042px; --cw-style-font-size: 30px; --cw-style-color: #ffffff; visibility: visible; width: 292.302px; height: 43.1042px; font-size: 30px; color: #ffffff; --constraint-x: left; --constraint-y: center; right: unset; left: 32.85418701171875px; top: calc(50% + 0.0000057220458984375px); bottom: unset; transform: translateY(-50%); z-index: 2"
                            ></u-text>
                            <i-ico
                              ref="ico_7"
                              class="cw-style-color"
                              name="right-arrow"
                              icotype="only"
                              style="--cw-style-color: #ffffff; left: 32.85417175292969px; top: unset; z-index: 3; right: unset; bottom: 18.135421752929688px; --constraint-x: left; --constraint-y: bottom; transform: none; color: #ffffff"
                            >
                              <u-text
                                ref="text_63"
                                text="图标"
                              ></u-text>
                            </i-ico>
                          </u-absolute-layout>
                        </u-grid-layout-column>
                      </u-grid-layout-row>
                    </u-grid-layout>
                  </u-linear-layout>
                  <u-linear-layout
                    ref="linear_layout_29"
                    :wrap="true"
                  >
                    <u-grid-layout ref="grid_layout_13">
                      <u-grid-layout-row
                        ref="grid_layout_row_13"
                        :repeat="24"
                      >
                        <u-grid-layout-column
                          ref="grid_layout_column_34"
                          :span="4"
                          :wrap="true"
                        >
                          <u-linear-layout
                            ref="linear_layout_31"
                            direction="vertical"
                            :wrap="true"
                            mode="flex"
                            alignment="center"
                            justify="center"
                          >
                            <u-linear-layout
                              ref="linear_layout_32"
                              class="cw-style-width cw-style-height"
                              :wrap="true"
                              gap="normal"
                              mode="flex"
                              justify="center"
                              alignment="start"
                              style="--cw-style-width: 64px; --cw-style-height: 64px; width: 64px; height: 64px"
                            >
                              <i-ico
                                ref="ico_10"
                                class="cw-style-width cw-style-height cw-style-text-align cw-style-font-size"
                                name="/assets/user/jasonzcmu/1765408861214_8184c5c80afa42649aa073ae6f826929.svg"
                                icotype="only"
                                style="--cw-style-width: 64px; --cw-style-height: 64px; --cw-style-text-align: center; --cw-style-font-size: 32px; width: 64px; height: 64px; font-size: 32px; position: static; text-align: center"
                              >
                                <u-text
                                  ref="text_66"
                                  text="图标"
                                ></u-text>
                              </i-ico>
                            </u-linear-layout>
                            <u-linear-layout
                              ref="linear_layout_33"
                              class="cw-style-font-size"
                              :wrap="true"
                              gap="normal"
                              style="--cw-style-font-size: 12px; --space-base: 16px; font-size: 12px"
                            >
                              <u-text
                                ref="text_68"
                                class="cw-style-width cw-style-font-size cw-style-color"
                                size="small"
                                text="考勤申请"
                                style="--cw-style-width: 64px; --cw-style-font-size: 24px; --cw-style-color: #0d0d0d; width: 64px; font-size: 24px; color: #0d0d0d"
                              ></u-text>
                            </u-linear-layout>
                          </u-linear-layout>
                        </u-grid-layout-column>
                        <u-grid-layout-column
                          ref="grid_layout_column_45"
                          :span="4"
                          :wrap="true"
                        >
                          <u-linear-layout
                            ref="linear_layout_40"
                            direction="vertical"
                            :wrap="true"
                            mode="flex"
                            alignment="center"
                            justify="center"
                          >
                            <u-linear-layout
                              ref="linear_layout_41"
                              class="cw-style-width cw-style-height"
                              :wrap="true"
                              gap="normal"
                              mode="flex"
                              justify="center"
                              alignment="start"
                              style="--cw-style-width: 64px; --cw-style-height: 64px; width: 64px; height: 64px"
                            >
                              <i-ico
                                ref="ico_13"
                                class="cw-style-width cw-style-height cw-style-text-align cw-style-font-size"
                                name="add"
                                icotype="only"
                                style="--cw-style-width: 64px; --cw-style-height: 64px; --cw-style-text-align: center; --cw-style-font-size: 32px; width: 64px; height: 64px; font-size: 32px; position: static; text-align: center"
                              >
                                <u-text
                                  ref="text_74"
                                  text="图标"
                                ></u-text>
                              </i-ico>
                            </u-linear-layout>
                            <u-linear-layout
                              ref="linear_layout_42"
                              class="cw-style-font-size"
                              :wrap="true"
                              gap="normal"
                              style="--cw-style-font-size: 12px; --space-base: 16px; font-size: 12px"
                            >
                              <u-text
                                ref="text_73"
                                class="cw-style-width cw-style-font-size cw-style-color"
                                size="small"
                                text="定制"
                                style="--cw-style-width: 64px; --cw-style-font-size: 24px; --cw-style-color: #0d0d0d; width: 64px; font-size: 24px; color: #0d0d0d"
                              ></u-text>
                            </u-linear-layout>
                          </u-linear-layout>
                        </u-grid-layout-column>
                      </u-grid-layout-row>
                    </u-grid-layout>
                  </u-linear-layout>
                </u-linear-layout>
              </u-panel>
            </u-linear-layout>
            <u-linear-layout
              ref="linear_layout_4"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_20"
                direction="horizontal"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_24"
                  direction="horizontal"
                  :wrap="true"
                >
                  <u-linear-layout
                    ref="linear_layout_25"
                    direction="horizontal"
                    :wrap="true"
                  >
                    <u-grid-layout ref="grid_layout_9">
                      <u-grid-layout-row
                        ref="grid_layout_row_9"
                        :repeat="24"
                      >
                        <u-grid-layout-column
                          ref="grid_layout_column_24"
                          :span="12"
                          :wrap="true"
                        >
                          <u-panel
                            ref="panel_5"
                            class="cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                            style="--cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px"
                          >
                            <template
                              #title

                            >
                              <u-text
                                ref="text_17"
                                text="常用应用"
                              ></u-text>
                            </template>
                            <template
                              #extra

                            ></template>
                            <u-grid-layout ref="grid_layout_25">
                              <u-grid-layout-row
                                ref="grid_layout_row_25"
                                :repeat="24"
                              >
                                <u-grid-layout-column
                                  ref="grid_layout_column_70"
                                  :span="6"
                                  :wrap="true"
                                >
                                  <u-linear-layout
                                    ref="linear_layout_63"
                                    class="cw-style-width"
                                    direction="vertical"
                                    :wrap="true"
                                    mode="flex"
                                    alignment="center"
                                    justify="center"
                                    style="--cw-style-width: 80px; width: 80px"
                                  >
                                    <u-linear-layout
                                      ref="linear_layout_64"
                                      class="cw-style-width cw-style-height"
                                      :wrap="true"
                                      gap="normal"
                                      mode="flex"
                                      justify="center"
                                      alignment="start"
                                      style="--cw-style-width: 64px; --cw-style-height: 64px; width: 64px; height: 64px"
                                    >
                                      <i-ico
                                        ref="ico_18"
                                        class="cw-style-width cw-style-height cw-style-text-align cw-style-font-size"
                                        name="/assets/user/jasonzcmu/1765412044117_6f3e2ffdb0714f98b3675eb51093de51.svg"
                                        icotype="only"
                                        destination="/oaSys/myProcess"
                                        style="--cw-style-width: 64px; --cw-style-height: 64px; --cw-style-text-align: center; --cw-style-font-size: 32px; width: 64px; height: 64px; font-size: 32px; position: static; text-align: center"
                                      >
                                        <u-text
                                          ref="text_133"
                                          text="图标"
                                        ></u-text>
                                      </i-ico>
                                    </u-linear-layout>
                                    <u-linear-layout
                                      ref="linear_layout_65"
                                      class="cw-style-font-size"
                                      :wrap="true"
                                      gap="normal"
                                      style="--cw-style-font-size: 12px; --space-base: 16px; font-size: 12px"
                                    >
                                      <u-text
                                        ref="text_132"
                                        class="cw-style-width cw-style-font-size"
                                        size="small"
                                        text="我的流程"
                                        style="--cw-style-width: 64px; --cw-style-font-size: 12px; width: 64px; font-size: 12px"
                                      ></u-text>
                                    </u-linear-layout>
                                  </u-linear-layout>
                                </u-grid-layout-column>
                                <u-grid-layout-column
                                  ref="grid_layout_column_71"
                                  :span="6"
                                  :wrap="true"
                                >
                                  <u-linear-layout
                                    ref="linear_layout_66"
                                    class="cw-style-width"
                                    direction="vertical"
                                    :wrap="true"
                                    mode="flex"
                                    alignment="center"
                                    justify="center"
                                    style="--cw-style-width: 80px; width: 80px"
                                  >
                                    <u-linear-layout
                                      ref="linear_layout_67"
                                      class="cw-style-width cw-style-height"
                                      :wrap="true"
                                      gap="normal"
                                      mode="flex"
                                      justify="center"
                                      alignment="start"
                                      style="--cw-style-width: 64px; --cw-style-height: 64px; width: 64px; height: 64px"
                                    >
                                      <i-ico
                                        ref="ico_19"
                                        class="cw-style-width cw-style-height cw-style-text-align cw-style-font-size"
                                        name="/assets/user/jasonzcmu/1765381594131_5ef19a2cebcb491991dadf690a5f974f.svg"
                                        icotype="only"
                                        destination="/oaSys/myAsset"
                                        style="--cw-style-width: 64px; --cw-style-height: 64px; --cw-style-text-align: center; --cw-style-font-size: 32px; width: 64px; height: 64px; font-size: 32px; position: static; text-align: center"
                                      >
                                        <u-text
                                          ref="text_135"
                                          text="图标"
                                        ></u-text>
                                      </i-ico>
                                    </u-linear-layout>
                                    <u-linear-layout
                                      ref="linear_layout_68"
                                      class="cw-style-font-size"
                                      :wrap="true"
                                      gap="normal"
                                      style="--cw-style-font-size: 12px; --space-base: 16px; font-size: 12px"
                                    >
                                      <u-text
                                        ref="text_134"
                                        class="cw-style-width cw-style-font-size cw-style-color"
                                        size="small"
                                        text="我的资产"
                                        style="--cw-style-width: 64px; --cw-style-font-size: 12px; --cw-style-color: #0d0d0d; width: 64px; font-size: 12px; color: #0d0d0d"
                                      ></u-text>
                                    </u-linear-layout>
                                  </u-linear-layout>
                                </u-grid-layout-column>
                                <u-grid-layout-column
                                  ref="grid_layout_column_72"
                                  :span="6"
                                  :wrap="true"
                                >
                                  <u-linear-layout
                                    ref="linear_layout_69"
                                    class="cw-style-width"
                                    direction="vertical"
                                    :wrap="true"
                                    mode="flex"
                                    alignment="center"
                                    justify="center"
                                    style="--cw-style-width: 80px; width: 80px"
                                  >
                                    <u-linear-layout
                                      ref="linear_layout_70"
                                      class="cw-style-width cw-style-height"
                                      :wrap="true"
                                      gap="normal"
                                      mode="flex"
                                      justify="center"
                                      alignment="start"
                                      style="--cw-style-width: 64px; --cw-style-height: 64px; width: 64px; height: 64px"
                                    >
                                      <i-ico
                                        ref="ico_20"
                                        class="cw-style-width cw-style-height cw-style-text-align cw-style-font-size"
                                        name="/assets/user/jasonzcmu/1765408967094_f95f7a3ac6b7403ea9d14c237cbeb462.svg"
                                        icotype="only"
                                        destination="/oaSys/mySchedule"
                                        style="--cw-style-width: 64px; --cw-style-height: 64px; --cw-style-text-align: center; --cw-style-font-size: 32px; width: 64px; height: 64px; font-size: 32px; position: static; text-align: center"
                                      >
                                        <u-text
                                          ref="text_137"
                                          text="图标"
                                        ></u-text>
                                      </i-ico>
                                    </u-linear-layout>
                                    <u-linear-layout
                                      ref="linear_layout_71"
                                      class="cw-style-font-size"
                                      :wrap="true"
                                      gap="normal"
                                      style="--cw-style-font-size: 12px; --space-base: 16px; font-size: 12px"
                                    >
                                      <u-text
                                        ref="text_136"
                                        class="cw-style-width cw-style-font-size cw-style-color"
                                        size="small"
                                        text="我的日程"
                                        style="--cw-style-width: 64px; --cw-style-font-size: 12px; --cw-style-color: #0d0d0d; width: 64px; font-size: 12px; color: #0d0d0d"
                                      ></u-text>
                                    </u-linear-layout>
                                  </u-linear-layout>
                                </u-grid-layout-column>
                                <u-grid-layout-column
                                  ref="grid_layout_column_73"
                                  :span="6"
                                  :wrap="true"
                                >
                                  <u-linear-layout
                                    ref="linear_layout_72"
                                    class="cw-style-width"
                                    direction="vertical"
                                    :wrap="true"
                                    mode="flex"
                                    alignment="center"
                                    justify="center"
                                    style="--cw-style-width: 80px; width: 80px"
                                  >
                                    <u-linear-layout
                                      ref="linear_layout_73"
                                      class="cw-style-width cw-style-height"
                                      :wrap="true"
                                      gap="normal"
                                      mode="flex"
                                      justify="center"
                                      alignment="start"
                                      style="--cw-style-width: 64px; --cw-style-height: 64px; width: 64px; height: 64px"
                                    >
                                      <i-ico
                                        ref="ico_21"
                                        class="cw-style-width cw-style-height cw-style-text-align cw-style-font-size"
                                        name="/assets/user/jasonzcmu/1765422114414_848a672543054915a482e465b6499168.svg"
                                        icotype="only"
                                        destination="/oaSys/myClock"
                                        style="--cw-style-width: 64px; --cw-style-height: 64px; --cw-style-text-align: center; --cw-style-font-size: 32px; width: 64px; height: 64px; font-size: 32px; position: static; text-align: center"
                                      >
                                        <u-text
                                          ref="text_139"
                                          text="图标"
                                        ></u-text>
                                      </i-ico>
                                    </u-linear-layout>
                                    <u-linear-layout
                                      ref="linear_layout_74"
                                      class="cw-style-font-size"
                                      :wrap="true"
                                      gap="normal"
                                      style="--cw-style-font-size: 12px; --space-base: 16px; font-size: 12px"
                                    >
                                      <u-text
                                        ref="text_138"
                                        class="cw-style-width cw-style-font-size cw-style-color"
                                        size="small"
                                        text="我的考勤"
                                        style="--cw-style-width: 64px; --cw-style-font-size: 12px; --cw-style-color: #0d0d0d; width: 64px; font-size: 12px; color: #0d0d0d"
                                      ></u-text>
                                    </u-linear-layout>
                                  </u-linear-layout>
                                </u-grid-layout-column>
                              </u-grid-layout-row>
                            </u-grid-layout>
                          </u-panel>
                        </u-grid-layout-column>
                        <u-grid-layout-column
                          ref="grid_layout_column_25"
                          :span="12"
                          :wrap="true"
                        >
                          <u-panel
                            ref="panel_6"
                            class="cw-style-height cw-style-color cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                            style="--cw-style-height: 179.32px; --cw-style-color: #625c5c; --cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px; height: 179.32px; color: #625c5c"
                          >
                            <template
                              #title

                            >
                              <u-text
                                ref="text_19"
                                text="考勤信息"
                              ></u-text>
                            </template>
                            <template
                              #extra

                            ></template>
                            <u-grid-layout
                              ref="grid_layout_26"
                              class="cw-style-background-color"
                              style="--cw-style-background-color: #f6f8f9; background-color: #f6f8f9"
                            >
                              <u-grid-layout-row
                                ref="grid_layout_row_26"
                                :repeat="24"
                              >
                                <u-grid-layout-column
                                  ref="grid_layout_column_74"
                                  :span="8"
                                  :wrap="true"
                                >
                                  <u-linear-layout
                                    ref="linear_layout_76"
                                    class="cw-style-text-align"
                                    direction="vertical"
                                    :wrap="true"
                                    gap="normal"
                                    style="--cw-style-text-align: center; text-align: center; --space-base: 4px"
                                  >
                                    <u-linear-layout
                                      ref="linear_layout_77"
                                      class="cw-style-font-weight"
                                      :wrap="true"
                                      style="--cw-style-font-weight: bold; font-weight: bold"
                                    >
                                      <u-text
                                        ref="text_140"
                                        class="cw-style-font-size cw-style-font-weight"
                                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_00gqe2i1())"
                                        style="--cw-style-font-size: 20px; --cw-style-font-weight: bold; font-size: 20px; font-weight: bold"
                                      ></u-text>
                                    </u-linear-layout>
                                    <u-linear-layout
                                      ref="linear_layout_78"
                                      :wrap="true"
                                    >
                                      <u-text
                                        ref="text_141"
                                        class="cw-style-font-size cw-style-color"
                                        text="上班卡"
                                        style="--cw-style-font-size: 12px; --cw-style-color: #625c5c; font-size: 12px; color: #625c5c"
                                      ></u-text>
                                    </u-linear-layout>
                                  </u-linear-layout>
                                </u-grid-layout-column>
                                <u-grid-layout-column
                                  ref="grid_layout_column_75"
                                  :span="8"
                                  :wrap="true"
                                >
                                  <u-divider
                                    ref="divider_1"
                                    class="cw-style-color"
                                    dashed="a"
                                    style="--cw-style-color: #787a7d; color: #787a7d"
                                  ></u-divider>
                                </u-grid-layout-column>
                                <u-grid-layout-column
                                  ref="grid_layout_column_76"
                                  :span="8"
                                  :wrap="true"
                                >
                                  <u-linear-layout
                                    ref="linear_layout_79"
                                    class="cw-style-text-align"
                                    direction="vertical"
                                    :wrap="true"
                                    gap="normal"
                                    style="--cw-style-text-align: center; text-align: center; --space-base: 4px"
                                  >
                                    <u-linear-layout
                                      ref="linear_layout_80"
                                      class="cw-style-font-weight"
                                      :wrap="true"
                                      style="--cw-style-font-weight: bold; font-weight: bold"
                                    >
                                      <u-text
                                        ref="text_144"
                                        class="cw-style-font-size"
                                        :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_0ohaowj0())"
                                        style="--cw-style-font-size: 20px; font-size: 20px"
                                      ></u-text>
                                    </u-linear-layout>
                                    <u-linear-layout
                                      ref="linear_layout_81"
                                      :wrap="true"
                                    >
                                      <u-text
                                        ref="text_145"
                                        class="cw-style-font-size"
                                        text="下班卡"
                                        style="--cw-style-font-size: 12px; font-size: 12px"
                                      ></u-text>
                                    </u-linear-layout>
                                  </u-linear-layout>
                                </u-grid-layout-column>
                              </u-grid-layout-row>
                            </u-grid-layout>
                          </u-panel>
                        </u-grid-layout-column>
                      </u-grid-layout-row>
                    </u-grid-layout>
                  </u-linear-layout>
                </u-linear-layout>
              </u-linear-layout>
            </u-linear-layout>
          </u-linear-layout>
        </u-grid-layout-column>
        <u-grid-layout-column
          ref="grid_layout_column_5"
          :span="8"
          :wrap="true"
        >
          <u-linear-layout
            ref="linear_layout_6"
            direction="vertical"
            :wrap="true"
          >
            <u-linear-layout
              ref="linear_layout_7"
              :wrap="true"
            >
              <u-linear-layout
                ref="linear_layout_16"
                direction="vertical"
                :wrap="true"
              >
                <u-linear-layout
                  ref="linear_layout_17"
                  :wrap="true"
                >
                  <u-panel
                    ref="panel_2"
                    class="cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                    style="--cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px"
                  >
                    <template
                      #title

                    ></template>
                    <template
                      #extra

                    ></template>
                    <u-absolute-layout
                      ref="absolute_layout_22"
                      class="cw-style-height"
                      style="--cw-style-height: 150px; height: 150px"
                    >
                      <u-image
                        ref="image_1"
                        class="cw-style-width cw-style-height"
                        :src="(userMessage || {}).picture"
                        fit="contain"
                        :circle="true"
                        style="--cw-style-width: 60px; --cw-style-height: 60px; width: 60px; left: 10.28125px; top: 9.635421752929688px; right: unset; bottom: unset; z-index: 1; visibility: visible; --constraint-x: left; --constraint-y: top; transform: none; height: 60px"
                      ></u-image>
                      <u-linear-layout
                        ref="linear_layout_82"
                        class="cw-style-width cw-style-height cw-style-background-color cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                        direction="horizontal"
                        mode="flex"
                        :wrap="false"
                        alignment="center"
                        justify="start"
                        style="--cw-style-width: 80%; --cw-style-height: 26.0995px; --cw-style-background-color: #bdf9fa; --cw-style-border-top-left-radius: 6px; --cw-style-border-top-right-radius: 6px; --cw-style-border-bottom-left-radius: 6px; --cw-style-border-bottom-right-radius: 6px; width: 80%; left: 23.0555419921875px; top: unset; right: unset; bottom: 30.081026077270508px; z-index: 7; visibility: visible; --constraint-x: left; --constraint-y: bottom; transform: none; border-top-left-radius: 6px; border-bottom-left-radius: 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px; height: 26.0995px; background-color: #bdf9fa"
                      >
                        <u-image
                          ref="image_2"
                          key="image_2"
                          class="cw-style-width cw-style-height cw-style-text-align cw-style-margin-left cw-style-margin"
                          src="/assets/user/jasonzcmu/1766028436545_631dfa684d3f49798b2752471025f5d0.png"
                          fit="contain"
                          :circle="true"
                          v-if="$utils['Contains']((userMessage || {}).badge, `创新`)"
                          style="--cw-style-width: 20px; --cw-style-height: 20px; --cw-style-text-align: center; --cw-style-margin-left: 10px; width: 20px; visibility: visible; height: 20px; text-align: center; margin-left: 10px"
                        ></u-image>
                        <u-image
                          ref="image_11"
                          key="image_11"
                          class="cw-style-width cw-style-height"
                          src="/assets/user/jasonzcmu/1766028443524_46575fba21ed4ae4b3e800ce41bf4e91.png"
                          fit="contain"
                          :circle="true"
                          v-if="$utils['Contains']((userMessage || {}).badge, `热爱`)"
                          style="--cw-style-width: 20px; --cw-style-height: 20px; width: 20px; visibility: visible; height: 20px"
                        ></u-image>
                        <u-image
                          ref="image_12"
                          key="image_12"
                          class="cw-style-width cw-style-height"
                          src="/assets/user/jasonzcmu/1766028444514_a5e04f919ca3451cb92712fa826a15b4.png"
                          fit="contain"
                          :circle="true"
                          v-if="$utils['Contains']((userMessage || {}).badge, `用户`)"
                          style="--cw-style-width: 20px; --cw-style-height: 20px; width: 20px; visibility: visible; height: 20px"
                        ></u-image>
                        <u-image
                          ref="image_13"
                          key="image_13"
                          class="cw-style-width cw-style-height"
                          src="/assets/user/jasonzcmu/1766028438201_df08819884324e888a5b053d12e12b4c.png"
                          fit="contain"
                          :circle="true"
                          v-if="$utils['Contains']((userMessage || {}).badge, `一周年`)"
                          style="--cw-style-width: 20px; --cw-style-height: 20px; width: 20px; visibility: visible; height: 20px"
                        ></u-image>
                      </u-linear-layout>
                      <u-linear-layout
                        ref="linear_layout_84"
                        direction="vertical"
                        :wrap="true"
                        style="left: 80.27783203125px; top: 9.629638671875px; z-index: 8; right: unset; bottom: unset; --constraint-x: left; --constraint-y: top; transform: none"
                      >
                        <u-linear-layout
                          ref="linear_layout_85"
                          :wrap="true"
                        >
                          <u-text
                            ref="text_75"
                            class="cw-style-color"
                            :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', (userMessage || {}).userName) + $utils['ToString']('nasl.core.String', genviewMatchExpression_09qrua80()))"
                            overflow="nowrap"
                            style="--cw-style-color: #060606; visibility: visible; color: #060606"
                          ></u-text>
                        </u-linear-layout>
                        <u-linear-layout
                          ref="linear_layout_86"
                          :wrap="true"
                        >
                          <u-text
                            ref="text_76"
                            class="cw-style-width cw-style-height cw-style-color"
                            :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_02vm0pv0())"
                            display="block"
                            size="small"
                            overflow="nowrap"
                            style="--cw-style-width: 127.292px; --cw-style-height: 20.7812px; --cw-style-color: #090909; visibility: visible; width: 127.292px; height: 20.7812px; color: #090909"
                          ></u-text>
                        </u-linear-layout>
                      </u-linear-layout>
                    </u-absolute-layout>
                  </u-panel>
                </u-linear-layout>
                <u-linear-layout
                  ref="linear_layout_18"
                  :wrap="true"
                >
                  <u-panel
                    ref="panel_3"
                    class="cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                    style="--cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px"
                  >
                    <template
                      #title

                    >
                      <u-text
                        ref="text_12"
                        text="日程"
                      ></u-text>
                    </template>
                    <template
                      #extra

                    ></template>
                    <u-linear-layout
                      ref="linear_layout_95"
                      class="cw-style-background-color cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                      direction="horizontal"
                      :wrap="true"
                      style="--cw-style-background-color: #fafafa; --cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; background-color: #fafafa; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px"
                    >
                      <u-table-view
                        ref="tableView_3"
                        @sync:state="(key, val) => onSyncState('tableView_3', key, val)"
                        :dataSource="__tableView_3_handleDataSourceLoad()"
                        dataSchema="LoadHomePageTableView3Structure"
                        valueField="schedule.id"
                        :pagination="false"
                        :showSizer="true"
                        :pageSize="20"
                        :pageNumber="1"
                        :showHead="false"
                        designerMode="empty"
                        v-dependencies.reload="[]"
                        key="tableView_3"
                        style="--table-view-border-color: #ffffff"
                      >
                        <template
                          #loading

                        ></template>
                        <template
                          #error

                        ></template>
                        <template
                          #empty

                        >
                          <u-linear-layout
                            ref="linear_layout_137"
                            class="cw-style-text-align"
                            direction="horizontal"
                            :wrap="true"
                            style="--cw-style-text-align: left; text-align: left"
                          >
                            <u-text
                              ref="text_437"
                              text="今日暂无日程"
                            ></u-text>
                          </u-linear-layout>
                        </template>
                        <template
                          #dragGhost=""

                        ></template>
                        <u-table-view-column
                          ref="table_view_column_45"
                          key="table_view_column_45"
                        >
                          <template
                            #expander="current"

                          >
                            <u-table-view-expander
                              :ref="`table_view_expander_45_${(current || {}).__nodeKey || (current || {}).index}`"
                              :item="(current || {}).item"
                            ></u-table-view-expander>
                          </template>
                          <template
                            #title

                          >
                            <u-text
                              ref="text_433"
                              text="表格列"
                            ></u-text>
                          </template>
                          <template
                            #cell="current"

                          >
                            <u-linear-layout
                              :ref="`linear_layout_136_${(current || {}).__nodeKey || (current || {}).index}`"
                              direction="horizontal"
                              :wrap="true"
                            >
                              <u-text
                                :ref="`text_434_${(current || {}).__nodeKey || (current || {}).index}`"
                                :text="$utils['ToString']('nasl.core.String', genviewMatchExpression_1owo5911(current))"
                              ></u-text>
                              <u-text
                                :ref="`text_435_${(current || {}).__nodeKey || (current || {}).index}`"
                                class="cw-style-font-weight"
                                :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `【`) + $utils['ToString']('nasl.core.String', $utils['EnumItemToText']('app.enums.ScheduleType', (((current || {}).item || {}).schedule || {}).type)) + $utils['ToString']('nasl.core.String', `】`) + $utils['ToString']('nasl.core.String', (((current || {}).item || {}).schedule || {}).title))"
                                style="--cw-style-font-weight: bold; font-weight: bold"
                              ></u-text>
                            </u-linear-layout>
                          </template>
                          <template
                            #editcell=""

                          ></template>
                          <template
                            #expand-content=""

                          ></template>
                        </u-table-view-column>
                      </u-table-view>
                    </u-linear-layout>
                  </u-panel>
                </u-linear-layout>
                <u-linear-layout
                  ref="linear_layout_19"
                  :wrap="true"
                >
                  <u-panel
                    ref="panel_4"
                    class="cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                    style="--cw-style-border-top-left-radius: 8px; --cw-style-border-top-right-radius: 8px; --cw-style-border-bottom-left-radius: 8px; --cw-style-border-bottom-right-radius: 8px; border-top-left-radius: 8px; border-bottom-left-radius: 8px; border-top-right-radius: 8px; border-bottom-right-radius: 8px"
                  >
                    <template
                      #title

                    ></template>
                    <template
                      #extra

                    ></template>
                    <u-tabs
                      ref="tabs_7"
                      class="cw-style-color"
                      style="--cw-style-color: #3dd7ab; color: #3dd7ab"
                    >
                      <u-tab
                        ref="tab_19"
                        value="A"
                      >
                        <template
                          #title

                        >
                          <u-text
                            ref="text_113"
                            text="政策制度"
                          ></u-text>
                        </template>
                        <u-table-view
                          ref="table_view_1"
                          :pagination="false"
                          :pageSize="20"
                          :pageNumber="1"
                          :dataSource="__table_view_1_handleDataSourceLoad()"
                          v-dependencies.reload="[]"
                          sorting="{ field: undefined, order: 'asc' }"
                          valueField=""
                          :showHead="false"
                          key="table_view_1"
                        >
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
                          <u-table-view-column
                            ref="table_view_column_1"
                            key="table_view_column_1"
                          >
                            <template
                              #expander="current"

                            >
                              <u-table-view-expander
                                :ref="`table_view_expander_1_${(current || {}).__nodeKey || (current || {}).index}`"
                                :item="(current || {}).item"
                              ></u-table-view-expander>
                            </template>
                            <template
                              #title

                            >
                              <u-text
                                ref="text_341"
                                text="表格列"
                              ></u-text>
                            </template>
                            <template
                              #cell="current"

                            >
                              <u-grid-layout :ref="`grid_layout_30_${(current || {}).__nodeKey || (current || {}).index}`">
                                <u-grid-layout-row
                                  :ref="`grid_layout_row_31_${(current || {}).__nodeKey || (current || {}).index}`"
                                  :repeat="24"
                                >
                                  <u-grid-layout-column
                                    :ref="`grid_layout_column_86_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :span="16"
                                    :wrap="true"
                                  >
                                    <u-linear-layout
                                      :ref="`linear_layout_89_${(current || {}).__nodeKey || (current || {}).index}`"
                                      direction="vertical"
                                      :wrap="true"
                                      @click="linear_layout_89_click($event, current)"
                                    >
                                      <u-linear-layout
                                        :ref="`linear_layout_90_${(current || {}).__nodeKey || (current || {}).index}`"
                                        :wrap="true"
                                      >
                                        <u-text
                                          :ref="`text_342_${(current || {}).__nodeKey || (current || {}).index}`"
                                          class="cw-style-height"
                                          :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).companyPolicy || {}).title)"
                                          overflow="nowrap"
                                          style="--cw-style-height: 44px; height: 44px"
                                        ></u-text>
                                      </u-linear-layout>
                                      <u-linear-layout
                                        :ref="`linear_layout_91_${(current || {}).__nodeKey || (current || {}).index}`"
                                        :wrap="true"
                                      >
                                        <u-text
                                          :ref="`text_343_${(current || {}).__nodeKey || (current || {}).index}`"
                                          class="cw-style-font-size"
                                          :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).companyPolicy || {}).createdBy)"
                                          style="--cw-style-font-size: 12px; font-size: 12px"
                                        ></u-text>
                                        <u-text
                                          :ref="`text_345_${(current || {}).__nodeKey || (current || {}).index}`"
                                          class="cw-style-font-size"
                                          :text="$utils['ToString']('nasl.core.String', $utils['FormatDateTime']((((current || {}).item || {}).companyPolicy || {}).createdTime, `MM-dd`, `global`))"
                                          display="block"
                                          style="--cw-style-font-size: 12px; font-size: 12px"
                                        ></u-text>
                                      </u-linear-layout>
                                    </u-linear-layout>
                                  </u-grid-layout-column>
                                  <u-grid-layout-column
                                    :ref="`grid_layout_column_87_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :span="8"
                                    :wrap="true"
                                  >
                                    <u-image
                                      :ref="`image_14_${(current || {}).__nodeKey || (current || {}).index}`"
                                      class="cw-style-width cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                                      :src="(((current || {}).item || {}).companyPolicy || {}).picture"
                                      fit="contain"
                                      style="--cw-style-width: 104px; --cw-style-border-top-left-radius: 6px; --cw-style-border-top-right-radius: 6px; --cw-style-border-bottom-left-radius: 6px; --cw-style-border-bottom-right-radius: 6px; width: 104px; border-top-left-radius: 6px; border-bottom-left-radius: 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px"
                                    ></u-image>
                                  </u-grid-layout-column>
                                </u-grid-layout-row>
                              </u-grid-layout>
                            </template>
                            <template
                              #editcell=""

                            ></template>
                            <template
                              #expand-content=""

                            ></template>
                          </u-table-view-column>
                        </u-table-view>
                      </u-tab>
                      <u-tab
                        ref="tab_20"
                        value="B"
                      >
                        <template
                          #title

                        >
                          <u-text
                            ref="text_115"
                            text="公司动态"
                          ></u-text>
                        </template>
                        <u-table-view
                          ref="table_view_2"
                          :pagination="false"
                          :pageSize="20"
                          :pageNumber="1"
                          :dataSource="__table_view_2_handleDataSourceLoad()"
                          v-dependencies.reload="[]"
                          sorting="{ field: undefined, order: 'asc' }"
                          valueField=""
                          :showHead="false"
                          key="table_view_2"
                        >
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
                          <u-table-view-column
                            ref="table_view_column_2"
                            key="table_view_column_2"
                          >
                            <template
                              #expander="current"

                            >
                              <u-table-view-expander
                                :ref="`table_view_expander_2_${(current || {}).__nodeKey || (current || {}).index}`"
                                :item="(current || {}).item"
                              ></u-table-view-expander>
                            </template>
                            <template
                              #title

                            >
                              <u-text
                                ref="text_344"
                                text="表格列"
                              ></u-text>
                            </template>
                            <template
                              #cell="current"

                            >
                              <u-grid-layout :ref="`grid_layout_31_${(current || {}).__nodeKey || (current || {}).index}`">
                                <u-grid-layout-row
                                  :ref="`grid_layout_row_32_${(current || {}).__nodeKey || (current || {}).index}`"
                                  :repeat="24"
                                >
                                  <u-grid-layout-column
                                    :ref="`grid_layout_column_88_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :span="16"
                                    :wrap="true"
                                  >
                                    <u-linear-layout
                                      :ref="`linear_layout_92_${(current || {}).__nodeKey || (current || {}).index}`"
                                      direction="vertical"
                                      :wrap="true"
                                      @click="linear_layout_92_click($event, current)"
                                    >
                                      <u-linear-layout
                                        :ref="`linear_layout_93_${(current || {}).__nodeKey || (current || {}).index}`"
                                        :wrap="true"
                                      >
                                        <u-text
                                          :ref="`text_346_${(current || {}).__nodeKey || (current || {}).index}`"
                                          class="cw-style-height"
                                          :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).companyPolicy || {}).title)"
                                          overflow="nowrap"
                                          style="--cw-style-height: 44px; height: 44px"
                                        ></u-text>
                                      </u-linear-layout>
                                      <u-linear-layout
                                        :ref="`linear_layout_94_${(current || {}).__nodeKey || (current || {}).index}`"
                                        :wrap="true"
                                      >
                                        <u-text
                                          :ref="`text_347_${(current || {}).__nodeKey || (current || {}).index}`"
                                          class="cw-style-font-size"
                                          :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).companyPolicy || {}).createdBy)"
                                          style="--cw-style-font-size: 12px; font-size: 12px"
                                        ></u-text>
                                        <u-text
                                          :ref="`text_348_${(current || {}).__nodeKey || (current || {}).index}`"
                                          class="cw-style-font-size"
                                          :text="$utils['ToString']('nasl.core.String', $utils['FormatDateTime']((((current || {}).item || {}).companyPolicy || {}).createdTime, `MM-dd`, `global`))"
                                          display="block"
                                          style="--cw-style-font-size: 12px; font-size: 12px"
                                        ></u-text>
                                      </u-linear-layout>
                                    </u-linear-layout>
                                  </u-grid-layout-column>
                                  <u-grid-layout-column
                                    :ref="`grid_layout_column_89_${(current || {}).__nodeKey || (current || {}).index}`"
                                    :span="8"
                                    :wrap="true"
                                  >
                                    <u-image
                                      :ref="`image_15_${(current || {}).__nodeKey || (current || {}).index}`"
                                      class="cw-style-width cw-style-border-top-left-radius cw-style-border-radius cw-style-border-top-right-radius cw-style-border-bottom-left-radius cw-style-border-bottom-right-radius"
                                      :src="(((current || {}).item || {}).companyPolicy || {}).picture"
                                      fit="contain"
                                      style="--cw-style-width: 104px; --cw-style-border-top-left-radius: 6px; --cw-style-border-top-right-radius: 6px; --cw-style-border-bottom-left-radius: 6px; --cw-style-border-bottom-right-radius: 6px; width: 104px; border-top-left-radius: 6px; border-bottom-left-radius: 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px"
                                    ></u-image>
                                  </u-grid-layout-column>
                                </u-grid-layout-row>
                              </u-grid-layout>
                            </template>
                            <template
                              #editcell=""

                            ></template>
                            <template
                              #expand-content=""

                            ></template>
                          </u-table-view-column>
                        </u-table-view>
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
                  </u-panel>
                </u-linear-layout>
              </u-linear-layout>
            </u-linear-layout>
          </u-linear-layout>
        </u-grid-layout-column>
      </u-grid-layout-row>
    </u-grid-layout>
  </u-linear-layout>
</template>
<script>
export default {
  name: '/oaSys/homePage',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      userMessage: window.$genInitFromSchema('{badge: nasl.collection.List<nasl.core.String>, createdTime: nasl.core.DateTime, displayName: nasl.core.String, email: nasl.core.String, phone: nasl.core.String, picture: nasl.core.String, userId: nasl.core.String, userName: nasl.core.String}', undefined),
      toDo: undefined,
      notFinish: undefined,
      dayClock: window.$genInitFromSchema('app.structures.DayStructure', undefined),
      tableView_3_state_page: undefined,
      tableView_3_state_size: undefined,
      tableView_3_state_sort: undefined,
      tableView_3_state_order: undefined,
    };
  },
  meta: {
    title: '主页',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: 'loginAuth',
  },
  methods: {
    async homePage_created(event) {
      await this.homePage_created_created(event);
    },

    async homePage_created_created() {
      let myIn = window.$genInitFromSchema('{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyInitiatedTask>, total: nasl.core.Long}', undefined);
      this.$global.frontendVariables.title = '主页';
      this.userMessage = window.$genInitFromSchema(
        '{badge: nasl.collection.List<nasl.core.String>, createdTime: nasl.core.DateTime, displayName: nasl.core.String, email: nasl.core.String, phone: nasl.core.String, picture: nasl.core.String, userId: nasl.core.String, userName: nasl.core.String}',
        await window.LcapRequest({
          url: '/api/lcplogics/loadUserMessage',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/homePage/0',
          },
          data: {},
        }),
      );
      this.toDo = (
        window.$genInitFromSchema(
          '{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyPendingTask>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcap_process_framework/getMyPendingTasks',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/homePage/0',
            },
            data: {},
          }),
        ) || {}
      ).total;
      if (window.$utils.HasValue({ type: 'nasl.core.Long', value: this.toDo })) { /* empty */ } else {
        this.toDo = 0;
      }
      myIn = window.$genInitFromSchema(
        '{list: nasl.collection.List<extensions.lcap_process_framework.structures.MyInitiatedTask>, total: nasl.core.Long}',
        await window.LcapRequest({
          url: '/api/lcap_process_framework/getMyInitiatedTasks',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/homePage/0',
          },
          data: {},
        }),
      );
      this.notFinish = (window.$genInitFromSchema('nasl.collection.List<extensions.lcap_process_framework.structures.MyInitiatedTask>', await window.$utils.ListFilterAsync((myIn || {}).list, (item) => !((window.$genInitFromSchema('extensions.lcap_process_framework.structures.CurrNode', window.$utils.ListHead((item || {}).procInstCurrNodes)) || {}).currNodeTitle == '结束'))) || {}).length;
      this.dayClock = window.$genInitFromSchema(
        'app.structures.DayStructure',
        await window.LcapRequest({
          url: '/api/lcplogics/loadDayClock',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/oaSys/homePage/0',
          },
          data: {
            day: window.$utils.CurrDate(),
          },
        }),
      );
    },

    async absolute_layout_17_click(event) {
      await this.absolute_layout_17_click_click(event);
    },

    async absolute_layout_17_click_click() {
      window.$destination('/oaSys/myProcess', '_self', false);
    },

    async absolute_layout_21_click(event) {
      await this.absolute_layout_21_click_click(event);
    },

    async absolute_layout_21_click_click() {
      window.$destination('/oaSys/myProcess', '_self', false);
    },

    async linear_layout_89_click(event, current) {
      await this.linear_layout_89_click_click(event, current);
    },

    async linear_layout_89_click_click(event, current) {
      window.$destination(`/oaSys/policyDetail${window.$toQueryString({ id: (((current || {}).item || {}).companyPolicy || {}).id })}`, '_self', false);
    },

    async linear_layout_92_click(event, current) {
      await this.linear_layout_92_click_click(event, current);
    },

    async linear_layout_92_click_click(event, current) {
      window.$destination(`/oaSys/policyDetail${window.$toQueryString({ id: (((current || {}).item || {}).companyPolicy || {}).id })}`, '_self', false);
    },

    genviewMatchExpression_00gqe2i1() {
      return (() => {
        const it = ((this.dayClock || {}).clockIn || {}).clockTime;
        if (window.$global.isEqual(it, undefined)) {
          return '未打卡';
        } else {
          return window.$utils.FormatTime(((this.dayClock || {}).clockIn || {}).clockTime, 'HH:mm');
        }
      })();
    },

    genviewMatchExpression_0ohaowj0() {
      return (() => {
        const it = ((this.dayClock || {}).clockOut || {}).clockTime;
        if (window.$global.isEqual(it, undefined)) {
          return '--';
        } else {
          return window.$utils.FormatTime(((this.dayClock || {}).clockOut || {}).clockTime, 'HH:mm');
        }
      })();
    },

    genviewMatchExpression_09qrua80() {
      return (() => {
        const it = (this.userMessage || {}).displayName;
        if (window.$global.isEqual(it, undefined)) {
          return '';
        } else {
          return window.$utils.ToString('nasl.core.String', '（') + window.$utils.ToString('nasl.core.String', (this.userMessage || {}).displayName) + window.$utils.ToString('nasl.core.String', '）');
        }
      })();
    },

    genviewMatchExpression_02vm0pv0() {
      return (() => {
        const it = (this.userMessage || {}).createdTime;
        if (window.$global.isEqual(it, undefined)) {
          return '';
        } else {
          return (() => {
            const it = window.$utils.DateDiff((this.userMessage || {}).createdTime, window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime('global')), 'd', true) < 365;
            if (window.$global.isEqual(it, true)) {
              return window.$utils.ToString('nasl.core.String', '我与网易在一起') + window.$utils.ToString('nasl.core.Long', window.$utils.DateDiff((this.userMessage || {}).createdTime, window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime('global')), 'd', true)) + window.$utils.ToString('nasl.core.String', '天啦');
            } else if (window.$global.isEqual(it, false)) {
              return window.$utils.ToString('nasl.core.String', '我与网易在一起') + window.$utils.ToString('nasl.core.Long', window.$utils.DateDiff((this.userMessage || {}).createdTime, window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime('global')), 'y', true)) + window.$utils.ToString('nasl.core.String', '年') + window.$utils.ToString('nasl.core.Long', window.$utils.DateDiff((this.userMessage || {}).createdTime, window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime('global')), 'd', true) % 365) + window.$utils.ToString('nasl.core.String', '天啦');
            } else { /* empty */ }
          })();
        }
      })();
    },

    genviewMatchExpression_0gw6m4s0() {
      return (() => {
        const it = window.$utils.DateDiff((this.userMessage || {}).createdTime, window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime('global')), 'd', true) < 365;
        if (window.$global.isEqual(it, true)) {
          return window.$utils.ToString('nasl.core.String', '我与网易在一起') + window.$utils.ToString('nasl.core.Long', window.$utils.DateDiff((this.userMessage || {}).createdTime, window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime('global')), 'd', true)) + window.$utils.ToString('nasl.core.String', '天啦');
        } else if (window.$global.isEqual(it, false)) {
          return window.$utils.ToString('nasl.core.String', '我与网易在一起') + window.$utils.ToString('nasl.core.Long', window.$utils.DateDiff((this.userMessage || {}).createdTime, window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime('global')), 'y', true)) + window.$utils.ToString('nasl.core.String', '年') + window.$utils.ToString('nasl.core.Long', window.$utils.DateDiff((this.userMessage || {}).createdTime, window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime('global')), 'd', true) % 365) + window.$utils.ToString('nasl.core.String', '天啦');
        } else { /* empty */ }
      })();
    },

    genviewMatchExpression_1owo5911(current) {
      return (() => {
        const it = (((current || {}).item || {}).schedule || {}).ifAllDay;
        if (window.$global.isEqual(it, true)) {
          return '全天';
        } else if (window.$global.isEqual(it, false)) {
          return window.$utils.ToString('nasl.core.String', window.$utils.FormatTime((((current || {}).item || {}).schedule || {}).start, 'HH:mm')) + window.$utils.ToString('nasl.core.String', ' - ') + window.$utils.ToString('nasl.core.String', window.$utils.FormatTime((((current || {}).item || {}).schedule || {}).end, 'HH:mm'));
        } else { /* empty */ }
      })();
    },

    __tableView_3_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__tableView_3_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{schedule: app.dataSources.defaultDS.entities.Schedule}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadHomePageTableView3',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/homePage/0',
            },
            data: {
              page: this.tableView_3_state_page,
              size: this.tableView_3_state_size,
              sort: this.tableView_3_state_sort,
              order: this.tableView_3_state_order,
            },
          }),
        );
      });
    },

    __table_view_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__table_view_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{companyPolicy: app.dataSources.defaultDS.entities.CompanyPolicy}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadPolicy',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/homePage/1',
            },
            data: {
              type: '1',
            },
          }),
        );
      });
    },

    __table_view_2_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__table_view_2_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{companyPolicy: app.dataSources.defaultDS.entities.CompanyPolicy}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadPolicy',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/oaSys/homePage/0',
            },
            data: {
              type: '2',
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
    await this.homePage_created();
  },
};
</script>
