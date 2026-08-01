package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10983e {
    public final String ad;
    public final C1362e vip;

    public C10983e(String str, C1362e c1362e) {
        this.ad = str;
        this.vip = c1362e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C10983e.class.equals(obj != null ? obj.getClass() : null)) {
            return AbstractC7890e.billing(this.ad, ((C10983e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
