package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٛٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13367e implements InterfaceC2537e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f26622e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6839e f26623e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C14005e f26624e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15718e f26625e;

    public AbstractC13367e(C14005e c14005e, C15718e c15718e) {
        this.f26624e = c14005e;
        this.f26625e = c15718e;
        this.f26623e = new C6839e(((C13197e) c14005e.metrica.f25750e).f26205e.startapp());
    }

    public final void ad(C15793e c15793e) {
        C1343e c1343e;
        C5107e c5107e;
        C14005e c14005e = this.f26624e;
        int i = c14005e.license;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + c14005e.license);
        }
        C6839e c6839e = this.f26623e;
        C1930e c1930e = c6839e.appmetrica;
        c6839e.appmetrica = C1930e.license;
        c1930e.ad();
        c1930e.vip();
        c14005e.license = 6;
        if (c15793e.size() <= 0 || (c1343e = c14005e.ad) == null || (c5107e = c1343e.adcel) == null) {
            return;
        }
        AbstractC1277e.license(c5107e, this.f26625e, c15793e);
    }

    @Override // defpackage.InterfaceC2537e
    public long signatures(C16151e c16151e, long j) {
        C14005e c14005e = this.f26624e;
        try {
            return ((C13197e) c14005e.metrica.f25750e).signatures(c16151e, j);
        } catch (IOException e) {
            c14005e.vip.ad();
            ad(C14005e.purchase);
            throw e;
        }
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return this.f26623e;
    }
}
