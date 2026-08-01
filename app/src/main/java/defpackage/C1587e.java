package defpackage;

import java.util.ArrayList;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioLyricTimestamp;
import ua.itaysonlab.vkapi2.objects.music.AudioLyrics;
import ua.itaysonlab.vkapi2.objects.music.AudioLyricsContainer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1587e implements InterfaceC8152e {
    public final /* synthetic */ int ad;
    public static final C1587e vip = new C1587e(0);
    public static final C1587e metrica = new C1587e(1);
    public static final C1587e license = new C1587e(2);
    public static final C1587e appmetrica = new C1587e(3);

    public /* synthetic */ C1587e(int i) {
        this.ad = i;
    }

    public static InterfaceC2558e metrica(AudioLyricsContainer audioLyricsContainer) {
        String str = audioLyricsContainer.metrica;
        AudioLyrics audioLyrics = audioLyricsContainer.vip;
        if (audioLyrics.ad.isEmpty()) {
            List list = audioLyrics.vip;
            String str2 = (String) AbstractC13480e.m3569abstract(list);
            if (str2 != null && str2.length() == 0) {
                list = AbstractC13480e.crashlytics(list);
            }
            return new C10874e(AbstractC13480e.m3608try(list, "\n", null, null, null, 62), str);
        }
        List<AudioLyricTimestamp> list2 = audioLyrics.ad;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list2, 10));
        for (AudioLyricTimestamp audioLyricTimestamp : list2) {
            arrayList.add(audioLyricTimestamp.license ? new C13356e(audioLyricTimestamp.ad, audioLyricTimestamp.vip) : new C16523e(audioLyricTimestamp.metrica, audioLyricTimestamp.ad, audioLyricTimestamp.vip));
        }
        return new C0160e(arrayList, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    @Override // defpackage.InterfaceC8152e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.C9398e r23, defpackage.AbstractC16049e r24, defpackage.InterfaceC5083e r25) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1587e.ad(eٍُۘ, eؙٖۛ, eًؗۖ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|(1:(1:(2:10|(2:12|(1:34)(5:16|(2:19|17)|20|21|(1:32)(3:25|26|27)))(2:36|37))(2:38|39))(1:40))(1:50)|41|42|43|44|(2:47|(0)(0))|46))|52|6|(0)(0)|41|42|43|44|(0)|46|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008d, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0077, code lost:
    
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object appmetrica(defpackage.C9398e r8, defpackage.AbstractC16049e r9, java.lang.String r10, defpackage.AbstractC10731e r11) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1587e.appmetrica(eٍُۘ, eؙٖۛ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r9 == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r9 == r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object license(defpackage.C9398e r6, defpackage.AbstractC16049e r7, java.lang.String r8, defpackage.AbstractC10731e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.C8084e
            if (r0 == 0) goto L13
            r0 = r9
            eًٝ۠ r0 = (defpackage.C8084e) r0
            int r1 = r0.f16431e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16431e = r1
            goto L18
        L13:
            eًٝ۠ r0 = new eًٝ۠
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f16429e
            int r1 = r0.f16431e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r9)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            eٍُۘ r6 = r0.f16430e
            defpackage.AbstractC2003e.purchase(r9)
            goto L46
        L38:
            defpackage.AbstractC2003e.purchase(r9)
            r0.f16430e = r6
            r0.f16431e = r3
            java.lang.Object r9 = r5.appmetrica(r6, r7, r8, r0)
            if (r9 != r4) goto L46
            goto L5b
        L46:
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 == 0) goto L62
            long r7 = r9.longValue()
            r9 = 0
            r0.f16430e = r9
            r0.f16431e = r2
            eٖؓؕ r9 = defpackage.C1587e.vip
            java.lang.Object r9 = r9.vip(r6, r7, r0)
            if (r9 != r4) goto L5c
        L5b:
            return r4
        L5c:
            eْۣؔ r9 = (defpackage.InterfaceC2558e) r9
            if (r9 != 0) goto L61
            goto L62
        L61:
            return r9
        L62:
            eٍؔٗ r6 = defpackage.C2471e.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1587e.license(eٍُۘ, eؙٖۛ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|(2:24|25)(5:16|(1:18)|(1:20)|21|22))(2:26|27))(2:28|29))(1:30))(1:39)|31|32|33|34))|41|6|(0)(0)|31|32|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r13 != r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        if (r13 == r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object vip(defpackage.C9398e r10, long r11, defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1587e.vip(eٍُۘ, long, eُؑ۠):java.lang.Object");
    }
}
