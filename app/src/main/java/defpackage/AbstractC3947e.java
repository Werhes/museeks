package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3947e extends AbstractC9748e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f8802e;

    public AbstractC3947e(C6936e c6936e) {
        super(c6936e);
        ((C6936e) this.f36443e).f14214e++;
    }

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final void m1411e() {
        if (!this.f8802e) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final void m1412e() {
        if (this.f8802e) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo803e()) {
            return;
        }
        ((C6936e) this.f36443e).f14211e.incrementAndGet();
        this.f8802e = true;
    }

    /* renamed from: eّٖٗ */
    public abstract boolean mo803e();
}
