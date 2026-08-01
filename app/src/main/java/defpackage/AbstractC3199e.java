package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3199e implements InterfaceC11754e, InterfaceC2043e {
    public static final C2892e ad = new C2892e(-1282073367, false, new C13060e(9));
    public static final C2892e vip = new C2892e(1815061864, false, new C13060e(10));
    public static final C2892e metrica = new C2892e(715283417, false, new C8171e(0));

    /* renamed from: extends, reason: not valid java name */
    public static final C3229e m1312extends(int i, int i2, C13770e c13770e) {
        final int i3 = 1;
        final byte b = 0;
        final boolean z = (i2 & 1) == 0;
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        Object obj2 = m3681throw;
        if (m3681throw == obj) {
            Object c3685e = new C3685e(13);
            c13770e.m3682throws(c3685e);
            obj2 = c3685e;
        }
        final Function1 function1 = (Function1) obj2;
        int i4 = (i & 14) | 384;
        float f = AbstractC4229e.ad;
        final float f2 = C8464e.metrica;
        final float f3 = C8464e.license;
        final InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
        boolean purchase = c13770e.purchase(interfaceC14388e) | c13770e.metrica(f2);
        Object m3681throw2 = c13770e.m3681throw();
        Object obj3 = m3681throw2;
        if (purchase || m3681throw2 == obj) {
            Object obj4 = new Function0() { // from class: eُۡۤ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float mo497instanceof;
                    switch (b) {
                        case 0:
                            mo497instanceof = interfaceC14388e.mo497instanceof(f2);
                            break;
                        default:
                            mo497instanceof = interfaceC14388e.mo497instanceof(f2);
                            break;
                    }
                    return Float.valueOf(mo497instanceof);
                }
            };
            c13770e.m3682throws(obj4);
            obj3 = obj4;
        }
        final Function0 function0 = (Function0) obj3;
        boolean purchase2 = c13770e.purchase(interfaceC14388e) | c13770e.metrica(f3);
        Object m3681throw3 = c13770e.m3681throw();
        Object obj5 = m3681throw3;
        if (purchase2 || m3681throw3 == obj) {
            Object obj6 = new Function0() { // from class: eُۡۤ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float mo497instanceof;
                    switch (i3) {
                        case 0:
                            mo497instanceof = interfaceC14388e.mo497instanceof(f3);
                            break;
                        default:
                            mo497instanceof = interfaceC14388e.mo497instanceof(f3);
                            break;
                    }
                    return Float.valueOf(mo497instanceof);
                }
            };
            c13770e.m3682throws(obj6);
            obj5 = obj6;
        }
        final Function0 function02 = (Function0) obj5;
        Object[] objArr = {Boolean.valueOf(z), function1, Boolean.FALSE};
        C11883e c11883e = new C11883e(new C14151e(b, 5), new C1510e(z, function0, function02, function1), 15);
        if ((((i4 & 14) ^ 6) <= 4 || !c13770e.billing(z)) && (i4 & 6) != 4) {
            i3 = 0;
        }
        int i5 = (c13770e.purchase(function0) ? 1 : 0) | i3 | (c13770e.purchase(function02) ? 1 : 0) | (c13770e.purchase(function1) ? 1 : 0) | (c13770e.billing(false) ? 1 : 0);
        Object m3681throw4 = c13770e.m3681throw();
        if (i5 != 0 || m3681throw4 == obj) {
            final EnumC8613e enumC8613e = EnumC8613e.f17430e;
            Object obj7 = new Function0() { // from class: eٌۛ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new C3229e(z, function0, function02, enumC8613e, function1);
                }
            };
            c13770e.m3682throws(obj7);
            m3681throw4 = obj7;
        }
        return (C3229e) AbstractC10510e.appmetrica(objArr, c11883e, (Function0) m3681throw4, c13770e, 0);
    }

    /* renamed from: goto, reason: not valid java name */
    public static final void m1313goto(final int i, final InterfaceC12864e interfaceC12864e, final long j, long j2, Function2 function2, Function4 function4, final C2892e c2892e, C13770e c13770e, final int i2) {
        int i3;
        long j3;
        final long j4;
        final Function2 function22;
        final Function4 function42;
        long appmetrica;
        Function4 license;
        int i4;
        Function2 function23;
        c13770e.m3671package(590005957);
        if ((i2 & 6) == 0) {
            i3 = (c13770e.license(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            j3 = j;
            i3 |= c13770e.appmetrica(j3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            j3 = j;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        int i5 = i3 | 221184;
        if ((1572864 & i2) == 0) {
            i5 |= c13770e.yandex(c2892e) ? 1048576 : 524288;
        }
        if (c13770e.m3673protected(i5 & 1, (599187 & i5) != 599186)) {
            c13770e.m3655case();
            if ((i2 & 1) == 0 || c13770e.isPro()) {
                C10004e c10004e = C10004e.ad;
                appmetrica = ((C6032e) c13770e.adcel(AbstractC12491e.ad)).appmetrica();
                license = AbstractC16653e.license(20261614, new Function4() { // from class: eؚٖۥ
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        C13770e c13770e2 = (C13770e) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        C5819e c5819e = (C5819e) AbstractC13480e.m3592native(i, (List) obj);
                        if (c5819e == null) {
                            c13770e2.m3676strictfp(-1976546706);
                            c13770e2.Signature(false);
                        } else {
                            c13770e2.m3676strictfp(-1976546705);
                            C10004e.ad.ad(c5819e, booleanValue, null, 0L, 0L, c13770e2, (intValue & 112) | 196608);
                            c13770e2.Signature(false);
                        }
                        return Unit.INSTANCE;
                    }
                }, c13770e);
                i4 = i5 & (-7169);
                function23 = AbstractC13350e.ad;
            } else {
                c13770e.m3659default();
                appmetrica = j2;
                license = function4;
                i4 = i5 & (-7169);
                function23 = function2;
            }
            c13770e.admob();
            C9137e appmetrica2 = AbstractC5967e.appmetrica(c13770e);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            InterfaceC12864e purchase = AbstractC5967e.purchase(AbstractC12447e.metrica(interfaceC12864e), appmetrica2, false);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C13676e(interfaceC3314e, 2);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC11160e.metrica(AbstractC1147e.ad(AbstractC17324e.license(purchase, (Function1) m3681throw2), false, new C7983e(8)), AbstractC10432e.ad, AbstractC6271e.ad(j3, appmetrica, c13770e, ((i4 >> 6) & 14) | 384, 0), AbstractC16653e.license(1744705866, new C12050e(function23, license, interfaceC3314e, c2892e), c13770e), c13770e, 50);
            function22 = function23;
            j4 = appmetrica;
            function42 = license;
        } else {
            c13770e.m3659default();
            j4 = j2;
            function22 = function2;
            function42 = function4;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eّ۟ٔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC3199e.m1313goto(i, interfaceC12864e, j, j4, function22, function42, c2892e, (C13770e) obj, AbstractC5190e.advert(i2 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /* renamed from: interface, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1314interface(final kotlin.jvm.functions.Function0 r29, defpackage.InterfaceC12864e r30, defpackage.C3229e r31, float r32, boolean r33, defpackage.InterfaceC16154e r34, final long r35, long r37, float r39, long r40, kotlin.jvm.functions.Function2 r42, kotlin.jvm.functions.Function2 r43, defpackage.C18280e r44, final defpackage.C2892e r45, defpackage.C13770e r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3199e.m1314interface(kotlin.jvm.functions.Function0, eّۤۧ, eٌؕؖ, float, boolean, eّٖؖ, long, long, float, long, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, eٟٙ, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r2 == 1.0d) goto L16;
     */
    /* renamed from: this, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m1315this(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, defpackage.C16320e r18, int r19, defpackage.C16320e r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = defpackage.AbstractC11815e.firebase(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = defpackage.AbstractC2774e.ad(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = defpackage.AbstractC2774e.vip(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = defpackage.AbstractC13427e.vip(r6)
            r2 = 512(0x200, float:7.175E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = defpackage.AbstractC13427e.ad(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = defpackage.AbstractC2774e.ad(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r8 = r8 & r11
            int r3 = (int) r8
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = defpackage.AbstractC2774e.vip(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = defpackage.AbstractC1561e.license(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = defpackage.AbstractC1561e.license(r2)
            if (r17 == 0) goto L9a
            boolean r2 = defpackage.AbstractC11815e.firebase(r17)
            if (r2 == 0) goto L97
            goto L9a
        L97:
            r2 = r17
            goto L9c
        L9a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9c:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3199e.m1315this(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, eٖٚۢ, int, eٖٚۢ, boolean):android.graphics.Bitmap");
    }

    @Override // defpackage.InterfaceC11754e
    public void Signature() {
    }

    @Override // defpackage.InterfaceC2043e
    public float adcel(C3907e c3907e, int i) {
        return crashlytics();
    }

    @Override // defpackage.InterfaceC11754e
    public InterfaceC11754e admob(InterfaceC9998e interfaceC9998e) {
        return this;
    }

    @Override // defpackage.InterfaceC11754e
    public abstract byte ads();

    @Override // defpackage.InterfaceC2043e
    public byte advert(C3907e c3907e, int i) {
        return ads();
    }

    @Override // defpackage.InterfaceC11754e
    public abstract int amazon();

    @Override // defpackage.InterfaceC2043e
    public boolean applovin(InterfaceC9998e interfaceC9998e, int i) {
        return appmetrica();
    }

    @Override // defpackage.InterfaceC11754e
    public boolean appmetrica() {
        m1316native();
        throw null;
    }

    @Override // defpackage.InterfaceC11754e
    public Object billing(InterfaceC5372e interfaceC5372e) {
        return interfaceC5372e.metrica(this);
    }

    @Override // defpackage.InterfaceC11754e
    /* renamed from: class */
    public double mo501class() {
        m1316native();
        throw null;
    }

    @Override // defpackage.InterfaceC11754e
    public float crashlytics() {
        m1316native();
        throw null;
    }

    @Override // defpackage.InterfaceC2043e
    public long firebase(InterfaceC9998e interfaceC9998e, int i) {
        return tapsense();
    }

    @Override // defpackage.InterfaceC2043e
    public Object inmobi(InterfaceC9998e interfaceC9998e, int i, InterfaceC5372e interfaceC5372e, Object obj) {
        if (interfaceC5372e.appmetrica().metrica() || isVip()) {
            return billing(interfaceC5372e);
        }
        Signature();
        return null;
    }

    @Override // defpackage.InterfaceC11754e
    public boolean isVip() {
        return true;
    }

    @Override // defpackage.InterfaceC2043e
    public InterfaceC11754e license(C3907e c3907e, int i) {
        return admob(c3907e.adcel(i));
    }

    @Override // defpackage.InterfaceC2043e
    public short loadAd(C3907e c3907e, int i) {
        return subs();
    }

    @Override // defpackage.InterfaceC11754e
    public InterfaceC2043e metrica(InterfaceC9998e interfaceC9998e) {
        return this;
    }

    /* renamed from: native, reason: not valid java name */
    public Object m1316native() {
        throw new IllegalArgumentException(AbstractC3820e.ad.vip(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.InterfaceC2043e
    public double premium(InterfaceC9998e interfaceC9998e, int i) {
        return mo501class();
    }

    @Override // defpackage.InterfaceC11754e
    public String pro() {
        m1316native();
        throw null;
    }

    @Override // defpackage.InterfaceC11754e
    public char purchase() {
        m1316native();
        throw null;
    }

    @Override // defpackage.InterfaceC2043e
    public int remoteconfig(InterfaceC9998e interfaceC9998e, int i) {
        return amazon();
    }

    @Override // defpackage.InterfaceC11754e
    public int signatures(InterfaceC9998e interfaceC9998e) {
        m1316native();
        throw null;
    }

    @Override // defpackage.InterfaceC2043e
    public String smaato(InterfaceC9998e interfaceC9998e, int i) {
        return pro();
    }

    @Override // defpackage.InterfaceC2043e
    public char startapp(C3907e c3907e, int i) {
        return purchase();
    }

    @Override // defpackage.InterfaceC11754e
    public abstract short subs();

    public Object subscription(InterfaceC9998e interfaceC9998e, int i, InterfaceC5372e interfaceC5372e, Object obj) {
        return billing(interfaceC5372e);
    }

    @Override // defpackage.InterfaceC11754e
    public abstract long tapsense();

    public void vip(InterfaceC9998e interfaceC9998e) {
    }
}
