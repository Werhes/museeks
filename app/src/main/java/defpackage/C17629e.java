package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C6306e.class)
/* renamed from: eً٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17629e extends AbstractC5554e implements Comparable<C17629e> {
    public static final C6870e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f34552e;

    public C17629e(long j) {
        this.f34552e = j;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 19;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C17629e c17629e) {
        return AbstractC7890e.startapp(this.f34552e, c17629e.f34552e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        return AbstractC7890e.billing(c12232e.vip(C17629e.class), c12232e.vip(obj.getClass())) && this.f34552e == ((C17629e) obj).f34552e;
    }

    public final int hashCode() {
        long j = this.f34552e;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC10257e.mopub(new StringBuilder("BsonInt64(value="), this.f34552e, ')');
    }
}
