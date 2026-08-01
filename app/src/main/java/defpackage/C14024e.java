package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14024e implements InterfaceC4543e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11740e f27746e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f27747e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f27748e;

    public C14024e(C11740e c11740e) {
        this.f27746e = c11740e;
    }

    public final void ad() {
        if (this.f27747e) {
            return;
        }
        C11740e c11740e = this.f27746e;
        Csuper csuper = c11740e.f23607e;
        csuper.loadAd(new C18070e(csuper, new C0807e(1, AbstractC8542e.yandex(c11740e.f23611e.loadAd), c11740e.f23611e, 0, null, AbstractC9413e.m2567switch(0L), -9223372036854775807L), 13));
        this.f27747e = true;
    }

    @Override // defpackage.InterfaceC4543e
    public final int admob(C13391e c13391e, C7507e c7507e, int i) {
        ad();
        C11740e c11740e = this.f27746e;
        boolean z = c11740e.f23609e;
        if (z && c11740e.f23608e == null) {
            this.f27748e = 2;
        }
        int i2 = this.f27748e;
        if (i2 == 2) {
            c7507e.ad(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            c13391e.f26644e = c11740e.f23611e;
            this.f27748e = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        c11740e.f23608e.getClass();
        c7507e.ad(1);
        c7507e.f15301e = 0L;
        if ((i & 4) == 0) {
            c7507e.admob(c11740e.f23612e);
            c7507e.f15296e.put(c11740e.f23608e, 0, c11740e.f23612e);
        }
        if ((i & 1) == 0) {
            this.f27748e = 2;
        }
        return -4;
    }

    @Override // defpackage.InterfaceC4543e
    public final int amazon(long j) {
        ad();
        if (j <= 0 || this.f27748e == 2) {
            return 0;
        }
        this.f27748e = 2;
        return 1;
    }

    @Override // defpackage.InterfaceC4543e
    public final boolean license() {
        return this.f27746e.f23609e;
    }

    @Override // defpackage.InterfaceC4543e
    public final void smaato() {
        C11740e c11740e = this.f27746e;
        if (c11740e.f23615e) {
            return;
        }
        C18478e c18478e = c11740e.f23617e;
        IOException iOException = (IOException) c18478e.f36229e;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC14624e handlerC14624e = (HandlerC14624e) c18478e.f36227e;
        if (handlerC14624e != null) {
            int i = handlerC14624e.f28854e;
            IOException iOException2 = handlerC14624e.f28847e;
            if (iOException2 != null && handlerC14624e.f28856e > i) {
                throw iOException2;
            }
        }
    }
}
