package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍٔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14625e {
    public static final C16753e Companion = new Object();
    public final int ad;

    public C14625e(int i) {
        this.ad = i;
    }

    public /* synthetic */ C14625e(int i, int i2) {
        if (1 == (i & 1)) {
            this.ad = i2;
        } else {
            AbstractC5756e.billing(i, 1, C2838e.ad.appmetrica());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14625e) && this.ad == ((C14625e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("JsonStorageValue(id="), this.ad, ')');
    }
}
