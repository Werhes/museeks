package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C14716e.class)
/* renamed from: eٓۨۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14415e extends AbstractC4879e implements Comparable<C14415e> {
    public static final C14453e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f28495e;

    public C14415e(String str) {
        this.f28495e = str;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C14415e c14415e) {
        return this.f28495e.compareTo(c14415e.f28495e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        return AbstractC7890e.billing(c12232e.vip(C14415e.class), c12232e.vip(obj.getClass())) && AbstractC7890e.billing(this.f28495e, ((C14415e) obj).f28495e);
    }

    public final int hashCode() {
        return this.f28495e.hashCode();
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("BsonString(value='"), this.f28495e, "')");
    }
}
