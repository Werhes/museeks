package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۘۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9709e {
    public static final C9709e appmetrica = new C9709e(0, 0, new Object[0], null);
    public int ad;
    public Object[] license;
    public final C10914e metrica;
    public int vip;

    public C9709e(int i, int i2, Object[] objArr, C10914e c10914e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = c10914e;
        this.license = objArr;
    }

    public static C9709e adcel(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C10914e c10914e) {
        if (i3 > 30) {
            return new C9709e(0, 0, new Object[]{obj, obj2, obj3, obj4}, c10914e);
        }
        int yandex = AbstractC10672e.yandex(i, i3);
        int yandex2 = AbstractC10672e.yandex(i2, i3);
        if (yandex != yandex2) {
            return new C9709e((1 << yandex) | (1 << yandex2), 0, yandex < yandex2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c10914e);
        }
        return new C9709e(0, 1 << yandex, new Object[]{adcel(i, obj, obj2, i2, obj3, obj4, i3 + 5, c10914e)}, c10914e);
    }

    public final C9709e Signature(int i, int i2, C6556e c6556e) {
        c6556e.startapp(c6556e.f13490e - 1);
        c6556e.f13488e = inmobi(i);
        Object[] objArr = this.license;
        if (objArr.length == 2) {
            return null;
        }
        if (this.metrica != c6556e.f13487e) {
            return new C9709e(i2 ^ this.ad, this.vip, AbstractC10672e.vip(i, objArr), c6556e.f13487e);
        }
        this.license = AbstractC10672e.vip(i, objArr);
        this.ad ^= i2;
        return this;
    }

    public final Object[] ad(int i, int i2, int i3, Object obj, Object obj2, int i4, C10914e c10914e) {
        Object obj3 = this.license[i];
        C9709e adcel = adcel(obj3 != null ? obj3.hashCode() : 0, obj3, inmobi(i), i3, obj, obj2, i4 + 5, c10914e);
        int pro = pro(i2);
        int i5 = pro + 1;
        Object[] objArr = this.license;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC1660e.loadAd(0, i, 6, objArr, objArr2);
        AbstractC1660e.mopub(i, i + 2, i5, objArr, objArr2);
        objArr2[pro - 1] = adcel;
        AbstractC1660e.mopub(pro, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final C9709e admob(C9709e c9709e, C9709e c9709e2, int i, int i2, C10914e c10914e) {
        C10914e c10914e2 = this.metrica;
        if (c9709e2 != null) {
            return (c10914e2 == c10914e || c9709e != c9709e2) ? subscription(i, c9709e2, c10914e) : this;
        }
        Object[] objArr = this.license;
        if (objArr.length == 1) {
            return null;
        }
        if (c10914e2 != c10914e) {
            return new C9709e(this.ad, i2 ^ this.vip, AbstractC10672e.metrica(i, objArr), c10914e);
        }
        this.license = AbstractC10672e.metrica(i, objArr);
        this.vip ^= i2;
        return this;
    }

    public final C9709e advert(int i, Object obj, Object obj2, int i2, C6556e c6556e) {
        C6556e c6556e2;
        C9709e advert;
        int yandex = 1 << AbstractC10672e.yandex(i, i2);
        boolean yandex2 = yandex(yandex);
        C10914e c10914e = this.metrica;
        if (yandex2) {
            int purchase = purchase(yandex);
            if (!AbstractC7890e.billing(obj, this.license[purchase])) {
                c6556e.startapp(c6556e.f13490e + 1);
                C10914e c10914e2 = c6556e.f13487e;
                if (c10914e != c10914e2) {
                    return new C9709e(this.ad ^ yandex, this.vip | yandex, ad(purchase, yandex, i, obj, obj2, i2, c10914e2), c10914e2);
                }
                this.license = ad(purchase, yandex, i, obj, obj2, i2, c10914e2);
                this.ad ^= yandex;
                this.vip |= yandex;
                return this;
            }
            c6556e.f13488e = inmobi(purchase);
            if (inmobi(purchase) == obj2) {
                return this;
            }
            if (c10914e == c6556e.f13487e) {
                this.license[purchase + 1] = obj2;
                return this;
            }
            c6556e.f13485e++;
            Object[] objArr = this.license;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[purchase + 1] = obj2;
            return new C9709e(this.ad, this.vip, copyOf, c6556e.f13487e);
        }
        if (!startapp(yandex)) {
            c6556e.startapp(c6556e.f13490e + 1);
            C10914e c10914e3 = c6556e.f13487e;
            int purchase2 = purchase(yandex);
            if (c10914e != c10914e3) {
                return new C9709e(this.ad | yandex, this.vip, AbstractC10672e.ad(this.license, purchase2, obj, obj2), c10914e3);
            }
            this.license = AbstractC10672e.ad(this.license, purchase2, obj, obj2);
            this.ad |= yandex;
            return this;
        }
        int pro = pro(yandex);
        C9709e remoteconfig = remoteconfig(pro);
        if (i2 == 30) {
            C11241e loadAd = AbstractC3062e.loadAd(2, AbstractC3062e.admob(0, remoteconfig.license.length));
            int i3 = loadAd.f22523e;
            int i4 = loadAd.f22522e;
            int i5 = loadAd.f22521e;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!AbstractC7890e.billing(obj, remoteconfig.license[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                c6556e.f13488e = remoteconfig.inmobi(i3);
                if (remoteconfig.metrica == c6556e.f13487e) {
                    remoteconfig.license[i3 + 1] = obj2;
                    advert = remoteconfig;
                } else {
                    c6556e.f13485e++;
                    Object[] objArr2 = remoteconfig.license;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    copyOf2[i3 + 1] = obj2;
                    advert = new C9709e(0, 0, copyOf2, c6556e.f13487e);
                }
                c6556e2 = c6556e;
            }
            c6556e.startapp(c6556e.f13490e + 1);
            advert = new C9709e(0, 0, AbstractC10672e.ad(remoteconfig.license, 0, obj, obj2), c6556e.f13487e);
            c6556e2 = c6556e;
        } else {
            c6556e2 = c6556e;
            advert = remoteconfig.advert(i, obj, obj2, i2 + 5, c6556e2);
        }
        return remoteconfig == advert ? this : subscription(pro, advert, c6556e2.f13487e);
    }

    public final C9709e amazon(int i, Object obj, int i2, C6556e c6556e) {
        C9709e amazon;
        int yandex = 1 << AbstractC10672e.yandex(i, i2);
        if (yandex(yandex)) {
            int purchase = purchase(yandex);
            if (AbstractC7890e.billing(obj, this.license[purchase])) {
                return Signature(purchase, yandex, c6556e);
            }
        } else if (startapp(yandex)) {
            int pro = pro(yandex);
            C9709e remoteconfig = remoteconfig(pro);
            if (i2 == 30) {
                C11241e loadAd = AbstractC3062e.loadAd(2, AbstractC3062e.admob(0, remoteconfig.license.length));
                int i3 = loadAd.f22523e;
                int i4 = loadAd.f22522e;
                int i5 = loadAd.f22521e;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!AbstractC7890e.billing(obj, remoteconfig.license[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    amazon = remoteconfig.mopub(i3, c6556e);
                }
                amazon = remoteconfig;
                break;
            }
            amazon = remoteconfig.amazon(i, obj, i2 + 5, c6556e);
            return admob(remoteconfig, amazon, pro, yandex, c6556e.f13487e);
        }
        return this;
    }

    public final boolean appmetrica(C9709e c9709e) {
        if (this == c9709e) {
            return true;
        }
        if (this.vip != c9709e.vip || this.ad != c9709e.ad) {
            return false;
        }
        int length = this.license.length;
        for (int i = 0; i < length; i++) {
            if (this.license[i] != c9709e.license[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object billing(int i, int i2, Object obj) {
        int yandex = 1 << AbstractC10672e.yandex(i, i2);
        if (yandex(yandex)) {
            int purchase = purchase(yandex);
            if (AbstractC7890e.billing(obj, this.license[purchase])) {
                return inmobi(purchase);
            }
            return null;
        }
        if (!startapp(yandex)) {
            return null;
        }
        C9709e remoteconfig = remoteconfig(pro(yandex));
        if (i2 != 30) {
            return remoteconfig.billing(i, i2 + 5, obj);
        }
        C11241e loadAd = AbstractC3062e.loadAd(2, AbstractC3062e.admob(0, remoteconfig.license.length));
        int i3 = loadAd.f22523e;
        int i4 = loadAd.f22522e;
        int i5 = loadAd.f22521e;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!AbstractC7890e.billing(obj, remoteconfig.license[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return remoteconfig.inmobi(i3);
    }

    public final Object inmobi(int i) {
        return this.license[i + 1];
    }

    public final C9709e isVip(int i, int i2, C9709e c9709e) {
        Object[] objArr = c9709e.license;
        if (objArr.length != 2 || c9709e.vip != 0) {
            Object[] objArr2 = this.license;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = c9709e;
            return new C9709e(this.ad, this.vip, copyOf, null);
        }
        if (this.license.length == 1) {
            c9709e.ad = this.vip;
            return c9709e;
        }
        int purchase = purchase(i2);
        Object[] objArr3 = this.license;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC1660e.mopub(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
        AbstractC1660e.mopub(purchase + 2, purchase, i, copyOf2, copyOf2);
        copyOf2[purchase] = obj;
        copyOf2[purchase + 1] = obj2;
        return new C9709e(this.ad ^ i2, i2 ^ this.vip, copyOf2, null);
    }

    public final boolean license(int i, int i2, Object obj) {
        int yandex = 1 << AbstractC10672e.yandex(i, i2);
        if (yandex(yandex)) {
            return AbstractC7890e.billing(obj, this.license[purchase(yandex)]);
        }
        if (!startapp(yandex)) {
            return false;
        }
        C9709e remoteconfig = remoteconfig(pro(yandex));
        return i2 == 30 ? remoteconfig.metrica(obj) : remoteconfig.license(i, i2 + 5, obj);
    }

    public final C9709e loadAd(int i, Object obj, Object obj2, int i2, C6556e c6556e) {
        C9709e c9709e;
        C9709e loadAd;
        int yandex = 1 << AbstractC10672e.yandex(i, i2);
        if (yandex(yandex)) {
            int purchase = purchase(yandex);
            if (AbstractC7890e.billing(obj, this.license[purchase]) && AbstractC7890e.billing(obj2, inmobi(purchase))) {
                return Signature(purchase, yandex, c6556e);
            }
        } else if (startapp(yandex)) {
            int pro = pro(yandex);
            C9709e remoteconfig = remoteconfig(pro);
            if (i2 == 30) {
                C11241e loadAd2 = AbstractC3062e.loadAd(2, AbstractC3062e.admob(0, remoteconfig.license.length));
                int i3 = loadAd2.f22523e;
                int i4 = loadAd2.f22522e;
                int i5 = loadAd2.f22521e;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!AbstractC7890e.billing(obj, remoteconfig.license[i3]) || !AbstractC7890e.billing(obj2, remoteconfig.inmobi(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            loadAd = remoteconfig.mopub(i3, c6556e);
                            break;
                        }
                    }
                    c9709e = remoteconfig;
                }
                loadAd = remoteconfig;
                c9709e = remoteconfig;
            } else {
                c9709e = remoteconfig;
                loadAd = c9709e.loadAd(i, obj, obj2, i2 + 5, c6556e);
            }
            return admob(c9709e, loadAd, pro, yandex, c6556e.f13487e);
        }
        return this;
    }

    public final boolean metrica(Object obj) {
        C11241e loadAd = AbstractC3062e.loadAd(2, AbstractC3062e.admob(0, this.license.length));
        int i = loadAd.f22523e;
        int i2 = loadAd.f22522e;
        int i3 = loadAd.f22521e;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!AbstractC7890e.billing(obj, this.license[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final C9709e mopub(int i, C6556e c6556e) {
        c6556e.startapp(c6556e.f13490e - 1);
        c6556e.f13488e = inmobi(i);
        Object[] objArr = this.license;
        if (objArr.length == 2) {
            return null;
        }
        if (this.metrica != c6556e.f13487e) {
            return new C9709e(0, 0, AbstractC10672e.vip(i, objArr), c6556e.f13487e);
        }
        this.license = AbstractC10672e.vip(i, objArr);
        return this;
    }

    public final int pro(int i) {
        return (this.license.length - 1) - Integer.bitCount((i - 1) & this.vip);
    }

    public final int purchase(int i) {
        return Integer.bitCount((i - 1) & this.ad) * 2;
    }

    public final C9709e remoteconfig(int i) {
        return (C9709e) this.license[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        r14.f26878e = isVip(r12, r4, (defpackage.C9709e) r14.f26878e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C13572e signatures(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9709e.signatures(int, java.lang.Object, java.lang.Object, int):eْۢؑ");
    }

    public final C9709e smaato(C9709e c9709e, int i, C1702e c1702e, C6556e c6556e) {
        Object[] objArr;
        C9709e adcel;
        if (this == c9709e) {
            c1702e.ad += vip();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            C10914e c10914e = c6556e.f13487e;
            int i3 = c9709e.vip;
            Object[] objArr2 = this.license;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + c9709e.license.length);
            int length = this.license.length;
            C11241e loadAd = AbstractC3062e.loadAd(2, AbstractC3062e.admob(0, c9709e.license.length));
            int i4 = loadAd.f22523e;
            int i5 = loadAd.f22522e;
            int i6 = loadAd.f22521e;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (metrica(c9709e.license[i4])) {
                        c1702e.ad++;
                    } else {
                        Object[] objArr3 = c9709e.license;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.license.length) {
                return length == c9709e.license.length ? c9709e : length == copyOf.length ? new C9709e(0, 0, copyOf, c10914e) : new C9709e(0, 0, Arrays.copyOf(copyOf, length), c10914e);
            }
        } else {
            int i7 = this.vip | c9709e.vip;
            int i8 = this.ad;
            int i9 = c9709e.ad;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (AbstractC7890e.billing(this.license[purchase(lowestOneBit)], c9709e.license[c9709e.purchase(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                AbstractC6536e.vip("Check failed.");
            }
            C9709e c9709e2 = (AbstractC7890e.billing(this.metrica, c6556e.f13487e) && this.ad == i12 && this.vip == i7) ? this : new C9709e(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = c9709e2.license;
                int length2 = (objArr4.length - 1) - i14;
                if (startapp(lowestOneBit2)) {
                    adcel = remoteconfig(pro(lowestOneBit2));
                    if (c9709e.startapp(lowestOneBit2)) {
                        adcel = adcel.smaato(c9709e.remoteconfig(c9709e.pro(lowestOneBit2)), i + 5, c1702e, c6556e);
                        objArr = objArr4;
                    } else if (c9709e.yandex(lowestOneBit2)) {
                        int purchase = c9709e.purchase(lowestOneBit2);
                        Object obj = c9709e.license[purchase];
                        Object inmobi = c9709e.inmobi(purchase);
                        int i15 = c6556e.f13490e;
                        objArr = objArr4;
                        adcel = adcel.advert(obj != null ? obj.hashCode() : i2, obj, inmobi, i + 5, c6556e);
                        if (c6556e.f13490e == i15) {
                            c1702e.ad++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c9709e.startapp(lowestOneBit2)) {
                        C9709e remoteconfig = c9709e.remoteconfig(c9709e.pro(lowestOneBit2));
                        if (yandex(lowestOneBit2)) {
                            int purchase2 = purchase(lowestOneBit2);
                            Object obj2 = this.license[purchase2];
                            int i16 = i + 5;
                            if (remoteconfig.license(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                c1702e.ad++;
                            } else {
                                adcel = remoteconfig.advert(obj2 != null ? obj2.hashCode() : 0, obj2, inmobi(purchase2), i16, c6556e);
                            }
                        }
                        adcel = remoteconfig;
                    } else {
                        int purchase3 = purchase(lowestOneBit2);
                        Object obj3 = this.license[purchase3];
                        Object inmobi2 = inmobi(purchase3);
                        int purchase4 = c9709e.purchase(lowestOneBit2);
                        Object obj4 = c9709e.license[purchase4];
                        adcel = adcel(obj3 != null ? obj3.hashCode() : 0, obj3, inmobi2, obj4 != null ? obj4.hashCode() : 0, obj4, c9709e.inmobi(purchase4), i + 5, c6556e.f13487e);
                    }
                }
                objArr[length2] = adcel;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (c9709e.yandex(lowestOneBit3)) {
                    int purchase5 = c9709e.purchase(lowestOneBit3);
                    Object[] objArr5 = c9709e2.license;
                    objArr5[i18] = c9709e.license[purchase5];
                    objArr5[i18 + 1] = c9709e.inmobi(purchase5);
                    if (yandex(lowestOneBit3)) {
                        c1702e.ad++;
                    }
                } else {
                    int purchase6 = purchase(lowestOneBit3);
                    Object[] objArr6 = c9709e2.license;
                    objArr6[i18] = this.license[purchase6];
                    objArr6[i18 + 1] = inmobi(purchase6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!appmetrica(c9709e2)) {
                return c9709e.appmetrica(c9709e2) ? c9709e : c9709e2;
            }
        }
        return this;
    }

    public final boolean startapp(int i) {
        return (i & this.vip) != 0;
    }

    public final C9709e subscription(int i, C9709e c9709e, C10914e c10914e) {
        Object[] objArr = this.license;
        if (objArr.length == 1 && c9709e.license.length == 2 && c9709e.vip == 0) {
            c9709e.ad = this.vip;
            return c9709e;
        }
        if (this.metrica == c10914e) {
            objArr[i] = c9709e;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = c9709e;
        return new C9709e(this.ad, this.vip, copyOf, c10914e);
    }

    public final C9709e tapsense(int i, int i2, Object obj) {
        C9709e tapsense;
        int yandex = 1 << AbstractC10672e.yandex(i, i2);
        if (yandex(yandex)) {
            int purchase = purchase(yandex);
            if (AbstractC7890e.billing(obj, this.license[purchase])) {
                Object[] objArr = this.license;
                if (objArr.length != 2) {
                    return new C9709e(this.ad ^ yandex, this.vip, AbstractC10672e.vip(purchase, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (startapp(yandex)) {
            int pro = pro(yandex);
            C9709e remoteconfig = remoteconfig(pro);
            if (i2 == 30) {
                C11241e loadAd = AbstractC3062e.loadAd(2, AbstractC3062e.admob(0, remoteconfig.license.length));
                int i3 = loadAd.f22523e;
                int i4 = loadAd.f22522e;
                int i5 = loadAd.f22521e;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!AbstractC7890e.billing(obj, remoteconfig.license[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = remoteconfig.license;
                    tapsense = objArr2.length == 2 ? null : new C9709e(0, 0, AbstractC10672e.vip(i3, objArr2), null);
                }
                tapsense = remoteconfig;
                break;
            }
            tapsense = remoteconfig.tapsense(i, i2 + 5, obj);
            if (tapsense == null) {
                Object[] objArr3 = this.license;
                if (objArr3.length != 1) {
                    return new C9709e(this.ad, yandex ^ this.vip, AbstractC10672e.metrica(pro, objArr3), null);
                }
                return null;
            }
            if (remoteconfig != tapsense) {
                return isVip(pro, yandex, tapsense);
            }
        }
        return this;
    }

    public final int vip() {
        if (this.vip == 0) {
            return this.license.length / 2;
        }
        int bitCount = Integer.bitCount(this.ad);
        int length = this.license.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += remoteconfig(i).vip();
        }
        return bitCount;
    }

    public final boolean yandex(int i) {
        return (i & this.ad) != 0;
    }
}
