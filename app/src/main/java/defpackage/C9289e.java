package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9289e implements InterfaceC7224e {
    public final /* synthetic */ InterfaceC7224e ad;
    public final C5609e adcel;
    public final C14826e appmetrica = AbstractC8461e.license(this);
    public final C5609e billing;
    public final C13465e license;
    public final C0682e metrica;
    public final C5609e purchase;
    public final C5609e startapp;
    public final C10981e vip;
    public final C5609e yandex;

    public C9289e(InterfaceC7224e interfaceC7224e, C10981e c10981e, C0682e c0682e, C13465e c13465e) {
        this.ad = interfaceC7224e;
        this.vip = c10981e;
        this.metrica = c0682e;
        this.license = c13465e;
        C16251e c16251e = C16251e.ad;
        this.purchase = new C5609e(Boolean.valueOf(!C16251e.metrica(EnumC14893e.f29514e)));
        this.billing = new C5609e(Boolean.TRUE);
        this.yandex = new C5609e(Boolean.FALSE);
        this.startapp = new C5609e(BuildConfig.FLAVOR);
        this.adcel = new C5609e(C10327e.f20377e);
        InterfaceC10540e vip = interfaceC7224e.vip();
        vip.smaato(new C11898e(vip, this, 3));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:1|(2:3|(29:5|6|7|8|(1:(1:(3:12|13|14)(2:71|72))(3:73|74|75))(5:76|77|78|(2:80|(1:82)(2:84|75))(2:85|(2:87|14))|83)|15|(2:18|16)|19|20|(4:23|(3:29|30|31)(3:25|26|27)|28|21)|32|33|(1:70)(1:37)|38|(1:40)(1:69)|(1:68)(1:44)|(12:48|49|(1:51)|52|(1:54)|55|(1:57)(1:66)|58|59|(1:61)|62|63)|67|49|(0)|52|(0)|55|(0)(0)|58|59|(0)|62|63))|91|6|7|8|(0)(0)|15|(1:16)|19|20|(1:21)|32|33|(1:35)|70|38|(0)(0)|(1:42)|68|(12:48|49|(0)|52|(0)|55|(0)(0)|58|59|(0)|62|63)|67|49|(0)|52|(0)|55|(0)(0)|58|59|(0)|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e0, code lost:
    
        r14 = new defpackage.C12763e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea A[Catch: all -> 0x0031, LOOP:0: B:16:0x00e4->B:18:0x00ea, LOOP_END, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:14:0x00cb, B:15:0x00d5, B:16:0x00e4, B:18:0x00ea, B:20:0x0115, B:21:0x0123, B:23:0x0129, B:30:0x0142, B:26:0x0146, B:33:0x014a, B:35:0x0167, B:38:0x0170, B:40:0x017e, B:42:0x0184, B:49:0x01a1, B:51:0x01a7, B:52:0x01ac, B:54:0x01b1, B:55:0x01b6, B:58:0x01d6, B:74:0x003f, B:75:0x008e, B:77:0x004b, B:80:0x005b, B:85:0x0099), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0129 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:14:0x00cb, B:15:0x00d5, B:16:0x00e4, B:18:0x00ea, B:20:0x0115, B:21:0x0123, B:23:0x0129, B:30:0x0142, B:26:0x0146, B:33:0x014a, B:35:0x0167, B:38:0x0170, B:40:0x017e, B:42:0x0184, B:49:0x01a1, B:51:0x01a7, B:52:0x01ac, B:54:0x01b1, B:55:0x01b6, B:58:0x01d6, B:74:0x003f, B:75:0x008e, B:77:0x004b, B:80:0x005b, B:85:0x0099), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017e A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:14:0x00cb, B:15:0x00d5, B:16:0x00e4, B:18:0x00ea, B:20:0x0115, B:21:0x0123, B:23:0x0129, B:30:0x0142, B:26:0x0146, B:33:0x014a, B:35:0x0167, B:38:0x0170, B:40:0x017e, B:42:0x0184, B:49:0x01a1, B:51:0x01a7, B:52:0x01ac, B:54:0x01b1, B:55:0x01b6, B:58:0x01d6, B:74:0x003f, B:75:0x008e, B:77:0x004b, B:80:0x005b, B:85:0x0099), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a7 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:14:0x00cb, B:15:0x00d5, B:16:0x00e4, B:18:0x00ea, B:20:0x0115, B:21:0x0123, B:23:0x0129, B:30:0x0142, B:26:0x0146, B:33:0x014a, B:35:0x0167, B:38:0x0170, B:40:0x017e, B:42:0x0184, B:49:0x01a1, B:51:0x01a7, B:52:0x01ac, B:54:0x01b1, B:55:0x01b6, B:58:0x01d6, B:74:0x003f, B:75:0x008e, B:77:0x004b, B:80:0x005b, B:85:0x0099), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b1 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:14:0x00cb, B:15:0x00d5, B:16:0x00e4, B:18:0x00ea, B:20:0x0115, B:21:0x0123, B:23:0x0129, B:30:0x0142, B:26:0x0146, B:33:0x014a, B:35:0x0167, B:38:0x0170, B:40:0x017e, B:42:0x0184, B:49:0x01a1, B:51:0x01a7, B:52:0x01ac, B:54:0x01b1, B:55:0x01b6, B:58:0x01d6, B:74:0x003f, B:75:0x008e, B:77:0x004b, B:80:0x005b, B:85:0x0099), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r14) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9289e.ad(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC1722e appmetrica() {
        return this.ad.appmetrica();
    }

    @Override // defpackage.InterfaceC7224e
    public final C13391e license() {
        return this.ad.license();
    }

    @Override // defpackage.InterfaceC7224e
    public final C16722e metrica() {
        return this.ad.metrica();
    }

    @Override // defpackage.InterfaceC7224e
    public final C15723e purchase() {
        return this.ad.purchase();
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC10540e vip() {
        return this.ad.vip();
    }
}
