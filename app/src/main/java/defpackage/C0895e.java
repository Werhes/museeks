package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0895e implements Map, InterfaceC6770e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f3289e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f3290e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C15240e f3292e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C3131e f3295e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C3131e f3296e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final String[] f3288e = new String[0];

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final Object[] f3286e = new Object[0];

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final int[] f3287e = new int[0];

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String[] f3294e = f3288e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f3291e = f3286e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int[] f3293e = f3287e;

    public final int ad(String str) {
        if (this.f3290e == 0) {
            return -1;
        }
        int license = C11047e.license(str);
        int length = this.f3294e.length;
        while (true) {
            int i = license & (length - 1);
            String str2 = this.f3294e[i];
            if (str2 == null) {
                return -1;
            }
            if (str2.equalsIgnoreCase(str)) {
                return i;
            }
            license = i + 1;
            length = this.f3294e.length;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f3290e > 0) {
            String[] strArr = this.f3294e;
            Arrays.fill(strArr, 0, strArr.length, (Object) null);
            Object[] objArr = this.f3291e;
            Arrays.fill(objArr, 0, objArr.length, (Object) null);
            AbstractC1660e.tapsense(-1, 0, 6, this.f3293e);
            this.f3290e = 0;
            this.f3289e = 0;
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return (obj instanceof String) && ad((String) obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null || this.f3290e == 0) {
            return false;
        }
        int length = this.f3291e.length;
        for (int i = 0; i < length; i++) {
            if (this.f3294e[i] != null && AbstractC7890e.billing(this.f3291e[i], obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C3131e c3131e = this.f3295e;
        if (c3131e != null) {
            return c3131e;
        }
        C3131e c3131e2 = new C3131e(this, 0);
        this.f3295e = c3131e2;
        return c3131e2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0895e)) {
            return false;
        }
        C0895e c0895e = (C0895e) obj;
        if (c0895e.f3290e != this.f3290e) {
            return false;
        }
        int length = this.f3294e.length;
        for (int i = 0; i < length; i++) {
            String str = this.f3294e[i];
            if (str != null) {
                if (!AbstractC7890e.billing(c0895e.get(str), this.f3291e[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int ad;
        if ((obj instanceof String) && (ad = ad((String) obj)) >= 0) {
            return this.f3291e[ad];
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int length = this.f3294e.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = this.f3294e[i2];
            if (str != null) {
                int license = C11047e.license(str);
                Object obj = this.f3291e[i2];
                i += license ^ (obj != null ? obj.hashCode() : 0);
            }
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3290e == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C3131e c3131e = this.f3296e;
        if (c3131e != null) {
            return c3131e;
        }
        C3131e c3131e2 = new C3131e(this, 1);
        this.f3296e = c3131e2;
        return c3131e2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getValue(), (String) entry.getKey());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int ad;
        int i;
        if (!(obj instanceof String) || (ad = ad((String) obj)) < 0) {
            return null;
        }
        Object obj2 = this.f3291e[ad];
        int i2 = this.f3289e;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.f3293e;
            if (iArr[i3] == ad) {
                iArr[i3] = -1;
                break;
            }
            i3++;
        }
        String[] strArr = this.f3294e;
        strArr[ad] = null;
        this.f3291e[ad] = null;
        this.f3290e--;
        int i4 = ad + 1;
        int length = strArr.length;
        while (true) {
            int i5 = i4 & (length - 1);
            String[] strArr2 = this.f3294e;
            String str = strArr2[i5];
            if (str == null) {
                return obj2;
            }
            Object[] objArr = this.f3291e;
            Object obj3 = objArr[i5];
            strArr2[i5] = null;
            objArr[i5] = null;
            this.f3290e--;
            int license = C11047e.license(str);
            int length2 = this.f3294e.length;
            while (true) {
                i = license & (length2 - 1);
                String[] strArr3 = this.f3294e;
                String str2 = strArr3[i];
                if (str2 == null) {
                    strArr3[i] = str;
                    this.f3291e[i] = obj3;
                    this.f3290e++;
                    break;
                }
                if (str2.equalsIgnoreCase(str)) {
                    this.f3291e[i] = obj3;
                    break;
                }
                license = i + 1;
                length2 = this.f3294e.length;
            }
            int i6 = this.f3289e;
            int i7 = 0;
            while (true) {
                if (i7 < i6) {
                    int[] iArr2 = this.f3293e;
                    if (iArr2[i7] == i5) {
                        iArr2[i7] = i;
                        break;
                    }
                    i7++;
                }
            }
            i4 = i5 + 1;
            length = this.f3294e.length;
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3290e;
    }

    @Override // java.util.Map
    public final Collection values() {
        C15240e c15240e = this.f3292e;
        if (c15240e != null) {
            return c15240e;
        }
        C15240e c15240e2 = new C15240e(this);
        this.f3292e = c15240e2;
        return c15240e2;
    }

    @Override // java.util.Map
    /* renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final Object put(Object obj, String str) {
        int i;
        String str2;
        if (this.f3294e == f3288e) {
            this.f3294e = new String[8];
            this.f3291e = new Object[8];
            int[] iArr = new int[8];
            for (int i2 = 0; i2 < 8; i2++) {
                iArr[i2] = -1;
            }
            this.f3293e = iArr;
        }
        int license = C11047e.license(str);
        int length = (this.f3294e.length - 1) & license;
        while (true) {
            String str3 = this.f3294e[length];
            if (str3 == null) {
                int i3 = this.f3290e * 4;
                String[] strArr = this.f3294e;
                if (i3 >= strArr.length * 3) {
                    int length2 = strArr.length * 2;
                    Object[] objArr = this.f3291e;
                    int[] iArr2 = this.f3293e;
                    int i4 = this.f3289e;
                    this.f3294e = new String[length2];
                    this.f3291e = new Object[length2];
                    int[] iArr3 = new int[length2];
                    for (int i5 = 0; i5 < length2; i5++) {
                        iArr3[i5] = -1;
                    }
                    this.f3293e = iArr3;
                    this.f3290e = 0;
                    this.f3289e = 0;
                    for (int i6 = 0; i6 < i4; i6++) {
                        int i7 = iArr2[i6];
                        if (i7 >= 0 && (str2 = strArr[i7]) != null) {
                            put(objArr[i7], str2);
                        }
                    }
                }
                int length3 = this.f3294e.length;
                while (true) {
                    i = license & (length3 - 1);
                    String[] strArr2 = this.f3294e;
                    if (strArr2[i] == null) {
                        break;
                    }
                    license = i + 1;
                    length3 = strArr2.length;
                }
                int i8 = this.f3289e;
                if (i8 == this.f3293e.length && i8 != 0) {
                    int i9 = 0;
                    for (int i10 = 0; i10 < i8; i10++) {
                        int[] iArr4 = this.f3293e;
                        int i11 = iArr4[i10];
                        if (i11 >= 0 && this.f3294e[i11] != null) {
                            iArr4[i9] = i11;
                            i9++;
                        }
                    }
                    int length4 = this.f3293e.length;
                    for (int i12 = i9; i12 < length4; i12++) {
                        this.f3293e[i12] = -1;
                    }
                    this.f3289e = i9;
                }
                this.f3294e[i] = str;
                this.f3291e[i] = obj;
                int[] iArr5 = this.f3293e;
                int i13 = this.f3289e;
                this.f3289e = i13 + 1;
                iArr5[i13] = i;
                this.f3290e++;
                return null;
            }
            if (str3.equalsIgnoreCase(str)) {
                Object[] objArr2 = this.f3291e;
                Object obj2 = objArr2[length];
                objArr2[length] = obj;
                return obj2;
            }
            length = (length + 1) & (this.f3294e.length - 1);
        }
    }
}
