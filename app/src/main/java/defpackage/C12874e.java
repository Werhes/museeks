package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12874e implements InterfaceC4543e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7340e f25721e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f25722e;

    public C12874e(C7340e c7340e, int i) {
        this.f25721e = c7340e;
        this.f25722e = i;
    }

    @Override // defpackage.InterfaceC4543e
    public final int admob(C13391e c13391e, C7507e c7507e, int i) {
        C7340e c7340e = this.f25721e;
        if (c7340e.m2289interface()) {
            return -3;
        }
        int i2 = this.f25722e;
        c7340e.premium(i2);
        int ads = c7340e.f15044e[i2].ads(c13391e, c7507e, i, c7340e.f15056e);
        if (ads == -3) {
            c7340e.subs(i2);
        }
        return ads;
    }

    @Override // defpackage.InterfaceC4543e
    public final int amazon(long j) {
        C7340e c7340e = this.f25721e;
        if (c7340e.m2289interface()) {
            return 0;
        }
        int i = this.f25722e;
        c7340e.premium(i);
        C16806e c16806e = c7340e.f15044e[i];
        int signatures = c16806e.signatures(j, c7340e.f15056e);
        c16806e.m4177interface(signatures);
        if (signatures == 0) {
            c7340e.subs(i);
        }
        return signatures;
    }

    @Override // defpackage.InterfaceC4543e
    public final boolean license() {
        C7340e c7340e = this.f25721e;
        return !c7340e.m2289interface() && c7340e.f15044e[this.f25722e].isVip(c7340e.f15056e);
    }

    @Override // defpackage.InterfaceC4543e
    public final void smaato() {
        int i = this.f25722e;
        C7340e c7340e = this.f25721e;
        C16806e c16806e = c7340e.f15044e[i];
        InterfaceC16612e interfaceC16612e = c16806e.yandex;
        if (interfaceC16612e != null && interfaceC16612e.getState() == 1) {
            C7923e purchase = c16806e.yandex.purchase();
            purchase.getClass();
            throw purchase;
        }
        C18478e c18478e = c7340e.f15021e;
        int isPro = c7340e.f15050e.isPro(c7340e.f15029e);
        IOException iOException = (IOException) c18478e.f36229e;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC14624e handlerC14624e = (HandlerC14624e) c18478e.f36227e;
        if (handlerC14624e != null) {
            if (isPro == Integer.MIN_VALUE) {
                isPro = handlerC14624e.f28854e;
            }
            IOException iOException2 = handlerC14624e.f28847e;
            if (iOException2 != null && handlerC14624e.f28856e > isPro) {
                throw iOException2;
            }
        }
    }
}
