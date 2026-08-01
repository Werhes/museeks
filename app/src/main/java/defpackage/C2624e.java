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
/* renamed from: eٍؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2624e implements InterfaceC11115e {
    public static final int[] amazon = new int[0];
    public static final Unsafe loadAd = AbstractC5314e.adcel();
    public final int[] ad;
    public final C1665e adcel;
    public final C3493e advert;
    public final AbstractC7718e appmetrica;
    public final int[] billing;
    public final int license;
    public final int metrica;
    public final C10088e mopub;
    public final boolean purchase;
    public final C7323e smaato;
    public final int startapp;
    public final Object[] vip;
    public final int yandex;

    public C2624e(int[] iArr, Object[] objArr, int i, int i2, AbstractC7718e abstractC7718e, int[] iArr2, int i3, int i4, C1665e c1665e, C10088e c10088e, C3493e c3493e, C15371e c15371e, C7323e c7323e) {
        this.ad = iArr;
        this.vip = objArr;
        this.metrica = i;
        this.license = i2;
        this.purchase = abstractC7718e instanceof AbstractC3405e;
        this.billing = iArr2;
        this.yandex = i3;
        this.startapp = i4;
        this.adcel = c1665e;
        this.mopub = c10088e;
        this.advert = c3493e;
        this.appmetrica = abstractC7718e;
        this.smaato = c7323e;
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
    public static defpackage.C2624e applovin(defpackage.C15610e r36, defpackage.C1665e r37, defpackage.C10088e r38, defpackage.C3493e r39, defpackage.C15371e r40, defpackage.C7323e r41) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2624e.applovin(eٕٝٞ, eٌؚؓ, eَؘْ, eؕٛۧ, eَٕٗ, eًؚٞ):eٍؔٗ");
    }

    /* renamed from: default, reason: not valid java name */
    public static int m1020default(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int premium(long j, Object obj) {
        return ((Integer) AbstractC5314e.metrica.startapp(j, obj)).intValue();
    }

    public static boolean remoteconfig(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC3405e) {
            return ((AbstractC3405e) obj).loadAd();
        }
        return true;
    }

    public static long subs(long j, Object obj) {
        return ((Long) AbstractC5314e.metrica.startapp(j, obj)).longValue();
    }

    /* renamed from: throw, reason: not valid java name */
    public static Field m1021throw(Class cls, String str) {
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

    public final InterfaceC11115e Signature(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.vip;
        InterfaceC11115e interfaceC11115e = (InterfaceC11115e) objArr[i2];
        if (interfaceC11115e != null) {
            return interfaceC11115e;
        }
        InterfaceC11115e ad = C10051e.metrica.ad((Class) objArr[i2 + 1]);
        objArr[i2] = ad;
        return ad;
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m1022abstract(int i, Object obj, Object obj2, int i2) {
        loadAd.putObject(obj, m1028implements(i2) & 1048575, obj2);
        m1033try(i, i2, obj);
    }

    @Override // defpackage.InterfaceC11115e
    public final void ad(Object obj, Object obj2) {
        Object obj3;
        advert(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.ad;
            if (i >= iArr.length) {
                AbstractC4249e.mopub(this.advert, obj, obj2);
                return;
            }
            int m1028implements = m1028implements(i);
            long j = 1048575 & m1028implements;
            int i2 = iArr[i];
            switch (m1020default(m1028implements)) {
                case 0:
                    if (admob(i, obj2)) {
                        AbstractC17552e abstractC17552e = AbstractC5314e.metrica;
                        obj3 = obj;
                        abstractC17552e.smaato(obj3, j, abstractC17552e.appmetrica(j, obj2));
                        m1034while(i, obj3);
                        break;
                    }
                    break;
                case 1:
                    if (admob(i, obj2)) {
                        AbstractC17552e abstractC17552e2 = AbstractC5314e.metrica;
                        abstractC17552e2.amazon(obj, j, abstractC17552e2.purchase(j, obj2));
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 2:
                    if (admob(i, obj2)) {
                        AbstractC5314e.loadAd(j, AbstractC5314e.metrica.yandex(j, obj2), obj);
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 3:
                    if (admob(i, obj2)) {
                        AbstractC5314e.loadAd(j, AbstractC5314e.metrica.yandex(j, obj2), obj);
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 4:
                    if (admob(i, obj2)) {
                        AbstractC5314e.amazon(j, obj, AbstractC5314e.metrica.billing(j, obj2));
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 5:
                    if (admob(i, obj2)) {
                        AbstractC5314e.loadAd(j, AbstractC5314e.metrica.yandex(j, obj2), obj);
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 6:
                    if (admob(i, obj2)) {
                        AbstractC5314e.amazon(j, obj, AbstractC5314e.metrica.billing(j, obj2));
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 7:
                    if (admob(i, obj2)) {
                        AbstractC17552e abstractC17552e3 = AbstractC5314e.metrica;
                        abstractC17552e3.mopub(obj, j, abstractC17552e3.metrica(j, obj2));
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 8:
                    if (admob(i, obj2)) {
                        AbstractC5314e.Signature(j, obj, AbstractC5314e.metrica.startapp(j, obj2));
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 9:
                    tapsense(i, obj, obj2);
                    break;
                case 10:
                    if (admob(i, obj2)) {
                        AbstractC5314e.Signature(j, obj, AbstractC5314e.metrica.startapp(j, obj2));
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 11:
                    if (admob(i, obj2)) {
                        AbstractC5314e.amazon(j, obj, AbstractC5314e.metrica.billing(j, obj2));
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 12:
                    if (admob(i, obj2)) {
                        AbstractC5314e.amazon(j, obj, AbstractC5314e.metrica.billing(j, obj2));
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 13:
                    if (admob(i, obj2)) {
                        AbstractC5314e.amazon(j, obj, AbstractC5314e.metrica.billing(j, obj2));
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 14:
                    if (admob(i, obj2)) {
                        AbstractC5314e.loadAd(j, AbstractC5314e.metrica.yandex(j, obj2), obj);
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 15:
                    if (admob(i, obj2)) {
                        AbstractC5314e.amazon(j, obj, AbstractC5314e.metrica.billing(j, obj2));
                        m1034while(i, obj);
                        break;
                    }
                    break;
                case 16:
                    if (admob(i, obj2)) {
                        AbstractC5314e.loadAd(j, AbstractC5314e.metrica.yandex(j, obj2), obj);
                        m1034while(i, obj);
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
                    AbstractC17552e abstractC17552e4 = AbstractC5314e.metrica;
                    InterfaceC16489e interfaceC16489e = (InterfaceC16489e) abstractC17552e4.startapp(j, obj);
                    InterfaceC16489e interfaceC16489e2 = (InterfaceC16489e) abstractC17552e4.startapp(j, obj2);
                    int size = interfaceC16489e.size();
                    int size2 = interfaceC16489e2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC11556e) interfaceC16489e).f23215e) {
                            interfaceC16489e = interfaceC16489e.metrica(size2 + size);
                        }
                        interfaceC16489e.addAll(interfaceC16489e2);
                    }
                    if (size > 0) {
                        interfaceC16489e2 = interfaceC16489e;
                    }
                    AbstractC5314e.Signature(j, obj, interfaceC16489e2);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = AbstractC4249e.ad;
                    AbstractC17552e abstractC17552e5 = AbstractC5314e.metrica;
                    AbstractC5314e.Signature(j, obj, this.smaato.ad(abstractC17552e5.startapp(j, obj), abstractC17552e5.startapp(j, obj2)));
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
                        AbstractC5314e.Signature(j, obj, AbstractC5314e.metrica.startapp(j, obj2));
                        m1033try(i2, i, obj);
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
                        AbstractC5314e.Signature(j, obj, AbstractC5314e.metrica.startapp(j, obj2));
                        m1033try(i2, i, obj);
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
    @Override // defpackage.InterfaceC11115e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int adcel(defpackage.AbstractC3405e r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2624e.adcel(eٖؕۢ):int");
    }

    public final boolean admob(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int m1028implements = m1028implements(i);
            long j2 = m1028implements & 1048575;
            switch (m1020default(m1028implements)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC5314e.metrica.appmetrica(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC5314e.metrica.purchase(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC5314e.metrica.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC5314e.metrica.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC5314e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC5314e.metrica.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC5314e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC5314e.metrica.metrica(j2, obj);
                case 8:
                    Object startapp = AbstractC5314e.metrica.startapp(j2, obj);
                    if (startapp instanceof String) {
                        return !((String) startapp).isEmpty();
                    }
                    if (startapp instanceof AbstractC10498e) {
                        return !AbstractC10498e.f20717e.equals(startapp);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC5314e.metrica.startapp(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC10498e.f20717e.equals(AbstractC5314e.metrica.startapp(j2, obj));
                case 11:
                    if (AbstractC5314e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC5314e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC5314e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC5314e.metrica.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC5314e.metrica.billing(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC5314e.metrica.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (AbstractC5314e.metrica.startapp(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & AbstractC5314e.metrica.billing(j, obj)) == 0) {
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
    @Override // defpackage.InterfaceC11115e
    public final int appmetrica(AbstractC3405e abstractC3405e) {
        int i;
        int startapp;
        int startapp2;
        int startapp3;
        int mopub;
        int startapp4;
        int mopub2;
        int startapp5;
        int startapp6;
        int startapp7;
        int ad;
        int adcel;
        int appmetrica;
        int startapp8;
        int ad2;
        int metrica;
        int startapp9;
        int size;
        int startapp10;
        int startapp11;
        int startapp12;
        int size2;
        int startapp13;
        int adcel2;
        int i2;
        int startapp14;
        int startapp15;
        int mopub3;
        int startapp16;
        int mopub4;
        int i3;
        C2624e c2624e = this;
        AbstractC3405e abstractC3405e2 = abstractC3405e;
        Unsafe unsafe = loadAd;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = c2624e.ad;
            if (i4 >= iArr.length) {
                c2624e.advert.getClass();
                return abstractC3405e2.unknownFields.vip() + i6;
            }
            int m1028implements = c2624e.m1028implements(i4);
            int m1020default = m1020default(m1028implements);
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & 1048575;
            if (m1020default <= 17) {
                if (i10 != i7) {
                    i5 = i10 == 1048575 ? 0 : unsafe.getInt(abstractC3405e2, i10);
                    i7 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = m1028implements & 1048575;
            if (m1020default >= EnumC8942e.f17960e.f17962e) {
                int i11 = EnumC8942e.f17959e.f17962e;
            }
            switch (m1020default) {
                case 0:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        startapp = AbstractC13258e.startapp(i8);
                        metrica = startapp + 8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 1:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        startapp2 = AbstractC13258e.startapp(i8);
                        startapp6 = startapp2 + 4;
                        i6 += startapp6;
                    }
                    c2624e = this;
                    abstractC3405e2 = abstractC3405e;
                    i4 += 3;
                case 2:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(abstractC3405e2, j);
                        startapp3 = AbstractC13258e.startapp(i8);
                        mopub = AbstractC13258e.mopub(j2);
                        i6 += mopub + startapp3;
                    }
                    c2624e = this;
                    i4 += 3;
                case 3:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(abstractC3405e2, j);
                        startapp3 = AbstractC13258e.startapp(i8);
                        mopub = AbstractC13258e.mopub(j3);
                        i6 += mopub + startapp3;
                    }
                    c2624e = this;
                    i4 += 3;
                case 4:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        int i12 = unsafe.getInt(abstractC3405e2, j);
                        startapp4 = AbstractC13258e.startapp(i8);
                        mopub2 = AbstractC13258e.mopub(i12);
                        appmetrica = mopub2 + startapp4;
                        i6 += appmetrica;
                    }
                    c2624e = this;
                    i4 += 3;
                case 5:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        startapp5 = AbstractC13258e.startapp(i8);
                        startapp6 = startapp5 + 8;
                        i6 += startapp6;
                    }
                    c2624e = this;
                    abstractC3405e2 = abstractC3405e;
                    i4 += 3;
                case 6:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        startapp2 = AbstractC13258e.startapp(i8);
                        startapp6 = startapp2 + 4;
                        i6 += startapp6;
                    }
                    c2624e = this;
                    abstractC3405e2 = abstractC3405e;
                    i4 += 3;
                case 7:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        startapp6 = AbstractC13258e.startapp(i8) + 1;
                        i6 += startapp6;
                    }
                    c2624e = this;
                    abstractC3405e2 = abstractC3405e;
                    i4 += 3;
                case 8:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        Object object = unsafe.getObject(abstractC3405e2, j);
                        i6 = (object instanceof AbstractC10498e ? AbstractC13258e.appmetrica(i8, (AbstractC10498e) object) : AbstractC13258e.yandex((String) object) + AbstractC13258e.startapp(i8)) + i6;
                    }
                    c2624e = this;
                    i4 += 3;
                case 9:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        Object object2 = unsafe.getObject(abstractC3405e2, j);
                        InterfaceC11115e Signature = c2624e.Signature(i4);
                        Class cls = AbstractC4249e.ad;
                        startapp7 = AbstractC13258e.startapp(i8);
                        ad = ((AbstractC7718e) object2).ad(Signature);
                        adcel = AbstractC13258e.adcel(ad);
                        i3 = adcel + ad + startapp7;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 10:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        appmetrica = AbstractC13258e.appmetrica(i8, (AbstractC10498e) unsafe.getObject(abstractC3405e2, j));
                        i6 += appmetrica;
                    }
                    c2624e = this;
                    i4 += 3;
                case 11:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        int i13 = unsafe.getInt(abstractC3405e2, j);
                        startapp4 = AbstractC13258e.startapp(i8);
                        mopub2 = AbstractC13258e.adcel(i13);
                        appmetrica = mopub2 + startapp4;
                        i6 += appmetrica;
                    }
                    c2624e = this;
                    i4 += 3;
                case 12:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        int i14 = unsafe.getInt(abstractC3405e2, j);
                        startapp4 = AbstractC13258e.startapp(i8);
                        mopub2 = AbstractC13258e.mopub(i14);
                        appmetrica = mopub2 + startapp4;
                        i6 += appmetrica;
                    }
                    c2624e = this;
                    i4 += 3;
                case 13:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        startapp2 = AbstractC13258e.startapp(i8);
                        startapp6 = startapp2 + 4;
                        i6 += startapp6;
                    }
                    c2624e = this;
                    abstractC3405e2 = abstractC3405e;
                    i4 += 3;
                case 14:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        startapp5 = AbstractC13258e.startapp(i8);
                        startapp6 = startapp5 + 8;
                        i6 += startapp6;
                    }
                    c2624e = this;
                    abstractC3405e2 = abstractC3405e;
                    i4 += 3;
                case 15:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(abstractC3405e2, j);
                        startapp4 = AbstractC13258e.startapp(i8);
                        mopub2 = AbstractC13258e.purchase(i15);
                        appmetrica = mopub2 + startapp4;
                        i6 += appmetrica;
                    }
                    c2624e = this;
                    i4 += 3;
                case 16:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        long j4 = unsafe.getLong(abstractC3405e2, j);
                        startapp3 = AbstractC13258e.startapp(i8);
                        mopub = AbstractC13258e.billing(j4);
                        i6 += mopub + startapp3;
                    }
                    c2624e = this;
                    i4 += 3;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c2624e.subscription(abstractC3405e2, i4, i7, i5, i)) {
                        AbstractC7718e abstractC7718e = (AbstractC7718e) unsafe.getObject(abstractC3405e2, j);
                        InterfaceC11115e Signature2 = c2624e.Signature(i4);
                        startapp8 = AbstractC13258e.startapp(i8) * 2;
                        ad2 = abstractC7718e.ad(Signature2);
                        metrica = ad2 + startapp8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    metrica = AbstractC4249e.metrica(i8, (List) unsafe.getObject(abstractC3405e2, j));
                    i6 += metrica;
                    i4 += 3;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    metrica = AbstractC4249e.vip(i8, (List) unsafe.getObject(abstractC3405e2, j));
                    i6 += metrica;
                    i4 += 3;
                case 20:
                    List list = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls2 = AbstractC4249e.ad;
                    if (list.size() != 0) {
                        startapp9 = (AbstractC13258e.startapp(i8) * list.size()) + AbstractC4249e.appmetrica(list);
                        i6 += startapp9;
                        i4 += 3;
                    }
                    startapp9 = 0;
                    i6 += startapp9;
                    i4 += 3;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls3 = AbstractC4249e.ad;
                    size = list2.size();
                    if (size != 0) {
                        startapp10 = AbstractC4249e.startapp(list2);
                        startapp11 = AbstractC13258e.startapp(i8);
                        startapp9 = (startapp11 * size) + startapp10;
                        i6 += startapp9;
                        i4 += 3;
                    }
                    startapp9 = 0;
                    i6 += startapp9;
                    i4 += 3;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls4 = AbstractC4249e.ad;
                    size = list3.size();
                    if (size != 0) {
                        startapp10 = AbstractC4249e.license(list3);
                        startapp11 = AbstractC13258e.startapp(i8);
                        startapp9 = (startapp11 * size) + startapp10;
                        i6 += startapp9;
                        i4 += 3;
                    }
                    startapp9 = 0;
                    i6 += startapp9;
                    i4 += 3;
                case 23:
                    metrica = AbstractC4249e.metrica(i8, (List) unsafe.getObject(abstractC3405e2, j));
                    i6 += metrica;
                    i4 += 3;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    metrica = AbstractC4249e.vip(i8, (List) unsafe.getObject(abstractC3405e2, j));
                    i6 += metrica;
                    i4 += 3;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls5 = AbstractC4249e.ad;
                    int size3 = list4.size();
                    i6 += size3 == 0 ? 0 : (AbstractC13258e.startapp(i8) + 1) * size3;
                    i4 += 3;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls6 = AbstractC4249e.ad;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        startapp9 = AbstractC13258e.startapp(i8) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof AbstractC10498e) {
                                int size5 = ((AbstractC10498e) obj).size();
                                startapp9 = AbstractC13258e.adcel(size5) + size5 + startapp9;
                            } else {
                                startapp9 = AbstractC13258e.yandex((String) obj) + startapp9;
                            }
                        }
                        i6 += startapp9;
                        i4 += 3;
                    }
                    startapp9 = 0;
                    i6 += startapp9;
                    i4 += 3;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC3405e2, j);
                    InterfaceC11115e Signature3 = c2624e.Signature(i4);
                    Class cls7 = AbstractC4249e.ad;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        startapp12 = 0;
                    } else {
                        startapp12 = AbstractC13258e.startapp(i8) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int ad3 = ((AbstractC7718e) list6.get(i17)).ad(Signature3);
                            startapp12 += AbstractC13258e.adcel(ad3) + ad3;
                        }
                    }
                    i6 += startapp12;
                    i4 += 3;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls8 = AbstractC4249e.ad;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        startapp9 = AbstractC13258e.startapp(i8) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((AbstractC10498e) list7.get(i18)).size();
                            startapp9 += AbstractC13258e.adcel(size8) + size8;
                        }
                        i6 += startapp9;
                        i4 += 3;
                    }
                    startapp9 = 0;
                    i6 += startapp9;
                    i4 += 3;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls9 = AbstractC4249e.ad;
                    size = list8.size();
                    if (size != 0) {
                        startapp10 = AbstractC4249e.yandex(list8);
                        startapp11 = AbstractC13258e.startapp(i8);
                        startapp9 = (startapp11 * size) + startapp10;
                        i6 += startapp9;
                        i4 += 3;
                    }
                    startapp9 = 0;
                    i6 += startapp9;
                    i4 += 3;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls10 = AbstractC4249e.ad;
                    size = list9.size();
                    if (size != 0) {
                        startapp10 = AbstractC4249e.ad(list9);
                        startapp11 = AbstractC13258e.startapp(i8);
                        startapp9 = (startapp11 * size) + startapp10;
                        i6 += startapp9;
                        i4 += 3;
                    }
                    startapp9 = 0;
                    i6 += startapp9;
                    i4 += 3;
                case 31:
                    metrica = AbstractC4249e.vip(i8, (List) unsafe.getObject(abstractC3405e2, j));
                    i6 += metrica;
                    i4 += 3;
                case 32:
                    metrica = AbstractC4249e.metrica(i8, (List) unsafe.getObject(abstractC3405e2, j));
                    i6 += metrica;
                    i4 += 3;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls11 = AbstractC4249e.ad;
                    size = list10.size();
                    if (size != 0) {
                        startapp10 = AbstractC4249e.purchase(list10);
                        startapp11 = AbstractC13258e.startapp(i8);
                        startapp9 = (startapp11 * size) + startapp10;
                        i6 += startapp9;
                        i4 += 3;
                    }
                    startapp9 = 0;
                    i6 += startapp9;
                    i4 += 3;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls12 = AbstractC4249e.ad;
                    size = list11.size();
                    if (size != 0) {
                        startapp10 = AbstractC4249e.billing(list11);
                        startapp11 = AbstractC13258e.startapp(i8);
                        startapp9 = (startapp11 * size) + startapp10;
                        i6 += startapp9;
                        i4 += 3;
                    }
                    startapp9 = 0;
                    i6 += startapp9;
                    i4 += 3;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls13 = AbstractC4249e.ad;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls14 = AbstractC4249e.ad;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = AbstractC4249e.appmetrica((List) unsafe.getObject(abstractC3405e2, j));
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = AbstractC4249e.startapp((List) unsafe.getObject(abstractC3405e2, j));
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = AbstractC4249e.license((List) unsafe.getObject(abstractC3405e2, j));
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls15 = AbstractC4249e.ad;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls16 = AbstractC4249e.ad;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls17 = AbstractC4249e.ad;
                    size2 = list16.size();
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = AbstractC4249e.yandex((List) unsafe.getObject(abstractC3405e2, j));
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = AbstractC4249e.ad((List) unsafe.getObject(abstractC3405e2, j));
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls18 = AbstractC4249e.ad;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(abstractC3405e2, j);
                    Class cls19 = AbstractC4249e.ad;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = AbstractC4249e.purchase((List) unsafe.getObject(abstractC3405e2, j));
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 48:
                    size2 = AbstractC4249e.billing((List) unsafe.getObject(abstractC3405e2, j));
                    if (size2 > 0) {
                        startapp13 = AbstractC13258e.startapp(i8);
                        adcel2 = AbstractC13258e.adcel(size2);
                        i6 += adcel2 + startapp13 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC3405e2, j);
                    InterfaceC11115e Signature4 = c2624e.Signature(i4);
                    Class cls20 = AbstractC4249e.ad;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            i2 += ((AbstractC7718e) list19.get(i19)).ad(Signature4) + (AbstractC13258e.startapp(i8) * 2);
                        }
                    }
                    i6 += i2;
                    i4 += 3;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(abstractC3405e2, j);
                    Object loadAd2 = c2624e.loadAd(i4);
                    c2624e.smaato.getClass();
                    C5835e c5835e = (C5835e) object3;
                    if (loadAd2 != null) {
                        throw new ClassCastException();
                    }
                    if (c5835e.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c5835e.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                case 51:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        startapp = AbstractC13258e.startapp(i8);
                        metrica = startapp + 8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 52:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        startapp14 = AbstractC13258e.startapp(i8);
                        metrica = startapp14 + 4;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 53:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        long subs = subs(j, abstractC3405e2);
                        startapp15 = AbstractC13258e.startapp(i8);
                        mopub3 = AbstractC13258e.mopub(subs);
                        i3 = mopub3 + startapp15;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 54:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        long subs2 = subs(j, abstractC3405e2);
                        startapp15 = AbstractC13258e.startapp(i8);
                        mopub3 = AbstractC13258e.mopub(subs2);
                        i3 = mopub3 + startapp15;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 55:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        int premium = premium(j, abstractC3405e2);
                        startapp16 = AbstractC13258e.startapp(i8);
                        mopub4 = AbstractC13258e.mopub(premium);
                        metrica = mopub4 + startapp16;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 56:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        startapp = AbstractC13258e.startapp(i8);
                        metrica = startapp + 8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 57:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        startapp14 = AbstractC13258e.startapp(i8);
                        metrica = startapp14 + 4;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 58:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        metrica = AbstractC13258e.startapp(i8) + 1;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 59:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        Object object4 = unsafe.getObject(abstractC3405e2, j);
                        i6 = (object4 instanceof AbstractC10498e ? AbstractC13258e.appmetrica(i8, (AbstractC10498e) object4) : AbstractC13258e.yandex((String) object4) + AbstractC13258e.startapp(i8)) + i6;
                    }
                    i4 += 3;
                case 60:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        Object object5 = unsafe.getObject(abstractC3405e2, j);
                        InterfaceC11115e Signature5 = c2624e.Signature(i4);
                        Class cls21 = AbstractC4249e.ad;
                        startapp7 = AbstractC13258e.startapp(i8);
                        ad = ((AbstractC7718e) object5).ad(Signature5);
                        adcel = AbstractC13258e.adcel(ad);
                        i3 = adcel + ad + startapp7;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 61:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        metrica = AbstractC13258e.appmetrica(i8, (AbstractC10498e) unsafe.getObject(abstractC3405e2, j));
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 62:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        int premium2 = premium(j, abstractC3405e2);
                        startapp16 = AbstractC13258e.startapp(i8);
                        mopub4 = AbstractC13258e.adcel(premium2);
                        metrica = mopub4 + startapp16;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 63:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        int premium3 = premium(j, abstractC3405e2);
                        startapp16 = AbstractC13258e.startapp(i8);
                        mopub4 = AbstractC13258e.mopub(premium3);
                        metrica = mopub4 + startapp16;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        startapp14 = AbstractC13258e.startapp(i8);
                        metrica = startapp14 + 4;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 65:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        startapp = AbstractC13258e.startapp(i8);
                        metrica = startapp + 8;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 66:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        int premium4 = premium(j, abstractC3405e2);
                        startapp16 = AbstractC13258e.startapp(i8);
                        mopub4 = AbstractC13258e.purchase(premium4);
                        metrica = mopub4 + startapp16;
                        i6 += metrica;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 67:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        long subs3 = subs(j, abstractC3405e2);
                        startapp15 = AbstractC13258e.startapp(i8);
                        mopub3 = AbstractC13258e.billing(subs3);
                        i3 = mopub3 + startapp15;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 68:
                    if (c2624e.pro(i8, i4, abstractC3405e2)) {
                        AbstractC7718e abstractC7718e2 = (AbstractC7718e) unsafe.getObject(abstractC3405e2, j);
                        InterfaceC11115e Signature6 = c2624e.Signature(i4);
                        startapp8 = AbstractC13258e.startapp(i8) * 2;
                        ad2 = abstractC7718e2.ad(Signature6);
                        metrica = ad2 + startapp8;
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

    @Override // defpackage.InterfaceC11115e
    public final void billing(Object obj, C7850e c7850e) {
        c7850e.getClass();
        m1024case(obj, c7850e);
    }

    /* renamed from: break, reason: not valid java name */
    public final void m1023break(int i, Object obj, Object obj2) {
        loadAd.putObject(obj, m1028implements(i) & 1048575, obj2);
        m1034while(i, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0045. Please report as an issue. */
    /* renamed from: case, reason: not valid java name */
    public final void m1024case(Object obj, C7850e c7850e) {
        int i;
        int i2;
        boolean z;
        C2624e c2624e = this;
        int[] iArr = c2624e.ad;
        int length = iArr.length;
        Unsafe unsafe = loadAd;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int m1028implements = c2624e.m1028implements(i5);
            int i7 = iArr[i5];
            int m1020default = m1020default(m1028implements);
            if (m1020default <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = m1028implements;
                i2 = 1 << (i8 >>> 20);
            } else {
                i = m1028implements;
                i2 = 0;
            }
            long j = i & i3;
            switch (m1020default) {
                case 0:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        double appmetrica = AbstractC5314e.metrica.appmetrica(j, obj);
                        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
                        abstractC13258e.getClass();
                        abstractC13258e.subscription(i7, Double.doubleToRawLongBits(appmetrica));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 1:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        float purchase = AbstractC5314e.metrica.purchase(j, obj);
                        AbstractC13258e abstractC13258e2 = (AbstractC13258e) c7850e.f15896e;
                        abstractC13258e2.getClass();
                        abstractC13258e2.Signature(i7, Float.floatToRawIntBits(purchase));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 2:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).applovin(i7, unsafe.getLong(obj, j));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 3:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).applovin(i7, unsafe.getLong(obj, j));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 4:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).pro(i7, unsafe.getInt(obj, j));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 5:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).subscription(i7, unsafe.getLong(obj, j));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 6:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).Signature(i7, unsafe.getInt(obj, j));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 7:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).amazon(i7, AbstractC5314e.metrica.metrica(j, obj));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 8:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((AbstractC13258e) c7850e.f15896e).tapsense(i7, (String) object);
                        } else {
                            ((AbstractC13258e) c7850e.f15896e).loadAd(i7, (AbstractC10498e) object);
                        }
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 9:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        c7850e.m2338new(i7, unsafe.getObject(obj, j), c2624e.Signature(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 10:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).loadAd(i7, (AbstractC10498e) unsafe.getObject(obj, j));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 11:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).inmobi(i7, unsafe.getInt(obj, j));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 12:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).pro(i7, unsafe.getInt(obj, j));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 13:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).Signature(i7, unsafe.getInt(obj, j));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 14:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        ((AbstractC13258e) c7850e.f15896e).subscription(i7, unsafe.getLong(obj, j));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 15:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((AbstractC13258e) c7850e.f15896e).inmobi(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case 16:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((AbstractC13258e) c7850e.f15896e).applovin(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    c2624e = this;
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c2624e.subscription(obj, i5, i4, i6, i2)) {
                        c7850e.m2333catch(i7, unsafe.getObject(obj, j), c2624e.Signature(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    AbstractC4249e.amazon(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    AbstractC4249e.subscription(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 20:
                    AbstractC4249e.pro(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 21:
                    AbstractC4249e.applovin(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 22:
                    AbstractC4249e.remoteconfig(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 23:
                    AbstractC4249e.admob(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    AbstractC4249e.Signature(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    AbstractC4249e.smaato(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = AbstractC4249e.ad;
                    if (list != null && !list.isEmpty()) {
                        c7850e.getClass();
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            ((AbstractC13258e) c7850e.f15896e).tapsense(i11, (String) list.get(i12));
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    int i13 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC11115e Signature = c2624e.Signature(i5);
                    Class cls2 = AbstractC4249e.ad;
                    if (list2 != null && !list2.isEmpty()) {
                        c7850e.getClass();
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            c7850e.m2338new(i13, list2.get(i14), Signature);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = AbstractC4249e.ad;
                    if (list3 != null && !list3.isEmpty()) {
                        c7850e.getClass();
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            ((AbstractC13258e) c7850e.f15896e).loadAd(i15, (AbstractC10498e) list3.get(i16));
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    z = false;
                    AbstractC4249e.isPro(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 30:
                    z = false;
                    AbstractC4249e.loadAd(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 31:
                    z = false;
                    AbstractC4249e.signatures(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case 32:
                    z = false;
                    AbstractC4249e.tapsense(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    z = false;
                    AbstractC4249e.isVip(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    z = false;
                    AbstractC4249e.inmobi(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, false);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    AbstractC4249e.amazon(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    AbstractC4249e.subscription(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    AbstractC4249e.pro(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    AbstractC4249e.applovin(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    AbstractC4249e.remoteconfig(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    AbstractC4249e.admob(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    AbstractC4249e.Signature(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    AbstractC4249e.smaato(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    AbstractC4249e.isPro(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    AbstractC4249e.loadAd(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    AbstractC4249e.signatures(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    AbstractC4249e.tapsense(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    AbstractC4249e.isVip(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case 48:
                    AbstractC4249e.inmobi(iArr[i5], (List) unsafe.getObject(obj, j), c7850e, true);
                    i5 += 3;
                    i3 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC11115e Signature2 = c2624e.Signature(i5);
                    Class cls4 = AbstractC4249e.ad;
                    if (list4 != null && !list4.isEmpty()) {
                        c7850e.getClass();
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            c7850e.m2333catch(i17, list4.get(i18), Signature2);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        Object loadAd2 = c2624e.loadAd(i5);
                        c2624e.smaato.getClass();
                        AbstractC1786e.applovin(loadAd2);
                        throw null;
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 51:
                    if (c2624e.pro(i7, i5, obj)) {
                        double doubleValue = ((Double) AbstractC5314e.metrica.startapp(j, obj)).doubleValue();
                        AbstractC13258e abstractC13258e3 = (AbstractC13258e) c7850e.f15896e;
                        abstractC13258e3.getClass();
                        abstractC13258e3.subscription(i7, Double.doubleToRawLongBits(doubleValue));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 52:
                    if (c2624e.pro(i7, i5, obj)) {
                        float floatValue = ((Float) AbstractC5314e.metrica.startapp(j, obj)).floatValue();
                        AbstractC13258e abstractC13258e4 = (AbstractC13258e) c7850e.f15896e;
                        abstractC13258e4.getClass();
                        abstractC13258e4.Signature(i7, Float.floatToRawIntBits(floatValue));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 53:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).applovin(i7, subs(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 54:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).applovin(i7, subs(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 55:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).pro(i7, premium(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 56:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).subscription(i7, subs(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 57:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).Signature(i7, premium(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 58:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).amazon(i7, ((Boolean) AbstractC5314e.metrica.startapp(j, obj)).booleanValue());
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 59:
                    if (c2624e.pro(i7, i5, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((AbstractC13258e) c7850e.f15896e).tapsense(i7, (String) object2);
                        } else {
                            ((AbstractC13258e) c7850e.f15896e).loadAd(i7, (AbstractC10498e) object2);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 60:
                    if (c2624e.pro(i7, i5, obj)) {
                        c7850e.m2338new(i7, unsafe.getObject(obj, j), c2624e.Signature(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 61:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).loadAd(i7, (AbstractC10498e) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 62:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).inmobi(i7, premium(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 63:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).pro(i7, premium(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).Signature(i7, premium(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 65:
                    if (c2624e.pro(i7, i5, obj)) {
                        ((AbstractC13258e) c7850e.f15896e).subscription(i7, subs(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 66:
                    if (c2624e.pro(i7, i5, obj)) {
                        int premium = premium(j, obj);
                        ((AbstractC13258e) c7850e.f15896e).inmobi(i7, (premium >> 31) ^ (premium << 1));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 67:
                    if (c2624e.pro(i7, i5, obj)) {
                        long subs = subs(j, obj);
                        ((AbstractC13258e) c7850e.f15896e).applovin(i7, (subs << 1) ^ (subs >> 63));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 68:
                    if (c2624e.pro(i7, i5, obj)) {
                        c7850e.m2333catch(i7, unsafe.getObject(obj, j), c2624e.Signature(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                default:
                    i5 += 3;
                    i3 = 1048575;
            }
        }
        c2624e.advert.getClass();
        ((AbstractC3405e) obj).unknownFields.appmetrica(c7850e);
    }

    /* renamed from: class, reason: not valid java name */
    public final int m1025class(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C6313e c6313e) {
        int i9;
        Unsafe unsafe = loadAd;
        long j2 = this.ad[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC2127e.purchase(i, bArr))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC2127e.appmetrica(i, bArr))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int advert = AbstractC2127e.advert(bArr, i, c6313e);
                unsafe.putObject(obj, j, Long.valueOf(c6313e.vip));
                unsafe.putInt(obj, j2, i4);
                return advert;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int adcel = AbstractC2127e.adcel(bArr, i, c6313e);
                unsafe.putObject(obj, j, Integer.valueOf(c6313e.ad));
                unsafe.putInt(obj, j2, i4);
                return adcel;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(AbstractC2127e.purchase(i, bArr)));
                int i12 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 57:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(AbstractC2127e.appmetrica(i, bArr)));
                int i13 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int advert2 = AbstractC2127e.advert(bArr, i, c6313e);
                unsafe.putObject(obj, j, Boolean.valueOf(c6313e.vip != 0));
                unsafe.putInt(obj, j2, i4);
                return advert2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int adcel2 = AbstractC2127e.adcel(bArr, i, c6313e);
                int i14 = c6313e.ad;
                if (i14 == 0) {
                    unsafe.putObject(obj, j, BuildConfig.FLAVOR);
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (AbstractC18226e.ad.advert(adcel2, adcel2 + i14, bArr) != 0) {
                            throw C8868e.vip();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, adcel2, i14, AbstractC10546e.ad));
                    adcel2 += i14;
                }
                unsafe.putInt(obj, j2, i4);
                return adcel2;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object isPro = isPro(i4, i8, obj);
                    int amazon2 = AbstractC2127e.amazon(isPro, Signature(i8), bArr, i9, i2, c6313e);
                    m1022abstract(i4, obj, isPro, i8);
                    return amazon2;
                }
                break;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int license = AbstractC2127e.license(bArr, i9, c6313e);
                    unsafe.putObject(obj, j, c6313e.metrica);
                    unsafe.putInt(obj, j2, i4);
                    return license;
                }
                break;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int adcel3 = AbstractC2127e.adcel(bArr, i9, c6313e);
                    int i15 = c6313e.ad;
                    amazon(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return adcel3;
                }
                break;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int adcel4 = AbstractC2127e.adcel(bArr, i9, c6313e);
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC15825e.appmetrica(c6313e.ad)));
                    unsafe.putInt(obj, j2, i4);
                    return adcel4;
                }
                break;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int advert3 = AbstractC2127e.advert(bArr, i9, c6313e);
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC15825e.billing(c6313e.vip)));
                    unsafe.putInt(obj, j2, i4);
                    return advert3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object isPro2 = isPro(i4, i8, obj);
                    int smaato = AbstractC2127e.smaato(isPro2, Signature(i8), bArr, i, i2, (i3 & (-8)) | 4, c6313e);
                    m1022abstract(i4, obj, isPro2, i8);
                    return smaato;
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
        C7323e c7323e = this.smaato;
        c7323e.getClass();
        if (!((C5835e) object).f12292e) {
            c7323e.getClass();
            C5835e metrica = C5835e.f12291e.metrica();
            c7323e.ad(metrica, object);
            unsafe.putObject(obj, j, metrica);
        }
        c7323e.getClass();
        AbstractC1786e.applovin(loadAd2);
        throw null;
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m1026extends(int i, C11226e c11226e, Object obj) {
        int i2 = 536870912 & i;
        C10088e c10088e = this.mopub;
        if (i2 != 0) {
            c11226e.m3126synchronized(c10088e.ad(i & 1048575, obj), true);
        } else {
            c11226e.m3126synchronized(c10088e.ad(i & 1048575, obj), false);
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
    
        throw defpackage.C8868e.purchase();
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
    
        throw defpackage.C8868e.purchase();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2624e.firebase(java.lang.Object, byte[], int, int, int, eَؙۥ):int");
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m1027goto(Object obj, long j, C11226e c11226e, InterfaceC11115e interfaceC11115e, C5712e c5712e) {
        int mo594this;
        InterfaceC16489e ad = this.mopub.ad(j, obj);
        AbstractC15825e abstractC15825e = (AbstractC15825e) c11226e.appmetrica;
        int i = c11226e.vip;
        if ((i & 7) != 3) {
            throw C8868e.metrica();
        }
        do {
            Object license = interfaceC11115e.license();
            c11226e.startapp(license, interfaceC11115e, c5712e);
            interfaceC11115e.vip(license);
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
    public final int m1028implements(int i) {
        return this.ad[i + 1];
    }

    public final Object inmobi(int i, Object obj) {
        InterfaceC11115e Signature = Signature(i);
        long m1028implements = m1028implements(i) & 1048575;
        if (!admob(i, obj)) {
            return Signature.license();
        }
        Object object = loadAd.getObject(obj, m1028implements);
        if (remoteconfig(object)) {
            return object;
        }
        Object license = Signature.license();
        if (object != null) {
            Signature.ad(license, object);
        }
        return license;
    }

    /* renamed from: interface, reason: not valid java name */
    public final int m1029interface(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, C6313e c6313e) {
        int i7;
        int mopub;
        Unsafe unsafe = loadAd;
        InterfaceC16489e interfaceC16489e = (InterfaceC16489e) unsafe.getObject(obj, j2);
        if (!((AbstractC11556e) interfaceC16489e).f23215e) {
            interfaceC16489e = interfaceC16489e.metrica(interfaceC16489e.size() * 2);
            unsafe.putObject(obj, j2, interfaceC16489e);
        }
        InterfaceC16489e interfaceC16489e2 = interfaceC16489e;
        long j3 = 0;
        switch (i6) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                if (i4 != 2) {
                    if (i4 != 1) {
                        return i;
                    }
                    AbstractC6125e abstractC6125e = (AbstractC6125e) interfaceC16489e2;
                    abstractC6125e.billing(Double.longBitsToDouble(AbstractC2127e.purchase(i, bArr)));
                    int i8 = i + 8;
                    while (i8 < i2) {
                        int adcel = AbstractC2127e.adcel(bArr, i8, c6313e);
                        if (i3 != c6313e.ad) {
                            return i8;
                        }
                        abstractC6125e.billing(Double.longBitsToDouble(AbstractC2127e.purchase(adcel, bArr)));
                        i8 = adcel + 8;
                    }
                    return i8;
                }
                AbstractC6125e abstractC6125e2 = (AbstractC6125e) interfaceC16489e2;
                int adcel2 = AbstractC2127e.adcel(bArr, i, c6313e);
                int i9 = c6313e.ad;
                int i10 = adcel2 + i9;
                if (i10 > bArr.length) {
                    throw C8868e.billing();
                }
                abstractC6125e2.getClass();
                int i11 = (i9 / 8) + 0;
                double[] dArr = abstractC6125e2.f12871e;
                if (i11 > dArr.length) {
                    if (dArr.length == 0) {
                        abstractC6125e2.f12871e = new double[Math.max(i11, 10)];
                    } else {
                        int length = dArr.length;
                        while (length < i11) {
                            length = AbstractC1634e.startapp(length, 3, 2, 1, 10);
                        }
                        abstractC6125e2.f12871e = Arrays.copyOf(abstractC6125e2.f12871e, length);
                    }
                }
                while (adcel2 < i10) {
                    abstractC6125e2.billing(Double.longBitsToDouble(AbstractC2127e.purchase(adcel2, bArr)));
                    adcel2 += 8;
                }
                if (adcel2 == i10) {
                    return adcel2;
                }
                throw C8868e.billing();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                if (i4 != 2) {
                    if (i4 != 5) {
                        return i;
                    }
                    AbstractC8435e abstractC8435e = (AbstractC8435e) interfaceC16489e2;
                    abstractC8435e.billing(Float.intBitsToFloat(AbstractC2127e.appmetrica(i, bArr)));
                    int i12 = i + 4;
                    while (i12 < i2) {
                        int adcel3 = AbstractC2127e.adcel(bArr, i12, c6313e);
                        if (i3 != c6313e.ad) {
                            return i12;
                        }
                        abstractC8435e.billing(Float.intBitsToFloat(AbstractC2127e.appmetrica(adcel3, bArr)));
                        i12 = adcel3 + 4;
                    }
                    return i12;
                }
                AbstractC8435e abstractC8435e2 = (AbstractC8435e) interfaceC16489e2;
                int adcel4 = AbstractC2127e.adcel(bArr, i, c6313e);
                int i13 = c6313e.ad;
                int i14 = adcel4 + i13;
                if (i14 > bArr.length) {
                    throw C8868e.billing();
                }
                abstractC8435e2.getClass();
                int i15 = (i13 / 4) + 0;
                float[] fArr = abstractC8435e2.f17199e;
                if (i15 > fArr.length) {
                    if (fArr.length == 0) {
                        abstractC8435e2.f17199e = new float[Math.max(i15, 10)];
                    } else {
                        int length2 = fArr.length;
                        while (length2 < i15) {
                            length2 = AbstractC1634e.startapp(length2, 3, 2, 1, 10);
                        }
                        abstractC8435e2.f17199e = Arrays.copyOf(abstractC8435e2.f17199e, length2);
                    }
                }
                while (adcel4 < i14) {
                    abstractC8435e2.billing(Float.intBitsToFloat(AbstractC2127e.appmetrica(adcel4, bArr)));
                    adcel4 += 4;
                }
                if (adcel4 == i14) {
                    return adcel4;
                }
                throw C8868e.billing();
            case 20:
            case 21:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                if (i4 == 2) {
                    AbstractC11266e abstractC11266e = (AbstractC11266e) interfaceC16489e2;
                    int adcel5 = AbstractC2127e.adcel(bArr, i, c6313e);
                    int i16 = c6313e.ad + adcel5;
                    while (adcel5 < i16) {
                        adcel5 = AbstractC2127e.advert(bArr, adcel5, c6313e);
                        abstractC11266e.billing(c6313e.vip);
                    }
                    if (adcel5 == i16) {
                        return adcel5;
                    }
                    throw C8868e.billing();
                }
                if (i4 != 0) {
                    return i;
                }
                AbstractC11266e abstractC11266e2 = (AbstractC11266e) interfaceC16489e2;
                int advert = AbstractC2127e.advert(bArr, i, c6313e);
                abstractC11266e2.billing(c6313e.vip);
                while (advert < i2) {
                    int adcel6 = AbstractC2127e.adcel(bArr, advert, c6313e);
                    if (i3 != c6313e.ad) {
                        return advert;
                    }
                    advert = AbstractC2127e.advert(bArr, adcel6, c6313e);
                    abstractC11266e2.billing(c6313e.vip);
                }
                return advert;
            case 22:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                i7 = i;
                if (i4 == 2) {
                    AbstractC14936e abstractC14936e = (AbstractC14936e) interfaceC16489e2;
                    int adcel7 = AbstractC2127e.adcel(bArr, i7, c6313e);
                    int i17 = c6313e.ad + adcel7;
                    while (adcel7 < i17) {
                        adcel7 = AbstractC2127e.adcel(bArr, adcel7, c6313e);
                        abstractC14936e.billing(c6313e.ad);
                    }
                    if (adcel7 == i17) {
                        return adcel7;
                    }
                    throw C8868e.billing();
                }
                if (i4 == 0) {
                    return AbstractC2127e.mopub(i3, bArr, i7, i2, interfaceC16489e2, c6313e);
                }
                break;
            case 23:
            case 32:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                i7 = i;
                if (i4 == 2) {
                    AbstractC11266e abstractC11266e3 = (AbstractC11266e) interfaceC16489e2;
                    int adcel8 = AbstractC2127e.adcel(bArr, i7, c6313e);
                    int i18 = c6313e.ad;
                    int i19 = adcel8 + i18;
                    if (i19 > bArr.length) {
                        throw C8868e.billing();
                    }
                    abstractC11266e3.getClass();
                    int i20 = (i18 / 8) + 0;
                    long[] jArr = abstractC11266e3.f22628e;
                    if (i20 > jArr.length) {
                        if (jArr.length == 0) {
                            abstractC11266e3.f22628e = new long[Math.max(i20, 10)];
                        } else {
                            int length3 = jArr.length;
                            while (length3 < i20) {
                                length3 = AbstractC1634e.startapp(length3, 3, 2, 1, 10);
                            }
                            abstractC11266e3.f22628e = Arrays.copyOf(abstractC11266e3.f22628e, length3);
                        }
                    }
                    while (adcel8 < i19) {
                        abstractC11266e3.billing(AbstractC2127e.purchase(adcel8, bArr));
                        adcel8 += 8;
                    }
                    if (adcel8 == i19) {
                        return adcel8;
                    }
                    throw C8868e.billing();
                }
                if (i4 == 1) {
                    AbstractC11266e abstractC11266e4 = (AbstractC11266e) interfaceC16489e2;
                    abstractC11266e4.billing(AbstractC2127e.purchase(i7, bArr));
                    int i21 = i7 + 8;
                    while (i21 < i2) {
                        int adcel9 = AbstractC2127e.adcel(bArr, i21, c6313e);
                        if (i3 != c6313e.ad) {
                            return i21;
                        }
                        abstractC11266e4.billing(AbstractC2127e.purchase(adcel9, bArr));
                        i21 = adcel9 + 8;
                    }
                    return i21;
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case 31:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                i7 = i;
                if (i4 == 2) {
                    AbstractC14936e abstractC14936e2 = (AbstractC14936e) interfaceC16489e2;
                    int adcel10 = AbstractC2127e.adcel(bArr, i7, c6313e);
                    int i22 = c6313e.ad;
                    int i23 = adcel10 + i22;
                    if (i23 > bArr.length) {
                        throw C8868e.billing();
                    }
                    abstractC14936e2.getClass();
                    int i24 = (i22 / 4) + 0;
                    int[] iArr = abstractC14936e2.f29616e;
                    if (i24 > iArr.length) {
                        if (iArr.length == 0) {
                            abstractC14936e2.f29616e = new int[Math.max(i24, 10)];
                        } else {
                            int length4 = iArr.length;
                            while (length4 < i24) {
                                length4 = AbstractC1634e.startapp(length4, 3, 2, 1, 10);
                            }
                            abstractC14936e2.f29616e = Arrays.copyOf(abstractC14936e2.f29616e, length4);
                        }
                    }
                    while (adcel10 < i23) {
                        abstractC14936e2.billing(AbstractC2127e.appmetrica(adcel10, bArr));
                        adcel10 += 4;
                    }
                    if (adcel10 == i23) {
                        return adcel10;
                    }
                    throw C8868e.billing();
                }
                if (i4 == 5) {
                    AbstractC14936e abstractC14936e3 = (AbstractC14936e) interfaceC16489e2;
                    abstractC14936e3.billing(AbstractC2127e.appmetrica(i7, bArr));
                    int i25 = i7 + 4;
                    while (i25 < i2) {
                        int adcel11 = AbstractC2127e.adcel(bArr, i25, c6313e);
                        if (i3 != c6313e.ad) {
                            return i25;
                        }
                        abstractC14936e3.billing(AbstractC2127e.appmetrica(adcel11, bArr));
                        i25 = adcel11 + 4;
                    }
                    return i25;
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                i7 = i;
                if (i4 == 2) {
                    AbstractC1654e abstractC1654e = (AbstractC1654e) interfaceC16489e2;
                    int adcel12 = AbstractC2127e.adcel(bArr, i7, c6313e);
                    int i26 = c6313e.ad + adcel12;
                    while (adcel12 < i26) {
                        adcel12 = AbstractC2127e.advert(bArr, adcel12, c6313e);
                        abstractC1654e.billing(c6313e.vip != 0);
                    }
                    if (adcel12 == i26) {
                        return adcel12;
                    }
                    throw C8868e.billing();
                }
                if (i4 == 0) {
                    AbstractC1654e abstractC1654e2 = (AbstractC1654e) interfaceC16489e2;
                    int advert2 = AbstractC2127e.advert(bArr, i7, c6313e);
                    abstractC1654e2.billing(c6313e.vip != 0);
                    int i27 = advert2;
                    while (i27 < i2) {
                        int adcel13 = AbstractC2127e.adcel(bArr, i27, c6313e);
                        if (i3 != c6313e.ad) {
                            return i27;
                        }
                        i27 = AbstractC2127e.advert(bArr, adcel13, c6313e);
                        long j4 = j3;
                        abstractC1654e2.billing(c6313e.vip != j4);
                        j3 = j4;
                    }
                    return i27;
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                i7 = i;
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int adcel14 = AbstractC2127e.adcel(bArr, i7, c6313e);
                        int i28 = c6313e.ad;
                        if (i28 < 0) {
                            throw C8868e.appmetrica();
                        }
                        if (i28 == 0) {
                            interfaceC16489e2.add(BuildConfig.FLAVOR);
                        } else {
                            interfaceC16489e2.add(new String(bArr, adcel14, i28, AbstractC10546e.ad));
                            adcel14 += i28;
                        }
                        while (adcel14 < i2) {
                            int adcel15 = AbstractC2127e.adcel(bArr, adcel14, c6313e);
                            if (i3 != c6313e.ad) {
                                return adcel14;
                            }
                            adcel14 = AbstractC2127e.adcel(bArr, adcel15, c6313e);
                            int i29 = c6313e.ad;
                            if (i29 < 0) {
                                throw C8868e.appmetrica();
                            }
                            if (i29 == 0) {
                                interfaceC16489e2.add(BuildConfig.FLAVOR);
                            } else {
                                interfaceC16489e2.add(new String(bArr, adcel14, i29, AbstractC10546e.ad));
                                adcel14 += i29;
                            }
                        }
                        return adcel14;
                    }
                    int adcel16 = AbstractC2127e.adcel(bArr, i7, c6313e);
                    int i30 = c6313e.ad;
                    if (i30 < 0) {
                        throw C8868e.appmetrica();
                    }
                    if (i30 == 0) {
                        interfaceC16489e2.add(BuildConfig.FLAVOR);
                    } else {
                        int i31 = adcel16 + i30;
                        if (AbstractC18226e.ad.advert(adcel16, i31, bArr) != 0) {
                            throw C8868e.vip();
                        }
                        interfaceC16489e2.add(new String(bArr, adcel16, i30, AbstractC10546e.ad));
                        adcel16 = i31;
                    }
                    while (adcel16 < i2) {
                        int adcel17 = AbstractC2127e.adcel(bArr, adcel16, c6313e);
                        if (i3 != c6313e.ad) {
                            return adcel16;
                        }
                        adcel16 = AbstractC2127e.adcel(bArr, adcel17, c6313e);
                        int i32 = c6313e.ad;
                        if (i32 < 0) {
                            throw C8868e.appmetrica();
                        }
                        if (i32 == 0) {
                            interfaceC16489e2.add(BuildConfig.FLAVOR);
                        } else {
                            int i33 = adcel16 + i32;
                            if (AbstractC18226e.ad.advert(adcel16, i33, bArr) != 0) {
                                throw C8868e.vip();
                            }
                            interfaceC16489e2.add(new String(bArr, adcel16, i32, AbstractC10546e.ad));
                            adcel16 = i33;
                        }
                    }
                    return adcel16;
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return i4 == 2 ? AbstractC2127e.billing(Signature(i5), i3, bArr, i, i2, interfaceC16489e2, c6313e) : i;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (i4 != 2) {
                    return i;
                }
                int adcel18 = AbstractC2127e.adcel(bArr, i, c6313e);
                int i34 = c6313e.ad;
                if (i34 < 0) {
                    throw C8868e.appmetrica();
                }
                if (i34 > bArr.length - adcel18) {
                    throw C8868e.billing();
                }
                if (i34 == 0) {
                    interfaceC16489e2.add(AbstractC10498e.f20717e);
                } else {
                    interfaceC16489e2.add(AbstractC10498e.yandex(adcel18, i34, bArr));
                    adcel18 += i34;
                }
                while (adcel18 < i2) {
                    int adcel19 = AbstractC2127e.adcel(bArr, adcel18, c6313e);
                    if (i3 != c6313e.ad) {
                        return adcel18;
                    }
                    adcel18 = AbstractC2127e.adcel(bArr, adcel19, c6313e);
                    int i35 = c6313e.ad;
                    if (i35 < 0) {
                        throw C8868e.appmetrica();
                    }
                    if (i35 > bArr.length - adcel18) {
                        throw C8868e.billing();
                    }
                    if (i35 == 0) {
                        interfaceC16489e2.add(AbstractC10498e.f20717e);
                    } else {
                        interfaceC16489e2.add(AbstractC10498e.yandex(adcel18, i35, bArr));
                        adcel18 += i35;
                    }
                }
                return adcel18;
            case 30:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                if (i4 == 2) {
                    AbstractC14936e abstractC14936e4 = (AbstractC14936e) interfaceC16489e2;
                    mopub = AbstractC2127e.adcel(bArr, i, c6313e);
                    int i36 = c6313e.ad + mopub;
                    while (mopub < i36) {
                        mopub = AbstractC2127e.adcel(bArr, mopub, c6313e);
                        abstractC14936e4.billing(c6313e.ad);
                    }
                    if (mopub != i36) {
                        throw C8868e.billing();
                    }
                } else {
                    if (i4 != 0) {
                        return i;
                    }
                    mopub = AbstractC2127e.mopub(i3, bArr, i, i2, interfaceC16489e2, c6313e);
                }
                amazon(i5);
                Class cls = AbstractC4249e.ad;
                return mopub;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                if (i4 == 2) {
                    AbstractC14936e abstractC14936e5 = (AbstractC14936e) interfaceC16489e2;
                    int adcel20 = AbstractC2127e.adcel(bArr, i, c6313e);
                    int i37 = c6313e.ad + adcel20;
                    while (adcel20 < i37) {
                        adcel20 = AbstractC2127e.adcel(bArr, adcel20, c6313e);
                        abstractC14936e5.billing(AbstractC15825e.appmetrica(c6313e.ad));
                    }
                    if (adcel20 == i37) {
                        return adcel20;
                    }
                    throw C8868e.billing();
                }
                if (i4 != 0) {
                    return i;
                }
                AbstractC14936e abstractC14936e6 = (AbstractC14936e) interfaceC16489e2;
                int adcel21 = AbstractC2127e.adcel(bArr, i, c6313e);
                abstractC14936e6.billing(AbstractC15825e.appmetrica(c6313e.ad));
                while (adcel21 < i2) {
                    int adcel22 = AbstractC2127e.adcel(bArr, adcel21, c6313e);
                    if (i3 != c6313e.ad) {
                        return adcel21;
                    }
                    adcel21 = AbstractC2127e.adcel(bArr, adcel22, c6313e);
                    abstractC14936e6.billing(AbstractC15825e.appmetrica(c6313e.ad));
                }
                return adcel21;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case 48:
                if (i4 == 2) {
                    AbstractC11266e abstractC11266e5 = (AbstractC11266e) interfaceC16489e2;
                    int adcel23 = AbstractC2127e.adcel(bArr, i, c6313e);
                    int i38 = c6313e.ad + adcel23;
                    while (adcel23 < i38) {
                        adcel23 = AbstractC2127e.advert(bArr, adcel23, c6313e);
                        abstractC11266e5.billing(AbstractC15825e.billing(c6313e.vip));
                    }
                    if (adcel23 == i38) {
                        return adcel23;
                    }
                    throw C8868e.billing();
                }
                if (i4 != 0) {
                    return i;
                }
                AbstractC11266e abstractC11266e6 = (AbstractC11266e) interfaceC16489e2;
                int advert3 = AbstractC2127e.advert(bArr, i, c6313e);
                abstractC11266e6.billing(AbstractC15825e.billing(c6313e.vip));
                while (advert3 < i2) {
                    int adcel24 = AbstractC2127e.adcel(bArr, advert3, c6313e);
                    if (i3 != c6313e.ad) {
                        return advert3;
                    }
                    advert3 = AbstractC2127e.advert(bArr, adcel24, c6313e);
                    abstractC11266e6.billing(AbstractC15825e.billing(c6313e.vip));
                }
                return advert3;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i4 == 3) {
                    InterfaceC11115e Signature = Signature(i5);
                    int i39 = (i3 & (-8)) | 4;
                    Object license = Signature.license();
                    int smaato = AbstractC2127e.smaato(license, Signature, bArr, i, i2, i39, c6313e);
                    byte[] bArr2 = bArr;
                    int i40 = i2;
                    int i41 = i39;
                    C6313e c6313e2 = c6313e;
                    Signature.vip(license);
                    c6313e2.metrica = license;
                    interfaceC16489e2.add(license);
                    while (smaato < i40) {
                        int adcel25 = AbstractC2127e.adcel(bArr2, smaato, c6313e2);
                        if (i3 != c6313e2.ad) {
                            return smaato;
                        }
                        Object license2 = Signature.license();
                        byte[] bArr3 = bArr2;
                        int i42 = i40;
                        C6313e c6313e3 = c6313e2;
                        int i43 = i41;
                        smaato = AbstractC2127e.smaato(license2, Signature, bArr3, adcel25, i42, i43, c6313e3);
                        Signature.vip(license2);
                        c6313e3.metrica = license2;
                        interfaceC16489e2.add(license2);
                        i41 = i43;
                        bArr2 = bArr3;
                        i40 = i42;
                        c6313e2 = c6313e3;
                    }
                    return smaato;
                }
            default:
                return i;
        }
        return i7;
    }

    public final Object isPro(int i, int i2, Object obj) {
        InterfaceC11115e Signature = Signature(i2);
        if (!pro(i, i2, obj)) {
            return Signature.license();
        }
        Object object = loadAd.getObject(obj, m1028implements(i2) & 1048575);
        if (remoteconfig(object)) {
            return object;
        }
        Object license = Signature.license();
        if (object != null) {
            Signature.ad(license, object);
        }
        return license;
    }

    public final void isVip(int i, Object obj, Object obj2) {
        int[] iArr = this.ad;
        int i2 = iArr[i];
        if (pro(i2, i, obj2)) {
            long m1028implements = m1028implements(i) & 1048575;
            Unsafe unsafe = loadAd;
            Object object = unsafe.getObject(obj2, m1028implements);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC11115e Signature = Signature(i);
            if (!pro(i2, i, obj)) {
                if (remoteconfig(object)) {
                    Object license = Signature.license();
                    Signature.ad(license, object);
                    unsafe.putObject(obj, m1028implements, license);
                } else {
                    unsafe.putObject(obj, m1028implements, object);
                }
                m1033try(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m1028implements);
            if (!remoteconfig(object2)) {
                Object license2 = Signature.license();
                Signature.ad(license2, object2);
                unsafe.putObject(obj, m1028implements, license2);
                object2 = license2;
            }
            Signature.ad(object2, object);
        }
    }

    @Override // defpackage.InterfaceC11115e
    public final Object license() {
        this.adcel.getClass();
        return ((AbstractC3405e) this.appmetrica).subscription();
    }

    public final Object loadAd(int i) {
        return this.vip[(i / 3) * 2];
    }

    @Override // defpackage.InterfaceC11115e
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
            int m1028implements = m1028implements(i7);
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
            if ((268435456 & m1028implements) == 0 || subscription(obj, i2, i, i3, i11)) {
                int m1020default = m1020default(m1028implements);
                if (m1020default == 9 || m1020default == 17) {
                    if (subscription(obj, i2, i, i3, i11)) {
                        if (!Signature(i2).metrica(AbstractC5314e.metrica.startapp(m1028implements & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (m1020default != 27) {
                        if (m1020default == 60 || m1020default == 68) {
                            if (pro(i8, i2, obj)) {
                                if (!Signature(i2).metrica(AbstractC5314e.metrica.startapp(m1028implements & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (m1020default != 49) {
                            if (m1020default != 50) {
                                continue;
                            } else {
                                Object startapp = AbstractC5314e.metrica.startapp(m1028implements & 1048575, obj);
                                this.smaato.getClass();
                                if (!((C5835e) startapp).isEmpty()) {
                                    AbstractC1786e.applovin(loadAd(i2));
                                    throw null;
                                }
                            }
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
                    }
                    List list = (List) AbstractC5314e.metrica.startapp(m1028implements & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC11115e Signature = Signature(i2);
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

    public final boolean mopub(AbstractC3405e abstractC3405e, AbstractC3405e abstractC3405e2, int i) {
        return admob(i, abstractC3405e) == admob(i, abstractC3405e2);
    }

    /* renamed from: native, reason: not valid java name */
    public final void m1030native(int i, C11226e c11226e, Object obj) {
        if ((536870912 & i) != 0) {
            c11226e.m3077continue(2);
            AbstractC5314e.Signature(i & 1048575, obj, ((AbstractC15825e) c11226e.appmetrica).mo586goto());
        } else if (!this.purchase) {
            AbstractC5314e.Signature(i & 1048575, obj, c11226e.remoteconfig());
        } else {
            c11226e.m3077continue(2);
            AbstractC5314e.Signature(i & 1048575, obj, ((AbstractC15825e) c11226e.appmetrica).mo588interface());
        }
    }

    public final boolean pro(int i, int i2, Object obj) {
        return AbstractC5314e.metrica.billing((long) (this.ad[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: protected, reason: not valid java name */
    public final int m1031protected(int i, int i2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:191:0x006b, code lost:
    
        if (r13 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (r13 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
    
        ((defpackage.AbstractC3405e) r2).unknownFields = r13;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x007b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06bd A[Catch: all -> 0x0422, TryCatch #1 {all -> 0x0422, blocks: (B:37:0x06b8, B:39:0x06bd, B:40:0x06c2, B:139:0x041d, B:142:0x0425, B:143:0x0437, B:144:0x0449, B:145:0x045b, B:146:0x046d, B:147:0x047f, B:148:0x0491, B:149:0x04a3, B:150:0x04b5, B:151:0x04cf, B:152:0x04eb, B:153:0x0508, B:154:0x0525, B:155:0x0542, B:156:0x0562, B:157:0x057f, B:158:0x0594, B:159:0x05af, B:160:0x05bc, B:161:0x05db, B:162:0x05f8, B:163:0x0615, B:164:0x0632, B:165:0x064f, B:166:0x066c, B:167:0x068a, B:172:0x06a8), top: B:36:0x06b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x06c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x06e9 A[LOOP:3: B:55:0x06e7->B:56:0x06e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x06f3  */
    @Override // defpackage.InterfaceC11115e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(java.lang.Object r21, defpackage.C11226e r22, defpackage.C5712e r23) {
        /*
            Method dump skipped, instructions count: 1930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2624e.purchase(java.lang.Object, eُؙۙ, eؘٖٙ):void");
    }

    public final void signatures(int i, Object obj, Object obj2) {
        long m1028implements = m1028implements(i) & 1048575;
        Object startapp = AbstractC5314e.metrica.startapp(m1028implements, obj);
        C7323e c7323e = this.smaato;
        if (startapp != null) {
            c7323e.getClass();
            if (!((C5835e) startapp).f12292e) {
                c7323e.getClass();
                C5835e metrica = C5835e.f12291e.metrica();
                c7323e.ad(metrica, startapp);
                AbstractC5314e.Signature(m1028implements, obj, metrica);
                startapp = metrica;
            }
        } else {
            c7323e.getClass();
            startapp = C5835e.f12291e.metrica();
            AbstractC5314e.Signature(m1028implements, obj, startapp);
        }
        c7323e.getClass();
        c7323e.getClass();
        AbstractC1786e.applovin(obj2);
        throw null;
    }

    public final void smaato(int i, Object obj, Object obj2) {
        int i2 = this.ad[i];
        if (AbstractC5314e.metrica.startapp(m1028implements(i) & 1048575, obj) == null) {
            return;
        }
        amazon(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (defpackage.AbstractC4249e.advert(r5.startapp(r7, r12), r5.startapp(r7, r13)) != false) goto L105;
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
    
        if (defpackage.AbstractC4249e.advert(r5.startapp(r7, r12), r5.startapp(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (defpackage.AbstractC4249e.advert(r5.startapp(r7, r12), r5.startapp(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (defpackage.AbstractC4249e.advert(r5.startapp(r7, r12), r5.startapp(r7, r13)) != false) goto L105;
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
    
        if (defpackage.AbstractC4249e.advert(r9.startapp(r7, r12), r9.startapp(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // defpackage.InterfaceC11115e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startapp(defpackage.AbstractC3405e r12, defpackage.AbstractC3405e r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2624e.startapp(eٖؕۢ, eٖؕۢ):boolean");
    }

    public final boolean subscription(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? admob(i, obj) : (i3 & i4) != 0;
    }

    public final void tapsense(int i, Object obj, Object obj2) {
        if (admob(i, obj2)) {
            long m1028implements = m1028implements(i) & 1048575;
            Unsafe unsafe = loadAd;
            Object object = unsafe.getObject(obj2, m1028implements);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.ad[i] + " is present but null: " + obj2);
            }
            InterfaceC11115e Signature = Signature(i);
            if (!admob(i, obj)) {
                if (remoteconfig(object)) {
                    Object license = Signature.license();
                    Signature.ad(license, object);
                    unsafe.putObject(obj, m1028implements, license);
                } else {
                    unsafe.putObject(obj, m1028implements, object);
                }
                m1034while(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m1028implements);
            if (!remoteconfig(object2)) {
                Object license2 = Signature.license();
                Signature.ad(license2, object2);
                unsafe.putObject(obj, m1028implements, license2);
                object2 = license2;
            }
            Signature.ad(object2, object);
        }
    }

    /* renamed from: this, reason: not valid java name */
    public final void m1032this(Object obj, int i, C11226e c11226e, InterfaceC11115e interfaceC11115e, C5712e c5712e) {
        int mo594this;
        InterfaceC16489e ad = this.mopub.ad(i & 1048575, obj);
        AbstractC15825e abstractC15825e = (AbstractC15825e) c11226e.appmetrica;
        int i2 = c11226e.vip;
        if ((i2 & 7) != 2) {
            throw C8868e.metrica();
        }
        do {
            Object license = interfaceC11115e.license();
            c11226e.advert(license, interfaceC11115e, c5712e);
            interfaceC11115e.vip(license);
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
    public final void m1033try(int i, int i2, Object obj) {
        AbstractC5314e.amazon(this.ad[i2 + 2] & 1048575, obj, i);
    }

    @Override // defpackage.InterfaceC11115e
    public final void vip(Object obj) {
        if (remoteconfig(obj)) {
            if (obj instanceof AbstractC3405e) {
                AbstractC3405e abstractC3405e = (AbstractC3405e) obj;
                abstractC3405e.isVip(Alert.DURATION_SHOW_INDEFINITELY);
                abstractC3405e.memoizedHashCode = 0;
                abstractC3405e.Signature();
            }
            int[] iArr = this.ad;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int m1028implements = m1028implements(i);
                long j = 1048575 & m1028implements;
                int m1020default = m1020default(m1028implements);
                if (m1020default != 9) {
                    if (m1020default != 60 && m1020default != 68) {
                        switch (m1020default) {
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
                                AbstractC11556e abstractC11556e = (AbstractC11556e) ((InterfaceC16489e) AbstractC5314e.metrica.startapp(j, obj));
                                if (abstractC11556e.f23215e) {
                                    abstractC11556e.f23215e = false;
                                    break;
                                } else {
                                    break;
                                }
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                Unsafe unsafe = loadAd;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.smaato.getClass();
                                    ((C5835e) object).f12292e = false;
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
            C1434e c1434e = ((AbstractC3405e) obj).unknownFields;
            if (c1434e.appmetrica) {
                c1434e.appmetrica = false;
            }
        }
    }

    /* renamed from: while, reason: not valid java name */
    public final void m1034while(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC5314e.amazon(j, obj, (1 << (i2 >>> 20)) | AbstractC5314e.metrica.billing(j, obj));
    }

    @Override // defpackage.InterfaceC11115e
    public final void yandex(Object obj, byte[] bArr, int i, int i2, C6313e c6313e) {
        firebase(obj, bArr, i, i2, 0, c6313e);
    }
}
