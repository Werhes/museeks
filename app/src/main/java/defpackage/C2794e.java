package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2794e extends AbstractRunnableC6316e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Runnable f6740e;

    public C2794e(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f6740e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6740e.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f6740e;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC7111e.purchase(runnable));
        sb.append(", ");
        sb.append(this.f13146e);
        sb.append(", ");
        return AbstractC4653e.applovin(sb, this.f13145e ? "Blocking" : "Non-blocking", ']');
    }
}
