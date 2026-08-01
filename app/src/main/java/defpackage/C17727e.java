package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C2969e.class)
/* renamed from: eْ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17727e extends AbstractC5554e implements Comparable<C17727e> {
    public static final C1486e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f34766e;

    public C17727e(int i) {
        this.f34766e = i;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 17;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C17727e c17727e) {
        return AbstractC7890e.yandex(this.f34766e, c17727e.f34766e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        return AbstractC7890e.billing(c12232e.vip(C17727e.class), c12232e.vip(obj.getClass())) && this.f34766e == ((C17727e) obj).f34766e;
    }

    public final int hashCode() {
        return this.f34766e;
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("BsonInt32(value="), this.f34766e, ')');
    }
}
