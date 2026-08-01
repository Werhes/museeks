package defpackage;

import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6847e {
    public final C0909e metrica;
    public final C0294e vip;
    public int ad = 0;
    public int license = 8;
    public int[] appmetrica = new int[8];
    public int[] purchase = new int[8];
    public float[] billing = new float[8];
    public int yandex = -1;
    public int startapp = -1;
    public boolean adcel = false;

    public C6847e(C0294e c0294e, C0909e c0909e) {
        this.vip = c0294e;
        this.metrica = c0909e;
    }

    public final void ad(C0511e c0511e, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.yandex;
            C0294e c0294e = this.vip;
            if (i == -1) {
                this.yandex = 0;
                this.billing[0] = f;
                this.appmetrica[0] = c0511e.f2616e;
                this.purchase[0] = -1;
                c0511e.f2618e++;
                c0511e.ad(c0294e);
                this.ad++;
                if (this.adcel) {
                    return;
                }
                int i2 = this.startapp + 1;
                this.startapp = i2;
                int[] iArr = this.appmetrica;
                if (i2 >= iArr.length) {
                    this.adcel = true;
                    this.startapp = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.ad; i4++) {
                int i5 = this.appmetrica[i];
                int i6 = c0511e.f2616e;
                if (i5 == i6) {
                    float[] fArr = this.billing;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.yandex) {
                            this.yandex = this.purchase[i];
                        } else {
                            int[] iArr2 = this.purchase;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c0511e.vip(c0294e);
                        }
                        if (this.adcel) {
                            this.startapp = i;
                        }
                        c0511e.f2618e--;
                        this.ad--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.purchase[i];
            }
            int i7 = this.startapp;
            int i8 = i7 + 1;
            if (this.adcel) {
                int[] iArr3 = this.appmetrica;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.appmetrica;
            if (i7 >= iArr4.length && this.ad < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.appmetrica;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.appmetrica;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.license * 2;
                this.license = i10;
                this.adcel = false;
                this.startapp = i7 - 1;
                this.billing = Arrays.copyOf(this.billing, i10);
                this.appmetrica = Arrays.copyOf(this.appmetrica, this.license);
                this.purchase = Arrays.copyOf(this.purchase, this.license);
            }
            this.appmetrica[i7] = c0511e.f2616e;
            this.billing[i7] = f;
            if (i3 != -1) {
                int[] iArr7 = this.purchase;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.purchase[i7] = this.yandex;
                this.yandex = i7;
            }
            c0511e.f2618e++;
            c0511e.ad(c0294e);
            this.ad++;
            if (!this.adcel) {
                this.startapp++;
            }
            int i11 = this.startapp;
            int[] iArr8 = this.appmetrica;
            if (i11 >= iArr8.length) {
                this.adcel = true;
                this.startapp = iArr8.length - 1;
            }
        }
    }

    public final C0511e appmetrica(int i) {
        int i2 = this.yandex;
        for (int i3 = 0; i2 != -1 && i3 < this.ad; i3++) {
            if (i3 == i) {
                return ((C0511e[]) this.metrica.f3321e)[this.appmetrica[i2]];
            }
            i2 = this.purchase[i2];
        }
        return null;
    }

    public final void billing(C0511e c0511e, float f) {
        if (f == 0.0f) {
            yandex(c0511e, true);
            return;
        }
        int i = this.yandex;
        C0294e c0294e = this.vip;
        if (i == -1) {
            this.yandex = 0;
            this.billing[0] = f;
            this.appmetrica[0] = c0511e.f2616e;
            this.purchase[0] = -1;
            c0511e.f2618e++;
            c0511e.ad(c0294e);
            this.ad++;
            if (this.adcel) {
                return;
            }
            int i2 = this.startapp + 1;
            this.startapp = i2;
            int[] iArr = this.appmetrica;
            if (i2 >= iArr.length) {
                this.adcel = true;
                this.startapp = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.ad; i4++) {
            int i5 = this.appmetrica[i];
            int i6 = c0511e.f2616e;
            if (i5 == i6) {
                this.billing[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.purchase[i];
        }
        int i7 = this.startapp;
        int i8 = i7 + 1;
        if (this.adcel) {
            int[] iArr2 = this.appmetrica;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.appmetrica;
        if (i7 >= iArr3.length && this.ad < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.appmetrica;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.appmetrica;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.license * 2;
            this.license = i10;
            this.adcel = false;
            this.startapp = i7 - 1;
            this.billing = Arrays.copyOf(this.billing, i10);
            this.appmetrica = Arrays.copyOf(this.appmetrica, this.license);
            this.purchase = Arrays.copyOf(this.purchase, this.license);
        }
        this.appmetrica[i7] = c0511e.f2616e;
        this.billing[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.purchase;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.purchase[i7] = this.yandex;
            this.yandex = i7;
        }
        c0511e.f2618e++;
        c0511e.ad(c0294e);
        int i11 = this.ad + 1;
        this.ad = i11;
        if (!this.adcel) {
            this.startapp++;
        }
        int[] iArr7 = this.appmetrica;
        if (i11 >= iArr7.length) {
            this.adcel = true;
        }
        if (this.startapp >= iArr7.length) {
            this.adcel = true;
            this.startapp = iArr7.length - 1;
        }
    }

    public final int license() {
        return this.ad;
    }

    public final float metrica(C0511e c0511e) {
        int i = this.yandex;
        for (int i2 = 0; i != -1 && i2 < this.ad; i2++) {
            if (this.appmetrica[i] == c0511e.f2616e) {
                return this.billing[i];
            }
            i = this.purchase[i];
        }
        return 0.0f;
    }

    public final float purchase(int i) {
        int i2 = this.yandex;
        for (int i3 = 0; i2 != -1 && i3 < this.ad; i3++) {
            if (i3 == i) {
                return this.billing[i2];
            }
            i2 = this.purchase[i2];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.yandex;
        String str = BuildConfig.FLAVOR;
        for (int i2 = 0; i != -1 && i2 < this.ad; i2++) {
            StringBuilder inmobi = AbstractC8703e.inmobi(AbstractC10257e.adcel(str, " -> "));
            inmobi.append(this.billing[i]);
            inmobi.append(" : ");
            StringBuilder inmobi2 = AbstractC8703e.inmobi(inmobi.toString());
            inmobi2.append(((C0511e[]) this.metrica.f3321e)[this.appmetrica[i]]);
            str = inmobi2.toString();
            i = this.purchase[i];
        }
        return str;
    }

    public final void vip() {
        int i = this.yandex;
        for (int i2 = 0; i != -1 && i2 < this.ad; i2++) {
            C0511e c0511e = ((C0511e[]) this.metrica.f3321e)[this.appmetrica[i]];
            if (c0511e != null) {
                c0511e.vip(this.vip);
            }
            i = this.purchase[i];
        }
        this.yandex = -1;
        this.startapp = -1;
        this.adcel = false;
        this.ad = 0;
    }

    public final float yandex(C0511e c0511e, boolean z) {
        int i = this.yandex;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.ad) {
            if (this.appmetrica[i] == c0511e.f2616e) {
                if (i == this.yandex) {
                    this.yandex = this.purchase[i];
                } else {
                    int[] iArr = this.purchase;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0511e.vip(this.vip);
                }
                c0511e.f2618e--;
                this.ad--;
                this.appmetrica[i] = -1;
                if (this.adcel) {
                    this.startapp = i;
                }
                return this.billing[i];
            }
            i2++;
            i3 = i;
            i = this.purchase[i];
        }
        return 0.0f;
    }
}
