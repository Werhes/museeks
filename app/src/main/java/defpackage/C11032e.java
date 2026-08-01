package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2Placeholder;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11032e extends AbstractC5604e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f21852e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractC15876e f21853e;

    public C11032e(AbstractC15876e abstractC15876e, boolean z) {
        this.f21853e = abstractC15876e;
        this.f21852e = z;
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        Catalog2Button catalog2Button;
        Catalog2Placeholder catalog2Placeholder = (Catalog2Placeholder) obj;
        C9074e c9074e = (C9074e) interfaceC10283e;
        String str = catalog2Placeholder.metrica;
        String str2 = catalog2Placeholder.ad;
        String str3 = catalog2Placeholder.vip;
        List list = catalog2Placeholder.license;
        TextView textView = c9074e.f18175e;
        ImageView imageView = c9074e.f18174e;
        if (this.f21852e) {
            AbstractC15876e abstractC15876e = this.f21853e;
            if (abstractC15876e.admob()) {
                C0576e c0576e = abstractC15876e.f8229e;
                C0576e c0576e2 = abstractC15876e.f8236e;
                String str4 = catalog2Placeholder.metrica;
                boolean billing = AbstractC7890e.billing(str2, "synth_search");
                String str5 = BuildConfig.FLAVOR;
                if (billing) {
                    FrameLayout frameLayout = abstractC15876e.f8232e;
                    if (frameLayout == null) {
                        frameLayout = null;
                    }
                    frameLayout.setVisibility(8);
                    ComposeView composeView = abstractC15876e.f8235e;
                    if (composeView == null) {
                        composeView = null;
                    }
                    composeView.setVisibility(0);
                    if (str3 == null) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (str4 == null) {
                        str4 = BuildConfig.FLAVOR;
                    }
                    c0576e2.setValue(new C13045e(R.drawable.ic_search_outline_28, R.string.error_occurred_reload, str3, str4));
                    c0576e.setValue(Boolean.FALSE);
                    abstractC15876e.f8231e = new C0568e(10);
                    FrameLayout frameLayout2 = abstractC15876e.f8232e;
                    if (frameLayout2 == null) {
                        frameLayout2 = null;
                    }
                    frameLayout2.setVisibility(8);
                    ComposeView composeView2 = abstractC15876e.f8235e;
                    (composeView2 != null ? composeView2 : null).setVisibility(0);
                    return;
                }
                String license = list != null ? AbstractC8769e.license(list) : null;
                List list2 = catalog2Placeholder.appmetrica;
                String str6 = (list2 == null || (catalog2Button = (Catalog2Button) AbstractC13480e.m3604this(list2)) == null) ? null : catalog2Button.yandex;
                C5625e c5625e = new C5625e(abstractC15876e, catalog2Placeholder, 28);
                if (str3 == null) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (str4 == null) {
                    str4 = BuildConfig.FLAVOR;
                }
                if (license != null) {
                    str5 = license;
                }
                if (str6 == null) {
                    str6 = "Reload";
                }
                c0576e2.setValue(new C2374e(str5, str3, str4, str6));
                c0576e.setValue(Boolean.TRUE);
                abstractC15876e.f8231e = c5625e;
                FrameLayout frameLayout3 = abstractC15876e.f8232e;
                if (frameLayout3 == null) {
                    frameLayout3 = null;
                }
                frameLayout3.setVisibility(8);
                ComposeView composeView3 = abstractC15876e.f8235e;
                (composeView3 != null ? composeView3 : null).setVisibility(0);
                return;
            }
        }
        if (list == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            String license2 = AbstractC8769e.license(list);
            InterfaceC12732e ad = AbstractC16550e.ad(imageView.getContext());
            C5944e c5944e = new C5944e(imageView.getContext());
            c5944e.metrica = license2;
            AbstractC15659e.license(c5944e, imageView);
            ((C0624e) ad).ad(c5944e.ad());
        }
        if (AbstractC6507e.pro(str2, "_synth", false)) {
            textView.setVisibility(0);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_error_outline_28);
            imageView.setImageTintList(ColorStateList.valueOf(AbstractC15933e.ad(R.attr.text_primary)));
            textView.setText(str3);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            VKXApplication.Companion companion = VKXApplication.f36531e;
            layoutParams.height = VKXApplication.Companion.ad(64.0f);
            layoutParams.width = VKXApplication.Companion.ad(64.0f);
            imageView.setLayoutParams(layoutParams);
        } else {
            imageView.setImageTintList(null);
            textView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            VKXApplication.Companion companion2 = VKXApplication.f36531e;
            layoutParams2.height = VKXApplication.Companion.ad(128.0f);
            layoutParams2.width = VKXApplication.Companion.ad(128.0f);
            imageView.setLayoutParams(layoutParams2);
        }
        TextView textView2 = c9074e.f18173e;
        if (str == null || str.length() == 0) {
            str = str3;
        }
        textView2.setText(AbstractC6507e.subscription(str, "<br/>", "\n", false));
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return R.layout.c3_placeholder;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_placeholder, viewGroup, false);
        int i = R.id.image;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.image);
        if (imageView != null) {
            i = R.id.text;
            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.text);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.title);
                if (textView2 != null) {
                    return new C9074e(imageView, (LinearLayout) inflate, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
