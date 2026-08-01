package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2734e implements InterfaceC17674e {
    public static final C1410e remoteconfig;
    public final AbstractC8507e Signature;
    public final C11501e ad;
    public final long adcel;
    public final ConcurrentHashMap admob;
    public final int advert;
    public final boolean amazon;
    public final long appmetrica;
    public final long billing;
    public final long license;
    public final long loadAd;
    public final C11669e metrica;
    public final long mopub;
    public final long purchase;
    public final boolean smaato;
    public final long startapp;
    public long subscription;
    public final C6158e vip;
    public final long yandex;

    static {
        C2171e c2171e = AbstractC17475e.f34223e;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        AbstractC8306e.ad(6, objArr);
        remoteconfig = AbstractC17475e.loadAd(6, objArr);
    }

    public C2734e(C11669e c11669e, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, int i9, Map map) {
        ad(i5, 0, "bufferForPlaybackMs", "0");
        ad(i6, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        ad(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        ad(i8, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        ad(i, i5, "minBufferMs", "bufferForPlaybackMs");
        ad(i2, i6, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        ad(i, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        ad(i2, i8, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        ad(i3, i, "maxBufferMs", "minBufferMs");
        ad(i4, i2, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        ad(i9, 0, "backBufferDurationMs", "0");
        this.ad = new C11501e();
        this.vip = new C6158e();
        this.metrica = c11669e;
        this.license = AbstractC9413e.m2546case(i);
        this.appmetrica = AbstractC9413e.m2546case(i2);
        this.purchase = AbstractC9413e.m2546case(i3);
        this.billing = AbstractC9413e.m2546case(i4);
        this.yandex = AbstractC9413e.m2546case(i5);
        this.startapp = AbstractC9413e.m2546case(i6);
        this.adcel = AbstractC9413e.m2546case(i7);
        this.mopub = AbstractC9413e.m2546case(i8);
        this.advert = -1;
        this.smaato = z;
        this.amazon = true;
        this.loadAd = AbstractC9413e.m2546case(i9);
        this.admob = new ConcurrentHashMap();
        this.Signature = AbstractC8507e.vip(map);
        this.subscription = -1L;
    }

    public static void ad(int i, int i2, String str, String str2) {
        AbstractC2301e.adcel(i >= i2, "%s cannot be less than %s", str, str2);
    }

    public final void metrica() {
        int i = 0;
        if (this.admob.isEmpty()) {
            C11669e c11669e = this.metrica;
            synchronized (c11669e) {
                if (c11669e.f23457e) {
                    c11669e.ad(0);
                }
            }
            return;
        }
        C11669e c11669e2 = this.metrica;
        Iterator it = this.admob.values().iterator();
        while (it.hasNext()) {
            i += ((C16937e) it.next()).metrica;
        }
        c11669e2.ad(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vip(defpackage.C7466e r15) {
        /*
            r14 = this;
            eٍؘؑ r0 = r15.ad
            long r1 = r15.license
            j$.util.concurrent.ConcurrentHashMap r3 = r14.admob
            java.lang.Object r3 = r3.get(r0)
            eُٗۙ r3 = (defpackage.C16937e) r3
            r3.getClass()
            j$.util.concurrent.ConcurrentHashMap r4 = r14.admob
            java.lang.Object r4 = r4.get(r0)
            eُٗۙ r4 = (defpackage.C16937e) r4
            r4.getClass()
            monitor-enter(r4)
            int r5 = r4.license     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r4)
            eُِٗ r4 = r14.metrica
            int r4 = r4.f23455e
            int r5 = r5 * r4
            j$.util.concurrent.ConcurrentHashMap r4 = r14.admob
            java.lang.Object r4 = r4.get(r0)
            eُٗۙ r4 = (defpackage.C16937e) r4
            r4.getClass()
            int r4 = r4.metrica
            r6 = 0
            r7 = 1
            if (r5 < r4) goto L36
            r4 = r7
            goto L37
        L36:
            r4 = r6
        L37:
            eٍؘؑ r5 = defpackage.C5350e.license
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L42
            r15 = r4 ^ 1
            return r15
        L42:
            eؙ۠ؐ r0 = r15.vip
            eَٛ r5 = r15.metrica
            java.lang.Object r5 = r5.ad
            eؙؚؔ r8 = r14.vip
            eؙؚؔ r5 = r0.billing(r5, r8)
            int r5 = r5.metrica
            eِؔۨ r8 = r14.ad
            r9 = 0
            eِؔۨ r0 = r0.smaato(r5, r8, r9)
            eِؓٝ r0 = r0.metrica
            eٌَٗ r0 = r0.vip
            if (r0 != 0) goto L5f
            goto L74
        L5f:
            android.net.Uri r0 = r0.ad
            java.lang.String r0 = r0.getScheme()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L76
            eؒۢۗ r5 = defpackage.C2734e.remoteconfig
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L74
            goto L76
        L74:
            r0 = r6
            goto L77
        L76:
            r0 = r7
        L77:
            if (r0 == 0) goto L7c
            long r8 = r14.appmetrica
            goto L7e
        L7c:
            long r8 = r14.license
        L7e:
            if (r0 == 0) goto L83
            long r10 = r14.billing
            goto L85
        L83:
            long r10 = r14.purchase
        L85:
            float r15 = r15.appmetrica
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r5 <= 0) goto L95
            long r8 = defpackage.AbstractC9413e.crashlytics(r15, r8)
            long r8 = java.lang.Math.min(r8, r10)
        L95:
            r12 = 500000(0x7a120, double:2.47033E-318)
            long r8 = java.lang.Math.max(r8, r12)
            int r15 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r15 >= 0) goto Lbc
            if (r0 == 0) goto La5
            boolean r15 = r14.amazon
            goto La7
        La5:
            boolean r15 = r14.smaato
        La7:
            if (r15 != 0) goto Lab
            if (r4 != 0) goto Lac
        Lab:
            r6 = r7
        Lac:
            r3.vip = r6
            if (r6 != 0) goto Lc4
            int r15 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r15 >= 0) goto Lc4
            java.lang.String r15 = "DefaultLoadControl"
            java.lang.String r0 = "Target buffer size reached with less than 500ms of buffered media data."
            defpackage.AbstractC2803e.smaato(r15, r0)
            goto Lc4
        Lbc:
            int r15 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r15 >= 0) goto Lc2
            if (r4 == 0) goto Lc4
        Lc2:
            r3.vip = r6
        Lc4:
            boolean r15 = r3.vip
            return r15
        Lc7:
            r15 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc7
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2734e.vip(eؚۜؕ):boolean");
    }
}
