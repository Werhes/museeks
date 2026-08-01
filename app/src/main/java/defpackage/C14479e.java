package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14479e {
    public final C2025e Signature;
    public final C18516e ad;
    public int adcel;
    public final C2025e admob;
    public int advert;
    public int amazon;
    public HashMap appmetrica;
    public int billing;
    public C12452e inmobi;
    public boolean isVip;
    public ArrayList license;
    public int loadAd;
    public Object[] metrica;
    public int mopub;
    public int pro;
    public C3123e purchase;
    public C3123e remoteconfig;
    public int signatures;
    public int smaato;
    public int startapp;
    public final C2025e subscription;
    public int tapsense;
    public int[] vip;
    public int yandex;

    public C14479e(C18516e c18516e) {
        this.ad = c18516e;
        int[] iArr = c18516e.f36309e;
        this.vip = iArr;
        Object[] objArr = c18516e.f36302e;
        this.metrica = objArr;
        this.license = c18516e.f36308e;
        this.appmetrica = c18516e.f36303e;
        this.purchase = c18516e.f36306e;
        int i = c18516e.f36304e;
        this.billing = i;
        this.yandex = (iArr.length / 5) - i;
        int i2 = c18516e.f36307e;
        this.mopub = i2;
        this.advert = objArr.length - i2;
        this.smaato = i;
        this.Signature = new C2025e((byte) 0, 2);
        this.admob = new C2025e((byte) 0, 2);
        this.subscription = new C2025e((byte) 0, 2);
        this.signatures = i;
        this.tapsense = -1;
    }

    public static void applovin(C14479e c14479e) {
        int i = c14479e.tapsense;
        int subscription = c14479e.subscription(i);
        int[] iArr = c14479e.vip;
        int i2 = (subscription * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        c14479e.m3810case(c14479e.firebase(iArr, i));
    }

    public static int startapp(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final int Signature() {
        return loadAd() - this.yandex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: abstract, reason: not valid java name */
    public final void m3808abstract(Object obj, Object obj2, boolean z, int i) {
        int i2;
        int i3 = this.tapsense;
        Object[] objArr = this.amazon > 0;
        this.subscription.appmetrica(this.loadAd);
        C5170e c5170e = C2987e.ad;
        if (objArr == true) {
            int i4 = this.pro;
            int billing = billing(this.vip, subscription(i4));
            isVip(1);
            this.startapp = billing;
            this.adcel = billing;
            int subscription = subscription(i4);
            int i5 = obj != c5170e ? 1 : 0;
            int i6 = (z || obj2 == c5170e) ? 0 : 1;
            int startapp = startapp(billing, this.mopub, this.advert, this.metrica.length);
            if (startapp >= 0 && this.smaato < i4) {
                startapp = -(((this.metrica.length - this.advert) - startapp) + 1);
            }
            int[] iArr = this.vip;
            int i7 = this.tapsense;
            int i8 = subscription * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = startapp;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                inmobi(i9, i4);
                Object[] objArr2 = this.metrica;
                int i10 = this.startapp;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.startapp = i10;
            }
            this.loadAd = 0;
            i2 = i4 + 1;
            this.tapsense = i4;
            this.pro = i2;
            if (i3 >= 0) {
                m3819protected(i3);
            }
        } else {
            this.Signature.appmetrica(i3);
            this.admob.appmetrica((loadAd() - this.yandex) - this.signatures);
            int i11 = this.pro;
            int subscription2 = subscription(i11);
            if (!AbstractC7890e.billing(obj2, c5170e)) {
                if (z) {
                    m3811catch(this.pro, obj2);
                } else {
                    m3816implements(obj2);
                }
            }
            this.startapp = m3822try(this.vip, subscription2);
            this.adcel = billing(this.vip, subscription(this.pro + 1));
            int[] iArr2 = this.vip;
            int i12 = subscription2 * 5;
            this.loadAd = iArr2[i12 + 1] & 67108863;
            this.tapsense = i11;
            this.pro = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.signatures = i2;
    }

    public final void ad(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            AbstractC1889e.ad("Cannot seek backwards");
        }
        if (!(this.amazon <= 0)) {
            AbstractC6536e.vip("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.pro + i;
        if (i2 >= this.tapsense && i2 <= this.signatures) {
            z = true;
        }
        if (!z) {
            AbstractC1889e.ad("Cannot seek outside the current group (" + this.tapsense + '-' + this.signatures + ')');
        }
        this.pro = i2;
        int billing = billing(this.vip, subscription(i2));
        this.startapp = billing;
        this.adcel = billing;
    }

    public final void adcel() {
        C12328e c12328e;
        boolean z = this.amazon > 0;
        int i = this.pro;
        int i2 = this.signatures;
        int i3 = this.tapsense;
        int subscription = subscription(i3);
        int i4 = this.loadAd;
        int i5 = i - i3;
        int i6 = subscription * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.vip[i7] & 1073741824) != 0;
        C2025e c2025e = this.subscription;
        if (z) {
            C3123e c3123e = this.remoteconfig;
            if (c3123e != null && (c12328e = (C12328e) c3123e.vip(i3)) != null) {
                Object[] objArr = c12328e.ad;
                int i8 = c12328e.vip;
                for (int i9 = 0; i9 < i8; i9++) {
                    m3812class(objArr[i9]);
                }
            }
            int[] iArr = this.vip;
            iArr[i6 + 3] = i5;
            AbstractC2855e.license(subscription, i4, iArr);
            int license = c2025e.license();
            if (z2) {
                i4 = 1;
            }
            this.loadAd = license + i4;
            int firebase = firebase(this.vip, i3);
            this.tapsense = firebase;
            int Signature = firebase < 0 ? Signature() : subscription(firebase + 1);
            int billing = Signature >= 0 ? billing(this.vip, Signature) : 0;
            this.startapp = billing;
            this.adcel = billing;
            return;
        }
        if (i != i2) {
            AbstractC1889e.ad("Expected to be at the end of a group");
        }
        int[] iArr2 = this.vip;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        AbstractC2855e.license(subscription, i4, iArr2);
        int license2 = this.Signature.license();
        this.signatures = (loadAd() - this.yandex) - this.admob.license();
        this.tapsense = license2;
        int firebase2 = firebase(this.vip, i3);
        int license3 = c2025e.license();
        this.loadAd = license3;
        if (firebase2 == license2) {
            this.loadAd = license3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (firebase2 != 0 && firebase2 != license2 && (i14 != 0 || i13 != 0)) {
                int subscription2 = subscription(firebase2);
                if (i13 != 0) {
                    int[] iArr3 = this.vip;
                    int i15 = (subscription2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.vip;
                    AbstractC2855e.license(subscription2, (iArr4[(subscription2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.vip;
                if ((iArr5[(subscription2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                firebase2 = firebase(iArr5, firebase2);
            }
        }
        this.loadAd += i14;
    }

    public final Object admob(int i) {
        int subscription = subscription(i);
        int[] iArr = this.vip;
        int i2 = (subscription * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return C2987e.ad;
        }
        return this.metrica[Integer.bitCount(iArr[i2] >> 29) + billing(iArr, subscription)];
    }

    public final void ads(C18516e c18516e, int i) {
        if (this.amazon <= 0) {
            AbstractC1889e.ad("Check failed");
        }
        if (i == 0 && this.pro == 0 && this.ad.f36304e == 0) {
            int[] iArr = c18516e.f36309e;
            int i2 = iArr[(i * 5) + 3];
            int i3 = c18516e.f36304e;
            if (i2 == i3) {
                int[] iArr2 = this.vip;
                Object[] objArr = this.metrica;
                ArrayList arrayList = this.license;
                HashMap hashMap = this.appmetrica;
                C3123e c3123e = this.purchase;
                Object[] objArr2 = c18516e.f36302e;
                int i4 = c18516e.f36307e;
                HashMap hashMap2 = c18516e.f36303e;
                C3123e c3123e2 = c18516e.f36306e;
                this.vip = iArr;
                this.metrica = objArr2;
                this.license = c18516e.f36308e;
                this.billing = i3;
                this.yandex = (iArr.length / 5) - i3;
                this.mopub = i4;
                this.advert = objArr2.length - i4;
                this.smaato = i3;
                this.appmetrica = hashMap2;
                this.purchase = c3123e2;
                c18516e.f36309e = iArr2;
                c18516e.f36304e = 0;
                c18516e.f36302e = objArr;
                c18516e.f36307e = 0;
                c18516e.f36308e = arrayList;
                c18516e.f36303e = hashMap;
                c18516e.f36306e = c3123e;
                return;
            }
        }
        C14479e adcel = c18516e.adcel();
        try {
            AbstractC15603e.vip(adcel, i, this, true, true, false);
            adcel.appmetrica(true);
        } catch (Throwable th) {
            adcel.appmetrica(false);
            throw th;
        }
    }

    public final void advert(int i) {
        boolean z = false;
        if (!(this.amazon <= 0)) {
            AbstractC1889e.ad("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.tapsense;
        if (i2 != i) {
            if (i >= i2 && i < this.signatures) {
                z = true;
            }
            if (!z) {
                AbstractC1889e.ad("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.pro;
            int i4 = this.startapp;
            int i5 = this.adcel;
            this.pro = i;
            m3809break();
            this.pro = i3;
            this.startapp = i4;
            this.adcel = i5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x013a, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void amazon(int r21, kotlin.jvm.functions.Function2 r22) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14479e.amazon(int, kotlin.jvm.functions.Function2):void");
    }

    public final void appmetrica(boolean z) {
        this.isVip = true;
        if (z && this.Signature.metrica == 0) {
            premium(Signature());
            subs(this.metrica.length - this.advert, this.billing);
            int i = this.mopub;
            Arrays.fill(this.metrica, i, this.advert + i, (Object) null);
            m3817interface();
        }
        int[] iArr = this.vip;
        int i2 = this.billing;
        Object[] objArr = this.metrica;
        int i3 = this.mopub;
        ArrayList arrayList = this.license;
        HashMap hashMap = this.appmetrica;
        C3123e c3123e = this.purchase;
        C18516e c18516e = this.ad;
        if (!c18516e.f36310e) {
            AbstractC6536e.ad("Unexpected writer close()");
        }
        c18516e.f36310e = false;
        c18516e.f36309e = iArr;
        c18516e.f36304e = i2;
        c18516e.f36302e = objArr;
        c18516e.f36307e = i3;
        c18516e.f36308e = arrayList;
        c18516e.f36303e = hashMap;
        c18516e.f36306e = c3123e;
    }

    public final int billing(int[] iArr, int i) {
        if (i >= loadAd()) {
            return this.metrica.length - this.advert;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.metrica.length - this.advert) + i2 + 1 : i2;
    }

    /* renamed from: break, reason: not valid java name */
    public final void m3809break() {
        if (this.amazon != 0) {
            AbstractC1889e.ad("Key must be supplied when inserting");
        }
        C5170e c5170e = C2987e.ad;
        m3808abstract(c5170e, c5170e, false, 0);
    }

    /* renamed from: case, reason: not valid java name */
    public final void m3810case(int i) {
        if (i >= 0) {
            C12452e c12452e = this.inmobi;
            if (c12452e == null) {
                c12452e = new C12452e();
                this.inmobi = c12452e;
            }
            AbstractC11263e.ad(c12452e, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /* renamed from: catch, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3811catch(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.subscription(r5)
            int[] r1 = r4.vip
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            defpackage.AbstractC1889e.ad(r5)
        L2e:
            java.lang.Object[] r5 = r4.metrica
            int[] r1 = r4.vip
            int r0 = r4.billing(r1, r0)
            int r0 = r4.yandex(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14479e.m3811catch(int, java.lang.Object):void");
    }

    /* renamed from: class, reason: not valid java name */
    public final Object m3812class(Object obj) {
        if (this.amazon > 0) {
            inmobi(1, this.tapsense);
        }
        Object[] objArr = this.metrica;
        int i = this.startapp;
        this.startapp = i + 1;
        Object obj2 = objArr[yandex(i)];
        if (this.startapp > this.adcel) {
            AbstractC1889e.ad("Writing to an invalid slot");
        }
        this.metrica[yandex(this.startapp - 1)] = obj;
        return obj2;
    }

    public final Object crashlytics(int i) {
        int subscription = subscription(i);
        int[] iArr = this.vip;
        if ((iArr[(subscription * 5) + 1] & 1073741824) != 0) {
            return this.metrica[yandex(billing(iArr, subscription))];
        }
        return null;
    }

    /* renamed from: default, reason: not valid java name */
    public final C3155e m3813default(int i) {
        ArrayList arrayList;
        int purchase;
        if (i < 0 || i >= Signature() || (purchase = AbstractC2855e.purchase((arrayList = this.license), i, Signature())) < 0) {
            return null;
        }
        return (C3155e) arrayList.get(purchase);
    }

    /* renamed from: extends, reason: not valid java name */
    public final Object m3814extends(int i, int i2, Object obj) {
        int m3822try = m3822try(this.vip, subscription(i));
        int billing = billing(this.vip, subscription(i + 1));
        int i3 = m3822try + i2;
        if (i3 < m3822try || i3 >= billing) {
            AbstractC1889e.ad("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int yandex = yandex(i3);
        Object[] objArr = this.metrica;
        Object obj2 = objArr[yandex];
        objArr[yandex] = obj;
        return obj2;
    }

    public final int firebase(int[] iArr, int i) {
        int i2 = iArr[(subscription(i) * 5) + 2];
        return i2 > -2 ? i2 : (Signature() + i2) - (-2);
    }

    /* renamed from: goto, reason: not valid java name */
    public final boolean m3815goto() {
        if (!(this.amazon == 0)) {
            AbstractC1889e.ad("Cannot remove group while inserting");
        }
        int i = this.pro;
        int i2 = this.startapp;
        int billing = billing(this.vip, subscription(i));
        int m3821throw = m3821throw();
        m3819protected(this.tapsense);
        C12452e c12452e = this.inmobi;
        if (c12452e != null) {
            while (true) {
                int i3 = c12452e.vip;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    AbstractC14783e.startapp("IntList is empty.");
                    throw null;
                }
                if (c12452e.ad[0] < i) {
                    break;
                }
                AbstractC11263e.applovin(c12452e);
            }
        }
        boolean m3820this = m3820this(i, this.pro - i);
        m3818native(billing, this.startapp - billing, i - 1);
        this.pro = i;
        this.startapp = i2;
        this.loadAd -= m3821throw;
        return m3820this;
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m3816implements(Object obj) {
        int subscription = subscription(this.pro);
        int i = (subscription * 5) + 1;
        if ((this.vip[i] & 268435456) == 0) {
            AbstractC1889e.ad("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.metrica;
        int[] iArr = this.vip;
        objArr[yandex(Integer.bitCount(iArr[i] >> 29) + billing(iArr, subscription))] = obj;
    }

    public final void inmobi(int i, int i2) {
        if (i > 0) {
            subs(this.startapp, i2);
            int i3 = this.mopub;
            int i4 = this.advert;
            if (i4 < i) {
                Object[] objArr = this.metrica;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.metrica = objArr2;
                i4 = i7;
            }
            int i9 = this.adcel;
            if (i9 >= i3) {
                this.adcel = i9 + i;
            }
            this.mopub = i3 + i;
            this.advert = i4 - i;
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m3817interface() {
        int i;
        C12452e c12452e = this.inmobi;
        if (c12452e != null) {
            while (c12452e.vip != 0) {
                int applovin = AbstractC11263e.applovin(c12452e);
                int subscription = subscription(applovin);
                int i2 = applovin + 1;
                int signatures = signatures(applovin) + applovin;
                while (true) {
                    if (i2 >= signatures) {
                        i = 0;
                        break;
                    } else {
                        if ((this.vip[(subscription(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += signatures(i2);
                    }
                }
                int[] iArr = this.vip;
                int i3 = (subscription * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int firebase = firebase(iArr, applovin);
                    if (firebase >= 0) {
                        AbstractC11263e.ad(c12452e, firebase);
                    }
                }
            }
        }
    }

    public final boolean isPro(int i) {
        return (this.vip[(subscription(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void isVip(int i) {
        if (i > 0) {
            int i2 = this.pro;
            premium(i2);
            int i3 = this.billing;
            int i4 = this.yandex;
            int[] iArr = this.vip;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                AbstractC1660e.advert(0, 0, iArr, iArr2, i3 * 5);
                AbstractC1660e.advert((i3 + i6) * 5, (i4 + i3) * 5, iArr, iArr2, length * 5);
                this.vip = iArr2;
                i4 = i6;
            }
            int i7 = this.signatures;
            if (i7 >= i3) {
                this.signatures = i7 + i;
            }
            int i8 = i3 + i;
            this.billing = i8;
            this.yandex = i4 - i;
            int startapp = startapp(i5 > 0 ? purchase(i2 + i) : 0, this.smaato >= i3 ? this.mopub : 0, this.advert, this.metrica.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.vip[(i9 * 5) + 4] = startapp;
            }
            int i10 = this.smaato;
            if (i10 >= i3) {
                this.smaato = i10 + i;
            }
        }
    }

    public final void license() {
        int i = this.amazon;
        this.amazon = i + 1;
        if (i == 0) {
            this.admob.appmetrica((loadAd() - this.yandex) - this.signatures);
        }
    }

    public final int loadAd() {
        return this.vip.length / 5;
    }

    public final int metrica(C3155e c3155e) {
        int i = c3155e.ad;
        return i < 0 ? Signature() + i : i;
    }

    public final void mopub() {
        if (this.amazon <= 0) {
            AbstractC6536e.vip("Unbalanced begin/end insert");
        }
        int i = this.amazon - 1;
        this.amazon = i;
        if (i == 0) {
            if (this.subscription.metrica != this.Signature.metrica) {
                AbstractC1889e.ad("startGroup/endGroup mismatch while inserting");
            }
            this.signatures = (loadAd() - this.yandex) - this.admob.license();
        }
    }

    /* renamed from: native, reason: not valid java name */
    public final void m3818native(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.advert;
            int i5 = i + i2;
            subs(i5, i3);
            this.mopub = i;
            this.advert = i4 + i2;
            Arrays.fill(this.metrica, i, i5, (Object) null);
            int i6 = this.adcel;
            if (i6 >= i) {
                this.adcel = i6 - i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.vip;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        defpackage.AbstractC1660e.advert(r4 + r3, r3, r2, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        defpackage.AbstractC1660e.advert(r5, r5 + r4, r2, r2, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void premium(int r9) {
        /*
            r8 = this;
            int r0 = r8.yandex
            int r1 = r8.billing
            if (r1 == r9) goto Lad
            java.util.ArrayList r2 = r8.license
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5b
            int r2 = r8.yandex
            int r3 = r8.loadAd()
            int r3 = r3 - r2
            if (r1 >= r9) goto L39
            java.util.ArrayList r2 = r8.license
            int r2 = defpackage.AbstractC2855e.vip(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r8.license
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r8.license
            java.lang.Object r4 = r4.get(r2)
            eؕؗٞ r4 = (defpackage.C3155e) r4
            int r5 = r4.ad
            if (r5 >= 0) goto L5b
            int r5 = r5 + r3
            if (r5 >= r9) goto L5b
            r4.ad = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            java.util.ArrayList r2 = r8.license
            int r2 = defpackage.AbstractC2855e.vip(r2, r9, r3)
        L3f:
            java.util.ArrayList r4 = r8.license
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r8.license
            java.lang.Object r4 = r4.get(r2)
            eؕؗٞ r4 = (defpackage.C3155e) r4
            int r5 = r4.ad
            if (r5 < 0) goto L5b
            int r5 = r3 - r5
            int r5 = -r5
            r4.ad = r5
            int r2 = r2 + 1
            goto L3f
        L5b:
            if (r0 <= 0) goto L72
            int[] r2 = r8.vip
            int r3 = r9 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            if (r9 >= r1) goto L6c
            int r4 = r4 + r3
            defpackage.AbstractC1660e.advert(r4, r3, r2, r2, r5)
            goto L72
        L6c:
            int r6 = r5 + r4
            int r3 = r3 + r4
            defpackage.AbstractC1660e.advert(r5, r6, r2, r2, r3)
        L72:
            if (r9 >= r1) goto L76
            int r1 = r9 + r0
        L76:
            int r2 = r8.loadAd()
            if (r1 >= r2) goto L7d
            goto L82
        L7d:
            java.lang.String r3 = "Check failed"
            defpackage.AbstractC1889e.ad(r3)
        L82:
            if (r1 >= r2) goto Lad
            int[] r3 = r8.vip
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L91
            r6 = r3
            goto L97
        L91:
            int r6 = r8.Signature()
            int r6 = r6 + r3
            int r6 = r6 - r5
        L97:
            if (r6 >= r9) goto L9a
            goto La1
        L9a:
            int r7 = r8.Signature()
            int r7 = r7 - r6
            int r7 = r7 - r5
            int r6 = -r7
        La1:
            if (r6 == r3) goto La7
            int[] r3 = r8.vip
            r3[r4] = r6
        La7:
            int r1 = r1 + 1
            if (r1 != r9) goto L82
            int r1 = r1 + r0
            goto L82
        Lad:
            r8.billing = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14479e.premium(int):void");
    }

    public final Object pro(int i) {
        int subscription = subscription(i);
        int[] iArr = this.vip;
        int i2 = subscription * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.metrica[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* renamed from: protected, reason: not valid java name */
    public final AbstractC3091e m3819protected(int i) {
        C3155e m3813default;
        HashMap hashMap = this.appmetrica;
        if (hashMap == null || (m3813default = m3813default(i)) == null) {
            return null;
        }
        return (AbstractC3091e) hashMap.get(m3813default);
    }

    public final int purchase(int i) {
        return billing(this.vip, subscription(i));
    }

    public final int remoteconfig(int i) {
        return this.vip[subscription(i) * 5];
    }

    public final int signatures(int i) {
        return AbstractC2855e.ad(this.vip, subscription(i));
    }

    public final void smaato(int i, int i2, int i3) {
        if (i >= this.billing) {
            i = -((Signature() - i) + 2);
        }
        while (i3 < i2) {
            this.vip[(subscription(i3) * 5) + 2] = i;
            int i4 = this.vip[(subscription(i3) * 5) + 3] + i3;
            smaato(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final void subs(int i, int i2) {
        int i3 = this.advert;
        int i4 = this.mopub;
        int i5 = this.smaato;
        if (i4 != i) {
            Object[] objArr = this.metrica;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, Signature());
        if (i5 != min) {
            int length = this.metrica.length - i3;
            if (min < i5) {
                int subscription = subscription(min);
                int subscription2 = subscription(i5);
                int i7 = this.billing;
                while (subscription < subscription2) {
                    int i8 = (subscription * 5) + 4;
                    int i9 = this.vip[i8];
                    if (!(i9 >= 0)) {
                        AbstractC1889e.ad("Unexpected anchor value, expected a positive anchor");
                    }
                    this.vip[i8] = -((length - i9) + 1);
                    subscription++;
                    if (subscription == i7) {
                        subscription += this.yandex;
                    }
                }
            } else {
                int subscription3 = subscription(i5);
                int subscription4 = subscription(min);
                while (subscription3 < subscription4) {
                    int i10 = (subscription3 * 5) + 4;
                    int i11 = this.vip[i10];
                    if (!(i11 < 0)) {
                        AbstractC1889e.ad("Unexpected anchor value, expected a negative anchor");
                    }
                    this.vip[i10] = i11 + length + 1;
                    subscription3++;
                    if (subscription3 == this.billing) {
                        subscription3 += this.yandex;
                    }
                }
            }
            this.smaato = min;
        }
        this.mopub = i;
    }

    public final int subscription(int i) {
        return (this.yandex * (i < this.billing ? 0 : 1)) + i;
    }

    public final boolean tapsense(int i, int i2) {
        int loadAd;
        int signatures;
        if (i2 == this.tapsense) {
            loadAd = this.signatures;
        } else {
            C2025e c2025e = this.Signature;
            if (i2 > c2025e.metrica(0)) {
                signatures = signatures(i2);
            } else {
                int[] iArr = c2025e.vip;
                int min = Math.min(iArr.length, c2025e.metrica);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    signatures = signatures(i2);
                } else {
                    loadAd = (loadAd() - this.yandex) - this.admob.vip[i3];
                }
            }
            loadAd = signatures + i2;
        }
        return i > i2 && i < loadAd;
    }

    /* renamed from: this, reason: not valid java name */
    public final boolean m3820this(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.license;
            premium(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.appmetrica;
                int i3 = i + i2;
                int vip = AbstractC2855e.vip(this.license, i3, loadAd() - this.yandex);
                if (vip >= this.license.size()) {
                    vip--;
                }
                int i4 = vip + 1;
                int i5 = 0;
                while (vip >= 0) {
                    C3155e c3155e = (C3155e) this.license.get(vip);
                    int metrica = metrica(c3155e);
                    if (metrica < i) {
                        break;
                    }
                    if (metrica < i3) {
                        c3155e.ad = RecyclerView.UNDEFINED_DURATION;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = vip + 1;
                        }
                        i4 = vip;
                    }
                    vip--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.license.subList(i4, i5).clear();
                }
            }
            this.billing = i;
            this.yandex += i2;
            int i6 = this.smaato;
            if (i6 > i) {
                this.smaato = Math.max(i, i6 - i2);
            }
            int i7 = this.signatures;
            if (i7 >= this.billing) {
                this.signatures = i7 - i2;
            }
            int i8 = this.tapsense;
            if (i8 >= 0 && (this.vip[(subscription(i8) * 5) + 1] & 67108864) != 0) {
                m3810case(i8);
            }
        }
        return r0;
    }

    /* renamed from: throw, reason: not valid java name */
    public final int m3821throw() {
        int subscription = subscription(this.pro);
        int ad = AbstractC2855e.ad(this.vip, subscription) + this.pro;
        this.pro = ad;
        this.startapp = billing(this.vip, subscription(ad));
        int i = this.vip[(subscription * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.pro + " end=" + this.signatures + " size = " + Signature() + " gap=" + this.billing + '-' + (this.billing + this.yandex) + ')';
    }

    /* renamed from: try, reason: not valid java name */
    public final int m3822try(int[] iArr, int i) {
        if (i >= loadAd()) {
            return this.metrica.length - this.advert;
        }
        int metrica = AbstractC2855e.metrica(iArr, i);
        return metrica < 0 ? (this.metrica.length - this.advert) + metrica + 1 : metrica;
    }

    public final C3155e vip(int i) {
        ArrayList arrayList = this.license;
        int purchase = AbstractC2855e.purchase(arrayList, i, Signature());
        if (purchase >= 0) {
            return (C3155e) arrayList.get(purchase);
        }
        if (i > this.billing) {
            i = -(Signature() - i);
        }
        C3155e c3155e = new C3155e(i);
        arrayList.add(-(purchase + 1), c3155e);
        return c3155e;
    }

    /* renamed from: while, reason: not valid java name */
    public final void m3823while() {
        int i = this.signatures;
        this.pro = i;
        this.startapp = billing(this.vip, subscription(i));
    }

    public final int yandex(int i) {
        return (this.advert * (i < this.mopub ? 0 : 1)) + i;
    }
}
