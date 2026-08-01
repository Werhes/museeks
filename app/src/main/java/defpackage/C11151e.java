package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11151e extends AbstractC6126e implements InterfaceC8501e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C9138e f22378e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C11644e f22379e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final InterfaceC12123e f22380e;

    public C11151e(C3427e c3427e, C11644e c11644e, C9138e c9138e, InterfaceC12123e interfaceC12123e) {
        this.f22379e = c11644e;
        this.f22378e = c9138e;
        this.f22380e = interfaceC12123e;
        m2050e(c3427e);
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public static boolean m3041e(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        boolean z;
        long j;
        C14434e c14434e = c4017e.f8940e;
        long m4560try = c14434e.f28537e.m4560try();
        C11644e c11644e = this.f22379e;
        c11644e.startapp(m4560try);
        if (C2108e.billing(c14434e.f28537e.m4560try())) {
            c4017e.ad();
            return;
        }
        c4017e.ad();
        c11644e.license.getValue();
        InterfaceC14576e m4557this = c14434e.f28537e.m4557this();
        Canvas canvas = AbstractC16863e.ad;
        Canvas canvas2 = ((C11648e) m4557this).ad;
        C9138e c9138e = this.f22378e;
        boolean purchase = C9138e.purchase(c9138e.purchase);
        InterfaceC12123e interfaceC12123e = this.f22380e;
        if (purchase) {
            EdgeEffect metrica = c9138e.metrica();
            float f = -Float.intBitsToFloat((int) (c4017e.yandex() & 4294967295L));
            z = m3041e(270.0f, (Float.floatToRawIntBits(c4017e.mo497instanceof(interfaceC12123e.vip(c4017e.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), metrica, canvas2);
        } else {
            z = false;
        }
        if (C9138e.purchase(c9138e.license)) {
            j = 4294967295L;
            z = m3041e(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c4017e.mo497instanceof(interfaceC12123e.license()))) & 4294967295L), c9138e.appmetrica(), canvas2) || z;
        } else {
            j = 4294967295L;
        }
        if (C9138e.purchase(c9138e.billing)) {
            z = m3041e(90.0f, (((long) Float.floatToRawIntBits(c4017e.mo497instanceof(interfaceC12123e.metrica(c4017e.getLayoutDirection())) + (-((float) AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (c4017e.yandex() >> 32))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << 32), c9138e.license(), canvas2) || z;
        }
        if (C9138e.purchase(c9138e.appmetrica)) {
            EdgeEffect vip = c9138e.vip();
            z = m3041e(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c4017e.yandex() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c4017e.yandex() & j))) + c4017e.mo497instanceof(interfaceC12123e.ad()))) & j), vip, canvas2) || z;
        }
        if (z) {
            c11644e.license();
        }
    }
}
