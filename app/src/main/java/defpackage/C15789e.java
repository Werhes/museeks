package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۡٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15789e implements InterfaceC1272e {

    /* renamed from: protected, reason: not valid java name */
    public static final C16975e f31092protected;

    /* renamed from: try, reason: not valid java name */
    public static final byte[] f31093try = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public final C13207e Signature;
    public final InterfaceC7854e ad;
    public final C8010e adcel;
    public C1410e admob;
    public long ads;
    public long applovin;

    /* renamed from: class, reason: not valid java name */
    public boolean f31094class;
    public int crashlytics;

    /* renamed from: extends, reason: not valid java name */
    public boolean f31095extends;
    public int firebase;

    /* renamed from: goto, reason: not valid java name */
    public InterfaceC5483e f31096goto;
    public int inmobi;

    /* renamed from: interface, reason: not valid java name */
    public boolean f31097interface;
    public long isPro;
    public long isVip;
    public final C17790e loadAd;
    public final List metrica;

    /* renamed from: native, reason: not valid java name */
    public InterfaceC18147e[] f31098native;
    public C18407e premium;
    public long pro;
    public int remoteconfig;
    public int signatures;
    public final C1292e startapp;
    public int subs;
    public int subscription;
    public C1292e tapsense;

    /* renamed from: this, reason: not valid java name */
    public InterfaceC18147e[] f31099this;

    /* renamed from: throw, reason: not valid java name */
    public boolean f31100throw;
    public final int vip;

    /* renamed from: while, reason: not valid java name */
    public long f31101while;
    public final byte[] yandex;
    public final C17424e mopub = new C17424e(18);
    public final C1292e advert = new C1292e(16);
    public final C1292e appmetrica = new C1292e(AbstractC17595e.ad);
    public final C1292e purchase = new C1292e(6);
    public final C1292e billing = new C1292e();
    public final ArrayDeque smaato = new ArrayDeque();
    public final ArrayDeque amazon = new ArrayDeque();
    public final SparseArray license = new SparseArray();

    static {
        C11445e c11445e = new C11445e();
        c11445e.amazon = AbstractC8542e.amazon("application/x-emsg");
        f31092protected = new C16975e(c11445e);
    }

    public C15789e(InterfaceC7854e interfaceC7854e, int i, C8010e c8010e, List list) {
        this.ad = interfaceC7854e;
        this.vip = i;
        this.adcel = c8010e;
        this.metrica = DesugarCollections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.yandex = bArr;
        this.startapp = new C1292e(bArr);
        C2171e c2171e = AbstractC17475e.f34223e;
        this.admob = C1410e.f4222e;
        this.applovin = -9223372036854775807L;
        this.isPro = -9223372036854775807L;
        this.ads = -9223372036854775807L;
        this.f31096goto = InterfaceC5483e.isVip;
        this.f31099this = new InterfaceC18147e[0];
        this.f31098native = new InterfaceC18147e[0];
        this.loadAd = new C17790e(new C17687e(6, this));
        this.Signature = new C13207e(0);
        this.f31101while = -1L;
    }

    public static Pair adcel(long j, C1292e c1292e) {
        long m566interface;
        long m566interface2;
        C1292e c1292e2 = c1292e;
        c1292e2.m571try(8);
        int appmetrica = AbstractC11004e.appmetrica(c1292e2.smaato());
        c1292e2.m568protected(4);
        long subs = c1292e2.subs();
        if (appmetrica == 0) {
            m566interface = c1292e2.subs();
            m566interface2 = c1292e2.subs();
        } else {
            m566interface = c1292e2.m566interface();
            m566interface2 = c1292e2.m566interface();
        }
        long j2 = m566interface2 + j;
        String str = AbstractC9413e.ad;
        long m2555import = AbstractC9413e.m2555import(m566interface, 1000000L, subs, RoundingMode.DOWN);
        c1292e2.m568protected(2);
        int m565goto = c1292e2.m565goto();
        int[] iArr = new int[m565goto];
        long[] jArr = new long[m565goto];
        long[] jArr2 = new long[m565goto];
        long[] jArr3 = new long[m565goto];
        long j3 = j2;
        long j4 = m2555import;
        int i = 0;
        while (i < m565goto) {
            int smaato = c1292e2.smaato();
            if ((Integer.MIN_VALUE & smaato) != 0) {
                throw C15125e.ad(null, "Unhandled indirect reference");
            }
            long subs2 = c1292e2.subs();
            iArr[i] = smaato & Alert.DURATION_SHOW_INDEFINITELY;
            jArr[i] = j3;
            jArr3[i] = j4;
            m566interface += subs2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long m2555import2 = AbstractC9413e.m2555import(m566interface, 1000000L, subs, RoundingMode.DOWN);
            jArr4[i] = m2555import2 - jArr5[i];
            c1292e2.m568protected(4);
            j3 += iArr[i];
            i++;
            m565goto = m565goto;
            c1292e2 = c1292e;
            j4 = m2555import2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(m2555import), new C13000e(iArr, jArr, jArr2, jArr3));
    }

    public static void startapp(C1292e c1292e, int i, C3301e c3301e) {
        c1292e.m571try(i + 8);
        int smaato = c1292e.smaato();
        byte[] bArr = AbstractC11004e.ad;
        if ((smaato & 1) != 0) {
            throw C15125e.metrica("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (smaato & 2) != 0;
        int firebase = c1292e.firebase();
        if (firebase == 0) {
            Arrays.fill(c3301e.advert, 0, c3301e.appmetrica, false);
            return;
        }
        int i2 = c3301e.appmetrica;
        C1292e c1292e2 = c3301e.amazon;
        if (firebase != i2) {
            StringBuilder premium = AbstractC4653e.premium("Senc sample count ", firebase, " is different from fragment sample count");
            premium.append(c3301e.appmetrica);
            throw C15125e.ad(null, premium.toString());
        }
        Arrays.fill(c3301e.advert, 0, firebase, z);
        c1292e2.m564extends(c1292e.ad());
        c3301e.mopub = true;
        c3301e.loadAd = true;
        c1292e.mopub(0, c1292e2.metrica, c1292e2.ad);
        c1292e2.m571try(0);
        c3301e.loadAd = false;
    }

    public static C9284e yandex(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C18375e c18375e = (C18375e) list.get(i);
            if (c18375e.f19062e == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c18375e.f36046e.ad;
                C9556e purchase = AbstractC0436e.purchase(bArr);
                UUID uuid = purchase == null ? null : (UUID) purchase.f18968e;
                if (uuid == null) {
                    AbstractC2803e.smaato("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C14290e(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C9284e(null, false, (C14290e[]) arrayList.toArray(new C14290e[0]));
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        return this.admob;
    }

    public final void billing() {
        this.subscription = 0;
        this.signatures = 0;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        SparseArray sparseArray = this.license;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C18407e) sparseArray.valueAt(i)).appmetrica();
        }
        this.amazon.clear();
        this.inmobi = 0;
        ((PriorityQueue) this.loadAd.f34884e).clear();
        this.isPro = j2;
        this.smaato.clear();
        billing();
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        C1410e c1410e;
        InterfaceC5204e mopub = AbstractC5418e.mopub(interfaceC2283e, true, false);
        if (mopub != null) {
            c1410e = AbstractC17475e.ads(mopub);
        } else {
            C2171e c2171e = AbstractC17475e.f34223e;
            c1410e = C1410e.f4222e;
        }
        this.admob = c1410e;
        return mopub == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:409:0x0808, code lost:
    
        billing();
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x080b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x042a, code lost:
    
        if ((defpackage.AbstractC9413e.m2555import(r39, 1000000, r7, r45) + defpackage.AbstractC9413e.m2555import(r8[0], 1000000, r4.metrica, r45)) >= r4.appmetrica) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0724  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mopub(long r55) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15789e.mopub(long):void");
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        int i;
        int i2 = this.vip;
        if ((i2 & 32) == 0) {
            interfaceC5483e = new C5609e(interfaceC5483e, this.ad);
        }
        this.f31096goto = interfaceC5483e;
        billing();
        InterfaceC18147e[] interfaceC18147eArr = new InterfaceC18147e[2];
        this.f31099this = interfaceC18147eArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            interfaceC18147eArr[0] = this.f31096goto.Signature(100, 5);
            i = 1;
            i3 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        } else {
            i = 0;
        }
        InterfaceC18147e[] interfaceC18147eArr2 = (InterfaceC18147e[]) AbstractC9413e.m2552final(i, this.f31099this);
        this.f31099this = interfaceC18147eArr2;
        for (InterfaceC18147e interfaceC18147e : interfaceC18147eArr2) {
            interfaceC18147e.billing(f31092protected);
        }
        List list = this.metrica;
        this.f31098native = new InterfaceC18147e[list.size()];
        while (i4 < this.f31098native.length) {
            InterfaceC18147e Signature = this.f31096goto.Signature(i3, 3);
            Signature.billing((C16975e) list.get(i4));
            this.f31098native[i4] = Signature;
            i4++;
            i3++;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0735, code lost:
    
        throw defpackage.C15125e.metrica("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x00ce, code lost:
    
        r5 = r2.ad;
        r6 = r2.vip;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x00db, code lost:
    
        if (r32.subscription != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x00df, code lost:
    
        if (r2.smaato != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x00e1, code lost:
    
        r9 = r2.license.license[r2.purchase];
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x00f0, code lost:
    
        r32.subs = r9;
        r9 = r2.license.ad.billing;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x00fe, code lost:
    
        if (j$.util.Objects.equals(r9.loadAd, "video/avc") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0102, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0104, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0117, code lost:
    
        r32.f31094class = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x011f, code lost:
    
        if (r2.purchase >= r2.startapp) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0121, code lost:
    
        r0.amazon(r32.subs);
        r0 = r2.vip();
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x012a, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x012d, code lost:
    
        r3 = r6.amazon;
        r0 = r0.license;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0131, code lost:
    
        if (r0 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0133, code lost:
    
        r3.m568protected(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0136, code lost:
    
        r0 = r2.purchase;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x013a, code lost:
    
        if (r6.mopub == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0140, code lost:
    
        if (r6.advert[r0] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0142, code lost:
    
        r3.m568protected(r3.m565goto() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x014e, code lost:
    
        if (r2.metrica() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0150, code lost:
    
        r32.premium = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0153, code lost:
    
        r32.subscription = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0156, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x015f, code lost:
    
        if (r2.license.ad.yandex != r21) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0161, code lost:
    
        r32.subs -= 8;
        r0.amazon(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x017a, code lost:
    
        if ("audio/ac4".equals(r2.license.ad.billing.loadAd) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x017c, code lost:
    
        r32.crashlytics = r2.license(r32.subs, 7);
        defpackage.AbstractC5418e.license(r32.subs, r8);
        r5.appmetrica(7, r8);
        r32.crashlytics += 7;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x019f, code lost:
    
        r32.subs += r32.crashlytics;
        r32.subscription = 4;
        r32.firebase = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0195, code lost:
    
        r8 = 0;
        r32.crashlytics = r2.license(r32.subs, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0107, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0110, code lost:
    
        if (j$.util.Objects.equals(r9.loadAd, "video/hevc") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0114, code lost:
    
        if ((r4 & 128) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x00ea, code lost:
    
        r9 = r6.yandex[r2.purchase];
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x01aa, code lost:
    
        r4 = r2.license;
        r8 = r4.ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x01b0, code lost:
    
        if (r2.smaato != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x01b2, code lost:
    
        r15 = r4.purchase[r2.purchase];
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01b8, code lost:
    
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x01c1, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x01c3, code lost:
    
        r12 = r14.ad(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x01c7, code lost:
    
        r4 = r8.mopub;
        r8 = r8.billing;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x01cb, code lost:
    
        if (r4 == 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x01cd, code lost:
    
        r9 = r32.purchase;
        r15 = r9.ad;
        r15[0] = 0;
        r15[1] = 0;
        r15[r20] = 0;
        r6 = 4 - r4;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x01df, code lost:
    
        r22 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x01e5, code lost:
    
        if (r32.crashlytics >= r32.subs) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x01e7, code lost:
    
        r2 = r32.firebase;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x01e9, code lost:
    
        if (r2 != 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x01ee, code lost:
    
        if (r32.f31098native.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x01f2, code lost:
    
        if (r32.f31094class != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0209, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x020a, code lost:
    
        r0.readFully(r15, r6, r22 + r2);
        r9.m571try(0);
        r19 = r9.smaato();
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0217, code lost:
    
        if (r19 < 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0219, code lost:
    
        r32.firebase = r19 - r2;
        r4 = r32.appmetrica;
        r26 = r6;
        r4.m571try(0);
        r5.appmetrica(4, r4);
        r32.crashlytics += 4;
        r32.subs += r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0237, code lost:
    
        if (r32.f31098native.length <= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0239, code lost:
    
        if (r2 <= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x023b, code lost:
    
        r4 = defpackage.AbstractC17595e.billing(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x023f, code lost:
    
        if (r4 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0246, code lost:
    
        switch(r4.hashCode()) {
            case -1662541442: goto L130;
            case 1331836730: goto L126;
            case 1331856911: goto L122;
            default: goto L121;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0249, code lost:
    
        r4 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0268, code lost:
    
        switch(r4) {
            case 0: goto L142;
            case 1: goto L139;
            case 2: goto L136;
            default: goto L145;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0277, code lost:
    
        if (((r15[5] & 248) >> 3) != 23) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0294, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0297, code lost:
    
        r32.f31097interface = r4;
        r5.appmetrica(r2, r9);
        r32.crashlytics += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x02a1, code lost:
    
        if (r2 <= 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x02a5, code lost:
    
        if (r32.f31094class != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x02ab, code lost:
    
        if (defpackage.AbstractC17595e.yandex(r15, r2, r8) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x02ad, code lost:
    
        r32.f31094class = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x02b0, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x02b2, code lost:
    
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0282, code lost:
    
        if ((r15[4] & 31) != 6) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0292, code lost:
    
        if (((r15[4] & 126) >> 1) != 39) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0251, code lost:
    
        if (r4.equals("video/vvc") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0254, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x025b, code lost:
    
        if (r4.equals("video/avc") != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x025e, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0264, code lost:
    
        if (r4.equals("video/hevc") != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0267, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0296, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x02bd, code lost:
    
        throw defpackage.C15125e.ad(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x01f4, code lost:
    
        r2 = defpackage.AbstractC17595e.adcel(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0204, code lost:
    
        if ((r22 + r2) > (r32.subs - r32.crashlytics)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0206, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x02be, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x02c2, code lost:
    
        if (r32.f31097interface == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x02c4, code lost:
    
        r4 = r32.billing;
        r4.m564extends(r2);
        r25 = r9;
        r0.readFully(r4.ad, 0, r32.firebase);
        r5.appmetrica(r32.firebase, r4);
        r2 = r32.firebase;
        r2 = defpackage.AbstractC17595e.subscription(r4.metrica, r4.ad);
        r4.m571try(0);
        r4.m572while(r2);
        r2 = r8.admob;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x02ed, code lost:
    
        if (r2 != (-1)) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x02f1, code lost:
    
        if (r7.f34880e == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x02f3, code lost:
    
        r7.m4435try(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x02fe, code lost:
    
        r7.ad(r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0308, code lost:
    
        if ((r17.ad() & 4) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x030a, code lost:
    
        r7.adcel(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x030d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0318, code lost:
    
        r32.crashlytics += r2;
        r32.firebase -= r2;
        r4 = r22;
        r9 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x02f9, code lost:
    
        if (r7.f34880e == r2) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x02fb, code lost:
    
        r7.m4435try(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0310, code lost:
    
        r25 = r9;
        r2 = r5.purchase(r0, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x033b, code lost:
    
        r0 = r17.ad();
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0341, code lost:
    
        if (r32.f31094class != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0343, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0346, code lost:
    
        r28 = r0;
        r0 = r17.vip();
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x034c, code lost:
    
        if (r0 == null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x034e, code lost:
    
        r31 = r0.metrica;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0355, code lost:
    
        r26 = r12;
        r5.ad(r26, r28, r32.subs, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0366, code lost:
    
        if (r3.isEmpty() != false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0368, code lost:
    
        r0 = (defpackage.C7455e) r3.removeFirst();
        r32.inmobi -= r0.metrica;
        r4 = r0.ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0379, code lost:
    
        if (r0.vip == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x037b, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x037d, code lost:
    
        if (r14 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x037f, code lost:
    
        r4 = r14.ad(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0383, code lost:
    
        r7 = r4;
        r2 = r32.f31099this;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0388, code lost:
    
        if (r5 >= r4) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x038a, code lost:
    
        r2[r5].ad(r7, 1, r0.metrica, r32.inmobi, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x039c, code lost:
    
        if (r17.metrica() != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x039e, code lost:
    
        r32.premium = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x03a1, code lost:
    
        r32.subscription = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x03a6, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0353, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0327, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0329, code lost:
    
        r2 = r32.crashlytics;
        r4 = r32.subs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x032d, code lost:
    
        if (r2 >= r4) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x032f, code lost:
    
        r32.crashlytics += r5.purchase(r0, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x01ba, code lost:
    
        r15 = r6.startapp[r2.purchase];
     */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r33, defpackage.C14829e r34) {
        /*
            Method dump skipped, instructions count: 2376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15789e.vip(eَؔؐ, eٜٔؓ):int");
    }
}
