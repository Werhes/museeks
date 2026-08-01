package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC16156e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f31733e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13255e f31734e;

    public RunnableC16156e(C13255e c13255e, String str) {
        this.f31734e = c13255e;
        this.f31733e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f31734e.license) {
            try {
                if (((RunnableC16156e) this.f31734e.vip.remove(this.f31733e)) != null) {
                    InterfaceC17499e interfaceC17499e = (InterfaceC17499e) this.f31734e.metrica.remove(this.f31733e);
                    if (interfaceC17499e != null) {
                        String str = this.f31733e;
                        C5401e.loadAd().smaato(C6546e.f13469e, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((C6546e) interfaceC17499e).appmetrica();
                    }
                } else {
                    C5401e.loadAd().smaato("WrkTimerRunnable", "Timer with " + this.f31733e + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
