package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٙٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14797e implements InterfaceC11969e {
    public static final int[] amazon = new int[0];
    public static final Unsafe loadAd = AbstractC9259e.startapp();
    public final int[] ad;
    public final C4675e adcel;
    public final C16333e advert;
    public final AbstractC4765e appmetrica;
    public final int[] billing;
    public final int license;
    public final int metrica;
    public final C13889e mopub;
    public final boolean purchase;
    public final C3304e smaato;
    public final int startapp;
    public final Object[] vip;
    public final int yandex;

    public C14797e(int[] iArr, Object[] objArr, int i, int i2, AbstractC4765e abstractC4765e, int[] iArr2, int i3, int i4, C4675e c4675e, C13889e c13889e, C16333e c16333e, C17634e c17634e, C3304e c3304e) {
        this.ad = iArr;
        this.vip = objArr;
        this.metrica = i;
        this.license = i2;
        this.purchase = abstractC4765e instanceof AbstractC18270e;
        this.billing = iArr2;
        this.yandex = i3;
        this.startapp = i4;
        this.adcel = c4675e;
        this.mopub = c13889e;
        this.advert = c16333e;
        this.appmetrica = abstractC4765e;
        this.smaato = c3304e;
    }

    public static boolean Signature(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC18270e) {
            return ((AbstractC18270e) obj).purchase();
        }
        return true;
    }

    public static long applovin(long j, Object obj) {
        return ((Long) AbstractC9259e.metrica.yandex(j, obj)).longValue();
    }

    /* renamed from: class, reason: not valid java name */
    public static Field m3843class(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder applovin = AbstractC8703e.applovin("Field ", str, " for ");
            applovin.append(cls.getName());
            applovin.append(" not found. Known fields are ");
            applovin.append(Arrays.toString(declaredFields));
            throw new RuntimeException(applovin.toString(), e);
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public static int m3844extends(int i) {
        return (i & 267386880) >>> 20;
    }

    public static long inmobi(int i) {
        return i & 1048575;
    }

    public static int isPro(long j, Object obj) {
        return ((Integer) AbstractC9259e.metrica.yandex(j, obj)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C14797e isVip(defpackage.C8678e r36, defpackage.C4675e r37, defpackage.C13889e r38, defpackage.C16333e r39, defpackage.C17634e r40, defpackage.C3304e r41) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14797e.isVip(eٌٓۜ, eؗؗٛ, eٍٓۧ, eٖٛۖ, eٌ٘ؓ, eِؕٔ):eٔٙٞ");
    }

    @Override // defpackage.InterfaceC11969e
    public final void ad(Object obj, Object obj2) {
        Object obj3;
        if (!Signature(obj)) {
            throw new IllegalArgumentException(AbstractC1634e.advert(obj, "Mutating immutable message: "));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.ad;
            if (i >= iArr.length) {
                AbstractC5630e.mopub(this.advert, obj, obj2);
                return;
            }
            int m3849throw = m3849throw(i);
            long j = 1048575 & m3849throw;
            int i2 = iArr[i];
            switch (m3844extends(m3849throw)) {
                case 0:
                    if (amazon(i, obj2)) {
                        AbstractC8415e abstractC8415e = AbstractC9259e.metrica;
                        obj3 = obj;
                        abstractC8415e.advert(obj3, j, abstractC8415e.license(j, obj2));
                        m3846interface(i, obj3);
                        break;
                    }
                    break;
                case 1:
                    if (amazon(i, obj2)) {
                        AbstractC8415e abstractC8415e2 = AbstractC9259e.metrica;
                        abstractC8415e2.smaato(obj, j, abstractC8415e2.appmetrica(j, obj2));
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 2:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.amazon(j, AbstractC9259e.metrica.billing(j, obj2), obj);
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 3:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.amazon(j, AbstractC9259e.metrica.billing(j, obj2), obj);
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 4:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.smaato(j, obj, AbstractC9259e.metrica.purchase(j, obj2));
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 5:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.amazon(j, AbstractC9259e.metrica.billing(j, obj2), obj);
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 6:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.smaato(j, obj, AbstractC9259e.metrica.purchase(j, obj2));
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 7:
                    if (amazon(i, obj2)) {
                        AbstractC8415e abstractC8415e3 = AbstractC9259e.metrica;
                        abstractC8415e3.adcel(obj, j, abstractC8415e3.metrica(j, obj2));
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 8:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.loadAd(j, obj, AbstractC9259e.metrica.yandex(j, obj2));
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 9:
                    remoteconfig(i, obj, obj2);
                    break;
                case 10:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.loadAd(j, obj, AbstractC9259e.metrica.yandex(j, obj2));
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 11:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.smaato(j, obj, AbstractC9259e.metrica.purchase(j, obj2));
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 12:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.smaato(j, obj, AbstractC9259e.metrica.purchase(j, obj2));
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 13:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.smaato(j, obj, AbstractC9259e.metrica.purchase(j, obj2));
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 14:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.amazon(j, AbstractC9259e.metrica.billing(j, obj2), obj);
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 15:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.smaato(j, obj, AbstractC9259e.metrica.purchase(j, obj2));
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case 16:
                    if (amazon(i, obj2)) {
                        AbstractC9259e.amazon(j, AbstractC9259e.metrica.billing(j, obj2), obj);
                        m3846interface(i, obj);
                        break;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    remoteconfig(i, obj, obj2);
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
                    this.mopub.getClass();
                    AbstractC8415e abstractC8415e4 = AbstractC9259e.metrica;
                    InterfaceC17042e interfaceC17042e = (InterfaceC17042e) abstractC8415e4.yandex(j, obj);
                    InterfaceC17042e interfaceC17042e2 = (InterfaceC17042e) abstractC8415e4.yandex(j, obj2);
                    C2423e c2423e = (C2423e) interfaceC17042e;
                    int i3 = c2423e.f6223e;
                    int i4 = ((C2423e) interfaceC17042e2).f6223e;
                    if (i3 > 0 && i4 > 0) {
                        if (!((AbstractC11000e) interfaceC17042e).f21788e) {
                            interfaceC17042e = c2423e.yandex(i4 + i3);
                        }
                        ((AbstractC11000e) interfaceC17042e).addAll(interfaceC17042e2);
                    }
                    if (i3 > 0) {
                        interfaceC17042e2 = interfaceC17042e;
                    }
                    AbstractC9259e.loadAd(j, obj, interfaceC17042e2);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = AbstractC5630e.ad;
                    AbstractC8415e abstractC8415e5 = AbstractC9259e.metrica;
                    AbstractC9259e.loadAd(j, obj, this.smaato.ad(abstractC8415e5.yandex(j, obj), abstractC8415e5.yandex(j, obj2)));
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
                    if (admob(i2, i, obj2)) {
                        AbstractC9259e.loadAd(j, obj, AbstractC9259e.metrica.yandex(j, obj2));
                        m3845goto(i2, i, obj);
                        break;
                    }
                    break;
                case 60:
                    pro(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (admob(i2, i, obj2)) {
                        AbstractC9259e.loadAd(j, obj, AbstractC9259e.metrica.yandex(j, obj2));
                        m3845goto(i2, i, obj);
                        break;
                    }
                    break;
                case 68:
                    pro(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    public final boolean adcel(AbstractC18270e abstractC18270e, AbstractC18270e abstractC18270e2, int i) {
        return amazon(i, abstractC18270e) == amazon(i, abstractC18270e2);
    }

    public final boolean admob(int i, int i2, Object obj) {
        return AbstractC9259e.metrica.purchase((long) (this.ad[i2 + 2] & 1048575), obj) == i;
    }

    public final int ads(int i) {
        if (i >= this.metrica && i <= this.license) {
            int[] iArr = this.ad;
            int length = (iArr.length / 3) - 1;
            int i2 = 0;
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
        }
        return -1;
    }

    public final void advert(int i) {
        if (this.vip[AbstractC5087e.m1751protected(i, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final boolean amazon(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int m3849throw = m3849throw(i);
            long j2 = m3849throw & 1048575;
            switch (m3844extends(m3849throw)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC9259e.metrica.license(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC9259e.metrica.appmetrica(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC9259e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC9259e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC9259e.metrica.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC9259e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC9259e.metrica.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC9259e.metrica.metrica(j2, obj);
                case 8:
                    Object yandex = AbstractC9259e.metrica.yandex(j2, obj);
                    if (yandex instanceof String) {
                        return !((String) yandex).isEmpty();
                    }
                    if (yandex instanceof C6283e) {
                        return !C6283e.f13092e.equals(yandex);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC9259e.metrica.yandex(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C6283e.f13092e.equals(AbstractC9259e.metrica.yandex(j2, obj));
                case 11:
                    if (AbstractC9259e.metrica.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC9259e.metrica.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC9259e.metrica.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC9259e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC9259e.metrica.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC9259e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (AbstractC9259e.metrica.yandex(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & AbstractC9259e.metrica.purchase(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (defpackage.AbstractC5630e.advert(r5.yandex(r7, r12), r5.yandex(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.purchase(r7, r12) == r5.purchase(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.purchase(r7, r12) == r5.purchase(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.purchase(r7, r12) == r5.purchase(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.purchase(r7, r12) == r5.purchase(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (defpackage.AbstractC5630e.advert(r5.yandex(r7, r12), r5.yandex(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (defpackage.AbstractC5630e.advert(r5.yandex(r7, r12), r5.yandex(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (defpackage.AbstractC5630e.advert(r5.yandex(r7, r12), r5.yandex(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.metrica(r7, r12) == r5.metrica(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.purchase(r7, r12) == r5.purchase(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.purchase(r7, r12) == r5.purchase(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.appmetrica(r7, r12)) == java.lang.Float.floatToIntBits(r5.appmetrica(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.license(r7, r12)) == java.lang.Double.doubleToLongBits(r5.license(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (defpackage.AbstractC5630e.advert(r9.yandex(r7, r12), r9.yandex(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // defpackage.InterfaceC11969e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean appmetrica(defpackage.AbstractC18270e r12, defpackage.AbstractC18270e r13) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14797e.appmetrica(eٟؓ, eٟؓ):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0048. Please report as an issue. */
    @Override // defpackage.InterfaceC11969e
    public final int billing(AbstractC18270e abstractC18270e) {
        int i;
        int smaato;
        int smaato2;
        int smaato3;
        int loadAd2;
        int smaato4;
        int loadAd3;
        int smaato5;
        int smaato6;
        int mopub;
        int smaato7;
        int ad;
        int metrica;
        int smaato8;
        int size;
        int startapp;
        int smaato9;
        int smaato10;
        int size2;
        int smaato11;
        int amazon2;
        int i2;
        int i3;
        int smaato12;
        int amazon3;
        C14797e c14797e = this;
        AbstractC18270e abstractC18270e2 = abstractC18270e;
        Unsafe unsafe = loadAd;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = c14797e.ad;
            if (i5 >= iArr.length) {
                c14797e.advert.getClass();
                return abstractC18270e2.unknownFields.vip() + i7;
            }
            int m3849throw = c14797e.m3849throw(i5);
            int m3844extends = m3844extends(m3849throw);
            int i8 = iArr[i5];
            int i9 = iArr[i5 + 2];
            int i10 = i9 & 1048575;
            if (m3844extends <= 17) {
                if (i10 != i4) {
                    i6 = i10 == 1048575 ? 0 : unsafe.getInt(abstractC18270e2, i10);
                    i4 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = m3849throw & 1048575;
            if (m3844extends >= EnumC4266e.f9355e.f9357e) {
                int i11 = EnumC4266e.f9354e.f9357e;
            }
            switch (m3844extends) {
                case 0:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        smaato = C15997e.smaato(i8);
                        metrica = smaato + 8;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        smaato2 = C15997e.smaato(i8);
                        smaato6 = smaato2 + 4;
                        i7 += smaato6;
                    }
                    c14797e = this;
                    abstractC18270e2 = abstractC18270e;
                    break;
                case 2:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(abstractC18270e2, j);
                        smaato3 = C15997e.smaato(i8);
                        loadAd2 = C15997e.loadAd(j2);
                        i7 += loadAd2 + smaato3;
                    }
                    c14797e = this;
                    break;
                case 3:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(abstractC18270e2, j);
                        smaato3 = C15997e.smaato(i8);
                        loadAd2 = C15997e.loadAd(j3);
                        i7 += loadAd2 + smaato3;
                    }
                    c14797e = this;
                    break;
                case 4:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(abstractC18270e2, j);
                        smaato4 = C15997e.smaato(i8);
                        loadAd3 = C15997e.loadAd(i12);
                        mopub = loadAd3 + smaato4;
                        i7 += mopub;
                    }
                    c14797e = this;
                    break;
                case 5:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        smaato5 = C15997e.smaato(i8);
                        smaato6 = smaato5 + 8;
                        i7 += smaato6;
                    }
                    c14797e = this;
                    abstractC18270e2 = abstractC18270e;
                    break;
                case 6:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        smaato2 = C15997e.smaato(i8);
                        smaato6 = smaato2 + 4;
                        i7 += smaato6;
                    }
                    c14797e = this;
                    abstractC18270e2 = abstractC18270e;
                    break;
                case 7:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        smaato6 = C15997e.smaato(i8) + 1;
                        i7 += smaato6;
                    }
                    c14797e = this;
                    abstractC18270e2 = abstractC18270e;
                    break;
                case 8:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(abstractC18270e2, j);
                        i7 = (object instanceof C6283e ? C15997e.mopub(i8, (C6283e) object) : C15997e.advert((String) object) + C15997e.smaato(i8)) + i7;
                    }
                    c14797e = this;
                    break;
                case 9:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        Object object2 = unsafe.getObject(abstractC18270e2, j);
                        InterfaceC11969e smaato13 = c14797e.smaato(i5);
                        Class cls = AbstractC5630e.ad;
                        int smaato14 = C15997e.smaato(i8);
                        int ad2 = ((AbstractC4765e) object2).ad(smaato13);
                        i7 += C15997e.amazon(ad2) + ad2 + smaato14;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        mopub = C15997e.mopub(i8, (C6283e) unsafe.getObject(abstractC18270e2, j));
                        i7 += mopub;
                    }
                    c14797e = this;
                    break;
                case 11:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        int i13 = unsafe.getInt(abstractC18270e2, j);
                        smaato4 = C15997e.smaato(i8);
                        loadAd3 = C15997e.amazon(i13);
                        mopub = loadAd3 + smaato4;
                        i7 += mopub;
                    }
                    c14797e = this;
                    break;
                case 12:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        int i14 = unsafe.getInt(abstractC18270e2, j);
                        smaato4 = C15997e.smaato(i8);
                        loadAd3 = C15997e.loadAd(i14);
                        mopub = loadAd3 + smaato4;
                        i7 += mopub;
                    }
                    c14797e = this;
                    break;
                case 13:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        smaato2 = C15997e.smaato(i8);
                        smaato6 = smaato2 + 4;
                        i7 += smaato6;
                    }
                    c14797e = this;
                    abstractC18270e2 = abstractC18270e;
                    break;
                case 14:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        smaato5 = C15997e.smaato(i8);
                        smaato6 = smaato5 + 8;
                        i7 += smaato6;
                    }
                    c14797e = this;
                    abstractC18270e2 = abstractC18270e;
                    break;
                case 15:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        int i15 = unsafe.getInt(abstractC18270e2, j);
                        smaato4 = C15997e.smaato(i8);
                        loadAd3 = C15997e.amazon((i15 >> 31) ^ (i15 << 1));
                        mopub = loadAd3 + smaato4;
                        i7 += mopub;
                    }
                    c14797e = this;
                    break;
                case 16:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        long j4 = unsafe.getLong(abstractC18270e2, j);
                        smaato3 = C15997e.smaato(i8);
                        loadAd2 = C15997e.loadAd((j4 << 1) ^ (j4 >> 63));
                        i7 += loadAd2 + smaato3;
                    }
                    c14797e = this;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c14797e.loadAd(abstractC18270e2, i5, i4, i6, i)) {
                        AbstractC4765e abstractC4765e = (AbstractC4765e) unsafe.getObject(abstractC18270e2, j);
                        InterfaceC11969e smaato15 = c14797e.smaato(i5);
                        Class cls2 = AbstractC5630e.ad;
                        smaato7 = C15997e.smaato(i8) * 2;
                        ad = abstractC4765e.ad(smaato15);
                        metrica = ad + smaato7;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    metrica = AbstractC5630e.metrica(i8, (List) unsafe.getObject(abstractC18270e2, j));
                    i7 += metrica;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    metrica = AbstractC5630e.vip(i8, (List) unsafe.getObject(abstractC18270e2, j));
                    i7 += metrica;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls3 = AbstractC5630e.ad;
                    if (list.size() != 0) {
                        smaato8 = (C15997e.smaato(i8) * list.size()) + AbstractC5630e.appmetrica(list);
                        i7 += smaato8;
                        break;
                    }
                    smaato8 = 0;
                    i7 += smaato8;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls4 = AbstractC5630e.ad;
                    size = list2.size();
                    if (size != 0) {
                        startapp = AbstractC5630e.startapp(list2);
                        smaato9 = C15997e.smaato(i8);
                        smaato8 = (smaato9 * size) + startapp;
                        i7 += smaato8;
                        break;
                    }
                    smaato8 = 0;
                    i7 += smaato8;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls5 = AbstractC5630e.ad;
                    size = list3.size();
                    if (size != 0) {
                        startapp = AbstractC5630e.license(list3);
                        smaato9 = C15997e.smaato(i8);
                        smaato8 = (smaato9 * size) + startapp;
                        i7 += smaato8;
                        break;
                    }
                    smaato8 = 0;
                    i7 += smaato8;
                case 23:
                    metrica = AbstractC5630e.metrica(i8, (List) unsafe.getObject(abstractC18270e2, j));
                    i7 += metrica;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    metrica = AbstractC5630e.vip(i8, (List) unsafe.getObject(abstractC18270e2, j));
                    i7 += metrica;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls6 = AbstractC5630e.ad;
                    int size3 = list4.size();
                    i7 += size3 == 0 ? 0 : (C15997e.smaato(i8) + 1) * size3;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls7 = AbstractC5630e.ad;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        smaato8 = C15997e.smaato(i8) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof C6283e) {
                                int size5 = ((C6283e) obj).size();
                                smaato8 = C15997e.amazon(size5) + size5 + smaato8;
                            } else {
                                smaato8 = C15997e.advert((String) obj) + smaato8;
                            }
                        }
                        i7 += smaato8;
                        break;
                    }
                    smaato8 = 0;
                    i7 += smaato8;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC18270e2, j);
                    InterfaceC11969e smaato16 = c14797e.smaato(i5);
                    Class cls8 = AbstractC5630e.ad;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        smaato10 = C15997e.smaato(i8) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int ad3 = ((AbstractC4765e) list6.get(i17)).ad(smaato16);
                            smaato10 += C15997e.amazon(ad3) + ad3;
                        }
                        i7 += smaato10;
                        break;
                    }
                    smaato10 = 0;
                    i7 += smaato10;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls9 = AbstractC5630e.ad;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        smaato8 = C15997e.smaato(i8) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((C6283e) list7.get(i18)).size();
                            smaato8 += C15997e.amazon(size8) + size8;
                        }
                        i7 += smaato8;
                        break;
                    }
                    smaato8 = 0;
                    i7 += smaato8;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls10 = AbstractC5630e.ad;
                    size = list8.size();
                    if (size != 0) {
                        startapp = AbstractC5630e.yandex(list8);
                        smaato9 = C15997e.smaato(i8);
                        smaato8 = (smaato9 * size) + startapp;
                        i7 += smaato8;
                        break;
                    }
                    smaato8 = 0;
                    i7 += smaato8;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls11 = AbstractC5630e.ad;
                    size = list9.size();
                    if (size != 0) {
                        startapp = AbstractC5630e.ad(list9);
                        smaato9 = C15997e.smaato(i8);
                        smaato8 = (smaato9 * size) + startapp;
                        i7 += smaato8;
                        break;
                    }
                    smaato8 = 0;
                    i7 += smaato8;
                case 31:
                    metrica = AbstractC5630e.vip(i8, (List) unsafe.getObject(abstractC18270e2, j));
                    i7 += metrica;
                    break;
                case 32:
                    metrica = AbstractC5630e.metrica(i8, (List) unsafe.getObject(abstractC18270e2, j));
                    i7 += metrica;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls12 = AbstractC5630e.ad;
                    size = list10.size();
                    if (size != 0) {
                        startapp = AbstractC5630e.purchase(list10);
                        smaato9 = C15997e.smaato(i8);
                        smaato8 = (smaato9 * size) + startapp;
                        i7 += smaato8;
                        break;
                    }
                    smaato8 = 0;
                    i7 += smaato8;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls13 = AbstractC5630e.ad;
                    size = list11.size();
                    if (size != 0) {
                        startapp = AbstractC5630e.billing(list11);
                        smaato9 = C15997e.smaato(i8);
                        smaato8 = (smaato9 * size) + startapp;
                        i7 += smaato8;
                        break;
                    }
                    smaato8 = 0;
                    i7 += smaato8;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls14 = AbstractC5630e.ad;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls15 = AbstractC5630e.ad;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = AbstractC5630e.appmetrica((List) unsafe.getObject(abstractC18270e2, j));
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = AbstractC5630e.startapp((List) unsafe.getObject(abstractC18270e2, j));
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = AbstractC5630e.license((List) unsafe.getObject(abstractC18270e2, j));
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls16 = AbstractC5630e.ad;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls17 = AbstractC5630e.ad;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls18 = AbstractC5630e.ad;
                    size2 = list16.size();
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = AbstractC5630e.yandex((List) unsafe.getObject(abstractC18270e2, j));
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = AbstractC5630e.ad((List) unsafe.getObject(abstractC18270e2, j));
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls19 = AbstractC5630e.ad;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(abstractC18270e2, j);
                    Class cls20 = AbstractC5630e.ad;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = AbstractC5630e.purchase((List) unsafe.getObject(abstractC18270e2, j));
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = AbstractC5630e.billing((List) unsafe.getObject(abstractC18270e2, j));
                    if (size2 > 0) {
                        smaato11 = C15997e.smaato(i8);
                        amazon2 = C15997e.amazon(size2);
                        i2 = amazon2 + smaato11;
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC18270e2, j);
                    InterfaceC11969e smaato17 = c14797e.smaato(i5);
                    Class cls21 = AbstractC5630e.ad;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            i3 += ((AbstractC4765e) list19.get(i19)).ad(smaato17) + (C15997e.smaato(i8) * 2);
                        }
                    }
                    i7 += i3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(abstractC18270e2, j);
                    Object obj2 = c14797e.vip[(i5 / 3) * 2];
                    c14797e.smaato.getClass();
                    C3882e c3882e = (C3882e) object3;
                    C6723e c6723e = (C6723e) obj2;
                    if (!c3882e.isEmpty()) {
                        smaato10 = 0;
                        for (Map.Entry entry : c3882e.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c6723e.getClass();
                            int smaato18 = C15997e.smaato(i8);
                            int ad4 = C6723e.ad(c6723e.ad, key, value);
                            smaato10 += C15997e.amazon(ad4) + ad4 + smaato18;
                        }
                        i7 += smaato10;
                        break;
                    }
                    smaato10 = 0;
                    i7 += smaato10;
                case 51:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        smaato = C15997e.smaato(i8);
                        metrica = smaato + 8;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        smaato12 = C15997e.smaato(i8);
                        metrica = smaato12 + 4;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        long applovin = applovin(j, abstractC18270e2);
                        size2 = C15997e.smaato(i8);
                        i2 = C15997e.loadAd(applovin);
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        long applovin2 = applovin(j, abstractC18270e2);
                        size2 = C15997e.smaato(i8);
                        i2 = C15997e.loadAd(applovin2);
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        int isPro = isPro(j, abstractC18270e2);
                        smaato7 = C15997e.smaato(i8);
                        ad = C15997e.loadAd(isPro);
                        metrica = ad + smaato7;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        smaato = C15997e.smaato(i8);
                        metrica = smaato + 8;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        smaato12 = C15997e.smaato(i8);
                        metrica = smaato12 + 4;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        metrica = C15997e.smaato(i8) + 1;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        Object object4 = unsafe.getObject(abstractC18270e2, j);
                        i7 = (object4 instanceof C6283e ? C15997e.mopub(i8, (C6283e) object4) : C15997e.advert((String) object4) + C15997e.smaato(i8)) + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        Object object5 = unsafe.getObject(abstractC18270e2, j);
                        InterfaceC11969e smaato19 = c14797e.smaato(i5);
                        Class cls22 = AbstractC5630e.ad;
                        int smaato20 = C15997e.smaato(i8);
                        int ad5 = ((AbstractC4765e) object5).ad(smaato19);
                        amazon3 = C15997e.amazon(ad5) + ad5 + smaato20;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        metrica = C15997e.mopub(i8, (C6283e) unsafe.getObject(abstractC18270e2, j));
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        int isPro2 = isPro(j, abstractC18270e2);
                        smaato7 = C15997e.smaato(i8);
                        ad = C15997e.amazon(isPro2);
                        metrica = ad + smaato7;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        int isPro3 = isPro(j, abstractC18270e2);
                        smaato7 = C15997e.smaato(i8);
                        ad = C15997e.loadAd(isPro3);
                        metrica = ad + smaato7;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        smaato12 = C15997e.smaato(i8);
                        metrica = smaato12 + 4;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        smaato = C15997e.smaato(i8);
                        metrica = smaato + 8;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        int isPro4 = isPro(j, abstractC18270e2);
                        smaato7 = C15997e.smaato(i8);
                        ad = C15997e.amazon((isPro4 >> 31) ^ (isPro4 << 1));
                        metrica = ad + smaato7;
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        long applovin3 = applovin(j, abstractC18270e2);
                        size2 = C15997e.smaato(i8);
                        i2 = C15997e.loadAd((applovin3 << 1) ^ (applovin3 >> 63));
                        amazon3 = i2 + size2;
                        i7 += amazon3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (c14797e.admob(i8, i5, abstractC18270e2)) {
                        AbstractC4765e abstractC4765e2 = (AbstractC4765e) unsafe.getObject(abstractC18270e2, j);
                        InterfaceC11969e smaato21 = c14797e.smaato(i5);
                        Class cls23 = AbstractC5630e.ad;
                        metrica = abstractC4765e2.ad(smaato21) + (C15997e.smaato(i8) * 2);
                        i7 += metrica;
                        break;
                    } else {
                        break;
                    }
            }
            i5 += 3;
        }
    }

    public final void crashlytics(int i, C11226e c11226e, Object obj) {
        if ((536870912 & i) != 0) {
            c11226e.m3077continue(2);
            AbstractC9259e.loadAd(i & 1048575, obj, ((AbstractC3513e) c11226e.appmetrica).pro());
        } else if (!this.purchase) {
            AbstractC9259e.loadAd(i & 1048575, obj, c11226e.admob());
        } else {
            c11226e.m3077continue(2);
            AbstractC9259e.loadAd(i & 1048575, obj, ((AbstractC3513e) c11226e.appmetrica).remoteconfig());
        }
    }

    public final void firebase(int i, C11226e c11226e, Object obj) {
        int i2 = 536870912 & i;
        C13889e c13889e = this.mopub;
        if (i2 != 0) {
            c11226e.m3121return(c13889e.ad(i & 1048575, obj), true);
        } else {
            c11226e.m3121return(c13889e.ad(i & 1048575, obj), false);
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m3845goto(int i, int i2, Object obj) {
        AbstractC9259e.smaato(this.ad[i2 + 2] & 1048575, obj, i);
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m3846interface(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC9259e.smaato(j, obj, (1 << (i2 >>> 20)) | AbstractC9259e.metrica.purchase(j, obj));
    }

    @Override // defpackage.InterfaceC11969e
    public final AbstractC18270e license() {
        this.adcel.getClass();
        return ((AbstractC18270e) this.appmetrica).startapp();
    }

    public final boolean loadAd(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? amazon(i, obj) : (i3 & i4) != 0;
    }

    @Override // defpackage.InterfaceC11969e
    public final boolean metrica(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.yandex) {
            int i7 = this.billing[i6];
            int[] iArr = this.ad;
            int i8 = iArr[i7];
            int m3849throw = m3849throw(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = loadAd.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & m3849throw) == 0 || loadAd(obj, i2, i, i3, i11)) {
                int m3844extends = m3844extends(m3849throw);
                if (m3844extends == 9 || m3844extends == 17) {
                    if (loadAd(obj, i2, i, i3, i11)) {
                        if (!smaato(i2).metrica(AbstractC9259e.metrica.yandex(m3849throw & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (m3844extends != 27) {
                        if (m3844extends == 60 || m3844extends == 68) {
                            if (admob(i8, i2, obj)) {
                                if (!smaato(i2).metrica(AbstractC9259e.metrica.yandex(m3849throw & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (m3844extends != 49) {
                            if (m3844extends != 50) {
                                continue;
                            } else {
                                Object yandex = AbstractC9259e.metrica.yandex(m3849throw & 1048575, obj);
                                this.smaato.getClass();
                                C3882e c3882e = (C3882e) yandex;
                                if (c3882e.isEmpty()) {
                                    continue;
                                } else {
                                    if (((EnumC3844e) ((C6723e) this.vip[(i2 / 3) * 2]).ad.f3322e).f8489e != EnumC10711e.MESSAGE) {
                                        continue;
                                    } else {
                                        InterfaceC11969e interfaceC11969e = null;
                                        for (Object obj2 : c3882e.values()) {
                                            if (interfaceC11969e == null) {
                                                interfaceC11969e = C13571e.metrica.ad(obj2.getClass());
                                            }
                                            if (!interfaceC11969e.metrica(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) AbstractC9259e.metrica.yandex(m3849throw & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC11969e smaato = smaato(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (smaato.metrica(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    public final void mopub(int i, Object obj, Object obj2) {
        int i2 = this.ad[i];
        if (AbstractC9259e.metrica.yandex(m3849throw(i) & 1048575, obj) == null) {
            return;
        }
        advert(i);
    }

    /* renamed from: native, reason: not valid java name */
    public final void m3847native(Object obj, int i, int i2, AbstractC4765e abstractC4765e) {
        loadAd.putObject(obj, m3849throw(i2) & 1048575, abstractC4765e);
        m3845goto(i, i2, obj);
    }

    public final void premium(Object obj, long j, C11226e c11226e, InterfaceC11969e interfaceC11969e, C3758e c3758e) {
        int signatures;
        InterfaceC17042e ad = this.mopub.ad(j, obj);
        AbstractC3513e abstractC3513e = (AbstractC3513e) c11226e.appmetrica;
        int i = c11226e.vip;
        if ((i & 7) != 3) {
            throw C11690e.vip();
        }
        do {
            AbstractC18270e license = interfaceC11969e.license();
            c11226e.adcel(license, interfaceC11969e, c3758e);
            interfaceC11969e.vip(license);
            ((C2423e) ad).add(license);
            if (abstractC3513e.metrica() || c11226e.license != 0) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == i);
        c11226e.license = signatures;
    }

    public final void pro(int i, Object obj, Object obj2) {
        int[] iArr = this.ad;
        int i2 = iArr[i];
        if (admob(i2, i, obj2)) {
            long m3849throw = m3849throw(i) & 1048575;
            Unsafe unsafe = loadAd;
            Object object = unsafe.getObject(obj2, m3849throw);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC11969e smaato = smaato(i);
            if (!admob(i2, i, obj)) {
                if (Signature(object)) {
                    AbstractC18270e license = smaato.license();
                    smaato.ad(license, object);
                    unsafe.putObject(obj, m3849throw, license);
                } else {
                    unsafe.putObject(obj, m3849throw, object);
                }
                m3845goto(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m3849throw);
            if (!Signature(object2)) {
                AbstractC18270e license2 = smaato.license();
                smaato.ad(license2, object2);
                unsafe.putObject(obj, m3849throw, license2);
                object2 = license2;
            }
            smaato.ad(object2, object);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // defpackage.InterfaceC11969e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int purchase(defpackage.AbstractC18270e r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14797e.purchase(eٟؓ):int");
    }

    public final void remoteconfig(int i, Object obj, Object obj2) {
        if (amazon(i, obj2)) {
            long m3849throw = m3849throw(i) & 1048575;
            Unsafe unsafe = loadAd;
            Object object = unsafe.getObject(obj2, m3849throw);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.ad[i] + " is present but null: " + obj2);
            }
            InterfaceC11969e smaato = smaato(i);
            if (!amazon(i, obj)) {
                if (Signature(object)) {
                    AbstractC18270e license = smaato.license();
                    smaato.ad(license, object);
                    unsafe.putObject(obj, m3849throw, license);
                } else {
                    unsafe.putObject(obj, m3849throw, object);
                }
                m3846interface(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m3849throw);
            if (!Signature(object2)) {
                AbstractC18270e license2 = smaato.license();
                smaato.ad(license2, object2);
                unsafe.putObject(obj, m3849throw, license2);
                object2 = license2;
            }
            smaato.ad(object2, object);
        }
    }

    public final Object signatures(int i, Object obj) {
        InterfaceC11969e smaato = smaato(i);
        long m3849throw = m3849throw(i) & 1048575;
        if (!amazon(i, obj)) {
            return smaato.license();
        }
        Object object = loadAd.getObject(obj, m3849throw);
        if (Signature(object)) {
            return object;
        }
        AbstractC18270e license = smaato.license();
        if (object != null) {
            smaato.ad(license, object);
        }
        return license;
    }

    public final InterfaceC11969e smaato(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.vip;
        InterfaceC11969e interfaceC11969e = (InterfaceC11969e) objArr[i2];
        if (interfaceC11969e != null) {
            return interfaceC11969e;
        }
        InterfaceC11969e ad = C13571e.metrica.ad((Class) objArr[i2 + 1]);
        objArr[i2] = ad;
        return ad;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.InterfaceC11969e
    public final void startapp(java.lang.Object r19, defpackage.C11226e r20, defpackage.C3758e r21) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14797e.startapp(java.lang.Object, eُؙۙ, eؕۦَ):void");
    }

    public final void subs(Object obj, int i, C11226e c11226e, InterfaceC11969e interfaceC11969e, C3758e c3758e) {
        int signatures;
        InterfaceC17042e ad = this.mopub.ad(i & 1048575, obj);
        AbstractC3513e abstractC3513e = (AbstractC3513e) c11226e.appmetrica;
        int i2 = c11226e.vip;
        if ((i2 & 7) != 2) {
            throw C11690e.vip();
        }
        do {
            AbstractC18270e license = interfaceC11969e.license();
            c11226e.smaato(license, interfaceC11969e, c3758e);
            interfaceC11969e.vip(license);
            ((C2423e) ad).add(license);
            if (abstractC3513e.metrica() || c11226e.license != 0) {
                return;
            } else {
                signatures = abstractC3513e.signatures();
            }
        } while (signatures == i2);
        c11226e.license = signatures;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r0.license(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void subscription(java.lang.Object r9, int r10, java.lang.Object r11, defpackage.C3758e r12, defpackage.C11226e r13) {
        /*
            r8 = this;
            int r10 = r8.m3849throw(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            eٌؑؔ r10 = defpackage.AbstractC9259e.metrica
            java.lang.Object r10 = r10.yandex(r0, r9)
            eِؕٔ r2 = r8.smaato
            if (r10 != 0) goto L20
            r2.getClass()
            eؖؕۤ r10 = defpackage.C3882e.f8708e
            eؖؕۤ r10 = r10.vip()
            defpackage.AbstractC9259e.loadAd(r0, r9, r10)
            goto L3a
        L20:
            r2.getClass()
            r3 = r10
            eؖؕۤ r3 = (defpackage.C3882e) r3
            boolean r3 = r3.f8709e
            if (r3 != 0) goto L3a
            r2.getClass()
            eؖؕۤ r3 = defpackage.C3882e.f8708e
            eؖؕۤ r3 = r3.vip()
            r2.ad(r3, r10)
            defpackage.AbstractC9259e.loadAd(r0, r9, r3)
            r10 = r3
        L3a:
            r2.getClass()
            eؖؕۤ r10 = (defpackage.C3882e) r10
            r2.getClass()
            eؙۡۧ r11 = (defpackage.C6723e) r11
            eٍؚؒ r9 = r11.ad
            r11 = 2
            r13.m3077continue(r11)
            java.lang.Object r0 = r13.appmetrica
            eؕٞؐ r0 = (defpackage.AbstractC3513e) r0
            int r1 = r0.tapsense()
            int r1 = r0.appmetrica(r1)
            java.lang.Object r2 = r9.f3321e
            java.lang.String r3 = ""
            r4 = r2
        L5b:
            int r5 = r13.appmetrica()     // Catch: java.lang.Throwable -> L7f
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto La7
            boolean r6 = r0.metrica()     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto L6b
            goto La7
        L6b:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L90
            if (r5 == r11) goto L83
            boolean r5 = r13.m3120public()     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
            if (r5 == 0) goto L79
            goto L5b
        L79:
            eِِۧ r5 = new eِِۧ     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
            throw r5     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
        L7f:
            r9 = move-exception
            goto Lae
        L81:
            r5 = move-exception
            goto L9a
        L83:
            java.lang.Object r5 = r9.f3322e     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
            eؖؓ۟ r5 = (defpackage.EnumC3844e) r5     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
            java.lang.Object r4 = r13.subs(r5, r6, r12)     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
            goto L5b
        L90:
            java.lang.Object r5 = r9.f3323e     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
            eؖؓ۟ r5 = (defpackage.EnumC3844e) r5     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
            r6 = 0
            java.lang.Object r3 = r13.subs(r5, r6, r6)     // Catch: java.lang.Throwable -> L7f defpackage.C2129e -> L81
            goto L5b
        L9a:
            boolean r6 = r13.m3120public()     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto La1
            goto L5b
        La1:
            eِِۧ r9 = new eِِۧ     // Catch: java.lang.Throwable -> L7f
            r9.<init>(r7, r5)     // Catch: java.lang.Throwable -> L7f
            throw r9     // Catch: java.lang.Throwable -> L7f
        La7:
            r10.put(r3, r4)     // Catch: java.lang.Throwable -> L7f
            r0.license(r1)
            return
        Lae:
            r0.license(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14797e.subscription(java.lang.Object, int, java.lang.Object, eؕۦَ, eُؙۙ):void");
    }

    public final Object tapsense(int i, int i2, Object obj) {
        InterfaceC11969e smaato = smaato(i2);
        if (!admob(i, i2, obj)) {
            return smaato.license();
        }
        Object object = loadAd.getObject(obj, m3849throw(i2) & 1048575);
        if (Signature(object)) {
            return object;
        }
        AbstractC18270e license = smaato.license();
        if (object != null) {
            smaato.ad(license, object);
        }
        return license;
    }

    /* renamed from: this, reason: not valid java name */
    public final void m3848this(Object obj, int i, AbstractC4765e abstractC4765e) {
        loadAd.putObject(obj, m3849throw(i) & 1048575, abstractC4765e);
        m3846interface(i, obj);
    }

    /* renamed from: throw, reason: not valid java name */
    public final int m3849throw(int i) {
        return this.ad[i + 1];
    }

    @Override // defpackage.InterfaceC11969e
    public final void vip(Object obj) {
        if (Signature(obj)) {
            if (obj instanceof AbstractC18270e) {
                AbstractC18270e abstractC18270e = (AbstractC18270e) obj;
                abstractC18270e.mopub(Alert.DURATION_SHOW_INDEFINITELY);
                abstractC18270e.memoizedHashCode = 0;
                abstractC18270e.yandex();
            }
            int[] iArr = this.ad;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int m3849throw = m3849throw(i);
                long j = 1048575 & m3849throw;
                int m3844extends = m3844extends(m3849throw);
                if (m3844extends != 9) {
                    if (m3844extends != 60 && m3844extends != 68) {
                        switch (m3844extends) {
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
                                this.mopub.getClass();
                                AbstractC11000e abstractC11000e = (AbstractC11000e) ((InterfaceC17042e) AbstractC9259e.metrica.yandex(j, obj));
                                if (abstractC11000e.f21788e) {
                                    abstractC11000e.f21788e = false;
                                    break;
                                } else {
                                    break;
                                }
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                Unsafe unsafe = loadAd;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.smaato.getClass();
                                    ((C3882e) object).f8709e = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (admob(iArr[i], i, obj)) {
                        smaato(i).vip(loadAd.getObject(obj, j));
                    }
                }
                if (amazon(i, obj)) {
                    smaato(i).vip(loadAd.getObject(obj, j));
                }
            }
            this.advert.getClass();
            C16724e c16724e = ((AbstractC18270e) obj).unknownFields;
            if (c16724e.appmetrica) {
                c16724e.appmetrica = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x004e. Please report as an issue. */
    /* renamed from: while, reason: not valid java name */
    public final void m3850while(C6594e c6594e, Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        C14797e c14797e = this;
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int[] iArr = c14797e.ad;
        int length = iArr.length;
        Unsafe unsafe = loadAd;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int m3849throw = c14797e.m3849throw(i8);
            int i10 = iArr[i8];
            int m3844extends = m3844extends(m3849throw);
            if (m3844extends <= 17) {
                int i11 = iArr[i8 + 2];
                i = 1;
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i9 = i12 == i6 ? 0 : unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                i2 = m3849throw;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = 1;
                i2 = m3849throw;
                i3 = 0;
            }
            long j = i2 & i6;
            switch (m3844extends) {
                case 0:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        double license = AbstractC9259e.metrica.license(j, obj);
                        c15997e.getClass();
                        c15997e.isPro(i10, Double.doubleToRawLongBits(license));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        float appmetrica = AbstractC9259e.metrica.appmetrica(j, obj);
                        c15997e.getClass();
                        c15997e.isVip(i10, Float.floatToRawIntBits(appmetrica));
                    }
                    c14797e = this;
                    break;
                case 2:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.m4098goto(i10, unsafe.getLong(obj, j));
                    }
                    c14797e = this;
                    break;
                case 3:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.m4098goto(i10, unsafe.getLong(obj, j));
                    }
                    c14797e = this;
                    break;
                case 4:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.ads(i10, unsafe.getInt(obj, j));
                    }
                    c14797e = this;
                    break;
                case 5:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.isPro(i10, unsafe.getLong(obj, j));
                    }
                    c14797e = this;
                    break;
                case 6:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.isVip(i10, unsafe.getInt(obj, j));
                    }
                    c14797e = this;
                    break;
                case 7:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.pro(i10, AbstractC9259e.metrica.metrica(j, obj));
                    }
                    c14797e = this;
                    break;
                case 8:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            c15997e.subs(i10, (String) object);
                        } else {
                            c15997e.signatures(i10, (C6283e) object);
                        }
                    }
                    c14797e = this;
                    break;
                case 9:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c6594e.m2220e(i10, unsafe.getObject(obj, j), c14797e.smaato(i8));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.signatures(i10, (C6283e) unsafe.getObject(obj, j));
                    }
                    c14797e = this;
                    break;
                case 11:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.m4097class(i10, unsafe.getInt(obj, j));
                    }
                    c14797e = this;
                    break;
                case 12:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.ads(i10, unsafe.getInt(obj, j));
                    }
                    c14797e = this;
                    break;
                case 13:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.isVip(i10, unsafe.getInt(obj, j));
                    }
                    c14797e = this;
                    break;
                case 14:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        c15997e.isPro(i10, unsafe.getLong(obj, j));
                    }
                    c14797e = this;
                    break;
                case 15:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        int i13 = unsafe.getInt(obj, j);
                        c15997e.m4097class(i10, (i13 >> 31) ^ (i13 << 1));
                    }
                    c14797e = this;
                    break;
                case 16:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        c15997e.m4098goto(i10, (j2 >> 63) ^ (j2 << 1));
                    }
                    c14797e = this;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c14797e.loadAd(obj, i8, i7, i9, i3)) {
                        Object object2 = unsafe.getObject(obj, j);
                        c15997e.firebase(i10, 3);
                        c14797e.smaato(i8).yandex(c6594e, (AbstractC4765e) object2);
                        c15997e.firebase(i10, 4);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    i4 = i7;
                    AbstractC5630e.amazon(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    i4 = i7;
                    AbstractC5630e.subscription(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case 20:
                    i4 = i7;
                    AbstractC5630e.pro(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case 21:
                    i4 = i7;
                    AbstractC5630e.applovin(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case 22:
                    i4 = i7;
                    AbstractC5630e.remoteconfig(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case 23:
                    i4 = i7;
                    AbstractC5630e.admob(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    i4 = i7;
                    AbstractC5630e.Signature(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    i4 = i7;
                    AbstractC5630e.smaato(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    i5 = i7;
                    int i14 = iArr[i8];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = AbstractC5630e.ad;
                    if (list != null && !list.isEmpty()) {
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            c15997e.subs(i14, (String) list.get(i15));
                        }
                    }
                    i7 = i5;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i5 = i7;
                    int i16 = iArr[i8];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC11969e smaato = c14797e.smaato(i8);
                    Class cls2 = AbstractC5630e.ad;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            c6594e.m2220e(i16, list2.get(i17), smaato);
                        }
                    }
                    i7 = i5;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    i5 = i7;
                    int i18 = iArr[i8];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = AbstractC5630e.ad;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            c15997e.signatures(i18, (C6283e) list3.get(i19));
                        }
                    }
                    i7 = i5;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    i4 = i7;
                    z = false;
                    AbstractC5630e.isPro(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case 30:
                    i4 = i7;
                    z = false;
                    AbstractC5630e.loadAd(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case 31:
                    i4 = i7;
                    z = false;
                    AbstractC5630e.signatures(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case 32:
                    i4 = i7;
                    z = false;
                    AbstractC5630e.tapsense(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    i4 = i7;
                    z = false;
                    AbstractC5630e.isVip(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    i4 = i7;
                    z = false;
                    AbstractC5630e.inmobi(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, false);
                    i7 = i4;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    i5 = i7;
                    AbstractC5630e.amazon(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    i5 = i7;
                    AbstractC5630e.subscription(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    i5 = i7;
                    AbstractC5630e.pro(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    i5 = i7;
                    AbstractC5630e.applovin(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i5 = i7;
                    AbstractC5630e.remoteconfig(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i5 = i7;
                    AbstractC5630e.admob(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i5 = i7;
                    AbstractC5630e.Signature(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i5 = i7;
                    AbstractC5630e.smaato(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i5 = i7;
                    AbstractC5630e.isPro(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i5 = i7;
                    AbstractC5630e.loadAd(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i5 = i7;
                    AbstractC5630e.signatures(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i5 = i7;
                    AbstractC5630e.tapsense(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i5 = i7;
                    AbstractC5630e.isVip(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, i == true ? 1 : 0);
                    i7 = i5;
                    break;
                case 48:
                    i5 = i7;
                    AbstractC5630e.inmobi(iArr[i8], (List) unsafe.getObject(obj, j), c6594e, true);
                    i7 = i5;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i5 = i7;
                    int i20 = iArr[i8];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC11969e smaato2 = c14797e.smaato(i8);
                    Class cls4 = AbstractC5630e.ad;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            AbstractC4765e abstractC4765e = (AbstractC4765e) list4.get(i21);
                            c15997e.firebase(i20, 3);
                            smaato2.yandex(c6594e, abstractC4765e);
                            c15997e.firebase(i20, 4);
                        }
                    }
                    i7 = i5;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        int i22 = 2;
                        Object obj2 = c14797e.vip[(i8 / 3) * 2];
                        c14797e.smaato.getClass();
                        C0909e c0909e = ((C6723e) obj2).ad;
                        c15997e.getClass();
                        for (Map.Entry entry : ((C3882e) object3).entrySet()) {
                            c15997e.firebase(i10, i22);
                            c15997e.m4099interface(C6723e.ad(c0909e, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C10247e.metrica(c15997e, (EnumC3844e) c0909e.f3323e, i, key);
                            i22 = 2;
                            C10247e.metrica(c15997e, (EnumC3844e) c0909e.f3322e, 2, value);
                            i7 = i7;
                            i = 1;
                        }
                    }
                    i5 = i7;
                    i7 = i5;
                    break;
                case 51:
                    if (c14797e.admob(i10, i8, obj)) {
                        double doubleValue = ((Double) AbstractC9259e.metrica.yandex(j, obj)).doubleValue();
                        c15997e.getClass();
                        c15997e.isPro(i10, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case 52:
                    if (c14797e.admob(i10, i8, obj)) {
                        float floatValue = ((Float) AbstractC9259e.metrica.yandex(j, obj)).floatValue();
                        c15997e.getClass();
                        c15997e.isVip(i10, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.m4098goto(i10, applovin(j, obj));
                    }
                    break;
                case 54:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.m4098goto(i10, applovin(j, obj));
                    }
                    break;
                case 55:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.ads(i10, isPro(j, obj));
                    }
                    break;
                case 56:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.isPro(i10, applovin(j, obj));
                    }
                    break;
                case 57:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.isVip(i10, isPro(j, obj));
                    }
                    break;
                case 58:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.pro(i10, ((Boolean) AbstractC9259e.metrica.yandex(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (c14797e.admob(i10, i8, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            c15997e.subs(i10, (String) object4);
                        } else {
                            c15997e.signatures(i10, (C6283e) object4);
                        }
                    }
                    break;
                case 60:
                    if (c14797e.admob(i10, i8, obj)) {
                        c6594e.m2220e(i10, unsafe.getObject(obj, j), c14797e.smaato(i8));
                    }
                    break;
                case 61:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.signatures(i10, (C6283e) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.m4097class(i10, isPro(j, obj));
                    }
                    break;
                case 63:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.ads(i10, isPro(j, obj));
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.isVip(i10, isPro(j, obj));
                    }
                    break;
                case 65:
                    if (c14797e.admob(i10, i8, obj)) {
                        c15997e.isPro(i10, applovin(j, obj));
                    }
                    break;
                case 66:
                    if (c14797e.admob(i10, i8, obj)) {
                        int isPro = isPro(j, obj);
                        c15997e.m4097class(i10, (isPro >> 31) ^ (isPro << 1));
                    }
                    break;
                case 67:
                    if (c14797e.admob(i10, i8, obj)) {
                        long applovin = applovin(j, obj);
                        c15997e.m4098goto(i10, (applovin >> 63) ^ (applovin << (i == true ? 1L : 0L)));
                    }
                    break;
                case 68:
                    if (c14797e.admob(i10, i8, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        c15997e.firebase(i10, 3);
                        c14797e.smaato(i8).yandex(c6594e, (AbstractC4765e) object5);
                        c15997e.firebase(i10, 4);
                    }
                    break;
            }
            i8 += 3;
            i6 = 1048575;
        }
        c14797e.advert.getClass();
        ((AbstractC18270e) obj).unknownFields.license(c6594e);
    }

    @Override // defpackage.InterfaceC11969e
    public final void yandex(C6594e c6594e, Object obj) {
        m3850while(c6594e, obj);
    }
}
