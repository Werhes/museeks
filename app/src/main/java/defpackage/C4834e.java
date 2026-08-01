package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4834e implements InterfaceC7224e {
    public final /* synthetic */ C5435e ad;
    public final AbstractC11110e metrica = C10327e.f20377e.mo2797class(Arrays.asList(EnumC4248e.f9330e, EnumC4248e.f9329e, EnumC4248e.f9327e, EnumC4248e.f9328e));
    public final C10981e vip;

    public C4834e(C5435e c5435e, C10981e c10981e, C6317e c6317e) {
        this.ad = c5435e;
        this.vip = c10981e;
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC1722e appmetrica() {
        return this.ad.license;
    }

    @Override // defpackage.InterfaceC7224e
    public final C13391e license() {
        return this.ad.vip;
    }

    @Override // defpackage.InterfaceC7224e
    public final C16722e metrica() {
        return this.ad.metrica;
    }

    @Override // defpackage.InterfaceC7224e
    public final C15723e purchase() {
        return this.ad.appmetrica;
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC10540e vip() {
        return this.ad.ad;
    }
}
