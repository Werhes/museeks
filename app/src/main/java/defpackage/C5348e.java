package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5348e extends AbstractC5604e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f11471e;

    public C5348e(boolean z) {
        this.f11471e = z;
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
        Integer valueOf = Integer.valueOf(R.drawable.placeholder_link);
        String str = customCatalogBlockItem.ad;
        List list = customCatalogBlockItem.metrica;
        if (this.f11471e) {
            C13812e c13812e = (C13812e) interfaceC10283e;
            AbstractC2379e.metrica(c13812e.f27378e, list != null ? AbstractC8769e.license(list) : null, valueOf, new C9377e(new C15878e(), 14));
            c13812e.f27377e.setText(str);
            c13812e.f27379e.setOnClickListener(new ViewOnClickListenerC12970e(customCatalogBlockItem, 3));
            return;
        }
        C0936e c0936e = (C0936e) interfaceC10283e;
        AbstractC2379e.metrica(c0936e.f3351e, list != null ? AbstractC8769e.license(list) : null, valueOf, new C9377e(new C15878e(), 14));
        c0936e.f3350e.setText(str);
        c0936e.f3352e.setOnClickListener(new ViewOnClickListenerC12970e(customCatalogBlockItem, 4));
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return this.f11471e ? R.layout.c3_link_horizontal_small : R.layout.c3_link_horizontal;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f11471e) {
            return C13812e.ad(layoutInflater, viewGroup);
        }
        View inflate = layoutInflater.inflate(R.layout.c3_link_horizontal, viewGroup, false);
        int i = R.id.catalog_item_photo;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.catalog_item_photo);
        if (imageView != null) {
            i = R.id.catalog_item_title;
            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.catalog_item_title);
            if (textView != null) {
                return new C0936e((LinearLayout) inflate, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
