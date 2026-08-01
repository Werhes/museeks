package defpackage;

import android.os.Build;
import androidx.car.app.model.Alert;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٝۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5048e implements InterfaceC0983e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Function0 f10755e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C14434e f10756e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public EnumC7792e f10757e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e f10758e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f10759e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C17097e f10760e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f10761e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f10762e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC2661e f10763e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f10764e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public long f10765e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public AbstractC14073e f10766e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final float[] f10767e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public InterfaceC14388e f10768e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f10769e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Function2 f10770e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public float[] f10771e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16446e f10772e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f10773e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f10774e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public boolean f10775e;

    public C5048e(C16446e c16446e, InterfaceC2661e interfaceC2661e, ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, Function2 function2, Function0 function0) {
        this.f10772e = c16446e;
        this.f10763e = interfaceC2661e;
        this.f10758e = viewTreeObserverOnGlobalLayoutListenerC5014e;
        this.f10770e = function2;
        this.f10755e = function0;
        long j = Alert.DURATION_SHOW_INDEFINITELY;
        this.f10774e = (j & 4294967295L) | (j << 32);
        this.f10767e = C6739e.ad();
        this.f10768e = AbstractC14410e.ad();
        this.f10757e = EnumC7792e.f15794e;
        this.f10756e = new C14434e();
        this.f10765e = C13220e.vip;
        this.f10769e = true;
        this.f10760e = new C17097e(19, this);
    }

    public final float[] ad() {
        float[] fArr = this.f10771e;
        if (fArr == null) {
            fArr = C6739e.ad();
            this.f10771e = fArr;
        }
        if (this.f10762e) {
            this.f10762e = false;
            float[] vip = vip();
            if (this.f10769e) {
                return vip;
            }
            if (!AbstractC0014e.adcel(vip, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final void appmetrica(long j) {
        if (C12729e.vip(j, this.f10774e)) {
            return;
        }
        boolean loadAd = ViewTreeObserverOnGlobalLayoutListenerC5014e.loadAd();
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f10758e;
        if (loadAd) {
            viewTreeObserverOnGlobalLayoutListenerC5014e.m1704protected(-4.0f);
        }
        this.f10774e = j;
        if (this.f10759e || this.f10773e) {
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC5014e.invalidate();
        if (true != this.f10759e) {
            this.f10759e = true;
            viewTreeObserverOnGlobalLayoutListenerC5014e.isPro(this, true);
        }
    }

    @Override // defpackage.InterfaceC0983e
    public final void invalidate() {
        if (this.f10759e || this.f10773e) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f10758e;
        viewTreeObserverOnGlobalLayoutListenerC5014e.invalidate();
        if (true != this.f10759e) {
            this.f10759e = true;
            viewTreeObserverOnGlobalLayoutListenerC5014e.isPro(this, true);
        }
    }

    public final void license(long j) {
        boolean loadAd = ViewTreeObserverOnGlobalLayoutListenerC5014e.loadAd();
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f10758e;
        if (loadAd) {
            viewTreeObserverOnGlobalLayoutListenerC5014e.m1704protected(-4.0f);
        }
        C16446e c16446e = this.f10772e;
        if (!C11490e.vip(c16446e.pro, j)) {
            c16446e.pro = j;
            c16446e.ad.mopub((int) (j >> 32), c16446e.signatures, (int) (j & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0551e.appmetrica(viewTreeObserverOnGlobalLayoutListenerC5014e);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC5014e.invalidate();
        }
    }

    public final long metrica(long j, boolean z) {
        float[] vip;
        if (z) {
            vip = ad();
            if (vip == null) {
                return 9187343241974906880L;
            }
        } else {
            vip = vip();
        }
        return this.f10769e ? j : C6739e.vip(j, vip);
    }

    public final void purchase() {
        ViewTreeObserverOnGlobalLayoutListenerC5014e.loadAd();
        if (this.f10759e) {
            if (!C13220e.ad(this.f10765e, C13220e.vip) && !C12729e.vip(this.f10772e.signatures, this.f10774e)) {
                C16446e c16446e = this.f10772e;
                float vip = C13220e.vip(this.f10765e) * ((int) (this.f10774e >> 32));
                float metrica = C13220e.metrica(this.f10765e) * ((int) (this.f10774e & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(metrica) & 4294967295L) | (Float.floatToRawIntBits(vip) << 32);
                if (!C2152e.vip(c16446e.tapsense, floatToRawIntBits)) {
                    c16446e.tapsense = floatToRawIntBits;
                    c16446e.ad.remoteconfig(floatToRawIntBits);
                }
            }
            this.f10772e.appmetrica(this.f10768e, this.f10757e, this.f10774e, this.f10760e);
            if (this.f10759e) {
                this.f10759e = false;
                this.f10758e.isPro(this, false);
            }
        }
    }

    public final float[] vip() {
        boolean z = this.f10764e;
        float[] fArr = this.f10767e;
        if (z) {
            C16446e c16446e = this.f10772e;
            long j = c16446e.tapsense;
            InterfaceC3828e interfaceC3828e = c16446e.ad;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = AbstractC5092e.license(AbstractC8116e.startapp(this.f10774e));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float subs = interfaceC3828e.subs();
            float tapsense = interfaceC3828e.tapsense();
            float firebase = interfaceC3828e.firebase();
            float Signature = interfaceC3828e.Signature();
            float subscription = interfaceC3828e.subscription();
            float metrica = interfaceC3828e.metrica();
            float mo285while = interfaceC3828e.mo285while();
            double d = firebase * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = -sin;
            float f2 = (tapsense * cos) - (0.0f * sin);
            float f3 = (0.0f * cos) + (tapsense * sin);
            double d2 = Signature * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (subs * cos2);
            float f10 = (f3 * cos2) + ((-subs) * sin2);
            double d3 = subscription * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f11 = -sin3;
            float f12 = (cos3 * f5) + (f11 * cos2);
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * metrica;
            float f14 = sin3 * cos * metrica;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * metrica;
            float f16 = f12 * mo285while;
            float f17 = cos * cos3 * mo285while;
            float f18 = ((cos3 * f6) + (f11 * f4)) * mo285while;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.f10764e = false;
            this.f10769e = AbstractC11309e.billing(fArr);
        }
        return fArr;
    }
}
