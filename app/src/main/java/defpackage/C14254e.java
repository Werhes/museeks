package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۜۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14254e extends AbstractC5604e {
    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        Catalog2Banner catalog2Banner = (Catalog2Banner) obj;
        C3821e c3821e = (C3821e) interfaceC10283e;
        String str = catalog2Banner.billing;
        TextView textView = c3821e.f8445e;
        TextView textView2 = c3821e.f8447e;
        c3821e.f8444e.setText(catalog2Banner.purchase);
        String str2 = catalog2Banner.appmetrica;
        if (str2 == null || str2.length() == 0) {
            AbstractC17680e.mopub(textView2);
        } else {
            textView2.setText(str2);
            AbstractC17680e.amazon(textView2);
        }
        if (str == null || str.length() == 0) {
            AbstractC17680e.mopub(textView);
        } else {
            textView.setText(str);
            AbstractC17680e.amazon(textView);
        }
        ImageView imageView = c3821e.f8446e;
        String license = AbstractC8769e.license(catalog2Banner.license);
        InterfaceC12732e ad = AbstractC16550e.ad(imageView.getContext());
        C5944e c5944e = new C5944e(imageView.getContext());
        c5944e.metrica = license;
        AbstractC15659e.license(c5944e, imageView);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        AbstractC2182e.metrica(c5944e, new C5271e(VKXApplication.Companion.ad(8.0f)));
        ((C0624e) ad).ad(c5944e.ad());
        c3821e.f8448e.setOnClickListener(new ViewOnClickListenerC16943e(catalog2Banner, 1));
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return R.layout.c3_catalog_banner;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_catalog_banner_promo, viewGroup, false);
        int i = R.id.banner_bg;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.banner_bg);
        if (imageView != null) {
            i = R.id.subtext;
            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.subtext);
            if (textView != null) {
                i = R.id.text;
                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.text);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) AbstractC7779e.vip(inflate, R.id.title);
                    if (textView3 != null) {
                        return new C3821e(imageView, (LinearLayout) inflate, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
