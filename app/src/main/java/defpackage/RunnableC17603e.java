package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC17603e extends AbstractC0798e implements Runnable {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Runnable f34487e;

    public RunnableC17603e(Runnable runnable) {
        runnable.getClass();
        this.f34487e = runnable;
    }

    @Override // defpackage.AbstractC0586e
    public final String mopub() {
        return "task=[" + this.f34487e + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f34487e.run();
        } catch (Throwable th) {
            amazon(th);
            throw th;
        }
    }
}
