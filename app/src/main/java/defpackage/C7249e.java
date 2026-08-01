package defpackage;

import android.graphics.Path;
import android.os.Parcel;
import android.util.Size;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7249e implements InterfaceC9650e, InterfaceC1598e, InterfaceC14020e, InterfaceC16567e, InterfaceC17847e, InterfaceC13204e, InterfaceC5808e, InterfaceC0771e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14845e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C7249e f14839e = new C7249e(14);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C7249e f14838e = new C7249e(15);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C7249e f14841e = new C7249e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C7249e f14837e = new C7249e(18);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C7249e f14844e = new C7249e(19);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C7249e f14843e = new C7249e(20);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C7249e f14840e = new C7249e(21);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C7249e f14842e = new C7249e(22);

    public /* synthetic */ C7249e(int i) {
        this.f14845e = i;
    }

    public static Path license(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static C15013e vip(int i, int i2) {
        return new C15013e(i, i2, new C4671e(11));
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        C18482e c18482e = C4612e.f9940interface;
        C1091e c1091e = (C1091e) ((C4379e) obj).loadAd();
        C10988e appmetrica = AbstractC10432e.appmetrica();
        Parcel m4156e = c1091e.m4156e();
        AbstractC3336e.vip(m4156e, appmetrica);
        c1091e.m4151e(m4156e, 1);
        ((C8988e) obj2).vip(null);
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f14845e) {
            case 15:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(50000L, 72, "measurement.upload.max_public_events_per_day").get()).longValue());
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(5000L, 47, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            default:
                return new Boolean(((Boolean) C8581e.ad.get()).booleanValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC17254e.ad;
                C3973e.f8863e.get();
                return (Long) C16868e.ad.billing(-1L, 1, "measurement.test.cached_long_flag").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.rb.attribution.uri_path", 58, "privacy-sandbox/register-app-conversion").get();
            case 20:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(3600000L, 11, "45769094").get();
            case 21:
                List list6 = AbstractC17254e.ad;
                return (Boolean) C9064e.ad.get();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0321, code lost:
    
        if (defpackage.AbstractC13232e.ad(r0, defpackage.AbstractC13232e.f26268try) == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x021c, code lost:
    
        if (defpackage.AbstractC13232e.ad(defpackage.AbstractC16852e.ad(r13.getKeyCode()), defpackage.AbstractC13232e.loadAd) != false) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.EnumC1320e adcel(android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7249e.adcel(android.view.KeyEvent):eؒۛؗ");
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        AbstractC15319e appmetrica;
        C12289e c12289e = (C12289e) c0560e.adcel();
        C7141e ads = C17617e.ads();
        String str = c12289e.f24661e;
        ads.vip();
        ((C17617e) ads.f12709e).premium(str);
        String str2 = c12289e.f24658e;
        ads.vip();
        ((C17617e) ads.f12709e).crashlytics(str2);
        boolean z = c12289e.f24663e;
        ads.vip();
        ((C17617e) ads.f12709e).m4377interface(z);
        long j = c12289e.f24662e;
        ads.vip();
        ((C17617e) ads.f12709e).m4376goto(j);
        byte[] bArr = c12289e.f24659e;
        if (bArr != null) {
            C10553e loadAd = AbstractC7244e.loadAd(0, bArr.length, bArr);
            ads.vip();
            ((C17617e) ads.f12709e).subs(loadAd);
        }
        for (C14094e c14094e : c12289e.f24660e) {
            for (C11665e c11665e : c14094e.f27861e) {
                int i = c11665e.f23442e;
                String str3 = c11665e.f23441e;
                if (i == 1) {
                    C2596e ads2 = C3259e.ads();
                    ads2.yandex(str3);
                    if (i != 1) {
                        throw new IllegalArgumentException("Not a long type");
                    }
                    long j2 = c11665e.f23437e;
                    ads2.vip();
                    ((C3259e) ads2.f12709e).crashlytics(j2);
                    appmetrica = ads2.appmetrica();
                } else if (i == 2) {
                    C2596e ads3 = C3259e.ads();
                    ads3.yandex(str3);
                    if (i != 2) {
                        throw new IllegalArgumentException("Not a boolean type");
                    }
                    boolean z2 = c11665e.f23436e;
                    ads3.vip();
                    ((C3259e) ads3.f12709e).firebase(z2);
                    appmetrica = ads3.appmetrica();
                } else if (i == 3) {
                    C2596e ads4 = C3259e.ads();
                    ads4.yandex(str3);
                    if (i != 3) {
                        throw new IllegalArgumentException("Not a double type");
                    }
                    double d = c11665e.f23439e;
                    ads4.vip();
                    ((C3259e) ads4.f12709e).m1332class(d);
                    appmetrica = ads4.appmetrica();
                } else if (i == 4) {
                    C2596e ads5 = C3259e.ads();
                    ads5.yandex(str3);
                    if (i != 4) {
                        throw new IllegalArgumentException("Not a String type");
                    }
                    String str4 = c11665e.f23435e;
                    AbstractC9528e.startapp(str4);
                    ads5.vip();
                    ((C3259e) ads5.f12709e).m1334interface(str4);
                    appmetrica = ads5.appmetrica();
                } else {
                    if (i != 5) {
                        throw new IllegalArgumentException(AbstractC8647e.isPro(i, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i).length() + 24)));
                    }
                    C2596e ads6 = C3259e.ads();
                    ads6.yandex(str3);
                    if (i != 5) {
                        throw new IllegalArgumentException("Not a bytes type");
                    }
                    byte[] bArr2 = c11665e.f23443e;
                    AbstractC9528e.startapp(bArr2);
                    C10553e loadAd2 = AbstractC7244e.loadAd(0, bArr2.length, bArr2);
                    ads6.vip();
                    ((C3259e) ads6.f12709e).m1333goto(loadAd2);
                    appmetrica = ads6.appmetrica();
                }
                ads.vip();
                ((C17617e) ads.f12709e).firebase((C3259e) appmetrica);
            }
            String[] strArr = c14094e.f27860e;
            if (strArr != null) {
                for (String str5 : strArr) {
                    ads.vip();
                    ((C17617e) ads.f12709e).m4375class(str5);
                }
            }
        }
        return (C17617e) ads.appmetrica();
    }

    @Override // defpackage.InterfaceC9650e
    public Object apply(Object obj) {
        return obj;
    }

    @Override // defpackage.InterfaceC16567e
    public C2873e appmetrica() {
        byte[] license = AbstractC14437e.license();
        return new C2873e(license, AbstractC14437e.adcel(license));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object billing(java.lang.String r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C8321e
            if (r0 == 0) goto L13
            r0 = r6
            eًۤ٘ r0 = (defpackage.C8321e) r0
            int r1 = r0.f17021e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17021e = r1
            goto L18
        L13:
            eًۤ٘ r0 = new eًۤ٘
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f17020e
            int r1 = r0.f17021e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L4e
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            java.lang.String r6 = "http"
            r1 = 0
            boolean r6 = defpackage.AbstractC6507e.pro(r5, r6, r1)
            if (r6 == 0) goto L57
            r0.f17021e = r2
            eّٕٓ r6 = defpackage.AbstractC6731e.ad
            eؕۙۜ r6 = defpackage.ExecutorC3603e.f8134e
            eٍِۗ r1 = new eٍِۗ
            r2 = 0
            r1.<init>(r5, r2)
            java.lang.Object r6 = defpackage.AbstractC5336e.advert(r6, r1, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r6 != r5) goto L4e
            return r5
        L4e:
            eٍُ٘ r6 = (defpackage.C11058e) r6
            eّۢۧ r5 = r6.f21945e
            eؗٔۙ r5 = r5.mo1012e()
            return r5
        L57:
            eَۧ r6 = defpackage.AbstractC11062e.f21949e
            java.lang.String r0 = defpackage.C10675e.f21023e
            eَۦۦ r5 = defpackage.C10215e.license(r5, r1)
            eّؔۜ r5 = r6.mo1918implements(r5)
            eُْۗ r6 = new eُْۗ
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7249e.billing(java.lang.String, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC14020e
    /* renamed from: import */
    public List mo818import(C14677e c14677e) {
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r0v7, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v12, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [eِٖۢ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable metrica(java.lang.String r6, defpackage.AbstractC10731e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C6668e
            if (r0 == 0) goto L13
            r0 = r7
            eَؙۜ r0 = (defpackage.C6668e) r0
            int r1 = r0.f13768e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13768e = r1
            goto L18
        L13:
            eَؙۜ r0 = new eَؙۜ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13767e
            int r1 = r0.f13768e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L26
            defpackage.AbstractC2003e.purchase(r7)
            goto L4e
        L26:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            defpackage.AbstractC2003e.purchase(r7)
            java.lang.String r7 = "http"
            r1 = 0
            boolean r7 = defpackage.AbstractC6507e.pro(r6, r7, r1)
            if (r7 == 0) goto L64
            r0.f13768e = r2
            eّٕٓ r7 = defpackage.AbstractC6731e.ad
            eؕۙۜ r7 = defpackage.ExecutorC3603e.f8134e
            eٍِۗ r1 = new eٍِۗ
            r1.<init>(r6, r3)
            java.lang.Object r7 = defpackage.AbstractC5336e.advert(r7, r1, r0)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r7 != r6) goto L4e
            return r6
        L4e:
            java.io.Closeable r7 = (java.io.Closeable) r7
            r6 = r7
            eٍُ٘ r6 = (defpackage.C11058e) r6     // Catch: java.lang.Throwable -> L5d
            eّۢۧ r6 = r6.f21945e     // Catch: java.lang.Throwable -> L5d
            byte[] r6 = r6.ad()     // Catch: java.lang.Throwable -> L5d
            defpackage.AbstractC16704e.vip(r7, r3)
            return r6
        L5d:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            defpackage.AbstractC16704e.vip(r7, r6)
            throw r0
        L64:
            eَۧ r7 = defpackage.AbstractC11062e.f21949e
            java.lang.String r0 = defpackage.C10675e.f21023e
            eَۦۦ r6 = defpackage.C10215e.license(r6, r1)
            eّؔۜ r6 = r7.mo1918implements(r6)
            eِٖۢ r7 = new eِٖۢ
            r7.<init>()
            r7.mo2629class(r6)     // Catch: java.lang.Throwable -> L8d
            long r0 = r7.f31731e     // Catch: java.lang.Throwable -> L8d
            byte[] r0 = r7.subs(r0)     // Catch: java.lang.Throwable -> L8d
            eؘؘۧ r6 = (defpackage.C5476e) r6     // Catch: java.lang.Throwable -> L87
            r6.close()     // Catch: java.lang.Throwable -> L87
            r7.ad()     // Catch: java.lang.Throwable -> L87
            goto L89
        L87:
            r6 = move-exception
            r3 = r6
        L89:
            r4 = r3
            r3 = r0
            r0 = r4
            goto L9b
        L8d:
            r0 = move-exception
            eؘؘۧ r6 = (defpackage.C5476e) r6     // Catch: java.lang.Throwable -> L97
            r6.close()     // Catch: java.lang.Throwable -> L97
            r7.ad()     // Catch: java.lang.Throwable -> L97
            goto L9b
        L97:
            r6 = move-exception
            defpackage.AbstractC13362e.license(r0, r6)
        L9b:
            if (r0 != 0) goto L9e
            return r3
        L9e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7249e.metrica(java.lang.String, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC14020e
    public /* synthetic */ Size purchase(C18525e c18525e, C14677e c14677e) {
        return null;
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        c18464e.appmetrica(C13122e.class);
        return new Object();
    }

    @Override // defpackage.InterfaceC16567e
    public byte[] startapp(byte[] bArr, byte[] bArr2) {
        return AbstractC14437e.metrica(bArr, bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object yandex(java.lang.String r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C14135e
            if (r0 == 0) goto L13
            r0 = r6
            eْٓٞ r0 = (defpackage.C14135e) r0
            int r1 = r0.f27951e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27951e = r1
            goto L18
        L13:
            eْٓٞ r0 = new eْٓٞ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f27950e
            int r1 = r0.f27951e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L4e
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            java.lang.String r6 = "http"
            r1 = 0
            boolean r6 = defpackage.AbstractC6507e.pro(r5, r6, r1)
            if (r6 == 0) goto L5b
            r0.f27951e = r2
            eّٕٓ r6 = defpackage.AbstractC6731e.ad
            eؕۙۜ r6 = defpackage.ExecutorC3603e.f8134e
            eٍِۗ r1 = new eٍِۗ
            r2 = 0
            r1.<init>(r5, r2)
            java.lang.Object r6 = defpackage.AbstractC5336e.advert(r6, r1, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r6 != r5) goto L4e
            return r5
        L4e:
            eٍُ٘ r6 = (defpackage.C11058e) r6
            eّۢۧ r5 = r6.f21945e
            eؗٔۙ r5 = r5.mo1012e()
            java.io.InputStream r5 = r5.mo1680e()
            return r5
        L5b:
            eَۧ r6 = defpackage.AbstractC11062e.f21949e
            java.lang.String r0 = defpackage.C10675e.f21023e
            eَۦۦ r5 = defpackage.C10215e.license(r5, r1)
            eّؔۜ r5 = r6.mo1918implements(r5)
            eُْۗ r6 = new eُْۗ
            r6.<init>(r5)
            eؚۘٛ r5 = new eؚۘٛ
            r0 = 4
            r5.<init>(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7249e.yandex(java.lang.String, eُؑ۠):java.lang.Object");
    }
}
