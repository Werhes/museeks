package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۘۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14932e implements InterfaceC11640e {
    public final AbstractC16510e ad;

    public C14932e(AbstractC16510e abstractC16510e) {
        this.ad = abstractC16510e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14932e) && AbstractC7890e.billing(this.ad, ((C14932e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.ad + ')';
    }
}
