package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2386e extends AbstractC0815e implements InterfaceC0816e, InterfaceC15119e, InterfaceC5922e, InterfaceC10998e, InterfaceC14374e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC1752e f6093e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Handler f6094e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C1154e f6095e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final AbstractActivityC1752e f6096e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractActivityC1752e f6097e;

    /* JADX WARN: Type inference failed for: r2v1, types: [eٖؓۢ, eؒٚٗ] */
    public C2386e(AbstractActivityC1752e abstractActivityC1752e) {
        this.f6093e = abstractActivityC1752e;
        Handler handler = new Handler();
        this.f6097e = abstractActivityC1752e;
        this.f6096e = abstractActivityC1752e;
        this.f6094e = handler;
        this.f6095e = new AbstractC15958e();
    }

    @Override // defpackage.InterfaceC15119e
    public final C6194e ad() {
        return this.f6093e.ad();
    }

    @Override // defpackage.AbstractC0815e
    public final View amazon(int i) {
        return this.f6093e.findViewById(i);
    }

    @Override // defpackage.InterfaceC5922e
    public final C6127e appmetrica() {
        return this.f6093e.f31252e;
    }

    @Override // defpackage.InterfaceC0816e
    public final C13462e billing() {
        return this.f6093e.billing();
    }

    @Override // defpackage.AbstractC0815e
    public final boolean loadAd() {
        Window window = this.f6093e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.InterfaceC14374e
    public final void metrica() {
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        return this.f6093e.f4794e;
    }

    @Override // defpackage.InterfaceC10998e
    public final C3168e yandex() {
        return (C3168e) this.f6093e.f31251e.f12439e;
    }
}
