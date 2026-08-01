package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16061e implements InterfaceC12296e {
    public boolean ad;
    public AbstractC16858e adcel;
    public C0763e advert;
    public C6260e appmetrica;
    public C6260e billing;
    public C6260e license;
    public C6260e metrica;
    public AbstractC16858e mopub;
    public C6260e purchase;
    public C6260e startapp;
    public C6260e vip;
    public C6260e yandex;

    @Override // defpackage.InterfaceC12296e
    public final void ad(C6260e c6260e) {
        this.vip = c6260e;
    }

    @Override // defpackage.InterfaceC12296e
    public final void appmetrica(C0763e c0763e) {
        this.advert = c0763e;
    }

    @Override // defpackage.InterfaceC12296e
    public final void license(boolean z) {
        this.ad = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12296e
    public final void metrica(Function1 function1) {
        this.mopub = (AbstractC16858e) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12296e
    public final void purchase(Function1 function1) {
        this.adcel = (AbstractC16858e) function1;
    }

    @Override // defpackage.InterfaceC12296e
    public final boolean vip() {
        return this.ad;
    }
}
