package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13790e implements InterfaceC12504e, InterfaceC9479e, InterfaceC7252e, InterfaceC7449e, InterfaceC8427e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f27339e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f27340e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27341e;

    public /* synthetic */ C13790e(long j, Object obj, int i) {
        this.f27339e = obj;
        this.f27341e = i;
        this.f27340e = j;
    }

    public /* synthetic */ C13790e(C12727e c12727e, long j, int i) {
        this.f27339e = c12727e;
        this.f27340e = j;
        this.f27341e = i;
    }

    public /* synthetic */ C13790e(C18177e c18177e, int i, long j, long j2) {
        this.f27339e = c18177e;
        this.f27341e = i;
        this.f27340e = j;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        C12727e c12727e = (C12727e) this.f27339e;
        C17169e c17169e = (C17169e) obj;
        c12727e.yandex.getClass();
        byte[] smaato = C10990e.smaato(c17169e.ad, c17169e.metrica);
        C1292e c1292e = c12727e.metrica;
        c1292e.getClass();
        c1292e.m570throw(smaato.length, smaato);
        c12727e.ad.appmetrica(smaato.length, c1292e);
        long j = c17169e.vip;
        long j2 = this.f27340e;
        if (j == -9223372036854775807L) {
            AbstractC2301e.subscription(c12727e.yandex.pro == Long.MAX_VALUE);
        } else {
            long j3 = c12727e.yandex.pro;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        c12727e.ad.ad(j2, this.f27341e | 1, smaato.length, 0, null);
    }

    @Override // defpackage.InterfaceC7252e
    public void billing(C6268e c6268e, C18424e c18424e) {
        BinderC17428e binderC17428e = (BinderC17428e) this.f27339e;
        c6268e.subs(binderC17428e.m4323e(c18424e, c6268e, this.f27341e), this.f27340e);
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        C18177e c18177e = (C18177e) this.f27339e;
        ((InterfaceC3190e) obj).mo1303goto(this.f27341e, this.f27340e, c18177e);
    }

    @Override // defpackage.InterfaceC9479e
    public void metrica(InterfaceC3001e interfaceC3001e, int i) {
        C4275e c4275e = (C4275e) this.f27339e;
        interfaceC3001e.mo966e(c4275e.metrica, i, this.f27341e, this.f27340e);
    }

    @Override // defpackage.InterfaceC7449e
    public Object startapp(C6584e c6584e, C18424e c18424e, int i) {
        List list = (List) this.f27339e;
        int i2 = this.f27341e;
        return c6584e.crashlytics(c18424e, list, i2 == -1 ? c6584e.pro.mo2115e() : i2, i2 == -1 ? c6584e.pro.mo2071e() : this.f27340e);
    }
}
