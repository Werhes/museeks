package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8735e {
    public final C6837e ad;
    public final C13578e vip;

    public C8735e(C6837e c6837e, C13578e c13578e) {
        this.ad = c6837e;
        this.vip = c13578e;
    }

    public final String toString() {
        String str;
        C13578e c13578e = this.vip;
        C5621e c5621e = (C5621e) c13578e.f26926e.mo397public(C5621e.f11979e);
        String str2 = c5621e != null ? c5621e.f11980e : null;
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        AbstractC15211e.ad(16);
        sb.append(Integer.toString(hashCode, 16));
        if (str2 == null || (str = AbstractC5087e.m1746extends("[", str2, "](")) == null) {
            str = "(";
        }
        sb.append(str);
        sb.append("currentBounds()=");
        sb.append(this.ad.invoke());
        sb.append(", continuation=");
        sb.append(c13578e);
        sb.append(')');
        return sb.toString();
    }
}
