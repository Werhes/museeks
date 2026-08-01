package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3334e extends AbstractC6126e implements InterfaceC8501e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C9138e f7531e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C11644e f7532e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public RenderNode f7533e;

    public C3334e(C3427e c3427e, C11644e c11644e, C9138e c9138e) {
        this.f7532e = c11644e;
        this.f7531e = c9138e;
        m2050e(c3427e);
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public static boolean m1340e(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final RenderNode m1341e() {
        RenderNode renderNode = this.f7533e;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode metrica = AbstractC7440e.metrica();
        this.f7533e = metrica;
        return metrica;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        C11644e c11644e;
        boolean z;
        C18478e c18478e;
        boolean z2;
        char c;
        float f;
        float f2;
        float f3;
        float f4;
        C14434e c14434e = c4017e.f8940e;
        long m4560try = c14434e.f28537e.m4560try();
        C11644e c11644e2 = this.f7532e;
        c11644e2.startapp(m4560try);
        InterfaceC14576e m4557this = c14434e.f28537e.m4557this();
        Canvas canvas = AbstractC16863e.ad;
        Canvas canvas2 = ((C11648e) m4557this).ad;
        c11644e2.license.getValue();
        C18478e c18478e2 = c14434e.f28537e;
        if (C2108e.billing(c18478e2.m4560try())) {
            c4017e.ad();
            return;
        }
        boolean isHardwareAccelerated = canvas2.isHardwareAccelerated();
        C9138e c9138e = this.f7531e;
        if (!isHardwareAccelerated) {
            EdgeEffect edgeEffect = c9138e.license;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = c9138e.appmetrica;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = c9138e.purchase;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = c9138e.billing;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = c9138e.yandex;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = c9138e.startapp;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = c9138e.adcel;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = c9138e.mopub;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            c4017e.ad();
            return;
        }
        float mo497instanceof = c4017e.mo497instanceof(AbstractC6461e.ad);
        boolean z3 = C9138e.purchase(c9138e.license) || C9138e.billing(c9138e.yandex) || C9138e.purchase(c9138e.appmetrica) || C9138e.billing(c9138e.startapp);
        boolean z4 = C9138e.purchase(c9138e.purchase) || C9138e.billing(c9138e.adcel) || C9138e.purchase(c9138e.billing) || C9138e.billing(c9138e.mopub);
        if (z3 && z4) {
            m1341e().setPosition(0, 0, canvas2.getWidth(), canvas2.getHeight());
        } else if (z3) {
            m1341e().setPosition(0, 0, (AbstractC1561e.appmetrica(mo497instanceof) * 2) + canvas2.getWidth(), canvas2.getHeight());
        } else {
            if (!z4) {
                c4017e.ad();
                return;
            }
            m1341e().setPosition(0, 0, canvas2.getWidth(), (AbstractC1561e.appmetrica(mo497instanceof) * 2) + canvas2.getHeight());
        }
        RecordingCanvas beginRecording = m1341e().beginRecording();
        boolean billing = C9138e.billing(c9138e.adcel);
        EnumC17426e enumC17426e = EnumC17426e.f34145e;
        if (billing) {
            EdgeEffect edgeEffect9 = c9138e.adcel;
            if (edgeEffect9 == null) {
                edgeEffect9 = c9138e.ad(enumC17426e);
                c9138e.adcel = edgeEffect9;
            }
            m1340e(90.0f, edgeEffect9, beginRecording);
            edgeEffect9.finish();
        }
        if (C9138e.purchase(c9138e.purchase)) {
            EdgeEffect metrica = c9138e.metrica();
            z = m1340e(270.0f, metrica, beginRecording);
            if (C9138e.billing(c9138e.purchase)) {
                float intBitsToFloat = Float.intBitsToFloat((int) (c11644e2.metrica() & 4294967295L));
                EdgeEffect edgeEffect10 = c9138e.adcel;
                if (edgeEffect10 == null) {
                    edgeEffect10 = c9138e.ad(enumC17426e);
                    c9138e.adcel = edgeEffect10;
                }
                c11644e = c11644e2;
                int i = Build.VERSION.SDK_INT;
                float amazon = i >= 31 ? AbstractC16048e.amazon(metrica) : 0.0f;
                float f5 = 1 - intBitsToFloat;
                if (i >= 31) {
                    AbstractC16048e.applovin(edgeEffect10, amazon, f5);
                } else {
                    edgeEffect10.onPull(amazon, f5);
                }
            } else {
                c11644e = c11644e2;
            }
        } else {
            c11644e = c11644e2;
            z = false;
        }
        boolean billing2 = C9138e.billing(c9138e.yandex);
        EnumC17426e enumC17426e2 = EnumC17426e.f34146e;
        if (billing2) {
            EdgeEffect edgeEffect11 = c9138e.yandex;
            if (edgeEffect11 == null) {
                edgeEffect11 = c9138e.ad(enumC17426e2);
                c9138e.yandex = edgeEffect11;
            }
            m1340e(180.0f, edgeEffect11, beginRecording);
            edgeEffect11.finish();
        }
        if (C9138e.purchase(c9138e.license)) {
            EdgeEffect appmetrica = c9138e.appmetrica();
            boolean z5 = m1340e(0.0f, appmetrica, beginRecording) || z;
            if (C9138e.billing(c9138e.license)) {
                z2 = z4;
                c = ' ';
                float intBitsToFloat2 = Float.intBitsToFloat((int) (c11644e.metrica() >> 32));
                EdgeEffect edgeEffect12 = c9138e.yandex;
                if (edgeEffect12 == null) {
                    edgeEffect12 = c9138e.ad(enumC17426e2);
                    c9138e.yandex = edgeEffect12;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    c18478e = c18478e2;
                    f4 = AbstractC16048e.amazon(appmetrica);
                } else {
                    c18478e = c18478e2;
                    f4 = 0.0f;
                }
                if (i2 >= 31) {
                    AbstractC16048e.applovin(edgeEffect12, f4, intBitsToFloat2);
                } else {
                    edgeEffect12.onPull(f4, intBitsToFloat2);
                }
            } else {
                c18478e = c18478e2;
                z2 = z4;
                c = ' ';
            }
            z = z5;
        } else {
            c18478e = c18478e2;
            z2 = z4;
            c = ' ';
        }
        if (C9138e.billing(c9138e.mopub)) {
            EdgeEffect edgeEffect13 = c9138e.mopub;
            if (edgeEffect13 == null) {
                edgeEffect13 = c9138e.ad(enumC17426e);
                c9138e.mopub = edgeEffect13;
            }
            m1340e(270.0f, edgeEffect13, beginRecording);
            edgeEffect13.finish();
        }
        if (C9138e.purchase(c9138e.billing)) {
            EdgeEffect license = c9138e.license();
            boolean z6 = m1340e(90.0f, license, beginRecording) || z;
            if (C9138e.billing(c9138e.billing)) {
                float intBitsToFloat3 = Float.intBitsToFloat((int) (c11644e.metrica() & 4294967295L));
                EdgeEffect edgeEffect14 = c9138e.mopub;
                if (edgeEffect14 == null) {
                    edgeEffect14 = c9138e.ad(enumC17426e);
                    c9138e.mopub = edgeEffect14;
                }
                int i3 = Build.VERSION.SDK_INT;
                float amazon2 = i3 >= 31 ? AbstractC16048e.amazon(license) : 0.0f;
                if (i3 >= 31) {
                    AbstractC16048e.applovin(edgeEffect14, amazon2, intBitsToFloat3);
                } else {
                    edgeEffect14.onPull(amazon2, intBitsToFloat3);
                }
            }
            z = z6;
        }
        if (C9138e.billing(c9138e.startapp)) {
            EdgeEffect edgeEffect15 = c9138e.startapp;
            if (edgeEffect15 == null) {
                edgeEffect15 = c9138e.ad(enumC17426e2);
                c9138e.startapp = edgeEffect15;
            }
            f = 0.0f;
            m1340e(0.0f, edgeEffect15, beginRecording);
            edgeEffect15.finish();
        } else {
            f = 0.0f;
        }
        if (C9138e.purchase(c9138e.appmetrica)) {
            EdgeEffect vip = c9138e.vip();
            boolean z7 = m1340e(180.0f, vip, beginRecording) || z;
            if (C9138e.billing(c9138e.appmetrica)) {
                float intBitsToFloat4 = Float.intBitsToFloat((int) (c11644e.metrica() >> c));
                EdgeEffect edgeEffect16 = c9138e.startapp;
                if (edgeEffect16 == null) {
                    edgeEffect16 = c9138e.ad(enumC17426e2);
                    c9138e.startapp = edgeEffect16;
                }
                int i4 = Build.VERSION.SDK_INT;
                float amazon3 = i4 >= 31 ? AbstractC16048e.amazon(vip) : f;
                float f6 = 1 - intBitsToFloat4;
                if (i4 >= 31) {
                    AbstractC16048e.applovin(edgeEffect16, amazon3, f6);
                } else {
                    edgeEffect16.onPull(amazon3, f6);
                }
            }
            z = z7;
        }
        if (z) {
            c11644e.license();
        }
        float f7 = z2 ? f : mo497instanceof;
        if (z3) {
            mo497instanceof = f;
        }
        EnumC7792e layoutDirection = c4017e.getLayoutDirection();
        C11648e c11648e = new C11648e();
        c11648e.ad = beginRecording;
        long m4560try2 = c18478e.m4560try();
        InterfaceC14388e m4534extends = c14434e.f28537e.m4534extends();
        EnumC7792e m4562while = c14434e.f28537e.m4562while();
        InterfaceC14576e m4557this2 = c14434e.f28537e.m4557this();
        long m4560try3 = c14434e.f28537e.m4560try();
        C18478e c18478e3 = c14434e.f28537e;
        C16446e c16446e = (C16446e) c18478e3.f36227e;
        c18478e3.m4532const(c4017e);
        c18478e3.m4542for(layoutDirection);
        c18478e3.m4541finally(c11648e);
        c18478e3.m4533continue(m4560try2);
        c18478e3.f36227e = null;
        c11648e.billing();
        try {
            ((C5389e) c4017e.f8940e.f28537e.f36228e).m1898this(f7, mo497instanceof);
            try {
                c4017e.ad();
                c11648e.admob();
                C18478e c18478e4 = c14434e.f28537e;
                c18478e4.m4532const(m4534extends);
                c18478e4.m4542for(m4562while);
                c18478e4.m4541finally(m4557this2);
                c18478e4.m4533continue(m4560try3);
                c18478e4.f36227e = c16446e;
                m1341e().endRecording();
                int save = canvas2.save();
                canvas2.translate(f2, f3);
                canvas2.drawRenderNode(m1341e());
                canvas2.restoreToCount(save);
            } finally {
                ((C5389e) c4017e.f8940e.f28537e.f36228e).m1898this(-f7, -mo497instanceof);
            }
        } catch (Throwable th) {
            c11648e.admob();
            C18478e c18478e5 = c14434e.f28537e;
            c18478e5.m4532const(m4534extends);
            c18478e5.m4542for(m4562while);
            c18478e5.m4541finally(m4557this2);
            c18478e5.m4533continue(m4560try3);
            c18478e5.f36227e = c16446e;
            throw th;
        }
    }
}
