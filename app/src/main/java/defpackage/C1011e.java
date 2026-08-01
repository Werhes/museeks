package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f3459e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C0576e f3460e;

    public C1011e() {
        super(0);
        SharedPreferences sharedPreferences;
        if (!AbstractC8561e.vip) {
            throw new RuntimeException("Scrobbler not initialized!");
        }
        SharedPreferences sharedPreferences2 = AbstractC8561e.ad;
        String str = null;
        if ((sharedPreferences2 != null ? sharedPreferences2.getString("sessionKey", null) : null) != null && (sharedPreferences = AbstractC8561e.ad) != null) {
            str = sharedPreferences.getString("username", null);
        }
        this.f3460e = AbstractC14533e.startapp(str);
        this.f3459e = AbstractC14533e.startapp(Boolean.FALSE);
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(750175292);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            if (((Boolean) this.f3459e.getValue()).booleanValue()) {
                c13770e.m3676strictfp(1757353597);
                m448strictfp(c13770e, i2 & 14);
            } else {
                c13770e.m3676strictfp(1754545958);
            }
            c13770e.Signature(false);
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                C15101e c15101e = new C15101e(0, this, C1011e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 15);
                c13770e.m3682throws(c15101e);
                m3681throw = c15101e;
            }
            Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C2109e(18, this);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e2 = c13770e;
            AbstractC11575e.ad(AbstractC7255e.ad, function0, null, (Function1) m3681throw2, c13770e2, 6, 4);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C17761e(this, i, 2);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m448strictfp(C13770e c13770e, int i) {
        final C12380e c12380e;
        C12380e c12380e2;
        C1011e c1011e;
        c13770e.m3671package(1305286932);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                C6260e c6260e = C6260e.vip;
                m3681throw = C11080e.ad;
                c13770e.m3682throws(m3681throw);
            }
            ((C11080e) m3681throw).getClass();
            final C6260e c6260e2 = new C6260e();
            final C6260e c6260e3 = new C6260e();
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw2);
            }
            final InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw2;
            int i3 = 3;
            final C12380e tapsense = AbstractC12947e.tapsense(null, c13770e, 3);
            C12380e tapsense2 = AbstractC12947e.tapsense(null, c13770e, 3);
            final InterfaceC16054e interfaceC16054e = (InterfaceC16054e) c13770e.adcel(AbstractC11473e.startapp);
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == obj) {
                m3681throw3 = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw3;
            Object m3681throw4 = c13770e.m3681throw();
            if (m3681throw4 == obj) {
                m3681throw4 = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e.m3682throws(m3681throw4);
            }
            final InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) m3681throw4;
            Object m3681throw5 = c13770e.m3681throw();
            if (m3681throw5 == obj) {
                m3681throw5 = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e.m3682throws(m3681throw5);
            }
            final InterfaceC3314e interfaceC3314e3 = (InterfaceC3314e) m3681throw5;
            boolean purchase = c13770e.purchase(tapsense) | c13770e.purchase(tapsense2) | c13770e.yandex(interfaceC16054e) | c13770e.purchase(c6260e2) | c13770e.purchase(c6260e3) | c13770e.yandex(interfaceC18435e) | c13770e.yandex(this);
            Object m3681throw6 = c13770e.m3681throw();
            if (purchase || m3681throw6 == obj) {
                c12380e = tapsense2;
                Object obj2 = new Function0() { // from class: eٌؔٝ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C12380e c12380e3 = C12380e.this;
                        if (c12380e3.vip().f33322e.length() > 0) {
                            C12380e c12380e4 = c12380e;
                            if (c12380e4.vip().f33322e.length() > 0) {
                                AbstractC4653e.startapp(interfaceC16054e);
                                c6260e2.ad();
                                c6260e3.ad();
                                AbstractC5336e.purchase(interfaceC18435e, null, 0, new C14164e(this, c12380e3, c12380e4, interfaceC3314e2, interfaceC3314e3, null, 10), 3);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                c12380e2 = tapsense;
                c6260e2 = c6260e2;
                c6260e3 = c6260e3;
                c1011e = this;
                c13770e.m3682throws(obj2);
                m3681throw6 = obj2;
            } else {
                c12380e = tapsense2;
                c12380e2 = tapsense;
                c1011e = this;
            }
            Function0 function0 = (Function0) m3681throw6;
            boolean yandex = c13770e.yandex(c1011e);
            Object m3681throw7 = c13770e.m3681throw();
            if (yandex || m3681throw7 == obj) {
                m3681throw7 = new C14557e(c1011e, 2);
                c13770e.m3682throws(m3681throw7);
            }
            AbstractC9262e.ad((Function0) m3681throw7, AbstractC16653e.license(1861476188, new C6409e(c12380e2, c12380e, function0, interfaceC3314e2, 8), c13770e), null, AbstractC16653e.license(1951536478, new C17761e(c1011e, i3), c13770e), null, AbstractC7255e.advert, AbstractC16653e.license(-60856735, new C16219e(c6260e3, c6260e2, c12380e2, function0, c12380e, interfaceC3314e2, interfaceC3314e, interfaceC3314e3), c13770e), null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1772592, 0, 16276);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17761e(this, i, 4);
        }
    }
}
