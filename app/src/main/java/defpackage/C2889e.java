package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ۟ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2889e extends AbstractRunnableC9465e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Runnable f6877e;

    public C2889e(Runnable runnable, long j) {
        super(j);
        this.f6877e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6877e.run();
    }

    @Override // defpackage.AbstractRunnableC9465e
    public final String toString() {
        return super.toString() + this.f6877e;
    }
}
