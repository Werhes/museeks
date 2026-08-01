package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10004e {
    public static final C10004e ad = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؒۨ, java.lang.Object] */
    static {
        int i = C3618e.mopub;
        long j = C3618e.startapp;
    }

    public final void ad(final C5819e c5819e, final boolean z, InterfaceC12864e interfaceC12864e, long j, long j2, C13770e c13770e, final int i) {
        int i2;
        final InterfaceC12864e interfaceC12864e2;
        final long j3;
        final long j4;
        InterfaceC12864e interfaceC12864e3;
        long j5;
        long j6;
        c13770e.m3671package(154996744);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(c5819e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.billing(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 9363) != 9362)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                C15492e c15492e = AbstractC12491e.ad;
                long appmetrica = ((C6032e) c13770e.adcel(c15492e)).appmetrica();
                long vip = C3618e.vip(0.4f, ((C6032e) c13770e.adcel(c15492e)).yandex());
                interfaceC12864e3 = C0115e.f1276e;
                j5 = appmetrica;
                j6 = vip;
            } else {
                c13770e.m3659default();
                interfaceC12864e3 = interfaceC12864e;
                j5 = j;
                j6 = j2;
            }
            c13770e.admob();
            float f = c5819e.metrica;
            float f2 = c5819e.vip;
            InterfaceC16132e ad2 = AbstractC16102e.ad(f - c5819e.ad, null, "PillIndicator.width", c13770e, 384, 10);
            float f3 = c5819e.license - f2;
            InterfaceC16132e ad3 = AbstractC16102e.ad(c5819e.ad, null, "PillIndicator.leftOffset", c13770e, 384, 10);
            InterfaceC16132e ad4 = AbstractC3145e.ad(z ? j5 : j6, null, "PillIndicator.pillColor", null, c13770e, 384, 10);
            InterfaceC12864e Signature = AbstractC18007e.Signature(AbstractC18007e.metrica(interfaceC12864e3, 1.0f), C5438e.f11682e);
            boolean purchase = c13770e.purchase(ad3) | c13770e.metrica(f2);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C15741e(f2, ad3, 2);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e license = AbstractC18007e.license(AbstractC18007e.smaato(AbstractC6532e.isPro(Signature, (Function1) m3681throw), ((C15765e) ad2.getValue()).f31051e), f3);
            long j7 = ((C3618e) ad4.getValue()).ad;
            C3924e c3924e = AbstractC6549e.ad;
            C14872e c14872e = new C14872e(50);
            AbstractC17074e.ad(AbstractC16136e.metrica(license, j7, new C3924e(c14872e, c14872e, c14872e, c14872e)).premium(new C1904e(-1.0f)), c13770e, 0);
            interfaceC12864e2 = interfaceC12864e3;
            j3 = j5;
            j4 = j6;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            j3 = j;
            j4 = j2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eِ٘ۘ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C10004e.this.ad(c5819e, z, interfaceC12864e2, j3, j4, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void vip(C13770e c13770e, int i) {
        c13770e.m3671package(-562414269);
        int i2 = i & 1;
        if (c13770e.m3673protected(i2, i2 != 0)) {
            AbstractC12534e.ad(c13770e, AbstractC18007e.smaato(C0115e.f1276e, 8));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3450e(this, i, 18);
        }
    }
}
