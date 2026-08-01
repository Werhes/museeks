package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1284e {
    public static final C2892e ad = new C2892e(2082897701, false, new C10417e(16));
    public static final C2892e vip = new C2892e(1831944384, false, new C10417e(17));
    public static final C2892e metrica = new C2892e(-1010154403, false, new C10417e(18));
    public static final C2892e license = new C2892e(-1168379553, false, new C10417e(19));
    public static final C2892e appmetrica = new C2892e(1774451553, false, new C10417e(20));
    public static final C2892e purchase = new C2892e(-2019028860, false, new C9012e(5));

    public static C16747e ad(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new C16747e(AbstractC9546e.ad, Float.valueOf(f), new C2493e(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final InterfaceC4077e appmetrica(InterfaceC5334e interfaceC5334e, C11709e c11709e) {
        if (interfaceC5334e.mo1887e(AbstractC3167e.ad) != null) {
            throw new ClassCastException();
        }
        InterfaceC11348e mo1886e = interfaceC5334e.mo1886e(c11709e.ad);
        C13579e c13579e = c11709e.vip.ad;
        c13579e.getClass();
        List purchase2 = C13579e.purchase(c13579e);
        C5266e c5266e = ((C14887e) mo1886e).f29499e;
        C0520e c0520e = (C0520e) AbstractC13480e.m3591interface(purchase2);
        EnumC2192e enumC2192e = EnumC2192e.f5579e;
        InterfaceC4077e appmetrica2 = c5266e.appmetrica(c0520e, enumC2192e);
        if (appmetrica2 != null) {
            for (C0520e c0520e2 : purchase2.subList(1, purchase2.size())) {
                if (appmetrica2 instanceof InterfaceC5052e) {
                    InterfaceC4077e appmetrica3 = ((InterfaceC5052e) appmetrica2).mo1730e().appmetrica(c0520e2, enumC2192e);
                    appmetrica2 = appmetrica3 instanceof InterfaceC5052e ? (InterfaceC5052e) appmetrica3 : null;
                    if (appmetrica2 != null) {
                    }
                }
            }
            return appmetrica2;
        }
        return null;
    }

    public static void billing(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1094e.ad(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0643e viewOnLongClickListenerC0643e = ViewOnLongClickListenerC0643e.f2883e;
        if (viewOnLongClickListenerC0643e != null && viewOnLongClickListenerC0643e.f2891e == view) {
            ViewOnLongClickListenerC0643e.vip(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0643e(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0643e viewOnLongClickListenerC0643e2 = ViewOnLongClickListenerC0643e.f2882e;
        if (viewOnLongClickListenerC0643e2 != null && viewOnLongClickListenerC0643e2.f2891e == view) {
            viewOnLongClickListenerC0643e2.ad();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final InterfaceC5052e license(InterfaceC5334e interfaceC5334e, C11709e c11709e) {
        InterfaceC4077e appmetrica2 = appmetrica(interfaceC5334e, c11709e);
        if (appmetrica2 instanceof InterfaceC5052e) {
            return (InterfaceC5052e) appmetrica2;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [eٌّؒ, eٔؐۜ] */
    public static C1962e metrica(String str, String str2, String str3, boolean z) {
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        C4761e c4761e = new C4761e();
        c4761e.ad = str2;
        c4761e.f10191goto = 20;
        c4761e.remoteconfig = Boolean.valueOf(!z);
        c4761e.subscription = Boolean.valueOf(z);
        c4761e.f10194this = AbstractC2301e.vip(new C6571e("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str3), new C6571e("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2), new C6571e("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2));
        return new C1962e(str, new C14435e(c9466e), null, new C15197e(c9457e), new C12053e(c4761e), c13325e);
    }

    public static final InterfaceC5052e purchase(InterfaceC5334e interfaceC5334e, C11709e c11709e, C11980e c11980e) {
        InterfaceC5052e license2 = license(interfaceC5334e, c11709e);
        return license2 != null ? license2 : c11980e.m3294default(c11709e, AbstractC7762e.Signature(new C2167e(AbstractC7762e.advert(c11709e, C3536e.f7978e), C7247e.f14811e)));
    }

    public static C16747e vip(C16747e c16747e, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) c16747e.f32835e.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C2493e) c16747e.f32834e).ad;
        }
        return new C16747e(c16747e.f32837e, Float.valueOf(f), new C2493e(f2), c16747e.f32836e, c16747e.f32833e, c16747e.f32838e);
    }
}
