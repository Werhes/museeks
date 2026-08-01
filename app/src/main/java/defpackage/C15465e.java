package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15465e extends C1268e {
    public final Path appmetrica;
    public final /* synthetic */ C2532e purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15465e(C2532e c2532e, Path path, float f) {
        super(c2532e, f, 0.0f);
        this.purchase = c2532e;
        this.appmetrica = path;
    }

    @Override // defpackage.C1268e, defpackage.AbstractC6874e
    public final void smaato(String str) {
        C2532e c2532e = this.purchase;
        if (c2532e.m898e()) {
            C1506e c1506e = (C1506e) c2532e.f6385e;
            if (c1506e.vip) {
                ((Canvas) c2532e.f6388e).drawTextOnPath(str, this.appmetrica, this.vip, this.metrica, c1506e.license);
            }
            C1506e c1506e2 = (C1506e) c2532e.f6385e;
            if (c1506e2.metrica) {
                ((Canvas) c2532e.f6388e).drawTextOnPath(str, this.appmetrica, this.vip, this.metrica, c1506e2.appmetrica);
            }
        }
        this.vip = ((C1506e) c2532e.f6385e).license.measureText(str) + this.vip;
    }
}
