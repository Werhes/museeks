package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9735e {
    public static final C13648e ad = new C13648e(null, 0, false, 0.0f, new C12103e(1), 0.0f, false, AbstractC9743e.ad(C2693e.f6576e), AbstractC14410e.ad(), AbstractC2278e.vip(0, 0, 0, 0, 15), C13664e.f27089e, 0, 0, 0, EnumC17426e.f34146e, 0, 0);

    public static final C4993e ad(final int i, int i2, C13770e c13770e) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        C11883e c11883e = C4993e.isPro;
        boolean license = c13770e.license(i) | c13770e.license(0);
        Object m3681throw = c13770e.m3681throw();
        if (license || m3681throw == C2987e.ad) {
            m3681throw = new Function0() { // from class: eؚٟؓ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new C4993e(i, 0);
                }
            };
            c13770e.m3682throws(m3681throw);
        }
        return (C4993e) AbstractC10510e.appmetrica(objArr, c11883e, (Function0) m3681throw, c13770e, 0);
    }
}
