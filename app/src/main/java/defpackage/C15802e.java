package defpackage;

import java.math.BigInteger;
import java.security.Provider;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.crypto.KeyAgreement;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۢٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15802e implements InterfaceC4088e, InterfaceC1598e, InterfaceC3215e, InterfaceC8026e, InterfaceC16759e, InterfaceC15580e, InterfaceC11962e, InterfaceC17847e, InterfaceC7342e, InterfaceC16794e, InterfaceC8292e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C15802e f31119e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C15802e f31120e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C15802e f31122e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static C15802e f31126e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C15802e f31130e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C15802e f31133e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C15802e f31139e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31144e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C15802e f31121e = new C15802e(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C15802e f31137e = new C15802e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C15802e f31118e = new C15802e(4);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C15802e f31142e = new C15802e(5);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C15802e f31141e = new C15802e(6);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C15802e f31124e = new C15802e(8);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C15802e f31128e = new C15802e(9);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C15802e f31129e = new C15802e(10);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C15802e f31127e = new C15802e(11);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C15802e f31125e = new C15802e(12);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C15802e f31136e = new C15802e(13);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C15802e f31143e = new C15802e(14);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C15802e f31123e = new C15802e(15);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final /* synthetic */ C15802e f31135e = new C15802e(16);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final C15802e f31138e = new C15802e(17);

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final C15802e f31140e = new C15802e(18);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final C15802e f31134e = new C15802e(19);

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final C15802e f31131e = new C15802e(20);

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public static final C15802e f31132e = new C15802e(21);

    static {
        int i = 7;
        f31130e = new C15802e(i);
        f31139e = new C15802e(i);
        f31122e = new C15802e(i);
        f31133e = new C15802e(i);
        f31120e = new C15802e(i);
        f31119e = new C15802e(i);
    }

    public /* synthetic */ C15802e(int i) {
        this.f31144e = i;
    }

    public static C7332e advert() {
        C13572e c13572e = C7332e.yandex;
        C7332e c7332e = ((C7332e[]) c13572e.f26878e)[1];
        if (c7332e == null) {
            long nanoTime = System.nanoTime();
            C7332e.mopub.await(C7332e.advert, TimeUnit.MILLISECONDS);
            if (((C7332e[]) c13572e.f26878e)[1] != null || System.nanoTime() - nanoTime < C7332e.smaato) {
                return null;
            }
            return C7332e.startapp;
        }
        long nanoTime2 = c7332e.billing - System.nanoTime();
        if (nanoTime2 > 0) {
            C7332e.mopub.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c13572e.isVip(c7332e);
        c7332e.appmetrica = 2;
        return c7332e;
    }

    public static final void license(C7332e c7332e) {
        C13572e c13572e = C7332e.yandex;
        if (C7332e.startapp == null) {
            C7332e.startapp = new C7332e();
            C13170e c13170e = new C13170e("Okio Watchdog");
            c13170e.setDaemon(true);
            c13170e.start();
        }
        long nanoTime = System.nanoTime();
        long j = c7332e.metrica;
        boolean z = c7332e.ad;
        if (j != 0 && z) {
            c7332e.billing = Math.min(j, c7332e.metrica() - nanoTime) + nanoTime;
        } else if (j != 0) {
            c7332e.billing = nanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            c7332e.billing = c7332e.metrica();
        }
        C13572e c13572e2 = C7332e.yandex;
        int i = c13572e2.f26879e + 1;
        c13572e2.f26879e = i;
        C7332e[] c7332eArr = (C7332e[]) c13572e2.f26878e;
        if (i == c7332eArr.length) {
            C7332e[] c7332eArr2 = new C7332e[i * 2];
            AbstractC1660e.loadAd(0, 0, 14, c7332eArr, c7332eArr2);
            c13572e2.f26878e = c7332eArr2;
        }
        c13572e2.signatures(i, c7332e);
        if (c7332e.purchase == 1) {
            C7332e.mopub.signal();
        }
    }

    public static final boolean mopub(C16439e c16439e) {
        return c16439e.vip == 1;
    }

    public static InterfaceC4977e smaato(Throwable th) {
        if (AbstractC9931e.metrica(th)) {
            return new C5134e(th);
        }
        if (th instanceof C0907e) {
            C0907e c0907e = (C0907e) th;
            return (c0907e.ad().ad == 1117 || AbstractC5304e.inmobi(c0907e.ad().vip, "access_token", false)) ? new C2008e(th) : (c0907e.ad().ad == 5 && AbstractC5304e.inmobi(c0907e.ad().vip, "blocked", false)) ? new C12392e(th) : new C9908e(th);
        }
        if (!(th instanceof C4447e)) {
            return new C6577e(th);
        }
        C4447e c4447e = (C4447e) th;
        String str = c4447e.f9650e;
        int i = c4447e.f9651e;
        return (i == 1117 || AbstractC5304e.inmobi(str, "access_token", false)) ? new C2008e(th) : (i == 5 && AbstractC5304e.inmobi(str, "blocked", false)) ? new C12392e(th) : new C9908e(th);
    }

    public Object Signature(int i, long j, AbstractC10731e abstractC10731e) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        return admob(sb.toString(), abstractC10731e);
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        ((C8988e) obj2).vip(null);
    }

    @Override // defpackage.InterfaceC7342e
    public byte[] ad(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [extends, catch, eًٌَ] */
    @Override // defpackage.InterfaceC15580e
    public byte[] adcel(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
            throw new IllegalArgumentException("Value out of range");
        }
        crashlyticsVar.appmetrica(new Cthis(bigInteger2));
        if (bigInteger3.signum() < 0 || (bigInteger != null && bigInteger3.compareTo(bigInteger) >= 0)) {
            throw new IllegalArgumentException("Value out of range");
        }
        crashlyticsVar.appmetrica(new Cthis(bigInteger3));
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch.smaato();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object admob(java.lang.String r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C9756e
            if (r0 == 0) goto L13
            r0 = r6
            eٍۛۘ r0 = (defpackage.C9756e) r0
            int r1 = r0.f19305e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19305e = r1
            goto L18
        L13:
            eٍۛۘ r0 = new eٍۛۘ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f19303e
            int r1 = r0.f19305e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.lang.String r5 = r0.f19304e
            defpackage.AbstractC2003e.purchase(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eًۚ r6 = defpackage.C18353e.ad
            r6.metrica()
            r0.f19304e = r5
            r0.f19305e = r2
            eۣۡ r6 = defpackage.C18353e.vip
            java.lang.Object r6 = r6.m4501e(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L46
            return r0
        L46:
            eّؖٚ r6 = (defpackage.C4199e) r6
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            r0[r1] = r5
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist> r5 = ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist.class
            eؙّؔ r1 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r5 = r1.vip(r5)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r1 = "uid == $0"
            eٓٛۘ r5 = r6.m1506e(r5, r1, r0)
            eَۚٗ r5 = defpackage.AbstractC18366e.metrica(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15802e.admob(java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object amazon(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C10923e
            if (r0 == 0) goto L13
            r0 = r5
            eَُۖ r0 = (defpackage.C10923e) r0
            int r1 = r0.f21640e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21640e = r1
            goto L18
        L13:
            eَُۖ r0 = new eَُۖ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f21639e
            int r1 = r0.f21640e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L42
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            eًۚ r5 = defpackage.C18353e.ad
            r5.metrica()
            r0.f21640e = r2
            eۣۡ r5 = defpackage.C18353e.vip
            java.lang.Object r5 = r5.m4501e(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L42
            return r0
        L42:
            eّؖٚ r5 = (defpackage.C4199e) r5
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum> r2 = ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum.class
            eؙّؔ r3 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r2 = r3.vip(r2)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r1 = "TRUEPREDICATE"
            eٓٛۘ r5 = r5.m1506e(r2, r1, r0)
            eؙؓٔ r5 = r5.metrica()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15802e.amazon(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8292e
    public Object appmetrica(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // defpackage.InterfaceC3215e
    public Boolean billing() {
        return Boolean.TRUE;
    }

    @Override // defpackage.InterfaceC16794e
    public C0560e isVip(Object obj) {
        return AbstractC1749e.appmetrica(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C15329e
            if (r0 == 0) goto L13
            r0 = r5
            eًٕٟ r0 = (defpackage.C15329e) r0
            int r1 = r0.f30250e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30250e = r1
            goto L18
        L13:
            eًٕٟ r0 = new eًٕٟ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30249e
            int r1 = r0.f30250e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L42
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            eًۚ r5 = defpackage.C18353e.ad
            r5.metrica()
            r0.f30250e = r2
            eۣۡ r5 = defpackage.C18353e.vip
            java.lang.Object r5 = r5.m4501e(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L42
            return r0
        L42:
            eّؖٚ r5 = (defpackage.C4199e) r5
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist> r2 = ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist.class
            eؙّؔ r3 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r2 = r3.vip(r2)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r1 = "TRUEPREDICATE"
            eٓٛۘ r5 = r5.m1506e(r2, r1, r0)
            eؙؓٔ r5 = r5.metrica()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15802e.loadAd(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8026e
    public float metrica(float f) {
        double d = f;
        return (float) (d < 0.031248d ? d / 16.0d : AbstractC0865e.billing(d, 1.8d));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable pro(java.lang.String r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C6968e
            if (r0 == 0) goto L13
            r0 = r6
            eؘؚۢ r0 = (defpackage.C6968e) r0
            int r1 = r0.f14284e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14284e = r1
            goto L18
        L13:
            eؘؚۢ r0 = new eؘؚۢ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f14283e
            int r1 = r0.f14284e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L40
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            eًۚ r6 = defpackage.C18353e.ad
            r6.metrica()
            r0.f14284e = r2
            java.lang.Object r6 = r4.admob(r5, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r6 != r5) goto L40
            return r5
        L40:
            ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist r6 = (ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist) r6
            if (r6 == 0) goto L96
            eٗٚٛ r5 = r6.license()
            if (r5 == 0) goto L96
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L58:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r5.next()
            r2 = r1
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r2 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r2
            java.lang.String r2 = r2.applovin()
            boolean r2 = r6.add(r2)
            if (r2 == 0) goto L58
            r0.add(r1)
            goto L58
        L73:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.AbstractC0746e.subscription(r0, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r0.iterator()
        L82:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r6.next()
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r0 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r0
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r0 = r0.metrica()
            r5.add(r0)
            goto L82
        L96:
            r5 = 0
        L97:
            if (r5 != 0) goto L9b
            eْۨٝ r5 = defpackage.C13664e.f27089e
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15802e.pro(java.lang.String, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC8026e
    public float purchase(float f) {
        double d = f;
        return (float) (d < 0.001953d ? d * 16.0d : AbstractC0865e.billing(d, 0.5555555555555556d));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable remoteconfig(int r5, long r6, defpackage.AbstractC10731e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.C4212e
            if (r0 == 0) goto L13
            r0 = r8
            eؖٛؒ r0 = (defpackage.C4212e) r0
            int r1 = r0.f9280e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9280e = r1
            goto L18
        L13:
            eؖٛؒ r0 = new eؖٛؒ
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f9279e
            int r1 = r0.f9280e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r8)
            goto L40
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r8)
            eًۚ r8 = defpackage.C18353e.ad
            r8.metrica()
            r0.f9280e = r2
            java.lang.Object r8 = r4.Signature(r5, r6, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r8 != r5) goto L40
            return r5
        L40:
            ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist r8 = (ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist) r8
            if (r8 == 0) goto L96
            eٗٚٛ r5 = r8.license()
            if (r5 == 0) goto L96
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L58:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L73
            java.lang.Object r8 = r5.next()
            r0 = r8
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r0 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r0
            java.lang.String r0 = r0.applovin()
            boolean r0 = r6.add(r0)
            if (r0 == 0) goto L58
            r7.add(r8)
            goto L58
        L73:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.AbstractC0746e.subscription(r7, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L82:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L97
            java.lang.Object r7 = r6.next()
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r7 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r7
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r7 = r7.metrica()
            r5.add(r7)
            goto L82
        L96:
            r5 = 0
        L97:
            if (r5 != 0) goto L9b
            eْۨٝ r5 = defpackage.C13664e.f27089e
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15802e.remoteconfig(int, long, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC4088e
    public int startapp() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079 A[LOOP:0: B:11:0x0073->B:13:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable subscription(java.lang.String r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C7675e
            if (r0 == 0) goto L13
            r0 = r6
            eًُؓ r0 = (defpackage.C7675e) r0
            int r1 = r0.f15605e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15605e = r1
            goto L18
        L13:
            eًُؓ r0 = new eًُؓ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f15603e
            int r1 = r0.f15605e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.lang.String r5 = r0.f15604e
            defpackage.AbstractC2003e.purchase(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eًۚ r6 = defpackage.C18353e.ad
            r6.metrica()
            r0.f15604e = r5
            r0.f15605e = r2
            eۣۡ r6 = defpackage.C18353e.vip
            java.lang.Object r6 = r6.m4501e(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L46
            return r0
        L46:
            eّؖٚ r6 = (defpackage.C4199e) r6
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            r0[r1] = r5
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedTrack> r5 = ua.itaysonlab.vkxreborn.cache.realm.CachedTrack.class
            eؙّؔ r3 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r5 = r3.vip(r5)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "albumFullId == $0"
            eٓٛۘ r5 = r6.m1506e(r5, r2, r0)
            eؙؓٔ r5 = r5.metrica()
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.AbstractC0746e.subscription(r5, r0)
            r6.<init>(r0)
            eؘؓؖ r0 = new eؘؓؖ
            r0.<init>(r1, r5)
        L73:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L87
            java.lang.Object r5 = r0.next()
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r5 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r5
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r5 = r5.metrica()
            r6.add(r5)
            goto L73
        L87:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15802e.subscription(java.lang.String, eُؑ۠):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3  */
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15802e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC15580e
    public BigInteger[] vip(BigInteger bigInteger, byte[] bArr) {
        Ccatch ccatch = (Ccatch) Cdefault.inmobi(bArr);
        if (ccatch.size() == 2) {
            BigInteger firebase = ((Cthis) ccatch.mo171interface(0)).firebase();
            if (firebase.signum() < 0 || (bigInteger != null && firebase.compareTo(bigInteger) >= 0)) {
                throw new IllegalArgumentException("Value out of range");
            }
            BigInteger firebase2 = ((Cthis) ccatch.mo171interface(1)).firebase();
            if (firebase2.signum() < 0 || (bigInteger != null && firebase2.compareTo(bigInteger) >= 0)) {
                throw new IllegalArgumentException("Value out of range");
            }
            if (Arrays.equals(adcel(bigInteger, firebase, firebase2), bArr)) {
                return new BigInteger[]{firebase, firebase2};
            }
        }
        throw new IllegalArgumentException("Malformed signature");
    }

    @Override // defpackage.InterfaceC16759e
    public long yandex(C4395e c4395e, int i) {
        String str = c4395e.purchase.ad.ad.f20850e;
        return AbstractC9262e.metrica(AbstractC8797e.vip(str, i), AbstractC8797e.ad(str, i));
    }
}
