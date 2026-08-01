package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۡ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0631e extends AbstractC10947e {
    public final C14911e ad;

    public C0631e(C14911e c14911e) {
        this.ad = c14911e;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.ad != C14911e.f29549e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0631e) && ((C0631e) obj).ad == this.ad;
    }

    public final int hashCode() {
        return Objects.hash(C0631e.class, this.ad);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.ad + ")";
    }
}
