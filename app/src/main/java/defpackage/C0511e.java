package defpackage;

import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511e implements Comparable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public float f2612e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f2613e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f2621e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f2616e = -1;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f2614e = -1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f2619e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f2623e = false;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final float[] f2622e = new float[9];

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final float[] f2617e = new float[9];

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C0294e[] f2620e = new C0294e[16];

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f2615e = 0;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f2618e = 0;

    public C0511e(int i) {
        this.f2613e = i;
    }

    public final void ad(C0294e c0294e) {
        int i = 0;
        while (true) {
            int i2 = this.f2615e;
            if (i >= i2) {
                C0294e[] c0294eArr = this.f2620e;
                if (i2 >= c0294eArr.length) {
                    this.f2620e = (C0294e[]) Arrays.copyOf(c0294eArr, c0294eArr.length * 2);
                }
                C0294e[] c0294eArr2 = this.f2620e;
                int i3 = this.f2615e;
                c0294eArr2[i3] = c0294e;
                this.f2615e = i3 + 1;
                return;
            }
            if (this.f2620e[i] == c0294e) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void appmetrica(C17677e c17677e, C0294e c0294e) {
        int i = this.f2615e;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2620e[i2].startapp(c17677e, c0294e, false);
        }
        this.f2615e = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2616e - ((C0511e) obj).f2616e;
    }

    public final void license(C17677e c17677e, float f) {
        this.f2612e = f;
        this.f2623e = true;
        int i = this.f2615e;
        this.f2614e = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2620e[i2].yandex(c17677e, this, false);
        }
        this.f2615e = 0;
    }

    public final void metrica() {
        this.f2613e = 5;
        this.f2619e = 0;
        this.f2616e = -1;
        this.f2614e = -1;
        this.f2612e = 0.0f;
        this.f2623e = false;
        int i = this.f2615e;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2620e[i2] = null;
        }
        this.f2615e = 0;
        this.f2618e = 0;
        this.f2621e = false;
        Arrays.fill(this.f2617e, 0.0f);
    }

    public final String toString() {
        return BuildConfig.FLAVOR + this.f2616e;
    }

    public final void vip(C0294e c0294e) {
        int i = this.f2615e;
        int i2 = 0;
        while (i2 < i) {
            if (this.f2620e[i2] == c0294e) {
                while (i2 < i - 1) {
                    C0294e[] c0294eArr = this.f2620e;
                    int i3 = i2 + 1;
                    c0294eArr[i2] = c0294eArr[i3];
                    i2 = i3;
                }
                this.f2615e--;
                return;
            }
            i2++;
        }
    }
}
