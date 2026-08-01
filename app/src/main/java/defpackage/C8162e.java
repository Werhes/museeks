package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C8923e.class)
/* renamed from: eًۘؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8162e extends AbstractC4879e implements Comparable<C8162e> {
    public static final C15569e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f16611e;

    public C8162e(boolean z) {
        this.f16611e = z;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C8162e c8162e) {
        return Boolean.compare(this.f16611e, c8162e.f16611e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        return AbstractC7890e.billing(c12232e.vip(C8162e.class), c12232e.vip(obj.getClass())) && this.f16611e == ((C8162e) obj).f16611e;
    }

    public final int hashCode() {
        return this.f16611e ? 1 : 0;
    }

    public final String toString() {
        return AbstractC1786e.isVip(new StringBuilder("BsonBoolean(value="), this.f16611e, ')');
    }
}
