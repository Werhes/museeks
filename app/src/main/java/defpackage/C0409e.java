package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؑٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0409e extends AbstractC8507e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C0409e f2448e = new C0409e(0, null, new Object[0]);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient Object[] f2449e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient Object f2450e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient int f2451e;

    public C0409e(int i, Object obj, Object[] objArr) {
        this.f2450e = obj;
        this.f2449e = objArr;
        this.f2451e = i;
    }

    public static Object adcel(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int license = AbstractC3192e.license(obj2.hashCode());
            while (true) {
                int i3 = license & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                license = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int license2 = AbstractC3192e.license(obj2.hashCode());
            while (true) {
                int i5 = license2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                license2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int license3 = AbstractC3192e.license(obj2.hashCode());
            while (true) {
                int i7 = license3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                license3 = i7 + 1;
            }
        }
    }

    public static Object startapp(Object[] objArr, int i, int i2, int i3) {
        int i4;
        C14170e c14170e = null;
        int i5 = 1;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = (i8 * 2) + i3;
                int i10 = (i7 * 2) + i3;
                Object obj = objArr[i9];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i9 ^ 1];
                Objects.requireNonNull(obj2);
                int license = AbstractC3192e.license(obj.hashCode());
                while (true) {
                    int i11 = license & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj;
                            objArr[i10 ^ 1] = obj2;
                        }
                        i7++;
                    } else {
                        if (obj.equals(objArr[i12])) {
                            int i13 = i12 ^ 1;
                            Object obj3 = objArr[i13];
                            Objects.requireNonNull(obj3);
                            c14170e = new C14170e(obj, obj2, obj3);
                            objArr[i13] = obj2;
                            break;
                        }
                        license = i11 + 1;
                    }
                }
            }
            return i7 == i ? bArr : new Object[]{bArr, Integer.valueOf(i7), c14170e};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = (i15 * 2) + i3;
                int i17 = (i14 * 2) + i3;
                Object obj4 = objArr[i16];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i16 ^ 1];
                Objects.requireNonNull(obj5);
                int license2 = AbstractC3192e.license(obj4.hashCode());
                while (true) {
                    int i18 = license2 & i6;
                    int i19 = sArr[i18] & 65535;
                    if (i19 == 65535) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj4;
                            objArr[i17 ^ 1] = obj5;
                        }
                        i14++;
                    } else {
                        if (obj4.equals(objArr[i19])) {
                            int i20 = i19 ^ 1;
                            Object obj6 = objArr[i20];
                            Objects.requireNonNull(obj6);
                            c14170e = new C14170e(obj4, obj5, obj6);
                            objArr[i20] = obj5;
                            break;
                        }
                        license2 = i18 + 1;
                    }
                }
            }
            return i14 == i ? sArr : new Object[]{sArr, Integer.valueOf(i14), c14170e};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i21 = 0;
        int i22 = 0;
        while (i21 < i) {
            int i23 = (i21 * 2) + i3;
            int i24 = (i22 * 2) + i3;
            Object obj7 = objArr[i23];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i23 ^ i5];
            Objects.requireNonNull(obj8);
            int license3 = AbstractC3192e.license(obj7.hashCode());
            while (true) {
                int i25 = license3 & i6;
                int i26 = iArr[i25];
                if (i26 == -1) {
                    iArr[i25] = i24;
                    if (i22 < i21) {
                        objArr[i24] = obj7;
                        objArr[i24 ^ 1] = obj8;
                    }
                    i22++;
                    i4 = i5;
                } else {
                    i4 = i5;
                    if (obj7.equals(objArr[i26])) {
                        int i27 = i26 ^ 1;
                        Object obj9 = objArr[i27];
                        Objects.requireNonNull(obj9);
                        c14170e = new C14170e(obj7, obj8, obj9);
                        objArr[i27] = obj8;
                        break;
                    }
                    license3 = i25 + 1;
                    i5 = i4;
                }
            }
            i21++;
            i5 = i4;
        }
        int i28 = i5;
        if (i22 == i) {
            return iArr;
        }
        Integer valueOf = Integer.valueOf(i22);
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i28] = valueOf;
        objArr2[2] = c14170e;
        return objArr2;
    }

    public static C0409e yandex(int i, Object[] objArr, Csuper csuper) {
        if (i == 0) {
            return f2448e;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new C0409e(1, null, objArr);
        }
        AbstractC2301e.loadAd(i, objArr.length >> 1);
        Object startapp = startapp(objArr, i, AbstractC12614e.loadAd(i), 0);
        if (startapp instanceof Object[]) {
            Object[] objArr2 = (Object[]) startapp;
            C14170e c14170e = (C14170e) objArr2[2];
            if (csuper == null) {
                throw c14170e.ad();
            }
            csuper.f36471e = c14170e;
            Object obj = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            startapp = obj;
            i = intValue;
        }
        return new C0409e(i, startapp, objArr);
    }

    @Override // defpackage.AbstractC8507e
    public final AbstractC0281e appmetrica() {
        return new C7816e(1, this.f2451e, this.f2449e);
    }

    @Override // defpackage.AbstractC8507e, java.util.Map
    public final Object get(Object obj) {
        Object adcel = adcel(this.f2450e, this.f2449e, this.f2451e, 0, obj);
        if (adcel == null) {
            return null;
        }
        return adcel;
    }

    @Override // defpackage.AbstractC8507e
    public final C2520e license() {
        return new C2520e(this, new C7816e(0, this.f2451e, this.f2449e));
    }

    @Override // defpackage.AbstractC8507e
    public final C5239e metrica() {
        return new C5239e(this, this.f2449e, 0, this.f2451e);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2451e;
    }
}
