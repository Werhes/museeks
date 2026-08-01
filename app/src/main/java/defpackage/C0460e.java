package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٞۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0460e implements InterfaceC17348e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C17236e f2513e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC16232e f2514e;

    public C0460e(AbstractC16232e abstractC16232e) {
        this.f2514e = abstractC16232e;
        abstractC16232e.ad();
    }

    @Override // defpackage.InterfaceC5021e
    public final Collection ad() {
        AbstractC16232e abstractC16232e = this.f2514e;
        return Collections.singletonList(abstractC16232e.ad() == 3 ? abstractC16232e.vip() : amazon().loadAd());
    }

    @Override // defpackage.InterfaceC5021e
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.InterfaceC5021e
    public final /* bridge */ /* synthetic */ InterfaceC4077e advert() {
        return null;
    }

    @Override // defpackage.InterfaceC5021e
    public final AbstractC13270e amazon() {
        return this.f2514e.vip().loadAd().amazon();
    }

    @Override // defpackage.InterfaceC5021e
    public final List getParameters() {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC17348e
    public final AbstractC16232e isPro() {
        return this.f2514e;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f2514e + ')';
    }
}
