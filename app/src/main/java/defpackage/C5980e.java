package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۢؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5980e extends AbstractC16997e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C7463e f12578e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final String f12579e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public boolean f12580e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C6112e f12581e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f12582e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C16430e f12583e;

    public C5980e(String str, C6112e c6112e, C16430e c16430e) {
        super(false, 1);
        this.f12579e = str;
        this.f12581e = c6112e;
        this.f12583e = c16430e;
        this.f12578e = new C7463e(VKXApplication.f36529e, new C16364e(this, 0), new C16364e(this, 1));
        this.f12582e = AbstractC14533e.startapp(Boolean.FALSE);
    }

    @Override // defpackage.AbstractC5004e
    public final void amazon() {
        super.amazon();
        if (this.f12580e) {
            return;
        }
        this.f12581e.invoke();
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(-1716523384);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Map singletonMap = Collections.singletonMap("X-Requested-With", "com.vkontakte.android");
            int i3 = AbstractC10901e.ad;
            Object m3681throw = c13770e.m3681throw();
            String str = this.f12579e;
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C8921e(new C12311e(str, singletonMap));
                c13770e.m3682throws(m3681throw);
            }
            C8921e c8921e = (C8921e) m3681throw;
            c8921e.vip.setValue(new C12311e(str, singletonMap));
            C7913e c7913e = AbstractC18007e.metrica;
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c7913e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            C0576e c0576e = this.f12582e;
            InterfaceC12864e ad = AbstractC1376e.ad(c7913e, ((Boolean) c0576e.getValue()).booleanValue() ? 1.0f : 0.0f);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C17872e(this);
                c13770e.m3682throws(m3681throw2);
            }
            C17872e c17872e = (C17872e) m3681throw2;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex || m3681throw3 == c5170e) {
                m3681throw3 = new C16364e(this, 2);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC10901e.ad(c8921e, ad, false, null, (Function1) m3681throw3, null, c17872e, null, c13770e, 0);
            if (((Boolean) c0576e.getValue()).booleanValue()) {
                c13770e.m3676strictfp(-462453728);
            } else {
                c13770e.m3676strictfp(-459103837);
                AbstractC6232e.vip(C14486e.ad.ad(C0115e.f1276e, C5438e.f11700e), 0L, null, c13770e, 0, 6);
            }
            c13770e.Signature(false);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11213e(this, i, 10);
        }
    }
}
