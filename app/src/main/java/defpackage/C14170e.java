package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14170e {
    public final Object ad;
    public final Object metrica;
    public final Object vip;

    public C14170e(Object obj, Object obj2, Object obj3) {
        this.ad = obj;
        this.vip = obj2;
        this.metrica = obj3;
    }

    public final IllegalArgumentException ad() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.ad;
        sb.append(obj);
        sb.append("=");
        sb.append(this.vip);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.metrica);
        return new IllegalArgumentException(sb.toString());
    }
}
