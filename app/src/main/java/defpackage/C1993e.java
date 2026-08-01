package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1993e extends C0294e {
    public C0511e[] billing;
    public C0511e[] purchase;
    public C10312e startapp;
    public int yandex;

    public final void adcel(C0511e c0511e) {
        int i;
        int i2 = this.yandex + 1;
        C0511e[] c0511eArr = this.purchase;
        if (i2 > c0511eArr.length) {
            C0511e[] c0511eArr2 = (C0511e[]) Arrays.copyOf(c0511eArr, c0511eArr.length * 2);
            this.purchase = c0511eArr2;
            this.billing = (C0511e[]) Arrays.copyOf(c0511eArr2, c0511eArr2.length * 2);
        }
        C0511e[] c0511eArr3 = this.purchase;
        int i3 = this.yandex;
        c0511eArr3[i3] = c0511e;
        int i4 = i3 + 1;
        this.yandex = i4;
        if (i4 > 1 && c0511eArr3[i3].f2616e > c0511e.f2616e) {
            int i5 = 0;
            while (true) {
                i = this.yandex;
                if (i5 >= i) {
                    break;
                }
                this.billing[i5] = this.purchase[i5];
                i5++;
            }
            Arrays.sort(this.billing, 0, i, new C11797e(10));
            for (int i6 = 0; i6 < this.yandex; i6++) {
                this.purchase[i6] = this.billing[i6];
            }
        }
        c0511e.f2621e = true;
        c0511e.ad(this);
    }

    @Override // defpackage.C0294e
    public final boolean appmetrica() {
        return this.yandex == 0;
    }

    @Override // defpackage.C0294e
    public final C0511e license(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.yandex; i2++) {
            C0511e[] c0511eArr = this.purchase;
            C0511e c0511e = c0511eArr[i2];
            if (!zArr[c0511e.f2616e]) {
                C10312e c10312e = this.startapp;
                c10312e.f20361e = c0511e;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((C0511e) c10312e.f20361e).f2617e[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0511e c0511e2 = c0511eArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c0511e2.f2617e[i3];
                            float f3 = ((C0511e) c10312e.f20361e).f2617e[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.purchase[i];
    }

    public final void mopub(C0511e c0511e) {
        int i = 0;
        while (i < this.yandex) {
            if (this.purchase[i] == c0511e) {
                while (true) {
                    int i2 = this.yandex;
                    if (i >= i2 - 1) {
                        this.yandex = i2 - 1;
                        c0511e.f2621e = false;
                        return;
                    } else {
                        C0511e[] c0511eArr = this.purchase;
                        int i3 = i + 1;
                        c0511eArr[i] = c0511eArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.C0294e
    public final void startapp(C17677e c17677e, C0294e c0294e, boolean z) {
        C0511e c0511e = c0294e.ad;
        if (c0511e == null) {
            return;
        }
        float[] fArr = c0511e.f2617e;
        C6847e c6847e = c0294e.license;
        int license = c6847e.license();
        for (int i = 0; i < license; i++) {
            C0511e appmetrica = c6847e.appmetrica(i);
            float purchase = c6847e.purchase(i);
            C10312e c10312e = this.startapp;
            c10312e.f20361e = appmetrica;
            if (appmetrica.f2621e) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0511e) c10312e.f20361e).f2617e;
                    float f = (fArr[i2] * purchase) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C0511e) c10312e.f20361e).f2617e[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((C1993e) c10312e.f20360e).mopub((C0511e) c10312e.f20361e);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * purchase;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C0511e) c10312e.f20361e).f2617e[i3] = f3;
                    } else {
                        ((C0511e) c10312e.f20361e).f2617e[i3] = 0.0f;
                    }
                }
                adcel(appmetrica);
            }
            this.vip = (c0294e.vip * purchase) + this.vip;
        }
        mopub(c0511e);
    }

    @Override // defpackage.C0294e
    public final String toString() {
        C10312e c10312e = this.startapp;
        String str = " goal -> (" + this.vip + ") : ";
        for (int i = 0; i < this.yandex; i++) {
            c10312e.f20361e = this.purchase[i];
            str = str + c10312e + " ";
        }
        return str;
    }
}
