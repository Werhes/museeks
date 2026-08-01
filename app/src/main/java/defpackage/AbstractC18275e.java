package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18275e {
    public static final C2892e ad = new C2892e(-741458230, false, new C14498e(8));
    public static final C2892e vip = new C2892e(1083376610, false, new C10387e(19));
    public static final C2892e metrica = new C2892e(80192488, false, new C14498e(9));
    public static final C2892e license = new C2892e(-105302631, false, new C10387e(20));
    public static final C2892e appmetrica = new C2892e(17601306, false, new C10387e(21));
    public static final C2892e purchase = new C2892e(155250553, false, new C14498e(10));
    public static final C2892e billing = new C2892e(-462719364, false, new C14498e(11));

    public static final void ad(Function0 function0, C9207e c9207e, C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(826668973);
        int i2 = i | (c13770e.yandex(function0) ? 4 : 2) | (c13770e.purchase(c9207e) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            View view = (View) c13770e.adcel(AbstractC2676e.purchase);
            InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
            EnumC7792e enumC7792e = (EnumC7792e) c13770e.adcel(AbstractC11473e.amazon);
            C14725e billing2 = AbstractC5546e.billing(c13770e);
            InterfaceC3314e mopub = AbstractC14533e.mopub(c2892e, c13770e);
            Object[] objArr = new Object[0];
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = C17121e.f33494e;
                c13770e.m3682throws(m3681throw);
            }
            UUID uuid = (UUID) AbstractC10510e.license(objArr, (Function0) m3681throw, c13770e);
            c9207e.getClass();
            boolean license2 = c13770e.license(2) | c13770e.purchase(view) | c13770e.purchase(interfaceC14388e) | c13770e.purchase(null);
            Object m3681throw2 = c13770e.m3681throw();
            if (license2 || m3681throw2 == obj) {
                DialogC4128e dialogC4128e = new DialogC4128e(function0, c9207e, view, enumC7792e, interfaceC14388e, uuid);
                C2892e c2892e2 = new C2892e(-1338939603, true, new C1827e(1, mopub));
                C1262e c1262e = dialogC4128e.f9095e;
                c1262e.setParentCompositionContext(billing2);
                c1262e.f3967e.setValue(c2892e2);
                c1262e.f3966e = true;
                c1262e.license();
                c13770e.m3682throws(dialogC4128e);
                m3681throw2 = dialogC4128e;
            }
            DialogC4128e dialogC4128e2 = (DialogC4128e) m3681throw2;
            boolean yandex = c13770e.yandex(dialogC4128e2);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex || m3681throw3 == obj) {
                m3681throw3 = new C14820e(dialogC4128e2, 0);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC17680e.vip(dialogC4128e2, (Function1) m3681throw3, c13770e);
            boolean yandex2 = c13770e.yandex(dialogC4128e2) | ((i2 & 14) == 4) | ((i2 & 112) == 32) | c13770e.license(enumC7792e.ordinal());
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex2 || m3681throw4 == obj) {
                m3681throw4 = new C7178e(dialogC4128e2, function0, c9207e, enumC7792e);
                c13770e.m3682throws(m3681throw4);
            }
            AbstractC17680e.purchase((Function0) m3681throw4, c13770e);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6477e(function0, c9207e, c2892e, i, 0);
        }
    }

    public static final void appmetrica(TextView textView, C11227e c11227e) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        Integer num = c11227e.amazon;
        Integer num2 = c11227e.mopub;
        Integer num3 = c11227e.startapp;
        Drawable drawable8 = null;
        if (num3 == null) {
            Integer num4 = c11227e.smaato;
            if (num4 != null) {
                num3 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num4.intValue()));
            } else {
                num3 = null;
            }
            if (num3 == null) {
                if (num != null) {
                    num3 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num.intValue()));
                } else {
                    num3 = null;
                }
            }
        }
        Integer num5 = c11227e.yandex;
        if (num5 == null) {
            Integer num6 = c11227e.advert;
            if (num6 != null) {
                num5 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num6.intValue()));
            } else {
                num5 = null;
            }
            if (num5 == null) {
                if (num != null) {
                    num5 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num.intValue()));
                } else {
                    num5 = null;
                }
            }
        }
        Integer num7 = c11227e.ad;
        if (num7 != null) {
            drawable = AbstractC4628e.purchase(textView.getContext(), num7.intValue());
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable2 = AbstractC6143e.loadAd(drawable, textView.getContext(), num5, num3);
            if (num2 != null) {
                drawable2.setTintList(ColorStateList.valueOf(num2.intValue()));
            }
        } else {
            drawable2 = null;
        }
        Integer num8 = c11227e.vip;
        if (num8 != null) {
            drawable3 = AbstractC4628e.purchase(textView.getContext(), num8.intValue());
        } else {
            drawable3 = null;
        }
        if (drawable3 != null) {
            drawable4 = AbstractC6143e.loadAd(drawable3, textView.getContext(), num5, num3);
            if (num2 != null) {
                drawable4.setTintList(ColorStateList.valueOf(num2.intValue()));
            }
        } else {
            drawable4 = null;
        }
        Integer num9 = c11227e.metrica;
        if (num9 != null) {
            drawable5 = AbstractC4628e.purchase(textView.getContext(), num9.intValue());
        } else {
            drawable5 = null;
        }
        if (drawable5 != null) {
            drawable6 = AbstractC6143e.loadAd(drawable5, textView.getContext(), num5, num3);
            if (num2 != null) {
                drawable6.setTintList(ColorStateList.valueOf(num2.intValue()));
            }
        } else {
            drawable6 = null;
        }
        Integer num10 = c11227e.license;
        if (num10 != null) {
            drawable7 = AbstractC4628e.purchase(textView.getContext(), num10.intValue());
        } else {
            drawable7 = null;
        }
        if (drawable7 != null) {
            drawable8 = AbstractC6143e.loadAd(drawable7, textView.getContext(), num5, num3);
            if (num2 != null) {
                drawable8.setTintList(ColorStateList.valueOf(num2.intValue()));
            }
        }
        if (c11227e.appmetrica) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable4, drawable8, drawable2, drawable6);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable8, drawable4, drawable6);
        }
        Integer num11 = c11227e.billing;
        if (num11 != null) {
            textView.setCompoundDrawablePadding(num11.intValue());
        } else {
            Integer num12 = c11227e.adcel;
            if (num12 != null) {
                textView.setCompoundDrawablePadding(textView.getContext().getResources().getDimensionPixelSize(num12.intValue()));
            }
        }
        textView.setContentDescription(c11227e.purchase);
    }

    public static final void license(InterfaceC12864e interfaceC12864e, Function2 function2, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(1090521195);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function2) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = C3783e.vip;
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw;
            long j = c13770e.f27286case;
            int i3 = (int) ((j >>> 32) ^ j);
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            int i4 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, interfaceC2747e, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            function2.invoke(c13770e, Integer.valueOf((i4 >> 6) & 14));
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4467e(interfaceC12864e, function2, i, 0);
        }
    }

    public static final void metrica(C2892e c2892e, C2892e c2892e2, C2892e c2892e3, C13770e c13770e, int i) {
        c13770e.m3671package(709166801);
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j = c13770e.f27286case;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, c0115e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i2);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j2 = c13770e.f27286case;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, c0115e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i3, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            c2892e2.invoke(c13770e, 6);
            c2892e.invoke(c13770e, 6);
            c13770e.Signature(true);
            c2892e3.invoke(c13770e, 6);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4197e(c2892e, c2892e2, c2892e3, i);
        }
    }

    public static final AbstractC3743e purchase(Executor executor) {
        AbstractC3743e abstractC3743e;
        ExecutorC14324e executorC14324e = executor instanceof ExecutorC14324e ? (ExecutorC14324e) executor : null;
        return (executorC14324e == null || (abstractC3743e = executorC14324e.f28325e) == null) ? new C14530e(executor) : abstractC3743e;
    }

    public static final void vip(int i, int i2, C13770e c13770e, int i3) {
        Object subs;
        int i4 = i2;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1808130633);
        int i5 = i3 | (c13770e2.license(i) ? 4 : 2) | (c13770e2.license(i4) ? 32 : 16);
        if (c13770e2.m3673protected(i5 & 1, (i5 & 19) != 18)) {
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 8, 0.0f, 2);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e2.f27286case;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, smaato);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i6), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
            boolean z = (i5 & 14) == 4;
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (z || m3681throw == c5170e) {
                DecimalFormat decimalFormat = C5575e.ad;
                m3681throw = AbstractC15920e.subs(i, false);
                c13770e2.m3682throws(m3681throw);
            }
            C10156e c10156e = C5438e.f11666e;
            C14486e c14486e = C14486e.ad;
            InterfaceC12864e ad2 = c14486e.ad(c0115e, c10156e);
            C5015e c5015e = AbstractC0608e.ad;
            long vip2 = C3618e.vip(0.5f, ((C3618e) c13770e2.adcel(c5015e)).ad);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip((String) m3681throw, ad2, vip2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.amazon, c13770e, 0, 0, 131064);
            boolean z2 = (i5 & 112) == 32;
            Object m3681throw2 = c13770e.m3681throw();
            if (z2 || m3681throw2 == c5170e) {
                DecimalFormat decimalFormat2 = C5575e.ad;
                i4 = i2;
                subs = AbstractC15920e.subs(i4, false);
                c13770e.m3682throws(subs);
            } else {
                subs = m3681throw2;
                i4 = i2;
            }
            AbstractC14489e.vip((String) subs, c14486e.ad(c0115e, C5438e.f11699e), C3618e.vip(0.5f, ((C3618e) c13770e.adcel(c5015e)).ad), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.amazon, c13770e, 0, 0, 131064);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C3572e(i, i4, i3);
        }
    }
}
