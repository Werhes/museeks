package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۘؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12691e extends AbstractC13828e {
    public C4438e advert;
    public final LinkedHashMap mopub;

    public C12691e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.mopub = linkedHashMap;
        linkedHashMap.put("URI", new C6018e(this, 1));
        linkedHashMap.put("BYTERANGE", new C3270e(this));
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
        return "EXT-X-MAP";
    }
}
