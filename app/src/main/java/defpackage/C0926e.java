package defpackage;

import android.graphics.Path;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926e implements InterfaceC10371e {
    public final Path ad = new Path();
    public float metrica;
    public float vip;

    public C0926e(C9831e c9831e) {
        if (c9831e == null) {
            return;
        }
        c9831e.subs(this);
    }

    @Override // defpackage.InterfaceC10371e
    public final void ad(float f, float f2, float f3, float f4) {
        this.ad.quadTo(f, f2, f3, f4);
        this.vip = f3;
        this.metrica = f4;
    }

    @Override // defpackage.InterfaceC10371e
    public final void appmetrica(float f, float f2) {
        this.ad.lineTo(f, f2);
        this.vip = f;
        this.metrica = f2;
    }

    @Override // defpackage.InterfaceC10371e
    public final void close() {
        this.ad.close();
    }

    @Override // defpackage.InterfaceC10371e
    public final void license(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        C2532e.yandex(this.vip, this.metrica, f, f2, f3, z, z2, f4, f5, this);
        this.vip = f4;
        this.metrica = f5;
    }

    @Override // defpackage.InterfaceC10371e
    public final void metrica(float f, float f2, float f3, float f4, float f5, float f6) {
        this.ad.cubicTo(f, f2, f3, f4, f5, f6);
        this.vip = f5;
        this.metrica = f6;
    }

    @Override // defpackage.InterfaceC10371e
    public final void vip(float f, float f2) {
        this.ad.moveTo(f, f2);
        this.vip = f;
        this.metrica = f2;
    }
}
