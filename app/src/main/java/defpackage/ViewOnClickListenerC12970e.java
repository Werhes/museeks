package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemMeta;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؑۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC12970e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ CustomCatalogBlockItem f25855e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25856e;

    public /* synthetic */ ViewOnClickListenerC12970e(AbstractC5604e abstractC5604e, CustomCatalogBlockItem customCatalogBlockItem, int i) {
        this.f25856e = i;
        this.f25855e = customCatalogBlockItem;
    }

    public /* synthetic */ ViewOnClickListenerC12970e(CustomCatalogBlockItem customCatalogBlockItem, int i) {
        this.f25856e = i;
        this.f25855e = customCatalogBlockItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f25856e) {
            case 0:
                Context context = view.getContext();
                CustomCatalogBlockItem customCatalogBlockItem = this.f25855e;
                CustomCatalogBlockItemMeta customCatalogBlockItemMeta = customCatalogBlockItem.purchase;
                C3288e.vip(context, customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.vip : null, customCatalogBlockItem.license);
                return;
            case 1:
                Context context2 = view.getContext();
                CustomCatalogBlockItem customCatalogBlockItem2 = this.f25855e;
                CustomCatalogBlockItemMeta customCatalogBlockItemMeta2 = customCatalogBlockItem2.purchase;
                C3288e.vip(context2, customCatalogBlockItemMeta2 != null ? customCatalogBlockItemMeta2.vip : null, customCatalogBlockItem2.license);
                return;
            case 2:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f25855e.license)));
                return;
            case 3:
                Context context3 = view.getContext();
                CustomCatalogBlockItem customCatalogBlockItem3 = this.f25855e;
                CustomCatalogBlockItemMeta customCatalogBlockItemMeta3 = customCatalogBlockItem3.purchase;
                C3288e.vip(context3, customCatalogBlockItemMeta3 != null ? customCatalogBlockItemMeta3.vip : null, customCatalogBlockItem3.license);
                return;
            case 4:
                Context context4 = view.getContext();
                CustomCatalogBlockItem customCatalogBlockItem4 = this.f25855e;
                CustomCatalogBlockItemMeta customCatalogBlockItemMeta4 = customCatalogBlockItem4.purchase;
                C3288e.vip(context4, customCatalogBlockItemMeta4 != null ? customCatalogBlockItemMeta4.vip : null, customCatalogBlockItem4.license);
                return;
            default:
                Context context5 = view.getContext();
                CustomCatalogBlockItem customCatalogBlockItem5 = this.f25855e;
                CustomCatalogBlockItemMeta customCatalogBlockItemMeta5 = customCatalogBlockItem5.purchase;
                C3288e.vip(context5, customCatalogBlockItemMeta5 != null ? customCatalogBlockItemMeta5.vip : null, customCatalogBlockItem5.license);
                return;
        }
    }
}
