package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11986e extends AbstractC10347e {
    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        C11986e c11986e;
        C4993e c4993e;
        C10743e c10743e;
        c13770e.m3671package(1689918378);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC1108e ad = ((InterfaceC8018e) ((C7850e) AbstractC1831e.metrica().f22774e).f15896e).ad();
            ((C7850e) AbstractC1831e.metrica().f22774e).getClass();
            InterfaceC3314e vip = AbstractC4628e.vip(ad, C15647e.f30853e, c13770e, 0);
            InterfaceC3314e license = AbstractC4628e.license((C14688e) AbstractC1831e.ad().purchase.yandex, c13770e, 0);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
            View view = (View) c13770e.adcel(AbstractC2676e.purchase);
            C4993e ad2 = AbstractC9735e.ad(0, 3, c13770e);
            boolean yandex = c13770e.yandex(view);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == obj) {
                m3681throw2 = new C13138e(view, null, 0);
                c13770e.m3682throws(m3681throw2);
            }
            C10743e appmetrica = AbstractC7763e.appmetrica(ad2, (Function4) m3681throw2, c13770e);
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex2 || m3681throw3 == obj) {
                c4993e = ad2;
                c10743e = appmetrica;
                Object c7736e = new C7736e(0, this, C11986e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 0);
                c13770e.m3682throws(c7736e);
                m3681throw3 = c7736e;
            } else {
                c4993e = ad2;
                c10743e = appmetrica;
            }
            Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw3);
            boolean purchase = c13770e.purchase(vip) | c13770e.purchase(c10743e) | c13770e.yandex(view) | c13770e.yandex(this) | c13770e.yandex(interfaceC18435e) | c13770e.purchase(license);
            Object m3681throw4 = c13770e.m3681throw();
            if (purchase || m3681throw4 == obj) {
                Object c3025e = new C3025e(vip, c10743e, this, interfaceC18435e, view, license);
                c11986e = this;
                c13770e.m3682throws(c3025e);
                m3681throw4 = c3025e;
            } else {
                c11986e = this;
            }
            AbstractC11575e.ad(AbstractC18275e.ad, function0, c4993e, (Function1) m3681throw4, c13770e, 6, 0);
        } else {
            c11986e = this;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17689e(c11986e, i, 2);
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final void m3306private(final int i, final C2892e c2892e, final boolean z, final Function1 function1, final InterfaceC12864e interfaceC12864e, final Integer num, boolean z2, final boolean z3, C13770e c13770e, final int i2) {
        final boolean z4;
        C2892e c2892e2;
        c13770e.m3671package(1144778127);
        int i3 = i2 | (c13770e.license(i) ? 4 : 2) | (c13770e.billing(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.yandex(function1) ? 2048 : 1024) | (c13770e.purchase(interfaceC12864e) ? 16384 : 8192) | (c13770e.purchase(num) ? 131072 : 65536) | 1572864 | (c13770e.billing(z3) ? 8388608 : 4194304) | (c13770e.yandex(this) ? 67108864 : 33554432);
        if (c13770e.m3673protected(i3 & 1, (38347923 & i3) != 38347922)) {
            if (num == null) {
                c13770e.m3676strictfp(2045353790);
                c13770e.Signature(false);
                c2892e2 = null;
            } else {
                c13770e.m3676strictfp(2045353791);
                C2892e license = AbstractC16653e.license(1890167459, new C2172e(num.intValue(), 12, (byte) 0), c13770e);
                c13770e.Signature(false);
                c2892e2 = license;
            }
            boolean yandex = ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new Function0() { // from class: eؘؘ٘
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z3) {
                            function1.invoke(Boolean.valueOf(!z));
                        } else {
                            new C9745e().signatures(this.pro());
                        }
                        return Unit.INSTANCE;
                    }
                };
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC16653e.license(578765293, new C2172e(i, 13, (byte) 0), c13770e), AbstractC1376e.ad(AbstractC9546e.license(interfaceC12864e, true, null, (Function0) m3681throw, 14), 1.0f), null, c2892e2, c2892e, AbstractC16653e.license(1460406578, new C3490e(z3, z, function1), c13770e), null, 0.0f, 0.0f, c13770e, 221190, 452);
            z4 = true;
        } else {
            c13770e.m3659default();
            z4 = z2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(i, c2892e, z, function1, interfaceC12864e, num, z4, z3, i2) { // from class: eٌُؚ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f17351e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f17352e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ int f17353e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ boolean f17354e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ boolean f17355e;

                /* renamed from: eّٕۜ, reason: contains not printable characters */
                public final /* synthetic */ boolean f17356e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ Integer f17358e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f17359e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(49);
                    C11986e.this.m3306private(this.f17353e, this.f17352e, this.f17355e, this.f17351e, this.f17359e, this.f17358e, this.f17354e, this.f17356e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m3307strictfp(final int i, final boolean z, final Function1 function1, final C2892e c2892e, final InterfaceC12864e interfaceC12864e, final Integer num, boolean z2, C13770e c13770e, final int i2) {
        final boolean z3;
        C2892e license;
        c13770e.m3671package(1133569133);
        int i3 = i2 | (c13770e.license(i) ? 4 : 2) | (c13770e.billing(z) ? 32 : 16) | (c13770e.yandex(function1) ? 256 : 128) | (c13770e.purchase(interfaceC12864e) ? 16384 : 8192) | (c13770e.purchase(num) ? 131072 : 65536) | 1572864;
        if (c13770e.m3673protected(i3 & 1, (599187 & i3) != 599186)) {
            if (num == null) {
                c13770e.m3676strictfp(-1169348320);
                c13770e.Signature(false);
                license = null;
            } else {
                c13770e.m3676strictfp(-1169348319);
                license = AbstractC16653e.license(2038603649, new C2172e(num.intValue(), 10, (byte) 0), c13770e);
                c13770e.Signature(false);
            }
            boolean z4 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object m3681throw = c13770e.m3681throw();
            if (z4 || m3681throw == C2987e.ad) {
                m3681throw = new C2221e(4, function1, z);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC16653e.license(-472295989, new C2172e(i, 11, (byte) 0), c13770e), AbstractC1376e.ad(AbstractC9546e.license(interfaceC12864e, true, null, (Function0) m3681throw, 14), 1.0f), null, license, c2892e, AbstractC16653e.license(-133489520, new C16618e(2, function1, z), c13770e), null, 0.0f, 0.0f, c13770e, 221190, 452);
            z3 = true;
        } else {
            c13770e.m3659default();
            z3 = z2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(i, z, function1, c2892e, interfaceC12864e, num, z3, i2) { // from class: eٍَ٘

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f34597e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ boolean f34598e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ int f34599e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ boolean f34600e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f34601e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ Integer f34603e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f34604e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(3073);
                    C11986e.this.m3307strictfp(this.f34599e, this.f34598e, this.f34601e, this.f34597e, this.f34604e, this.f34603e, this.f34600e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
