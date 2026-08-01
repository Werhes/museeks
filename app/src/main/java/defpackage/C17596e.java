package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17596e extends AbstractC2832e implements InterfaceC16719e, InterfaceC1036e, InterfaceC6911e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f34458e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f34459e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C5602e f34462e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C16446e f34464e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Function1 f34466e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public boolean f34467e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f34471e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public Object f34472e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public boolean f34473e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f34479e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C11874e f34480e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f34468e = Alert.DURATION_SHOW_INDEFINITELY;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f34477e = Alert.DURATION_SHOW_INDEFINITELY;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f34460e = 3;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public long f34465e = 0;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f34463e = 3;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C10324e f34475e = new C10324e(this, 1);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C12431e f34481e = new C12431e(0, new C17596e[16]);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public boolean f34461e = true;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0985e f34476e = new C0985e(this, 0);

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public boolean f34478e = true;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public long f34469e = AbstractC2278e.vip(0, 0, 0, 0, 15);

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C0985e f34470e = new C0985e(this, 2);

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final C0985e f34474e = new C0985e(this, 1);

    public C17596e(C11874e c11874e) {
        this.f34480e = c11874e;
        this.f34472e = c11874e.Signature.f25187e;
    }

    @Override // defpackage.InterfaceC1036e
    public final C10324e ad() {
        return this.f34475e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.f27612e.license : 0) == 4) goto L14;
     */
    @Override // defpackage.InterfaceC16719e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC2832e admob(long r7) {
        /*
            r6 = this;
            eِٞؐ r0 = r6.f34480e
            eِٓؔ r1 = r0.ad
            eِٓؔ r2 = r0.ad
            eِٓؔ r1 = r1.tapsense()
            r3 = 0
            if (r1 == 0) goto L12
            eِٞؐ r1 = r1.f27612e
            int r1 = r1.license
            goto L13
        L12:
            r1 = r3
        L13:
            r4 = 2
            if (r1 == r4) goto L25
            eِٓؔ r1 = r2.tapsense()
            if (r1 == 0) goto L21
            eِٞؐ r1 = r1.f27612e
            int r1 = r1.license
            goto L22
        L21:
            r1 = r3
        L22:
            r5 = 4
            if (r1 != r5) goto L27
        L25:
            r0.vip = r3
        L27:
            eِٓؔ r0 = r2.tapsense()
            r1 = 3
            if (r0 == 0) goto L64
            eِٞؐ r0 = r0.f27612e
            int r3 = r6.f34460e
            if (r3 == r1) goto L3e
            boolean r3 = r2.f27608e
            if (r3 == 0) goto L39
            goto L3e
        L39:
            java.lang.String r3 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.AbstractC14070e.metrica(r3)
        L3e:
            int r3 = r0.license
            int r3 = defpackage.AbstractC8703e.m2467class(r3)
            r5 = 1
            if (r3 == 0) goto L60
            if (r3 == r5) goto L60
            if (r3 == r4) goto L61
            if (r3 != r1) goto L4e
            goto L61
        L4e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            int r8 = r0.license
            java.lang.String r8 = defpackage.AbstractC5087e.m1745default(r8)
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            java.lang.String r8 = r0.concat(r8)
            r7.<init>(r8)
            throw r7
        L60:
            r4 = r5
        L61:
            r6.f34460e = r4
            goto L66
        L64:
            r6.f34460e = r1
        L66:
            int r0 = r2.f27614e
            if (r0 != r1) goto L6d
            r2.appmetrica()
        L6d:
            r6.m4367continue(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17596e.admob(long):eؔۚؓ");
    }

    @Override // defpackage.InterfaceC1036e
    public final int amazon() {
        return this.f34477e;
    }

    @Override // defpackage.InterfaceC1036e
    public final C14747e appmetrica() {
        return (C14747e) this.f34480e.ad.f27592e.license;
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: break */
    public final int mo1206break() {
        return this.f34480e.ad().mo2526e().mo1206break();
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: case */
    public final void mo1207case(long j, float f, C16446e c16446e) {
        m4369for(j, c16446e, null);
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: catch */
    public final void mo392catch(long j, float f, Function1 function1) {
        m4369for(j, null, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* renamed from: continue, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4367continue(long r13) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17596e.m4367continue(long):boolean");
    }

    @Override // defpackage.InterfaceC1036e
    public final void crashlytics() {
        this.f34473e = true;
        C10324e c10324e = this.f34475e;
        c10324e.yandex();
        C11874e c11874e = this.f34480e;
        boolean z = c11874e.purchase;
        C13915e c13915e = c11874e.ad;
        if (z) {
            C12431e ads = c13915e.ads();
            Object[] objArr = ads.f24870e;
            int i = ads.f24868e;
            for (int i2 = 0; i2 < i; i2++) {
                C13915e c13915e2 = (C13915e) objArr[i2];
                if (c13915e2.f27612e.appmetrica && c13915e2.pro() == 1) {
                    C17596e c17596e = c13915e2.f27612e.admob;
                    if (c17596e.m4367continue((c17596e != null ? c17596e.f34462e : null).ad)) {
                        C13915e.m3700super(c13915e, false, 7);
                    }
                }
            }
        }
        C12009e c12009e = appmetrica().f29168e;
        if (c11874e.billing || (!this.f34471e && !c12009e.f18514e && c11874e.purchase)) {
            c11874e.purchase = false;
            int i3 = c11874e.license;
            c11874e.license = 4;
            c11874e.startapp(false);
            C15087e snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getSnapshotObserver();
            snapshotObserver.ad.metrica(c13915e, snapshotObserver.yandex, this.f34476e);
            c11874e.license = i3;
            if (c11874e.smaato && c12009e.f18514e) {
                requestLayout();
            }
            c11874e.billing = false;
        }
        if (c10324e.license) {
            c10324e.appmetrica = true;
        }
        if (c10324e.vip && c10324e.appmetrica()) {
            c10324e.billing();
        }
        this.f34473e = false;
    }

    /* renamed from: else, reason: not valid java name */
    public final void m4368else() {
        C11874e c11874e = this.f34480e;
        if (c11874e.loadAd > 0) {
            C12431e ads = c11874e.ad.ads();
            Object[] objArr = ads.f24870e;
            int i = ads.f24868e;
            for (int i2 = 0; i2 < i; i2++) {
                C13915e c13915e = (C13915e) objArr[i2];
                C11874e c11874e2 = c13915e.f27612e;
                if ((c11874e2.smaato || c11874e2.amazon) && !c11874e2.purchase) {
                    c13915e.m3709final(false);
                }
                C17596e c17596e = c11874e2.admob;
                if (c17596e != null) {
                    c17596e.m4368else();
                }
            }
        }
    }

    /* renamed from: for, reason: not valid java name */
    public final void m4369for(long j, C16446e c16446e, Function1 function1) {
        C11874e c11874e = this.f34480e;
        C13915e c13915e = c11874e.ad;
        C13915e c13915e2 = c11874e.ad;
        try {
            C13915e tapsense = c13915e.tapsense();
            if ((tapsense != null ? tapsense.f27612e.license : 0) == 4) {
                c11874e.metrica = false;
            }
            if (c13915e2.f27620e) {
                AbstractC14070e.ad("place is called on a deactivated node");
            }
            c11874e.license = 4;
            boolean z = true;
            this.f34459e = true;
            this.f34467e = false;
            if (!C11490e.vip(j, this.f34465e)) {
                if (c11874e.amazon || c11874e.smaato) {
                    c11874e.purchase = true;
                }
                m4368else();
            }
            InterfaceC16590e ad = AbstractC10501e.ad(c13915e2);
            this.f34465e = j;
            if (!c11874e.purchase) {
                if (this.f34463e == 3) {
                    z = false;
                }
                if (z) {
                    AbstractC4134e mo2526e = c11874e.ad().mo2526e();
                    mo2526e.m1464e(C11490e.license(j, mo2526e.f6802e));
                    m4374volatile();
                    this.f34466e = function1;
                    this.f34464e = c16446e;
                    c11874e.license = 5;
                    Unit unit = Unit.INSTANCE;
                }
            }
            c11874e.yandex(false);
            this.f34475e.billing = false;
            C15087e snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) ad).getSnapshotObserver();
            snapshotObserver.ad.metrica(c13915e2, snapshotObserver.billing, this.f34474e);
            this.f34466e = function1;
            this.f34464e = c16446e;
            c11874e.license = 5;
            Unit unit2 = Unit.INSTANCE;
        } catch (Throwable th) {
            c13915e.m3726transient(th);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC1036e
    public final void inmobi(C17097e c17097e) {
        C12431e ads = this.f34480e.ad.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            c17097e.invoke(((C13915e) objArr[i2]).f27612e.admob);
        }
    }

    @Override // defpackage.InterfaceC16719e
    public final int loadAd(int i) {
        m4373switch();
        return this.f34480e.ad().mo2526e().loadAd(i);
    }

    @Override // defpackage.InterfaceC16719e
    public final int metrica(int i) {
        m4373switch();
        return this.f34480e.ad().mo2526e().metrica(i);
    }

    @Override // defpackage.InterfaceC6911e
    public final void premium(boolean z) {
        AbstractC4134e mo2526e;
        C11874e c11874e = this.f34480e;
        AbstractC4134e mo2526e2 = c11874e.ad().mo2526e();
        if (Boolean.valueOf(z).equals(mo2526e2 != null ? Boolean.valueOf(mo2526e2.f18515e) : null) || (mo2526e = c11874e.ad().mo2526e()) == null) {
            return;
        }
        mo2526e.f18515e = z;
    }

    /* renamed from: private, reason: not valid java name */
    public final boolean m4370private() {
        C11874e c11874e = this.f34480e;
        return AbstractC2467e.startapp(c11874e.ad) || c11874e.metrica;
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: protected */
    public final int mo1209protected() {
        return this.f34480e.ad().mo2526e().mo1209protected();
    }

    @Override // defpackage.InterfaceC1036e
    public final InterfaceC1036e purchase() {
        C11874e c11874e;
        C13915e tapsense = this.f34480e.ad.tapsense();
        if (tapsense == null || (c11874e = tapsense.f27612e) == null) {
            return null;
        }
        return c11874e.admob;
    }

    @Override // defpackage.InterfaceC1036e
    public final void requestLayout() {
        this.f34480e.ad.m3709final(false);
    }

    /* renamed from: return, reason: not valid java name */
    public final void m4371return() {
        int i = this.f34463e;
        C11874e c11874e = this.f34480e;
        boolean z = c11874e.metrica;
        C13915e c13915e = c11874e.ad;
        if (z) {
            this.f34463e = 2;
        } else {
            this.f34463e = 1;
        }
        if (i != 1 && c11874e.appmetrica) {
            C13915e.m3700super(c13915e, true, 6);
        }
        C12431e ads = c13915e.ads();
        Object[] objArr = ads.f24870e;
        int i2 = ads.f24868e;
        for (int i3 = 0; i3 < i2; i3++) {
            C13915e c13915e2 = (C13915e) objArr[i3];
            C17596e c17596e = c13915e2.f27612e.admob;
            if (c17596e == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (c17596e.f34477e != Integer.MAX_VALUE) {
                c17596e.m4371return();
                C13915e.m3698private(c13915e2);
            }
        }
    }

    @Override // defpackage.AbstractC2832e, defpackage.InterfaceC16719e
    public final Object signatures() {
        return this.f34472e;
    }

    @Override // defpackage.InterfaceC16719e
    public final int smaato(int i) {
        m4373switch();
        return this.f34480e.ad().mo2526e().smaato(i);
    }

    /* renamed from: static, reason: not valid java name */
    public final void m4372static(boolean z) {
        if (z && m4370private()) {
            return;
        }
        if (z || m4370private()) {
            this.f34463e = 3;
            C12431e ads = this.f34480e.ad.ads();
            Object[] objArr = ads.f24870e;
            int i = ads.f24868e;
            for (int i2 = 0; i2 < i; i2++) {
                ((C13915e) objArr[i2]).f27612e.admob.m4372static(true);
            }
        }
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m4373switch() {
        int i;
        C11874e c11874e = this.f34480e;
        C13915e.m3700super(c11874e.ad, false, 7);
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

    @Override // defpackage.InterfaceC1036e
    /* renamed from: throw */
    public final void mo449throw() {
        C13915e.m3700super(this.f34480e.ad, false, 7);
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: try */
    public final int mo393try(AbstractC17016e abstractC17016e) {
        C11874e c11874e = this.f34480e;
        C13915e tapsense = c11874e.ad.tapsense();
        int i = tapsense != null ? tapsense.f27612e.license : 0;
        C10324e c10324e = this.f34475e;
        if (i == 2) {
            c10324e.metrica = true;
        } else {
            C13915e tapsense2 = c11874e.ad.tapsense();
            if ((tapsense2 != null ? tapsense2.f27612e.license : 0) == 4) {
                c10324e.license = true;
            }
        }
        this.f34471e = true;
        int mo393try = c11874e.ad().mo2526e().mo393try(abstractC17016e);
        this.f34471e = false;
        return mo393try;
    }

    /* renamed from: volatile, reason: not valid java name */
    public final void m4374volatile() {
        int i;
        this.f34467e = true;
        C11874e c11874e = this.f34480e;
        C13915e tapsense = c11874e.ad.tapsense();
        int i2 = this.f34463e;
        if ((i2 != 1 && !c11874e.metrica) || (i2 != 2 && c11874e.metrica)) {
            m4371return();
            if (this.f34479e && tapsense != null) {
                tapsense.m3709final(false);
            }
        }
        if (tapsense != null) {
            C11874e c11874e2 = tapsense.f27612e;
            if (!this.f34479e && ((i = c11874e2.license) == 3 || i == 4)) {
                if (this.f34477e != Integer.MAX_VALUE) {
                    AbstractC14070e.metrica("Place was called on a node which was placed already");
                }
                int i3 = c11874e2.yandex;
                this.f34477e = i3;
                c11874e2.yandex = i3 + 1;
            }
        } else {
            this.f34477e = 0;
        }
        crashlytics();
    }

    @Override // defpackage.InterfaceC16719e
    /* renamed from: while */
    public final int mo2529while(int i) {
        m4373switch();
        return this.f34480e.ad().mo2526e().mo2529while(i);
    }
}
