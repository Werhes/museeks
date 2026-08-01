package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٚۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1925e implements InterfaceC7224e {
    public final /* synthetic */ InterfaceC7224e ad;
    public final Object license;
    public final Function4 metrica;
    public final boolean vip;
    public final C14826e appmetrica = AbstractC8461e.license(this);
    public final C5609e purchase = new C5609e(Boolean.TRUE);
    public final C5609e billing = new C5609e(Boolean.FALSE);
    public final C5609e yandex = new C5609e(BuildConfig.FLAVOR);
    public final C5609e startapp = new C5609e(C10327e.f20377e);

    public C1925e(InterfaceC7224e interfaceC7224e, boolean z, Function4 function4, Function0 function0) {
        this.ad = interfaceC7224e;
        this.vip = z;
        this.metrica = function4;
        this.license = function0;
        InterfaceC10540e vip = interfaceC7224e.vip();
        vip.smaato(new C11898e(vip, this, 5));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:1|(2:3|(27:5|6|7|8|(1:(1:(3:12|13|14)(2:68|69))(3:70|71|72))(5:73|74|75|(4:77|(1:79)(1:85)|80|(1:82)(2:84|72))(5:86|(1:88)(1:93)|89|90|(2:92|14))|83)|15|(2:18|16)|19|20|(4:23|(3:29|30|31)(3:25|26|27)|28|21)|32|33|(1:67)(1:37)|38|(1:40)(1:66)|(1:65)(1:44)|(10:48|49|(1:51)|52|(1:54)(1:63)|55|56|(1:58)|59|60)|64|49|(0)|52|(0)(0)|55|56|(0)|59|60))|97|6|7|8|(0)(0)|15|(1:16)|19|20|(1:21)|32|33|(1:35)|67|38|(0)(0)|(1:42)|65|(10:48|49|(0)|52|(0)(0)|55|56|(0)|59|60)|64|49|(0)|52|(0)(0)|55|56|(0)|59|60) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ee, code lost:
    
        r14 = new defpackage.C12763e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010b A[Catch: all -> 0x0031, LOOP:0: B:16:0x0105->B:18:0x010b, LOOP_END, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:14:0x00ec, B:15:0x00f6, B:16:0x0105, B:18:0x010b, B:20:0x0136, B:21:0x0144, B:23:0x014a, B:30:0x0163, B:26:0x0167, B:33:0x016b, B:35:0x017c, B:38:0x0185, B:40:0x0193, B:42:0x0199, B:49:0x01b6, B:51:0x01bf, B:52:0x01c4, B:55:0x01e4, B:71:0x003f, B:72:0x00a1, B:74:0x004b, B:77:0x0061, B:79:0x0083, B:80:0x008c, B:85:0x0088, B:86:0x00ac, B:88:0x00c9, B:90:0x00d4, B:93:0x00cf), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014a A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:14:0x00ec, B:15:0x00f6, B:16:0x0105, B:18:0x010b, B:20:0x0136, B:21:0x0144, B:23:0x014a, B:30:0x0163, B:26:0x0167, B:33:0x016b, B:35:0x017c, B:38:0x0185, B:40:0x0193, B:42:0x0199, B:49:0x01b6, B:51:0x01bf, B:52:0x01c4, B:55:0x01e4, B:71:0x003f, B:72:0x00a1, B:74:0x004b, B:77:0x0061, B:79:0x0083, B:80:0x008c, B:85:0x0088, B:86:0x00ac, B:88:0x00c9, B:90:0x00d4, B:93:0x00cf), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0193 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:14:0x00ec, B:15:0x00f6, B:16:0x0105, B:18:0x010b, B:20:0x0136, B:21:0x0144, B:23:0x014a, B:30:0x0163, B:26:0x0167, B:33:0x016b, B:35:0x017c, B:38:0x0185, B:40:0x0193, B:42:0x0199, B:49:0x01b6, B:51:0x01bf, B:52:0x01c4, B:55:0x01e4, B:71:0x003f, B:72:0x00a1, B:74:0x004b, B:77:0x0061, B:79:0x0083, B:80:0x008c, B:85:0x0088, B:86:0x00ac, B:88:0x00c9, B:90:0x00d4, B:93:0x00cf), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bf A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:14:0x00ec, B:15:0x00f6, B:16:0x0105, B:18:0x010b, B:20:0x0136, B:21:0x0144, B:23:0x014a, B:30:0x0163, B:26:0x0167, B:33:0x016b, B:35:0x017c, B:38:0x0185, B:40:0x0193, B:42:0x0199, B:49:0x01b6, B:51:0x01bf, B:52:0x01c4, B:55:0x01e4, B:71:0x003f, B:72:0x00a1, B:74:0x004b, B:77:0x0061, B:79:0x0083, B:80:0x008c, B:85:0x0088, B:86:0x00ac, B:88:0x00c9, B:90:0x00d4, B:93:0x00cf), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r14) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1925e.ad(eُؑ۠):java.lang.Object");
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
