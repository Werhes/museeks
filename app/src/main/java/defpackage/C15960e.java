package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.car.app.navigation.model.Maneuver;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15960e extends AbstractC17844e {

    /* renamed from: eٖؗۧ, reason: contains not printable characters */
    public static boolean f31428e;

    /* renamed from: eّٓ٘, reason: contains not printable characters */
    public static final int[] f31429e = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: eّٟۧ, reason: contains not printable characters */
    public static boolean f31430e;

    /* renamed from: eٌؑۡ, reason: contains not printable characters */
    public boolean f31431e;

    /* renamed from: eؓؕۙ, reason: contains not printable characters */
    public C3900e f31432e;

    /* renamed from: eٌؓٞ, reason: contains not printable characters */
    public C2351e f31433e;

    /* renamed from: eؓۤٔ, reason: contains not printable characters */
    public List f31434e;

    /* renamed from: eؕٙۧ, reason: contains not printable characters */
    public int f31435e;

    /* renamed from: eؕۚۘ, reason: contains not printable characters */
    public int f31436e;

    /* renamed from: eؖۖۜ, reason: contains not printable characters */
    public long f31437e;

    /* renamed from: eؚؗۛ, reason: contains not printable characters */
    public final long f31438e;

    /* renamed from: eؗٞؑ, reason: contains not printable characters */
    public int f31439e;

    /* renamed from: eؗۗؓ, reason: contains not printable characters */
    public final Context f31440e;

    /* renamed from: eؗۢؖ, reason: contains not printable characters */
    public int f31441e;

    /* renamed from: eؗۢؗ, reason: contains not printable characters */
    public final boolean f31442e;

    /* renamed from: eؘٞٔ, reason: contains not printable characters */
    public int f31443e;

    /* renamed from: eؚِۛ, reason: contains not printable characters */
    public final C16911e f31444e;

    /* renamed from: eؚّؓ, reason: contains not printable characters */
    public C8174e f31445e;

    /* renamed from: eًؙٞ, reason: contains not printable characters */
    public final C18506e f31446e;

    /* renamed from: eًۘ٘, reason: contains not printable characters */
    public long f31447e;

    /* renamed from: eٌؗۗ, reason: contains not printable characters */
    public boolean f31448e;

    /* renamed from: eٌٟٙ, reason: contains not printable characters */
    public int f31449e;

    /* renamed from: eٌۜۧ, reason: contains not printable characters */
    public final C11122e f31450e;

    /* renamed from: eٍؗۡ, reason: contains not printable characters */
    public InterfaceC17077e f31451e;

    /* renamed from: eَؖۚ, reason: contains not printable characters */
    public long f31452e;

    /* renamed from: eَؚؗ, reason: contains not printable characters */
    public InterfaceC6175e f31453e;

    /* renamed from: eَۡۙ, reason: contains not printable characters */
    public long f31454e;

    /* renamed from: eؘُۣ, reason: contains not printable characters */
    public int f31455e;

    /* renamed from: eِؔۛ, reason: contains not printable characters */
    public final int f31456e;

    /* renamed from: eِۗۤ, reason: contains not printable characters */
    public C17615e f31457e;

    /* renamed from: eِۜۤ, reason: contains not printable characters */
    public long f31458e;

    /* renamed from: eَْؐ, reason: contains not printable characters */
    public C2351e f31459e;

    /* renamed from: eٓۦْ, reason: contains not printable characters */
    public final boolean f31460e;

    /* renamed from: eِۣٔ, reason: contains not printable characters */
    public final C8034e f31461e;

    /* renamed from: eْۣٔ, reason: contains not printable characters */
    public C6321e f31462e;

    /* renamed from: eًٕٚ, reason: contains not printable characters */
    public boolean f31463e;

    /* renamed from: eَْٕ, reason: contains not printable characters */
    public long f31464e;

    /* renamed from: eٍٖٔ, reason: contains not printable characters */
    public int f31465e;

    /* renamed from: eٖٜۡ, reason: contains not printable characters */
    public final PriorityQueue f31466e;

    /* renamed from: eًٖٞ, reason: contains not printable characters */
    public boolean f31467e;

    /* renamed from: eََٗ, reason: contains not printable characters */
    public int f31468e;

    /* renamed from: eٖٗٝ, reason: contains not printable characters */
    public boolean f31469e;

    /* renamed from: eٗۦٗ, reason: contains not printable characters */
    public int f31470e;

    /* renamed from: eْ٘ؕ, reason: contains not printable characters */
    public C8795e f31471e;

    /* renamed from: e٘ؖؐ, reason: contains not printable characters */
    public boolean f31472e;

    /* renamed from: e٘ؖۙ, reason: contains not printable characters */
    public boolean f31473e;

    /* renamed from: e۠ۢ, reason: contains not printable characters */
    public final C10312e f31474e;

    /* renamed from: eُۤ, reason: contains not printable characters */
    public Surface f31475e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15960e(defpackage.C2735e r9) {
        /*
            r8 = this;
            android.content.Context r0 = r9.ad
            android.content.Context r2 = r0.getApplicationContext()
            eؕۢؗ r4 = r9.metrica
            boolean r5 = r9.appmetrica
            r6 = 1106247680(0x41f00000, float:30.0)
            r3 = 2
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            android.content.Context r0 = r0.getApplicationContext()
            r1.f31440e = r0
            int r2 = r9.yandex
            r1.f31456e = r2
            r2 = 0
            r1.f31453e = r2
            eَٗٞ r3 = new eَٗٞ
            android.os.Handler r4 = r9.purchase
            eٍؒ٘ r5 = r9.billing
            r3.<init>(r4, r5)
            r1.f31474e = r3
            eؙؕٗ r3 = r1.f31453e
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L31
            r3 = r4
            goto L32
        L31:
            r3 = r5
        L32:
            r1.f31460e = r3
            eُٜٛ r3 = new eُٜٛ
            long r6 = r9.license
            r3.<init>(r0, r8, r6)
            r1.f31450e = r3
            eۦۥ r9 = new eۦۥ
            r9.<init>()
            r1.f31446e = r9
            java.lang.String r9 = "NVIDIA"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r9 = r9.equals(r0)
            r1.f31442e = r9
            eٌٛؖ r9 = defpackage.C8795e.metrica
            r1.f31471e = r9
            r1.f31436e = r4
            r1.f31455e = r5
            eؔؔٛ r9 = defpackage.C2351e.license
            r1.f31433e = r9
            r1.f31443e = r5
            r1.f31459e = r2
            r9 = -1000(0xfffffffffffffc18, float:NaN)
            r1.f31441e = r9
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.f31437e = r3
            r1.f31452e = r3
            eَٗؔ r9 = new eَٗؔ
            r0 = 8
            r9.<init>(r0)
            r1.f31444e = r9
            java.util.PriorityQueue r9 = new java.util.PriorityQueue
            r9.<init>()
            r1.f31466e = r9
            r3 = -15000(0xffffffffffffc568, double:NaN)
            r1.f31438e = r3
            eًٚۖ r9 = new eًٚۖ
            r9.<init>()
            r1.f31461e = r9
            r1.f31457e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15960e.<init>(eؔٝٔ):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m4070e(defpackage.C10643e r11, defpackage.C16975e r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15960e.m4070e(eَۥؒ, eٌْٗ):int");
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public static int m4071e(C10643e c10643e, C16975e c16975e) {
        int i = c16975e.Signature;
        List list = c16975e.subscription;
        if (i == -1) {
            return m4070e(c10643e, c16975e);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return c16975e.Signature + i2;
    }

    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public static List m4072e(Context context, C2282e c2282e, C16975e c16975e, boolean z, boolean z2) {
        String str = c16975e.loadAd;
        if (str == null) {
            return C1410e.f4222e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC11815e.subscription(context)) {
            String metrica = AbstractC7473e.metrica(c16975e);
            List ad = metrica == null ? C1410e.f4222e : c2282e.ad(metrica, z, z2);
            if (!ad.isEmpty()) {
                return ad;
            }
        }
        return AbstractC7473e.billing(c2282e, c16975e, z, z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0736, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08b7, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[FALL_THROUGH] */
    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m4073e(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15960e.m4073e(java.lang.String):boolean");
    }

    @Override // defpackage.AbstractC17844e, defpackage.AbstractC0241e, defpackage.InterfaceC0396e
    public final void ad(int i, Object obj) {
        if (i == 1) {
            m4084e(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC17077e interfaceC17077e = (InterfaceC17077e) obj;
            this.f31451e = interfaceC17077e;
            InterfaceC6175e interfaceC6175e = this.f31453e;
            if (interfaceC6175e != null) {
                interfaceC6175e.remoteconfig(interfaceC17077e);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f31443e != intValue) {
                this.f31443e = intValue;
                if (this.f31467e) {
                    m4463volatile();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f31436e = intValue2;
            InterfaceC5827e interfaceC5827e = this.f34976e;
            if (interfaceC5827e != null) {
                interfaceC5827e.loadAd(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.f31455e = intValue3;
            InterfaceC6175e interfaceC6175e2 = this.f31453e;
            if (interfaceC6175e2 != null) {
                interfaceC6175e2.adcel(intValue3);
                return;
            }
            C14347e c14347e = this.f31450e.vip;
            if (c14347e.adcel == intValue3) {
                return;
            }
            c14347e.adcel = intValue3;
            c14347e.license(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC18095e.ad)) {
                InterfaceC6175e interfaceC6175e3 = this.f31453e;
                if (interfaceC6175e3 == null || !interfaceC6175e3.ad()) {
                    return;
                }
                this.f31453e.pro();
                return;
            }
            this.f31434e = list;
            InterfaceC6175e interfaceC6175e4 = this.f31453e;
            if (interfaceC6175e4 != null) {
                interfaceC6175e4.loadAd(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            C8795e c8795e = (C8795e) obj;
            if (c8795e.ad == 0 || c8795e.vip == 0) {
                return;
            }
            this.f31471e = c8795e;
            InterfaceC6175e interfaceC6175e5 = this.f31453e;
            if (interfaceC6175e5 != null) {
                Surface surface = this.f31475e;
                surface.getClass();
                interfaceC6175e5.signatures(surface, c8795e);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f31441e = ((Integer) obj).intValue();
                InterfaceC5827e interfaceC5827e2 = this.f34976e;
                if (interfaceC5827e2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f31441e));
                    interfaceC5827e2.ad(bundle);
                    return;
                }
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Surface surface2 = this.f31475e;
                m4084e(null);
                obj.getClass();
                ((C15960e) obj).ad(1, surface2);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                boolean z = this.f31457e != null;
                C17615e c17615e = (C17615e) obj;
                this.f31457e = c17615e;
                if (z != (c17615e != null)) {
                    m4454e(this.f34973e);
                    return;
                }
                return;
            default:
                super.ad(i, obj);
                return;
        }
    }

    @Override // defpackage.AbstractC17844e, defpackage.AbstractC0241e
    public final void adcel() {
        C10312e c10312e = this.f31474e;
        this.f31459e = null;
        this.f31452e = -9223372036854775807L;
        m4079e();
        this.f31463e = false;
        this.f31462e = null;
        this.f31431e = true;
        try {
            super.adcel();
            C11387e c11387e = this.f34987e;
            c10312e.getClass();
            synchronized (c11387e) {
            }
            Handler handler = (Handler) c10312e.f20361e;
            if (handler != null) {
                handler.post(new RunnableC14733e(c10312e, c11387e, 1));
            }
            c10312e.m2795goto(C2351e.license);
        } catch (Throwable th) {
            c10312e.loadAd(this.f34987e);
            c10312e.m2795goto(C2351e.license);
            throw th;
        }
    }

    @Override // defpackage.AbstractC0241e
    public final void admob() {
        m4088e();
        int i = this.f31449e;
        if (i != 0) {
            long j = this.f31447e;
            C10312e c10312e = this.f31474e;
            Handler handler = (Handler) c10312e.f20361e;
            if (handler != null) {
                handler.post(new RunnableC16492e(c10312e, j, i));
            }
            this.f31447e = 0L;
            this.f31449e = 0;
        }
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e != null) {
            interfaceC6175e.vip();
        } else {
            C11122e c11122e = this.f31450e;
            c11122e.license = false;
            c11122e.startapp = -9223372036854775807L;
            C14347e c14347e = c11122e.vip;
            c14347e.license = false;
            AbstractC17090e abstractC17090e = c14347e.metrica;
            if (abstractC17090e != null) {
                abstractC17090e.vip();
            }
            c14347e.ad();
        }
        C8034e c8034e = this.f31461e;
        if (c8034e != null) {
            c8034e.vip();
        }
    }

    @Override // defpackage.AbstractC17844e, defpackage.AbstractC0241e
    public final void ads(float f, float f2) {
        super.ads(f, f2);
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e != null) {
            interfaceC6175e.purchase(f);
        } else {
            this.f31450e.yandex(f);
        }
        C8034e c8034e = this.f31461e;
        if (c8034e != null) {
            c8034e.metrica(f);
        }
    }

    @Override // defpackage.AbstractC17844e, defpackage.AbstractC0241e
    public final void advert(long j, boolean z, boolean z2) {
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e != null && !z) {
            interfaceC6175e.amazon(true);
        }
        if (z2) {
            this.f31464e = j;
        }
        super.advert(j, z, z2);
        InterfaceC6175e interfaceC6175e2 = this.f31453e;
        C11122e c11122e = this.f31450e;
        if (interfaceC6175e2 == null) {
            c11122e.vip.vip();
            c11122e.yandex = -9223372036854775807L;
            c11122e.purchase = -9223372036854775807L;
            c11122e.appmetrica = Math.min(c11122e.appmetrica, 1);
            c11122e.startapp = -9223372036854775807L;
            c11122e.amazon = false;
        }
        C8034e c8034e = this.f31461e;
        if (c8034e != null) {
            c8034e.vip();
        }
        if (z) {
            InterfaceC6175e interfaceC6175e3 = this.f31453e;
            if (interfaceC6175e3 != null) {
                interfaceC6175e3.admob(false);
            } else {
                c11122e.metrica(false);
            }
        }
        m4079e();
        this.f31465e = 0;
    }

    @Override // defpackage.AbstractC0241e
    public final void amazon() {
        try {
            try {
                this.f34995e = false;
                m4447continue();
                m4463volatile();
                InterfaceC16612e interfaceC16612e = this.f34974e;
                if (interfaceC16612e != null) {
                    interfaceC16612e.metrica(null);
                }
                this.f34974e = null;
            } catch (Throwable th) {
                InterfaceC16612e interfaceC16612e2 = this.f34974e;
                if (interfaceC16612e2 != null) {
                    interfaceC16612e2.metrica(null);
                }
                this.f34974e = null;
                throw th;
            }
        } finally {
            this.f31448e = false;
            this.f31437e = -9223372036854775807L;
            C8174e c8174e = this.f31445e;
            if (c8174e != null) {
                c8174e.release();
                this.f31445e = null;
            }
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: break */
    public final ArrayList mo2718break(C2282e c2282e, C16975e c16975e, boolean z) {
        boolean z2 = this.f31467e;
        Context context = this.f31440e;
        List m4072e = m4072e(context, c2282e, c16975e, z, z2);
        HashMap hashMap = AbstractC7473e.ad;
        ArrayList arrayList = new ArrayList(m4072e);
        Collections.sort(arrayList, new C15401e(1, new C11565e(context, c16975e)));
        return arrayList;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: case */
    public final void mo2719case(C7507e c7507e) {
        if (this.f31472e) {
            ByteBuffer byteBuffer = c7507e.f15298e;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC5827e interfaceC5827e = this.f34976e;
                        interfaceC5827e.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC5827e.ad(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC0241e
    public final boolean crashlytics(long j) {
        if (this.f34956e == -9223372036854775807L || j < this.f31464e) {
            return false;
        }
        long j2 = this.f34951e;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: else */
    public final void mo2720else() {
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e != null) {
            interfaceC6175e.startapp();
            if (this.f31437e == -9223372036854775807L) {
                this.f31437e = this.f35007e.vip;
            }
            this.f31453e.yandex(-this.f31437e);
        } else {
            this.f31450e.appmetrica(2);
        }
        this.f31469e = true;
        m4079e();
    }

    /* renamed from: eَؑۨ, reason: contains not printable characters */
    public final void m4074e(InterfaceC5827e interfaceC5827e, int i) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC5827e.billing(i);
        Trace.endSection();
        this.f34987e.purchase++;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public final boolean mo4075e() {
        boolean z;
        C16975e c16975e = this.f34973e;
        long j = this.f31452e;
        if (j != -9223372036854775807L) {
            if (this.f34996e + 1 + j <= Long.MAX_VALUE - (this.f35007e.metrica + j)) {
                z = false;
                return this.f31457e == null || this.f31431e || this.f31467e || (c16975e != null && c16975e.admob > 0) || z || this.f35007e.appmetrica != -9223372036854775807L;
            }
        }
        z = true;
        if (this.f31457e == null) {
        }
    }

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public final boolean m4076e(C10643e c10643e) {
        if (this.f31453e != null) {
            return true;
        }
        Surface surface = this.f31475e;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && c10643e.yandex) || m4089e(c10643e);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        if ((r7 + 1) < 8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        if (r7 < 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        r2 = ((defpackage.C17569e) r3.get(r7)).vip.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // defpackage.AbstractC17844e
    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo4077e(defpackage.C7507e r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15960e.mo4077e(eؚ۠ۢ):boolean");
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public final boolean mo4078e(C10643e c10643e) {
        return m4076e(c10643e);
    }

    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public final void m4079e() {
        InterfaceC5827e interfaceC5827e;
        if (this.f31467e && (interfaceC5827e = this.f34976e) != null) {
            this.f31462e = new C6321e(this, interfaceC5827e);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                interfaceC5827e.ad(bundle);
            }
        }
    }

    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public final boolean m4080e(C7507e c7507e) {
        if (billing() || c7507e.metrica(536870912)) {
            return true;
        }
        long j = this.f31452e;
        return j == -9223372036854775807L || j - (c7507e.f15301e - this.f35007e.metrica) <= 100000;
    }

    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public final void m4081e(int i, int i2) {
        C11387e c11387e = this.f34987e;
        c11387e.yandex += i;
        int i3 = i + i2;
        c11387e.billing += i3;
        this.f31468e += i3;
        int i4 = this.f31465e + i3;
        this.f31465e = i4;
        c11387e.startapp = Math.max(i4, c11387e.startapp);
        int i5 = this.f31456e;
        if (i5 <= 0 || this.f31468e < i5) {
            return;
        }
        m4088e();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, eٍؙِ, java.lang.Object] */
    /* renamed from: eَٖٓ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface m4082e(defpackage.C10643e r6) {
        /*
            r5 = this;
            eؙؕٗ r0 = r5.f31453e
            if (r0 == 0) goto L9
            android.view.Surface r6 = r0.getInputSurface()
            return r6
        L9:
            android.view.Surface r0 = r5.f31475e
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r6.yandex
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r5.m4089e(r6)
            defpackage.AbstractC2301e.subscription(r0)
            eًۘۗ r0 = r5.f31445e
            if (r0 == 0) goto L32
            boolean r1 = r0.f16655e
            boolean r3 = r6.purchase
            if (r1 == r3) goto L32
            if (r0 == 0) goto L32
            r0.release()
            r5.f31445e = r2
        L32:
            eًۘۗ r0 = r5.f31445e
            if (r0 != 0) goto Lab
            android.content.Context r0 = r5.f31440e
            boolean r6 = r6.purchase
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L47
            boolean r0 = defpackage.C8174e.vip(r0)
            if (r0 == 0) goto L45
            goto L49
        L45:
            r0 = r2
            goto L4a
        L47:
            int r0 = defpackage.C8174e.f16652e
        L49:
            r0 = r1
        L4a:
            defpackage.AbstractC2301e.subscription(r0)
            eٍؙِ r0 = new eٍؙِ
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3)
            if (r6 == 0) goto L59
            int r6 = defpackage.C8174e.f16652e
            goto L5a
        L59:
            r6 = r2
        L5a:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.f23238e = r3
            eؘؚۧ r4 = new eؘؚۧ
            r4.<init>(r3)
            r0.f23240e = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.f23238e     // Catch: java.lang.Throwable -> L89
            android.os.Message r6 = r3.obtainMessage(r1, r6, r2)     // Catch: java.lang.Throwable -> L89
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L89
        L79:
            eًۘۗ r6 = r0.f23236e     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.RuntimeException r6 = r0.f23239e     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.Error r6 = r0.f23237e     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            r0.wait()     // Catch: java.lang.Throwable -> L89 java.lang.InterruptedException -> L8b
            goto L79
        L89:
            r6 = move-exception
            goto La9
        L8b:
            r2 = r1
            goto L79
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L97
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L97:
            java.lang.RuntimeException r6 = r0.f23239e
            if (r6 != 0) goto La8
            java.lang.Error r6 = r0.f23237e
            if (r6 != 0) goto La7
            eًۘۗ r6 = r0.f23236e
            r6.getClass()
            r5.f31445e = r6
            goto Lab
        La7:
            throw r6
        La8:
            throw r6
        La9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            throw r6
        Lab:
            eًۘۗ r6 = r5.f31445e
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15960e.m4082e(eَۥؒ):android.view.Surface");
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public final boolean mo4083e() {
        C10643e c10643e = this.f34975e;
        if (this.f31453e != null && c10643e != null) {
            String str = c10643e.ad;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.mo4083e();
    }

    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public final void m4084e(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f31475e;
        C10312e c10312e = this.f31474e;
        if (surface2 == surface) {
            if (surface != null) {
                C2351e c2351e = this.f31459e;
                if (c2351e != null) {
                    c10312e.m2795goto(c2351e);
                }
                Surface surface3 = this.f31475e;
                if (surface3 == null || !this.f31463e || (handler = (Handler) c10312e.f20361e) == null) {
                    return;
                }
                handler.post(new RunnableC5316e(2, SystemClock.elapsedRealtime(), c10312e, surface3));
                return;
            }
            return;
        }
        this.f31475e = surface;
        InterfaceC6175e interfaceC6175e = this.f31453e;
        C11122e c11122e = this.f31450e;
        if (interfaceC6175e == null) {
            c11122e.billing(surface);
        }
        this.f31463e = false;
        int i = this.f1500e;
        InterfaceC5827e interfaceC5827e = this.f34976e;
        if (interfaceC5827e != null && this.f31453e == null) {
            C10643e c10643e = this.f34975e;
            c10643e.getClass();
            if (!m4076e(c10643e) || this.f31473e) {
                m4463volatile();
                m4459super();
            } else {
                Surface m4082e = m4082e(c10643e);
                if (m4082e != null) {
                    interfaceC5827e.admob(m4082e);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    interfaceC5827e.mopub();
                }
            }
        }
        if (surface != null) {
            C2351e c2351e2 = this.f31459e;
            if (c2351e2 != null) {
                c10312e.m2795goto(c2351e2);
            }
        } else {
            this.f31459e = null;
            InterfaceC6175e interfaceC6175e2 = this.f31453e;
            if (interfaceC6175e2 != null) {
                interfaceC6175e2.mopub();
            }
        }
        if (i == 2) {
            InterfaceC6175e interfaceC6175e3 = this.f31453e;
            if (interfaceC6175e3 != null) {
                interfaceC6175e3.admob(true);
            } else {
                c11122e.metrica(true);
            }
        }
        m4079e();
    }

    /* renamed from: eؙِۡ, reason: contains not printable characters */
    public final void m4085e(long j) {
        C11387e c11387e = this.f34987e;
        c11387e.mopub += j;
        c11387e.advert++;
        this.f31447e += j;
        this.f31449e++;
    }

    /* renamed from: eّْٝ, reason: contains not printable characters */
    public final boolean m4086e(long j, long j2, boolean z, boolean z2) {
        if (this.f31453e != null && this.f31460e) {
            j2 -= -this.f31437e;
        }
        if (j < -500000 && !z) {
            InterfaceC4543e interfaceC4543e = this.f1503e;
            interfaceC4543e.getClass();
            int amazon = interfaceC4543e.amazon(j2 - this.f1501e);
            if (amazon != 0) {
                this.f31464e = j2;
                PriorityQueue priorityQueue = this.f31466e;
                if (z2) {
                    C11387e c11387e = this.f34987e;
                    int i = c11387e.license + amazon;
                    c11387e.license = i;
                    c11387e.purchase += this.f31470e;
                    c11387e.license = priorityQueue.size() + i;
                } else {
                    this.f34987e.adcel++;
                    m4081e(priorityQueue.size() + amazon, this.f31470e);
                }
                if (this.f34976e != null) {
                    if (mo4083e()) {
                        m4463volatile();
                        m4459super();
                    } else if (mo4075e()) {
                        m4461throw();
                    } else {
                        this.f34955e = true;
                    }
                }
                InterfaceC6175e interfaceC6175e = this.f31453e;
                if (interfaceC6175e != null) {
                    interfaceC6175e.amazon(false);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public final void m4087e(C18208e c18208e) {
        AbstractC6690e abstractC6690e = this.f1499e;
        if (abstractC6690e.Signature()) {
            this.f31452e = -9223372036854775807L;
            return;
        }
        int vip = abstractC6690e.vip(c18208e.ad);
        if (vip == -1) {
            this.f31452e = -9223372036854775807L;
        } else {
            this.f31452e = abstractC6690e.purchase(vip, new C6158e(), false).license;
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: eّٔؖ */
    public final int mo2725e(C2282e c2282e, C16975e c16975e) {
        boolean z;
        int i = 0;
        if (!AbstractC8542e.smaato(c16975e.loadAd)) {
            return AbstractC0054e.tapsense(0, 0, 0, 0);
        }
        int i2 = 1;
        boolean z2 = c16975e.remoteconfig != null;
        Context context = this.f31440e;
        List m4072e = m4072e(context, c2282e, c16975e, z2, false);
        if (z2 && m4072e.isEmpty()) {
            m4072e = m4072e(context, c2282e, c16975e, false, false);
        }
        if (m4072e.isEmpty()) {
            return AbstractC0054e.tapsense(1, 0, 0, 0);
        }
        int i3 = c16975e.f33278break;
        if (i3 != 0 && i3 != 2) {
            return AbstractC0054e.tapsense(2, 0, 0, 0);
        }
        C10643e c10643e = (C10643e) m4072e.get(0);
        boolean appmetrica = c10643e.appmetrica(context, c16975e);
        if (!appmetrica) {
            for (int i4 = 1; i4 < m4072e.size(); i4++) {
                C10643e c10643e2 = (C10643e) m4072e.get(i4);
                if (c10643e2.appmetrica(context, c16975e)) {
                    z = false;
                    appmetrica = true;
                    c10643e = c10643e2;
                    break;
                }
            }
        }
        z = true;
        int i5 = appmetrica ? 4 : 3;
        int i6 = c10643e.purchase(c16975e) ? 16 : 8;
        int i7 = c10643e.billing ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(c16975e.loadAd) && !AbstractC11815e.subscription(context)) {
            i8 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (appmetrica) {
            List m4072e2 = m4072e(context, c2282e, c16975e, z2, true);
            if (!m4072e2.isEmpty()) {
                HashMap hashMap = AbstractC7473e.ad;
                ArrayList arrayList = new ArrayList(m4072e2);
                Collections.sort(arrayList, new C15401e(i2, new C11565e(context, c16975e)));
                C10643e c10643e3 = (C10643e) arrayList.get(0);
                if (c10643e3.appmetrica(context, c16975e) && c10643e3.purchase(c16975e)) {
                    i = 32;
                }
            }
        }
        return i5 | i6 | i | i7 | i8;
    }

    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public final void m4088e() {
        if (this.f31468e > 0) {
            this.f1505e.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f31458e;
            int i = this.f31468e;
            C10312e c10312e = this.f31474e;
            Handler handler = (Handler) c10312e.f20361e;
            if (handler != null) {
                handler.post(new RunnableC16492e(c10312e, i, j));
            }
            this.f31468e = 0;
            this.f31458e = elapsedRealtime;
        }
    }

    /* renamed from: eؘٖؗ, reason: contains not printable characters */
    public final boolean m4089e(C10643e c10643e) {
        if (this.f31467e || m4073e(c10643e.ad)) {
            return false;
        }
        return !c10643e.purchase || C8174e.vip(this.f31440e);
    }

    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public final void m4090e(InterfaceC5827e interfaceC5827e, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC5827e.advert(i, j);
        Trace.endSection();
        this.f34987e.appmetrica++;
        this.f31465e = 0;
        if (this.f31453e == null) {
            C2351e c2351e = this.f31433e;
            boolean equals = c2351e.equals(C2351e.license);
            C10312e c10312e = this.f31474e;
            if (!equals && !c2351e.equals(this.f31459e)) {
                this.f31459e = c2351e;
                c10312e.m2795goto(c2351e);
            }
            C11122e c11122e = this.f31450e;
            boolean z = c11122e.appmetrica != 3;
            c11122e.appmetrica = 3;
            c11122e.advert.getClass();
            c11122e.billing = AbstractC9413e.m2546case(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f31475e) == null) {
                return;
            }
            Handler handler = (Handler) c10312e.f20361e;
            if (handler != null) {
                handler.post(new RunnableC5316e(2, SystemClock.elapsedRealtime(), c10312e, surface));
            }
            this.f31463e = true;
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: finally */
    public final boolean mo2726finally(long j, long j2, InterfaceC5827e interfaceC5827e, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C16975e c16975e) {
        int i4;
        interfaceC5827e.getClass();
        long j4 = j3 - this.f35007e.metrica;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f31466e;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        m4081e(i5, 0);
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e != null) {
            if (!z || z2) {
                return interfaceC6175e.advert(j3, new C11418e(this, interfaceC5827e, i, j4));
            }
            m4074e(interfaceC5827e, i);
            return true;
        }
        int ad = this.f31450e.ad(j3, j, j2, this.f35007e.vip, z, z2, this.f31446e);
        C18506e c18506e = this.f31446e;
        C8034e c8034e = this.f31461e;
        if (c8034e != null && ad != 5 && ad != 4) {
            c8034e.ad(j3, c18506e.ad);
        }
        if (ad == 0) {
            this.f1505e.getClass();
            long nanoTime = System.nanoTime();
            InterfaceC17077e interfaceC17077e = this.f31451e;
            if (interfaceC17077e != null) {
                interfaceC17077e.vip(j4, nanoTime, c16975e, this.f35011e);
            }
            m4090e(interfaceC5827e, i, nanoTime);
            m4085e(c18506e.ad);
            return true;
        }
        if (ad == 1) {
            long j5 = c18506e.vip;
            long j6 = c18506e.ad;
            if (j5 == this.f31454e) {
                m4074e(interfaceC5827e, i);
            } else {
                InterfaceC17077e interfaceC17077e2 = this.f31451e;
                if (interfaceC17077e2 != null) {
                    i4 = i;
                    interfaceC17077e2.vip(j4, j5, c16975e, this.f35011e);
                } else {
                    i4 = i;
                }
                m4090e(interfaceC5827e, i4, j5);
            }
            m4085e(j6);
            this.f31454e = j5;
            return true;
        }
        if (ad == 2) {
            Trace.beginSection("dropVideoBuffer");
            interfaceC5827e.billing(i);
            Trace.endSection();
            m4081e(0, 1);
            m4085e(c18506e.ad);
            return true;
        }
        if (ad == 3) {
            m4074e(interfaceC5827e, i);
            m4085e(c18506e.ad);
            return true;
        }
        if (ad == 4 || ad == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(ad));
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: for */
    public final void mo2727for() {
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e != null) {
            interfaceC6175e.startapp();
        } else {
            long j = this.f35007e.appmetrica;
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: goto, reason: not valid java name */
    public final C6876e mo4091goto(IllegalStateException illegalStateException, C10643e c10643e) {
        Surface surface = this.f31475e;
        C6876e c6876e = new C6876e(illegalStateException, c10643e);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c6876e;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: implements */
    public final C2532e mo2728implements(C10643e c10643e, C16975e c16975e, MediaCrypto mediaCrypto, float f) {
        C14754e c14754e;
        int i;
        C3900e c3900e;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i2;
        int i3;
        char c;
        boolean z;
        Pair vip;
        int m4070e;
        String str = c10643e.metrica;
        C16975e[] c16975eArr = this.f1493e;
        c16975eArr.getClass();
        int i4 = c16975e.tapsense;
        float f2 = c16975e.applovin;
        C14754e c14754e2 = c16975e.firebase;
        int i5 = c16975e.isVip;
        int m4071e = m4071e(c10643e, c16975e);
        if (c16975eArr.length == 1) {
            if (m4071e != -1 && (m4070e = m4070e(c10643e, c16975e)) != -1) {
                m4071e = Math.min((int) (m4071e * 1.5f), m4070e);
            }
            c3900e = new C3900e(i4, i5, m4071e, 5);
            c14754e = c14754e2;
            i = i5;
        } else {
            int length = c16975eArr.length;
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z2 = false;
            while (i8 < length) {
                C16975e c16975e2 = c16975eArr[i8];
                C16975e[] c16975eArr2 = c16975eArr;
                if (c14754e2 != null && c16975e2.firebase == null) {
                    C11445e ad = c16975e2.ad();
                    ad.crashlytics = c14754e2;
                    c16975e2 = new C16975e(ad);
                }
                C4268e vip2 = c10643e.vip(c16975e, c16975e2);
                int i9 = length;
                int i10 = c16975e2.isVip;
                if (vip2.license != 0) {
                    int i11 = c16975e2.tapsense;
                    i3 = i8;
                    c = 65535;
                    z2 |= i11 == -1 || i10 == -1;
                    i6 = Math.max(i6, i11);
                    i7 = Math.max(i7, i10);
                    m4071e = Math.max(m4071e, m4071e(c10643e, c16975e2));
                } else {
                    i3 = i8;
                    c = 65535;
                }
                length = i9;
                i8 = i3 + 1;
                c16975eArr = c16975eArr2;
            }
            if (z2) {
                AbstractC2803e.smaato("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i6 + "x" + i7);
                boolean z3 = i5 > i4;
                int i12 = z3 ? i5 : i4;
                boolean z4 = z3;
                int i13 = z3 ? i4 : i5;
                float f3 = i13 / i12;
                int i14 = 0;
                while (true) {
                    c14754e = c14754e2;
                    if (i14 >= 9) {
                        break;
                    }
                    int i15 = f31429e[i14];
                    int i16 = i14;
                    int i17 = (int) (i15 * f3);
                    if (i15 <= i12 || i17 <= i13) {
                        break;
                    }
                    if (!z4) {
                        i17 = i15;
                    }
                    if (!z4) {
                        i15 = i17;
                    }
                    int i18 = i13;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = c10643e.license;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i2 = i12;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i2 = i12;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(AbstractC9413e.billing(i17, widthAlignment) * widthAlignment, AbstractC9413e.billing(i15, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i = i5;
                        if (c10643e.billing(f2, point.x, point.y)) {
                            break;
                        }
                    } else {
                        i = i5;
                    }
                    i14 = i16 + 1;
                    i5 = i;
                    c14754e2 = c14754e;
                    i13 = i18;
                    i12 = i2;
                }
                i = i5;
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    C11445e ad2 = c16975e.ad();
                    ad2.signatures = i6;
                    ad2.tapsense = i7;
                    m4071e = Math.max(m4071e, m4070e(c10643e, new C16975e(ad2)));
                    AbstractC2803e.smaato("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i6 + "x" + i7);
                }
            } else {
                c14754e = c14754e2;
                i = i5;
            }
            c3900e = new C3900e(i6, i7, m4071e, 5);
        }
        this.f31432e = c3900e;
        int i19 = this.f31467e ? this.f31443e : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i);
        AbstractC5297e.metrica(mediaFormat, c16975e.subscription);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        AbstractC5297e.vip(mediaFormat, "rotation-degrees", c16975e.ads);
        if (c14754e != null) {
            C14754e c14754e3 = c14754e;
            AbstractC5297e.vip(mediaFormat, "color-transfer", c14754e3.metrica);
            AbstractC5297e.vip(mediaFormat, "color-standard", c14754e3.ad);
            AbstractC5297e.vip(mediaFormat, "color-range", c14754e3.vip);
            byte[] bArr = c14754e3.license;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c16975e.loadAd) && (vip = AbstractC13612e.vip(c16975e)) != null) {
            AbstractC5297e.vip(mediaFormat, "profile", ((Integer) vip.first).intValue());
        }
        mediaFormat.setInteger("max-width", c3900e.vip);
        mediaFormat.setInteger("max-height", c3900e.metrica);
        AbstractC5297e.vip(mediaFormat, "max-input-size", c3900e.license);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.f31442e) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f31441e));
        }
        firebase(mediaFormat);
        Surface m4082e = m4082e(c10643e);
        if (this.f31453e != null && !AbstractC9413e.m2562protected(this.f31440e)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new C2532e(c10643e, mediaFormat, c16975e, m4082e, mediaCrypto, (Object) null);
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: import */
    public final void mo2729import(String str) {
        C10312e c10312e = this.f31474e;
        Handler handler = (Handler) c10312e.f20361e;
        if (handler != null) {
            handler.post(new RunnableC11247e(c10312e, str, 20));
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: instanceof */
    public final C4268e mo2730instanceof(C13391e c13391e) {
        C4268e mo2730instanceof = super.mo2730instanceof(c13391e);
        C16975e c16975e = (C16975e) c13391e.f26644e;
        c16975e.getClass();
        C10312e c10312e = this.f31474e;
        Handler handler = (Handler) c10312e.f20361e;
        if (handler != null) {
            handler.post(new RunnableC9527e(11, c10312e, c16975e, mo2730instanceof));
        }
        C8034e c8034e = this.f31461e;
        if (c8034e != null) {
            c8034e.vip();
        }
        return mo2730instanceof;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: interface */
    public final C4268e mo2731interface(C10643e c10643e, C16975e c16975e, C16975e c16975e2) {
        int i;
        C4268e vip = c10643e.vip(c16975e, c16975e2);
        int i2 = vip.appmetrica;
        C3900e c3900e = this.f31432e;
        c3900e.getClass();
        if (c16975e2.tapsense > c3900e.vip || c16975e2.isVip > c3900e.metrica) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (m4071e(c10643e, c16975e2) > c3900e.license) {
            i2 |= 64;
        }
        if (this.f31455e != Integer.MIN_VALUE) {
            float f = c16975e.applovin;
            if (f != -1.0f) {
                float f2 = c16975e2.applovin;
                if (f2 != -1.0f && Math.abs(f2 - f) > 1.0f && ((i = Build.VERSION.SDK_INT) < 30 || (i == 30 && Build.MODEL.startsWith("MiTV")))) {
                    i2 |= 65536;
                }
            }
        }
        int i3 = i2;
        return new C4268e(c10643e.ad, c16975e, c16975e2, i3 != 0 ? 0 : vip.license, i3);
    }

    @Override // defpackage.AbstractC0241e
    public final void loadAd() {
        this.f31468e = 0;
        this.f1505e.getClass();
        this.f31458e = SystemClock.elapsedRealtime();
        this.f31447e = 0L;
        this.f31449e = 0;
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e != null) {
            interfaceC6175e.metrica();
        } else {
            this.f31450e.license();
        }
    }

    @Override // defpackage.AbstractC0241e
    public final void metrica() {
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e == null) {
            C11122e c11122e = this.f31450e;
            if (c11122e.appmetrica == 0) {
                c11122e.appmetrica = 1;
                return;
            }
            return;
        }
        int i = this.f31439e;
        if (i == 0 || i == 1) {
            this.f31439e = 0;
        } else {
            interfaceC6175e.tapsense();
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, eُۥۦ] */
    @Override // defpackage.AbstractC0241e
    public final void mopub(boolean z, boolean z2) {
        InterfaceC6175e interfaceC6175e;
        this.f34987e = new Object();
        C11443e c11443e = this.f1502e;
        c11443e.getClass();
        boolean z3 = c11443e.vip;
        AbstractC2301e.subscription((z3 && this.f31443e == 0) ? false : true);
        if (this.f31467e != z3) {
            this.f31467e = z3;
            m4463volatile();
        }
        C11387e c11387e = this.f34987e;
        C10312e c10312e = this.f31474e;
        Handler handler = (Handler) c10312e.f20361e;
        if (handler != null) {
            handler.post(new RunnableC14733e(c10312e, c11387e, 0));
        }
        boolean z4 = this.f31448e;
        C11122e c11122e = this.f31450e;
        if (!z4) {
            if (this.f31434e != null && this.f31453e == null) {
                C18022e c18022e = new C18022e(this.f31440e, c11122e);
                c18022e.license = true;
                long j = this.f31438e;
                c18022e.billing = j != -9223372036854775807L ? -j : -9223372036854775807L;
                C17381e c17381e = this.f1505e;
                c17381e.getClass();
                c18022e.appmetrica = c17381e;
                AbstractC2301e.subscription(!c18022e.purchase);
                if (c18022e.metrica == null) {
                    c18022e.metrica = new C4866e();
                }
                C10767e c10767e = new C10767e(c18022e);
                c18022e.purchase = true;
                if (1 >= c10767e.Signature) {
                    c10767e.Signature = 1;
                }
                SparseArray sparseArray = c10767e.metrica;
                if (AbstractC9413e.advert(sparseArray, 0)) {
                    interfaceC6175e = (InterfaceC6175e) sparseArray.get(0);
                } else {
                    C9928e c9928e = new C9928e(c10767e, c10767e.ad);
                    c10767e.billing.add(c9928e);
                    sparseArray.put(0, c9928e);
                    interfaceC6175e = c9928e;
                }
                this.f31453e = interfaceC6175e;
            }
            this.f31448e = true;
        }
        InterfaceC6175e interfaceC6175e2 = this.f31453e;
        if (interfaceC6175e2 == null) {
            C17381e c17381e2 = this.f1505e;
            c17381e2.getClass();
            c11122e.advert = c17381e2;
            c11122e.appmetrica(!z2 ? 1 : 0);
            return;
        }
        interfaceC6175e2.appmetrica(new C16089e(this));
        InterfaceC17077e interfaceC17077e = this.f31451e;
        if (interfaceC17077e != null) {
            this.f31453e.remoteconfig(interfaceC17077e);
        }
        if (this.f31475e != null && !this.f31471e.equals(C8795e.metrica)) {
            this.f31453e.signatures(this.f31475e, this.f31471e);
        }
        this.f31453e.adcel(this.f31455e);
        this.f31453e.purchase(this.f34953e);
        List list = this.f31434e;
        if (list != null) {
            this.f31453e.loadAd(list);
        }
        this.f31439e = !z2 ? 1 : 0;
        this.f34972e = true;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: package */
    public final void mo2732package(String str, long j, long j2) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C10312e c10312e = this.f31474e;
        Handler handler = (Handler) c10312e.f20361e;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC10239e(c10312e, str2, j, j2, 2));
        } else {
            str2 = str;
        }
        this.f31473e = m4073e(str2);
        C10643e c10643e = this.f34975e;
        c10643e.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(c10643e.vip)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c10643e.license;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f31472e = z;
        m4079e();
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: private */
    public final void mo2733private(Exception exc) {
        AbstractC2803e.billing("MediaCodecVideoRenderer", "Video codec error", exc);
        C10312e c10312e = this.f31474e;
        Handler handler = (Handler) c10312e.f20361e;
        if (handler != null) {
            handler.post(new RunnableC11247e(c10312e, exc, 19));
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: protected */
    public final float mo2734protected(float f, C16975e c16975e, C16975e[] c16975eArr) {
        C10643e c10643e;
        float f2 = -1.0f;
        for (C16975e c16975e2 : c16975eArr) {
            float f3 = c16975e2.applovin;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.f31457e == null || (c10643e = this.f34975e) == null) {
            return f4;
        }
        int i = c16975e.tapsense;
        int i2 = c16975e.isVip;
        float f5 = -3.4028235E38f;
        if (c10643e.startapp) {
            float f6 = c10643e.advert;
            if (f6 != -3.4028235E38f && c10643e.adcel == i && c10643e.mopub == i2) {
                f5 = f6;
            } else {
                float f7 = 1024.0f;
                if (!c10643e.billing(1024.0f, i, i2)) {
                    f5 = 0.0f;
                    while (true) {
                        float f8 = f7 - f5;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f5;
                        if (c10643e.billing(f9, i, i2)) {
                            f5 = f9;
                        } else {
                            f7 = f9;
                        }
                    }
                } else {
                    f5 = 1024.0f;
                }
                c10643e.advert = f5;
                c10643e.adcel = i;
                c10643e.mopub = i2;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: public, reason: not valid java name */
    public final void mo4092public() {
        super.mo4092public();
        this.f31466e.clear();
        this.f31470e = 0;
        this.f31435e = 0;
        this.f31431e = false;
        C16911e c16911e = this.f31444e;
        if (c16911e != null) {
            c16911e.f33136e = null;
            ByteBuffer byteBuffer = (ByteBuffer) c16911e.f33137e;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // defpackage.AbstractC0241e
    public final String purchase() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.AbstractC0241e
    public final void remoteconfig() {
        C18208e c18208e = this.f1497e;
        if (c18208e != null) {
            m4087e(c18208e);
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: return, reason: not valid java name */
    public final void mo4093return(long j) {
        super.mo4093return(j);
        if (this.f31467e) {
            return;
        }
        this.f31470e--;
    }

    @Override // defpackage.AbstractC17844e, defpackage.AbstractC0241e
    public final void signatures(long j, long j2) {
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e != null) {
            try {
                interfaceC6175e.Signature(j, j2);
            } catch (C4087e e) {
                throw vip(e, e.f9044e, false, 7001);
            }
        }
        super.signatures(j, j2);
    }

    @Override // defpackage.AbstractC0241e
    public final void smaato() {
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e == null || !this.f31460e) {
            return;
        }
        interfaceC6175e.release();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r7.f34961e) goto L18;
     */
    @Override // defpackage.AbstractC0241e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startapp() {
        /*
            r7 = this;
            eٌْٗ r0 = r7.f34969e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3e
            boolean r0 = r7.billing()
            if (r0 == 0) goto Lf
            boolean r0 = r7.f1494e
            goto L18
        Lf:
            eؖۨۚ r0 = r7.f1503e
            r0.getClass()
            boolean r0 = r0.license()
        L18:
            if (r0 != 0) goto L3d
            int r0 = r7.f34965e
            if (r0 < 0) goto L20
            r0 = r2
            goto L21
        L20:
            r0 = r1
        L21:
            if (r0 != 0) goto L3d
            long r3 = r7.f34961e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L3e
            eٗۤ٘ r0 = r7.f1505e
            r0.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.f34961e
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L3e
        L3d:
            r1 = r2
        L3e:
            eؙؕٗ r0 = r7.f31453e
            if (r0 == 0) goto L47
            boolean r0 = r0.subscription(r1)
            return r0
        L47:
            if (r1 == 0) goto L52
            eؘۖۡ r0 = r7.f34976e
            if (r0 == 0) goto L51
            boolean r0 = r7.f31467e
            if (r0 == 0) goto L52
        L51:
            return r2
        L52:
            eُٜٛ r0 = r7.f31450e
            boolean r0 = r0.vip(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15960e.startapp():boolean");
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: static */
    public final void mo2735static(C16975e c16975e, MediaFormat mediaFormat) {
        int integer;
        int i;
        InterfaceC5827e interfaceC5827e = this.f34976e;
        if (interfaceC5827e != null) {
            interfaceC5827e.loadAd(this.f31436e);
        }
        if (this.f31467e) {
            i = c16975e.tapsense;
            integer = c16975e.isVip;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = c16975e.premium;
        int i2 = c16975e.ads;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.f31433e = new C2351e(i, f, integer);
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e == null || !this.f31469e) {
            this.f31450e.purchase(c16975e.applovin);
        } else {
            C11445e ad = c16975e.ad();
            ad.signatures = i;
            ad.tapsense = integer;
            ad.ads = f;
            C16975e c16975e2 = new C16975e(ad);
            int i4 = this.f31439e;
            List list = this.f31434e;
            if (list == null) {
                C2171e c2171e = AbstractC17475e.f34223e;
                list = C1410e.f4222e;
            }
            interfaceC6175e.license(c16975e2, this.f35007e.vip, i4, list);
            this.f31439e = 2;
        }
        this.f31469e = false;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: strictfp, reason: not valid java name */
    public final boolean mo4094strictfp(C16975e c16975e) {
        InterfaceC6175e interfaceC6175e = this.f31453e;
        if (interfaceC6175e == null || interfaceC6175e.ad()) {
            return true;
        }
        try {
            return this.f31453e.smaato(c16975e);
        } catch (C4087e e) {
            throw vip(e, c16975e, false, 7000);
        }
    }

    @Override // defpackage.AbstractC17844e, defpackage.AbstractC0241e
    public final void subscription(C16975e[] c16975eArr, long j, long j2, C18208e c18208e) {
        super.subscription(c16975eArr, j, j2, c18208e);
        m4087e(c18208e);
        C8034e c8034e = this.f31461e;
        if (c8034e != null) {
            c8034e.vip();
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: switch, reason: not valid java name */
    public final void mo4095switch(C7507e c7507e) {
        ByteBuffer byteBuffer;
        C16911e c16911e = this.f31444e;
        if (c16911e != null) {
            C10643e c10643e = this.f34975e;
            c10643e.getClass();
            if (c10643e.vip.equals("video/av01") && c7507e.metrica(1) && (byteBuffer = c7507e.f15296e) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) c16911e.f33137e;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.f31435e = 0;
        int mo4096try = mo4096try(c7507e);
        if ((Build.VERSION.SDK_INT < 34 || (mo4096try & 32) == 0) && !this.f31467e) {
            this.f31470e++;
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: transient */
    public final void mo2737transient(C18520e c18520e) {
        C10312e c10312e = this.f31474e;
        Handler handler = (Handler) c10312e.f20361e;
        if (handler != null) {
            handler.post(new RunnableC11247e(c10312e, c18520e, 17));
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: try, reason: not valid java name */
    public final int mo4096try(C7507e c7507e) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f31457e == null && !this.f31467e) || c7507e.f15301e >= this.f1491e || m4080e(c7507e)) ? 0 : 32;
        }
        return 0;
    }

    @Override // defpackage.AbstractC0241e
    public final boolean yandex() {
        if (!this.f34958e) {
            return false;
        }
        InterfaceC6175e interfaceC6175e = this.f31453e;
        return interfaceC6175e == null || interfaceC6175e.billing();
    }
}
