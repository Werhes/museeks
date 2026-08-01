package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ۠ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6701e implements InterfaceC2881e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0244e f13844e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C11841e f13845e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C8200e f13846e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC2881e f13847e;

    /* JADX WARN: Type inference failed for: r2v1, types: [eٖؗٙ, eِٛؐ] */
    public C6701e(InterfaceC2881e interfaceC2881e, C8200e c8200e, C12582e c12582e) {
        this.f13847e = interfaceC2881e;
        this.f13846e = c8200e;
        this.f13845e = new AbstractC4926e(interfaceC2881e.billing());
        this.f13844e = new C0244e(interfaceC2881e.subscription());
    }

    @Override // defpackage.InterfaceC0876e
    public final void Signature(AbstractC16510e abstractC16510e) {
        AbstractC13062e.metrica();
        this.f13846e.Signature(abstractC16510e);
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC11659e ad() {
        return this.f13847e.ad();
    }

    @Override // defpackage.InterfaceC2881e
    public final /* synthetic */ void adcel(boolean z) {
    }

    @Override // defpackage.InterfaceC2881e
    public final /* synthetic */ void admob(boolean z) {
    }

    @Override // defpackage.InterfaceC2881e
    public final void advert(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.InterfaceC2881e
    public final /* synthetic */ void amazon() {
    }

    @Override // defpackage.InterfaceC0876e
    public final void appmetrica(AbstractC16510e abstractC16510e) {
        AbstractC13062e.metrica();
        this.f13846e.appmetrica(abstractC16510e);
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC3958e billing() {
        return this.f13845e;
    }

    @Override // defpackage.InterfaceC2881e
    public final boolean license() {
        return ((AbstractC17358e) vip()).admob() == 0;
    }

    @Override // defpackage.InterfaceC2881e
    public final boolean loadAd() {
        return false;
    }

    @Override // defpackage.InterfaceC0876e
    public final void metrica(AbstractC16510e abstractC16510e) {
        AbstractC13062e.metrica();
        this.f13846e.metrica(abstractC16510e);
    }

    @Override // defpackage.InterfaceC2881e
    public final /* synthetic */ boolean mopub() {
        return false;
    }

    @Override // defpackage.InterfaceC0876e
    public final void purchase(AbstractC16510e abstractC16510e) {
        AbstractC13062e.metrica();
        this.f13846e.purchase(abstractC16510e);
    }

    @Override // defpackage.InterfaceC2881e
    public final ListenableFuture release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.InterfaceC2881e
    public final void smaato(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.InterfaceC2881e
    public final /* synthetic */ void startapp(InterfaceC3232e interfaceC3232e) {
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC12424e subscription() {
        return this.f13844e;
    }

    @Override // defpackage.InterfaceC2881e, defpackage.InterfaceC1489e
    public final InterfaceC12424e vip() {
        return subscription();
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC3232e yandex() {
        return AbstractC17943e.ad;
    }
}
