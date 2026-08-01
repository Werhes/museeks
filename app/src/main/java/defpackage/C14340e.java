package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14340e extends AbstractC14073e {
    public final C0763e appmetrica;

    public C14340e(C0763e c0763e) {
        this.appmetrica = c0763e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14340e) {
            return AbstractC7890e.billing(this.appmetrica, ((C14340e) obj).appmetrica);
        }
        return false;
    }

    public final int hashCode() {
        return this.appmetrica.hashCode();
    }

    @Override // defpackage.AbstractC14073e
    public final C0763e mopub() {
        return this.appmetrica;
    }
}
