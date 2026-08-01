package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1595e extends AbstractC13828e {
    public C4903e advert;
    public final HashMap mopub;

    public C1595e() {
        HashMap hashMap = new HashMap();
        this.mopub = hashMap;
        hashMap.put("METHOD", new C3270e(11));
        hashMap.put("URI", new C15679e(this, 0));
        hashMap.put("IV", new C3270e(12));
        hashMap.put("KEYFORMAT", new C15679e(this, 1));
        hashMap.put("KEYFORMATVERSIONS", new C15679e(this, 2));
    }

    @Override // defpackage.AbstractC13828e
    public final void appmetrica(C15816e c15816e, C2697e c2697e) {
        license(c15816e, this.advert, this.mopub);
    }

    @Override // defpackage.AbstractC17001e
    public final boolean metrica() {
        return true;
    }

    @Override // defpackage.AbstractC17001e
    public final String vip() {
        return "EXT-X-KEY";
    }
}
