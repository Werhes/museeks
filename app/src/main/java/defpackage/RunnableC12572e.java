package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC12572e extends AbstractC2074e implements Runnable {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Runnable f25215e;

    public RunnableC12572e(Runnable runnable) {
        runnable.getClass();
        this.f25215e = runnable;
    }

    @Override // defpackage.AbstractC2074e
    public final String loadAd() {
        String obj = this.f25215e.toString();
        return AbstractC8647e.ads(new StringBuilder(obj.length() + 7), "task=[", obj, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f25215e.run();
        } catch (Throwable th) {
            if (AbstractC13307e.f26536e.Signature(this, null, new C15045e(th))) {
                AbstractC2074e.admob(this);
            }
            throw th;
        }
    }
}
