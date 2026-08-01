package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3895e {
    public final InterfaceC6545e ad;
    public final Object adcel;
    public C4780e advert;
    public final Map appmetrica;
    public final C12204e billing;
    public final Map license;
    public final int metrica;
    public boolean mopub;
    public final InterfaceC6755e purchase;
    public final C2935e smaato;
    public final int startapp;
    public final C17280e vip;
    public final boolean yandex;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public C3895e(InterfaceC6545e interfaceC6545e, C17280e c17280e, int i, Map map, Map map2, InterfaceC6755e interfaceC6755e, C12204e c12204e, boolean z) {
        this.ad = interfaceC6545e;
        this.vip = c17280e;
        this.metrica = i;
        this.license = map;
        this.appmetrica = map2;
        this.purchase = interfaceC6755e;
        this.billing = c12204e;
        this.yandex = z;
        C11498e c11498e = AbstractC3242e.ad;
        c11498e.getClass();
        this.startapp = C11498e.vip.incrementAndGet(c11498e);
        this.adcel = new Object();
        ?? r4 = ((C2107e) interfaceC6755e).f5450e;
        C2935e c2935e = null;
        if (!r4.isEmpty()) {
            C0449e c0449e = (C0449e) AbstractC13480e.m3591interface(r4);
            Surface inputSurface = interfaceC6545e.getInputSurface();
            if (inputSurface == null) {
                throw new IllegalStateException("inputSurface is required to create instance of imageWriter.");
            }
            try {
                int i2 = c0449e.ad;
                c0449e.getClass();
                c2935e = AbstractC15390e.metrica(inputSurface, i2, new C0299e(c0449e.vip), c17280e.ad());
            } catch (RuntimeException e) {
                Log.e("CXCP", "Failed to create ImageWriter for session " + this.ad + "! Reprocessing will not be supported!", e);
            }
            if (c2935e != null) {
                Log.d("CXCP", "Created ImageWriter " + c2935e + " for session " + this.ad);
            }
        }
        this.smaato = c2935e;
    }

    public static final void vip(C3895e c3895e, C4780e c4780e) {
        Log.d("CXCP", "Waiting for the last repeating request sequence: " + c4780e);
        if (((Unit) c3895e.vip.vip(2000L, new C0593e(c4780e, null, 1))) == null) {
            Log.e("CXCP", c3895e + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + c4780e);
        }
    }

    public final void ad() {
        synchronized (this.adcel) {
            Log.d("CXCP", this + "#abortCaptures");
            this.ad.mo1016super();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Integer appmetrica(C4780e c4780e) {
        Integer mo1013e;
        synchronized (this.adcel) {
            if (this.mopub) {
                Log.w("CXCP", this + " disconnected. " + c4780e + " won't be submitted");
                return null;
            }
            if (c4780e.metrica.size() == 1) {
                InterfaceC6545e interfaceC6545e = this.ad;
                if (!(interfaceC6545e instanceof C11158e)) {
                    if (c4780e.vip) {
                        if (this.yandex) {
                            this.advert = c4780e;
                        }
                        mo1013e = interfaceC6545e.subscription((CaptureRequest) c4780e.metrica.get(0), c4780e);
                    } else {
                        mo1013e = interfaceC6545e.mo1014e((CaptureRequest) c4780e.metrica.get(0), c4780e);
                    }
                    return mo1013e;
                }
            }
            mo1013e = c4780e.vip ? this.ad.mo1013e(c4780e.metrica, c4780e) : this.ad.mo1019try(c4780e.metrica, c4780e);
            return mo1013e;
        }
    }

    public final void license() {
        C4780e c4780e;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.adcel) {
                try {
                    if (this.mopub) {
                        c4780e = null;
                    } else {
                        this.mopub = true;
                        C2935e c2935e = this.smaato;
                        if (c2935e != null) {
                            AbstractC17861e.isVip(c2935e);
                        }
                        Surface inputSurface = this.ad.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        c4780e = this.advert;
                    }
                } finally {
                }
            }
            if (this.yandex && c4780e != null) {
                vip(this, c4780e);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0497 A[LOOP:8: B:149:0x0455->B:161:0x0497, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0591 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x019d A[LOOP:11: B:227:0x0167->B:239:0x019d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x019a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00db A[LOOP:13: B:262:0x0091->B:275:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00d8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C4780e metrica(boolean r29, java.util.List r30, java.util.Map r31, java.util.Map r32, java.util.Map r33, defpackage.C6594e r34, java.util.List r35) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3895e.metrica(boolean, java.util.List, java.util.Map, java.util.Map, java.util.Map, eؙۗۗ, java.util.List):eَّؗ");
    }

    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.startapp;
    }
}
