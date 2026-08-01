package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11092e extends AbstractC3743e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ int f21989e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C12718e f21990e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f21991e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f21992e;

    /* renamed from: eٟؒؗ */
    public abstract Thread mo1408e();

    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public final boolean m2985e() {
        C12718e c12718e = this.f21990e;
        if (c12718e == null) {
            return false;
        }
        AbstractC2477e abstractC2477e = (AbstractC2477e) (c12718e.isEmpty() ? null : c12718e.removeFirst());
        if (abstractC2477e == null) {
            return false;
        }
        abstractC2477e.run();
        return true;
    }

    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public final void m2986e(boolean z) {
        this.f21991e = (z ? 4294967296L : 1L) + this.f21991e;
        if (z) {
            return;
        }
        this.f21992e = true;
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final void m2987e(boolean z) {
        long j = this.f21991e - (z ? 4294967296L : 1L);
        this.f21991e = j;
        if (j <= 0 && this.f21992e) {
            shutdown();
        }
    }

    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public final void m2988e(AbstractC2477e abstractC2477e) {
        C12718e c12718e = this.f21990e;
        if (c12718e == null) {
            c12718e = new C12718e();
            this.f21990e = c12718e;
        }
        c12718e.addLast(abstractC2477e);
    }

    /* renamed from: eٕؓٝ */
    public abstract long mo370e();

    /* renamed from: e٘ٔ٘ */
    public void mo1410e(long j, AbstractRunnableC9465e abstractRunnableC9465e) {
        RunnableC3938e.f8782e.m367e(j, abstractRunnableC9465e);
    }

    public abstract void shutdown();

    @Override // defpackage.AbstractC3743e
    /* renamed from: static */
    public final AbstractC3743e mo685static(int i) {
        AbstractC2356e.vip(i);
        return this;
    }
}
