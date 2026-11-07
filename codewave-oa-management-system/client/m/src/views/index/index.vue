<template>
  <div
    ref="div1"
    class="h5template-navi"
    vusion-slot-name="default"
  >
    <van-router-view ref="vanRouterView1"></van-router-view>
    <van-tabbar
      ref="tabbar_1"
      :fixed="true"
    >
      <van-tabbar-item
        ref="tabbar_item_3"
        class="cw-style-font-size"
        icon="location"
        destination="/m/index/clockPage"
        style="--cw-style-font-size: 24px; font-size: 24px"
      >
        <van-text
          ref="text_513"
          text="打卡"
        ></van-text>
      </van-tabbar-item>
      <van-tabbar-item
        ref="tabbar_item_4"
        class="cw-style-font-size"
        icon="avatar"
        destination="/m/index/homepage"
        style="--cw-style-font-size: 24px; font-size: 24px"
      >
        <van-text
          ref="text_514"
          text="我的"
        ></van-text>
      </van-tabbar-item>
    </van-tabbar>
    <van-popup
      ref="demoNvaiPop"
      position="left"
      :closeOnClickOverlay="true"
    >
      <div
        ref="div2"
        class="diy-content"
      >
        <van-cell
          ref="cell1"
          :isLink="true"
          :center="true"
          icon="program"
        >
          <template ref="template1"></template>
          <template
            #title

          >
            <van-text
              ref="text2"
              text="导航一"
            ></van-text>
          </template>
        </van-cell>
        <van-cell
          ref="cell6"
          :isLink="true"
          :center="true"
          icon="program"
        >
          <template
            #title

          >
            <van-text
              ref="text7"
              text="导航二"
            ></van-text>
          </template>
          <template ref="template12"></template>
        </van-cell>
        <van-cell
          ref="cell5"
          :isLink="true"
          :center="true"
          icon="program"
        >
          <template
            #title

          >
            <van-text
              ref="text6"
              text="导航三"
            ></van-text>
          </template>
          <template ref="template10"></template>
        </van-cell>
        <van-cell
          ref="cell4"
          :isLink="true"
          :center="true"
          icon="program"
        >
          <template
            #title

          >
            <van-text
              ref="text5"
              text="导航四"
            ></van-text>
          </template>
          <template ref="template8"></template>
        </van-cell>
        <van-cell
          ref="cell3"
          :isLink="true"
          :center="true"
          icon="program"
        >
          <template
            #title

          >
            <van-text
              ref="text4"
              text="导航五"
            ></van-text>
          </template>
          <template ref="template6"></template>
        </van-cell>
        <van-cell
          ref="cell2"
          :isLink="true"
          :center="true"
          icon="program"
        >
          <template
            #title

          >
            <van-text
              ref="text3"
              text="导航六"
            ></van-text>
          </template>
          <template ref="template4"></template>
        </van-cell>
      </div>
    </van-popup>
  </div>
</template>
<script>
export default {
  name: '/index',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      listView_1_state_page: undefined,
      listView_1_state_size: undefined,
    };
  },
  meta: {
    title: '首页',
    crumb: undefined,
    crumbI18n: undefined,
    first: 'clockPage',
    auth: undefined,
  },
  methods: {
    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
};
</script>
