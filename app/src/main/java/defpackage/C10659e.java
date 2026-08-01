package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.MediaCodec;
import android.os.Parcel;
import android.os.Trace;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۥۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10659e implements InterfaceC2276e, InterfaceC5974e, InterfaceC12369e, InterfaceC15588e, InterfaceC12233e, InterfaceC16538e, InterfaceC3696e, InterfaceC17847e, InterfaceC13204e, InterfaceC1991e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20996e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C10659e f20990e = new C10659e(14);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C10659e f20988e = new C10659e(15);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C10659e f20992e = new C10659e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C10659e f20987e = new C10659e(17);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C10659e f20995e = new C10659e(18);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C10659e f20994e = new C10659e(19);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C10659e f20991e = new C10659e(20);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C10659e f20993e = new C10659e(21);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ C10659e f20989e = new C10659e(24);

    public /* synthetic */ C10659e(int i) {
        this.f20996e = i;
    }

    public static Typeface adcel(String str, C1812e c1812e, int i) {
        if (i == 0 && AbstractC7890e.billing(c1812e, C1812e.f4893e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int adcel = AbstractC1129e.adcel(i, c1812e);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(adcel) : Typeface.create(str, adcel);
    }

    public static long advert(long j, C2025e c2025e, C4217e c4217e) {
        long metrica;
        int i = C12347e.metrica;
        long ad = c2025e.ad((int) (j >> 32), true);
        long ad2 = C12347e.license(j) ? ad : c2025e.ad((int) (j & 4294967295L), true);
        int i2 = 0;
        int i3 = c4217e != null ? c4217e.ad : 0;
        if (C12347e.license(j)) {
            i2 = i3;
        } else if (c4217e != null) {
            i2 = c4217e.vip;
        }
        if (i3 != 0 && !C12347e.license(ad)) {
            int m2467class = AbstractC8703e.m2467class(i3);
            if (m2467class == 0) {
                int i4 = (int) (ad >> 32);
                ad = AbstractC9262e.metrica(i4, i4);
            } else {
                if (m2467class != 1) {
                    throw new C14803e(10);
                }
                int i5 = (int) (ad & 4294967295L);
                ad = AbstractC9262e.metrica(i5, i5);
            }
        }
        if (i2 != 0 && !C12347e.license(ad2)) {
            int m2467class2 = AbstractC8703e.m2467class(i2);
            if (m2467class2 == 0) {
                int i6 = (int) (ad2 >> 32);
                metrica = AbstractC9262e.metrica(i6, i6);
            } else {
                if (m2467class2 != 1) {
                    throw new C14803e(10);
                }
                int i7 = (int) (ad2 & 4294967295L);
                metrica = AbstractC9262e.metrica(i7, i7);
            }
            ad2 = metrica;
        }
        int min = Math.min(C12347e.billing(ad), C12347e.billing(ad2));
        int max = Math.max(C12347e.purchase(ad), C12347e.purchase(ad2));
        return C12347e.yandex(j) ? AbstractC9262e.metrica(max, min) : AbstractC9262e.metrica(min, max);
    }

    public static MediaCodec mopub(C2532e c2532e) {
        String str = ((C10643e) c2532e.f6388e).ad;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static final C0423e startapp(Bitmap bitmap) {
        C1188e c1188e = C0896e.appmetrica;
        C0423e c0423e = new C0423e(bitmap);
        ArrayList arrayList = (ArrayList) c0423e.f2469e;
        if (arrayList != null) {
            arrayList.clear();
        }
        c0423e.ad(C0896e.appmetrica);
        c0423e.ad(C0896e.purchase);
        c0423e.ad(C0896e.billing);
        c0423e.ad(C0896e.yandex);
        return c0423e;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        C18482e c18482e = C4612e.f9940interface;
        C1091e c1091e = (C1091e) ((C4379e) obj).loadAd();
        C10988e appmetrica = AbstractC10432e.appmetrica();
        Parcel m4156e = c1091e.m4156e();
        AbstractC3336e.vip(m4156e, appmetrica);
        c1091e.m4151e(m4156e, 19);
        ((C8988e) obj2).vip(Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f20996e) {
            case 15:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(1000L, 69, "measurement.upload.max_error_events_per_day").get()).longValue());
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(10L, 42, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(604800000L, 34, "measurement.upload.refresh_blacklisted_config_interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C3973e.f8863e.get();
                return (Long) C16868e.ad.billing(-1L, 4, "measurement.test.long_flag").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.rb.attribution.uri_authority", 56, "google-analytics.com").get();
            case 20:
                List list6 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Boolean) C15469e.ad.license("measurement.config.default_flag_values", true, 10).get();
            case 21:
                List list7 = AbstractC17254e.ad;
                return (Boolean) C4997e.vip.get();
            default:
                C18482e c18482e = C0385e.tapsense;
                C18482e c18482e2 = C8033e.adcel;
                AbstractC9528e.appmetrica();
                C8033e c8033e = C8033e.advert;
                AbstractC9528e.startapp(c8033e);
                AbstractC9528e.appmetrica();
                return c8033e.license.f25017e;
        }
    }

    @Override // defpackage.InterfaceC12369e
    public InterfaceC4911e appmetrica(String str) {
        return C11437e.f23001e;
    }

    @Override // defpackage.InterfaceC5974e
    public void billing(long j, String str) {
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        C7936e c7936e = new C7936e(12);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(EnumC6651e.f13723e, new C17600e(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(EnumC6651e.f13720e, new C17600e(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(EnumC17662e.f34616e)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(EnumC6651e.f13721e, new C17600e(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < EnumC6651e.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new C6176e(c7936e, hashMap);
    }

    @Override // defpackage.InterfaceC5974e
    public String license() {
        return null;
    }

    @Override // defpackage.InterfaceC15588e
    public Typeface metrica(int i, C1812e c1812e) {
        return adcel(null, c1812e, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // defpackage.InterfaceC3696e
    /* renamed from: package */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.InterfaceC5827e mo821package(defpackage.C2532e r6) {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = mopub(r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r1 = r6.f6387e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 != 0) goto L25
            java.lang.Object r2 = r6.f6388e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            eَۥؒ r2 = (defpackage.C10643e) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r2 = r2.yandex     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L25
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r3 = 35
            if (r2 < r3) goto L25
            r2 = 8
            goto L26
        L21:
            r6 = move-exception
            goto L49
        L23:
            r6 = move-exception
            goto L49
        L25:
            r2 = 0
        L26:
            java.lang.Object r3 = r6.f6386e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r4 = r6.f6384e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            eؘۘ۠ r1 = new eؘۘ۠     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r6 = r6.f6389e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            eؔٓ r6 = (defpackage.C2559e) r6     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r1
        L49:
            if (r0 == 0) goto L4e
            r0.release()
        L4e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10659e.mo821package(eِّؔ):eؘۖۡ");
    }

    @Override // defpackage.InterfaceC3934e
    public C17985e pro(C17985e c17985e, float f, C7695e c7695e) {
        Path path = c17985e.ad;
        float f2 = (f / 7.0f) * 1.0f;
        if (Float.isNaN(0.0f) || Float.isNaN(0.0f) || Float.isNaN(f) || Float.isNaN(f)) {
            AbstractC11972e.metrica("Invalid rectangle, make sure no value is NaN");
        }
        if (c17985e.vip == null) {
            c17985e.vip = new RectF();
        }
        c17985e.vip.set(0.0f, 0.0f, f, f);
        path.addRect(c17985e.vip, AbstractC11972e.vip(1));
        float f3 = f - f2;
        if (Float.isNaN(f2) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f3)) {
            AbstractC11972e.metrica("Invalid rectangle, make sure no value is NaN");
        }
        if (c17985e.vip == null) {
            c17985e.vip = new RectF();
        }
        c17985e.vip.set(f2, f2, f3, f3);
        path.addRect(c17985e.vip, AbstractC11972e.vip(1));
        return c17985e;
    }

    @Override // defpackage.InterfaceC15588e
    public Typeface purchase(C7492e c7492e, C1812e c1812e, int i) {
        String str = c7492e.f15263e;
        int i2 = c1812e.f4894e / 100;
        if (i2 >= 0 && i2 < 2) {
            str = str.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            str = str.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                str = str.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                str = str.concat("-black");
            }
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface adcel = adcel(str, c1812e, i);
            if (!AbstractC7890e.billing(adcel, Typeface.create(Typeface.DEFAULT, AbstractC1129e.adcel(i, c1812e))) && !AbstractC7890e.billing(adcel, adcel(null, c1812e, i))) {
                typeface = adcel;
            }
        }
        return typeface == null ? adcel(c7492e.f15263e, c1812e, i) : typeface;
    }

    public String toString() {
        switch (this.f20996e) {
            case 13:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC5974e
    public void vip() {
    }

    @Override // defpackage.InterfaceC2276e
    public InterfaceC11216e yandex(C5609e c5609e) {
        return new C3416e((Context) c5609e.f11962e, (String) c5609e.f11964e, (C5891e) c5609e.f11961e, c5609e.f11963e);
    }
}
