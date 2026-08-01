package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2546e implements InterfaceC3028e {
    public static final int[] amazon = new int[0];
    public static final Unsafe loadAd = AbstractC14352e.adcel();
    public final int[] ad;
    public final C12993e adcel;
    public final C3756e advert;
    public final AbstractC6866e appmetrica;
    public final int[] billing;
    public final int license;
    public final int metrica;
    public final C14350e mopub;
    public final boolean purchase;
    public final C5614e smaato;
    public final int startapp;
    public final Object[] vip;
    public final int yandex;

    public C2546e(int[] iArr, Object[] objArr, int i, int i2, AbstractC6866e abstractC6866e, int[] iArr2, int i3, int i4, C12993e c12993e, C14350e c14350e, C3756e c3756e, C8901e c8901e, C5614e c5614e) {
        this.ad = iArr;
        this.vip = objArr;
        this.metrica = i;
        this.license = i2;
        this.purchase = abstractC6866e instanceof AbstractC4994e;
        this.billing = iArr2;
        this.yandex = i3;
        this.startapp = i4;
        this.adcel = c12993e;
        this.mopub = c14350e;
        this.advert = c3756e;
        this.appmetrica = abstractC6866e;
        this.smaato = c5614e;
    }

    public static long ads(int i) {
        return i & 1048575;
    }

    public static void advert(Object obj) {
        if (!remoteconfig(obj)) {
            throw new IllegalArgumentException(AbstractC1634e.advert(obj, "Mutating immutable message: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C2546e applovin(defpackage.C14702e r36, defpackage.C12993e r37, defpackage.C14350e r38, defpackage.C3756e r39, defpackage.C8901e r40, defpackage.C5614e r41) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2546e.applovin(eٌٔٓ, eْؓؓ, eٓۤؓ, eؕۦؗ, eٌۣۖ, eؘْٗ):eًْؔ");
    }

    /* renamed from: default, reason: not valid java name */
    public static int m997default(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int premium(long j, Object obj) {
        return ((Integer) AbstractC14352e.metrica.startapp(j, obj)).intValue();
    }

    public static boolean remoteconfig(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC4994e) {
            return ((AbstractC4994e) obj).yandex();
        }
        return true;
    }

    public static long subs(long j, Object obj) {
        return ((Long) AbstractC14352e.metrica.startapp(j, obj)).longValue();
    }

    /* renamed from: throw, reason: not valid java name */
    public static Field m998throw(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
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
            throw new RuntimeException(applovin.toString());
        }
    }

    public final InterfaceC3028e Signature(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.vip;
        InterfaceC3028e interfaceC3028e = (InterfaceC3028e) objArr[i2];
        if (interfaceC3028e != null) {
            return interfaceC3028e;
        }
        InterfaceC3028e ad = C5623e.metrica.ad((Class) objArr[i2 + 1]);
        objArr[i2] = ad;
        return ad;
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m999abstract(int i, Object obj, Object obj2, int i2) {
        loadAd.putObject(obj, m1005implements(i2) & 1048575, obj2);
        m1010try(i, i2, obj);
    }

    @Override // defpackage.InterfaceC3028e
    public final void ad(Object obj, Object obj2) {
        Object obj3;
        advert(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.ad;
            if (i >= iArr.length) {
                AbstractC1505e.mopub(this.advert, obj, obj2);
                return;
            }
            int m1005implements = m1005implements(i);
            long j = 1048575 & m1005implements;
            int i2 = iArr[i];
            switch (m997default(m1005implements)) {
                case 0:
                    if (admob(i, obj2)) {
                        AbstractC5597e abstractC5597e = AbstractC14352e.metrica;
                        obj3 = obj;
                        abstractC5597e.smaato(obj3, j, abstractC5597e.appmetrica(j, obj2));
                        m1011while(i, obj3);
                        break;
                    }
                    break;
                case 1:
                    if (admob(i, obj2)) {
                        AbstractC5597e abstractC5597e2 = AbstractC14352e.metrica;
                        abstractC5597e2.amazon(obj, j, abstractC5597e2.purchase(j, obj2));
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 2:
                    if (admob(i, obj2)) {
                        AbstractC14352e.loadAd(j, AbstractC14352e.metrica.yandex(j, obj2), obj);
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 3:
                    if (admob(i, obj2)) {
                        AbstractC14352e.loadAd(j, AbstractC14352e.metrica.yandex(j, obj2), obj);
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 4:
                    if (admob(i, obj2)) {
                        AbstractC14352e.amazon(j, obj, AbstractC14352e.metrica.billing(j, obj2));
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 5:
                    if (admob(i, obj2)) {
                        AbstractC14352e.loadAd(j, AbstractC14352e.metrica.yandex(j, obj2), obj);
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 6:
                    if (admob(i, obj2)) {
                        AbstractC14352e.amazon(j, obj, AbstractC14352e.metrica.billing(j, obj2));
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 7:
                    if (admob(i, obj2)) {
                        AbstractC5597e abstractC5597e3 = AbstractC14352e.metrica;
                        abstractC5597e3.mopub(obj, j, abstractC5597e3.metrica(j, obj2));
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 8:
                    if (admob(i, obj2)) {
                        AbstractC14352e.Signature(j, obj, AbstractC14352e.metrica.startapp(j, obj2));
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 9:
                    tapsense(i, obj, obj2);
                    break;
                case 10:
                    if (admob(i, obj2)) {
                        AbstractC14352e.Signature(j, obj, AbstractC14352e.metrica.startapp(j, obj2));
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 11:
                    if (admob(i, obj2)) {
                        AbstractC14352e.amazon(j, obj, AbstractC14352e.metrica.billing(j, obj2));
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 12:
                    if (admob(i, obj2)) {
                        AbstractC14352e.amazon(j, obj, AbstractC14352e.metrica.billing(j, obj2));
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 13:
                    if (admob(i, obj2)) {
                        AbstractC14352e.amazon(j, obj, AbstractC14352e.metrica.billing(j, obj2));
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 14:
                    if (admob(i, obj2)) {
                        AbstractC14352e.loadAd(j, AbstractC14352e.metrica.yandex(j, obj2), obj);
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 15:
                    if (admob(i, obj2)) {
                        AbstractC14352e.amazon(j, obj, AbstractC14352e.metrica.billing(j, obj2));
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case 16:
                    if (admob(i, obj2)) {
                        AbstractC14352e.loadAd(j, AbstractC14352e.metrica.yandex(j, obj2), obj);
                        m1011while(i, obj);
                        break;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    tapsense(i, obj, obj2);
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
                    AbstractC5597e abstractC5597e4 = AbstractC14352e.metrica;
                    InterfaceC4115e interfaceC4115e = (InterfaceC4115e) abstractC5597e4.startapp(j, obj);
                    InterfaceC4115e interfaceC4115e2 = (InterfaceC4115e) abstractC5597e4.startapp(j, obj2);
                    int size = interfaceC4115e.size();
                    int size2 = interfaceC4115e2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC5360e) interfaceC4115e).f11481e) {
                            interfaceC4115e = interfaceC4115e.metrica(size2 + size);
                        }
                        interfaceC4115e.addAll(interfaceC4115e2);
                    }
                    if (size > 0) {
                        interfaceC4115e2 = interfaceC4115e;
                    }
                    AbstractC14352e.Signature(j, obj, interfaceC4115e2);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = AbstractC1505e.ad;
                    AbstractC5597e abstractC5597e5 = AbstractC14352e.metrica;
                    AbstractC14352e.Signature(j, obj, this.smaato.ad(abstractC5597e5.startapp(j, obj), abstractC5597e5.startapp(j, obj2)));
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
                    if (pro(i2, i, obj2)) {
                        AbstractC14352e.Signature(j, obj, AbstractC14352e.metrica.startapp(j, obj2));
                        m1010try(i2, i, obj);
                        break;
                    }
                    break;
                case 60:
                    isVip(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (pro(i2, i, obj2)) {
                        AbstractC14352e.Signature(j, obj, AbstractC14352e.metrica.startapp(j, obj2));
                        m1010try(i2, i, obj);
                        break;
                    }
                    break;
                case 68:
                    isVip(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (defpackage.AbstractC1505e.advert(r5.startapp(r7, r12), r5.startapp(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.yandex(r7, r12) == r5.yandex(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.yandex(r7, r12) == r5.yandex(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (defpackage.AbstractC1505e.advert(r5.startapp(r7, r12), r5.startapp(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (defpackage.AbstractC1505e.advert(r5.startapp(r7, r12), r5.startapp(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (defpackage.AbstractC1505e.advert(r5.startapp(r7, r12), r5.startapp(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.metrica(r7, r12) == r5.metrica(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.yandex(r7, r12) == r5.yandex(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.billing(r7, r12) == r5.billing(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.yandex(r7, r12) == r5.yandex(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.yandex(r7, r12) == r5.yandex(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.purchase(r7, r12)) == java.lang.Float.floatToIntBits(r5.purchase(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.appmetrica(r7, r12)) == java.lang.Double.doubleToLongBits(r5.appmetrica(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (defpackage.AbstractC1505e.advert(r9.startapp(r7, r12), r9.startapp(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // defpackage.InterfaceC3028e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean adcel(defpackage.AbstractC4994e r12, defpackage.AbstractC4994e r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2546e.adcel(eؗٚۘ, eؗٚۘ):boolean");
    }

    public final boolean admob(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int m1005implements = m1005implements(i);
            long j2 = m1005implements & 1048575;
            switch (m997default(m1005implements)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC14352e.metrica.appmetrica(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC14352e.metrica.purchase(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC14352e.metrica.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC14352e.metrica.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC14352e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC14352e.metrica.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC14352e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC14352e.metrica.metrica(j2, obj);
                case 8:
                    Object startapp = AbstractC14352e.metrica.startapp(j2, obj);
                    if (startapp instanceof String) {
                        return !((String) startapp).isEmpty();
                    }
                    if (startapp instanceof AbstractC4002e) {
                        return !AbstractC4002e.f8908e.equals(startapp);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC14352e.metrica.startapp(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC4002e.f8908e.equals(AbstractC14352e.metrica.startapp(j2, obj));
                case 11:
                    if (AbstractC14352e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC14352e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC14352e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC14352e.metrica.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC14352e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC14352e.metrica.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (AbstractC14352e.metrica.startapp(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & AbstractC14352e.metrica.billing(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void amazon(int i) {
        if (this.vip[AbstractC5087e.m1751protected(i, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0047. Please report as an issue. */
    @Override // defpackage.InterfaceC3028e
    public final int appmetrica(AbstractC4994e abstractC4994e) {
        int i;
        int adcel;
        int adcel2;
        int adcel3;
        int advert;
        int adcel4;
        int advert2;
        int adcel5;
        int adcel6;
        int adcel7;
        int vip;
        int mopub;
        int purchase;
        int adcel8;
        int vip2;
        int metrica;
        int adcel9;
        int size;
        int startapp;
        int adcel10;
        int adcel11;
        int size2;
        int adcel12;
        int mopub2;
        int i2;
        int adcel13;
        int adcel14;
        int advert3;
        int adcel15;
        int advert4;
        int i3;
        C2546e c2546e = this;
        AbstractC4994e abstractC4994e2 = abstractC4994e;
        Unsafe unsafe = loadAd;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = c2546e.ad;
            if (i4 >= iArr.length) {
                c2546e.advert.getClass();
                return abstractC4994e2.unknownFields.vip() + i6;
            }
            int m1005implements = c2546e.m1005implements(i4);
            int m997default = m997default(m1005implements);
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & 1048575;
            if (m997default <= 17) {
                if (i10 != i7) {
                    i5 = i10 == 1048575 ? 0 : unsafe.getInt(abstractC4994e2, i10);
                    i7 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = m1005implements & 1048575;
            if (m997default >= EnumC13986e.f27701e.f27703e) {
                int i11 = EnumC13986e.f27700e.f27703e;
            }
            switch (m997default) {
                case 0:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        adcel = AbstractC16754e.adcel(i8);
                        metrica = adcel + 8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 1:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        adcel2 = AbstractC16754e.adcel(i8);
                        adcel6 = adcel2 + 4;
                        i6 += adcel6;
                    }
                    c2546e = this;
                    abstractC4994e2 = abstractC4994e;
                    i4 += 3;
                case 2:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(abstractC4994e2, j);
                        adcel3 = AbstractC16754e.adcel(i8);
                        advert = AbstractC16754e.advert(j2);
                        i6 += advert + adcel3;
                    }
                    c2546e = this;
                    i4 += 3;
                case 3:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(abstractC4994e2, j);
                        adcel3 = AbstractC16754e.adcel(i8);
                        advert = AbstractC16754e.advert(j3);
                        i6 += advert + adcel3;
                    }
                    c2546e = this;
                    i4 += 3;
                case 4:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        int i12 = unsafe.getInt(abstractC4994e2, j);
                        adcel4 = AbstractC16754e.adcel(i8);
                        advert2 = AbstractC16754e.advert(i12);
                        purchase = advert2 + adcel4;
                        i6 += purchase;
                    }
                    c2546e = this;
                    i4 += 3;
                case 5:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        adcel5 = AbstractC16754e.adcel(i8);
                        adcel6 = adcel5 + 8;
                        i6 += adcel6;
                    }
                    c2546e = this;
                    abstractC4994e2 = abstractC4994e;
                    i4 += 3;
                case 6:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        adcel2 = AbstractC16754e.adcel(i8);
                        adcel6 = adcel2 + 4;
                        i6 += adcel6;
                    }
                    c2546e = this;
                    abstractC4994e2 = abstractC4994e;
                    i4 += 3;
                case 7:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        adcel6 = AbstractC16754e.adcel(i8) + 1;
                        i6 += adcel6;
                    }
                    c2546e = this;
                    abstractC4994e2 = abstractC4994e;
                    i4 += 3;
                case 8:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        Object object = unsafe.getObject(abstractC4994e2, j);
                        i6 = (object instanceof AbstractC4002e ? AbstractC16754e.purchase(i8, (AbstractC4002e) object) : AbstractC16754e.startapp((String) object) + AbstractC16754e.adcel(i8)) + i6;
                    }
                    c2546e = this;
                    i4 += 3;
                case 9:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        Object object2 = unsafe.getObject(abstractC4994e2, j);
                        InterfaceC3028e Signature = c2546e.Signature(i4);
                        Class cls = AbstractC1505e.ad;
                        adcel7 = AbstractC16754e.adcel(i8);
                        vip = ((AbstractC6866e) object2).vip(Signature);
                        mopub = AbstractC16754e.mopub(vip);
                        i3 = mopub + vip + adcel7;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 10:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        purchase = AbstractC16754e.purchase(i8, (AbstractC4002e) unsafe.getObject(abstractC4994e2, j));
                        i6 += purchase;
                    }
                    c2546e = this;
                    i4 += 3;
                case 11:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        int i13 = unsafe.getInt(abstractC4994e2, j);
                        adcel4 = AbstractC16754e.adcel(i8);
                        advert2 = AbstractC16754e.mopub(i13);
                        purchase = advert2 + adcel4;
                        i6 += purchase;
                    }
                    c2546e = this;
                    i4 += 3;
                case 12:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        int i14 = unsafe.getInt(abstractC4994e2, j);
                        adcel4 = AbstractC16754e.adcel(i8);
                        advert2 = AbstractC16754e.advert(i14);
                        purchase = advert2 + adcel4;
                        i6 += purchase;
                    }
                    c2546e = this;
                    i4 += 3;
                case 13:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        adcel2 = AbstractC16754e.adcel(i8);
                        adcel6 = adcel2 + 4;
                        i6 += adcel6;
                    }
                    c2546e = this;
                    abstractC4994e2 = abstractC4994e;
                    i4 += 3;
                case 14:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        adcel5 = AbstractC16754e.adcel(i8);
                        adcel6 = adcel5 + 8;
                        i6 += adcel6;
                    }
                    c2546e = this;
                    abstractC4994e2 = abstractC4994e;
                    i4 += 3;
                case 15:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(abstractC4994e2, j);
                        adcel4 = AbstractC16754e.adcel(i8);
                        advert2 = AbstractC16754e.billing(i15);
                        purchase = advert2 + adcel4;
                        i6 += purchase;
                    }
                    c2546e = this;
                    i4 += 3;
                case 16:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        long j4 = unsafe.getLong(abstractC4994e2, j);
                        adcel3 = AbstractC16754e.adcel(i8);
                        advert = AbstractC16754e.yandex(j4);
                        i6 += advert + adcel3;
                    }
                    c2546e = this;
                    i4 += 3;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c2546e.subscription(abstractC4994e2, i4, i7, i5, i)) {
                        AbstractC6866e abstractC6866e = (AbstractC6866e) unsafe.getObject(abstractC4994e2, j);
                        InterfaceC3028e Signature2 = c2546e.Signature(i4);
                        adcel8 = AbstractC16754e.adcel(i8) * 2;
                        vip2 = abstractC6866e.vip(Signature2);
                        metrica = vip2 + adcel8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    metrica = AbstractC1505e.metrica(i8, (List) unsafe.getObject(abstractC4994e2, j));
                    i6 += metrica;
                    i4 += 3;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    metrica = AbstractC1505e.vip(i8, (List) unsafe.getObject(abstractC4994e2, j));
                    i6 += metrica;
                    i4 += 3;
                case 20:
                    List list = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls2 = AbstractC1505e.ad;
                    if (list.size() != 0) {
                        adcel9 = (AbstractC16754e.adcel(i8) * list.size()) + AbstractC1505e.appmetrica(list);
                        i6 += adcel9;
                        i4 += 3;
                    }
                    adcel9 = 0;
                    i6 += adcel9;
                    i4 += 3;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls3 = AbstractC1505e.ad;
                    size = list2.size();
                    if (size != 0) {
                        startapp = AbstractC1505e.startapp(list2);
                        adcel10 = AbstractC16754e.adcel(i8);
                        adcel9 = (adcel10 * size) + startapp;
                        i6 += adcel9;
                        i4 += 3;
                    }
                    adcel9 = 0;
                    i6 += adcel9;
                    i4 += 3;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls4 = AbstractC1505e.ad;
                    size = list3.size();
                    if (size != 0) {
                        startapp = AbstractC1505e.license(list3);
                        adcel10 = AbstractC16754e.adcel(i8);
                        adcel9 = (adcel10 * size) + startapp;
                        i6 += adcel9;
                        i4 += 3;
                    }
                    adcel9 = 0;
                    i6 += adcel9;
                    i4 += 3;
                case 23:
                    metrica = AbstractC1505e.metrica(i8, (List) unsafe.getObject(abstractC4994e2, j));
                    i6 += metrica;
                    i4 += 3;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    metrica = AbstractC1505e.vip(i8, (List) unsafe.getObject(abstractC4994e2, j));
                    i6 += metrica;
                    i4 += 3;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls5 = AbstractC1505e.ad;
                    int size3 = list4.size();
                    i6 += size3 == 0 ? 0 : (AbstractC16754e.adcel(i8) + 1) * size3;
                    i4 += 3;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls6 = AbstractC1505e.ad;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        adcel9 = AbstractC16754e.adcel(i8) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof AbstractC4002e) {
                                int size5 = ((AbstractC4002e) obj).size();
                                adcel9 = AbstractC16754e.mopub(size5) + size5 + adcel9;
                            } else {
                                adcel9 = AbstractC16754e.startapp((String) obj) + adcel9;
                            }
                        }
                        i6 += adcel9;
                        i4 += 3;
                    }
                    adcel9 = 0;
                    i6 += adcel9;
                    i4 += 3;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC4994e2, j);
                    InterfaceC3028e Signature3 = c2546e.Signature(i4);
                    Class cls7 = AbstractC1505e.ad;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        adcel11 = 0;
                    } else {
                        adcel11 = AbstractC16754e.adcel(i8) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int vip3 = ((AbstractC6866e) list6.get(i17)).vip(Signature3);
                            adcel11 += AbstractC16754e.mopub(vip3) + vip3;
                        }
                    }
                    i6 += adcel11;
                    i4 += 3;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls8 = AbstractC1505e.ad;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        adcel9 = AbstractC16754e.adcel(i8) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((AbstractC4002e) list7.get(i18)).size();
                            adcel9 += AbstractC16754e.mopub(size8) + size8;
                        }
                        i6 += adcel9;
                        i4 += 3;
                    }
                    adcel9 = 0;
                    i6 += adcel9;
                    i4 += 3;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls9 = AbstractC1505e.ad;
                    size = list8.size();
                    if (size != 0) {
                        startapp = AbstractC1505e.yandex(list8);
                        adcel10 = AbstractC16754e.adcel(i8);
                        adcel9 = (adcel10 * size) + startapp;
                        i6 += adcel9;
                        i4 += 3;
                    }
                    adcel9 = 0;
                    i6 += adcel9;
                    i4 += 3;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls10 = AbstractC1505e.ad;
                    size = list9.size();
                    if (size != 0) {
                        startapp = AbstractC1505e.ad(list9);
                        adcel10 = AbstractC16754e.adcel(i8);
                        adcel9 = (adcel10 * size) + startapp;
                        i6 += adcel9;
                        i4 += 3;
                    }
                    adcel9 = 0;
                    i6 += adcel9;
                    i4 += 3;
                case 31:
                    metrica = AbstractC1505e.vip(i8, (List) unsafe.getObject(abstractC4994e2, j));
                    i6 += metrica;
                    i4 += 3;
                case 32:
                    metrica = AbstractC1505e.metrica(i8, (List) unsafe.getObject(abstractC4994e2, j));
                    i6 += metrica;
                    i4 += 3;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls11 = AbstractC1505e.ad;
                    size = list10.size();
                    if (size != 0) {
                        startapp = AbstractC1505e.purchase(list10);
                        adcel10 = AbstractC16754e.adcel(i8);
                        adcel9 = (adcel10 * size) + startapp;
                        i6 += adcel9;
                        i4 += 3;
                    }
                    adcel9 = 0;
                    i6 += adcel9;
                    i4 += 3;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls12 = AbstractC1505e.ad;
                    size = list11.size();
                    if (size != 0) {
                        startapp = AbstractC1505e.billing(list11);
                        adcel10 = AbstractC16754e.adcel(i8);
                        adcel9 = (adcel10 * size) + startapp;
                        i6 += adcel9;
                        i4 += 3;
                    }
                    adcel9 = 0;
                    i6 += adcel9;
                    i4 += 3;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls13 = AbstractC1505e.ad;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls14 = AbstractC1505e.ad;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = AbstractC1505e.appmetrica((List) unsafe.getObject(abstractC4994e2, j));
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = AbstractC1505e.startapp((List) unsafe.getObject(abstractC4994e2, j));
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = AbstractC1505e.license((List) unsafe.getObject(abstractC4994e2, j));
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls15 = AbstractC1505e.ad;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls16 = AbstractC1505e.ad;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls17 = AbstractC1505e.ad;
                    size2 = list16.size();
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = AbstractC1505e.yandex((List) unsafe.getObject(abstractC4994e2, j));
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = AbstractC1505e.ad((List) unsafe.getObject(abstractC4994e2, j));
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls18 = AbstractC1505e.ad;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(abstractC4994e2, j);
                    Class cls19 = AbstractC1505e.ad;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = AbstractC1505e.purchase((List) unsafe.getObject(abstractC4994e2, j));
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 48:
                    size2 = AbstractC1505e.billing((List) unsafe.getObject(abstractC4994e2, j));
                    if (size2 > 0) {
                        adcel12 = AbstractC16754e.adcel(i8);
                        mopub2 = AbstractC16754e.mopub(size2);
                        i6 += mopub2 + adcel12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC4994e2, j);
                    InterfaceC3028e Signature4 = c2546e.Signature(i4);
                    Class cls20 = AbstractC1505e.ad;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            i2 += ((AbstractC6866e) list19.get(i19)).vip(Signature4) + (AbstractC16754e.adcel(i8) * 2);
                        }
                    }
                    i6 += i2;
                    i4 += 3;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(abstractC4994e2, j);
                    Object loadAd2 = c2546e.loadAd(i4);
                    c2546e.smaato.getClass();
                    C4019e c4019e = (C4019e) object3;
                    if (loadAd2 != null) {
                        throw new ClassCastException();
                    }
                    if (c4019e.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c4019e.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                case 51:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        adcel = AbstractC16754e.adcel(i8);
                        metrica = adcel + 8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 52:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        adcel13 = AbstractC16754e.adcel(i8);
                        metrica = adcel13 + 4;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 53:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        long subs = subs(j, abstractC4994e2);
                        adcel14 = AbstractC16754e.adcel(i8);
                        advert3 = AbstractC16754e.advert(subs);
                        i3 = advert3 + adcel14;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 54:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        long subs2 = subs(j, abstractC4994e2);
                        adcel14 = AbstractC16754e.adcel(i8);
                        advert3 = AbstractC16754e.advert(subs2);
                        i3 = advert3 + adcel14;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 55:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        int premium = premium(j, abstractC4994e2);
                        adcel15 = AbstractC16754e.adcel(i8);
                        advert4 = AbstractC16754e.advert(premium);
                        metrica = advert4 + adcel15;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 56:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        adcel = AbstractC16754e.adcel(i8);
                        metrica = adcel + 8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 57:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        adcel13 = AbstractC16754e.adcel(i8);
                        metrica = adcel13 + 4;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 58:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        metrica = AbstractC16754e.adcel(i8) + 1;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 59:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        Object object4 = unsafe.getObject(abstractC4994e2, j);
                        i6 = (object4 instanceof AbstractC4002e ? AbstractC16754e.purchase(i8, (AbstractC4002e) object4) : AbstractC16754e.startapp((String) object4) + AbstractC16754e.adcel(i8)) + i6;
                    }
                    i4 += 3;
                case 60:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        Object object5 = unsafe.getObject(abstractC4994e2, j);
                        InterfaceC3028e Signature5 = c2546e.Signature(i4);
                        Class cls21 = AbstractC1505e.ad;
                        adcel7 = AbstractC16754e.adcel(i8);
                        vip = ((AbstractC6866e) object5).vip(Signature5);
                        mopub = AbstractC16754e.mopub(vip);
                        i3 = mopub + vip + adcel7;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 61:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        metrica = AbstractC16754e.purchase(i8, (AbstractC4002e) unsafe.getObject(abstractC4994e2, j));
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 62:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        int premium2 = premium(j, abstractC4994e2);
                        adcel15 = AbstractC16754e.adcel(i8);
                        advert4 = AbstractC16754e.mopub(premium2);
                        metrica = advert4 + adcel15;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 63:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        int premium3 = premium(j, abstractC4994e2);
                        adcel15 = AbstractC16754e.adcel(i8);
                        advert4 = AbstractC16754e.advert(premium3);
                        metrica = advert4 + adcel15;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        adcel13 = AbstractC16754e.adcel(i8);
                        metrica = adcel13 + 4;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 65:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        adcel = AbstractC16754e.adcel(i8);
                        metrica = adcel + 8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 66:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        int premium4 = premium(j, abstractC4994e2);
                        adcel15 = AbstractC16754e.adcel(i8);
                        advert4 = AbstractC16754e.billing(premium4);
                        metrica = advert4 + adcel15;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 67:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        long subs3 = subs(j, abstractC4994e2);
                        adcel14 = AbstractC16754e.adcel(i8);
                        advert3 = AbstractC16754e.yandex(subs3);
                        i3 = advert3 + adcel14;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 68:
                    if (c2546e.pro(i8, i4, abstractC4994e2)) {
                        AbstractC6866e abstractC6866e2 = (AbstractC6866e) unsafe.getObject(abstractC4994e2, j);
                        InterfaceC3028e Signature6 = c2546e.Signature(i4);
                        adcel8 = AbstractC16754e.adcel(i8) * 2;
                        vip2 = abstractC6866e2.vip(Signature6);
                        metrica = vip2 + adcel8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                default:
                    i4 += 3;
            }
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
    @Override // defpackage.InterfaceC3028e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int billing(defpackage.AbstractC4994e r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2546e.billing(eؗٚۘ):int");
    }

    /* renamed from: break, reason: not valid java name */
    public final void m1000break(int i, Object obj, Object obj2) {
        loadAd.putObject(obj, m1005implements(i) & 1048575, obj2);
        m1011while(i, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0045. Please report as an issue. */
    /* renamed from: case, reason: not valid java name */
    public final void m1001case(Object obj, C13935e c13935e) {
        int i;
        int i2;
        boolean z;
        C2546e c2546e = this;
        int[] iArr = c2546e.ad;
        int length = iArr.length;
        Unsafe unsafe = loadAd;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int m1005implements = c2546e.m1005implements(i5);
            int i7 = iArr[i5];
            int m997default = m997default(m1005implements);
            if (m997default <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = m1005implements;
                i2 = 1 << (i8 >>> 20);
            } else {
                i = m1005implements;
                i2 = 0;
            }
            long j = i & i3;
            switch (m997default) {
                case 0:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        double appmetrica = AbstractC14352e.metrica.appmetrica(j, obj);
                        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
                        abstractC16754e.getClass();
                        abstractC16754e.remoteconfig(i7, Double.doubleToRawLongBits(appmetrica));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 1:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        float purchase = AbstractC14352e.metrica.purchase(j, obj);
                        AbstractC16754e abstractC16754e2 = (AbstractC16754e) c13935e.f27641e;
                        abstractC16754e2.getClass();
                        abstractC16754e2.admob(i7, Float.floatToRawIntBits(purchase));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 2:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).premium(i7, unsafe.getLong(obj, j));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 3:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).premium(i7, unsafe.getLong(obj, j));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 4:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).signatures(i7, unsafe.getInt(obj, j));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 5:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).remoteconfig(i7, unsafe.getLong(obj, j));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 6:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).admob(i7, unsafe.getInt(obj, j));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 7:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).loadAd(i7, AbstractC14352e.metrica.metrica(j, obj));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 8:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((AbstractC16754e) c13935e.f27641e).inmobi(i7, (String) object);
                        } else {
                            ((AbstractC16754e) c13935e.f27641e).Signature(i7, (AbstractC4002e) object);
                        }
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 9:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).isVip(i7, (AbstractC6866e) unsafe.getObject(obj, j), c2546e.Signature(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 10:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).Signature(i7, (AbstractC4002e) unsafe.getObject(obj, j));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 11:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).applovin(i7, unsafe.getInt(obj, j));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 12:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).signatures(i7, unsafe.getInt(obj, j));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 13:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).admob(i7, unsafe.getInt(obj, j));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 14:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC16754e) c13935e.f27641e).remoteconfig(i7, unsafe.getLong(obj, j));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 15:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((AbstractC16754e) c13935e.f27641e).applovin(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 16:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((AbstractC16754e) c13935e.f27641e).premium(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    c2546e = this;
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c2546e.subscription(obj, i5, i4, i6, i2)) {
                        c13935e.m3732else(i7, unsafe.getObject(obj, j), c2546e.Signature(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    AbstractC1505e.amazon(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    AbstractC1505e.subscription(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 20:
                    AbstractC1505e.pro(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 21:
                    AbstractC1505e.applovin(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 22:
                    AbstractC1505e.remoteconfig(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 23:
                    AbstractC1505e.admob(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    AbstractC1505e.Signature(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    AbstractC1505e.smaato(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = AbstractC1505e.ad;
                    if (list != null && !list.isEmpty()) {
                        c13935e.getClass();
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            ((AbstractC16754e) c13935e.f27641e).inmobi(i11, (String) list.get(i12));
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    int i13 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC3028e Signature = c2546e.Signature(i5);
                    Class cls2 = AbstractC1505e.ad;
                    if (list2 != null && !list2.isEmpty()) {
                        c13935e.getClass();
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            ((AbstractC16754e) c13935e.f27641e).isVip(i13, (AbstractC6866e) list2.get(i14), Signature);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = AbstractC1505e.ad;
                    if (list3 != null && !list3.isEmpty()) {
                        c13935e.getClass();
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            ((AbstractC16754e) c13935e.f27641e).Signature(i15, (AbstractC4002e) list3.get(i16));
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    z = false;
                    AbstractC1505e.isPro(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 30:
                    z = false;
                    AbstractC1505e.loadAd(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 31:
                    z = false;
                    AbstractC1505e.signatures(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 32:
                    z = false;
                    AbstractC1505e.tapsense(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    z = false;
                    AbstractC1505e.isVip(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    z = false;
                    AbstractC1505e.inmobi(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    AbstractC1505e.amazon(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    AbstractC1505e.subscription(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    AbstractC1505e.pro(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    AbstractC1505e.applovin(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    AbstractC1505e.remoteconfig(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    AbstractC1505e.admob(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    AbstractC1505e.Signature(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    AbstractC1505e.smaato(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    AbstractC1505e.isPro(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    AbstractC1505e.loadAd(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    AbstractC1505e.signatures(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    AbstractC1505e.tapsense(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    AbstractC1505e.isVip(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case 48:
                    AbstractC1505e.inmobi(iArr[i5], (List) unsafe.getObject(obj, j), c13935e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC3028e Signature2 = c2546e.Signature(i5);
                    Class cls4 = AbstractC1505e.ad;
                    if (list4 != null && !list4.isEmpty()) {
                        c13935e.getClass();
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            c13935e.m3732else(i17, list4.get(i18), Signature2);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        Object loadAd2 = c2546e.loadAd(i5);
                        c2546e.smaato.getClass();
                        AbstractC1786e.applovin(loadAd2);
                        throw null;
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 51:
                    if (c2546e.pro(i7, i5, obj)) {
                        double doubleValue = ((Double) AbstractC14352e.metrica.startapp(j, obj)).doubleValue();
                        AbstractC16754e abstractC16754e3 = (AbstractC16754e) c13935e.f27641e;
                        abstractC16754e3.getClass();
                        abstractC16754e3.remoteconfig(i7, Double.doubleToRawLongBits(doubleValue));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 52:
                    if (c2546e.pro(i7, i5, obj)) {
                        float floatValue = ((Float) AbstractC14352e.metrica.startapp(j, obj)).floatValue();
                        AbstractC16754e abstractC16754e4 = (AbstractC16754e) c13935e.f27641e;
                        abstractC16754e4.getClass();
                        abstractC16754e4.admob(i7, Float.floatToRawIntBits(floatValue));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 53:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).premium(i7, subs(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 54:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).premium(i7, subs(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 55:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).signatures(i7, premium(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 56:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).remoteconfig(i7, subs(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 57:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).admob(i7, premium(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 58:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).loadAd(i7, ((Boolean) AbstractC14352e.metrica.startapp(j, obj)).booleanValue());
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 59:
                    if (c2546e.pro(i7, i5, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((AbstractC16754e) c13935e.f27641e).inmobi(i7, (String) object2);
                        } else {
                            ((AbstractC16754e) c13935e.f27641e).Signature(i7, (AbstractC4002e) object2);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 60:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).isVip(i7, (AbstractC6866e) unsafe.getObject(obj, j), c2546e.Signature(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 61:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).Signature(i7, (AbstractC4002e) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 62:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).applovin(i7, premium(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 63:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).signatures(i7, premium(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).admob(i7, premium(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 65:
                    if (c2546e.pro(i7, i5, obj)) {
                        ((AbstractC16754e) c13935e.f27641e).remoteconfig(i7, subs(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 66:
                    if (c2546e.pro(i7, i5, obj)) {
                        int premium = premium(j, obj);
                        ((AbstractC16754e) c13935e.f27641e).applovin(i7, (premium >> 31) ^ (premium << 1));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 67:
                    if (c2546e.pro(i7, i5, obj)) {
                        long subs = subs(j, obj);
                        ((AbstractC16754e) c13935e.f27641e).premium(i7, (subs << 1) ^ (subs >> 63));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 68:
                    if (c2546e.pro(i7, i5, obj)) {
                        c13935e.m3732else(i7, unsafe.getObject(obj, j), c2546e.Signature(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                default:
                    i5 += 3;
                    i3 = 1048575;
            }
        }
        c2546e.advert.getClass();
        ((AbstractC4994e) obj).unknownFields.appmetrica(c13935e);
    }

    /* renamed from: class, reason: not valid java name */
    public final int m1002class(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C6313e c6313e) {
        int i9;
        Unsafe unsafe = loadAd;
        long j2 = this.ad[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC14073e.license(i, bArr))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC14073e.metrica(i, bArr))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int adcel = AbstractC14073e.adcel(bArr, i, c6313e);
                unsafe.putObject(obj, j, Long.valueOf(c6313e.vip));
                unsafe.putInt(obj, j2, i4);
                return adcel;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int yandex = AbstractC14073e.yandex(bArr, i, c6313e);
                unsafe.putObject(obj, j, Integer.valueOf(c6313e.ad));
                unsafe.putInt(obj, j2, i4);
                return yandex;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(AbstractC14073e.license(i, bArr)));
                int i12 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 57:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(AbstractC14073e.metrica(i, bArr)));
                int i13 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int adcel2 = AbstractC14073e.adcel(bArr, i, c6313e);
                unsafe.putObject(obj, j, Boolean.valueOf(c6313e.vip != 0));
                unsafe.putInt(obj, j2, i4);
                return adcel2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int yandex2 = AbstractC14073e.yandex(bArr, i, c6313e);
                int i14 = c6313e.ad;
                if (i14 == 0) {
                    unsafe.putObject(obj, j, BuildConfig.FLAVOR);
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (AbstractC15375e.ad.purchase(yandex2, yandex2 + i14, bArr) != 0) {
                            throw C11872e.vip();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, yandex2, i14, AbstractC0352e.ad));
                    yandex2 += i14;
                }
                unsafe.putInt(obj, j2, i4);
                return yandex2;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object isPro = isPro(i4, i8, obj);
                    int smaato = AbstractC14073e.smaato(isPro, Signature(i8), bArr, i9, i2, c6313e);
                    m999abstract(i4, obj, isPro, i8);
                    return smaato;
                }
                break;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int vip = AbstractC14073e.vip(bArr, i9, c6313e);
                    unsafe.putObject(obj, j, c6313e.metrica);
                    unsafe.putInt(obj, j2, i4);
                    return vip;
                }
                break;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int yandex3 = AbstractC14073e.yandex(bArr, i9, c6313e);
                    int i15 = c6313e.ad;
                    amazon(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return yandex3;
                }
                break;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int yandex4 = AbstractC14073e.yandex(bArr, i9, c6313e);
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC15825e.license(c6313e.ad)));
                    unsafe.putInt(obj, j2, i4);
                    return yandex4;
                }
                break;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int adcel3 = AbstractC14073e.adcel(bArr, i9, c6313e);
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC15825e.purchase(c6313e.vip)));
                    unsafe.putInt(obj, j2, i4);
                    return adcel3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object isPro2 = isPro(i4, i8, obj);
                    int advert = AbstractC14073e.advert(isPro2, Signature(i8), bArr, i, i2, (i3 & (-8)) | 4, c6313e);
                    m999abstract(i4, obj, isPro2, i8);
                    return advert;
                }
            default:
                return i;
        }
        return i9;
    }

    public final void crashlytics(long j, Object obj, int i) {
        Unsafe unsafe = loadAd;
        Object loadAd2 = loadAd(i);
        Object object = unsafe.getObject(obj, j);
        C5614e c5614e = this.smaato;
        c5614e.getClass();
        if (!((C4019e) object).f8942e) {
            c5614e.getClass();
            C4019e metrica = C4019e.f8941e.metrica();
            c5614e.ad(metrica, object);
            unsafe.putObject(obj, j, metrica);
        }
        c5614e.getClass();
        AbstractC1786e.applovin(loadAd2);
        throw null;
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m1003extends(int i, C11226e c11226e, Object obj) {
        int i2 = 536870912 & i;
        C14350e c14350e = this.mopub;
        if (i2 != 0) {
            c11226e.m3122static(c14350e.ad(i & 1048575, obj), true);
        } else {
            c11226e.m3122static(c14350e.ad(i & 1048575, obj), false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0149, code lost:
    
        r4 = r9;
        r9 = r25 | r23;
        r3 = r7;
        r7 = r13;
        r13 = r4;
        r4 = r33;
        r5 = r2;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0294, code lost:
    
        r4 = r9;
        r9 = r25 | r23;
        r3 = r4;
        r4 = r13;
        r13 = r7;
        r7 = r4;
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x04a5, code lost:
    
        if (r8 == 1048575) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x04a7, code lost:
    
        r15.putInt(r10, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x04ab, code lost:
    
        r0 = r6.yandex;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x04af, code lost:
    
        if (r0 >= r6.startapp) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x04b1, code lost:
    
        r6.smaato(r6.billing[r0], r10, r32);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04bd, code lost:
    
        if (r34 != 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x04bf, code lost:
    
        if (r5 != r4) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04c6, code lost:
    
        throw defpackage.C11872e.purchase();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04cb, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04c7, code lost:
    
        if (r5 > r4) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04c9, code lost:
    
        if (r12 != r34) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04d0, code lost:
    
        throw defpackage.C11872e.purchase();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x00aa. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int firebase(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, defpackage.C6313e r35) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2546e.firebase(java.lang.Object, byte[], int, int, int, eَؙۥ):int");
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m1004goto(Object obj, long j, C11226e c11226e, InterfaceC3028e interfaceC3028e, C16593e c16593e) {
        int mo594this;
        InterfaceC4115e ad = this.mopub.ad(j, obj);
        AbstractC15825e abstractC15825e = (AbstractC15825e) c11226e.appmetrica;
        int i = c11226e.vip;
        if ((i & 7) != 3) {
            throw C11872e.metrica();
        }
        do {
            AbstractC4994e license = interfaceC3028e.license();
            c11226e.yandex(license, interfaceC3028e, c16593e);
            interfaceC3028e.vip(license);
            ad.add(license);
            if (abstractC15825e.startapp() || c11226e.license != 0) {
                return;
            } else {
                mo594this = abstractC15825e.mo594this();
            }
        } while (mo594this == i);
        c11226e.license = mo594this;
    }

    /* renamed from: implements, reason: not valid java name */
    public final int m1005implements(int i) {
        return this.ad[i + 1];
    }

    public final Object inmobi(int i, Object obj) {
        InterfaceC3028e Signature = Signature(i);
        long m1005implements = m1005implements(i) & 1048575;
        if (!admob(i, obj)) {
            return Signature.license();
        }
        Object object = loadAd.getObject(obj, m1005implements);
        if (remoteconfig(object)) {
            return object;
        }
        AbstractC4994e license = Signature.license();
        if (object != null) {
            Signature.ad(license, object);
        }
        return license;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002e. Please report as an issue. */
    /* renamed from: interface, reason: not valid java name */
    public final int m1006interface(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, C6313e c6313e) {
        int i7;
        int i8;
        int i9;
        int i10;
        int startapp;
        Unsafe unsafe = loadAd;
        InterfaceC4115e interfaceC4115e = (InterfaceC4115e) unsafe.getObject(obj, j2);
        if (!((AbstractC5360e) interfaceC4115e).f11481e) {
            int size = interfaceC4115e.size();
            interfaceC4115e = interfaceC4115e.metrica(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, interfaceC4115e);
        }
        InterfaceC4115e interfaceC4115e2 = interfaceC4115e;
        switch (i6) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                int i11 = i;
                if (i4 == 2) {
                    AbstractC7986e abstractC7986e = (AbstractC7986e) interfaceC4115e2;
                    int yandex = AbstractC14073e.yandex(bArr, i11, c6313e);
                    int i12 = c6313e.ad + yandex;
                    while (yandex < i12) {
                        abstractC7986e.billing(Double.longBitsToDouble(AbstractC14073e.license(yandex, bArr)));
                        yandex += 8;
                    }
                    if (yandex == i12) {
                        return yandex;
                    }
                    throw C11872e.billing();
                }
                if (i4 != 1) {
                    return i11;
                }
                AbstractC7986e abstractC7986e2 = (AbstractC7986e) interfaceC4115e2;
                abstractC7986e2.billing(Double.longBitsToDouble(AbstractC14073e.license(i11, bArr)));
                while (true) {
                    i7 = i11 + 8;
                    if (i7 < i2) {
                        i11 = AbstractC14073e.yandex(bArr, i7, c6313e);
                        if (i3 == c6313e.ad) {
                            abstractC7986e2.billing(Double.longBitsToDouble(AbstractC14073e.license(i11, bArr)));
                        }
                    }
                }
                return i7;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                int i13 = i;
                if (i4 == 2) {
                    AbstractC12293e abstractC12293e = (AbstractC12293e) interfaceC4115e2;
                    int yandex2 = AbstractC14073e.yandex(bArr, i13, c6313e);
                    int i14 = c6313e.ad + yandex2;
                    while (yandex2 < i14) {
                        abstractC12293e.billing(Float.intBitsToFloat(AbstractC14073e.metrica(yandex2, bArr)));
                        yandex2 += 4;
                    }
                    if (yandex2 == i14) {
                        return yandex2;
                    }
                    throw C11872e.billing();
                }
                if (i4 != 5) {
                    return i13;
                }
                AbstractC12293e abstractC12293e2 = (AbstractC12293e) interfaceC4115e2;
                abstractC12293e2.billing(Float.intBitsToFloat(AbstractC14073e.metrica(i13, bArr)));
                while (true) {
                    i8 = i13 + 4;
                    if (i8 < i2) {
                        i13 = AbstractC14073e.yandex(bArr, i8, c6313e);
                        if (i3 == c6313e.ad) {
                            abstractC12293e2.billing(Float.intBitsToFloat(AbstractC14073e.metrica(i13, bArr)));
                        }
                    }
                }
                return i8;
            case 20:
            case 21:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                if (i4 == 2) {
                    AbstractC8400e abstractC8400e = (AbstractC8400e) interfaceC4115e2;
                    int yandex3 = AbstractC14073e.yandex(bArr, i, c6313e);
                    int i15 = c6313e.ad + yandex3;
                    while (yandex3 < i15) {
                        yandex3 = AbstractC14073e.adcel(bArr, yandex3, c6313e);
                        abstractC8400e.billing(c6313e.vip);
                    }
                    if (yandex3 == i15) {
                        return yandex3;
                    }
                    throw C11872e.billing();
                }
                if (i4 != 0) {
                    return i;
                }
                AbstractC8400e abstractC8400e2 = (AbstractC8400e) interfaceC4115e2;
                int adcel = AbstractC14073e.adcel(bArr, i, c6313e);
                abstractC8400e2.billing(c6313e.vip);
                while (adcel < i2) {
                    int yandex4 = AbstractC14073e.yandex(bArr, adcel, c6313e);
                    if (i3 != c6313e.ad) {
                        return adcel;
                    }
                    adcel = AbstractC14073e.adcel(bArr, yandex4, c6313e);
                    abstractC8400e2.billing(c6313e.vip);
                }
                return adcel;
            case 22:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                i9 = i;
                if (i4 != 2) {
                    if (i4 == 0) {
                        return AbstractC14073e.startapp(i3, bArr, i9, i2, interfaceC4115e2, c6313e);
                    }
                    return i9;
                }
                C4178e c4178e = (C4178e) interfaceC4115e2;
                int yandex5 = AbstractC14073e.yandex(bArr, i9, c6313e);
                int i16 = c6313e.ad + yandex5;
                while (yandex5 < i16) {
                    yandex5 = AbstractC14073e.yandex(bArr, yandex5, c6313e);
                    c4178e.billing(c6313e.ad);
                }
                if (yandex5 == i16) {
                    return yandex5;
                }
                throw C11872e.billing();
            case 23:
            case 32:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                i9 = i;
                if (i4 == 2) {
                    AbstractC8400e abstractC8400e3 = (AbstractC8400e) interfaceC4115e2;
                    int yandex6 = AbstractC14073e.yandex(bArr, i9, c6313e);
                    int i17 = c6313e.ad + yandex6;
                    while (yandex6 < i17) {
                        abstractC8400e3.billing(AbstractC14073e.license(yandex6, bArr));
                        yandex6 += 8;
                    }
                    if (yandex6 == i17) {
                        return yandex6;
                    }
                    throw C11872e.billing();
                }
                if (i4 == 1) {
                    AbstractC8400e abstractC8400e4 = (AbstractC8400e) interfaceC4115e2;
                    abstractC8400e4.billing(AbstractC14073e.license(i9, bArr));
                    int i18 = i9 + 8;
                    while (i18 < i2) {
                        int yandex7 = AbstractC14073e.yandex(bArr, i18, c6313e);
                        if (i3 != c6313e.ad) {
                            return i18;
                        }
                        abstractC8400e4.billing(AbstractC14073e.license(yandex7, bArr));
                        i18 = yandex7 + 8;
                    }
                    return i18;
                }
                return i9;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case 31:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                i9 = i;
                if (i4 == 2) {
                    C4178e c4178e2 = (C4178e) interfaceC4115e2;
                    int yandex8 = AbstractC14073e.yandex(bArr, i9, c6313e);
                    int i19 = c6313e.ad + yandex8;
                    while (yandex8 < i19) {
                        c4178e2.billing(AbstractC14073e.metrica(yandex8, bArr));
                        yandex8 += 4;
                    }
                    if (yandex8 == i19) {
                        return yandex8;
                    }
                    throw C11872e.billing();
                }
                if (i4 == 5) {
                    C4178e c4178e3 = (C4178e) interfaceC4115e2;
                    c4178e3.billing(AbstractC14073e.metrica(i9, bArr));
                    int i20 = i9 + 4;
                    while (i20 < i2) {
                        int yandex9 = AbstractC14073e.yandex(bArr, i20, c6313e);
                        if (i3 != c6313e.ad) {
                            return i20;
                        }
                        c4178e3.billing(AbstractC14073e.metrica(yandex9, bArr));
                        i20 = yandex9 + 4;
                    }
                    return i20;
                }
                return i9;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                i9 = i;
                if (i4 == 2) {
                    AbstractC4963e abstractC4963e = (AbstractC4963e) interfaceC4115e2;
                    int yandex10 = AbstractC14073e.yandex(bArr, i9, c6313e);
                    int i21 = c6313e.ad + yandex10;
                    while (yandex10 < i21) {
                        yandex10 = AbstractC14073e.adcel(bArr, yandex10, c6313e);
                        abstractC4963e.billing(c6313e.vip != 0);
                    }
                    if (yandex10 == i21) {
                        return yandex10;
                    }
                    throw C11872e.billing();
                }
                if (i4 == 0) {
                    AbstractC4963e abstractC4963e2 = (AbstractC4963e) interfaceC4115e2;
                    int adcel2 = AbstractC14073e.adcel(bArr, i9, c6313e);
                    abstractC4963e2.billing(c6313e.vip != 0);
                    while (adcel2 < i2) {
                        int yandex11 = AbstractC14073e.yandex(bArr, adcel2, c6313e);
                        if (i3 != c6313e.ad) {
                            return adcel2;
                        }
                        adcel2 = AbstractC14073e.adcel(bArr, yandex11, c6313e);
                        abstractC4963e2.billing(c6313e.vip != 0);
                    }
                    return adcel2;
                }
                return i9;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                i9 = i;
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int yandex12 = AbstractC14073e.yandex(bArr, i9, c6313e);
                        int i22 = c6313e.ad;
                        if (i22 < 0) {
                            throw C11872e.appmetrica();
                        }
                        if (i22 == 0) {
                            interfaceC4115e2.add(BuildConfig.FLAVOR);
                        } else {
                            interfaceC4115e2.add(new String(bArr, yandex12, i22, AbstractC0352e.ad));
                            yandex12 += i22;
                        }
                        while (yandex12 < i2) {
                            int yandex13 = AbstractC14073e.yandex(bArr, yandex12, c6313e);
                            if (i3 != c6313e.ad) {
                                return yandex12;
                            }
                            yandex12 = AbstractC14073e.yandex(bArr, yandex13, c6313e);
                            int i23 = c6313e.ad;
                            if (i23 < 0) {
                                throw C11872e.appmetrica();
                            }
                            if (i23 == 0) {
                                interfaceC4115e2.add(BuildConfig.FLAVOR);
                            } else {
                                interfaceC4115e2.add(new String(bArr, yandex12, i23, AbstractC0352e.ad));
                                yandex12 += i23;
                            }
                        }
                        return yandex12;
                    }
                    int yandex14 = AbstractC14073e.yandex(bArr, i9, c6313e);
                    int i24 = c6313e.ad;
                    if (i24 < 0) {
                        throw C11872e.appmetrica();
                    }
                    if (i24 == 0) {
                        interfaceC4115e2.add(BuildConfig.FLAVOR);
                    } else {
                        int i25 = yandex14 + i24;
                        if (AbstractC15375e.ad.purchase(yandex14, i25, bArr) != 0) {
                            throw C11872e.vip();
                        }
                        interfaceC4115e2.add(new String(bArr, yandex14, i24, AbstractC0352e.ad));
                        yandex14 = i25;
                    }
                    while (yandex14 < i2) {
                        int yandex15 = AbstractC14073e.yandex(bArr, yandex14, c6313e);
                        if (i3 != c6313e.ad) {
                            return yandex14;
                        }
                        yandex14 = AbstractC14073e.yandex(bArr, yandex15, c6313e);
                        int i26 = c6313e.ad;
                        if (i26 < 0) {
                            throw C11872e.appmetrica();
                        }
                        if (i26 == 0) {
                            interfaceC4115e2.add(BuildConfig.FLAVOR);
                        } else {
                            int i27 = yandex14 + i26;
                            if (AbstractC15375e.ad.purchase(yandex14, i27, bArr) != 0) {
                                throw C11872e.vip();
                            }
                            interfaceC4115e2.add(new String(bArr, yandex14, i26, AbstractC0352e.ad));
                            yandex14 = i27;
                        }
                    }
                    return yandex14;
                }
                return i9;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return i4 == 2 ? AbstractC14073e.appmetrica(Signature(i5), i3, bArr, i, i2, interfaceC4115e2, c6313e) : i;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (i4 != 2) {
                    return i;
                }
                int yandex16 = AbstractC14073e.yandex(bArr, i, c6313e);
                int i28 = c6313e.ad;
                if (i28 < 0) {
                    throw C11872e.appmetrica();
                }
                if (i28 > bArr.length - yandex16) {
                    throw C11872e.billing();
                }
                if (i28 == 0) {
                    interfaceC4115e2.add(AbstractC4002e.f8908e);
                } else {
                    interfaceC4115e2.add(AbstractC4002e.yandex(yandex16, i28, bArr));
                    yandex16 += i28;
                }
                while (yandex16 < i2) {
                    int yandex17 = AbstractC14073e.yandex(bArr, yandex16, c6313e);
                    if (i3 != c6313e.ad) {
                        return yandex16;
                    }
                    yandex16 = AbstractC14073e.yandex(bArr, yandex17, c6313e);
                    int i29 = c6313e.ad;
                    if (i29 < 0) {
                        throw C11872e.appmetrica();
                    }
                    if (i29 > bArr.length - yandex16) {
                        throw C11872e.billing();
                    }
                    if (i29 == 0) {
                        interfaceC4115e2.add(AbstractC4002e.f8908e);
                    } else {
                        interfaceC4115e2.add(AbstractC4002e.yandex(yandex16, i29, bArr));
                        yandex16 += i29;
                    }
                }
                return yandex16;
            case 30:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                i10 = i;
                if (i4 != 2) {
                    if (i4 == 0) {
                        startapp = AbstractC14073e.startapp(i3, bArr, i10, i2, interfaceC4115e2, c6313e);
                    }
                    return i10;
                }
                C4178e c4178e4 = (C4178e) interfaceC4115e2;
                startapp = AbstractC14073e.yandex(bArr, i10, c6313e);
                int i30 = c6313e.ad + startapp;
                while (startapp < i30) {
                    startapp = AbstractC14073e.yandex(bArr, startapp, c6313e);
                    c4178e4.billing(c6313e.ad);
                }
                if (startapp != i30) {
                    throw C11872e.billing();
                }
                amazon(i5);
                Class cls = AbstractC1505e.ad;
                return startapp;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                i10 = i;
                if (i4 == 2) {
                    C4178e c4178e5 = (C4178e) interfaceC4115e2;
                    int yandex18 = AbstractC14073e.yandex(bArr, i10, c6313e);
                    int i31 = c6313e.ad + yandex18;
                    while (yandex18 < i31) {
                        yandex18 = AbstractC14073e.yandex(bArr, yandex18, c6313e);
                        c4178e5.billing(AbstractC15825e.license(c6313e.ad));
                    }
                    if (yandex18 == i31) {
                        return yandex18;
                    }
                    throw C11872e.billing();
                }
                if (i4 == 0) {
                    C4178e c4178e6 = (C4178e) interfaceC4115e2;
                    int yandex19 = AbstractC14073e.yandex(bArr, i10, c6313e);
                    c4178e6.billing(AbstractC15825e.license(c6313e.ad));
                    while (yandex19 < i2) {
                        int yandex20 = AbstractC14073e.yandex(bArr, yandex19, c6313e);
                        if (i3 != c6313e.ad) {
                            return yandex19;
                        }
                        yandex19 = AbstractC14073e.yandex(bArr, yandex20, c6313e);
                        c4178e6.billing(AbstractC15825e.license(c6313e.ad));
                    }
                    return yandex19;
                }
                return i10;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case 48:
                i10 = i;
                if (i4 == 2) {
                    AbstractC8400e abstractC8400e5 = (AbstractC8400e) interfaceC4115e2;
                    int yandex21 = AbstractC14073e.yandex(bArr, i10, c6313e);
                    int i32 = c6313e.ad + yandex21;
                    while (yandex21 < i32) {
                        yandex21 = AbstractC14073e.adcel(bArr, yandex21, c6313e);
                        abstractC8400e5.billing(AbstractC15825e.purchase(c6313e.vip));
                    }
                    if (yandex21 == i32) {
                        return yandex21;
                    }
                    throw C11872e.billing();
                }
                if (i4 == 0) {
                    AbstractC8400e abstractC8400e6 = (AbstractC8400e) interfaceC4115e2;
                    int adcel3 = AbstractC14073e.adcel(bArr, i10, c6313e);
                    abstractC8400e6.billing(AbstractC15825e.purchase(c6313e.vip));
                    while (adcel3 < i2) {
                        int yandex22 = AbstractC14073e.yandex(bArr, adcel3, c6313e);
                        if (i3 != c6313e.ad) {
                            return adcel3;
                        }
                        adcel3 = AbstractC14073e.adcel(bArr, yandex22, c6313e);
                        abstractC8400e6.billing(AbstractC15825e.purchase(c6313e.vip));
                    }
                    return adcel3;
                }
                return i10;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i4 == 3) {
                    InterfaceC3028e Signature = Signature(i5);
                    int i33 = (i3 & (-8)) | 4;
                    AbstractC4994e license = Signature.license();
                    int advert = AbstractC14073e.advert(license, Signature, bArr, i, i2, i33, c6313e);
                    InterfaceC3028e interfaceC3028e = Signature;
                    byte[] bArr2 = bArr;
                    interfaceC3028e.vip(license);
                    c6313e.metrica = license;
                    interfaceC4115e2.add(license);
                    while (advert < i2) {
                        int yandex23 = AbstractC14073e.yandex(bArr2, advert, c6313e);
                        if (i3 != c6313e.ad) {
                            return advert;
                        }
                        AbstractC4994e license2 = interfaceC3028e.license();
                        byte[] bArr3 = bArr2;
                        InterfaceC3028e interfaceC3028e2 = interfaceC3028e;
                        advert = AbstractC14073e.advert(license2, interfaceC3028e2, bArr3, yandex23, i2, i33, c6313e);
                        interfaceC3028e2.vip(license2);
                        c6313e.metrica = license2;
                        interfaceC4115e2.add(license2);
                        interfaceC3028e = interfaceC3028e2;
                        bArr2 = bArr3;
                    }
                    return advert;
                }
            default:
                return i;
        }
    }

    public final Object isPro(int i, int i2, Object obj) {
        InterfaceC3028e Signature = Signature(i2);
        if (!pro(i, i2, obj)) {
            return Signature.license();
        }
        Object object = loadAd.getObject(obj, m1005implements(i2) & 1048575);
        if (remoteconfig(object)) {
            return object;
        }
        AbstractC4994e license = Signature.license();
        if (object != null) {
            Signature.ad(license, object);
        }
        return license;
    }

    public final void isVip(int i, Object obj, Object obj2) {
        int[] iArr = this.ad;
        int i2 = iArr[i];
        if (pro(i2, i, obj2)) {
            long m1005implements = m1005implements(i) & 1048575;
            Unsafe unsafe = loadAd;
            Object object = unsafe.getObject(obj2, m1005implements);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC3028e Signature = Signature(i);
            if (!pro(i2, i, obj)) {
                if (remoteconfig(object)) {
                    AbstractC4994e license = Signature.license();
                    Signature.ad(license, object);
                    unsafe.putObject(obj, m1005implements, license);
                } else {
                    unsafe.putObject(obj, m1005implements, object);
                }
                m1010try(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m1005implements);
            if (!remoteconfig(object2)) {
                AbstractC4994e license2 = Signature.license();
                Signature.ad(license2, object2);
                unsafe.putObject(obj, m1005implements, license2);
                object2 = license2;
            }
            Signature.ad(object2, object);
        }
    }

    @Override // defpackage.InterfaceC3028e
    public final AbstractC4994e license() {
        this.adcel.getClass();
        return ((AbstractC4994e) this.appmetrica).adcel();
    }

    public final Object loadAd(int i) {
        return this.vip[(i / 3) * 2];
    }

    @Override // defpackage.InterfaceC3028e
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
            int m1005implements = m1005implements(i7);
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
            if ((268435456 & m1005implements) == 0 || subscription(obj, i2, i, i3, i11)) {
                int m997default = m997default(m1005implements);
                if (m997default == 9 || m997default == 17) {
                    if (subscription(obj, i2, i, i3, i11)) {
                        if (!Signature(i2).metrica(AbstractC14352e.metrica.startapp(m1005implements & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (m997default != 27) {
                        if (m997default == 60 || m997default == 68) {
                            if (pro(i8, i2, obj)) {
                                if (!Signature(i2).metrica(AbstractC14352e.metrica.startapp(m1005implements & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (m997default != 49) {
                            if (m997default != 50) {
                                continue;
                            } else {
                                Object startapp = AbstractC14352e.metrica.startapp(m1005implements & 1048575, obj);
                                this.smaato.getClass();
                                if (!((C4019e) startapp).isEmpty()) {
                                    AbstractC1786e.applovin(loadAd(i2));
                                    throw null;
                                }
                            }
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
                    }
                    List list = (List) AbstractC14352e.metrica.startapp(m1005implements & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC3028e Signature = Signature(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (Signature.metrica(list.get(i13))) {
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

    public final boolean mopub(AbstractC4994e abstractC4994e, AbstractC4994e abstractC4994e2, int i) {
        return admob(i, abstractC4994e) == admob(i, abstractC4994e2);
    }

    /* renamed from: native, reason: not valid java name */
    public final void m1007native(int i, C11226e c11226e, Object obj) {
        if ((536870912 & i) != 0) {
            c11226e.m3077continue(2);
            AbstractC14352e.Signature(i & 1048575, obj, ((AbstractC15825e) c11226e.appmetrica).mo586goto());
        } else if (!this.purchase) {
            AbstractC14352e.Signature(i & 1048575, obj, c11226e.subscription());
        } else {
            c11226e.m3077continue(2);
            AbstractC14352e.Signature(i & 1048575, obj, ((AbstractC15825e) c11226e.appmetrica).mo588interface());
        }
    }

    public final boolean pro(int i, int i2, Object obj) {
        return AbstractC14352e.metrica.billing((long) (this.ad[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: protected, reason: not valid java name */
    public final int m1008protected(int i, int i2) {
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

    @Override // defpackage.InterfaceC3028e
    public final void purchase(Object obj, C13935e c13935e) {
        c13935e.getClass();
        m1001case(obj, c13935e);
    }

    public final void signatures(int i, Object obj, Object obj2) {
        long m1005implements = m1005implements(i) & 1048575;
        Object startapp = AbstractC14352e.metrica.startapp(m1005implements, obj);
        C5614e c5614e = this.smaato;
        if (startapp != null) {
            c5614e.getClass();
            if (!((C4019e) startapp).f8942e) {
                c5614e.getClass();
                C4019e metrica = C4019e.f8941e.metrica();
                c5614e.ad(metrica, startapp);
                AbstractC14352e.Signature(m1005implements, obj, metrica);
                startapp = metrica;
            }
        } else {
            c5614e.getClass();
            startapp = C4019e.f8941e.metrica();
            AbstractC14352e.Signature(m1005implements, obj, startapp);
        }
        c5614e.getClass();
        c5614e.getClass();
        AbstractC1786e.applovin(obj2);
        throw null;
    }

    public final void smaato(int i, Object obj, Object obj2) {
        int i2 = this.ad[i];
        if (AbstractC14352e.metrica.startapp(m1005implements(i) & 1048575, obj) == null) {
            return;
        }
        amazon(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x006b, code lost:
    
        if (r13 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (r13 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
    
        ((defpackage.AbstractC4994e) r2).unknownFields = r13;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x007b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06bd A[Catch: all -> 0x0422, TryCatch #0 {all -> 0x0422, blocks: (B:37:0x06b8, B:39:0x06bd, B:40:0x06c2, B:140:0x041d, B:143:0x0425, B:144:0x0437, B:145:0x0449, B:146:0x045b, B:147:0x046d, B:148:0x047f, B:149:0x0491, B:150:0x04a3, B:151:0x04b5, B:152:0x04cf, B:153:0x04eb, B:154:0x0508, B:155:0x0525, B:156:0x0542, B:157:0x0562, B:158:0x057f, B:159:0x0594, B:160:0x05af, B:161:0x05bc, B:162:0x05db, B:163:0x05f8, B:164:0x0615, B:165:0x0632, B:166:0x064f, B:167:0x066c, B:168:0x068a, B:173:0x06a8), top: B:36:0x06b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x06c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x06e9 A[LOOP:3: B:55:0x06e7->B:56:0x06e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x06f3  */
    @Override // defpackage.InterfaceC3028e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startapp(java.lang.Object r21, defpackage.C11226e r22, defpackage.C16593e r23) {
        /*
            Method dump skipped, instructions count: 1930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2546e.startapp(java.lang.Object, eُؙۙ, eؙٖۣ):void");
    }

    public final boolean subscription(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? admob(i, obj) : (i3 & i4) != 0;
    }

    public final void tapsense(int i, Object obj, Object obj2) {
        if (admob(i, obj2)) {
            long m1005implements = m1005implements(i) & 1048575;
            Unsafe unsafe = loadAd;
            Object object = unsafe.getObject(obj2, m1005implements);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.ad[i] + " is present but null: " + obj2);
            }
            InterfaceC3028e Signature = Signature(i);
            if (!admob(i, obj)) {
                if (remoteconfig(object)) {
                    AbstractC4994e license = Signature.license();
                    Signature.ad(license, object);
                    unsafe.putObject(obj, m1005implements, license);
                } else {
                    unsafe.putObject(obj, m1005implements, object);
                }
                m1011while(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m1005implements);
            if (!remoteconfig(object2)) {
                AbstractC4994e license2 = Signature.license();
                Signature.ad(license2, object2);
                unsafe.putObject(obj, m1005implements, license2);
                object2 = license2;
            }
            Signature.ad(object2, object);
        }
    }

    /* renamed from: this, reason: not valid java name */
    public final void m1009this(Object obj, int i, C11226e c11226e, InterfaceC3028e interfaceC3028e, C16593e c16593e) {
        int mo594this;
        InterfaceC4115e ad = this.mopub.ad(i & 1048575, obj);
        AbstractC15825e abstractC15825e = (AbstractC15825e) c11226e.appmetrica;
        int i2 = c11226e.vip;
        if ((i2 & 7) != 2) {
            throw C11872e.metrica();
        }
        do {
            AbstractC4994e license = interfaceC3028e.license();
            c11226e.mopub(license, interfaceC3028e, c16593e);
            interfaceC3028e.vip(license);
            ad.add(license);
            if (abstractC15825e.startapp() || c11226e.license != 0) {
                return;
            } else {
                mo594this = abstractC15825e.mo594this();
            }
        } while (mo594this == i2);
        c11226e.license = mo594this;
    }

    /* renamed from: try, reason: not valid java name */
    public final void m1010try(int i, int i2, Object obj) {
        AbstractC14352e.amazon(this.ad[i2 + 2] & 1048575, obj, i);
    }

    @Override // defpackage.InterfaceC3028e
    public final void vip(Object obj) {
        if (remoteconfig(obj)) {
            if (obj instanceof AbstractC4994e) {
                AbstractC4994e abstractC4994e = (AbstractC4994e) obj;
                abstractC4994e.advert(Alert.DURATION_SHOW_INDEFINITELY);
                abstractC4994e.memoizedHashCode = 0;
                abstractC4994e.startapp();
            }
            int[] iArr = this.ad;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int m1005implements = m1005implements(i);
                long j = 1048575 & m1005implements;
                int m997default = m997default(m1005implements);
                if (m997default != 9) {
                    if (m997default != 60 && m997default != 68) {
                        switch (m997default) {
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
                                AbstractC5360e abstractC5360e = (AbstractC5360e) ((InterfaceC4115e) AbstractC14352e.metrica.startapp(j, obj));
                                if (abstractC5360e.f11481e) {
                                    abstractC5360e.f11481e = false;
                                    break;
                                } else {
                                    break;
                                }
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                Unsafe unsafe = loadAd;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.smaato.getClass();
                                    ((C4019e) object).f8942e = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (pro(iArr[i], i, obj)) {
                        Signature(i).vip(loadAd.getObject(obj, j));
                    }
                }
                if (admob(i, obj)) {
                    Signature(i).vip(loadAd.getObject(obj, j));
                }
            }
            this.advert.getClass();
            C16137e c16137e = ((AbstractC4994e) obj).unknownFields;
            if (c16137e.appmetrica) {
                c16137e.appmetrica = false;
            }
        }
    }

    /* renamed from: while, reason: not valid java name */
    public final void m1011while(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC14352e.amazon(j, obj, (1 << (i2 >>> 20)) | AbstractC14352e.metrica.billing(j, obj));
    }

    @Override // defpackage.InterfaceC3028e
    public final void yandex(Object obj, byte[] bArr, int i, int i2, C6313e c6313e) {
        firebase(obj, bArr, i, i2, 0, c6313e);
    }
}
