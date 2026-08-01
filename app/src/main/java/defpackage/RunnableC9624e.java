package defpackage;

import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٞؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9624e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6584e f19097e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19098e;

    public /* synthetic */ RunnableC9624e(C6584e c6584e, int i) {
        this.f19098e = i;
        this.f19097e = c6584e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19098e) {
            case 0:
                C6584e c6584e = this.f19097e;
                C9770e c9770e = c6584e.isVip;
                if (c9770e != null) {
                    ((PlaybackService) c9770e.f19315e).ads(c6584e.mopub, false);
                    return;
                }
                return;
            case 1:
                C6584e.ad(this.f19097e);
                return;
            case 2:
                this.f19097e.m2205extends();
                return;
            default:
                C6584e c6584e2 = this.f19097e;
                C15477e c15477e = c6584e2.tapsense;
                if (c15477e != null) {
                    c6584e2.pro.mo2121e(c15477e);
                    return;
                }
                return;
        }
    }
}
