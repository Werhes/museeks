package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۙ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14940e {
    public static final long ad = AbstractC2278e.vip(0, 0, 0, 0, 5);
    public static final /* synthetic */ int vip = 0;

    /* JADX WARN: Type inference failed for: r2v2, types: [eؘٙۛ, java.lang.Object] */
    public static final InterfaceC10819e ad(InterfaceC2872e interfaceC2872e, C13770e c13770e) {
        C0113e c0113e;
        boolean billing = AbstractC7890e.billing(interfaceC2872e, C16477e.appmetrica);
        boolean billing2 = c13770e.billing(billing);
        Object m3681throw = c13770e.m3681throw();
        if (billing2 || m3681throw == C2987e.ad) {
            if (billing) {
                c0113e = InterfaceC10819e.f21455e;
            } else {
                ?? obj = new Object();
                obj.f12120e = ad;
                obj.f12119e = new ArrayList();
                c0113e = obj;
            }
            m3681throw = c0113e;
            c13770e.m3682throws(m3681throw);
        }
        return (InterfaceC10819e) m3681throw;
    }

    public static void metrica(String str) {
        throw new IllegalArgumentException(AbstractC17861e.admob("Unsupported type: ", str, ". ", AbstractC5087e.m1746extends("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final long vip(long j) {
        return (AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }
}
