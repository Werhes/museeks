package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1413e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC15824e f4228e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4229e;

    public /* synthetic */ RunnableC1413e(AbstractActivityC15824e abstractActivityC15824e, int i) {
        this.f4229e = i;
        this.f4228e = abstractActivityC15824e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4229e) {
            case 0:
                this.f4228e.invalidateOptionsMenu();
                return;
            default:
                AbstractActivityC15824e.adcel(this.f4228e);
                return;
        }
    }
}
