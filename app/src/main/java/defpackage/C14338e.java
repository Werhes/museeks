package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14338e implements Cloneable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public /* synthetic */ int f28363e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public /* synthetic */ Object[] f28364e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public /* synthetic */ int[] f28365e;

    public C14338e(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f28365e = new int[i5];
        this.f28364e = new Object[i5];
    }

    public final void ad(int i, Object obj) {
        int i2 = this.f28363e;
        if (i2 != 0 && i <= this.f28365e[i2 - 1]) {
            license(i, obj);
            return;
        }
        if (i2 >= this.f28365e.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.f28365e = Arrays.copyOf(this.f28365e, i6);
            this.f28364e = Arrays.copyOf(this.f28364e, i6);
        }
        this.f28365e[i2] = i;
        this.f28364e[i2] = obj;
        this.f28363e = i2 + 1;
    }

    public final Object appmetrica(int i) {
        Object[] objArr = this.f28364e;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void license(int i, Object obj) {
        int metrica = AbstractC10115e.metrica(this.f28363e, i, this.f28365e);
        if (metrica >= 0) {
            this.f28364e[metrica] = obj;
            return;
        }
        int i2 = ~metrica;
        int i3 = this.f28363e;
        if (i2 < i3) {
            Object[] objArr = this.f28364e;
            if (objArr[i2] == AbstractC5092e.ad) {
                this.f28365e[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f28365e.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.f28365e = Arrays.copyOf(this.f28365e, i7);
            this.f28364e = Arrays.copyOf(this.f28364e, i7);
        }
        int i8 = this.f28363e;
        if (i8 - i2 != 0) {
            int[] iArr = this.f28365e;
            int i9 = i2 + 1;
            AbstractC1660e.advert(i9, i2, iArr, iArr, i8);
            Object[] objArr2 = this.f28364e;
            AbstractC1660e.mopub(i9, i2, this.f28363e, objArr2, objArr2);
        }
        this.f28365e[i2] = i;
        this.f28364e[i2] = obj;
        this.f28363e++;
    }

    public final Object metrica(int i) {
        Object obj;
        int metrica = AbstractC10115e.metrica(this.f28363e, i, this.f28365e);
        if (metrica < 0 || (obj = this.f28364e[metrica]) == AbstractC5092e.ad) {
            return null;
        }
        return obj;
    }

    public final String toString() {
        int i = this.f28363e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f28363e;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f28365e[i3]);
            sb.append('=');
            Object appmetrica = appmetrica(i3);
            if (appmetrica != this) {
                sb.append(appmetrica);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final C14338e clone() {
        C14338e c14338e = (C14338e) super.clone();
        c14338e.f28365e = (int[]) this.f28365e.clone();
        c14338e.f28364e = (Object[]) this.f28364e.clone();
        return c14338e;
    }
}
