package com.werhes.museeks.downloader.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import defpackage.AbstractC10064e;
import defpackage.AbstractC14114e;
import defpackage.AbstractC15448e;
import defpackage.AbstractC16039e;
import defpackage.AbstractC4608e;
import defpackage.AbstractC5304e;
import defpackage.AbstractC6507e;
import defpackage.AbstractC7535e;
import defpackage.AbstractServiceC5057e;
import defpackage.C11318e;
import defpackage.C2473e;
import defpackage.C4013e;
import defpackage.C4662e;
import defpackage.C4870e;
import defpackage.C4891e;
import defpackage.C5981e;
import defpackage.C6029e;
import defpackage.C6571e;
import defpackage.C6626e;
import defpackage.C7371e;
import defpackage.C9042e;
import defpackage.EnumC7785e;
import defpackage.InterfaceC5083e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkx/downloader/service/DownloaderService;", "Leٕؗٞ;", "<init>", "()V", "eؚ٘ۖ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DownloaderService extends AbstractServiceC5057e {

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final /* synthetic */ int f36551e = 0;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C4662e f36552e = new C4662e(10);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final Object f36553e = AbstractC10064e.purchase(new C6571e('\"', '\''), new C6571e('<', '['), new C6571e('>', ']'), new C6571e(':', '-'), new C6571e('*', '+'), new C6571e('?', '_'), new C6571e('/', '_'), new C6571e('\\', '_'), new C6571e('|', '_'));

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e7, code lost:
    
        if (r1.smaato(r8, r3, r11) == r15) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x025f, code lost:
    
        if (r0 == r15) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c2 A[Catch: Exception -> 0x01c6, TryCatch #2 {Exception -> 0x01c6, blocks: (B:121:0x01bc, B:123:0x01c2, B:124:0x01cb, B:126:0x01d1, B:127:0x01d4), top: B:120:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d1 A[Catch: Exception -> 0x01c6, TryCatch #2 {Exception -> 0x01c6, blocks: (B:121:0x01bc, B:123:0x01c2, B:124:0x01cb, B:126:0x01d1, B:127:0x01d4), top: B:120:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x027e A[Catch: Exception -> 0x0077, TryCatch #1 {Exception -> 0x0077, blocks: (B:24:0x0278, B:26:0x027e, B:28:0x028c, B:31:0x0292, B:33:0x02a4, B:36:0x02aa, B:49:0x0271, B:52:0x006b, B:54:0x0202, B:56:0x020a, B:58:0x0210), top: B:51:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020a A[Catch: Exception -> 0x0077, TryCatch #1 {Exception -> 0x0077, blocks: (B:24:0x0278, B:26:0x027e, B:28:0x028c, B:31:0x0292, B:33:0x02a4, B:36:0x02aa, B:49:0x0271, B:52:0x006b, B:54:0x0202, B:56:0x020a, B:58:0x0210), top: B:51:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0210 A[Catch: Exception -> 0x0077, TRY_LEAVE, TryCatch #1 {Exception -> 0x0077, blocks: (B:24:0x0278, B:26:0x027e, B:28:0x028c, B:31:0x0292, B:33:0x02a4, B:36:0x02aa, B:49:0x0271, B:52:0x006b, B:54:0x0202, B:56:0x020a, B:58:0x0210), top: B:51:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.String, ua.itaysonlab.vkapi2.objects.music.AudioTrack, eؔۦۥ, java.lang.Integer, java.io.File, android.media.MediaScannerConnection$OnScanCompletedListener] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mopub(ua.itaysonlab.vkx.downloader.service.DownloaderService r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, ua.itaysonlab.vkapi2.objects.music.AudioTrack r22, defpackage.AbstractC3002e r23, defpackage.C2077e r24, defpackage.AbstractC10731e r25) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.mopub(ua.itaysonlab.vkx.downloader.service.DownloaderService, java.lang.Integer, java.lang.String, java.lang.String, ua.itaysonlab.vkapi2.objects.music.AudioTrack, eؔۦۥ, eؓۚ۠, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|269|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x058f, code lost:
    
        if (r3 == r8) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x054d, code lost:
    
        if (r9.admob(r2, r1, r4) == r8) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0521, code lost:
    
        r0 = r0.appmetrica;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0523, code lost:
    
        if (r0 == null) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0525, code lost:
    
        r0 = r0.license;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0031. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0570 A[Catch: all -> 0x059f, TRY_ENTER, TryCatch #2 {all -> 0x059f, blocks: (B:13:0x003e, B:14:0x0592, B:16:0x0596, B:27:0x0570), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Signature(java.lang.Integer r28, java.lang.Integer r29, defpackage.InterfaceC9354e r30, ua.itaysonlab.vkapi2.objects.music.AudioTrack r31, defpackage.AbstractC10731e r32) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.Signature(java.lang.Integer, java.lang.Integer, eٍٍُ, ua.itaysonlab.vkapi2.objects.music.AudioTrack, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|(1:(1:9)(2:35|36))(4:37|(1:39)(1:44)|40|(1:42)(1:43))|10|11|12|(1:14)(1:27)|(2:22|23)|16|(2:18|19)(1:21)))|45|6|(0)(0)|10|11|12|(0)(0)|(0)|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r8 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        defpackage.AbstractC13362e.license(r2, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #1 {all -> 0x007a, blocks: (B:12:0x006e, B:14:0x0075), top: B:11:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object admob(defpackage.InterfaceC9354e r6, java.lang.String r7, defpackage.AbstractC10731e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C6655e
            if (r0 == 0) goto L13
            r0 = r8
            eؙۛۗ r0 = (defpackage.C6655e) r0
            int r1 = r0.f13728e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13728e = r1
            goto L18
        L13:
            eؙۛۗ r0 = new eؙۛۗ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f13729e
            int r1 = r0.f13728e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            eٍٍُ r6 = r0.f13732e
            eٓٔؔ r7 = r0.f13733e
            eٓٔؔ r1 = r0.f13727e
            eٓٔؔ r0 = r0.f13730e
            defpackage.AbstractC2003e.purchase(r8)
            goto L6c
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.AbstractC2003e.purchase(r8)
            eّۨٙ r8 = defpackage.C12927e.license()
            boolean r8 = r8.loadAd
            if (r8 == 0) goto L47
            eِٝٓ r8 = new eِٝٓ
            r8.<init>()
            goto L4c
        L47:
            eٍٕۖ r8 = new eٍٕۖ
            r8.<init>()
        L4c:
            r0.f13730e = r8
            r0.f13727e = r8
            r0.f13733e = r8
            r0.f13732e = r6
            r0.f13728e = r2
            eّٕٓ r1 = defpackage.AbstractC6731e.ad
            eؕۙۜ r1 = defpackage.ExecutorC3603e.f8134e
            eٍِۗ r2 = new eٍِۗ
            r2.<init>(r7, r3)
            java.lang.Object r7 = defpackage.AbstractC5336e.advert(r1, r2, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L68
            return r0
        L68:
            r0 = r8
            r1 = r0
            r8 = r7
            r7 = r1
        L6c:
            java.io.Closeable r8 = (java.io.Closeable) r8
            r2 = r8
            eٍُ٘ r2 = (defpackage.C11058e) r2     // Catch: java.lang.Throwable -> L7a
            eّۢۧ r2 = r2.f21945e     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L7c
            byte[] r2 = r2.ad()     // Catch: java.lang.Throwable -> L7a
            goto L7d
        L7a:
            r2 = move-exception
            goto L88
        L7c:
            r2 = r3
        L7d:
            if (r8 == 0) goto L84
            r8.close()     // Catch: java.lang.Throwable -> L83
            goto L84
        L83:
            r3 = move-exception
        L84:
            r4 = r3
            r3 = r2
            r2 = r4
            goto L92
        L88:
            if (r8 == 0) goto L92
            r8.close()     // Catch: java.lang.Throwable -> L8e
            goto L92
        L8e:
            r8 = move-exception
            defpackage.AbstractC13362e.license(r2, r8)
        L92:
            if (r2 != 0) goto La6
            r7.ad = r3
            java.lang.String r7 = "image/jpeg"
            r1.vip = r7
            r1.getClass()
            r7 = 3
            r1.metrica = r7
            r6.loadAd(r0)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        La6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.admob(eٍٍُ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0082, B:14:0x0088), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object advert(java.lang.String r6, java.lang.String r7, defpackage.AbstractC10731e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C5126e
            if (r0 == 0) goto L13
            r0 = r8
            eؗۙٝ r0 = (defpackage.C5126e) r0
            int r1 = r0.f10989e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10989e = r1
            goto L18
        L13:
            eؗۙٝ r0 = new eؗۙٝ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f10990e
            int r1 = r0.f10989e
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.io.File r6 = r0.f10991e
            java.lang.String r7 = r0.f10986e
            java.lang.String r0 = r0.f10988e
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Exception -> L2b
            goto L82
        L2b:
            r8 = move-exception
            goto L9a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.AbstractC2003e.purchase(r8)
            eؘٞؐ r8 = defpackage.C5775e.ad
            java.lang.String r1 = r8.ad()
            java.lang.String r6 = r5.loadAd(r6)
            java.lang.String r3 = "/artwork.jpg"
            java.lang.String r6 = r6.concat(r3)
            boolean r8 = r8.vip()
            if (r8 != 0) goto L5c
            eٍٜۢ r8 = r5.startapp()
            boolean r8 = r8.vip(r1, r6)
            if (r8 == 0) goto L5c
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L5c:
            eٍٜۢ r8 = r5.startapp()
            java.io.File r8 = r8.ad(r1, r6)
            r0.f10988e = r1     // Catch: java.lang.Exception -> L98
            r0.f10986e = r6     // Catch: java.lang.Exception -> L98
            r0.f10991e = r8     // Catch: java.lang.Exception -> L98
            r0.f10989e = r2     // Catch: java.lang.Exception -> L98
            eّٕٓ r2 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Exception -> L98
            eؕۙۜ r2 = defpackage.ExecutorC3603e.f8134e     // Catch: java.lang.Exception -> L98
            eؙٓۜ r3 = new eؙٓۜ     // Catch: java.lang.Exception -> L98
            r4 = 0
            r3.<init>(r8, r7, r4)     // Catch: java.lang.Exception -> L98
            java.lang.Object r7 = defpackage.AbstractC5336e.advert(r2, r3, r0)     // Catch: java.lang.Exception -> L98
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L7f
            return r0
        L7f:
            r7 = r6
            r6 = r8
            r0 = r1
        L82:
            boolean r8 = r6.exists()     // Catch: java.lang.Exception -> L2b
            if (r8 == 0) goto L8f
            eٍٜۢ r8 = r5.startapp()     // Catch: java.lang.Exception -> L2b
            r8.license(r6, r0, r7)     // Catch: java.lang.Exception -> L2b
        L8f:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L92:
            r0 = r7
            r7 = r6
            r6 = r8
            r8 = r0
            r0 = r1
            goto L9a
        L98:
            r7 = move-exception
            goto L92
        L9a:
            eٍٜۢ r1 = r5.startapp()
            r1.metrica(r6, r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.advert(java.lang.String, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x013e, code lost:
    
        if (r1 == r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0141, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0151, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014f, code lost:
    
        if (Signature(r18, r19, r3, r20, r5) == r10) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object amazon(java.lang.Integer r18, java.lang.Integer r19, ua.itaysonlab.vkapi2.objects.music.AudioTrack r20, java.io.File r21, defpackage.AbstractC3002e r22, defpackage.AbstractC10731e r23) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.amazon(java.lang.Integer, java.lang.Integer, ua.itaysonlab.vkapi2.objects.music.AudioTrack, java.io.File, eؔۦۥ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractServiceC5057e
    public final AbstractC16039e appmetrica() {
        return new C2473e(this, 1);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    public final String loadAd(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            Character ch = (Character) this.f36553e.get(Character.valueOf(charAt));
            if (ch != null) {
                charAt = ch.charValue();
            }
            sb.append(charAt);
        }
        if (sb.length() > 0 && sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }
        if (sb.length() > 0 && AbstractC5304e.m1858extends(sb) == '.') {
            sb.deleteCharAt(AbstractC5304e.crashlytics(sb));
        }
        return AbstractC6507e.subscription(sb.toString(), "_+", "_", false);
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
        int i = 17;
        C4870e c4870e = new C4870e(this, interfaceC5083e, i);
        C5981e c5981e = AbstractC15448e.ad;
        C6029e c6029e = this.f12041e;
        C4891e c4891e = (C4891e) c6029e.f12699e;
        C4013e c4013e = AbstractC15448e.vip;
        C11318e c11318e = new C11318e(new C7371e(c4013e, 12), new C6626e(c4870e, interfaceC5083e, 2), 3);
        EnumC7785e enumC7785e = EnumC7785e.f15779e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        C9042e c9042e = new C9042e(this, interfaceC5083e, i);
        C4891e c4891e2 = (C4891e) c6029e.f12699e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C7371e(c4013e, 13), new C6626e(c9042e, interfaceC5083e, 4), 3), c4891e2, enumC7785e), AbstractC4608e.metrica(c4891e2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:19|20|21|22|23|24|25|26|27|28|29|30|31|(2:33|(2:35|(5:114|115|30|31|(7:118|(2:120|(5:126|(2:128|129)|16|17|18))|130|(5:132|(1:134)(2:143|(1:145)(2:146|(3:147|(1:149)|150)))|135|(1:137)(1:142)|(2:139|(1:141)))|16|17|18)(0))(2:39|(2:41|42)(25:43|44|45|46|47|48|49|50|51|(4:53|54|55|56)(1:105)|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(2:72|73)(11:74|23|24|25|26|27|28|29|30|31|(0)(0)))))(2:116|117))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:43|(1:44)|45|46|47|48|49|50|51|(4:53|54|55|56)(1:105)|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(2:72|73)(11:74|23|24|25|26|27|28|29|30|31|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:43|44|45|46|47|48|49|50|51|(4:53|54|55|56)(1:105)|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(2:72|73)(11:74|23|24|25|26|27|28|29|30|31|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(4:15|16|17|18)(2:12|13))(14:19|20|21|22|23|24|25|26|27|28|29|30|31|(2:33|(2:35|(5:114|115|30|31|(7:118|(2:120|(5:126|(2:128|129)|16|17|18))|130|(5:132|(1:134)(2:143|(1:145)(2:146|(3:147|(1:149)|150)))|135|(1:137)(1:142)|(2:139|(1:141)))|16|17|18)(0))(2:39|(2:41|42)(25:43|44|45|46|47|48|49|50|51|(4:53|54|55|56)(1:105)|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(2:72|73)(11:74|23|24|25|26|27|28|29|30|31|(0)(0)))))(2:116|117))(0)))(2:163|(2:165|166)(10:167|(2:169|(1:171)(1:185))(2:186|(1:192))|172|(6:177|178|(2:180|(1:182))|183|31|(0)(0))|184|178|(0)|183|31|(0)(0)))))|195|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0288, code lost:
    
        r13 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x027a, code lost:
    
        r25 = r9;
        r23 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x028b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x028c, code lost:
    
        r13 = r25;
        r22 = r2;
        r21 = r7;
        r25 = r9;
        r23 = r19;
        r9 = r20;
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0279, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0247, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0248, code lost:
    
        r2 = r8;
        r8 = r3;
        r3 = r2;
        r2 = r20;
        r20 = r4;
        r4 = r9;
        r9 = r12;
        r12 = r2;
        r2 = r7;
        r7 = r10;
        r10 = r11;
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03a2, code lost:
    
        r0.printStackTrace();
        r1.billing().adcel(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x025c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x025d, code lost:
    
        r23 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x025f, code lost:
    
        r3 = r20;
        r7 = r21;
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0265, code lost:
    
        r20 = r4;
        r4 = r9;
        r9 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x026b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026c, code lost:
    
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x026e, code lost:
    
        r23 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0277, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0287, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0305 A[Catch: Exception -> 0x0036, TryCatch #6 {Exception -> 0x0036, blocks: (B:15:0x0031, B:16:0x039a, B:31:0x0159, B:33:0x015f, B:35:0x0167, B:37:0x016f, B:39:0x017e, B:41:0x0186, B:43:0x0189, B:88:0x02bf, B:90:0x02d8, B:91:0x02f9, B:116:0x0301, B:117:0x0304, B:118:0x0305, B:120:0x030a, B:122:0x0313, B:124:0x0317, B:126:0x031b, B:130:0x033d, B:132:0x0341, B:135:0x0376, B:137:0x037a, B:139:0x0380, B:143:0x0353, B:146:0x035e, B:147:0x0363, B:150:0x0370, B:167:0x00a9, B:169:0x00c0, B:171:0x00cb, B:172:0x010c, B:174:0x0110, B:178:0x0118, B:180:0x012f, B:182:0x0146, B:183:0x014d, B:185:0x00f7, B:186:0x0100, B:189:0x0106), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x012f A[Catch: Exception -> 0x0036, TryCatch #6 {Exception -> 0x0036, blocks: (B:15:0x0031, B:16:0x039a, B:31:0x0159, B:33:0x015f, B:35:0x0167, B:37:0x016f, B:39:0x017e, B:41:0x0186, B:43:0x0189, B:88:0x02bf, B:90:0x02d8, B:91:0x02f9, B:116:0x0301, B:117:0x0304, B:118:0x0305, B:120:0x030a, B:122:0x0313, B:124:0x0317, B:126:0x031b, B:130:0x033d, B:132:0x0341, B:135:0x0376, B:137:0x037a, B:139:0x0380, B:143:0x0353, B:146:0x035e, B:147:0x0363, B:150:0x0370, B:167:0x00a9, B:169:0x00c0, B:171:0x00cb, B:172:0x010c, B:174:0x0110, B:178:0x0118, B:180:0x012f, B:182:0x0146, B:183:0x014d, B:185:0x00f7, B:186:0x0100, B:189:0x0106), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f A[Catch: Exception -> 0x0036, TryCatch #6 {Exception -> 0x0036, blocks: (B:15:0x0031, B:16:0x039a, B:31:0x0159, B:33:0x015f, B:35:0x0167, B:37:0x016f, B:39:0x017e, B:41:0x0186, B:43:0x0189, B:88:0x02bf, B:90:0x02d8, B:91:0x02f9, B:116:0x0301, B:117:0x0304, B:118:0x0305, B:120:0x030a, B:122:0x0313, B:124:0x0317, B:126:0x031b, B:130:0x033d, B:132:0x0341, B:135:0x0376, B:137:0x037a, B:139:0x0380, B:143:0x0353, B:146:0x035e, B:147:0x0363, B:150:0x0370, B:167:0x00a9, B:169:0x00c0, B:171:0x00cb, B:172:0x010c, B:174:0x0110, B:178:0x0118, B:180:0x012f, B:182:0x0146, B:183:0x014d, B:185:0x00f7, B:186:0x0100, B:189:0x0106), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a0 A[Catch: Exception -> 0x02ae, TryCatch #0 {Exception -> 0x02ae, blocks: (B:81:0x029b, B:83:0x02a0, B:84:0x02aa, B:85:0x02ad), top: B:80:0x029b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02aa A[Catch: Exception -> 0x02ae, TryCatch #0 {Exception -> 0x02ae, blocks: (B:81:0x029b, B:83:0x02a0, B:84:0x02aa, B:85:0x02ad), top: B:80:0x029b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d8 A[Catch: Exception -> 0x0036, TryCatch #6 {Exception -> 0x0036, blocks: (B:15:0x0031, B:16:0x039a, B:31:0x0159, B:33:0x015f, B:35:0x0167, B:37:0x016f, B:39:0x017e, B:41:0x0186, B:43:0x0189, B:88:0x02bf, B:90:0x02d8, B:91:0x02f9, B:116:0x0301, B:117:0x0304, B:118:0x0305, B:120:0x030a, B:122:0x0313, B:124:0x0317, B:126:0x031b, B:130:0x033d, B:132:0x0341, B:135:0x0376, B:137:0x037a, B:139:0x0380, B:143:0x0353, B:146:0x035e, B:147:0x0363, B:150:0x0370, B:167:0x00a9, B:169:0x00c0, B:171:0x00cb, B:172:0x010c, B:174:0x0110, B:178:0x0118, B:180:0x012f, B:182:0x0146, B:183:0x014d, B:185:0x00f7, B:186:0x0100, B:189:0x0106), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f9 A[Catch: Exception -> 0x0036, TryCatch #6 {Exception -> 0x0036, blocks: (B:15:0x0031, B:16:0x039a, B:31:0x0159, B:33:0x015f, B:35:0x0167, B:37:0x016f, B:39:0x017e, B:41:0x0186, B:43:0x0189, B:88:0x02bf, B:90:0x02d8, B:91:0x02f9, B:116:0x0301, B:117:0x0304, B:118:0x0305, B:120:0x030a, B:122:0x0313, B:124:0x0317, B:126:0x031b, B:130:0x033d, B:132:0x0341, B:135:0x0376, B:137:0x037a, B:139:0x0380, B:143:0x0353, B:146:0x035e, B:147:0x0363, B:150:0x0370, B:167:0x00a9, B:169:0x00c0, B:171:0x00cb, B:172:0x010c, B:174:0x0110, B:178:0x0118, B:180:0x012f, B:182:0x0146, B:183:0x014d, B:185:0x00f7, B:186:0x0100, B:189:0x0106), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r2v34, types: [eؙٛ, java.util.Iterator, eؔۦۥ, java.lang.String, ua.itaysonlab.vkapi2.objects.music.AudioTrack] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x02fa -> B:30:0x02fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0222 -> B:23:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x02a0 -> B:47:0x01a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x02d8 -> B:29:0x02ef). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractServiceC5057e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(defpackage.AbstractC3002e r25, defpackage.AbstractC10731e r26) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.purchase(eؔۦۥ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0101 A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:18:0x0092, B:20:0x00b8, B:22:0x00bc, B:23:0x00ce, B:24:0x00fb, B:26:0x0101, B:29:0x0109, B:34:0x010d, B:35:0x0112, B:37:0x0118, B:39:0x0120, B:41:0x013e, B:46:0x0143, B:47:0x0146, B:50:0x0147), top: B:17:0x0092, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118 A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:18:0x0092, B:20:0x00b8, B:22:0x00bc, B:23:0x00ce, B:24:0x00fb, B:26:0x0101, B:29:0x0109, B:34:0x010d, B:35:0x0112, B:37:0x0118, B:39:0x0120, B:41:0x013e, B:46:0x0143, B:47:0x0146, B:50:0x0147), top: B:17:0x0092, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a A[Catch: Exception -> 0x0168, TryCatch #1 {Exception -> 0x0168, blocks: (B:16:0x0089, B:54:0x015a, B:56:0x0160, B:57:0x016a, B:67:0x0154, B:63:0x014f, B:18:0x0092, B:20:0x00b8, B:22:0x00bc, B:23:0x00ce, B:24:0x00fb, B:26:0x0101, B:29:0x0109, B:34:0x010d, B:35:0x0112, B:37:0x0118, B:39:0x0120, B:41:0x013e, B:46:0x0143, B:47:0x0146, B:50:0x0147), top: B:15:0x0089, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a A[Catch: Exception -> 0x0168, TRY_LEAVE, TryCatch #1 {Exception -> 0x0168, blocks: (B:16:0x0089, B:54:0x015a, B:56:0x0160, B:57:0x016a, B:67:0x0154, B:63:0x014f, B:18:0x0092, B:20:0x00b8, B:22:0x00bc, B:23:0x00ce, B:24:0x00fb, B:26:0x0101, B:29:0x0109, B:34:0x010d, B:35:0x0112, B:37:0x0118, B:39:0x0120, B:41:0x013e, B:46:0x0143, B:47:0x0146, B:50:0x0147), top: B:15:0x0089, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object smaato(ua.itaysonlab.vkapi2.objects.music.AudioTrack r12, java.lang.String r13, defpackage.AbstractC10731e r14) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.smaato(ua.itaysonlab.vkapi2.objects.music.AudioTrack, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e4, code lost:
    
        if (admob(r7, r8, r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r9 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object subscription(defpackage.InterfaceC9354e r7, ua.itaysonlab.vkapi2.objects.music.AudioTrack r8, defpackage.AbstractC10731e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C18337e
            if (r0 == 0) goto L13
            r0 = r9
            eۙؓ r0 = (defpackage.C18337e) r0
            int r1 = r0.f36008e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36008e = r1
            goto L18
        L13:
            eۙؓ r0 = new eۙؓ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f36006e
            int r1 = r0.f36008e
            r2 = 2
            r3 = 1
            r4 = 0
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            defpackage.AbstractC2003e.purchase(r9)
            goto Le7
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            eٍٍُ r7 = r0.f36007e
            defpackage.AbstractC2003e.purchase(r9)
            goto L52
        L3a:
            defpackage.AbstractC2003e.purchase(r9)
            eّٕٓ r9 = defpackage.AbstractC6731e.ad
            eؕۙۜ r9 = defpackage.ExecutorC3603e.f8134e
            eٓۡٛ r1 = new eٓۡٛ
            r1.<init>(r8, r4, r2)
            r0.f36007e = r7
            r0.f36008e = r3
            java.lang.Object r9 = defpackage.AbstractC5336e.advert(r9, r1, r0)
            if (r9 != r5) goto L52
            goto Le6
        L52:
            ua.itaysonlab.itunesutil.ItunesSearch$ItunesItem r9 = (ua.itaysonlab.itunesutil.ItunesSearch$ItunesItem) r9
            if (r9 != 0) goto L59
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L59:
            java.lang.String r8 = r9.metrica
            java.lang.String[] r8 = new java.lang.String[]{r8}
            eًّۡ r1 = defpackage.EnumC8271e.TITLE
            r7.mopub(r1, r8)
            java.lang.String r8 = r9.vip
            java.lang.String[] r8 = new java.lang.String[]{r8}
            eًّۡ r1 = defpackage.EnumC8271e.ARTIST
            r7.mopub(r1, r8)
            java.lang.String r8 = r9.license
            java.lang.String[] r8 = new java.lang.String[]{r8}
            eًّۡ r1 = defpackage.EnumC8271e.ALBUM
            r7.mopub(r1, r8)
            java.lang.String r8 = r9.advert
            if (r8 == 0) goto L87
            eًّۡ r1 = defpackage.EnumC8271e.GENRE
            java.lang.String[] r8 = new java.lang.String[]{r8}
            r7.mopub(r1, r8)
        L87:
            java.lang.String r8 = r9.billing
            r1 = 0
            r3 = 4
            java.lang.String r8 = r8.substring(r1, r3)
            java.lang.String[] r8 = new java.lang.String[]{r8}
            eًّۡ r1 = defpackage.EnumC8271e.YEAR
            r7.mopub(r1, r8)
            java.lang.Integer r8 = r9.yandex
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String[] r8 = new java.lang.String[]{r8}
            eًّۡ r1 = defpackage.EnumC8271e.DISC_TOTAL
            r7.mopub(r1, r8)
            java.lang.Integer r8 = r9.startapp
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String[] r8 = new java.lang.String[]{r8}
            eًّۡ r1 = defpackage.EnumC8271e.DISC_NO
            r7.mopub(r1, r8)
            java.lang.Integer r8 = r9.adcel
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String[] r8 = new java.lang.String[]{r8}
            eًّۡ r1 = defpackage.EnumC8271e.TRACK_TOTAL
            r7.mopub(r1, r8)
            java.lang.Integer r8 = r9.mopub
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String[] r8 = new java.lang.String[]{r8}
            eًّۡ r1 = defpackage.EnumC8271e.TRACK
            r7.mopub(r1, r8)
            eؗؗ۠ r8 = defpackage.C4680e.ad
            eؘ۠ٙ r8 = defpackage.EnumC5953e.HIGH
            java.lang.String r8 = defpackage.C4680e.ad(r9, r8)
            r0.f36007e = r4
            r0.f36008e = r2
            java.lang.Object r7 = r6.admob(r7, r8, r0)
            if (r7 != r5) goto Le7
        Le6:
            return r5
        Le7:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.subscription(eٍٍُ, ua.itaysonlab.vkapi2.objects.music.AudioTrack, eُؑ۠):java.lang.Object");
    }
}
