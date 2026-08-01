package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14916e extends AbstractC13828e {
    public final HashMap mopub;

    public C14916e() {
        HashMap hashMap = new HashMap();
        this.mopub = hashMap;
        hashMap.put("TIME-OFFSET", new C3270e(9));
        hashMap.put("PRECISE", new C3270e(10));
    }

    @Override // defpackage.AbstractC13828e
    public final void appmetrica(C15816e c15816e, C2697e c2697e) {
        C1828e c1828e = c2697e.yandex;
        if (c1828e != null) {
            license(c15816e, c1828e, this.mopub);
        }
    }

    @Override // defpackage.AbstractC17001e
    public final boolean metrica() {
        return true;
    }

    @Override // defpackage.AbstractC17001e
    public final String vip() {
        return "EXT-X-START";
    }
}
