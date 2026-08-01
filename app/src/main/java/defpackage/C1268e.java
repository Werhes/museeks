package defpackage;

import android.graphics.Canvas;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C1268e extends AbstractC6874e {
    public final /* synthetic */ C2532e license;
    public float metrica;
    public float vip;

    public C1268e(C2532e c2532e, float f, float f2) {
        this.license = c2532e;
        this.vip = f;
        this.metrica = f2;
    }

    @Override // defpackage.AbstractC6874e
    public void smaato(String str) {
        C2532e c2532e = this.license;
        if (c2532e.m898e()) {
            C1506e c1506e = (C1506e) c2532e.f6385e;
            if (c1506e.vip) {
                ((Canvas) c2532e.f6388e).drawText(str, this.vip, this.metrica, c1506e.license);
            }
            C1506e c1506e2 = (C1506e) c2532e.f6385e;
            if (c1506e2.metrica) {
                ((Canvas) c2532e.f6388e).drawText(str, this.vip, this.metrica, c1506e2.appmetrica);
            }
        }
        this.vip = ((C1506e) c2532e.f6385e).license.measureText(str) + this.vip;
    }
}
