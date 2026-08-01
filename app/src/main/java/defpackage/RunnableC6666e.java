package defpackage;

import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6666e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13759e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f13760e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f13761e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f13762e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13763e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f13764e;

    public /* synthetic */ RunnableC6666e(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f13763e = i;
        this.f13760e = obj;
        this.f13762e = obj2;
        this.f13759e = obj3;
        this.f13764e = obj4;
        this.f13761e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13763e) {
            case 0:
                C11165e c11165e = (C11165e) this.f13760e;
                C4748e c4748e = (C4748e) this.f13762e;
                C15816e metrica = c11165e.f22420e.metrica(c4748e, (AbstractC17475e) this.f13759e, c11165e.f22414e, (C17825e) this.f13764e);
                c11165e.f22408e.execute(new RunnableC8044e(c11165e, c4748e, metrica, this.f13761e, 1));
                return;
            default:
                BinderC12883e binderC12883e = (BinderC12883e) this.f13760e;
                InterfaceC4342e interfaceC4342e = (InterfaceC4342e) this.f13762e;
                C18287e c18287e = (C18287e) this.f13759e;
                C5412e c5412e = (C5412e) this.f13764e;
                boolean z = this.f13761e;
                binderC12883e.appmetrica.remove(interfaceC4342e);
                try {
                    try {
                        PlaybackService playbackService = (PlaybackService) binderC12883e.metrica.get();
                        if (playbackService != null) {
                            int i = c5412e.ad;
                            int i2 = c5412e.vip;
                            C18424e c18424e = new C18424e(c18287e, i, i2, z, new C4958e(interfaceC4342e, i2), c5412e.appmetrica);
                            C4748e tapsense = playbackService.tapsense(c18424e);
                            if (tapsense != null) {
                                playbackService.appmetrica(tapsense);
                                tapsense.ad.billing.adcel(interfaceC4342e, c18424e);
                                return;
                            }
                        }
                    } catch (Exception e) {
                        AbstractC2803e.amazon("MSessionService", "Failed to add a session to session service", e);
                    }
                    return;
                } finally {
                    AbstractC0223e.metrica(interfaceC4342e);
                }
        }
    }
}
