package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9205e implements InterfaceC2881e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0200e f18385e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16575e f18386e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC2881e f18387e;

    public C9205e(InterfaceC2881e interfaceC2881e, C16575e c16575e) {
        this.f18387e = interfaceC2881e;
        this.f18386e = c16575e;
        InterfaceC3232e interfaceC3232e = c16575e.f32519e;
        InterfaceC3958e billing = interfaceC2881e.billing();
        ((C6594e) interfaceC3232e).m2230transient();
        this.f18385e = new C0200e(billing);
    }

    @Override // defpackage.InterfaceC0876e
    public final void Signature(AbstractC16510e abstractC16510e) {
        this.f18387e.Signature(abstractC16510e);
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC11659e ad() {
        return this.f18387e.ad();
    }

    @Override // defpackage.InterfaceC2881e
    public final void adcel(boolean z) {
        this.f18387e.adcel(z);
    }

    @Override // defpackage.InterfaceC2881e
    public final void admob(boolean z) {
        this.f18387e.admob(z);
    }

    @Override // defpackage.InterfaceC2881e
    public final void advert(Collection collection) {
        this.f18387e.advert(collection);
    }

    @Override // defpackage.InterfaceC2881e
    public final /* synthetic */ void amazon() {
    }

    @Override // defpackage.InterfaceC0876e
    public final void appmetrica(AbstractC16510e abstractC16510e) {
        this.f18387e.appmetrica(abstractC16510e);
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC3958e billing() {
        return this.f18385e;
    }

    @Override // defpackage.InterfaceC2881e
    public final boolean license() {
        return this.f18387e.license();
    }

    @Override // defpackage.InterfaceC2881e
    public final boolean loadAd() {
        return this.f18387e.loadAd();
    }

    @Override // defpackage.InterfaceC0876e
    public final void metrica(AbstractC16510e abstractC16510e) {
        this.f18387e.metrica(abstractC16510e);
    }

    @Override // defpackage.InterfaceC2881e
    public final boolean mopub() {
        return this.f18387e.mopub();
    }

    @Override // defpackage.InterfaceC0876e
    public final void purchase(AbstractC16510e abstractC16510e) {
        this.f18387e.purchase(abstractC16510e);
    }

    @Override // defpackage.InterfaceC2881e
    public final ListenableFuture release() {
        return this.f18387e.release();
    }

    @Override // defpackage.InterfaceC2881e
    public final void smaato(ArrayList arrayList) {
        this.f18387e.smaato(arrayList);
    }

    @Override // defpackage.InterfaceC2881e
    public final void startapp(InterfaceC3232e interfaceC3232e) {
        this.f18387e.startapp(interfaceC3232e);
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC12424e subscription() {
        return this.f18386e;
    }

    @Override // defpackage.InterfaceC2881e, defpackage.InterfaceC1489e
    public final InterfaceC12424e vip() {
        return this.f18386e;
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC3232e yandex() {
        return this.f18387e.yandex();
    }
}
