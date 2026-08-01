package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12160e {
    public float ad;
    public final C8391e appmetrica = new C8391e(25);
    public final float billing;
    public final C13116e license;
    public int metrica;
    public final C13116e purchase;
    public float vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚْؑ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [eؚْؑ] */
    public C12160e(float f) {
        final int i = 0;
        this.license = new InterfaceC11938e(this) { // from class: eؚْؑ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C12160e f26080e;

            {
                this.f26080e = this;
            }

            @Override // defpackage.InterfaceC11938e
            public final void vip(C16465e c16465e) {
                switch (i) {
                    case 0:
                        PointF pointF = c16465e.ad;
                        float f2 = pointF.x;
                        C12160e c12160e = this.f26080e;
                        pointF.x = f2 + c12160e.ad;
                        pointF.y += c12160e.vip;
                        return;
                    default:
                        PointF pointF2 = c16465e.ad;
                        float f3 = pointF2.x;
                        pointF2.x = this.f26080e.metrica - pointF2.y;
                        pointF2.y = f3;
                        return;
                }
            }
        };
        final int i2 = 1;
        this.purchase = new InterfaceC11938e(this) { // from class: eؚْؑ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C12160e f26080e;

            {
                this.f26080e = this;
            }

            @Override // defpackage.InterfaceC11938e
            public final void vip(C16465e c16465e) {
                switch (i2) {
                    case 0:
                        PointF pointF = c16465e.ad;
                        float f2 = pointF.x;
                        C12160e c12160e = this.f26080e;
                        pointF.x = f2 + c12160e.ad;
                        pointF.y += c12160e.vip;
                        return;
                    default:
                        PointF pointF2 = c16465e.ad;
                        float f3 = pointF2.x;
                        pointF2.x = this.f26080e.metrica - pointF2.y;
                        pointF2.y = f3;
                        return;
                }
            }
        };
        this.billing = f;
    }

    public final C13116e ad(Rect rect) {
        this.ad = rect.width() * 0.5f;
        this.vip = rect.height() * this.billing;
        return this.license;
    }
}
