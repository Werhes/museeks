package defpackage;

import android.widget.Magnifier;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17760e implements InterfaceC9178e {
    public final Magnifier ad;

    public C17760e(Magnifier magnifier) {
        this.ad = magnifier;
    }

    @Override // defpackage.InterfaceC9178e
    public void ad(long j, long j2, float f) {
        this.ad.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void license() {
        this.ad.update();
    }

    public final long metrica() {
        return (this.ad.getHeight() & 4294967295L) | (this.ad.getWidth() << 32);
    }

    public final void vip() {
        this.ad.dismiss();
    }
}
