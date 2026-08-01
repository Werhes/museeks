package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11950e {
    public InterfaceC10481e ad;
    public boolean appmetrica;
    public final C10469e billing;
    public EnumC17426e license;
    public InterfaceC8642e metrica;
    public C10663e purchase;
    public boolean startapp;
    public C11644e vip;
    public final C11458e yandex;
    public int adcel = 1;
    public InterfaceC1719e mopub = AbstractC16342e.vip;
    public final C3593e advert = new C3593e(this);
    public final C13749e smaato = new C13749e(18, this);

    public C11950e(InterfaceC10481e interfaceC10481e, C11644e c11644e, InterfaceC8642e interfaceC8642e, EnumC17426e enumC17426e, boolean z, C10663e c10663e, C10469e c10469e, C11458e c11458e) {
        this.ad = interfaceC10481e;
        this.vip = c11644e;
        this.metrica = interfaceC8642e;
        this.license = enumC17426e;
        this.appmetrica = z;
        this.purchase = c10663e;
        this.billing = c10469e;
        this.yandex = c11458e;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r6v0, types: [eؚٓٞ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(long r11, defpackage.AbstractC10731e r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.C15127e
            if (r0 == 0) goto L13
            r0 = r13
            eٔۨؑ r0 = (defpackage.C15127e) r0
            int r1 = r0.f29912e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29912e = r1
            goto L18
        L13:
            eٔۨؑ r0 = new eٔۨؑ
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f29910e
            int r1 = r0.f29912e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            eؚٓٞ r11 = r0.f29911e
            defpackage.AbstractC2003e.purchase(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L59
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L69
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            defpackage.AbstractC2003e.purchase(r13)
            eؚٓٞ r6 = new eؚٓٞ
            r6.<init>()
            r6.f14622e = r11
            r10.startapp = r3
            eؚؗۨ r13 = defpackage.EnumC6955e.f14256e     // Catch: java.lang.Throwable -> L66
            eٔؗٚ r4 = new eٔؗٚ     // Catch: java.lang.Throwable -> L66
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L63
            r0.f29911e = r6     // Catch: java.lang.Throwable -> L63
            r0.f29912e = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r11 = r10.purchase(r13, r4, r0)     // Catch: java.lang.Throwable -> L63
            eٟؔۙ r12 = defpackage.EnumC2821e.f6782e
            if (r11 != r12) goto L58
            return r12
        L58:
            r11 = r6
        L59:
            r5.startapp = r2
            long r11 = r11.f14622e
            eُۨۚ r13 = new eُۨۚ
            r13.<init>(r11)
            return r13
        L63:
            r0 = move-exception
        L64:
            r11 = r0
            goto L69
        L66:
            r0 = move-exception
            r5 = r10
            goto L64
        L69:
            r5.startapp = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11950e.ad(long, eُؑ۠):java.lang.Object");
    }

    public final long appmetrica(long j) {
        return this.appmetrica ? C2152e.adcel(-1.0f, j) : j;
    }

    public final float billing(long j) {
        return Float.intBitsToFloat((int) (this.license == EnumC17426e.f34145e ? j >> 32 : j & 4294967295L));
    }

    public final float license(float f) {
        return this.appmetrica ? f * (-1) : f;
    }

    public final long metrica(InterfaceC1719e interfaceC1719e, long j, int i) {
        C1507e c1507e = this.purchase.ad;
        C1507e m616e = c1507e != null ? c1507e.m616e() : null;
        long mo620implements = m616e != null ? m616e.mo620implements(i, j) : 0L;
        long yandex = C2152e.yandex(j, mo620implements);
        long appmetrica = appmetrica(yandex(interfaceC1719e.ad(billing(appmetrica(this.license == EnumC17426e.f34145e ? C2152e.ad(0.0f, 1, yandex) : C2152e.ad(0.0f, 2, yandex))))));
        C10469e c10469e = this.billing;
        if (c10469e.f27016e) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c10469e)).getViewTreeObserver();
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC5014e.f10605e == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC5014e.f10605e = declaredMethod;
                }
                Method method = ViewTreeObserverOnGlobalLayoutListenerC5014e.f10605e;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long yandex2 = C2152e.yandex(yandex, appmetrica);
        C1507e c1507e2 = this.purchase.ad;
        C1507e m616e2 = c1507e2 != null ? c1507e2.m616e() : null;
        return C2152e.startapp(C2152e.startapp(mo620implements, appmetrica), m616e2 != null ? m616e2.mo619e(i, appmetrica, yandex2) : 0L);
    }

    public final Object purchase(EnumC6955e enumC6955e, Function2 function2, AbstractC10731e abstractC10731e) {
        Object vip = this.ad.vip(enumC6955e, new C2122e(this, function2, (InterfaceC5083e) null, 15), abstractC10731e);
        return vip == EnumC2821e.f6782e ? vip : Unit.INSTANCE;
    }

    public final float startapp(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) >= 0.7853981633974483d) {
            if (this.license == EnumC17426e.f34146e) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (this.license == EnumC17426e.f34145e) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    public final Object vip(long j, boolean z, AbstractC7185e abstractC7185e) {
        if (z && (this.metrica instanceof C4807e)) {
            return Unit.INSTANCE;
        }
        long ad = C11422e.ad(j, 0.0f, 0.0f, this.license == EnumC17426e.f34145e ? 1 : 2);
        C8045e c8045e = new C8045e(this, null);
        C11644e c11644e = this.vip;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (c11644e != null && (this.ad.license() || this.ad.metrica())) {
            Object vip = c11644e.vip(ad, c8045e, abstractC7185e);
            return vip == enumC2821e ? vip : Unit.INSTANCE;
        }
        C8045e c8045e2 = new C8045e(this, abstractC7185e);
        c8045e2.f16349e = ad;
        Unit unit = Unit.INSTANCE;
        Object loadAd = c8045e2.loadAd(unit);
        return loadAd == enumC2821e ? loadAd : unit;
    }

    public final long yandex(float f) {
        long floatToRawIntBits;
        long j;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.license == EnumC17426e.f34145e) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(f);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(f);
            j = floatToRawIntBits3 << 32;
        }
        return j | (4294967295L & floatToRawIntBits);
    }
}
