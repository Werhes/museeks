package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7884e extends Cpackage {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f15961e;

    public AbstractC7884e(C6936e c6936e) {
        super(c6936e);
        ((C6936e) this.f36443e).f14214e++;
    }

    /* renamed from: eؚۚۦ */
    public abstract boolean mo487e();

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final void m2347e() {
        if (!this.f15961e) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final void m2348e() {
        if (this.f15961e) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo487e()) {
            return;
        }
        ((C6936e) this.f36443e).f14211e.incrementAndGet();
        this.f15961e = true;
    }
}
