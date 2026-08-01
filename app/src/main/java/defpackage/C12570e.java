package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12570e extends AbstractC2832e implements InterfaceC16719e, InterfaceC1036e, InterfaceC6911e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f25183e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f25184e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public boolean f25185e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public Function1 f25186e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public Object f25187e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public boolean f25188e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C16446e f25191e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public float f25193e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public boolean f25197e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f25198e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public boolean f25200e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public float f25201e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public C16446e f25202e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f25204e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public Function1 f25205e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f25206e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public float f25209e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public boolean f25210e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f25212e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C11874e f25213e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public boolean f25214e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f25195e = Alert.DURATION_SHOW_INDEFINITELY;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f25207e = Alert.DURATION_SHOW_INDEFINITELY;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public int f25181e = 3;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public long f25182e = 0;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f25190e = true;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C10324e f25208e = new C10324e(this, 0);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C12431e f25199e = new C12431e(0, new C12570e[16]);

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public boolean f25196e = true;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public long f25203e = AbstractC2278e.vip(0, 0, 0, 0, 15);

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final C4562e f25194e = new C4562e(this, 1);

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final C4562e f25189e = new C4562e(this, 0);

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public long f25192e = 0;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final C4562e f25211e = new C4562e(this, 2);

    public C12570e(C11874e c11874e) {
        this.f25213e = c11874e;
    }

    @Override // defpackage.InterfaceC1036e
    public final C10324e ad() {
        return this.f25208e;
    }

    @Override // defpackage.InterfaceC16719e
    public final AbstractC2832e admob(long j) {
        int i;
        C11874e c11874e = this.f25213e;
        C13915e c13915e = c11874e.ad;
        C13915e c13915e2 = c11874e.ad;
        if (c13915e.f27614e == 3) {
            c13915e.appmetrica();
        }
        if (AbstractC2467e.startapp(c13915e2)) {
            C17596e c17596e = c11874e.admob;
            c17596e.f34460e = 3;
            c17596e.admob(j);
        }
        C13915e tapsense = c13915e2.tapsense();
        if (tapsense != null) {
            C11874e c11874e2 = tapsense.f27612e;
            if (this.f25181e != 3 && !c13915e2.f27608e) {
                AbstractC14070e.metrica("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int m2467class = AbstractC8703e.m2467class(c11874e2.license);
            if (m2467class != 0) {
                i = 2;
                if (m2467class != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC5087e.m1745default(c11874e2.license)));
                }
            } else {
                i = 1;
            }
            this.f25181e = i;
        } else {
            this.f25181e = 3;
        }
        m3357continue(j);
        return this;
    }

    @Override // defpackage.InterfaceC1036e
    public final int amazon() {
        return this.f25207e;
    }

    @Override // defpackage.InterfaceC1036e
    public final C14747e appmetrica() {
        return (C14747e) this.f25213e.ad.f27592e.license;
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: break */
    public final int mo1206break() {
        return this.f25213e.ad().mo1206break();
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: case */
    public final void mo1207case(long j, float f, C16446e c16446e) {
        m3360for(j, f, null, c16446e);
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: catch */
    public final void mo392catch(long j, float f, Function1 function1) {
        m3360for(j, f, function1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0065, B:28:0x007b, B:30:0x0098, B:31:0x009e, B:33:0x00aa, B:35:0x00b4, B:39:0x00c0, B:41:0x0076), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0065, B:28:0x007b, B:30:0x0098, B:31:0x009e, B:33:0x00aa, B:35:0x00b4, B:39:0x00c0, B:41:0x0076), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0065, B:28:0x007b, B:30:0x0098, B:31:0x009e, B:33:0x00aa, B:35:0x00b4, B:39:0x00c0, B:41:0x0076), top: B:2:0x0006 }] */
    /* renamed from: continue, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3357continue(long r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12570e.m3357continue(long):boolean");
    }

    @Override // defpackage.InterfaceC1036e
    public final void crashlytics() {
        boolean z;
        this.f25197e = true;
        C10324e c10324e = this.f25208e;
        c10324e.yandex();
        boolean z2 = this.f25200e;
        C11874e c11874e = this.f25213e;
        if (z2) {
            C12431e ads = c11874e.ad.ads();
            Object[] objArr = ads.f24870e;
            int i = ads.f24868e;
            for (int i2 = 0; i2 < i; i2++) {
                C13915e c13915e = (C13915e) objArr[i2];
                boolean subscription = c13915e.subscription();
                C11874e c11874e2 = c13915e.f27612e;
                if (subscription && c13915e.remoteconfig() == 1) {
                    C12570e c12570e = c11874e2.Signature;
                    C5602e c5602e = c12570e.f25184e ? new C5602e(c12570e.f6805e) : null;
                    if (c5602e != null) {
                        if (c13915e.f27614e == 3) {
                            c13915e.appmetrica();
                        }
                        z = c11874e2.Signature.m3357continue(c5602e.ad);
                    } else {
                        z = false;
                    }
                    if (z) {
                        C13915e.m3699strictfp(c11874e.ad, false, 7);
                    }
                }
            }
        }
        if (this.f25206e || (!this.f25183e && !appmetrica().f18514e && this.f25200e)) {
            this.f25200e = false;
            int i3 = c11874e.license;
            c11874e.license = 3;
            c11874e.billing(false);
            C13915e c13915e2 = c11874e.ad;
            C15087e snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e2)).getSnapshotObserver();
            snapshotObserver.ad.metrica(c13915e2, snapshotObserver.appmetrica, this.f25189e);
            c11874e.license = i3;
            this.f25206e = false;
        }
        if (c10324e.license) {
            c10324e.appmetrica = true;
        }
        if (c10324e.vip && c10324e.appmetrica()) {
            c10324e.billing();
        }
        this.f25197e = false;
    }

    /* renamed from: else, reason: not valid java name */
    public final void m3358else() {
        int i;
        C11874e c11874e = this.f25213e;
        C13915e.m3699strictfp(c11874e.ad, false, 7);
        C13915e c13915e = c11874e.ad;
        C13915e tapsense = c13915e.tapsense();
        if (tapsense == null || c13915e.f27614e != 3) {
            return;
        }
        int m2467class = AbstractC8703e.m2467class(tapsense.f27612e.license);
        if (m2467class != 0) {
            i = 2;
            if (m2467class != 2) {
                i = tapsense.f27614e;
            }
        } else {
            i = 1;
        }
        c13915e.f27614e = i;
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public final void m3359e() {
        C11874e c11874e = this.f25213e;
        C13915e c13915e = c11874e.ad;
        C13915e c13915e2 = c11874e.ad;
        if (!c13915e.m3724throw() || c11874e.advert <= 0) {
            return;
        }
        C11874e c11874e2 = c13915e2.f27612e;
        if ((c11874e2.adcel || c11874e2.mopub) && !c11874e2.Signature.f25200e) {
            c13915e2.m3716new(false);
        }
        C12431e ads = c13915e2.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            ((C13915e) objArr[i2]).f27612e.Signature.m3359e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003a, B:17:0x0043, B:18:0x0045, B:20:0x0049, B:22:0x004f, B:24:0x0057, B:26:0x0065, B:28:0x006d, B:29:0x0071, B:30:0x005b, B:31:0x0085, B:33:0x0089, B:35:0x008d, B:36:0x0092, B:40:0x001f, B:42:0x0023, B:44:0x0027, B:46:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003a, B:17:0x0043, B:18:0x0045, B:20:0x0049, B:22:0x004f, B:24:0x0057, B:26:0x0065, B:28:0x006d, B:29:0x0071, B:30:0x005b, B:31:0x0085, B:33:0x0089, B:35:0x008d, B:36:0x0092, B:40:0x001f, B:42:0x0023, B:44:0x0027, B:46:0x002b), top: B:2:0x0007 }] */
    /* renamed from: for, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3360for(long r9, float r11, kotlin.jvm.functions.Function1 r12, defpackage.C16446e r13) {
        /*
            r8 = this;
            eِٞؐ r0 = r8.f25213e
            eِٓؔ r1 = r0.ad
            eِٓؔ r2 = r0.ad
            r3 = 1
            r8.f25214e = r3     // Catch: java.lang.Throwable -> L1b
            long r4 = r8.f25182e     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.C11490e.vip(r9, r4)     // Catch: java.lang.Throwable -> L1b
            r5 = 0
            if (r4 == 0) goto L1f
            kotlin.jvm.functions.Function1 r4 = r8.f25186e     // Catch: java.lang.Throwable -> L1b
            if (r12 != r4) goto L1f
            boolean r4 = r8.f25210e     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2f
            goto L1f
        L1b:
            r0 = move-exception
            r9 = r0
            goto L9d
        L1f:
            boolean r4 = r0.mopub     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2b
            boolean r4 = r0.adcel     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2b
            boolean r4 = r8.f25210e     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2f
        L2b:
            r8.f25200e = r3     // Catch: java.lang.Throwable -> L1b
            r8.f25210e = r5     // Catch: java.lang.Throwable -> L1b
        L2f:
            eؙؙ٘ r4 = r0.admob     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L45
            eِٞؐ r6 = r4.f34480e     // Catch: java.lang.Throwable -> L1b
            int r4 = r4.f34463e     // Catch: java.lang.Throwable -> L1b
            r7 = 3
            if (r4 != r7) goto L45
            eِٓؔ r4 = r6.ad     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.AbstractC2467e.startapp(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L43
            goto L45
        L43:
            r6.metrica = r3     // Catch: java.lang.Throwable -> L1b
        L45:
            eؙؙ٘ r4 = r0.admob     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L85
            boolean r4 = r4.m4370private()     // Catch: java.lang.Throwable -> L1b
            if (r4 != r3) goto L85
            eْ٘ۧ r3 = r0.ad()     // Catch: java.lang.Throwable -> L1b
            eْ٘ۧ r3 = r3.f34794e     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L5b
            eّ٘ۧ r3 = r3.f18510e     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L65
        L5b:
            eٖۢۨ r3 = defpackage.AbstractC10501e.ad(r2)     // Catch: java.lang.Throwable -> L1b
            eٜؗؗ r3 = (defpackage.ViewTreeObserverOnGlobalLayoutListenerC5014e) r3     // Catch: java.lang.Throwable -> L1b
            eؕۢٓ r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L1b
        L65:
            eؙؙ٘ r4 = r0.admob     // Catch: java.lang.Throwable -> L1b
            eِٓؔ r2 = r2.tapsense()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L71
            eِٞؐ r2 = r2.f27612e     // Catch: java.lang.Throwable -> L1b
            r2.yandex = r5     // Catch: java.lang.Throwable -> L1b
        L71:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4.f34477e = r2     // Catch: java.lang.Throwable -> L1b
            r2 = 32
            long r5 = r9 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L1b
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L1b
            defpackage.AbstractC3698e.startapp(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L1b
        L85:
            eؙؙ٘ r0 = r0.admob     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L92
            boolean r0 = r0.f34459e     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L92
            java.lang.String r0 = "Error: Placement happened before lookahead."
            defpackage.AbstractC14070e.metrica(r0)     // Catch: java.lang.Throwable -> L1b
        L92:
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r2.m3365volatile(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L1b
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1b
            return
        L9d:
            r1.m3726transient(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12570e.m3360for(long, float, kotlin.jvm.functions.Function1, eٖۘؗ):void");
    }

    @Override // defpackage.InterfaceC1036e
    public final void inmobi(C17097e c17097e) {
        C12431e ads = this.f25213e.ad.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            c17097e.invoke(((C13915e) objArr[i2]).f27612e.Signature);
        }
    }

    @Override // defpackage.InterfaceC16719e
    public final int loadAd(int i) {
        C11874e c11874e = this.f25213e;
        if (AbstractC2467e.startapp(c11874e.ad)) {
            return c11874e.admob.loadAd(i);
        }
        m3358else();
        return c11874e.ad().loadAd(i);
    }

    @Override // defpackage.InterfaceC16719e
    public final int metrica(int i) {
        C11874e c11874e = this.f25213e;
        if (AbstractC2467e.startapp(c11874e.ad)) {
            return c11874e.admob.metrica(i);
        }
        m3358else();
        return c11874e.ad().metrica(i);
    }

    @Override // defpackage.InterfaceC6911e
    public final void premium(boolean z) {
        C11874e c11874e = this.f25213e;
        if (z != c11874e.ad().f18515e) {
            c11874e.ad().f18515e = z;
            this.f25210e = true;
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final List m3361private() {
        C11874e c11874e = this.f25213e;
        c11874e.ad.m3725throws();
        boolean z = this.f25196e;
        C12431e c12431e = this.f25199e;
        if (!z) {
            return c12431e.yandex();
        }
        C13915e c13915e = c11874e.ad;
        C12431e ads = c13915e.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            C13915e c13915e2 = (C13915e) objArr[i2];
            if (c12431e.f24868e <= i2) {
                c12431e.license(c13915e2.f27612e.Signature);
            } else {
                C12570e c12570e = c13915e2.f27612e.Signature;
                Object[] objArr2 = c12431e.f24870e;
                Object obj = objArr2[i2];
                objArr2[i2] = c12570e;
            }
        }
        c12431e.loadAd(((C12431e) ((C8794e) c13915e.loadAd()).f17708e).f24868e, c12431e.f24868e);
        this.f25196e = false;
        return c12431e.yandex();
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: protected */
    public final int mo1209protected() {
        return this.f25213e.ad().mo1209protected();
    }

    @Override // defpackage.InterfaceC1036e
    public final InterfaceC1036e purchase() {
        C11874e c11874e;
        C13915e tapsense = this.f25213e.ad.tapsense();
        if (tapsense == null || (c11874e = tapsense.f27612e) == null) {
            return null;
        }
        return c11874e.Signature;
    }

    @Override // defpackage.InterfaceC1036e
    public final void requestLayout() {
        this.f25213e.ad.m3716new(false);
    }

    /* renamed from: return, reason: not valid java name */
    public final void m3362return() {
        if (this.f25204e) {
            this.f25204e = false;
            C11874e c11874e = this.f25213e;
            C13915e c13915e = c11874e.ad;
            C13915e c13915e2 = c11874e.ad;
            ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getRectManager().purchase(c13915e2);
            C14742e c14742e = c13915e2.f27592e;
            AbstractC17732e abstractC17732e = ((C14747e) c14742e.license).f34777e;
            for (AbstractC17732e abstractC17732e2 = (AbstractC17732e) c14742e.appmetrica; !AbstractC7890e.billing(abstractC17732e2, abstractC17732e) && abstractC17732e2 != null; abstractC17732e2 = abstractC17732e2.f34777e) {
                abstractC17732e2.m4400e();
                abstractC17732e2.m4389e();
            }
            C12431e ads = c13915e2.ads();
            Object[] objArr = ads.f24870e;
            int i = ads.f24868e;
            for (int i2 = 0; i2 < i; i2++) {
                ((C13915e) objArr[i2]).f27612e.Signature.m3362return();
            }
        }
    }

    @Override // defpackage.AbstractC2832e, defpackage.InterfaceC16719e
    public final Object signatures() {
        return this.f25187e;
    }

    @Override // defpackage.InterfaceC16719e
    public final int smaato(int i) {
        C11874e c11874e = this.f25213e;
        if (AbstractC2467e.startapp(c11874e.ad)) {
            return c11874e.admob.smaato(i);
        }
        m3358else();
        return c11874e.ad().smaato(i);
    }

    /* renamed from: static, reason: not valid java name */
    public final void m3363static() {
        boolean z = this.f25204e;
        this.f25204e = true;
        C11874e c11874e = this.f25213e;
        C13915e c13915e = c11874e.ad;
        C14742e c14742e = c13915e.f27592e;
        if (!z) {
            ((C14747e) c14742e.license).m4415e();
            ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getRectManager().appmetrica(c11874e.ad);
            if (c13915e.subscription()) {
                C13915e.m3699strictfp(c13915e, true, 6);
            } else if (c13915e.f27612e.appmetrica) {
                C13915e.m3700super(c13915e, true, 6);
            }
        }
        AbstractC17732e abstractC17732e = ((C14747e) c14742e.license).f34777e;
        for (AbstractC17732e abstractC17732e2 = (AbstractC17732e) c14742e.appmetrica; !AbstractC7890e.billing(abstractC17732e2, abstractC17732e) && abstractC17732e2 != null; abstractC17732e2 = abstractC17732e2.f34777e) {
            if (abstractC17732e2.f34775e) {
                abstractC17732e2.m4404e();
            }
        }
        C12431e ads = c13915e.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            C13915e c13915e2 = (C13915e) objArr[i2];
            if (c13915e2.isVip() != Integer.MAX_VALUE) {
                c13915e2.f27612e.Signature.m3363static();
                C13915e.m3698private(c13915e2);
            }
        }
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m3364switch() {
        this.f25188e = true;
        C11874e c11874e = this.f25213e;
        C13915e tapsense = c11874e.ad.tapsense();
        float f = appmetrica().f34786e;
        C13915e c13915e = c11874e.ad;
        C14742e c14742e = c13915e.f27592e;
        AbstractC17732e abstractC17732e = (AbstractC17732e) c14742e.appmetrica;
        C14747e c14747e = (C14747e) c14742e.license;
        while (abstractC17732e != c14747e) {
            C9157e c9157e = (C9157e) abstractC17732e;
            f += c9157e.f34786e;
            abstractC17732e = c9157e.f34777e;
        }
        if (f != this.f25201e) {
            this.f25201e = f;
            if (tapsense != null) {
                tapsense.m3706default();
            }
            if (tapsense != null) {
                tapsense.firebase();
            }
        }
        if (!appmetrica().f18514e) {
            boolean z = this.f25204e;
            if (!z || this.f25208e.license()) {
                m3363static();
            }
            if (z) {
                ((C14747e) c13915e.f27592e.license).m4415e();
            } else {
                if (tapsense != null) {
                    tapsense.firebase();
                }
                if (this.f25212e && tapsense != null) {
                    tapsense.m3716new(false);
                }
            }
        }
        if (tapsense != null) {
            C11874e c11874e2 = tapsense.f27612e;
            if (!this.f25212e && c11874e2.license == 3) {
                if (this.f25207e != Integer.MAX_VALUE) {
                    AbstractC14070e.metrica("Place was called on a node which was placed already");
                }
                int i = c11874e2.startapp;
                this.f25207e = i;
                c11874e2.startapp = i + 1;
            }
        } else {
            this.f25207e = 0;
        }
        crashlytics();
    }

    @Override // defpackage.InterfaceC1036e
    /* renamed from: throw */
    public final void mo449throw() {
        C13915e.m3699strictfp(this.f25213e.ad, false, 7);
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: try */
    public final int mo393try(AbstractC17016e abstractC17016e) {
        C11874e c11874e = this.f25213e;
        C13915e tapsense = c11874e.ad.tapsense();
        int i = tapsense != null ? tapsense.f27612e.license : 0;
        C10324e c10324e = this.f25208e;
        if (i == 1) {
            c10324e.metrica = true;
        } else {
            C13915e tapsense2 = c11874e.ad.tapsense();
            if ((tapsense2 != null ? tapsense2.f27612e.license : 0) == 3) {
                c10324e.license = true;
            }
        }
        this.f25183e = true;
        int mo393try = c11874e.ad().mo393try(abstractC17016e);
        this.f25183e = false;
        return mo393try;
    }

    /* renamed from: volatile, reason: not valid java name */
    public final void m3365volatile(long j, float f, Function1 function1, C16446e c16446e) {
        C11874e c11874e = this.f25213e;
        C13915e c13915e = c11874e.ad;
        C13915e c13915e2 = c11874e.ad;
        if (c13915e.f27620e) {
            AbstractC14070e.ad("place is called on a deactivated node");
        }
        c11874e.license = 3;
        this.f25182e = j;
        this.f25193e = f;
        this.f25186e = function1;
        this.f25191e = c16446e;
        this.f25188e = false;
        InterfaceC16590e ad = AbstractC10501e.ad(c13915e2);
        if (this.f25200e || !this.f25204e) {
            this.f25208e.billing = false;
            c11874e.purchase(false);
            this.f25205e = function1;
            this.f25192e = j;
            this.f25209e = f;
            this.f25202e = c16446e;
            C15087e snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) ad).getSnapshotObserver();
            snapshotObserver.ad.metrica(c13915e2, snapshotObserver.purchase, this.f25211e);
        } else {
            AbstractC17732e ad2 = c11874e.ad();
            ad2.m4397e(C11490e.license(j, ad2.f6802e), f, function1, c16446e);
            m3364switch();
        }
        c11874e.license = 5;
        if (c11874e.ad().f18514e && (c11874e.mopub || c11874e.adcel)) {
            requestLayout();
        }
        this.f25198e = true;
    }

    @Override // defpackage.InterfaceC16719e
    /* renamed from: while */
    public final int mo2529while(int i) {
        C11874e c11874e = this.f25213e;
        if (AbstractC2467e.startapp(c11874e.ad)) {
            return c11874e.admob.mo2529while(i);
        }
        m3358else();
        return c11874e.ad().mo2529while(i);
    }
}
