package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4826e extends AbstractC6690e {
    public final C1962e appmetrica;

    public C4826e(C1962e c1962e) {
        this.appmetrica = c1962e;
    }

    @Override // defpackage.AbstractC6690e
    public final Object advert(int i) {
        return C3096e.yandex;
    }

    @Override // defpackage.AbstractC6690e
    public final int loadAd() {
        return 1;
    }

    @Override // defpackage.AbstractC6690e
    public final C6158e purchase(int i, C6158e c6158e, boolean z) {
        c6158e.startapp(z ? 0 : null, z ? C3096e.yandex : null, 0, -9223372036854775807L, 0L, C11541e.purchase, true);
        return c6158e;
    }

    @Override // defpackage.AbstractC6690e
    public final C11501e smaato(int i, C11501e c11501e, long j) {
        c11501e.vip(C11501e.admob, this.appmetrica, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        c11501e.mopub = true;
        return c11501e;
    }

    @Override // defpackage.AbstractC6690e
    public final int vip(Object obj) {
        return obj == C3096e.yandex ? 0 : -1;
    }

    @Override // defpackage.AbstractC6690e
    public final int yandex() {
        return 1;
    }
}
