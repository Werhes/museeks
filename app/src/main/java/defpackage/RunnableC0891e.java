package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؙؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0891e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18478e f3284e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3285e;

    public /* synthetic */ RunnableC0891e(C18478e c18478e, int i) {
        this.f3285e = i;
        this.f3284e = c18478e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3285e) {
            case 0:
                C18478e c18478e = this.f3284e;
                C4979e c4979e = (C4979e) c18478e.f36229e;
                if (c4979e != null) {
                    ((C1326e) c18478e.f36228e).yandex(c4979e);
                    return;
                }
                return;
            default:
                C18478e c18478e2 = this.f3284e;
                if (((C4979e) c18478e2.f36229e) == null) {
                    c18478e2.f36229e = new C4979e(1, c18478e2);
                }
                ((C1326e) c18478e2.f36228e).appmetrica((C4979e) c18478e2.f36229e);
                return;
        }
    }
}
