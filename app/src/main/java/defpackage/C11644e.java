package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11644e {
    public final InterfaceC14388e ad;
    public final boolean appmetrica;
    public long billing;
    public final C0576e license;
    public final C9138e metrica;
    public boolean purchase;
    public final AbstractC6126e startapp;
    public long vip = 9205357640488583168L;
    public long yandex;

    public C11644e(Context context, InterfaceC14388e interfaceC14388e, long j, InterfaceC12123e interfaceC12123e) {
        this.ad = interfaceC14388e;
        C9138e c9138e = new C9138e(context, AbstractC6532e.m2193extends(j));
        this.metrica = c9138e;
        this.license = new C0576e(Unit.INSTANCE, C10990e.f21771e);
        this.appmetrica = true;
        this.billing = 0L;
        this.yandex = -1L;
        C3169e c3169e = new C3169e(0, this);
        C2561e c2561e = AbstractC0845e.ad;
        C3427e c3427e = new C3427e(null, null, null, c3169e);
        this.startapp = Build.VERSION.SDK_INT >= 31 ? new C3334e(c3427e, this, c9138e) : new C11151e(c3427e, this, c9138e, interfaceC12123e);
    }

    public final void ad() {
        boolean z;
        C9138e c9138e = this.metrica;
        EdgeEffect edgeEffect = c9138e.license;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = c9138e.appmetrica;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = c9138e.purchase;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = c9138e.billing;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            license();
        }
    }

    public final float appmetrica(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (metrica() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.billing & 4294967295L));
        EdgeEffect vip = this.metrica.vip();
        float f = -intBitsToFloat2;
        float f2 = 1 - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = AbstractC16048e.applovin(vip, f, f2);
        } else {
            vip.onPull(f, f2);
        }
        return (i2 >= 31 ? AbstractC16048e.amazon(vip) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.billing)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float billing(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (metrica() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.billing >> 32));
        EdgeEffect license = this.metrica.license();
        float f = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = AbstractC16048e.applovin(license, f, intBitsToFloat);
        } else {
            license.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC16048e.amazon(license) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.billing >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final void license() {
        if (this.appmetrica) {
            this.license.setValue(Unit.INSTANCE);
        }
    }

    public final long metrica() {
        long j = this.vip;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = AbstractC5092e.license(this.billing);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.billing >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.billing & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final float purchase(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (metrica() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.billing >> 32));
        EdgeEffect metrica = this.metrica.metrica();
        float f = 1 - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = AbstractC16048e.applovin(metrica, intBitsToFloat2, f);
        } else {
            metrica.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? AbstractC16048e.amazon(metrica) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.billing >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void startapp(long j) {
        boolean vip = C2108e.vip(this.billing, 0L);
        boolean vip2 = C2108e.vip(j, this.billing);
        this.billing = j;
        if (!vip2) {
            long appmetrica = (AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (j >> 32))) << 32);
            C9138e c9138e = this.metrica;
            c9138e.metrica = appmetrica;
            EdgeEffect edgeEffect = c9138e.license;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (appmetrica >> 32), (int) (appmetrica & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c9138e.appmetrica;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (appmetrica >> 32), (int) (appmetrica & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c9138e.purchase;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (appmetrica & 4294967295L), (int) (appmetrica >> 32));
            }
            EdgeEffect edgeEffect4 = c9138e.billing;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (appmetrica & 4294967295L), (int) (appmetrica >> 32));
            }
            EdgeEffect edgeEffect5 = c9138e.yandex;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (appmetrica >> 32), (int) (appmetrica & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c9138e.startapp;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (appmetrica >> 32), (int) (appmetrica & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c9138e.adcel;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (appmetrica & 4294967295L), (int) (appmetrica >> 32));
            }
            EdgeEffect edgeEffect8 = c9138e.mopub;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & appmetrica), (int) (appmetrica >> 32));
            }
        }
        if (vip || vip2) {
            return;
        }
        ad();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005a, code lost:
    
        if (r20.invoke(r4, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0128, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(long r18, kotlin.jvm.functions.Function2 r20, defpackage.AbstractC10731e r21) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11644e.vip(long, kotlin.jvm.functions.Function2, eُؑ۠):java.lang.Object");
    }

    public final float yandex(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (metrica() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.billing & 4294967295L));
        EdgeEffect appmetrica = this.metrica.appmetrica();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = AbstractC16048e.applovin(appmetrica, intBitsToFloat2, intBitsToFloat);
        } else {
            appmetrica.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC16048e.amazon(appmetrica) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.billing)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }
}
