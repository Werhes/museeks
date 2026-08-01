package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3431e extends AbstractC13532e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final int[] f7683e = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Alert.DURATION_SHOW_INDEFINITELY};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AbstractC13532e f7684e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f7685e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC13532e f7686e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f7687e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f7688e;

    public C3431e(AbstractC13532e abstractC13532e, AbstractC13532e abstractC13532e2) {
        this.f7686e = abstractC13532e;
        this.f7684e = abstractC13532e2;
        int startapp = abstractC13532e.startapp();
        this.f7688e = startapp;
        this.f7685e = abstractC13532e2.startapp() + startapp;
        this.f7687e = Math.max(abstractC13532e.advert(), abstractC13532e2.advert()) + 1;
    }

    public static int crashlytics(int i) {
        return i >= 47 ? Alert.DURATION_SHOW_INDEFINITELY : f7683e[i];
    }

    @Override // defpackage.AbstractC13532e
    public final int Signature(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC13532e abstractC13532e = this.f7686e;
        int i5 = this.f7688e;
        if (i4 <= i5) {
            return abstractC13532e.Signature(i, i2, i3);
        }
        AbstractC13532e abstractC13532e2 = this.f7684e;
        if (i2 >= i5) {
            return abstractC13532e2.Signature(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC13532e2.Signature(abstractC13532e.Signature(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC13532e
    public final void adcel(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        AbstractC13532e abstractC13532e = this.f7686e;
        int i5 = this.f7688e;
        if (i4 <= i5) {
            abstractC13532e.adcel(i, i2, i3, bArr);
            return;
        }
        AbstractC13532e abstractC13532e2 = this.f7684e;
        if (i >= i5) {
            abstractC13532e2.adcel(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        abstractC13532e.adcel(i, i2, i6, bArr);
        abstractC13532e2.adcel(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // defpackage.AbstractC13532e
    public final AbstractC13532e admob(int i, int i2) {
        int i3 = this.f7685e;
        int isVip = AbstractC13532e.isVip(i, i2, i3);
        if (isVip == 0) {
            return AbstractC13532e.f26826e;
        }
        if (isVip == i3) {
            return this;
        }
        AbstractC13532e abstractC13532e = this.f7686e;
        int i4 = this.f7688e;
        if (i2 <= i4) {
            return abstractC13532e.admob(i, i2);
        }
        AbstractC13532e abstractC13532e2 = this.f7684e;
        if (i < i4) {
            return new C3431e(abstractC13532e.admob(i, abstractC13532e.startapp()), abstractC13532e2.admob(0, i2 - i4));
        }
        return abstractC13532e2.admob(i - i4, i2 - i4);
    }

    @Override // defpackage.AbstractC13532e
    public final int advert() {
        return this.f7687e;
    }

    @Override // defpackage.AbstractC13532e
    public final byte appmetrica(int i) {
        AbstractC13532e.subs(i, this.f7685e);
        return billing(i);
    }

    @Override // defpackage.AbstractC13532e
    public final byte billing(int i) {
        int i2 = this.f7688e;
        return i < i2 ? this.f7686e.billing(i) : this.f7684e.billing(i - i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13532e) {
            AbstractC13532e abstractC13532e = (AbstractC13532e) obj;
            int startapp = abstractC13532e.startapp();
            int i = this.f7685e;
            if (i == startapp) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.f26827e;
                int i3 = abstractC13532e.f26827e;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    C5414e c5414e = new C5414e(this);
                    C2655e vip = c5414e.vip();
                    C5414e c5414e2 = new C5414e(abstractC13532e);
                    C2655e vip2 = c5414e2.vip();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int startapp2 = vip.startapp() - i4;
                        int startapp3 = vip2.startapp() - i5;
                        int min = Math.min(startapp2, startapp3);
                        if (!(i4 == 0 ? vip.firebase(vip2, i5, min) : vip2.firebase(vip, i4, min))) {
                            break;
                        }
                        i6 += min;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (min == startapp2) {
                            vip = c5414e.vip();
                            i4 = 0;
                        } else {
                            i4 += min;
                        }
                        if (min == startapp3) {
                            vip2 = c5414e2.vip();
                            i5 = 0;
                        } else {
                            i5 += min;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC13532e
    /* renamed from: inmobi */
    public final AbstractC7014e iterator() {
        return new C11624e(this);
    }

    @Override // defpackage.AbstractC13532e, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C11624e(this);
    }

    @Override // defpackage.AbstractC13532e
    public final int loadAd(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC13532e abstractC13532e = this.f7686e;
        int i5 = this.f7688e;
        if (i4 <= i5) {
            return abstractC13532e.loadAd(i, i2, i3);
        }
        AbstractC13532e abstractC13532e2 = this.f7684e;
        if (i2 >= i5) {
            return abstractC13532e2.loadAd(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC13532e2.loadAd(abstractC13532e.loadAd(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC13532e
    public final void remoteconfig(C5633e c5633e) {
        this.f7686e.remoteconfig(c5633e);
        this.f7684e.remoteconfig(c5633e);
    }

    @Override // defpackage.AbstractC13532e
    public final boolean smaato() {
        return this.f7685e >= crashlytics(this.f7687e);
    }

    @Override // defpackage.AbstractC13532e
    public final int startapp() {
        return this.f7685e;
    }

    @Override // defpackage.AbstractC13532e
    public final String subscription(Charset charset) {
        byte[] bArr;
        int startapp = startapp();
        if (startapp == 0) {
            bArr = AbstractC12312e.vip;
        } else {
            byte[] bArr2 = new byte[startapp];
            adcel(0, 0, startapp, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    @Override // defpackage.AbstractC13532e
    public final boolean tapsense() {
        int Signature = this.f7686e.Signature(0, 0, this.f7688e);
        AbstractC13532e abstractC13532e = this.f7684e;
        return abstractC13532e.Signature(Signature, 0, abstractC13532e.startapp()) == 0;
    }
}
