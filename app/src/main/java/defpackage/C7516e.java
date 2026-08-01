package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7516e extends AbstractC13870e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f15325e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f15326e;

    @Override // defpackage.AbstractC13870e, defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return this.f15326e == 1 ? interfaceC16719e.mo2529while(i) : interfaceC16719e.metrica(i);
    }

    @Override // defpackage.AbstractC13870e
    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final boolean mo2292e() {
        return this.f15325e;
    }

    @Override // defpackage.AbstractC13870e
    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final long mo2293e(InterfaceC16719e interfaceC16719e, long j) {
        int mo2529while = this.f15326e == 1 ? interfaceC16719e.mo2529while(C5602e.yandex(j)) : interfaceC16719e.metrica(C5602e.yandex(j));
        if (mo2529while < 0) {
            mo2529while = 0;
        }
        if (mo2529while < 0) {
            AbstractC15805e.ad("height must be >= 0");
        }
        return AbstractC2278e.yandex(0, Alert.DURATION_SHOW_INDEFINITELY, mo2529while, mo2529while);
    }

    @Override // defpackage.AbstractC13870e, defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return this.f15326e == 1 ? interfaceC16719e.mo2529while(i) : interfaceC16719e.metrica(i);
    }
}
