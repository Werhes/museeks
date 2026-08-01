package defpackage;

import android.graphics.Matrix;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2261e implements InterfaceC10073e {
    public final InterfaceC8500e ad;

    public C2261e(InterfaceC8500e interfaceC8500e) {
        this.ad = interfaceC8500e;
    }

    @Override // defpackage.InterfaceC10073e
    public final C18543e ad() {
        return this.ad.ad();
    }

    @Override // defpackage.InterfaceC10073e
    public final Matrix appmetrica() {
        return new Matrix();
    }

    @Override // defpackage.InterfaceC10073e
    public final int license() {
        return 0;
    }

    @Override // defpackage.InterfaceC10073e
    public final long metrica() {
        return this.ad.metrica();
    }

    @Override // defpackage.InterfaceC10073e
    public final int vip() {
        int m2467class = AbstractC8703e.m2467class(this.ad.vip());
        if (m2467class == 1) {
            return 2;
        }
        if (m2467class != 2) {
            return m2467class != 3 ? 0 : 1;
        }
        return 3;
    }
}
