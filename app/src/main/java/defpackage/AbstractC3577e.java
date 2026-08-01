package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3577e {
    public static final C15492e ad = new AbstractC4455e(new C0568e(27));

    public static final void ad(final long j, final long j2, final C2892e c2892e, C13770e c13770e, final int i) {
        c13770e.m3671package(874084409);
        int i2 = (c13770e.appmetrica(j) ? 4 : 2) | i | (c13770e.appmetrica(j2) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object m3681throw = c13770e.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                m3681throw = new C0896e(j, j2);
                c13770e.m3682throws(m3681throw);
            }
            C0896e c0896e = (C0896e) m3681throw;
            AbstractC1101e.vip(new C14815e[]{ad.ad(c0896e), AbstractC8703e.loadAd(c0896e.ad, AbstractC0608e.ad)}, c2892e, c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(j, j2, c2892e, i) { // from class: eٌٕٝ

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f17738e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ long f17739e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ long f17740e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(385);
                    AbstractC3577e.ad(this.f17740e, this.f17739e, this.f17738e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
