package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12587e {
    public final Object ad;
    public boolean license;
    public boolean metrica;
    public C16722e vip = new C16722e(5);

    public C12587e(Object obj) {
        this.ad = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12587e.class != obj.getClass()) {
            return false;
        }
        return this.ad.equals(((C12587e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
