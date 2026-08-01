package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1866e implements InterfaceC16984e {
    public final int[] ad;
    public final C9616e adcel;
    public final AbstractC17836e appmetrica;
    public final int[] billing;
    public final int license;
    public final int metrica;
    public final boolean purchase;
    public final int startapp;
    public final Object[] vip;
    public final int yandex;
    public static final int[] mopub = new int[0];
    public static final Unsafe advert = AbstractC1929e.advert();

    public C1866e(int[] iArr, Object[] objArr, int i, int i2, AbstractC17836e abstractC17836e, int[] iArr2, int i3, int i4, C9616e c9616e, C11672e c11672e) {
        this.ad = iArr;
        this.vip = objArr;
        this.metrica = i;
        this.license = i2;
        this.purchase = abstractC17836e instanceof AbstractC15319e;
        this.billing = iArr2;
        this.yandex = i3;
        this.startapp = i4;
        this.adcel = c9616e;
        this.appmetrica = abstractC17836e;
    }

    public static long Signature(long j, Object obj) {
        return ((Long) AbstractC1929e.startapp(j, obj)).longValue();
    }

    public static Field ads(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            AbstractC13501e.Signature(sb, "Field ", str, " for ", name);
            throw new RuntimeException(AbstractC1786e.signatures(sb, " not found. Known fields are ", arrays), e);
        }
    }

    public static int advert(int i) {
        return (i >>> 20) & 255;
    }

    public static void amazon(Object obj) {
        if (!smaato(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C1866e applovin(defpackage.C0537e r35, defpackage.C9616e r36, defpackage.C11672e r37) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1866e.applovin(eؑۙۦ, eٍٝۛ, eُِۘ):eؓٗٓ");
    }

    public static final int inmobi(byte[] bArr, int i, int i2, EnumC11345e enumC11345e, Class cls, C6313e c6313e) {
        EnumC11345e enumC11345e2 = EnumC11345e.f22820e;
        switch (enumC11345e.ordinal()) {
            case 0:
                int i3 = i + 8;
                c6313e.metrica = Double.valueOf(Double.longBitsToDouble(AbstractC9386e.startapp(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                c6313e.metrica = Float.valueOf(Float.intBitsToFloat(AbstractC9386e.yandex(i, bArr)));
                return i4;
            case 2:
            case 3:
                int billing = AbstractC9386e.billing(bArr, i, c6313e);
                c6313e.metrica = Long.valueOf(c6313e.vip);
                return billing;
            case 4:
            case 12:
            case 13:
                int appmetrica = AbstractC9386e.appmetrica(bArr, i, c6313e);
                c6313e.metrica = Integer.valueOf(c6313e.ad);
                return appmetrica;
            case 5:
            case 15:
                int i5 = i + 8;
                c6313e.metrica = Long.valueOf(AbstractC9386e.startapp(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                c6313e.metrica = Integer.valueOf(AbstractC9386e.yandex(i, bArr));
                return i6;
            case 7:
                int billing2 = AbstractC9386e.billing(bArr, i, c6313e);
                c6313e.metrica = Boolean.valueOf(c6313e.vip != 0);
                return billing2;
            case 8:
                return AbstractC9386e.adcel(bArr, i, c6313e);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                InterfaceC16984e ad = C5913e.metrica.ad(cls);
                AbstractC15319e ad2 = ad.ad();
                int advert2 = AbstractC9386e.advert(ad2, ad, bArr, i, i2, c6313e);
                ad.metrica(ad2);
                c6313e.metrica = ad2;
                return advert2;
            case 11:
                return AbstractC9386e.mopub(bArr, i, c6313e);
            case 16:
                int appmetrica2 = AbstractC9386e.appmetrica(bArr, i, c6313e);
                c6313e.metrica = Integer.valueOf(AbstractC3513e.m1368this(c6313e.ad));
                return appmetrica2;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int billing3 = AbstractC9386e.billing(bArr, i, c6313e);
                c6313e.metrica = Long.valueOf(AbstractC3513e.m1367native(c6313e.vip));
                return billing3;
        }
    }

    public static int loadAd(long j, Object obj) {
        return ((Integer) AbstractC1929e.startapp(j, obj)).intValue();
    }

    public static boolean smaato(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC15319e) {
            return ((AbstractC15319e) obj).billing();
        }
        return true;
    }

    @Override // defpackage.InterfaceC16984e
    public final AbstractC15319e ad() {
        return ((AbstractC15319e) this.appmetrica).startapp();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x008c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:167:0x07f3 A[LOOP:1: B:166:0x07f1->B:167:0x07f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x07b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.InterfaceC16984e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void adcel(java.lang.Object r22, defpackage.C11226e r23, defpackage.C17268e r24) {
        /*
            Method dump skipped, instructions count: 2206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1866e.adcel(java.lang.Object, eُؙۙ, eٗۛۤ):void");
    }

    public final boolean admob(AbstractC15319e abstractC15319e, AbstractC15319e abstractC15319e2, int i) {
        return remoteconfig(i, abstractC15319e) == remoteconfig(i, abstractC15319e2);
    }

    @Override // defpackage.InterfaceC16984e
    public final boolean appmetrica(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.yandex) {
            int i6 = this.billing[i3];
            int mopub2 = mopub(i6);
            int[] iArr = this.ad;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = advert.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            Object obj2 = obj;
            if ((268435456 & mopub2) == 0 || subscription(obj2, i6, i, i2, i9)) {
                int advert2 = advert(mopub2);
                if (advert2 == 9 || advert2 == 17) {
                    if (subscription(obj2, i6, i, i2, i9) && !crashlytics(i6).appmetrica(AbstractC1929e.startapp(mopub2 & 1048575, obj2))) {
                    }
                    i3++;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else {
                    if (advert2 != 27) {
                        if (advert2 == 60 || advert2 == 68) {
                            if (signatures(iArr[i6], i6, obj2) && !crashlytics(i6).appmetrica(AbstractC1929e.startapp(mopub2 & 1048575, obj2))) {
                            }
                            i3++;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        } else if (advert2 != 49) {
                            if (advert2 != 50) {
                                continue;
                            } else {
                                C8926e c8926e = (C8926e) AbstractC1929e.startapp(mopub2 & 1048575, obj2);
                                if (!c8926e.isEmpty() && ((EnumC11345e) ((C1102e) firebase(i6)).ad.f29787e).f22824e == EnumC7932e.f16063e) {
                                    InterfaceC16984e interfaceC16984e = null;
                                    for (Object obj3 : c8926e.values()) {
                                        if (interfaceC16984e == null) {
                                            interfaceC16984e = C5913e.metrica.ad(obj3.getClass());
                                        }
                                        if (!interfaceC16984e.appmetrica(obj3)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) AbstractC1929e.startapp(mopub2 & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC16984e crashlytics = crashlytics(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (crashlytics.appmetrica(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0021. Please report as an issue. */
    @Override // defpackage.InterfaceC16984e
    public final int billing(AbstractC15319e abstractC15319e) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.ad.length; i6 += 3) {
            int mopub2 = mopub(i6);
            int advert2 = advert(mopub2);
            if (advert2 <= 50 || advert2 >= 69) {
                long j = mopub2 & 1048575;
                int i7 = 37;
                switch (advert2) {
                    case 0:
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(AbstractC1929e.metrica.adcel(j, abstractC15319e));
                        byte[] bArr = AbstractC17904e.ad;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 1:
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(AbstractC1929e.metrica.purchase(j, abstractC15319e));
                        i5 = i2 + floatToIntBits;
                        break;
                    case 2:
                        i = i5 * 53;
                        doubleToLongBits = AbstractC1929e.billing(j, abstractC15319e);
                        byte[] bArr2 = AbstractC17904e.ad;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 3:
                        i = i5 * 53;
                        doubleToLongBits = AbstractC1929e.billing(j, abstractC15319e);
                        byte[] bArr3 = AbstractC17904e.ad;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 4:
                        i2 = i5 * 53;
                        floatToIntBits = AbstractC1929e.appmetrica(j, abstractC15319e);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 5:
                        i = i5 * 53;
                        doubleToLongBits = AbstractC1929e.billing(j, abstractC15319e);
                        byte[] bArr4 = AbstractC17904e.ad;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 6:
                        i2 = i5 * 53;
                        floatToIntBits = AbstractC1929e.appmetrica(j, abstractC15319e);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 7:
                        i = i5 * 53;
                        boolean license = AbstractC1929e.metrica.license(j, abstractC15319e);
                        byte[] bArr5 = AbstractC17904e.ad;
                        i3 = license ? 1231 : 1237;
                        i5 = i + i3;
                        break;
                    case 8:
                        i2 = i5 * 53;
                        floatToIntBits = ((String) AbstractC1929e.startapp(j, abstractC15319e)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 9:
                        i4 = i5 * 53;
                        Object startapp = AbstractC1929e.startapp(j, abstractC15319e);
                        if (startapp != null) {
                            i7 = startapp.hashCode();
                        }
                        i5 = i4 + i7;
                        break;
                    case 10:
                        i2 = i5 * 53;
                        floatToIntBits = AbstractC1929e.startapp(j, abstractC15319e).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 11:
                        i2 = i5 * 53;
                        floatToIntBits = AbstractC1929e.appmetrica(j, abstractC15319e);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 12:
                        i2 = i5 * 53;
                        floatToIntBits = AbstractC1929e.appmetrica(j, abstractC15319e);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 13:
                        i2 = i5 * 53;
                        floatToIntBits = AbstractC1929e.appmetrica(j, abstractC15319e);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 14:
                        i = i5 * 53;
                        doubleToLongBits = AbstractC1929e.billing(j, abstractC15319e);
                        byte[] bArr6 = AbstractC17904e.ad;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 15:
                        i2 = i5 * 53;
                        floatToIntBits = AbstractC1929e.appmetrica(j, abstractC15319e);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 16:
                        i = i5 * 53;
                        doubleToLongBits = AbstractC1929e.billing(j, abstractC15319e);
                        byte[] bArr7 = AbstractC17904e.ad;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        i4 = i5 * 53;
                        Object startapp2 = AbstractC1929e.startapp(j, abstractC15319e);
                        if (startapp2 != null) {
                            i7 = startapp2.hashCode();
                        }
                        i5 = i4 + i7;
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    case 48:
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        i2 = i5 * 53;
                        floatToIntBits = AbstractC1929e.startapp(j, abstractC15319e).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        i2 = i5 * 53;
                        floatToIntBits = AbstractC1929e.startapp(j, abstractC15319e).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                }
            }
        }
        int i8 = this.startapp;
        while (true) {
            int[] iArr = this.billing;
            if (i8 >= iArr.length) {
                return abstractC15319e.zzc.hashCode() + (i5 * 53);
            }
            if (!signatures(0, iArr[i8], abstractC15319e)) {
                i5 = AbstractC1929e.startapp(mopub(r3) & 1048575, abstractC15319e).hashCode() + (i5 * 53);
            }
            i8++;
        }
    }

    /* renamed from: class, reason: not valid java name */
    public final InterfaceC3043e m698class(int i) {
        int i2 = i / 3;
        return (InterfaceC3043e) this.vip[i2 + i2 + 1];
    }

    public final InterfaceC16984e crashlytics(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.vip;
        InterfaceC16984e interfaceC16984e = (InterfaceC16984e) objArr[i3];
        if (interfaceC16984e != null) {
            return interfaceC16984e;
        }
        InterfaceC16984e ad = C5913e.metrica.ad((Class) objArr[i3 + 1]);
        objArr[i3] = ad;
        return ad;
    }

    /* renamed from: extends, reason: not valid java name */
    public final Object m699extends(Object obj, int i, Object obj2, C9616e c9616e, Object obj3) {
        InterfaceC3043e m698class;
        int i2 = this.ad[i];
        Object startapp = AbstractC1929e.startapp(mopub(i) & 1048575, obj);
        if (startapp == null || (m698class = m698class(i)) == null) {
            return obj2;
        }
        C15024e c15024e = ((C1102e) firebase(i)).ad;
        Iterator it = ((C8926e) startapp).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!m698class.ad(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    c9616e.getClass();
                    obj2 = C9616e.subscription(obj3);
                }
                int vip = C1102e.vip(c15024e, entry.getKey(), entry.getValue());
                C10553e c10553e = AbstractC7244e.f14800e;
                byte[] bArr = new byte[vip];
                boolean z = AbstractC13874e.metrica;
                C2749e c2749e = new C2749e(vip, bArr);
                try {
                    C1102e.ad(c2749e, c15024e, entry.getKey(), entry.getValue());
                    if (c2749e.m1203try() > 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    if (c2749e.m1203try() < 0) {
                        throw new IllegalStateException("Wrote more data than expected.");
                    }
                    C10553e c10553e2 = new C10553e(bArr);
                    c9616e.getClass();
                    ((C2370e) obj2).license((i2 << 3) | 2, c10553e2);
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    public final Object firebase(int i) {
        int i2 = i / 3;
        return this.vip[i2 + i2];
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m700goto(int i, Object obj, Object obj2) {
        advert.putObject(obj, mopub(i) & 1048575, obj2);
        pro(i, obj);
    }

    /* renamed from: interface, reason: not valid java name */
    public final Object m701interface(int i, Object obj) {
        InterfaceC16984e crashlytics = crashlytics(i);
        int mopub2 = mopub(i) & 1048575;
        if (!remoteconfig(i, obj)) {
            return crashlytics.ad();
        }
        Object object = advert.getObject(obj, mopub2);
        if (smaato(object)) {
            return object;
        }
        AbstractC15319e ad = crashlytics.ad();
        if (object != null) {
            crashlytics.vip(ad, object);
        }
        return ad;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x0b32, code lost:
    
        throw new java.io.IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e0a, code lost:
    
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0e4a, code lost:
    
        if (r0 == 1048575) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0e4c, code lost:
    
        r9.putInt(r13, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0e50, code lost:
    
        r9 = r33.yandex;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0e59, code lost:
    
        if (r9 >= r33.startapp) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0e5b, code lost:
    
        r3 = (defpackage.C2370e) m699extends(r13, r33.billing[r9], r3, r33.adcel, r34);
        r9 = r9 + 1;
        r13 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0e70, code lost:
    
        if (r3 == null) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e72, code lost:
    
        r33.adcel.getClass();
        ((defpackage.AbstractC15319e) r34).zzc = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0e7d, code lost:
    
        if (r7 != 0) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0e7f, code lost:
    
        if (r8 != r6) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0e89, code lost:
    
        throw new java.io.IOException(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x00e5, code lost:
    
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x00e7, code lost:
    
        r3 = r9;
        r8 = r10;
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x00ea, code lost:
    
        r9 = r12;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0e90, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0155, code lost:
    
        r3 = r2;
        r2 = r1;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0e8a, code lost:
    
        r11 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e8c, code lost:
    
        if (r8 > r6) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0e8e, code lost:
    
        if (r15 != r7) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0e96, code lost:
    
        throw new java.io.IOException(r11);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:212:0x045c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0b57. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:583:0x00bb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:224:0x09c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x09db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0de7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0dfd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int isPro(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, defpackage.C6313e r39) {
        /*
            Method dump skipped, instructions count: 3880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1866e.isPro(java.lang.Object, byte[], int, int, int, eَؙۥ):int");
    }

    public final int isVip(int i, int i2) {
        int[] iArr = this.ad;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // defpackage.InterfaceC16984e
    public final int license(AbstractC17836e abstractC17836e) {
        int i;
        int subscription;
        int remoteconfig;
        int subscription2;
        int vip;
        int subscription3;
        int metrica;
        int i2;
        int subscription4;
        int i3;
        int i4;
        int metrica2;
        int subscription5;
        int size;
        int remoteconfig2;
        int subscription6;
        int subscription7;
        int subscription8;
        int size2;
        int subscription9;
        int i5;
        int subscription10;
        int remoteconfig3;
        int subscription11;
        int vip2;
        int loadAd;
        int subscription12;
        C1866e c1866e = this;
        AbstractC17836e abstractC17836e2 = abstractC17836e;
        Unsafe unsafe = advert;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = c1866e.ad;
            if (i8 >= iArr.length) {
                return ((AbstractC15319e) abstractC17836e).zzc.metrica() + i10;
            }
            int mopub2 = c1866e.mopub(i8);
            int advert2 = advert(mopub2);
            int i11 = iArr[i8];
            int i12 = iArr[i8 + 2];
            int i13 = i12 & i6;
            if (advert2 <= 17) {
                if (i13 != i7) {
                    i9 = i13 == i6 ? 0 : unsafe.getInt(abstractC17836e2, i13);
                    i7 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            int i14 = mopub2 & i6;
            if (advert2 >= EnumC7497e.f15278e.f15280e) {
                EnumC7497e.f15277e.getClass();
            }
            long j = i14;
            switch (advert2) {
                case 0:
                    if (!c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 8, i10);
                    break;
                case 1:
                    if (!c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 4, i10);
                    break;
                case 2:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        long j2 = unsafe.getLong(abstractC17836e2, j);
                        subscription = AbstractC13874e.subscription(i11 << 3);
                        remoteconfig = AbstractC13874e.remoteconfig(j2);
                        i3 = remoteconfig + subscription;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        long j3 = unsafe.getLong(abstractC17836e2, j);
                        subscription = AbstractC13874e.subscription(i11 << 3);
                        remoteconfig = AbstractC13874e.remoteconfig(j3);
                        i3 = remoteconfig + subscription;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        long j4 = unsafe.getInt(abstractC17836e2, j);
                        subscription = AbstractC13874e.subscription(i11 << 3);
                        remoteconfig = AbstractC13874e.remoteconfig(j4);
                        i3 = remoteconfig + subscription;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (!c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 8, i10);
                    break;
                case 6:
                    if (!c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 4, i10);
                    break;
                case 7:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        i10 = AbstractC1414e.appmetrica(i11 << 3, 1, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        int i15 = i11 << 3;
                        Object object = unsafe.getObject(abstractC17836e2, j);
                        if (object instanceof AbstractC7244e) {
                            subscription2 = AbstractC13874e.subscription(i15);
                            vip = ((AbstractC7244e) object).billing();
                        } else {
                            subscription2 = AbstractC13874e.subscription(i15);
                            vip = AbstractC2059e.vip((String) object);
                        }
                        i10 = AbstractC1414e.purchase(vip, vip, subscription2, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        Object object2 = unsafe.getObject(abstractC17836e2, j);
                        InterfaceC16984e crashlytics = c1866e.crashlytics(i8);
                        C9616e c9616e = AbstractC0248e.ad;
                        subscription3 = AbstractC13874e.subscription(i11 << 3);
                        metrica = ((AbstractC17836e) object2).metrica(crashlytics);
                        i10 = AbstractC1414e.purchase(metrica, metrica, subscription3, i10);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        AbstractC7244e abstractC7244e = (AbstractC7244e) unsafe.getObject(abstractC17836e2, j);
                        subscription2 = AbstractC13874e.subscription(i11 << 3);
                        vip = abstractC7244e.billing();
                        i10 = AbstractC1414e.purchase(vip, vip, subscription2, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        i2 = unsafe.getInt(abstractC17836e2, j);
                        subscription4 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.appmetrica(i2, subscription4, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        long j5 = unsafe.getInt(abstractC17836e2, j);
                        subscription = AbstractC13874e.subscription(i11 << 3);
                        remoteconfig = AbstractC13874e.remoteconfig(j5);
                        i3 = remoteconfig + subscription;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (!c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 4, i10);
                    break;
                case 14:
                    if (!c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 8, i10);
                    break;
                case 15:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        int i16 = unsafe.getInt(abstractC17836e2, j);
                        subscription4 = AbstractC13874e.subscription(i11 << 3);
                        i2 = (i16 >> 31) ^ (i16 + i16);
                        i10 = AbstractC1414e.appmetrica(i2, subscription4, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        long j6 = unsafe.getLong(abstractC17836e2, j);
                        subscription = AbstractC13874e.subscription(i11 << 3);
                        remoteconfig = AbstractC13874e.remoteconfig((j6 >> 63) ^ (j6 + j6));
                        i3 = remoteconfig + subscription;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c1866e.subscription(abstractC17836e2, i8, i7, i9, i)) {
                        AbstractC17836e abstractC17836e3 = (AbstractC17836e) unsafe.getObject(abstractC17836e2, j);
                        InterfaceC16984e crashlytics2 = c1866e.crashlytics(i8);
                        C9616e c9616e2 = AbstractC0248e.ad;
                        int subscription13 = AbstractC13874e.subscription(i11 << 3);
                        i4 = subscription13 + subscription13;
                        metrica2 = abstractC17836e3.metrica(crashlytics2);
                        i3 = metrica2 + i4;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    i3 = AbstractC0248e.applovin(i11, (List) unsafe.getObject(abstractC17836e2, j));
                    i10 += i3;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    i3 = AbstractC0248e.isPro(i11, (List) unsafe.getObject(abstractC17836e2, j));
                    i10 += i3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e3 = AbstractC0248e.ad;
                    if (list.size() != 0) {
                        subscription5 = (AbstractC13874e.subscription(i11 << 3) * list.size()) + AbstractC0248e.subscription(list);
                        i10 += subscription5;
                        break;
                    }
                    subscription5 = 0;
                    i10 += subscription5;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e4 = AbstractC0248e.ad;
                    size = list2.size();
                    if (size != 0) {
                        remoteconfig2 = AbstractC0248e.remoteconfig(list2);
                        subscription6 = AbstractC13874e.subscription(i11 << 3);
                        subscription7 = (subscription6 * size) + remoteconfig2;
                        i10 += subscription7;
                        break;
                    }
                    subscription7 = 0;
                    i10 += subscription7;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e5 = AbstractC0248e.ad;
                    size = list3.size();
                    if (size != 0) {
                        remoteconfig2 = AbstractC0248e.tapsense(list3);
                        subscription6 = AbstractC13874e.subscription(i11 << 3);
                        subscription7 = (subscription6 * size) + remoteconfig2;
                        i10 += subscription7;
                        break;
                    }
                    subscription7 = 0;
                    i10 += subscription7;
                case 23:
                    i3 = AbstractC0248e.applovin(i11, (List) unsafe.getObject(abstractC17836e2, j));
                    i10 += i3;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    i3 = AbstractC0248e.isPro(i11, (List) unsafe.getObject(abstractC17836e2, j));
                    i10 += i3;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e6 = AbstractC0248e.ad;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        subscription5 = (AbstractC13874e.subscription(i11 << 3) + 1) * size3;
                        i10 += subscription5;
                        break;
                    }
                    subscription5 = 0;
                    i10 += subscription5;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e7 = AbstractC0248e.ad;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        subscription7 = AbstractC13874e.subscription(i11 << 3) * size4;
                        for (int i17 = 0; i17 < size4; i17++) {
                            Object obj = list5.get(i17);
                            int billing = obj instanceof AbstractC7244e ? ((AbstractC7244e) obj).billing() : AbstractC2059e.vip((String) obj);
                            subscription7 = AbstractC1414e.appmetrica(billing, billing, subscription7);
                        }
                        i10 += subscription7;
                        break;
                    }
                    subscription7 = 0;
                    i10 += subscription7;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC17836e2, j);
                    InterfaceC16984e crashlytics3 = c1866e.crashlytics(i8);
                    C9616e c9616e8 = AbstractC0248e.ad;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        subscription8 = 0;
                    } else {
                        subscription8 = AbstractC13874e.subscription(i11 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int metrica3 = ((AbstractC17836e) list6.get(i18)).metrica(crashlytics3);
                            subscription8 = AbstractC1414e.appmetrica(metrica3, metrica3, subscription8);
                        }
                    }
                    i10 += subscription8;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e9 = AbstractC0248e.ad;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        subscription7 = AbstractC13874e.subscription(i11 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int billing2 = ((AbstractC7244e) list7.get(i19)).billing();
                            subscription7 = AbstractC1414e.appmetrica(billing2, billing2, subscription7);
                        }
                        i10 += subscription7;
                        break;
                    }
                    subscription7 = 0;
                    i10 += subscription7;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e10 = AbstractC0248e.ad;
                    size = list8.size();
                    if (size != 0) {
                        remoteconfig2 = AbstractC0248e.isVip(list8);
                        subscription6 = AbstractC13874e.subscription(i11 << 3);
                        subscription7 = (subscription6 * size) + remoteconfig2;
                        i10 += subscription7;
                        break;
                    }
                    subscription7 = 0;
                    i10 += subscription7;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e11 = AbstractC0248e.ad;
                    size = list9.size();
                    if (size != 0) {
                        remoteconfig2 = AbstractC0248e.signatures(list9);
                        subscription6 = AbstractC13874e.subscription(i11 << 3);
                        subscription7 = (subscription6 * size) + remoteconfig2;
                        i10 += subscription7;
                        break;
                    }
                    subscription7 = 0;
                    i10 += subscription7;
                case 31:
                    i3 = AbstractC0248e.isPro(i11, (List) unsafe.getObject(abstractC17836e2, j));
                    i10 += i3;
                    break;
                case 32:
                    i3 = AbstractC0248e.applovin(i11, (List) unsafe.getObject(abstractC17836e2, j));
                    i10 += i3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e12 = AbstractC0248e.ad;
                    size = list10.size();
                    if (size != 0) {
                        remoteconfig2 = AbstractC0248e.inmobi(list10);
                        subscription6 = AbstractC13874e.subscription(i11 << 3);
                        subscription7 = (subscription6 * size) + remoteconfig2;
                        i10 += subscription7;
                        break;
                    }
                    subscription7 = 0;
                    i10 += subscription7;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e13 = AbstractC0248e.ad;
                    size = list11.size();
                    if (size != 0) {
                        remoteconfig2 = AbstractC0248e.pro(list11);
                        subscription6 = AbstractC13874e.subscription(i11 << 3);
                        subscription7 = (subscription6 * size) + remoteconfig2;
                        i10 += subscription7;
                        break;
                    }
                    subscription7 = 0;
                    i10 += subscription7;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e14 = AbstractC0248e.ad;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e15 = AbstractC0248e.ad;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = AbstractC0248e.subscription((List) unsafe.getObject(abstractC17836e2, j));
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = AbstractC0248e.remoteconfig((List) unsafe.getObject(abstractC17836e2, j));
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = AbstractC0248e.tapsense((List) unsafe.getObject(abstractC17836e2, j));
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e16 = AbstractC0248e.ad;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e17 = AbstractC0248e.ad;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e18 = AbstractC0248e.ad;
                    size2 = list16.size();
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = AbstractC0248e.isVip((List) unsafe.getObject(abstractC17836e2, j));
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = AbstractC0248e.signatures((List) unsafe.getObject(abstractC17836e2, j));
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e19 = AbstractC0248e.ad;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(abstractC17836e2, j);
                    C9616e c9616e20 = AbstractC0248e.ad;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = AbstractC0248e.inmobi((List) unsafe.getObject(abstractC17836e2, j));
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = AbstractC0248e.pro((List) unsafe.getObject(abstractC17836e2, j));
                    if (size2 > 0) {
                        subscription9 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.purchase(size2, subscription9, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC17836e2, j);
                    InterfaceC16984e crashlytics4 = c1866e.crashlytics(i8);
                    C9616e c9616e21 = AbstractC0248e.ad;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            AbstractC17836e abstractC17836e4 = (AbstractC17836e) list19.get(i20);
                            int subscription14 = AbstractC13874e.subscription(i11 << 3);
                            i5 += abstractC17836e4.metrica(crashlytics4) + subscription14 + subscription14;
                        }
                    }
                    i10 += i5;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    C8926e c8926e = (C8926e) unsafe.getObject(abstractC17836e2, j);
                    C1102e c1102e = (C1102e) c1866e.firebase(i8);
                    if (!c8926e.isEmpty()) {
                        subscription7 = 0;
                        for (Map.Entry entry : c8926e.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C15024e c15024e = c1102e.ad;
                            int subscription15 = AbstractC13874e.subscription(i11 << 3);
                            int vip3 = C1102e.vip(c15024e, key, value);
                            subscription7 = AbstractC1414e.purchase(vip3, vip3, subscription15, subscription7);
                        }
                        i10 += subscription7;
                        break;
                    }
                    subscription7 = 0;
                    i10 += subscription7;
                case 51:
                    if (!c1866e.signatures(i11, i8, abstractC17836e2)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 8, i10);
                    break;
                case 52:
                    if (!c1866e.signatures(i11, i8, abstractC17836e2)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 4, i10);
                    break;
                case 53:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        long Signature = Signature(j, abstractC17836e2);
                        subscription10 = AbstractC13874e.subscription(i11 << 3);
                        remoteconfig3 = AbstractC13874e.remoteconfig(Signature);
                        i10 += remoteconfig3 + subscription10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        long Signature2 = Signature(j, abstractC17836e2);
                        subscription10 = AbstractC13874e.subscription(i11 << 3);
                        remoteconfig3 = AbstractC13874e.remoteconfig(Signature2);
                        i10 += remoteconfig3 + subscription10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        long loadAd2 = loadAd(j, abstractC17836e2);
                        subscription10 = AbstractC13874e.subscription(i11 << 3);
                        remoteconfig3 = AbstractC13874e.remoteconfig(loadAd2);
                        i10 += remoteconfig3 + subscription10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (!c1866e.signatures(i11, i8, abstractC17836e2)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 8, i10);
                    break;
                case 57:
                    if (!c1866e.signatures(i11, i8, abstractC17836e2)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 4, i10);
                    break;
                case 58:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        i10 = AbstractC1414e.appmetrica(i11 << 3, 1, i10);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        int i21 = i11 << 3;
                        Object object3 = unsafe.getObject(abstractC17836e2, j);
                        if (object3 instanceof AbstractC7244e) {
                            subscription11 = AbstractC13874e.subscription(i21);
                            vip2 = ((AbstractC7244e) object3).billing();
                        } else {
                            subscription11 = AbstractC13874e.subscription(i21);
                            vip2 = AbstractC2059e.vip((String) object3);
                        }
                        i10 = AbstractC1414e.purchase(vip2, vip2, subscription11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        Object object4 = unsafe.getObject(abstractC17836e2, j);
                        InterfaceC16984e crashlytics5 = c1866e.crashlytics(i8);
                        C9616e c9616e22 = AbstractC0248e.ad;
                        subscription3 = AbstractC13874e.subscription(i11 << 3);
                        metrica = ((AbstractC17836e) object4).metrica(crashlytics5);
                        i10 = AbstractC1414e.purchase(metrica, metrica, subscription3, i10);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        AbstractC7244e abstractC7244e2 = (AbstractC7244e) unsafe.getObject(abstractC17836e2, j);
                        subscription11 = AbstractC13874e.subscription(i11 << 3);
                        vip2 = abstractC7244e2.billing();
                        i10 = AbstractC1414e.purchase(vip2, vip2, subscription11, i10);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        loadAd = loadAd(j, abstractC17836e2);
                        subscription12 = AbstractC13874e.subscription(i11 << 3);
                        i10 = AbstractC1414e.appmetrica(loadAd, subscription12, i10);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        long loadAd3 = loadAd(j, abstractC17836e2);
                        subscription10 = AbstractC13874e.subscription(i11 << 3);
                        remoteconfig3 = AbstractC13874e.remoteconfig(loadAd3);
                        i10 += remoteconfig3 + subscription10;
                        break;
                    } else {
                        break;
                    }
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (!c1866e.signatures(i11, i8, abstractC17836e2)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 4, i10);
                    break;
                case 65:
                    if (!c1866e.signatures(i11, i8, abstractC17836e2)) {
                        break;
                    }
                    i10 = AbstractC1414e.appmetrica(i11 << 3, 8, i10);
                    break;
                case 66:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        int loadAd4 = loadAd(j, abstractC17836e2);
                        subscription12 = AbstractC13874e.subscription(i11 << 3);
                        loadAd = (loadAd4 >> 31) ^ (loadAd4 + loadAd4);
                        i10 = AbstractC1414e.appmetrica(loadAd, subscription12, i10);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        long Signature3 = Signature(j, abstractC17836e2);
                        subscription10 = AbstractC13874e.subscription(i11 << 3);
                        remoteconfig3 = AbstractC13874e.remoteconfig((Signature3 >> 63) ^ (Signature3 + Signature3));
                        i10 += remoteconfig3 + subscription10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (c1866e.signatures(i11, i8, abstractC17836e2)) {
                        AbstractC17836e abstractC17836e5 = (AbstractC17836e) unsafe.getObject(abstractC17836e2, j);
                        InterfaceC16984e crashlytics6 = c1866e.crashlytics(i8);
                        C9616e c9616e23 = AbstractC0248e.ad;
                        int subscription16 = AbstractC13874e.subscription(i11 << 3);
                        i4 = subscription16 + subscription16;
                        metrica2 = abstractC17836e5.metrica(crashlytics6);
                        i3 = metrica2 + i4;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            c1866e = this;
            abstractC17836e2 = abstractC17836e;
            i6 = 1048575;
        }
    }

    @Override // defpackage.InterfaceC16984e
    public final void metrica(Object obj) {
        if (!smaato(obj)) {
            return;
        }
        if (obj instanceof AbstractC15319e) {
            AbstractC15319e abstractC15319e = (AbstractC15319e) obj;
            abstractC15319e.smaato();
            abstractC15319e.zza = 0;
            abstractC15319e.yandex();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.ad;
            if (i >= iArr.length) {
                this.adcel.getClass();
                C2370e c2370e = ((AbstractC15319e) obj).zzc;
                if (c2370e.appmetrica) {
                    c2370e.appmetrica = false;
                    return;
                }
                return;
            }
            int mopub2 = mopub(i);
            int i2 = 1048575 & mopub2;
            int advert2 = advert(mopub2);
            long j = i2;
            if (advert2 != 9) {
                if (advert2 != 60 && advert2 != 68) {
                    switch (advert2) {
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        case 30:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        case 48:
                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                            AbstractC1229e abstractC1229e = (AbstractC1229e) ((InterfaceC13229e) AbstractC1929e.startapp(j, obj));
                            if (!abstractC1229e.f3884e) {
                                break;
                            } else {
                                abstractC1229e.f3884e = false;
                                break;
                            }
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            Unsafe unsafe = advert;
                            Object object = unsafe.getObject(obj, j);
                            if (object == null) {
                                break;
                            } else {
                                ((C8926e) object).f17889e = false;
                                unsafe.putObject(obj, j, object);
                                break;
                            }
                    }
                } else if (signatures(iArr[i], i, obj)) {
                    crashlytics(i).metrica(advert.getObject(obj, j));
                }
                i += 3;
            }
            if (remoteconfig(i, obj)) {
                crashlytics(i).metrica(advert.getObject(obj, j));
            }
            i += 3;
        }
    }

    public final int mopub(int i) {
        return this.ad[i + 1];
    }

    /* renamed from: native, reason: not valid java name */
    public final void m702native(int i, Object obj, Object obj2, int i2) {
        advert.putObject(obj, mopub(i2) & 1048575, obj2);
        tapsense(i, i2, obj);
    }

    public final void premium(int i, Object obj, Object obj2) {
        if (remoteconfig(i, obj2)) {
            int mopub2 = mopub(i) & 1048575;
            Unsafe unsafe = advert;
            long j = mopub2;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.ad[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            InterfaceC16984e crashlytics = crashlytics(i);
            if (!remoteconfig(i, obj)) {
                if (smaato(object)) {
                    AbstractC15319e ad = crashlytics.ad();
                    crashlytics.vip(ad, object);
                    unsafe.putObject(obj, j, ad);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                pro(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!smaato(object2)) {
                AbstractC15319e ad2 = crashlytics.ad();
                crashlytics.vip(ad2, object2);
                unsafe.putObject(obj, j, ad2);
                object2 = ad2;
            }
            crashlytics.vip(object2, object);
        }
    }

    public final void pro(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC1929e.purchase(j, obj, (1 << (i2 >>> 20)) | AbstractC1929e.appmetrica(j, obj));
    }

    @Override // defpackage.InterfaceC16984e
    public final void purchase(Object obj, byte[] bArr, int i, int i2, C6313e c6313e) {
        isPro(obj, bArr, i, i2, 0, c6313e);
    }

    public final boolean remoteconfig(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int mopub2 = mopub(i);
            long j2 = mopub2 & 1048575;
            switch (advert(mopub2)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC1929e.metrica.adcel(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC1929e.metrica.purchase(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC1929e.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC1929e.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC1929e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC1929e.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC1929e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC1929e.metrica.license(j2, obj);
                case 8:
                    Object startapp = AbstractC1929e.startapp(j2, obj);
                    if (startapp instanceof String) {
                        if (((String) startapp).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(startapp instanceof AbstractC7244e)) {
                            throw new IllegalArgumentException();
                        }
                        if (AbstractC7244e.f14800e.equals(startapp)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (AbstractC1929e.startapp(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (AbstractC7244e.f14800e.equals(AbstractC1929e.startapp(j2, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (AbstractC1929e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC1929e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC1929e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC1929e.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC1929e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC1929e.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (AbstractC1929e.startapp(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & AbstractC1929e.appmetrica(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean signatures(int i, int i2, Object obj) {
        return AbstractC1929e.appmetrica((long) (this.ad[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC16984e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startapp(defpackage.AbstractC15319e r10, defpackage.AbstractC15319e r11) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1866e.startapp(eًٕؔ, eًٕؔ):boolean");
    }

    public final void subs(int i, Object obj, Object obj2) {
        int[] iArr = this.ad;
        int i2 = iArr[i];
        if (signatures(i2, i, obj2)) {
            int mopub2 = mopub(i) & 1048575;
            Unsafe unsafe = advert;
            long j = mopub2;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            InterfaceC16984e crashlytics = crashlytics(i);
            if (!signatures(i2, i, obj)) {
                if (smaato(object)) {
                    AbstractC15319e ad = crashlytics.ad();
                    crashlytics.vip(ad, object);
                    unsafe.putObject(obj, j, ad);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                tapsense(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!smaato(object2)) {
                AbstractC15319e ad2 = crashlytics.ad();
                crashlytics.vip(ad2, object2);
                unsafe.putObject(obj, j, ad2);
                object2 = ad2;
            }
            crashlytics.vip(object2, object);
        }
    }

    public final boolean subscription(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? remoteconfig(i, obj) : (i3 & i4) != 0;
    }

    public final void tapsense(int i, int i2, Object obj) {
        AbstractC1929e.purchase(this.ad[i2 + 2] & 1048575, obj, i);
    }

    /* renamed from: this, reason: not valid java name */
    public final Object m703this(int i, int i2, Object obj) {
        InterfaceC16984e crashlytics = crashlytics(i2);
        if (!signatures(i, i2, obj)) {
            return crashlytics.ad();
        }
        Object object = advert.getObject(obj, mopub(i2) & 1048575);
        if (smaato(object)) {
            return object;
        }
        AbstractC15319e ad = crashlytics.ad();
        if (object != null) {
            crashlytics.vip(ad, object);
        }
        return ad;
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m704throw(int i, C11226e c11226e, Object obj) {
        AbstractC3513e abstractC3513e = (AbstractC3513e) c11226e.appmetrica;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            c11226e.m3089e(2);
            AbstractC1929e.adcel(j, obj, abstractC3513e.mo645super());
        } else if (!this.purchase) {
            AbstractC1929e.adcel(j, obj, c11226e.m3096e());
        } else {
            c11226e.m3089e(2);
            AbstractC1929e.adcel(j, obj, abstractC3513e.mo631final());
        }
    }

    @Override // defpackage.InterfaceC16984e
    public final void vip(Object obj, Object obj2) {
        Object obj3;
        amazon(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.ad;
            if (i >= iArr.length) {
                AbstractC0248e.vip(obj, obj2);
                return;
            }
            int mopub2 = mopub(i);
            int i2 = 1048575 & mopub2;
            int advert2 = advert(mopub2);
            int i3 = iArr[i];
            long j = i2;
            switch (advert2) {
                case 0:
                    if (remoteconfig(i, obj2)) {
                        AbstractC17397e abstractC17397e = AbstractC1929e.metrica;
                        obj3 = obj;
                        abstractC17397e.advert(obj3, j, abstractC17397e.adcel(j, obj2));
                        pro(i, obj3);
                        break;
                    }
                    break;
                case 1:
                    if (remoteconfig(i, obj2)) {
                        AbstractC17397e abstractC17397e2 = AbstractC1929e.metrica;
                        abstractC17397e2.startapp(obj, j, abstractC17397e2.purchase(j, obj2));
                        pro(i, obj);
                        break;
                    }
                    break;
                case 2:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.yandex(j, AbstractC1929e.billing(j, obj2), obj);
                        pro(i, obj);
                        break;
                    }
                    break;
                case 3:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.yandex(j, AbstractC1929e.billing(j, obj2), obj);
                        pro(i, obj);
                        break;
                    }
                    break;
                case 4:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.purchase(j, obj, AbstractC1929e.appmetrica(j, obj2));
                        pro(i, obj);
                        break;
                    }
                    break;
                case 5:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.yandex(j, AbstractC1929e.billing(j, obj2), obj);
                        pro(i, obj);
                        break;
                    }
                    break;
                case 6:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.purchase(j, obj, AbstractC1929e.appmetrica(j, obj2));
                        pro(i, obj);
                        break;
                    }
                    break;
                case 7:
                    if (remoteconfig(i, obj2)) {
                        AbstractC17397e abstractC17397e3 = AbstractC1929e.metrica;
                        abstractC17397e3.appmetrica(obj, j, abstractC17397e3.license(j, obj2));
                        pro(i, obj);
                        break;
                    }
                    break;
                case 8:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.adcel(j, obj, AbstractC1929e.startapp(j, obj2));
                        pro(i, obj);
                        break;
                    }
                    break;
                case 9:
                    premium(i, obj, obj2);
                    break;
                case 10:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.adcel(j, obj, AbstractC1929e.startapp(j, obj2));
                        pro(i, obj);
                        break;
                    }
                    break;
                case 11:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.purchase(j, obj, AbstractC1929e.appmetrica(j, obj2));
                        pro(i, obj);
                        break;
                    }
                    break;
                case 12:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.purchase(j, obj, AbstractC1929e.appmetrica(j, obj2));
                        pro(i, obj);
                        break;
                    }
                    break;
                case 13:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.purchase(j, obj, AbstractC1929e.appmetrica(j, obj2));
                        pro(i, obj);
                        break;
                    }
                    break;
                case 14:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.yandex(j, AbstractC1929e.billing(j, obj2), obj);
                        pro(i, obj);
                        break;
                    }
                    break;
                case 15:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.purchase(j, obj, AbstractC1929e.appmetrica(j, obj2));
                        pro(i, obj);
                        break;
                    }
                    break;
                case 16:
                    if (remoteconfig(i, obj2)) {
                        AbstractC1929e.yandex(j, AbstractC1929e.billing(j, obj2), obj);
                        pro(i, obj);
                        break;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    premium(i, obj, obj2);
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case 30:
                case 31:
                case 32:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    InterfaceC13229e interfaceC13229e = (InterfaceC13229e) AbstractC1929e.startapp(j, obj);
                    InterfaceC13229e interfaceC13229e2 = (InterfaceC13229e) AbstractC1929e.startapp(j, obj2);
                    int size = interfaceC13229e.size();
                    int size2 = interfaceC13229e2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
                            interfaceC13229e = interfaceC13229e.applovin(size2 + size);
                        }
                        interfaceC13229e.addAll(interfaceC13229e2);
                    }
                    if (size > 0) {
                        interfaceC13229e2 = interfaceC13229e;
                    }
                    AbstractC1929e.adcel(j, obj, interfaceC13229e2);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    C9616e c9616e = AbstractC0248e.ad;
                    AbstractC1929e.adcel(j, obj, C11993e.adcel(AbstractC1929e.startapp(j, obj), AbstractC1929e.startapp(j, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (signatures(i3, i, obj2)) {
                        AbstractC1929e.adcel(j, obj, AbstractC1929e.startapp(j, obj2));
                        tapsense(i3, i, obj);
                        break;
                    }
                    break;
                case 60:
                    subs(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (signatures(i3, i, obj2)) {
                        AbstractC1929e.adcel(j, obj, AbstractC1929e.startapp(j, obj2));
                        tapsense(i3, i, obj);
                        break;
                    }
                    break;
                case 68:
                    subs(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.InterfaceC16984e
    public final void yandex(Object obj, C16089e c16089e) {
        int[] iArr;
        int i;
        C1866e c1866e = this;
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        Unsafe unsafe = advert;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = c1866e.ad;
            if (i4 >= iArr2.length) {
                ((AbstractC15319e) obj).zzc.vip(c16089e);
                return;
            }
            int mopub2 = c1866e.mopub(i4);
            int advert2 = advert(mopub2);
            int i6 = iArr2[i4];
            if (advert2 <= 17) {
                int i7 = iArr2[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                iArr = iArr2;
                i = 1 << (i7 >>> 20);
            } else {
                iArr = iArr2;
                i = 0;
            }
            long j = mopub2 & i2;
            switch (advert2) {
                case 0:
                    if (!c1866e.subscription(obj, i4, i3, i5, i)) {
                        break;
                    } else {
                        abstractC13874e.isPro(i6, Double.doubleToRawLongBits(AbstractC1929e.metrica.adcel(j, obj)));
                        continue;
                    }
                case 1:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.isVip(i6, Float.floatToRawIntBits(AbstractC1929e.metrica.purchase(j, obj)));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.inmobi(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.inmobi(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.signatures(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.isPro(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.isVip(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.applovin(i6, AbstractC1929e.metrica.license(j, obj));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            abstractC13874e.ads(i6, (String) object);
                            break;
                        } else {
                            abstractC13874e.premium(i6, (AbstractC7244e) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        c16089e.m4113implements(i6, unsafe.getObject(obj, j), c1866e.crashlytics(i4));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.premium(i6, (AbstractC7244e) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.tapsense(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.signatures(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.isVip(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        abstractC13874e.isPro(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        abstractC13874e.tapsense(i6, (i9 >> 31) ^ (i9 + i9));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        abstractC13874e.inmobi(i6, (j2 >> 63) ^ (j2 + j2));
                        break;
                    } else {
                        continue;
                    }
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c1866e.subscription(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        abstractC13874e.pro(i6, 3);
                        c1866e.crashlytics(i4).yandex((AbstractC17836e) object2, c16089e);
                        abstractC13874e.pro(i6, 4);
                        break;
                    } else {
                        continue;
                    }
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    AbstractC0248e.license(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    AbstractC0248e.appmetrica(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case 20:
                    AbstractC0248e.purchase(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case 21:
                    AbstractC0248e.billing(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case 22:
                    AbstractC0248e.mopub(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case 23:
                    AbstractC0248e.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    AbstractC0248e.amazon(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    AbstractC0248e.admob(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    C9616e c9616e = AbstractC0248e.ad;
                    if (list != null && !list.isEmpty()) {
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            abstractC13874e.ads(i10, (String) list.get(i11));
                        }
                        break;
                    }
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC16984e crashlytics = c1866e.crashlytics(i4);
                    C9616e c9616e2 = AbstractC0248e.ad;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            c16089e.m4113implements(i12, list2.get(i13), crashlytics);
                        }
                        break;
                    }
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    C9616e c9616e3 = AbstractC0248e.ad;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            abstractC13874e.premium(i14, (AbstractC7244e) list3.get(i15));
                        }
                        break;
                    }
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    AbstractC0248e.advert(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case 30:
                    AbstractC0248e.Signature(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case 31:
                    AbstractC0248e.loadAd(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case 32:
                    AbstractC0248e.adcel(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    AbstractC0248e.smaato(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    AbstractC0248e.yandex(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, false);
                    continue;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    AbstractC0248e.license(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    AbstractC0248e.appmetrica(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    AbstractC0248e.purchase(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    AbstractC0248e.billing(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    AbstractC0248e.mopub(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    AbstractC0248e.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    AbstractC0248e.amazon(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    AbstractC0248e.admob(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    AbstractC0248e.advert(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    AbstractC0248e.Signature(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    AbstractC0248e.loadAd(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    AbstractC0248e.adcel(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    AbstractC0248e.smaato(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case 48:
                    AbstractC0248e.yandex(iArr[i4], (List) unsafe.getObject(obj, j), c16089e, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC16984e crashlytics2 = c1866e.crashlytics(i4);
                    C9616e c9616e4 = AbstractC0248e.ad;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            AbstractC17836e abstractC17836e = (AbstractC17836e) list4.get(i17);
                            abstractC13874e.pro(i16, 3);
                            crashlytics2.yandex(abstractC17836e, c16089e);
                            abstractC13874e.pro(i16, 4);
                        }
                        break;
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        C15024e c15024e = ((C1102e) c1866e.firebase(i4)).ad;
                        for (Map.Entry entry : ((C8926e) object3).entrySet()) {
                            abstractC13874e.pro(i6, 2);
                            abstractC13874e.mo1198goto(C1102e.vip(c15024e, entry.getKey(), entry.getValue()));
                            C1102e.ad(abstractC13874e, c15024e, entry.getKey(), entry.getValue());
                        }
                        break;
                    }
                    break;
                case 51:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.isPro(i6, Double.doubleToRawLongBits(((Double) AbstractC1929e.startapp(j, obj)).doubleValue()));
                        break;
                    }
                    break;
                case 52:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.isVip(i6, Float.floatToRawIntBits(((Float) AbstractC1929e.startapp(j, obj)).floatValue()));
                        break;
                    }
                    break;
                case 53:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.inmobi(i6, Signature(j, obj));
                        break;
                    }
                    break;
                case 54:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.inmobi(i6, Signature(j, obj));
                        break;
                    }
                    break;
                case 55:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.signatures(i6, loadAd(j, obj));
                        break;
                    }
                    break;
                case 56:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.isPro(i6, Signature(j, obj));
                        break;
                    }
                    break;
                case 57:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.isVip(i6, loadAd(j, obj));
                        break;
                    }
                    break;
                case 58:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.applovin(i6, ((Boolean) AbstractC1929e.startapp(j, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (c1866e.signatures(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            abstractC13874e.ads(i6, (String) object4);
                            break;
                        } else {
                            abstractC13874e.premium(i6, (AbstractC7244e) object4);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (c1866e.signatures(i6, i4, obj)) {
                        c16089e.m4113implements(i6, unsafe.getObject(obj, j), c1866e.crashlytics(i4));
                        break;
                    }
                    break;
                case 61:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.premium(i6, (AbstractC7244e) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.tapsense(i6, loadAd(j, obj));
                        break;
                    }
                    break;
                case 63:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.signatures(i6, loadAd(j, obj));
                        break;
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.isVip(i6, loadAd(j, obj));
                        break;
                    }
                    break;
                case 65:
                    if (c1866e.signatures(i6, i4, obj)) {
                        abstractC13874e.isPro(i6, Signature(j, obj));
                        break;
                    }
                    break;
                case 66:
                    if (c1866e.signatures(i6, i4, obj)) {
                        int loadAd = loadAd(j, obj);
                        abstractC13874e.tapsense(i6, (loadAd >> 31) ^ (loadAd + loadAd));
                        break;
                    }
                    break;
                case 67:
                    if (c1866e.signatures(i6, i4, obj)) {
                        long Signature = Signature(j, obj);
                        abstractC13874e.inmobi(i6, (Signature >> 63) ^ (Signature + Signature));
                        break;
                    }
                    break;
                case 68:
                    if (c1866e.signatures(i6, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        abstractC13874e.pro(i6, 3);
                        c1866e.crashlytics(i4).yandex((AbstractC17836e) object5, c16089e);
                        abstractC13874e.pro(i6, 4);
                        break;
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            c1866e = this;
        }
    }
}
