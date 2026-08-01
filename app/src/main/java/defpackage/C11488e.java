package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11488e extends AbstractC10947e {
    public final C11278e ad;

    public C11488e(C11278e c11278e) {
        this.ad = c11278e;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.ad != C11278e.f22657e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11488e) && ((C11488e) obj).ad == this.ad;
    }

    public final int hashCode() {
        return Objects.hash(C11488e.class, this.ad);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.ad + ")";
    }
}
