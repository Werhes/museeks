package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3590e extends AbstractC15787e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC15787e f8122e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f8123e;

    public C3590e(AbstractC15787e abstractC15787e, int i) {
        this.f8122e = abstractC15787e;
        this.f8123e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3590e)) {
            return false;
        }
        C3590e c3590e = (C3590e) obj;
        return AbstractC7890e.billing(c3590e.f8122e, this.f8122e) && c3590e.f8123e == this.f8123e;
    }

    public final int hashCode() {
        return this.f8122e.hashCode() + (this.f8123e * 31);
    }
}
