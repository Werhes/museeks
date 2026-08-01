package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5954e implements InterfaceC2252e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f12549e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12550e;

    public /* synthetic */ C5954e(int i, Object obj) {
        this.f12550e = i;
        this.f12549e = obj;
    }

    @Override // defpackage.InterfaceC2252e
    public final long ad() {
        switch (this.f12550e) {
            case 0:
                C7065e c7065e = (C7065e) this.f12549e;
                long ad = c7065e.f14496e.ad();
                if (ad != 16) {
                    return ad;
                }
                C1959e c1959e = (C1959e) AbstractC10432e.vip(c7065e, AbstractC17052e.ad);
                if (c1959e != null) {
                    long j = c1959e.ad;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((C3618e) AbstractC10432e.vip(c7065e, AbstractC0608e.ad)).ad;
            case 1:
                C7065e c7065e2 = (C7065e) this.f12549e;
                long ad2 = c7065e2.f14496e.ad();
                if (ad2 != 16) {
                    return ad2;
                }
                C4899e c4899e = (C4899e) AbstractC10432e.vip(c7065e2, AbstractC17394e.ad);
                if (c4899e != null) {
                    long j2 = c4899e.ad;
                    if (j2 != 16) {
                        return j2;
                    }
                }
                long j3 = ((C3618e) AbstractC10432e.vip(c7065e2, AbstractC12256e.ad)).ad;
                return (((C16423e) AbstractC10432e.vip(c7065e2, AbstractC10809e.ad)).ad() || ((double) AbstractC6532e.inmobi(j3)) >= 0.5d) ? j3 : C3618e.appmetrica;
            case 2:
                return ((C13822e) this.f12549e).metrica;
            default:
                return ((C6144e) this.f12549e).metrica;
        }
    }
}
