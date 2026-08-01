package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۙۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13477e implements InterfaceC7224e, InterfaceC7860e {
    public final /* synthetic */ InterfaceC7224e ad;
    public final AbstractC11110e appmetrica;
    public final C5609e billing;
    public final C12916e license;
    public final C10981e metrica;
    public final List purchase;
    public final C10981e vip;

    public C13477e(InterfaceC7224e interfaceC7224e, C10981e c10981e, C10981e c10981e2) {
        this.ad = interfaceC7224e;
        this.vip = c10981e;
        this.metrica = c10981e2;
        C12916e c12916e = new C12916e(10);
        this.license = c12916e;
        this.appmetrica = C10327e.f20377e.mo2797class(Arrays.asList(new C2913e(R.drawable.ic_search_outline_28), new C7533e(R.string.tv_nav_home), new C7533e(R.string.tv_nav_library), new C7533e(R.string.tv_nav_now), new C2913e(R.drawable.ic_settings_outline_28)));
        this.purchase = AbstractC6874e.startapp(EnumC14098e.f27886e, EnumC14098e.f27885e, EnumC14098e.f27887e, EnumC14098e.f27884e, EnumC14098e.f27890e);
        InterfaceC5372e serializer = EnumC14098e.Companion.serializer();
        C14874e c14874e = new C14874e(2, this, C13477e.class, "childFactory", "childFactory(Lua/itaysonlab/vkxtv/components/main/TvMainNavigationComponent$NavigationPage;Lcom/arkivanov/decompose/ComponentContext;)Lua/itaysonlab/vkxtv/core/ComposeComponent;", 0, 0, 12);
        C5671e c5671e = new C5671e(25, this);
        C14151e c14151e = new C14151e((byte) 0, 28);
        this.billing = AbstractC5357e.vip(this, c12916e, "DefaultChildPages", new Celse(c5671e, c14151e, 29), new C0609e(28, new C11881e(serializer, 0)), new C12439e(new C11881e(serializer, 1), c14151e, 28), new C2920e(c14151e, 4, (byte) 0), new C8171e(9), new C9868e(11), new C10310e(5), c14874e);
    }

    @Override // defpackage.InterfaceC7860e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-1223312072);
        int i3 = i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            InterfaceC3314e vip = AbstractC3265e.vip(this.billing, c13770e, 0);
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            int i5 = ((C6934e) vip.getValue()).vip;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C17955e(19, this);
                c13770e.m3682throws(m3681throw);
            }
            billing(i5, (i3 << 6) & 7168, c13770e, null, (Function1) m3681throw);
            Object obj = ((C6934e) vip.getValue()).ad.get(((C6934e) vip.getValue()).vip);
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            InterfaceC12864e premium = metrica.premium(new C5228e(1.0f, true));
            boolean license = c13770e.license(startapp);
            Object m3681throw2 = c13770e.m3681throw();
            if (license || m3681throw2 == c5170e) {
                m3681throw2 = new C15355e(startapp, 2);
                c13770e.m3682throws(m3681throw2);
            }
            i2 = i;
            AbstractC7572e.vip(obj, premium, (Function1) m3681throw2, null, null, null, AbstractC5756e.ad, c13770e, 1572864, 56);
            c13770e.Signature(true);
        } else {
            i2 = i;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(this, interfaceC12864e, i2, 26);
        }
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC1722e appmetrica() {
        return this.ad.appmetrica();
    }

    public final void billing(int i, int i2, C13770e c13770e, InterfaceC12864e interfaceC12864e, Function1 function1) {
        C13477e c13477e;
        InterfaceC12864e interfaceC12864e2;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1038567256);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= c13770e2.license(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c13770e2.yandex(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            c13477e = this;
            i3 |= c13770e2.yandex(c13477e) ? 2048 : 1024;
        } else {
            c13477e = this;
        }
        if (c13770e2.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            C0115e c0115e = C0115e.f1276e;
            float f = 24;
            InterfaceC12864e metrica = AbstractC16136e.metrica(AbstractC12220e.advert(AbstractC18007e.metrica(c0115e, 1.0f), 32, f), ((C6032e) c13770e2.adcel(AbstractC12491e.ad)).startapp(), AbstractC10432e.ad);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e2.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, metrica);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, license, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            c13477e.yandex(i, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168), c13770e2, AbstractC18007e.metrica(c0115e, 1.0f), function1);
            c13770e2 = c13770e2;
            AbstractC4260e.ad(AbstractC12475e.metrica(R.drawable.logo_vkx_32, 0, c13770e2), AbstractC18007e.startapp(C14486e.ad.ad(c0115e, C5438e.f11666e), f), C3618e.appmetrica, c13770e2, 3128, 0);
            c13770e2.Signature(true);
            interfaceC12864e2 = c0115e;
        } else {
            c13770e2.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C10145e(this, interfaceC12864e2, i, function1, i2, 0);
        }
    }

    @Override // defpackage.InterfaceC7224e
    public final C13391e license() {
        return this.ad.license();
    }

    @Override // defpackage.InterfaceC7224e
    public final C16722e metrica() {
        return this.ad.metrica();
    }

    @Override // defpackage.InterfaceC7224e
    public final C15723e purchase() {
        return this.ad.purchase();
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC10540e vip() {
        return this.ad.vip();
    }

    public final void yandex(int i, int i2, C13770e c13770e, InterfaceC12864e interfaceC12864e, Function1 function1) {
        int i3;
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(-286424268);
        if ((i2 & 6) == 0) {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c13770e.license(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c13770e.yandex(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c13770e.yandex(this) ? 2048 : 1024;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = new C6260e();
                c13770e.m3682throws(m3681throw);
            }
            C6260e c6260e = (C6260e) m3681throw;
            interfaceC12864e2 = interfaceC12864e;
            AbstractC3199e.m1313goto(i, AbstractC8116e.metrica(interfaceC12864e2, c6260e), C3618e.startapp, 0L, null, null, AbstractC16653e.license(1409056141, new C2329e(this, i, function1, c6260e), c13770e), c13770e, ((i3 >> 3) & 14) | 1573248);
        } else {
            interfaceC12864e2 = interfaceC12864e;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C10145e(this, interfaceC12864e2, i, function1, i2, 1);
        }
    }
}
