<template>
  <van-linear-layout
    ref="vanLinearLayout1"
    class="l-root-h5"
    type="root"
    gap="none"
  >
    <van-list-view
      ref="listView_1"
      @sync:state="(key, val) => onSyncState('listView_1', key, val)"
      :dataSource="__listView_1_handleDataSourceLoad()"
      :pageSize="50"
      :pageNumber="1"
      textField="userAssetMapping.userName"
      valueField="userAssetMapping.id"
      pageable="auto-more"
      :remotePaging="true"
      v-dependencies.reload="[]"
    >
      <template
        #item="current"

      >
        <van-cell
          :ref="`cell_1_${(current || {}).__nodeKey || (current || {}).index}`"
          :value="(((current || {}).item || {}).userAssetMapping || {}).userName"
          :isLink="false"
          :destination="`/m/index/assetDetail${$toQueryString({ id: (((current || {}).item || {}).userAssetMapping || {}).id })}`"
        >
          <template
            #title

          >
            <van-image
              :ref="`image_1_${(current || {}).__nodeKey || (current || {}).index}`"
              :src="(((current || {}).item || {}).asset || {}).picture"
              fit="contain"
              :preview="true"
            ></van-image>
          </template>
          <template
            #rightIcon

          ></template>
          <van-linear-layout
            :ref="`linear_layout_2_${(current || {}).__nodeKey || (current || {}).index}`"
            class="cw-style-text-align"
            direction="vertical"
            gap="none"
            style="--cw-style-text-align: left; text-align: left"
          >
            <van-linear-layout
              :ref="`linear_layout_3_${(current || {}).__nodeKey || (current || {}).index}`"
              :wrap="true"
            >
              <van-text
                :ref="`text_4_${(current || {}).__nodeKey || (current || {}).index}`"
                class="cw-style-font-size cw-style-font-weight cw-style-color"
                :text="$utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).name)"
                style="--cw-style-font-size: 18px; --cw-style-font-weight: bold; --cw-style-color: #101010; font-weight: bold; font-size: 18px; color: #101010"
              ></van-text>
            </van-linear-layout>
            <van-linear-layout
              :ref="`linear_layout_4_${(current || {}).__nodeKey || (current || {}).index}`"
              :wrap="true"
            >
              <van-text
                :ref="`text_5_${(current || {}).__nodeKey || (current || {}).index}`"
                :text="$utils['ToString']('nasl.core.String', $utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).specification) + $utils['ToString']('nasl.core.String', `，`) + $utils['ToString']('nasl.core.String', (((current || {}).item || {}).asset || {}).descrition))"
              ></van-text>
            </van-linear-layout>
          </van-linear-layout>
        </van-cell>
      </template>
      <template
        #prev

      >
        <van-text
          ref="text_2"
          text="上一页"
        ></van-text>
      </template>
      <template
        #next

      >
        <van-text
          ref="text_3"
          text="下一页"
        ></van-text>
      </template>
      <template
        #empty

      ></template>
    </van-list-view>
  </van-linear-layout>
</template>
<script>
export default {
  name: '/index/myAsset',
  mixins: [window.$mixins.dataSourceUtils()],
  data() {
    return {
      listView_1_state_page: undefined,
      listView_1_state_size: undefined,
    };
  },
  meta: {
    title: '我的资产',
    crumb: undefined,
    crumbI18n: undefined,
    first: undefined,
    auth: undefined,
  },
  methods: {
    __listView_1_handleDataSourceLoad() {
      return this.__getOrCreateDataSource('__listView_1_handleDataSourceLoad', [], async () => {
        return window.$genInitFromSchema(
          '{list: nasl.collection.List<{asset: app.dataSources.defaultDS.entities.Asset, lcapUser: app.dataSources.defaultDS.entities.LcapUser, userAssetMapping: app.dataSources.defaultDS.entities.UserAssetMapping}>, total: nasl.core.Long}',
          await window.LcapRequest({
            url: '/api/lcplogics/loadMyAssetListView1',
            method: 'POST',
            extraConfig: {
              serviceType: 'micro',
            },
            headers: {
              'lcap-calllogic-uuid': '/m/index/myAsset/0',
            },
            data: {
              page: this.listView_1_state_page,
              size: this.listView_1_state_size,
            },
          }),
        );
      });
    },

    onSyncState(elem, key, val) {
      this[`${elem}_state_${key}`] = val;
    },
  },
};
</script>
