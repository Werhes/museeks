package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: e٘ۘٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17966e {
    public static final C18265e Companion = new Object();
    public final boolean ad;

    public C17966e() {
        this.ad = true;
    }

    public C17966e(int i, boolean z) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C2549e.vip);
            throw null;
        }
        this.ad = z;
        if (!z) {
            throw new IllegalArgumentException("Undefined must equal true");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17966e) && this.ad == ((C17966e) obj).ad;
    }

    public final int hashCode() {
        boolean z = this.ad;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return AbstractC1786e.isVip(new StringBuilder("BsonValueJson(data="), this.ad, ')');
    }
}
