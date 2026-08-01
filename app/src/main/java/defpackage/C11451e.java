package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11451e implements InterfaceC0627e {
    public static final int[] billing = new int[0];
    public static final Unsafe yandex = AbstractC9914e.advert();
    public final int[] ad;
    public final int appmetrica;
    public final int[] license;
    public final AbstractC4191e metrica;
    public final C10068e purchase;
    public final Object[] vip;

    public C11451e(int[] iArr, Object[] objArr, AbstractC4191e abstractC4191e, int[] iArr2, int i, C10068e c10068e, C10215e c10215e) {
        this.ad = iArr;
        this.vip = objArr;
        this.license = iArr2;
        this.appmetrica = i;
        this.purchase = c10068e;
        this.metrica = abstractC4191e;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C11451e advert(defpackage.C17996e r30, defpackage.C10068e r31, defpackage.C10215e r32) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11451e.advert(e٘ۚۜ, eَؗؑ, eَّّ):eِؑۛ");
    }

    public static int pro(long j, Object obj) {
        return ((Integer) AbstractC9914e.adcel(j, obj)).intValue();
    }

    public static boolean remoteconfig(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC11202e) {
            return ((AbstractC11202e) obj).adcel();
        }
        return true;
    }

    public static long signatures(long j, Object obj) {
        return ((Long) AbstractC9914e.adcel(j, obj)).longValue();
    }

    public static Field smaato(Class cls, String str) {
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

    public static int subscription(int i) {
        return (i >>> 20) & 255;
    }

    public final InterfaceC0627e Signature(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.vip;
        InterfaceC0627e interfaceC0627e = (InterfaceC0627e) objArr[i3];
        if (interfaceC0627e != null) {
            return interfaceC0627e;
        }
        InterfaceC0627e ad = C11222e.metrica.ad((Class) objArr[i3 + 1]);
        objArr[i3] = ad;
        return ad;
    }

    @Override // defpackage.InterfaceC0627e
    public final AbstractC11202e ad() {
        return (AbstractC11202e) ((AbstractC11202e) this.metrica).startapp(4, null);
    }

    public final void adcel(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC9914e.billing(j, obj, (1 << (i2 >>> 20)) | AbstractC9914e.purchase(j, obj));
    }

    public final int admob(int i) {
        return this.ad[i + 1];
    }

    public final void amazon(int i, Object obj, Object obj2) {
        if (startapp(i, obj2)) {
            int admob = admob(i) & 1048575;
            Unsafe unsafe = yandex;
            long j = admob;
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
            InterfaceC0627e Signature = Signature(i);
            if (!startapp(i, obj)) {
                if (remoteconfig(object)) {
                    AbstractC11202e ad = Signature.ad();
                    Signature.vip(ad, object);
                    unsafe.putObject(obj, j, ad);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                adcel(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!remoteconfig(object2)) {
                AbstractC11202e ad2 = Signature.ad();
                Signature.vip(ad2, object2);
                unsafe.putObject(obj, j, ad2);
                object2 = ad2;
            }
            Signature.vip(object2, object);
        }
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
    @Override // defpackage.InterfaceC0627e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int appmetrica(defpackage.AbstractC11202e r11) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11451e.appmetrica(eُۗٝ):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x004c. Please report as an issue. */
    @Override // defpackage.InterfaceC0627e
    public final void billing(Object obj, C16554e c16554e) {
        int[] iArr;
        int i;
        C11451e c11451e = this;
        C11177e c11177e = (C11177e) c16554e.f32481e;
        Unsafe unsafe = yandex;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = c11451e.ad;
            if (i4 >= iArr2.length) {
                C7012e c7012e = ((AbstractC11202e) obj).zzc;
                return;
            }
            int admob = c11451e.admob(i4);
            int subscription = subscription(admob);
            int i6 = iArr2[i4];
            if (subscription <= 17) {
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
            long j = admob & i2;
            switch (subscription) {
                case 0:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.smaato(i6, Double.doubleToRawLongBits(AbstractC9914e.metrica.adcel(j, obj)));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 1:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.mopub(i6, Float.floatToRawIntBits(AbstractC9914e.metrica.purchase(j, obj)));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 2:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.advert(i6, unsafe.getLong(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 3:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.advert(i6, unsafe.getLong(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 4:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.startapp(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 5:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.smaato(i6, unsafe.getLong(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 6:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.mopub(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 7:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        byte license = AbstractC9914e.metrica.license(j, obj);
                        c11177e.admob(i6 << 3);
                        int i9 = c11177e.appmetrica;
                        try {
                            int i10 = i9 + 1;
                            try {
                                c11177e.metrica[i9] = license;
                                c11177e.appmetrica = i10;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                                i9 = i10;
                                throw new C13593e(i9, c11177e.license, 1, e, 18);
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 8:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            c11177e.amazon(i6, (String) object);
                        } else {
                            c11177e.loadAd(i6, (C11133e) object);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 9:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c16554e.ad(i6, unsafe.getObject(obj, j), c11451e.Signature(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 10:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.loadAd(i6, (C11133e) unsafe.getObject(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 11:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.adcel(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 12:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.startapp(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 13:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.mopub(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 14:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        c11177e.smaato(i6, unsafe.getLong(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 15:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        int i11 = unsafe.getInt(obj, j);
                        c11177e.adcel(i6, (i11 >> 31) ^ (i11 + i11));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 16:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        c11177e.advert(i6, (j2 >> 63) ^ (j2 + j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c11451e.isVip(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        c11177e.yandex(i6, 3);
                        c11451e.Signature(i4).billing((AbstractC4191e) object2, c16554e);
                        c11177e.yandex(i6, 4);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    AbstractC17377e.metrica(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    AbstractC17377e.license(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 20:
                    AbstractC17377e.appmetrica(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 21:
                    AbstractC17377e.purchase(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 22:
                    AbstractC17377e.adcel(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 23:
                    AbstractC17377e.yandex(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    AbstractC17377e.smaato(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    AbstractC17377e.Signature(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    int i12 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    C10068e c10068e = AbstractC17377e.ad;
                    if (list != null && !list.isEmpty()) {
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            c11177e.amazon(i12, (String) list.get(i13));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    int i14 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC0627e Signature = c11451e.Signature(i4);
                    C10068e c10068e2 = AbstractC17377e.ad;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            c16554e.ad(i14, list2.get(i15), Signature);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    int i16 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    C10068e c10068e3 = AbstractC17377e.ad;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            c11177e.loadAd(i16, (C11133e) list3.get(i17));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    AbstractC17377e.mopub(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 30:
                    AbstractC17377e.loadAd(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 31:
                    AbstractC17377e.amazon(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 32:
                    AbstractC17377e.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    AbstractC17377e.advert(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    AbstractC17377e.billing(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, false);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    AbstractC17377e.metrica(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    AbstractC17377e.license(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    AbstractC17377e.appmetrica(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    AbstractC17377e.purchase(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    AbstractC17377e.adcel(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    AbstractC17377e.yandex(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    AbstractC17377e.smaato(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    AbstractC17377e.Signature(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    AbstractC17377e.mopub(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    AbstractC17377e.loadAd(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    AbstractC17377e.amazon(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    AbstractC17377e.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    AbstractC17377e.advert(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 48:
                    AbstractC17377e.billing(iArr[i4], (List) unsafe.getObject(obj, j), c16554e, true);
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i18 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC0627e Signature2 = c11451e.Signature(i4);
                    C10068e c10068e4 = AbstractC17377e.ad;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            AbstractC4191e abstractC4191e = (AbstractC4191e) list4.get(i19);
                            c11177e.yandex(i18, 3);
                            Signature2.billing(abstractC4191e, c16554e);
                            c11177e.yandex(i18, 4);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        int i20 = i4 / 3;
                        throw AbstractC8647e.isVip(c11451e.vip[i20 + i20]);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 51:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.smaato(i6, Double.doubleToRawLongBits(((Double) AbstractC9914e.adcel(j, obj)).doubleValue()));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 52:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.mopub(i6, Float.floatToRawIntBits(((Float) AbstractC9914e.adcel(j, obj)).floatValue()));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 53:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.advert(i6, signatures(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 54:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.advert(i6, signatures(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 55:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.startapp(i6, pro(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 56:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.smaato(i6, signatures(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 57:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.mopub(i6, pro(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 58:
                    if (c11451e.mopub(i6, i4, obj)) {
                        byte booleanValue = ((Boolean) AbstractC9914e.adcel(j, obj)).booleanValue();
                        c11177e.admob(i6 << 3);
                        int i21 = c11177e.appmetrica;
                        try {
                            int i22 = i21 + 1;
                            try {
                                c11177e.metrica[i21] = booleanValue;
                                c11177e.appmetrica = i22;
                            } catch (IndexOutOfBoundsException e3) {
                                e = e3;
                                i21 = i22;
                                throw new C13593e(i21, c11177e.license, 1, e, 18);
                            }
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 59:
                    if (c11451e.mopub(i6, i4, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            c11177e.amazon(i6, (String) object3);
                        } else {
                            c11177e.loadAd(i6, (C11133e) object3);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 60:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c16554e.ad(i6, unsafe.getObject(obj, j), c11451e.Signature(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 61:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.loadAd(i6, (C11133e) unsafe.getObject(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 62:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.adcel(i6, pro(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 63:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.startapp(i6, pro(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.mopub(i6, pro(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 65:
                    if (c11451e.mopub(i6, i4, obj)) {
                        c11177e.smaato(i6, signatures(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 66:
                    if (c11451e.mopub(i6, i4, obj)) {
                        int pro = pro(j, obj);
                        c11177e.adcel(i6, (pro >> 31) ^ (pro + pro));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 67:
                    if (c11451e.mopub(i6, i4, obj)) {
                        long signatures = signatures(j, obj);
                        c11177e.advert(i6, (signatures >> 63) ^ (signatures + signatures));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                case 68:
                    if (c11451e.mopub(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        c11177e.yandex(i6, 3);
                        c11451e.Signature(i4).billing((AbstractC4191e) object4, c16554e);
                        c11177e.yandex(i6, 4);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
                default:
                    i4 += 3;
                    i2 = 1048575;
                    c11451e = this;
            }
        }
    }

    public final boolean isVip(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? startapp(i, obj) : (i3 & i4) != 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC0627e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean license(defpackage.AbstractC11202e r8, defpackage.AbstractC11202e r9) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11451e.license(eُۗٝ, eُۗٝ):boolean");
    }

    public final void loadAd(int i, Object obj, Object obj2) {
        int[] iArr = this.ad;
        int i2 = iArr[i];
        if (mopub(i2, i, obj2)) {
            int admob = admob(i) & 1048575;
            Unsafe unsafe = yandex;
            long j = admob;
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
            InterfaceC0627e Signature = Signature(i);
            if (!mopub(i2, i, obj)) {
                if (remoteconfig(object)) {
                    AbstractC11202e ad = Signature.ad();
                    Signature.vip(ad, object);
                    unsafe.putObject(obj, j, ad);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                AbstractC9914e.billing(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!remoteconfig(object2)) {
                AbstractC11202e ad2 = Signature.ad();
                Signature.vip(ad2, object2);
                unsafe.putObject(obj, j, ad2);
                object2 = ad2;
            }
            Signature.vip(object2, object);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004d. Please report as an issue. */
    @Override // defpackage.InterfaceC0627e
    public final int metrica(AbstractC4191e abstractC4191e) {
        int i;
        int tapsense;
        int isVip;
        int tapsense2;
        int yandex2;
        int tapsense3;
        int ad;
        int i2;
        int tapsense4;
        int i3;
        int i4;
        int ad2;
        int tapsense5;
        int size;
        int subscription;
        int tapsense6;
        int tapsense7;
        int tapsense8;
        int size2;
        int tapsense9;
        int i5;
        int tapsense10;
        int isVip2;
        int tapsense11;
        int yandex3;
        int pro;
        int tapsense12;
        C11451e c11451e = this;
        AbstractC4191e abstractC4191e2 = abstractC4191e;
        Unsafe unsafe = yandex;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = c11451e.ad;
            if (i8 >= iArr.length) {
                C7012e c7012e = ((AbstractC11202e) abstractC4191e).zzc;
                int i12 = c7012e.metrica;
                if (i12 == -1) {
                    c7012e.metrica = 0;
                } else {
                    i6 = i12;
                }
                return i6 + i10;
            }
            int admob = c11451e.admob(i8);
            int subscription2 = subscription(admob);
            int i13 = iArr[i8];
            int i14 = iArr[i8 + 2];
            int i15 = i14 & i7;
            if (subscription2 <= 17) {
                if (i15 != i11) {
                    i9 = i15 == i7 ? 0 : unsafe.getInt(abstractC4191e2, i15);
                    i11 = i15;
                }
                i = 1 << (i14 >>> 20);
            } else {
                i = 0;
            }
            int i16 = admob & i7;
            if (subscription2 >= EnumC5551e.f11881e.f11883e) {
                EnumC5551e.f11880e.getClass();
            }
            long j = i16;
            switch (subscription2) {
                case 0:
                    if (!c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 8, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 1:
                    if (!c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 4, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 2:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        long j2 = unsafe.getLong(abstractC4191e2, j);
                        tapsense = C11177e.tapsense(i13 << 3);
                        isVip = C11177e.isVip(j2);
                        i3 = isVip + tapsense;
                        i10 += i3;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 3:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        long j3 = unsafe.getLong(abstractC4191e2, j);
                        tapsense = C11177e.tapsense(i13 << 3);
                        isVip = C11177e.isVip(j3);
                        i3 = isVip + tapsense;
                        i10 += i3;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 4:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        long j4 = unsafe.getInt(abstractC4191e2, j);
                        tapsense = C11177e.tapsense(i13 << 3);
                        isVip = C11177e.isVip(j4);
                        i3 = isVip + tapsense;
                        i10 += i3;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 5:
                    if (!c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 8, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 6:
                    if (!c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 4, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 7:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        i10 = AbstractC1414e.subscription(i13 << 3, 1, i10);
                    }
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 8:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        int i17 = i13 << 3;
                        Object object = unsafe.getObject(abstractC4191e2, j);
                        if (object instanceof C11133e) {
                            tapsense2 = C11177e.tapsense(i17);
                            yandex2 = ((C11133e) object).yandex();
                            i10 = AbstractC1414e.remoteconfig(yandex2, yandex2, tapsense2, i10);
                            i8 += 3;
                            c11451e = this;
                            abstractC4191e2 = abstractC4191e;
                            i7 = 1048575;
                        } else {
                            tapsense = C11177e.tapsense(i17);
                            isVip = C11177e.inmobi((String) object);
                            i3 = isVip + tapsense;
                            i10 += i3;
                            i8 += 3;
                            c11451e = this;
                            abstractC4191e2 = abstractC4191e;
                            i7 = 1048575;
                        }
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 9:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        Object object2 = unsafe.getObject(abstractC4191e2, j);
                        InterfaceC0627e Signature = c11451e.Signature(i8);
                        C10068e c10068e = AbstractC17377e.ad;
                        tapsense3 = C11177e.tapsense(i13 << 3);
                        ad = ((AbstractC4191e) object2).ad(Signature);
                        i10 = AbstractC1414e.remoteconfig(ad, ad, tapsense3, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 10:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        C11133e c11133e = (C11133e) unsafe.getObject(abstractC4191e2, j);
                        tapsense2 = C11177e.tapsense(i13 << 3);
                        yandex2 = c11133e.yandex();
                        i10 = AbstractC1414e.remoteconfig(yandex2, yandex2, tapsense2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 11:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        i2 = unsafe.getInt(abstractC4191e2, j);
                        tapsense4 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.subscription(i2, tapsense4, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 12:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        long j5 = unsafe.getInt(abstractC4191e2, j);
                        tapsense = C11177e.tapsense(i13 << 3);
                        isVip = C11177e.isVip(j5);
                        i3 = isVip + tapsense;
                        i10 += i3;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 13:
                    if (!c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 4, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 14:
                    if (!c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 8, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 15:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        int i18 = unsafe.getInt(abstractC4191e2, j);
                        tapsense4 = C11177e.tapsense(i13 << 3);
                        i2 = (i18 >> 31) ^ (i18 + i18);
                        i10 = AbstractC1414e.subscription(i2, tapsense4, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 16:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        long j6 = unsafe.getLong(abstractC4191e2, j);
                        tapsense = C11177e.tapsense(i13 << 3);
                        isVip = C11177e.isVip((j6 >> 63) ^ (j6 + j6));
                        i3 = isVip + tapsense;
                        i10 += i3;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c11451e.isVip(abstractC4191e2, i8, i11, i9, i)) {
                        AbstractC4191e abstractC4191e3 = (AbstractC4191e) unsafe.getObject(abstractC4191e2, j);
                        InterfaceC0627e Signature2 = c11451e.Signature(i8);
                        C10068e c10068e2 = AbstractC17377e.ad;
                        int tapsense13 = C11177e.tapsense(i13 << 3);
                        i4 = tapsense13 + tapsense13;
                        ad2 = abstractC4191e3.ad(Signature2);
                        i3 = ad2 + i4;
                        i10 += i3;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    i3 = AbstractC17377e.isPro(i13, (List) unsafe.getObject(abstractC4191e2, j));
                    i10 += i3;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    i3 = AbstractC17377e.inmobi(i13, (List) unsafe.getObject(abstractC4191e2, j));
                    i10 += i3;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e3 = AbstractC17377e.ad;
                    if (list.size() != 0) {
                        tapsense5 = (C11177e.tapsense(i13 << 3) * list.size()) + AbstractC17377e.admob(list);
                        i10 += tapsense5;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    tapsense5 = 0;
                    i10 += tapsense5;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e4 = AbstractC17377e.ad;
                    size = list2.size();
                    if (size != 0) {
                        subscription = AbstractC17377e.subscription(list2);
                        tapsense6 = C11177e.tapsense(i13 << 3);
                        tapsense7 = (tapsense6 * size) + subscription;
                        i10 += tapsense7;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    tapsense7 = 0;
                    i10 += tapsense7;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e5 = AbstractC17377e.ad;
                    size = list3.size();
                    if (size != 0) {
                        subscription = AbstractC17377e.signatures(list3);
                        tapsense6 = C11177e.tapsense(i13 << 3);
                        tapsense7 = (tapsense6 * size) + subscription;
                        i10 += tapsense7;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    tapsense7 = 0;
                    i10 += tapsense7;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 23:
                    i3 = AbstractC17377e.isPro(i13, (List) unsafe.getObject(abstractC4191e2, j));
                    i10 += i3;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    i3 = AbstractC17377e.inmobi(i13, (List) unsafe.getObject(abstractC4191e2, j));
                    i10 += i3;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e6 = AbstractC17377e.ad;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        tapsense5 = (C11177e.tapsense(i13 << 3) + 1) * size3;
                        i10 += tapsense5;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    tapsense5 = 0;
                    i10 += tapsense5;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e7 = AbstractC17377e.ad;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        tapsense7 = C11177e.tapsense(i13 << 3) * size4;
                        for (int i19 = 0; i19 < size4; i19++) {
                            Object obj = list5.get(i19);
                            if (obj instanceof C11133e) {
                                int yandex4 = ((C11133e) obj).yandex();
                                tapsense7 = AbstractC1414e.subscription(yandex4, yandex4, tapsense7);
                            } else {
                                tapsense7 = C11177e.inmobi((String) obj) + tapsense7;
                            }
                        }
                        i10 += tapsense7;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    tapsense7 = 0;
                    i10 += tapsense7;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC4191e2, j);
                    InterfaceC0627e Signature3 = c11451e.Signature(i8);
                    C10068e c10068e8 = AbstractC17377e.ad;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        tapsense8 = 0;
                    } else {
                        tapsense8 = C11177e.tapsense(i13 << 3) * size5;
                        for (int i20 = 0; i20 < size5; i20++) {
                            int ad3 = ((AbstractC4191e) list6.get(i20)).ad(Signature3);
                            tapsense8 = AbstractC1414e.subscription(ad3, ad3, tapsense8);
                        }
                    }
                    i10 += tapsense8;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e9 = AbstractC17377e.ad;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        tapsense7 = C11177e.tapsense(i13 << 3) * size6;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int yandex5 = ((C11133e) list7.get(i21)).yandex();
                            tapsense7 = AbstractC1414e.subscription(yandex5, yandex5, tapsense7);
                        }
                        i10 += tapsense7;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    tapsense7 = 0;
                    i10 += tapsense7;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e10 = AbstractC17377e.ad;
                    size = list8.size();
                    if (size != 0) {
                        subscription = AbstractC17377e.tapsense(list8);
                        tapsense6 = C11177e.tapsense(i13 << 3);
                        tapsense7 = (tapsense6 * size) + subscription;
                        i10 += tapsense7;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    tapsense7 = 0;
                    i10 += tapsense7;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e11 = AbstractC17377e.ad;
                    size = list9.size();
                    if (size != 0) {
                        subscription = AbstractC17377e.pro(list9);
                        tapsense6 = C11177e.tapsense(i13 << 3);
                        tapsense7 = (tapsense6 * size) + subscription;
                        i10 += tapsense7;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    tapsense7 = 0;
                    i10 += tapsense7;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 31:
                    i3 = AbstractC17377e.inmobi(i13, (List) unsafe.getObject(abstractC4191e2, j));
                    i10 += i3;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 32:
                    i3 = AbstractC17377e.isPro(i13, (List) unsafe.getObject(abstractC4191e2, j));
                    i10 += i3;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e12 = AbstractC17377e.ad;
                    size = list10.size();
                    if (size != 0) {
                        subscription = AbstractC17377e.isVip(list10);
                        tapsense6 = C11177e.tapsense(i13 << 3);
                        tapsense7 = (tapsense6 * size) + subscription;
                        i10 += tapsense7;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    tapsense7 = 0;
                    i10 += tapsense7;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e13 = AbstractC17377e.ad;
                    size = list11.size();
                    if (size != 0) {
                        subscription = AbstractC17377e.remoteconfig(list11);
                        tapsense6 = C11177e.tapsense(i13 << 3);
                        tapsense7 = (tapsense6 * size) + subscription;
                        i10 += tapsense7;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    tapsense7 = 0;
                    i10 += tapsense7;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e14 = AbstractC17377e.ad;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e15 = AbstractC17377e.ad;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = AbstractC17377e.admob((List) unsafe.getObject(abstractC4191e2, j));
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = AbstractC17377e.subscription((List) unsafe.getObject(abstractC4191e2, j));
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = AbstractC17377e.signatures((List) unsafe.getObject(abstractC4191e2, j));
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e16 = AbstractC17377e.ad;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e17 = AbstractC17377e.ad;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e18 = AbstractC17377e.ad;
                    size2 = list16.size();
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = AbstractC17377e.tapsense((List) unsafe.getObject(abstractC4191e2, j));
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = AbstractC17377e.pro((List) unsafe.getObject(abstractC4191e2, j));
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e19 = AbstractC17377e.ad;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(abstractC4191e2, j);
                    C10068e c10068e20 = AbstractC17377e.ad;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = AbstractC17377e.isVip((List) unsafe.getObject(abstractC4191e2, j));
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 48:
                    size2 = AbstractC17377e.remoteconfig((List) unsafe.getObject(abstractC4191e2, j));
                    if (size2 > 0) {
                        tapsense9 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.remoteconfig(size2, tapsense9, size2, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC4191e2, j);
                    InterfaceC0627e Signature4 = c11451e.Signature(i8);
                    C10068e c10068e21 = AbstractC17377e.ad;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i22 = 0; i22 < size7; i22++) {
                            AbstractC4191e abstractC4191e4 = (AbstractC4191e) list19.get(i22);
                            int tapsense14 = C11177e.tapsense(i13 << 3);
                            i5 += abstractC4191e4.ad(Signature4) + tapsense14 + tapsense14;
                        }
                    }
                    i10 += i5;
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(abstractC4191e2, j);
                    int i23 = i8 / 3;
                    Object obj2 = c11451e.vip[i23 + i23];
                    if (object3 == null) {
                        throw AbstractC8647e.isVip(obj2);
                    }
                    throw new ClassCastException();
                case 51:
                    if (!c11451e.mopub(i13, i8, abstractC4191e2)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 8, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 52:
                    if (!c11451e.mopub(i13, i8, abstractC4191e2)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 4, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 53:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        long signatures = signatures(j, abstractC4191e2);
                        tapsense10 = C11177e.tapsense(i13 << 3);
                        isVip2 = C11177e.isVip(signatures);
                        i10 += isVip2 + tapsense10;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 54:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        long signatures2 = signatures(j, abstractC4191e2);
                        tapsense10 = C11177e.tapsense(i13 << 3);
                        isVip2 = C11177e.isVip(signatures2);
                        i10 += isVip2 + tapsense10;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 55:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        long pro2 = pro(j, abstractC4191e2);
                        tapsense10 = C11177e.tapsense(i13 << 3);
                        isVip2 = C11177e.isVip(pro2);
                        i10 += isVip2 + tapsense10;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 56:
                    if (!c11451e.mopub(i13, i8, abstractC4191e2)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 8, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 57:
                    if (!c11451e.mopub(i13, i8, abstractC4191e2)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 4, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 58:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        i10 = AbstractC1414e.subscription(i13 << 3, 1, i10);
                    }
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 59:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        int i24 = i13 << 3;
                        Object object4 = unsafe.getObject(abstractC4191e2, j);
                        if (object4 instanceof C11133e) {
                            tapsense11 = C11177e.tapsense(i24);
                            yandex3 = ((C11133e) object4).yandex();
                            i10 = AbstractC1414e.remoteconfig(yandex3, yandex3, tapsense11, i10);
                            i8 += 3;
                            c11451e = this;
                            abstractC4191e2 = abstractC4191e;
                            i7 = 1048575;
                        } else {
                            tapsense10 = C11177e.tapsense(i24);
                            isVip2 = C11177e.inmobi((String) object4);
                            i10 += isVip2 + tapsense10;
                            i8 += 3;
                            c11451e = this;
                            abstractC4191e2 = abstractC4191e;
                            i7 = 1048575;
                        }
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 60:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        Object object5 = unsafe.getObject(abstractC4191e2, j);
                        InterfaceC0627e Signature5 = c11451e.Signature(i8);
                        C10068e c10068e22 = AbstractC17377e.ad;
                        tapsense3 = C11177e.tapsense(i13 << 3);
                        ad = ((AbstractC4191e) object5).ad(Signature5);
                        i10 = AbstractC1414e.remoteconfig(ad, ad, tapsense3, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 61:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        C11133e c11133e2 = (C11133e) unsafe.getObject(abstractC4191e2, j);
                        tapsense11 = C11177e.tapsense(i13 << 3);
                        yandex3 = c11133e2.yandex();
                        i10 = AbstractC1414e.remoteconfig(yandex3, yandex3, tapsense11, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 62:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        pro = pro(j, abstractC4191e2);
                        tapsense12 = C11177e.tapsense(i13 << 3);
                        i10 = AbstractC1414e.subscription(pro, tapsense12, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 63:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        long pro3 = pro(j, abstractC4191e2);
                        tapsense10 = C11177e.tapsense(i13 << 3);
                        isVip2 = C11177e.isVip(pro3);
                        i10 += isVip2 + tapsense10;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (!c11451e.mopub(i13, i8, abstractC4191e2)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 4, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 65:
                    if (!c11451e.mopub(i13, i8, abstractC4191e2)) {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                    i10 = AbstractC1414e.subscription(i13 << 3, 8, i10);
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
                case 66:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        int pro4 = pro(j, abstractC4191e2);
                        tapsense12 = C11177e.tapsense(i13 << 3);
                        pro = (pro4 >> 31) ^ (pro4 + pro4);
                        i10 = AbstractC1414e.subscription(pro, tapsense12, i10);
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 67:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        long signatures3 = signatures(j, abstractC4191e2);
                        tapsense10 = C11177e.tapsense(i13 << 3);
                        isVip2 = C11177e.isVip((signatures3 >> 63) ^ (signatures3 + signatures3));
                        i10 += isVip2 + tapsense10;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                case 68:
                    if (c11451e.mopub(i13, i8, abstractC4191e2)) {
                        AbstractC4191e abstractC4191e5 = (AbstractC4191e) unsafe.getObject(abstractC4191e2, j);
                        InterfaceC0627e Signature6 = c11451e.Signature(i8);
                        C10068e c10068e23 = AbstractC17377e.ad;
                        int tapsense15 = C11177e.tapsense(i13 << 3);
                        i4 = tapsense15 + tapsense15;
                        ad2 = abstractC4191e5.ad(Signature6);
                        i3 = ad2 + i4;
                        i10 += i3;
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    } else {
                        i8 += 3;
                        c11451e = this;
                        abstractC4191e2 = abstractC4191e;
                        i7 = 1048575;
                    }
                default:
                    i8 += 3;
                    c11451e = this;
                    abstractC4191e2 = abstractC4191e;
                    i7 = 1048575;
            }
        }
    }

    public final boolean mopub(int i, int i2, Object obj) {
        return AbstractC9914e.purchase((long) (this.ad[i2 + 2] & 1048575), obj) == i;
    }

    @Override // defpackage.InterfaceC0627e
    public final boolean purchase(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.appmetrica) {
            int i7 = this.license[i5];
            int[] iArr = this.ad;
            int i8 = iArr[i7];
            int admob = admob(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = yandex.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & admob) == 0 || isVip(obj, i2, i, i3, i11)) {
                int subscription = subscription(admob);
                if (subscription == 9 || subscription == 17) {
                    if (isVip(obj, i2, i, i3, i11) && !Signature(i2).purchase(AbstractC9914e.adcel(admob & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (subscription != 27) {
                        if (subscription == 60 || subscription == 68) {
                            if (mopub(i8, i2, obj) && !Signature(i2).purchase(AbstractC9914e.adcel(admob & 1048575, obj))) {
                            }
                        } else if (subscription != 49) {
                            if (subscription == 50) {
                                AbstractC9914e.adcel(admob & 1048575, obj).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) AbstractC9914e.adcel(admob & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC0627e Signature = Signature(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (Signature.purchase(list.get(i13))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean startapp(int i, Object obj) {
        int i2 = this.ad[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int admob = admob(i);
            long j2 = admob & 1048575;
            switch (subscription(admob)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC9914e.metrica.adcel(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC9914e.metrica.purchase(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC9914e.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC9914e.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC9914e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC9914e.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC9914e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC9914e.metrica.license(j2, obj);
                case 8:
                    Object adcel = AbstractC9914e.adcel(j2, obj);
                    if (adcel instanceof String) {
                        if (((String) adcel).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(adcel instanceof C11133e)) {
                            throw new IllegalArgumentException();
                        }
                        if (C11133e.f22049e.equals(adcel)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (AbstractC9914e.adcel(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (C11133e.f22049e.equals(AbstractC9914e.adcel(j2, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (AbstractC9914e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC9914e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC9914e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC9914e.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC9914e.purchase(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC9914e.yandex(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (AbstractC9914e.adcel(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & AbstractC9914e.purchase(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean tapsense(AbstractC11202e abstractC11202e, AbstractC11202e abstractC11202e2, int i) {
        return startapp(i, abstractC11202e) == startapp(i, abstractC11202e2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001f. Please report as an issue. */
    @Override // defpackage.InterfaceC0627e
    public final void vip(Object obj, Object obj2) {
        Object obj3;
        if (!remoteconfig(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.ad;
            if (i >= iArr.length) {
                AbstractC17377e.vip(obj, obj2);
                return;
            }
            int admob = admob(i);
            int i2 = admob & 1048575;
            int subscription = subscription(admob);
            int i3 = iArr[i];
            long j = i2;
            switch (subscription) {
                case 0:
                    if (startapp(i, obj2)) {
                        AbstractC17397e abstractC17397e = AbstractC9914e.metrica;
                        obj3 = obj;
                        abstractC17397e.advert(obj3, j, abstractC17397e.adcel(j, obj2));
                        adcel(i, obj3);
                        i += 3;
                        obj = obj3;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 1:
                    if (startapp(i, obj2)) {
                        AbstractC17397e abstractC17397e2 = AbstractC9914e.metrica;
                        abstractC17397e2.startapp(obj, j, abstractC17397e2.purchase(j, obj2));
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 2:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.startapp(j, AbstractC9914e.yandex(j, obj2), obj);
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 3:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.startapp(j, AbstractC9914e.yandex(j, obj2), obj);
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 4:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.billing(j, obj, AbstractC9914e.purchase(j, obj2));
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 5:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.startapp(j, AbstractC9914e.yandex(j, obj2), obj);
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 6:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.billing(j, obj, AbstractC9914e.purchase(j, obj2));
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 7:
                    if (startapp(i, obj2)) {
                        AbstractC17397e abstractC17397e3 = AbstractC9914e.metrica;
                        abstractC17397e3.appmetrica(obj, j, abstractC17397e3.license(j, obj2));
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 8:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.mopub(j, obj, AbstractC9914e.adcel(j, obj2));
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 9:
                    amazon(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 10:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.mopub(j, obj, AbstractC9914e.adcel(j, obj2));
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 11:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.billing(j, obj, AbstractC9914e.purchase(j, obj2));
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 12:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.billing(j, obj, AbstractC9914e.purchase(j, obj2));
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 13:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.billing(j, obj, AbstractC9914e.purchase(j, obj2));
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 14:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.startapp(j, AbstractC9914e.yandex(j, obj2), obj);
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 15:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.billing(j, obj, AbstractC9914e.purchase(j, obj2));
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 16:
                    if (startapp(i, obj2)) {
                        AbstractC9914e.startapp(j, AbstractC9914e.yandex(j, obj2), obj);
                        adcel(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    amazon(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
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
                    InterfaceC1958e interfaceC1958e = (InterfaceC1958e) AbstractC9914e.adcel(j, obj);
                    InterfaceC1958e interfaceC1958e2 = (InterfaceC1958e) AbstractC9914e.adcel(j, obj2);
                    int size = interfaceC1958e.size();
                    int size2 = interfaceC1958e2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC11529e) interfaceC1958e).f23169e) {
                            interfaceC1958e = interfaceC1958e.mopub(size2 + size);
                        }
                        interfaceC1958e.addAll(interfaceC1958e2);
                    }
                    if (size > 0) {
                        interfaceC1958e2 = interfaceC1958e;
                    }
                    AbstractC9914e.mopub(j, obj, interfaceC1958e2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    C10068e c10068e = AbstractC17377e.ad;
                    Object adcel = AbstractC9914e.adcel(j, obj);
                    Object adcel2 = AbstractC9914e.adcel(j, obj2);
                    if (adcel != null) {
                        throw new ClassCastException();
                    }
                    throw AbstractC8647e.isVip(adcel2);
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (mopub(i3, i, obj2)) {
                        AbstractC9914e.mopub(j, obj, AbstractC9914e.adcel(j, obj2));
                        AbstractC9914e.billing(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 60:
                    loadAd(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (mopub(i3, i, obj2)) {
                        AbstractC9914e.mopub(j, obj, AbstractC9914e.adcel(j, obj2));
                        AbstractC9914e.billing(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 68:
                    loadAd(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                default:
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        continue;
     */
    @Override // defpackage.InterfaceC0627e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yandex(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = remoteconfig(r8)
            if (r0 != 0) goto L8
            goto L94
        L8:
            boolean r0 = r8 instanceof defpackage.AbstractC11202e
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r8
            eُۗٝ r0 = (defpackage.AbstractC11202e) r0
            r0.license()
            r0.zza = r1
            r0.mopub()
        L18:
            r0 = r1
        L19:
            int[] r2 = r7.ad
            int r3 = r2.length
            if (r0 >= r3) goto L85
            int r3 = r7.admob(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = subscription(r3)
            long r4 = (long) r4
            r6 = 9
            if (r3 == r6) goto L6f
            r6 = 60
            if (r3 == r6) goto L59
            r6 = 68
            if (r3 == r6) goto L59
            switch(r3) {
                case 17: goto L6f;
                case 18: goto L4a;
                case 19: goto L4a;
                case 20: goto L4a;
                case 21: goto L4a;
                case 22: goto L4a;
                case 23: goto L4a;
                case 24: goto L4a;
                case 25: goto L4a;
                case 26: goto L4a;
                case 27: goto L4a;
                case 28: goto L4a;
                case 29: goto L4a;
                case 30: goto L4a;
                case 31: goto L4a;
                case 32: goto L4a;
                case 33: goto L4a;
                case 34: goto L4a;
                case 35: goto L4a;
                case 36: goto L4a;
                case 37: goto L4a;
                case 38: goto L4a;
                case 39: goto L4a;
                case 40: goto L4a;
                case 41: goto L4a;
                case 42: goto L4a;
                case 43: goto L4a;
                case 44: goto L4a;
                case 45: goto L4a;
                case 46: goto L4a;
                case 47: goto L4a;
                case 48: goto L4a;
                case 49: goto L4a;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L82
        L3b:
            sun.misc.Unsafe r2 = defpackage.C11451e.yandex
            java.lang.Object r2 = r2.getObject(r8, r4)
            if (r2 != 0) goto L44
            goto L82
        L44:
            java.lang.ClassCastException r8 = new java.lang.ClassCastException
            r8.<init>()
            throw r8
        L4a:
            java.lang.Object r2 = defpackage.AbstractC9914e.adcel(r4, r8)
            eؓٝ r2 = (defpackage.InterfaceC1958e) r2
            eِٟؖ r2 = (defpackage.AbstractC11529e) r2
            boolean r3 = r2.f23169e
            if (r3 == 0) goto L82
            r2.f23169e = r1
            goto L82
        L59:
            r2 = r2[r0]
            boolean r2 = r7.mopub(r2, r0, r8)
            if (r2 == 0) goto L82
            eٌؑۡ r2 = r7.Signature(r0)
            sun.misc.Unsafe r3 = defpackage.C11451e.yandex
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.yandex(r3)
            goto L82
        L6f:
            boolean r2 = r7.startapp(r0, r8)
            if (r2 == 0) goto L82
            eٌؑۡ r2 = r7.Signature(r0)
            sun.misc.Unsafe r3 = defpackage.C11451e.yandex
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.yandex(r3)
        L82:
            int r0 = r0 + 3
            goto L19
        L85:
            eَؗؑ r0 = r7.purchase
            r0.getClass()
            eُۗٝ r8 = (defpackage.AbstractC11202e) r8
            eًؚْ r8 = r8.zzc
            boolean r0 = r8.license
            if (r0 == 0) goto L94
            r8.license = r1
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11451e.yandex(java.lang.Object):void");
    }
}
