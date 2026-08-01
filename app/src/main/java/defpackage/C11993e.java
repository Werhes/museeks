package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۛۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11993e implements InterfaceC8292e, InterfaceC5075e, InterfaceC9452e, InterfaceC1481e, InterfaceC12163e, InterfaceC13204e, InterfaceC4871e, InterfaceC1991e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23972e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C11993e f23966e = new C11993e(15);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C11993e f23964e = new C11993e(16);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C11993e f23968e = new C11993e(17);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C11993e f23963e = new C11993e(18);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C11993e f23971e = new C11993e(19);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C11993e f23970e = new C11993e(20);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C11993e f23967e = new C11993e(21);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C11993e f23969e = new C11993e(22);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ C11993e f23965e = new C11993e(23);

    public /* synthetic */ C11993e(int i) {
        this.f23972e = i;
    }

    public static final C8926e adcel(Object obj, Object obj2) {
        C8926e c8926e = (C8926e) obj;
        C8926e c8926e2 = (C8926e) obj2;
        if (!c8926e2.isEmpty()) {
            if (!c8926e.f17889e) {
                c8926e = c8926e.ad();
            }
            c8926e.metrica();
            if (!c8926e2.isEmpty()) {
                c8926e.putAll(c8926e2);
            }
        }
        return c8926e;
    }

    public static final C12535e purchase(String str, String str2, String str3, String str4) {
        ArrayList arrayList = AbstractC7928e.ad;
        return new C12535e(str, C0520e.appmetrica(str2), str3, str4);
    }

    public static final float vip(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    @Override // defpackage.InterfaceC12163e
    public Object Signature(C13840e c13840e, Object obj) {
        C12569e c12569e = (C12569e) obj;
        Integer valueOf = Integer.valueOf(c12569e.ad);
        String str = c12569e.vip;
        String str2 = c12569e.metrica;
        long j = c12569e.license;
        int i = C12347e.metrica;
        Integer valueOf2 = Integer.valueOf((int) (j >> 32));
        Integer valueOf3 = Integer.valueOf((int) (j & 4294967295L));
        long j2 = c12569e.appmetrica;
        return AbstractC6874e.startapp(valueOf, str, str2, valueOf2, valueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (4294967295L & j2)), Long.valueOf(c12569e.purchase));
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f23972e) {
            case 15:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.edpb.events_cached_in_no_data_mode", 14, "_f,_v,_cmp").get();
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(86400000L, 29, "measurement.monitoring.sample_period_millis").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(1000L, 9, "measurement.upload.debug_upload_interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(1000L, 38, "measurement.service_client.reconnect_millis").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(7L, 26, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 20:
                List list6 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(1000L, 24, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            case 21:
            default:
                throw new IllegalStateException();
            case 22:
                List list7 = AbstractC17254e.ad;
                return (Boolean) C10118e.vip.get();
        }
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e advert(InterfaceC7227e interfaceC7227e, C8229e c8229e) {
        return new C17742e();
    }

    @Override // defpackage.InterfaceC4871e
    public Object apply(Object obj) {
        AbstractC4191e abstractC4191e = (AbstractC4191e) obj;
        abstractC4191e.getClass();
        try {
            AbstractC11202e abstractC11202e = (AbstractC11202e) abstractC4191e;
            int appmetrica = abstractC11202e.appmetrica();
            byte[] bArr = new byte[appmetrica];
            C11177e c11177e = new C11177e(appmetrica, bArr);
            InterfaceC0627e ad = C11222e.metrica.ad(abstractC11202e.getClass());
            C16554e c16554e = c11177e.vip;
            if (c16554e == null) {
                c16554e = new C16554e(c11177e);
            }
            ad.billing(abstractC11202e, c16554e);
            if (appmetrica - c11177e.appmetrica == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = abstractC4191e.getClass().getName();
            throw new RuntimeException(AbstractC8647e.ads(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.InterfaceC8292e
    public Object appmetrica(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e billing(Class cls, C8229e c8229e) {
        license(cls);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x02d7, code lost:
    
        if (r19 == 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02d9, code lost:
    
        r4 = r15 - r14;
        r24 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02e3, code lost:
    
        if (r12[r15] != (r12[r4] + 1)) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0367, code lost:
    
        if (r19 == 0) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0369, code lost:
    
        r0 = r12[r15];
        r1 = r15 - r14;
        r4 = r12[r1];
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0373, code lost:
    
        if (r0 != (r4 + 1)) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0375, code lost:
    
        r8 = r8 - 1;
        r0 = new defpackage.C3900e(3);
        r5[r8] = r0;
        r0.vip = 1;
        r19 = r19 - 1;
        r0.metrica = r19 + r11;
        r0.license = r6 + r11;
        r26 = 1;
        r13 = 1;
        r15 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x02e5, code lost:
    
        r0 = new defpackage.C3900e(3);
        r8 = r8 - 1;
        r5[r8] = r0;
        r0.vip = r26;
        r19 = r19 - 1;
        r0.metrica = r19 + r11;
        r0.license = r6 + r11;
        r15 = r4;
     */
    @Override // defpackage.InterfaceC10941e
    /* renamed from: eٌۡٔ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo2359e(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11993e.mo2359e(java.lang.String, java.lang.String):int");
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e license(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // defpackage.InterfaceC9452e
    public Object metrica(C11506e c11506e) {
        throw c11506e;
    }

    @Override // defpackage.InterfaceC12163e
    public Object startapp(Object obj) {
        List list = (List) obj;
        return new C12569e(((Integer) list.get(0)).intValue(), (String) list.get(1), (String) list.get(2), AbstractC9262e.metrica(((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue()), AbstractC9262e.metrica(((Integer) list.get(5)).intValue(), ((Integer) list.get(6)).intValue()), ((Long) list.get(7)).longValue(), false, 64);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object yandex(android.content.Context r6, java.lang.String r7, defpackage.AbstractC10731e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C2083e
            if (r0 == 0) goto L13
            r0 = r8
            eؓۛؕ r0 = (defpackage.C2083e) r0
            int r1 = r0.f5412e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5412e = r1
            goto L18
        L13:
            eؓۛؕ r0 = new eؓۛؕ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f5411e
            int r1 = r0.f5412e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r8)
            goto L51
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            defpackage.AbstractC2003e.purchase(r8)
            eٖؐٗ r6 = defpackage.C15899e.billing(r6)
            eُِّ r8 = new eُِّ
            r8.<init>(r6, r7)
            eؚؒٗ r6 = r6.purchase
            java.lang.Object r6 = r6.f3332e
            eًۦً r6 = (defpackage.ExecutorC8351e) r6
            r6.execute(r8)
            java.lang.Object r6 = r8.f23445e
            eؙٟۢ r6 = (defpackage.C6566e) r6
            r0.f5412e = r2
            java.lang.Object r8 = defpackage.AbstractC5418e.metrica(r6, r0)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r8 != r6) goto L51
            return r6
        L51:
            java.util.List r8 = (java.util.List) r8
            int r6 = r8.size()
            r7 = 0
            r0 = r7
        L59:
            if (r0 >= r6) goto L7c
            java.lang.Object r1 = r8.get(r0)
            eٌؘّ r1 = (defpackage.C12298e) r1
            r3 = 2
            eؚٜٞ[] r3 = new defpackage.EnumC7300e[r3]
            eؚٜٞ r4 = defpackage.EnumC7300e.f14901e
            r3[r7] = r4
            eؚٜٞ r4 = defpackage.EnumC7300e.f14903e
            r3[r2] = r4
            java.util.List r3 = defpackage.AbstractC6874e.startapp(r3)
            eؚٜٞ r1 = r1.vip
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L79
            goto L7d
        L79:
            int r0 = r0 + 1
            goto L59
        L7c:
            r2 = r7
        L7d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11993e.yandex(android.content.Context, java.lang.String, eُؑ۠):java.lang.Object");
    }
}
