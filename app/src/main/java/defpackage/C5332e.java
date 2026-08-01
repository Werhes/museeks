package defpackage;

import java.math.BigInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؐؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5332e implements InterfaceC8572e {
    public static final C7056e[] ad = {C7056e.loadAd};
    public static final C5332e vip = new Object();

    @Override // defpackage.InterfaceC8572e
    public final C7056e[] ad() {
        return (C7056e[]) ad.clone();
    }

    @Override // defpackage.InterfaceC8572e
    public final C1548e vip(C7056e c7056e, C2527e c2527e, long j) {
        BigInteger metrica = AbstractC12394e.metrica(c2527e);
        c2527e.skip(metrica.longValue() - 24);
        return new C1548e(c7056e, j, metrica);
    }
}
