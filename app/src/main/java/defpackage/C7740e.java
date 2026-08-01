package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7740e {
    public static final C15750e Companion = new Object();
    public final int ad;

    public C7740e() {
        this.ad = 1;
    }

    public C7740e(int i, int i2) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C5191e.vip);
            throw null;
        }
        this.ad = i2;
        if (i2 != 1) {
            throw new IllegalArgumentException("maxKey must equal 1");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7740e) && this.ad == ((C7740e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("BsonValueJson(data="), this.ad, ')');
    }
}
