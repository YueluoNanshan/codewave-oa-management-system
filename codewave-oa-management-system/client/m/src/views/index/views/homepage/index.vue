<template>
  <van-linear-layout
    ref="vanLinearLayout1"
    class="l-root-h5 cw-style-background-color"
    type="root"
    gap="none"
    style="--cw-style-background-color: #f1f3f4; background-color: #f1f3f4"
  >
    <van-linear-layout
      ref="linear_layout_49"
      direction="vertical"
      gap="none"
    >
      <van-linear-layout
        ref="linear_layout_50"
        class="cw-style-background-color"
        :wrap="true"
        style="--cw-style-background-color: #ffffff; background-color: #ffffff"
      >
        <van-linear-layout
          ref="linear_layout_53"
          direction="vertical"
          gap="none"
        >
          <van-linear-layout
            ref="linear_layout_54"
            :wrap="true"
          >
            <van-linear-layout
              ref="linear_layout_58"
              direction="vertical"
              gap="none"
            >
              <van-linear-layout
                ref="linear_layout_59"
                :wrap="true"
              >
                <van-row
                  ref="row_3"
                  gutter="0"
                >
                  <van-col
                    ref="col_7"
                    class="cw-style-height"
                    :span="8"
                    mode="flex"
                    justify="center"
                    alignment="center"
                    style="--cw-style-height: 125px; height: 125px"
                  >
                    <van-image
                      ref="image_6"
                      class="cw-style-width cw-style-height"
                      src="//lcap-official-bucket.codewave.163.com/assets/cloud-ui/1.jpg"
                      fit="fill"
                      :preview="true"
                      widthStretch="false"
                      heightStretch="false"
                      style="--cw-style-width: 70px; --cw-style-height: 70px; width: 70px; height: 70px"
                    ></van-image>
                  </van-col>
                  <van-col
                    ref="col_8"
                    :span="16"
                    mode="flex"
                    justify="start"
                    alignment="center"
                  >
                    <van-linear-layout
                      ref="linear_layout_63"
                      direction="vertical"
                      gap="none"
                    >
                      <van-linear-layout
                        ref="linear_layout_67"
                        direction="vertical"
                        gap="none"
                      >
                        <van-linear-layout
                          ref="linear_layout_68"
                          :wrap="true"
                        >
                          <van-text
                            ref="text_594"
                            size="large"
                            :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', (userMassage || {}).userName) + $utils['ToString']('nasl.core.String', genviewMatchExpression_08481ky0()))"
                          ></van-text>
                        </van-linear-layout>
                        <van-linear-layout
                          ref="linear_layout_69"
                          :wrap="true"
                        >
                          <van-text
                            ref="text_595"
                            :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', `我和网易在一起`) + $utils['ToString']('nasl.core.Long | nasl.core.String', genviewMatchExpression_0isdswl0()) + $utils['ToString']('nasl.core.String', `天啦！`))"
                          ></van-text>
                        </van-linear-layout>
                      </van-linear-layout>
                    </van-linear-layout>
                  </van-col>
                </van-row>
              </van-linear-layout>
              <van-linear-layout
                ref="linear_layout_60"
                :wrap="true"
              >
                <van-row
                  ref="row_5"
                  gutter="0"
                >
                  <van-col
                    ref="col_12"
                    class="cw-style-text-align"
                    :span="6"
                    style="--cw-style-text-align: center; text-align: center"
                  >
                    <van-iconv
                      ref="iconv_1"
                      name="default"
                    >
                      <van-text
                        ref="text_559"
                        text="图标"
                      ></van-text>
                    </van-iconv>
                  </van-col>
                  <van-col
                    ref="col_17"
                    class="cw-style-text-align"
                    :span="6"
                    style="--cw-style-text-align: center; text-align: center"
                  >
                    <van-iconv
                      ref="iconv_2"
                      name="default"
                    >
                      <van-text
                        ref="text_560"
                        text="图标"
                      ></van-text>
                    </van-iconv>
                  </van-col>
                  <van-col
                    ref="col_18"
                    class="cw-style-text-align"
                    :span="6"
                    style="--cw-style-text-align: center; text-align: center"
                  >
                    <van-iconv
                      ref="iconv_3"
                      name="default"
                    >
                      <van-text
                        ref="text_561"
                        text="图标"
                      ></van-text>
                    </van-iconv>
                  </van-col>
                  <van-col
                    ref="col_19"
                    class="cw-style-text-align"
                    :span="6"
                    style="--cw-style-text-align: center; text-align: center"
                  >
                    <van-iconv
                      ref="iconv_4"
                      name="default"
                    >
                      <van-text
                        ref="text_562"
                        text="图标"
                      ></van-text>
                    </van-iconv>
                  </van-col>
                </van-row>
              </van-linear-layout>
            </van-linear-layout>
          </van-linear-layout>
        </van-linear-layout>
      </van-linear-layout>
      <van-linear-layout
        ref="linear_layout_51"
        class="cw-style-margin-left cw-style-margin cw-style-margin-top cw-style-margin-right"
        :wrap="true"
        style="--cw-style-margin-left: 10px; --cw-style-margin-top: 20px; --cw-style-margin-right: 10px; margin-top: 20px; margin-left: 10px; margin-right: 10px"
      >
        <van-cardu ref="cardu_1">
          <template
            #head

          ></template>
          <van-cell-group ref="cell_group_5">
            <van-cell
              ref="cell_16"
              :isLink="true"
              :center="true"
              destination="/m/index/myAsset"
            >
              <template
                #title

              >
                <van-text
                  ref="text_571"
                  text="我的资产"
                ></van-text>
              </template>
              <template
                #rightIcon

              ></template>
            </van-cell>
            <van-cell
              ref="cell_17"
              :isLink="true"
              :center="true"
            >
              <template
                #title

              >
                <van-text
                  ref="text_573"
                  text="我的卡包"
                ></van-text>
              </template>
              <template
                #rightIcon

              ></template>
            </van-cell>
            <van-cell
              ref="cell_24"
              :isLink="true"
              :center="true"
            >
              <template
                #title

              >
                <van-text
                  ref="text_589"
                  text="我的卡包"
                ></van-text>
              </template>
              <template
                #rightIcon

              ></template>
            </van-cell>
            <van-cell
              ref="cell_25"
              :isLink="true"
              :center="true"
            >
              <template
                #title

              >
                <van-text
                  ref="text_590"
                  text="我的卡包"
                ></van-text>
              </template>
              <template
                #rightIcon

              ></template>
            </van-cell>
          </van-cell-group>
        </van-cardu>
      </van-linear-layout>
    </van-linear-layout>
    <van-linear-layout
      ref="linear_layout_56"
      class="cw-style-margin-left cw-style-margin cw-style-margin-top cw-style-margin-right"
      direction="horizontal"
      :wrap="true"
      style="--cw-style-margin-left: 10px; --cw-style-margin-top: 20px; --cw-style-margin-right: 10px; margin-top: 20px; margin-left: 10px; margin-right: 10px"
    >
      <van-cardu ref="cardu_2">
        <template
          #head

        ></template>
        <van-cell-group ref="cell_group_6">
          <van-cell
            ref="cell_21"
            :isLink="true"
            :center="true"
          >
            <template
              #title

            >
              <van-text
                ref="text_584"
                text="办公地点"
              ></van-text>
            </template>
            <template
              #rightIcon

            ></template>
          </van-cell>
          <van-cell
            ref="cell_22"
            :isLink="true"
            :center="true"
          >
            <template
              #title

            >
              <van-text
                ref="text_585"
                text="登录记录"
              ></van-text>
            </template>
            <template
              #rightIcon

            ></template>
          </van-cell>
          <van-cell
            ref="cell_23"
            :isLink="true"
            :center="true"
          >
            <template
              #title

            >
              <van-text
                ref="text_586"
                text="反馈意见"
              ></van-text>
            </template>
            <template
              #rightIcon

            ></template>
          </van-cell>
        </van-cell-group>
      </van-cardu>
    </van-linear-layout>
  </van-linear-layout>
