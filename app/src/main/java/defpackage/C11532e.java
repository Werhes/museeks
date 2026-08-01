package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11532e {
    public final Object ad;
    public final Object metrica;
    public final Object vip;

    public C11532e(Object obj, Object obj2, Object obj3) {
        this.ad = obj;
        this.vip = obj2;
        this.metrica = obj3;
    }

    public final IllegalArgumentException ad() {
        Object obj = this.ad;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.vip);
        return new IllegalArgumentException(AbstractC8647e.ads(AbstractC17861e.tapsense("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.metrica)));
    }
}
