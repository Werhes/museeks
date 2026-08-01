package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C6184e.class)
/* renamed from: eٍّۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12837e extends AbstractC4879e implements Comparable<C12837e> {
    public static final C18533e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f25656e;

    public C12837e(long j) {
        this.f25656e = j;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C12837e c12837e) {
        return AbstractC7890e.startapp(this.f25656e, c12837e.f25656e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        return AbstractC7890e.billing(c12232e.vip(C12837e.class), c12232e.vip(obj.getClass())) && this.f25656e == ((C12837e) obj).f25656e;
    }

    public final int hashCode() {
        long j = this.f25656e;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC10257e.mopub(new StringBuilder("BsonDateTime(value="), this.f25656e, ')');
    }
}
