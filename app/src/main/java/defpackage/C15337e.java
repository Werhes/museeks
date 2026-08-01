package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C6956e.class)
/* renamed from: eٌؙٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15337e extends AbstractC4879e implements Comparable<C15337e> {
    public static final C1114e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f30255e;

    public C15337e(int i, int i2) {
        this.f30255e = (i2 & 4294967295L) | (i << 32);
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 18;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C15337e c15337e) {
        return AbstractC7890e.startapp(this.f30255e, c15337e.f30255e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        return AbstractC7890e.billing(c12232e.vip(C15337e.class), c12232e.vip(obj.getClass())) && this.f30255e == ((C15337e) obj).f30255e;
    }

    public final int hashCode() {
        long j = this.f30255e;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC10257e.mopub(new StringBuilder("BsonTimestamp(value="), this.f30255e, ')');
    }
}
