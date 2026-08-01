package defpackage;

import android.graphics.PointF;
import android.util.Log;
import java.io.Serializable;
import java.security.Provider;
import javax.crypto.Cipher;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14914e implements InterfaceC2961e, InterfaceC11628e, InterfaceC5592e, InterfaceC8026e, InterfaceC11962e, InterfaceC9307e, InterfaceC18204e, InterfaceC1598e, InterfaceC8292e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C14914e f29569e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static C14914e f29574e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C13534e f29583e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29590e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C13534e f29566e = new C13534e(2);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C14914e f29588e = new C14914e(3);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C11315e f29587e = new C11315e(1.0f, 1.0f);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C14914e f29578e = new C14914e(4);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C14914e f29585e = new C14914e(5);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C14914e f29570e = new C14914e(6);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C14914e f29579e = new C14914e(7);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C14914e f29568e = new C14914e(8);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C14914e f29567e = new C14914e(9);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C14914e f29572e = new C14914e(10);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C14914e f29576e = new C14914e(11);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C14914e f29577e = new C14914e(12);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C14914e f29575e = new C14914e(13);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C14914e f29573e = new C14914e(14);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C14914e f29582e = new C14914e(15);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final /* synthetic */ C14914e f29589e = new C14914e(16);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C14914e f29571e = new C14914e(17);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C14914e f29581e = new C14914e(18);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final C14914e f29584e = new C14914e(19);

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final C14914e f29586e = new C14914e(20);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final C14914e f29580e = new C14914e(21);

    static {
        int i = 1;
        f29569e = new C14914e(i);
        f29583e = new C13534e(i);
    }

    public C14914e(float f) {
        this.f29590e = 25;
        if (0.0f > f) {
            throw new IllegalArgumentException("min must be less than or equal to max");
        }
    }

    public /* synthetic */ C14914e(int i) {
        this.f29590e = i;
    }

    public static /* synthetic */ Object admob(AppActivity appActivity, String str, String str2, String str3, String str4, boolean z, AbstractC7185e abstractC7185e, int i) {
        if ((i & 16) != 0) {
            str4 = null;
        }
        String str5 = str4;
        if ((i & 32) != 0) {
            z = false;
        }
        C9139e c9139e = C9139e.f18290e;
        return f29579e.Signature(appActivity, str, str2, str3, str5, z, c9139e, abstractC7185e);
    }

    public static /* synthetic */ Serializable amazon(C14914e c14914e, AbstractC10731e abstractC10731e, int i) {
        C14027e.ad.getClass();
        return c14914e.advert(C14027e.metrica(), false, abstractC10731e);
    }

    public static final AbstractC12260e billing(String str) {
        Object newInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        if (newInstance instanceof AbstractC12260e) {
            return (AbstractC12260e) newInstance;
        }
        return null;
    }

    public static synchronized void subscription() {
        synchronized (C14914e.class) {
            if (f29574e == null) {
                f29574e = new C14914e(0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0212, code lost:
    
        if (r1 == r12) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e1, code lost:
    
        if (r1 == r12) goto L35;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Signature(ua.itaysonlab.vkx.activity.AppActivity r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, java.util.Map r25, defpackage.AbstractC10731e r26) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14914e.Signature(ua.itaysonlab.vkx.activity.AppActivity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.Map, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC18204e
    public byte[] ad(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        if (r0.smaato(r2) == r9) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:12:0x0032, B:13:0x00dd, B:19:0x0044, B:20:0x00b8, B:22:0x00c0, B:24:0x00cc, B:28:0x004a, B:30:0x0064, B:34:0x0054), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:12:0x0032, B:13:0x00dd, B:19:0x0044, B:20:0x00b8, B:22:0x00c0, B:24:0x00cc, B:28:0x004a, B:30:0x0064, B:34:0x0054), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object adcel(java.lang.String r25, defpackage.AbstractC10731e r26) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14914e.adcel(java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable advert(long r5, boolean r7, defpackage.AbstractC10731e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.C10655e
            if (r0 == 0) goto L13
            r0 = r8
            eَۥ۠ r0 = (defpackage.C10655e) r0
            int r1 = r0.f20975e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20975e = r1
            goto L18
        L13:
            eَۥ۠ r0 = new eَۥ۠
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f20978e
            int r1 = r0.f20975e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            boolean r7 = r0.f20974e
            long r5 = r0.f20976e
            defpackage.AbstractC2003e.purchase(r8)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC2003e.purchase(r8)
            eًۚ r8 = defpackage.C18353e.ad
            r0.f20976e = r5
            r0.f20974e = r7
            r0.f20975e = r2
            eۣۡ r8 = defpackage.C18353e.vip
            java.lang.Object r8 = r8.m4501e(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r8 != r0) goto L47
            return r0
        L47:
            eّؖٚ r8 = (defpackage.C4199e) r8
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r6 = 0
            r5[r6] = r0
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary> r6 = ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary.class
            eؙّؔ r0 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r6 = r0.vip(r6)
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String r0 = "uid == $0"
            eٓٛۘ r5 = r8.m1506e(r6, r0, r5)
            eَۚٗ r5 = defpackage.AbstractC18366e.metrica(r5)
            ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary r5 = (ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary) r5
            if (r5 == 0) goto Lc0
            eٗٚٛ r5 = r5.ad()
            if (r5 == 0) goto Lc0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L7c:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L9c
            java.lang.Object r8 = r5.next()
            r0 = r8
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r0 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r0
            if (r7 == 0) goto L92
            ua.itaysonlab.vkxreborn.cache.realm.NewCachedPodcastInfo r0 = r0.remoteconfig()
            if (r0 == 0) goto L7c
            goto L98
        L92:
            ua.itaysonlab.vkxreborn.cache.realm.NewCachedPodcastInfo r0 = r0.remoteconfig()
            if (r0 != 0) goto L7c
        L98:
            r6.add(r8)
            goto L7c
        L9c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.AbstractC0746e.subscription(r6, r7)
            r5.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        Lab:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lbf
            java.lang.Object r7 = r6.next()
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r7 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r7
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r7 = r7.metrica()
            r5.add(r7)
            goto Lab
        Lbf:
            return r5
        Lc0:
            eْۨٝ r5 = defpackage.C13664e.f27089e
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14914e.advert(long, boolean, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC8292e
    public Object appmetrica(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        C13391e c13391e = AbstractC16828e.f32957e;
        if (Log.isLoggable((String) c13391e.f26645e, 6)) {
            Log.e("MobileVisionBase", c13391e.inmobi("Error preloading model resource"), exc);
        }
    }

    @Override // defpackage.InterfaceC2961e
    public EnumC7792e getLayoutDirection() {
        return EnumC7792e.f15794e;
    }

    @Override // defpackage.InterfaceC5592e
    public PointF license(C15099e c15099e, int i) {
        float f = c15099e.vip;
        float f2 = c15099e.ad;
        return i == 1 ? new PointF(1.0f - f2, f) : new PointF(f2, f);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|104|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x005c, code lost:
    
        if (r14 == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0167, code lost:
    
        r0.printStackTrace();
        r14 = java.util.Collections.singletonList(new defpackage.C17753e("vkx_cache", "Загрузки"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c5, code lost:
    
        if (r14 == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c7, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ab, code lost:
    
        if (r14 == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x009d, code lost:
    
        if (r14.vip(r0) == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0087, code lost:
    
        if (r14 == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0079, code lost:
    
        if (r14 == r6) goto L47;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0025. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[Catch: Exception -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0035, blocks: (B:12:0x0030, B:13:0x00c8, B:15:0x00ce, B:17:0x00d2, B:19:0x00da, B:21:0x00de, B:22:0x00e7, B:24:0x00ed, B:27:0x00fc, B:32:0x0100, B:33:0x0109, B:35:0x010f, B:37:0x011b, B:40:0x0125, B:47:0x012c, B:48:0x012e, B:49:0x013b, B:51:0x0141, B:55:0x0150, B:59:0x0156, B:63:0x015d, B:76:0x00b6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r14v43, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r14v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [eٌّؒ, eٔؐۜ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(defpackage.AbstractC10731e r14) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14914e.loadAd(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8026e
    public float metrica(float f) {
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r9 == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r9 == r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mopub(defpackage.AbstractC10731e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C15224e
            if (r0 == 0) goto L13
            r0 = r9
            eِٕؕ r0 = (defpackage.C15224e) r0
            int r1 = r0.f30126e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30126e = r1
            goto L18
        L13:
            eِٕؕ r0 = new eِٕؕ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f30125e
            int r1 = r0.f30126e
            r2 = 3
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            defpackage.AbstractC2003e.purchase(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            defpackage.AbstractC2003e.purchase(r9)
            goto L82
        L39:
            defpackage.AbstractC2003e.purchase(r9)
            goto L6f
        L3d:
            defpackage.AbstractC2003e.purchase(r9)
            eِٕٞ r9 = defpackage.C15409e.ad
            r9.getClass()
            eؘّۦ r1 = defpackage.C15409e.Signature
            eٌَۧ[] r6 = defpackage.C15409e.vip
            r7 = 10
            r6 = r6[r7]
            java.lang.Object r9 = r1.tapsense(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L87
            eٕۢٝ r9 = defpackage.C15802e.f31123e
            eٖٓٗ r1 = defpackage.C14027e.ad
            r1.getClass()
            long r1 = defpackage.C14027e.metrica()
            r0.f30126e = r4
            r6 = -1337(0xfffffffffffffac7, float:NaN)
            java.io.Serializable r9 = r9.remoteconfig(r6, r1, r0)
            if (r9 != r5) goto L6f
            goto L8f
        L6f:
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L84
            r0.f30126e = r3
            eٜٔۗ r9 = defpackage.C14914e.f29582e
            java.io.Serializable r9 = amazon(r9, r0, r4)
            if (r9 != r5) goto L82
            goto L8f
        L82:
            java.util.List r9 = (java.util.List) r9
        L84:
            java.util.List r9 = (java.util.List) r9
            return r9
        L87:
            r0.f30126e = r2
            java.io.Serializable r9 = amazon(r8, r0, r4)
            if (r9 != r5) goto L90
        L8f:
            return r5
        L90:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14914e.mopub(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8026e
    public float purchase(float f) {
        return f;
    }

    @Override // defpackage.InterfaceC11628e
    public Iterable smaato(Object obj) {
        InterfaceC8614e[] interfaceC8614eArr = C18214e.f35655e;
        return ((InterfaceC0390e) obj).vip().mo337finally();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startapp(ua.itaysonlab.vkx.activity.AppActivity r23, defpackage.C1479e r24, defpackage.AbstractC10731e r25) {
        /*
            r22 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r1 instanceof defpackage.C17772e
            if (r2 == 0) goto L19
            r2 = r1
            eٕ٘ؒ r2 = (defpackage.C17772e) r2
            int r3 = r2.f34852e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f34852e = r3
            r3 = r22
            goto L20
        L19:
            eٕ٘ؒ r2 = new eٕ٘ؒ
            r3 = r22
            r2.<init>(r3, r1)
        L20:
            java.lang.Object r1 = r2.f34850e
            int r4 = r2.f34852e
            r5 = 2
            r6 = 1
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r4 == 0) goto L40
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            defpackage.AbstractC2003e.purchase(r1)
            return r1
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            ua.itaysonlab.vkx.activity.AppActivity r0 = r2.f34851e
            defpackage.AbstractC2003e.purchase(r1)
            goto La6
        L40:
            defpackage.AbstractC2003e.purchase(r1)
            java.util.ArrayList r1 = defpackage.AbstractC1876e.ad
            eًۛ۠ r1 = defpackage.AbstractC1831e.vip()
            java.lang.Object r4 = r1.billing
            r8 = r4
            eۤۤ r8 = (defpackage.C18479e) r8
            long r9 = r0.ad
            java.lang.String r11 = r0.vip
            int r4 = r0.metrica
            r12 = 1000000(0xf4240, float:1.401298E-39)
            if (r4 <= r12) goto L64
            eؘؘۢ r12 = defpackage.C5471e.f11744e
            long r12 = (long) r4
            r14 = 0
            eؘؘۢ r4 = defpackage.C13023e.metrica(r12, r14)
        L62:
            r12 = r4
            goto L77
        L64:
            eؚْۤ r12 = defpackage.AbstractC15962e.ad
            eؘؘۢ r12 = r12.purchase()
            eٍ٘ؖ r13 = defpackage.C14157e.f27993e
            eٖؒٗ r13 = defpackage.EnumC15934e.SECONDS
            long r13 = defpackage.AbstractC0326e.Signature(r4, r13)
            eؘؘۢ r4 = r12.vip(r13)
            goto L62
        L77:
            java.lang.String r13 = r0.license
            r20 = 1
            r21 = 1008(0x3f0, float:1.413E-42)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            eۤۤ r0 = defpackage.C18479e.ad(r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r1.purchase
            eؙۗۗ r4 = (defpackage.C6594e) r4
            defpackage.AbstractC11906e.mopub(r4, r0)
            r1.billing = r0
            eًۛ۠ r0 = defpackage.AbstractC1831e.vip()
            r1 = r23
            r2.f34851e = r1
            r2.f34852e = r6
            java.lang.Object r0 = r0.smaato(r2)
            if (r0 != r7) goto La5
            goto Lbe
        La5:
            r0 = r1
        La6:
            eّٕٓ r1 = defpackage.AbstractC6731e.ad
            eْؐؔ r1 = defpackage.AbstractC1497e.ad
            eْؐؔ r1 = r1.f25795e
            eٌۡٔ r4 = new eٌۡٔ
            r6 = 27
            r8 = 0
            r4.<init>(r0, r8, r6)
            r2.f34851e = r8
            r2.f34852e = r5
            java.lang.Object r0 = defpackage.AbstractC5336e.advert(r1, r4, r2)
            if (r0 != r7) goto Lbf
        Lbe:
            return r7
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14914e.startapp(ua.itaysonlab.vkx.activity.AppActivity, eٍؒۧ, eُؑ۠):java.lang.Object");
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14914e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2961e
    public InterfaceC14388e vip() {
        return f29587e;
    }

    @Override // defpackage.InterfaceC2961e
    public long yandex() {
        return 9205357640488583168L;
    }
}
