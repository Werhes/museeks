package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12478e extends AbstractC13717e {
    public static final int[] amazon = new int[0];
    public C11353e adcel;
    public int advert;
    public final Function1 appmetrica;
    public int billing;
    public int[] mopub;
    public final Function1 purchase;
    public boolean smaato;
    public ArrayList startapp;
    public C12618e yandex;

    public C12478e(long j, C11353e c11353e, Function1 function1, Function1 function12) {
        super(j, c11353e);
        this.appmetrica = function1;
        this.purchase = function12;
        this.adcel = C11353e.f22848e;
        this.mopub = amazon;
        this.advert = 1;
    }

    @Override // defpackage.AbstractC13717e
    public final void Signature() {
        int length = this.mopub.length;
        for (int i = 0; i < length; i++) {
            AbstractC12909e.tapsense(this.mopub[i]);
        }
        loadAd();
    }

    public final void ads(long j) {
        synchronized (AbstractC12909e.metrica) {
            this.adcel = this.adcel.adcel(j);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC13717e
    public void advert() {
        if (this.advert <= 0) {
            AbstractC6536e.ad("no pending nested snapshots");
        }
        int i = this.advert - 1;
        this.advert = i;
        if (i != 0 || this.smaato) {
            return;
        }
        C12618e inmobi = inmobi();
        if (inmobi != null) {
            if (this.smaato) {
                AbstractC6536e.vip("Unsupported operation on a snapshot that has been applied");
            }
            subs(null);
            long billing = billing();
            Object[] objArr = inmobi.vip;
            long[] jArr = inmobi.ad;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (AbstractC8618e appmetrica = ((InterfaceC17335e) objArr[(i2 << 3) + i4]).appmetrica(); appmetrica != null; appmetrica = appmetrica.vip) {
                                    long j2 = appmetrica.ad;
                                    if (j2 == billing || AbstractC13480e.ads(this.adcel, Long.valueOf(j2))) {
                                        C7983e c7983e = AbstractC12909e.ad;
                                        appmetrica.ad = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ad();
    }

    @Override // defpackage.AbstractC13717e
    public void amazon(InterfaceC17335e interfaceC17335e) {
        C12618e inmobi = inmobi();
        if (inmobi == null) {
            C12618e c12618e = AbstractC1710e.ad;
            inmobi = new C12618e();
            subs(inmobi);
        }
        inmobi.ad(interfaceC17335e);
    }

    public final AbstractC11912e applovin(long j, C12618e c12618e, HashMap hashMap, C11353e c11353e) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C11353e c11353e2;
        Object[] objArr;
        long[] jArr;
        C11353e c11353e3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        AbstractC8618e billing;
        C11353e startapp = license().adcel(billing()).startapp(this.adcel);
        Object[] objArr3 = c12618e.vip;
        long[] jArr3 = c12618e.ad;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC17335e interfaceC17335e = (InterfaceC17335e) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            AbstractC8618e appmetrica = interfaceC17335e.appmetrica();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            AbstractC8618e pro = AbstractC12909e.pro(appmetrica, j, c11353e);
                            if (pro == null) {
                                c11353e3 = startapp;
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                AbstractC8618e pro2 = AbstractC12909e.pro(appmetrica, billing(), startapp);
                                if (pro2 == null) {
                                    c11353e3 = startapp;
                                } else {
                                    c11353e3 = startapp;
                                    if (pro2.ad != 1 && !pro.equals(pro2)) {
                                        AbstractC8618e pro3 = AbstractC12909e.pro(appmetrica, billing(), license());
                                        if (pro3 == null) {
                                            AbstractC12909e.remoteconfig();
                                            throw null;
                                        }
                                        if (hashMap == null || (billing = (AbstractC8618e) hashMap.get(pro)) == null) {
                                            billing = interfaceC17335e.billing(pro2, pro, pro3);
                                        }
                                        if (billing == null) {
                                            return new C5834e(this);
                                        }
                                        if (!billing.equals(pro3)) {
                                            if (billing.equals(pro)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new C6571e(interfaceC17335e, pro.metrica(billing())));
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(interfaceC17335e);
                                                arrayList3 = arrayList6;
                                            } else {
                                                arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList3.add(!billing.equals(pro2) ? new C6571e(interfaceC17335e, billing) : new C6571e(interfaceC17335e, pro2.metrica(billing())));
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            c11353e3 = startapp;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        startapp = c11353e3;
                    }
                    c11353e2 = startapp;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    c11353e2 = startapp;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                startapp = c11353e2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            tapsense();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                C6571e c6571e = (C6571e) arrayList3.get(i5);
                InterfaceC17335e interfaceC17335e2 = (InterfaceC17335e) c6571e.f13544e;
                AbstractC8618e abstractC8618e = (AbstractC8618e) c6571e.f13543e;
                abstractC8618e.ad = j;
                synchronized (AbstractC12909e.metrica) {
                    abstractC8618e.vip = interfaceC17335e2.appmetrica();
                    interfaceC17335e2.yandex(abstractC8618e);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                c12618e.smaato((InterfaceC17335e) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.startapp;
            if (arrayList7 != null) {
                arrayList2 = AbstractC13480e.m3584final(arrayList7, arrayList2);
            }
            this.startapp = arrayList2;
        }
        return C2449e.metrica;
    }

    public C12478e crashlytics(Function1 function1, Function1 function12) {
        if (this.metrica) {
            AbstractC6536e.ad("Cannot use a disposed snapshot");
        }
        if (this.smaato && this.license < 0) {
            AbstractC6536e.vip("Unsupported operation on a disposed or applied snapshot");
        }
        ads(billing());
        Object obj = AbstractC12909e.metrica;
        synchronized (obj) {
            try {
                long j = AbstractC12909e.appmetrica;
                long j2 = 1;
                AbstractC12909e.appmetrica = j + j2;
                AbstractC12909e.license = AbstractC12909e.license.adcel(j);
                C11353e license = license();
                subscription(license.adcel(j));
                try {
                    C18140e c18140e = new C18140e(j, AbstractC12909e.license(license, billing() + j2, j), AbstractC12909e.mopub(function1, appmetrica(), true), AbstractC12909e.advert(function12, startapp()), this);
                    if (this.smaato || this.metrica) {
                        return c18140e;
                    }
                    long billing = billing();
                    synchronized (obj) {
                        long j3 = AbstractC12909e.appmetrica;
                        AbstractC12909e.appmetrica = j3 + j2;
                        remoteconfig(j3);
                        AbstractC12909e.license = AbstractC12909e.license.adcel(billing());
                        Unit unit = Unit.INSTANCE;
                    }
                    subscription(AbstractC12909e.license(license(), billing + j2, billing()));
                    return c18140e;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public C12618e inmobi() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC13717e
    /* renamed from: isPro, reason: merged with bridge method [inline-methods] */
    public Function1 appmetrica() {
        return this.appmetrica;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[LOOP:1: B:32:0x00ab->B:33:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:38:0x00bc, B:40:0x00cc, B:43:0x00d8, B:45:0x00e4, B:47:0x00ee, B:49:0x00f4, B:51:0x0103, B:57:0x0114, B:60:0x011e, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x0142, B:74:0x014a, B:76:0x014d, B:78:0x0151, B:80:0x0158, B:82:0x0164, B:88:0x010b), top: B:37:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:38:0x00bc, B:40:0x00cc, B:43:0x00d8, B:45:0x00e4, B:47:0x00ee, B:49:0x00f4, B:51:0x0103, B:57:0x0114, B:60:0x011e, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x0142, B:74:0x014a, B:76:0x014d, B:78:0x0151, B:80:0x0158, B:82:0x0164, B:88:0x010b), top: B:37:0x00bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.AbstractC11912e isVip() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12478e.isVip():eِۖٓ");
    }

    @Override // defpackage.AbstractC13717e
    public void metrica() {
        if (this.metrica) {
            return;
        }
        super.metrica();
        advert();
    }

    @Override // defpackage.AbstractC13717e
    public void mopub() {
        this.advert++;
    }

    public final void premium(C11353e c11353e) {
        synchronized (AbstractC12909e.metrica) {
            this.adcel = this.adcel.startapp(c11353e);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC13717e
    public void pro(int i) {
        this.billing = i;
    }

    @Override // defpackage.AbstractC13717e
    public boolean purchase() {
        return false;
    }

    @Override // defpackage.AbstractC13717e
    public AbstractC13717e signatures(Function1 function1) {
        if (this.metrica) {
            AbstractC6536e.ad("Cannot use a disposed snapshot");
        }
        if (this.smaato && this.license < 0) {
            AbstractC6536e.vip("Unsupported operation on a disposed or applied snapshot");
        }
        long billing = billing();
        ads(billing());
        Object obj = AbstractC12909e.metrica;
        synchronized (obj) {
            try {
                long j = AbstractC12909e.appmetrica;
                long j2 = 1;
                AbstractC12909e.appmetrica = j + j2;
                AbstractC12909e.license = AbstractC12909e.license.adcel(j);
                try {
                    C7824e c7824e = new C7824e(j, AbstractC12909e.license(license(), billing + j2, j), AbstractC12909e.mopub(function1, appmetrica(), true), this);
                    if (this.smaato || this.metrica) {
                        return c7824e;
                    }
                    long billing2 = billing();
                    synchronized (obj) {
                        long j3 = AbstractC12909e.appmetrica;
                        AbstractC12909e.appmetrica = j3 + j2;
                        remoteconfig(j3);
                        AbstractC12909e.license = AbstractC12909e.license.adcel(billing());
                        Unit unit = Unit.INSTANCE;
                    }
                    subscription(AbstractC12909e.license(license(), billing2 + j2, billing()));
                    return c7824e;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.AbstractC13717e
    public void smaato() {
        if (this.smaato || this.metrica) {
            return;
        }
        tapsense();
    }

    @Override // defpackage.AbstractC13717e
    public Function1 startapp() {
        return this.purchase;
    }

    public void subs(C12618e c12618e) {
        this.yandex = c12618e;
    }

    public final void tapsense() {
        long j;
        ads(billing());
        Unit unit = Unit.INSTANCE;
        if (this.smaato || this.metrica) {
            return;
        }
        long billing = billing();
        synchronized (AbstractC12909e.metrica) {
            long j2 = AbstractC12909e.appmetrica;
            j = 1;
            AbstractC12909e.appmetrica = j2 + j;
            remoteconfig(j2);
            AbstractC12909e.license = AbstractC12909e.license.adcel(billing());
        }
        subscription(AbstractC12909e.license(license(), billing + j, billing()));
    }

    @Override // defpackage.AbstractC13717e
    public final void vip() {
        AbstractC12909e.license = AbstractC12909e.license.billing(billing()).appmetrica(this.adcel);
    }

    @Override // defpackage.AbstractC13717e
    public int yandex() {
        return this.billing;
    }
}
