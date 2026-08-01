package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۡٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6714e {
    public final C8928e ad;
    public final C7988e adcel = new C7988e(5);
    public final InterfaceC9550e appmetrica;
    public final InterfaceC2531e billing;
    public final C1209e license;
    public final C6140e metrica;
    public final DynamicRangeProfiles mopub;
    public final InterfaceC11623e purchase;
    public final C17424e startapp;
    public final C3154e vip;
    public final C4373e yandex;

    public C6714e(C8928e c8928e, C3154e c3154e, C6140e c6140e, C1209e c1209e, InterfaceC9550e interfaceC9550e, InterfaceC11623e interfaceC11623e, InterfaceC2531e interfaceC2531e, C4373e c4373e, C17424e c17424e) {
        this.ad = c8928e;
        this.vip = c3154e;
        this.metrica = c6140e;
        this.license = c1209e;
        this.appmetrica = interfaceC9550e;
        this.purchase = interfaceC11623e;
        this.billing = interfaceC2531e;
        this.yandex = c4373e;
        this.startapp = c17424e;
        int i = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfiles = null;
        if (i >= 33 && interfaceC2531e != null) {
            C2691e appmetrica = AbstractC14380e.appmetrica(interfaceC2531e);
            if (i < 33) {
                throw new IllegalStateException(AbstractC1634e.smaato("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", i, " (requires API 33)").toString());
            }
            dynamicRangeProfiles = ((InterfaceC2489e) appmetrica.f6570e).ad();
        }
        this.mopub = dynamicRangeProfiles;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0199, code lost:
    
        if ((r5 >= 0) == true) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C6088e ad(int r36, defpackage.C11469e r37, boolean r38, defpackage.C5373e r39, java.lang.Integer r40, java.util.Map r41, java.util.Map r42) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6714e.ad(int, eِؒ۠, boolean, eؘؒٝ, java.lang.Integer, java.util.Map, java.util.Map):eؘٟۨ");
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) C5060e.vip(this.metrica.f12912e)) + '>';
    }
}
