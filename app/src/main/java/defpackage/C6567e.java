package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6567e {
    public final double ad;
    public final HashMap metrica = new HashMap();
    public final double vip;

    public C6567e(double d, double d2) {
        this.ad = d;
        this.vip = d2;
    }

    public final double ad(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.metrica;
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = Double.valueOf(new C13797e(AbstractC5190e.adcel(this.ad, 200.0d, i)).metrica);
            hashMap.put(valueOf, obj);
        }
        return ((Number) obj).doubleValue();
    }
}
