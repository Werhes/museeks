package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5563e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f11905e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9029e f11906e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f11907e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11908e;

    public /* synthetic */ RunnableC5563e(C9029e c9029e, List list, int i, int i2) {
        this.f11908e = i2;
        this.f11906e = c9029e;
        this.f11905e = list;
        this.f11907e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11908e) {
            case 0:
                C9029e c9029e = this.f11906e;
                c9029e.ad.execute(new RunnableC5563e(c9029e, this.f11905e, this.f11907e, 1));
                return;
            default:
                C9029e c9029e2 = this.f11906e;
                ?? r1 = this.f11905e;
                int i = this.f11907e;
                if (c9029e2.advert.get() && c9029e2.mopub.equals(r1)) {
                    AbstractC9464e.yandex("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i);
                    C8765e c8765e = c9029e2.yandex;
                    if (c8765e != null) {
                        c8765e.startapp();
                    }
                    c9029e2.appmetrica(i - 1, r1);
                    return;
                }
                return;
        }
    }
}
