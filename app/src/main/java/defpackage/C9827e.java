package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9827e implements InterfaceC3851e {
    public final int ad;

    public C9827e(int i) {
        this.ad = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9827e) && this.ad == ((C9827e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("TransferInterrupted(code="), this.ad, ')');
    }
}