</template>
<script>
export default {
  name: '/index/homepage',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      userMassage: window.$genInitFromSchema('{badge: nasl.collection.List<nasl.core.String>, createdTime: nasl.core.DateTime, displayName: nasl.core.String, email: nasl.core.String, phone: nasl.core.String, picture: nasl.core.String, userId: nasl.core.String, userName: nasl.core.String}', undefined),
    };
  },
  meta: {
    title: '主页',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: undefined,
  },
  methods: {
    async homepage_created(event) {
      await this.homepage_created_created(event);
    },

    async homepage_created_created() {
      this.userMassage = window.$genInitFromSchema(
        '{badge: nasl.collection.List<nasl.core.String>, createdTime: nasl.core.DateTime, displayName: nasl.core.String, email: nasl.core.String, phone: nasl.core.String, picture: nasl.core.String, userId: nasl.core.String, userName: nasl.core.String}',
        await window.LcapRequest({
          url: '/api/lcplogics/loadUserMessage',
          method: 'POST',
          extraConfig: {
            serviceType: 'micro',
          },
          headers: {
            'lcap-calllogic-uuid': '/m/index/homepage/0',
          },
          data: {},
        }),
      );
    },

    genviewMatchExpression_08481ky0() {
      return (() => {
        const it = (this.userMassage || {}).displayName;
        if (window.$global.isEqual(it, undefined)) {
          return '';
        } else {
          return window.$utils.ToString('nasl.core.String', '（') + window.$utils.ToString('nasl.core.String', (this.userMassage || {}).displayName) + window.$utils.ToString('nasl.core.String', '）');
        }
      })();
    },

    genviewMatchExpression_0isdswl0() {
      return (() => {
        const it = (this.userMassage || {}).createdTime;
        if (window.$global.isEqual(it, undefined)) {
          return '';
        } else {
          return window.$utils.DateDiff((this.userMassage || {}).createdTime, window.$genInitFromSchema('nasl.core.DateTime', window.$utils.CurrDateTime('global')), 'd', true);
        }
      })();
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
  async created() {
    await this.homepage_created();
  },
};
</script>
