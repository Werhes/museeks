package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۨۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6835e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14066e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ListenableFuture f14067e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6584e f14068e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C18424e f14069e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14070e;

    public /* synthetic */ RunnableC6835e(C6584e c6584e, C8724e c8724e, C18424e c18424e, int i, int i2) {
        this.f14070e = i2;
        this.f14068e = c6584e;
        this.f14067e = c8724e;
        this.f14069e = c18424e;
        this.f14066e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14070e) {
            case 0:
                C6584e c6584e = this.f14068e;
                c6584e.getClass();
                C8802e c8802e = (C8802e) C6584e.m2202throw(this.f14067e);
                if (c8802e != null) {
                    c6584e.admob(this.f14069e, c8802e);
                    C6584e.m2203try(this.f14066e, c8802e);
                    return;
                }
                return;
            default:
                C6584e c6584e2 = this.f14068e;
                c6584e2.getClass();
                C8802e c8802e2 = (C8802e) C6584e.m2202throw(this.f14067e);
                if (c8802e2 != null) {
                    c6584e2.admob(this.f14069e, c8802e2);
                    C6584e.m2203try(this.f14066e, c8802e2);
                    return;
                }
                return;
        }
    }
}
