package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3017e implements InterfaceC15433e {
    public static final int[] advert = new int[0];
    public static final Unsafe smaato = AbstractC8314e.startapp();
    public final int[] ad;
    public final C11672e adcel;
    public final AbstractC4291e appmetrica;
    public final int[] billing;
    public final int license;
    public final int metrica;
    public final C6607e mopub;
    public final boolean purchase;
    public final int startapp;
    public final Object[] vip;
    public final int yandex;

    public C3017e(int[] iArr, Object[] objArr, int i, int i2, AbstractC4291e abstractC4291e, int[] iArr2, int i3, int i4, C11672e c11672e, C6607e c6607e) {
        this.ad = iArr;
        this.vip = objArr;
        this.metrica = i;
        this.license = i2;
        boolean z = false;
        if (c6607e != null && (abstractC4291e instanceof AbstractC15267e)) {
            z = true;
        }
        this.purchase = z;
        this.billing = iArr2;
        this.yandex = i3;
        this.startapp = i4;
        this.adcel = c11672e;
        this.mopub = c6607e;
        this.appmetrica = abstractC4291e;
    }

    public static long ads(long j, Object obj) {
        return ((Long) AbstractC8314e.yandex(j, obj)).longValue();
    }

    /* renamed from: class, reason: not valid java name */
    public static Field m1228class(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder tapsense = AbstractC17861e.tapsense("Field ", str, " for ", name, " not found. Known fields are ");
            tapsense.append(arrays);
            throw new RuntimeException(tapsense.toString());
        }
    }

    public static int isPro(int i) {
        return (i >>> 20) & 255;
    }

    public static int isVip(long j, Object obj) {
        return ((Integer) AbstractC8314e.yandex(j, obj)).intValue();
    }

    public static C10308e signatures(Object obj) {
        AbstractC17076e abstractC17076e = (AbstractC17076e) obj;
        C10308e c10308e = abstractC17076e.zzc;
        if (c10308e != C10308e.purchase) {
            return c10308e;
        }
        C10308e vip = C10308e.vip();
        abstractC17076e.zzc = vip;
        return vip;
    }

    public static boolean subscription(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC17076e) {
            return ((AbstractC17076e) obj).mopub();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C3017e tapsense(defpackage.C5166e r35, defpackage.C11672e r36, defpackage.C6607e r37) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3017e.tapsense(eؙؗۜ, eُِۘ, eؙٕۘ):eٟؔۧ");
    }

    public final boolean Signature(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int applovin = applovin(i);
            long j2 = applovin & 1048575;
            switch (isPro(applovin)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC8314e.metrica.ad(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC8314e.metrica.metrica(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC8314e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC8314e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC8314e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC8314e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC8314e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC8314e.metrica.smaato(j2, obj);
                case 8:
                    Object yandex = AbstractC8314e.yandex(j2, obj);
                    if (yandex instanceof String) {
                        if (((String) yandex).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(yandex instanceof AbstractC13532e)) {
                            throw new IllegalArgumentException();
                        }
                        if (AbstractC13532e.f26826e.equals(yandex)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (AbstractC8314e.yandex(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (AbstractC13532e.f26826e.equals(AbstractC8314e.yandex(j2, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (AbstractC8314e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC8314e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC8314e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC8314e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC8314e.appmetrica(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC8314e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (AbstractC8314e.yandex(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & AbstractC8314e.appmetrica(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC15433e
    public final void ad(Object obj) {
        if (!subscription(obj)) {
            return;
        }
        if (obj instanceof AbstractC17076e) {
            AbstractC17076e abstractC17076e = (AbstractC17076e) obj;
            abstractC17076e.startapp();
            abstractC17076e.zza = 0;
            abstractC17076e.billing();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.ad;
            if (i >= iArr.length) {
                this.adcel.getClass();
                C10308e c10308e = ((AbstractC17076e) obj).zzc;
                if (c10308e.appmetrica) {
                    c10308e.appmetrica = false;
                }
                if (this.purchase) {
                    this.mopub.getClass();
                    ((AbstractC15267e) obj).zzb.license();
                    return;
                }
                return;
            }
            int applovin = applovin(i);
            int i2 = 1048575 & applovin;
            int isPro = isPro(applovin);
            long j = i2;
            if (isPro != 9) {
                if (isPro != 60 && isPro != 68) {
                    switch (isPro) {
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
                            AbstractC18495e abstractC18495e = (AbstractC18495e) ((InterfaceC5024e) AbstractC8314e.yandex(j, obj));
                            if (!abstractC18495e.f36253e) {
                                break;
                            } else {
                                abstractC18495e.f36253e = false;
                                break;
                            }
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            Unsafe unsafe = smaato;
                            Object object = unsafe.getObject(obj, j);
                            if (object == null) {
                                break;
                            } else {
                                ((C17456e) object).f34187e = false;
                                unsafe.putObject(obj, j, object);
                                break;
                            }
                    }
                } else if (remoteconfig(iArr[i], i, obj)) {
                    subs(i).ad(smaato.getObject(obj, j));
                }
                i += 3;
            }
            if (Signature(i, obj)) {
                subs(i).ad(smaato.getObject(obj, j));
            }
            i += 3;
        }
    }

    public final void adcel(int i, Object obj, Object obj2) {
        if (Signature(i, obj2)) {
            int applovin = applovin(i) & 1048575;
            Unsafe unsafe = smaato;
            long j = applovin;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.ad[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC15433e subs = subs(i);
            if (!Signature(i, obj)) {
                if (subscription(object)) {
                    Object yandex = subs.yandex();
                    subs.purchase(yandex, object);
                    unsafe.putObject(obj, j, yandex);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                advert(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!subscription(object2)) {
                Object yandex2 = subs.yandex();
                subs.purchase(yandex2, object2);
                unsafe.putObject(obj, j, yandex2);
                object2 = yandex2;
            }
            subs.purchase(object2, object);
        }
    }

    public final boolean admob(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? Signature(i, obj) : (i3 & i4) != 0;
    }

    public final void advert(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC8314e.adcel(j, obj, (1 << (i2 >>> 20)) | AbstractC8314e.appmetrica(j, obj));
    }

    public final void amazon(int i, Object obj, Object obj2, int i2) {
        smaato.putObject(obj, applovin(i2) & 1048575, obj2);
        AbstractC8314e.adcel(this.ad[i2 + 2] & 1048575, obj, i);
    }

    public final int applovin(int i) {
        return this.ad[i + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC15433e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean appmetrica(defpackage.AbstractC17076e r8, defpackage.AbstractC17076e r9) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3017e.appmetrica(eٗ٘ۚ, eٗ٘ۚ):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:265:0x0570, code lost:
    
        if (r0.admob(r1, r2, r3, r4, r5) != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0572, code lost:
    
        r9 = defpackage.AbstractC1414e.Signature(r13 << 3, 8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x057d, code lost:
    
        if (r0.admob(r1, r2, r3, r4, r5) != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x057f, code lost:
    
        r9 = defpackage.AbstractC1414e.Signature(r13 << 3, 4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x061f, code lost:
    
        if (r0.admob(r1, r2, r3, r4, r5) != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0627, code lost:
    
        if (r0.admob(r1, r2, r3, r4, r5) != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0672, code lost:
    
        if (r0.admob(r1, r2, r3, r4, r5) != false) goto L226;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // defpackage.InterfaceC15433e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int billing(defpackage.AbstractC4291e r19) {
        /*
            Method dump skipped, instructions count: 1906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3017e.billing(eؖۖٔ):int");
    }

    public final Object crashlytics(int i, Object obj) {
        InterfaceC15433e subs = subs(i);
        int applovin = applovin(i) & 1048575;
        if (!Signature(i, obj)) {
            return subs.yandex();
        }
        Object object = smaato.getObject(obj, applovin);
        if (subscription(object)) {
            return object;
        }
        Object yandex = subs.yandex();
        if (object != null) {
            subs.purchase(yandex, object);
        }
        return yandex;
    }

    public final Object firebase(int i, int i2, Object obj) {
        InterfaceC15433e subs = subs(i2);
        if (!remoteconfig(i, i2, obj)) {
            return subs.yandex();
        }
        Object object = smaato.getObject(obj, applovin(i2) & 1048575);
        if (subscription(object)) {
            return object;
        }
        Object yandex = subs.yandex();
        if (object != null) {
            subs.purchase(yandex, object);
        }
        return yandex;
    }

    public final int inmobi(int i, int i2) {
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

    @Override // defpackage.InterfaceC15433e
    public final void license(Object obj, byte[] bArr, int i, int i2, C16807e c16807e) {
        pro(obj, bArr, i, i2, 0, c16807e);
    }

    public final boolean loadAd(AbstractC17076e abstractC17076e, AbstractC17076e abstractC17076e2, int i) {
        return Signature(i, abstractC17076e) == Signature(i, abstractC17076e2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ee, code lost:
    
        return false;
     */
    @Override // defpackage.InterfaceC15433e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean metrica(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3017e.metrica(java.lang.Object):boolean");
    }

    public final void mopub(int i, Object obj, Object obj2) {
        int[] iArr = this.ad;
        int i2 = iArr[i];
        if (remoteconfig(i2, i, obj2)) {
            int applovin = applovin(i) & 1048575;
            Unsafe unsafe = smaato;
            long j = applovin;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC15433e subs = subs(i);
            if (!remoteconfig(i2, i, obj)) {
                if (subscription(object)) {
                    Object yandex = subs.yandex();
                    subs.purchase(yandex, object);
                    unsafe.putObject(obj, j, yandex);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                AbstractC8314e.adcel(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!subscription(object2)) {
                Object yandex2 = subs.yandex();
                subs.purchase(yandex2, object2);
                unsafe.putObject(obj, j, yandex2);
                object2 = yandex2;
            }
            subs.purchase(object2, object);
        }
    }

    public final InterfaceC17631e premium(int i) {
        int i2 = i / 3;
        return (InterfaceC17631e) this.vip[i2 + i2 + 1];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int pro(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, defpackage.C16807e r43) {
        /*
            Method dump skipped, instructions count: 3818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3017e.pro(java.lang.Object, byte[], int, int, int, eٗؗٙ):int");
    }

    @Override // defpackage.InterfaceC15433e
    public final void purchase(Object obj, Object obj2) {
        Object obj3;
        if (!subscription(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.ad;
            if (i >= iArr.length) {
                Object obj4 = obj;
                AbstractC9415e.admob(obj4, obj2);
                if (this.purchase) {
                    AbstractC9415e.Signature(obj4, obj2);
                    return;
                }
                return;
            }
            int applovin = applovin(i);
            int i2 = applovin & 1048575;
            int isPro = isPro(applovin);
            int i3 = iArr[i];
            long j = i2;
            switch (isPro) {
                case 0:
                    if (Signature(i, obj2)) {
                        AbstractC17397e abstractC17397e = AbstractC8314e.metrica;
                        obj3 = obj;
                        abstractC17397e.yandex(obj3, j, abstractC17397e.ad(j, obj2));
                        advert(i, obj3);
                        break;
                    }
                    break;
                case 1:
                    if (Signature(i, obj2)) {
                        AbstractC17397e abstractC17397e2 = AbstractC8314e.metrica;
                        abstractC17397e2.mopub(obj, j, abstractC17397e2.metrica(j, obj2));
                        advert(i, obj);
                        break;
                    }
                    break;
                case 2:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.mopub(j, AbstractC8314e.purchase(j, obj2), obj);
                        advert(i, obj);
                        break;
                    }
                    break;
                case 3:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.mopub(j, AbstractC8314e.purchase(j, obj2), obj);
                        advert(i, obj);
                        break;
                    }
                    break;
                case 4:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.adcel(j, obj, AbstractC8314e.appmetrica(j, obj2));
                        advert(i, obj);
                        break;
                    }
                    break;
                case 5:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.mopub(j, AbstractC8314e.purchase(j, obj2), obj);
                        advert(i, obj);
                        break;
                    }
                    break;
                case 6:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.adcel(j, obj, AbstractC8314e.appmetrica(j, obj2));
                        advert(i, obj);
                        break;
                    }
                    break;
                case 7:
                    if (Signature(i, obj2)) {
                        AbstractC17397e abstractC17397e3 = AbstractC8314e.metrica;
                        abstractC17397e3.appmetrica(obj, j, abstractC17397e3.smaato(j, obj2));
                        advert(i, obj);
                        break;
                    }
                    break;
                case 8:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.advert(j, obj, AbstractC8314e.yandex(j, obj2));
                        advert(i, obj);
                        break;
                    }
                    break;
                case 9:
                    adcel(i, obj, obj2);
                    break;
                case 10:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.advert(j, obj, AbstractC8314e.yandex(j, obj2));
                        advert(i, obj);
                        break;
                    }
                    break;
                case 11:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.adcel(j, obj, AbstractC8314e.appmetrica(j, obj2));
                        advert(i, obj);
                        break;
                    }
                    break;
                case 12:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.adcel(j, obj, AbstractC8314e.appmetrica(j, obj2));
                        advert(i, obj);
                        break;
                    }
                    break;
                case 13:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.adcel(j, obj, AbstractC8314e.appmetrica(j, obj2));
                        advert(i, obj);
                        break;
                    }
                    break;
                case 14:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.mopub(j, AbstractC8314e.purchase(j, obj2), obj);
                        advert(i, obj);
                        break;
                    }
                    break;
                case 15:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.adcel(j, obj, AbstractC8314e.appmetrica(j, obj2));
                        advert(i, obj);
                        break;
                    }
                    break;
                case 16:
                    if (Signature(i, obj2)) {
                        AbstractC8314e.mopub(j, AbstractC8314e.purchase(j, obj2), obj);
                        advert(i, obj);
                        break;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    adcel(i, obj, obj2);
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
                    InterfaceC5024e interfaceC5024e = (InterfaceC5024e) AbstractC8314e.yandex(j, obj);
                    InterfaceC5024e interfaceC5024e2 = (InterfaceC5024e) AbstractC8314e.yandex(j, obj2);
                    int size = interfaceC5024e.size();
                    int size2 = interfaceC5024e2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC18495e) interfaceC5024e).f36253e) {
                            interfaceC5024e = interfaceC5024e.vip(size2 + size);
                        }
                        interfaceC5024e.addAll(interfaceC5024e2);
                    }
                    if (size > 0) {
                        interfaceC5024e2 = interfaceC5024e;
                    }
                    AbstractC8314e.advert(j, obj, interfaceC5024e2);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    C11672e c11672e = AbstractC9415e.ad;
                    AbstractC8314e.advert(j, obj, C13023e.pro(AbstractC8314e.yandex(j, obj), AbstractC8314e.yandex(j, obj2)));
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
                    if (remoteconfig(i3, i, obj2)) {
                        AbstractC8314e.advert(j, obj, AbstractC8314e.yandex(j, obj2));
                        AbstractC8314e.adcel(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                    break;
                case 60:
                    mopub(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (remoteconfig(i3, i, obj2)) {
                        AbstractC8314e.advert(j, obj, AbstractC8314e.yandex(j, obj2));
                        AbstractC8314e.adcel(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                    break;
                case 68:
                    mopub(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    public final boolean remoteconfig(int i, int i2, Object obj) {
        return AbstractC8314e.appmetrica((long) (this.ad[i2 + 2] & 1048575), obj) == i;
    }

    public final void smaato(int i, Object obj, Object obj2) {
        smaato.putObject(obj, applovin(i) & 1048575, obj2);
        advert(i, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x009b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // defpackage.InterfaceC15433e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startapp(java.lang.Object r20, defpackage.C17698e r21) {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3017e.startapp(java.lang.Object, eِ٘ٞ):void");
    }

    public final InterfaceC15433e subs(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.vip;
        InterfaceC15433e interfaceC15433e = (InterfaceC15433e) objArr[i3];
        if (interfaceC15433e != null) {
            return interfaceC15433e;
        }
        InterfaceC15433e ad = C17792e.metrica.ad((Class) objArr[i3 + 1]);
        objArr[i3] = ad;
        return ad;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // defpackage.InterfaceC15433e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.AbstractC17076e r11) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3017e.vip(eٗ٘ۚ):int");
    }

    @Override // defpackage.InterfaceC15433e
    public final Object yandex() {
        return (AbstractC17076e) ((AbstractC17076e) this.appmetrica).smaato(4, null);
    }
}
