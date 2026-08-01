package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٛۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8805e extends AbstractC17557e implements RandomAccess {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f17711e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17712e;

    public /* synthetic */ C8805e(int i, Object obj) {
        this.f17712e = i;
        this.f17711e = obj;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f17712e) {
            case 0:
                if (obj instanceof Integer) {
                    return AbstractC1660e.startapp((int[]) this.f17711e, ((Number) obj).intValue());
                }
                return false;
            default:
                if (!(obj instanceof C10994e)) {
                    return false;
                }
                long j = ((C10994e) obj).f21777e;
                long[] jArr = (long[]) this.f17711e;
                int length = jArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                    } else if (j != jArr[i]) {
                        i++;
                    }
                }
                return i >= 0;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f17712e) {
            case 0:
                return Integer.valueOf(((int[]) this.f17711e)[i]);
            default:
                return new C10994e(((long[]) this.f17711e)[i]);
        }
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final int indexOf(Object obj) {
        switch (this.f17712e) {
            case 0:
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                int intValue = ((Number) obj).intValue();
                int[] iArr = (int[]) this.f17711e;
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    if (intValue == iArr[i]) {
                        return i;
                    }
                }
                return -1;
            default:
                if (!(obj instanceof C10994e)) {
                    return -1;
                }
                long j = ((C10994e) obj).f21777e;
                long[] jArr = (long[]) this.f17711e;
                int length2 = jArr.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    if (j == jArr[i2]) {
                        return i2;
                    }
                }
                return -1;
        }
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f17712e) {
            case 0:
                return ((int[]) this.f17711e).length == 0;
            default:
                return ((long[]) this.f17711e).length == 0;
        }
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f17712e) {
            case 0:
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                int intValue = ((Number) obj).intValue();
                int[] iArr = (int[]) this.f17711e;
                int length = iArr.length - 1;
                if (length < 0) {
                    return -1;
                }
                while (true) {
                    int i = length - 1;
                    if (intValue == iArr[length]) {
                        return length;
                    }
                    if (i < 0) {
                        return -1;
                    }
                    length = i;
                }
            default:
                if (!(obj instanceof C10994e)) {
                    return -1;
                }
                long j = ((C10994e) obj).f21777e;
                long[] jArr = (long[]) this.f17711e;
                int length2 = jArr.length - 1;
                if (length2 < 0) {
                    return -1;
                }
                while (true) {
                    int i2 = length2 - 1;
                    if (j == jArr[length2]) {
                        return length2;
                    }
                    if (i2 < 0) {
                        return -1;
                    }
                    length2 = i2;
                }
        }
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        switch (this.f17712e) {
            case 0:
                return ((int[]) this.f17711e).length;
            default:
                return ((long[]) this.f17711e).length;
        }
    }
}
