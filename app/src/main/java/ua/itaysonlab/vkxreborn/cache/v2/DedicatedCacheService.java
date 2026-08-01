package com.werhes.museeksreborn.cache.v2;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import defpackage.AbstractC10731e;
import defpackage.AbstractC11062e;
import defpackage.AbstractC14114e;
import defpackage.AbstractC15448e;
import defpackage.AbstractC16039e;
import defpackage.AbstractC4608e;
import defpackage.AbstractC5336e;
import defpackage.AbstractC6731e;
import defpackage.AbstractC7535e;
import defpackage.AbstractServiceC5057e;
import defpackage.C10675e;
import defpackage.C11318e;
import defpackage.C13566e;
import defpackage.C15420e;
import defpackage.C15966e;
import defpackage.C2473e;
import defpackage.C4013e;
import defpackage.C4870e;
import defpackage.C4891e;
import defpackage.C5981e;
import defpackage.C6029e;
import defpackage.C7371e;
import defpackage.C9042e;
import defpackage.EnumC2821e;
import defpackage.EnumC7785e;
import defpackage.ExecutorC3603e;
import defpackage.InterfaceC5083e;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/v2/DedicatedCacheService;", "Leٕؗٞ;", "<init>", "()V", "eؚ٘ۖ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DedicatedCacheService extends AbstractServiceC5057e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final /* synthetic */ int f36730e = 0;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0181, code lost:
    
        if (defpackage.AbstractC5336e.advert(r0, r2, r6) != r10) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ae, code lost:
    
        if (r11 == r10) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00df, code lost:
    
        if (r11 == r10) goto L77;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r21v0, types: [ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService, java.lang.Object, eٕؗٞ] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [eًؗۖ, ua.itaysonlab.vkxreborn.cache.realm.CachedTrack, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mopub(ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService r21, ua.itaysonlab.vkapi2.objects.music.AudioTrack r22, defpackage.C2077e r23, defpackage.AbstractC10731e r24) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService.mopub(ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService, ua.itaysonlab.vkapi2.objects.music.AudioTrack, eؓۚ۠, eُؑ۠):java.lang.Object");
    }

    public static Object smaato(C10675e c10675e, String str, boolean z, AbstractC10731e abstractC10731e) {
        if (str.length() == 0 || (!z && AbstractC11062e.f21949e.isVip(c10675e))) {
            return Unit.INSTANCE;
        }
        C15420e c15420e = AbstractC6731e.ad;
        Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C13566e(c10675e, str, null), abstractC10731e);
        return advert == EnumC2821e.f6782e ? advert : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (defpackage.AbstractC5336e.advert(r9, r1, r0) != r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (smaato(r1, r9, true, r0) == r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object advert(defpackage.C0389e r7, defpackage.InterfaceC9093e r8, defpackage.AbstractC10731e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C1287e
            if (r0 == 0) goto L13
            r0 = r9
            eؒۙٚ r0 = (defpackage.C1287e) r0
            int r1 = r0.f3993e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3993e = r1
            goto L18
        L13:
            eؒۙٚ r0 = new eؒۙٚ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f3996e
            int r1 = r0.f3993e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r9)
            goto L74
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            eٌۤٓ r8 = r0.f3992e
            eؑٙۨ r7 = r0.f3994e
            defpackage.AbstractC2003e.purchase(r9)
            goto L5d
        L3a:
            defpackage.AbstractC2003e.purchase(r9)
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r9 = r7.appmetrica
            java.lang.String r9 = defpackage.AbstractC13406e.mopub(r9)
            if (r9 == 0) goto L5d
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r1 = r7.appmetrica
            java.lang.String r1 = defpackage.AbstractC13406e.signatures(r1)
            r5 = 5
            eَۦۦ r1 = defpackage.AbstractC4224e.purchase(r5, r1)
            r0.f3994e = r7
            r0.f3992e = r8
            r0.f3993e = r3
            java.lang.Object r9 = smaato(r1, r9, r3, r0)
            if (r9 != r4) goto L5d
            goto L73
        L5d:
            eّٕٓ r9 = defpackage.AbstractC6731e.ad
            eًٖؔ r1 = new eًٖؔ
            r3 = 24
            r5 = 0
            r1.<init>(r8, r7, r5, r3)
            r0.f3994e = r5
            r0.f3992e = r5
            r0.f3993e = r2
            java.lang.Object r7 = defpackage.AbstractC5336e.advert(r9, r1, r0)
            if (r7 != r4) goto L74
        L73:
            return r4
        L74:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService.advert(eؑٙۨ, eٌۤٓ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object amazon(ua.itaysonlab.vkapi2.objects.music.AudioTrack r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C9279e
            if (r0 == 0) goto L13
            r0 = r6
            eٍٍؘ r0 = (defpackage.C9279e) r0
            int r1 = r0.f18497e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18497e = r1
            goto L18
        L13:
            eٍٍؘ r0 = new eٍٍؘ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f18496e
            int r1 = r0.f18497e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L63
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum r5 = r5.amazon
            if (r5 == 0) goto L63
            ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb r6 = r5.appmetrica
            if (r6 == 0) goto L63
            r1 = 4
            java.lang.String r5 = r5.vip()
            eَۦۦ r5 = defpackage.AbstractC4224e.purchase(r1, r5)
            java.lang.String r1 = r6.appmetrica
            if (r1 != 0) goto L4f
            java.lang.String r1 = r6.license
            if (r1 != 0) goto L4f
            java.lang.String r1 = r6.metrica
            if (r1 != 0) goto L4f
            java.lang.String r1 = ""
        L4f:
            eَۧ r6 = defpackage.AbstractC11062e.f21949e
            boolean r6 = r6.isVip(r5)
            if (r6 != 0) goto L63
            r0.f18497e = r2
            r6 = 0
            java.lang.Object r5 = smaato(r5, r1, r6, r0)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L63
            return r6
        L63:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService.amazon(ua.itaysonlab.vkapi2.objects.music.AudioTrack, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractServiceC5057e
    public final AbstractC16039e appmetrica() {
        return new C2473e(this, 0);
    }

    @Override // defpackage.AbstractServiceC5667e, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return new Binder();
    }

    @Override // defpackage.AbstractServiceC5057e, defpackage.AbstractServiceC5667e, android.app.Service
    public final void onCreate() {
        super.onCreate();
        InterfaceC5083e interfaceC5083e = null;
        C4870e c4870e = new C4870e(this, interfaceC5083e, 15);
        C5981e c5981e = AbstractC15448e.ad;
        C6029e c6029e = this.f12041e;
        C4891e c4891e = (C4891e) c6029e.f12699e;
        C4013e c4013e = AbstractC15448e.vip;
        C11318e c11318e = new C11318e(new C7371e(c4013e, 10), new C15966e(c4870e, interfaceC5083e, 26), 3);
        EnumC7785e enumC7785e = EnumC7785e.f15779e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        C9042e c9042e = new C9042e(this, interfaceC5083e, 14);
        C4891e c4891e2 = (C4891e) c6029e.f12699e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C7371e(c4013e, 11), new C15966e(c9042e, interfaceC5083e, 28), 3), c4891e2, enumC7785e), AbstractC4608e.metrica(c4891e2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(4:20|21|(1:23)(1:27)|24)(1:(4:13|14|15|16)(2:18|19)))(7:28|29|30|31|32|33|(2:35|(2:37|38)(10:39|40|41|42|43|(2:45|26)|31|32|33|(5:52|(3:54|(2:56|26)|57)(5:58|(1:60)(1:66)|(1:62)(1:65)|(2:64|26)|57)|21|(0)(0)|24)(0)))(0)))(2:77|(2:79|80)(7:81|(1:85)|86|(1:90)|91|33|(0)(0)))))|94|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01ec, code lost:
    
        if (defpackage.AbstractC15448e.ad(r0, r3) != r7) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f7, code lost:
    
        r0.printStackTrace();
        billing().adcel(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[Catch: Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:13:0x0033, B:14:0x01ef, B:20:0x0043, B:21:0x01c7, B:24:0x01d2, B:33:0x00b1, B:35:0x00b7, B:37:0x00c6, B:39:0x00c9, B:48:0x0137, B:50:0x0150, B:51:0x016e, B:52:0x016f, B:54:0x0173, B:58:0x018c, B:65:0x01c2, B:66:0x01bd, B:81:0x0072, B:83:0x0076, B:85:0x007c, B:86:0x007e, B:88:0x0082, B:90:0x0088, B:91:0x0090), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150 A[Catch: Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:13:0x0033, B:14:0x01ef, B:20:0x0043, B:21:0x01c7, B:24:0x01d2, B:33:0x00b1, B:35:0x00b7, B:37:0x00c6, B:39:0x00c9, B:48:0x0137, B:50:0x0150, B:51:0x016e, B:52:0x016f, B:54:0x0173, B:58:0x018c, B:65:0x01c2, B:66:0x01bd, B:81:0x0072, B:83:0x0076, B:85:0x007c, B:86:0x007e, B:88:0x0082, B:90:0x0088, B:91:0x0090), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e A[Catch: Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:13:0x0033, B:14:0x01ef, B:20:0x0043, B:21:0x01c7, B:24:0x01d2, B:33:0x00b1, B:35:0x00b7, B:37:0x00c6, B:39:0x00c9, B:48:0x0137, B:50:0x0150, B:51:0x016e, B:52:0x016f, B:54:0x0173, B:58:0x018c, B:65:0x01c2, B:66:0x01bd, B:81:0x0072, B:83:0x0076, B:85:0x007c, B:86:0x007e, B:88:0x0082, B:90:0x0088, B:91:0x0090), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f A[Catch: Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:13:0x0033, B:14:0x01ef, B:20:0x0043, B:21:0x01c7, B:24:0x01d2, B:33:0x00b1, B:35:0x00b7, B:37:0x00c6, B:39:0x00c9, B:48:0x0137, B:50:0x0150, B:51:0x016e, B:52:0x016f, B:54:0x0173, B:58:0x018c, B:65:0x01c2, B:66:0x01bd, B:81:0x0072, B:83:0x0076, B:85:0x007c, B:86:0x007e, B:88:0x0082, B:90:0x0088, B:91:0x0090), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r17v0, types: [ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService, java.lang.Object, eٕؗٞ] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [eٌۤٓ] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0108 -> B:31:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0150 -> B:33:0x00b1). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractServiceC5057e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(defpackage.AbstractC3002e r18, defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService.purchase(eؔۦۥ, eُؑ۠):java.lang.Object");
    }
}
