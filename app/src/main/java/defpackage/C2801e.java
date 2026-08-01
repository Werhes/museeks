package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۘؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2801e implements InterfaceC6744e {
    public final boolean appmetrica;
    public final LinkedHashMap billing = new LinkedHashMap();
    public final C3909e license;
    public final String metrica;
    public final int purchase;

    public C2801e(String str, C3909e c3909e) {
        boolean z;
        int i;
        this.metrica = str;
        this.license = c3909e;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            AbstractC9464e.remoteconfig("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + this.metrica + ", unable to create EncoderProfilesProviderAdapter.");
            z = false;
            i = -1;
        }
        this.appmetrica = z;
        this.purchase = i;
    }

    @Override // defpackage.InterfaceC6744e
    public final boolean ad(int i) {
        return this.appmetrica && vip(i) != null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:10|(6:12|(2:46|(1:48)(6:49|50|(1:52)(1:(1:54)(2:55|56))|(4:16|(2:41|(2:43|(3:20|(1:(2:23|(2:24|(1:31)(2:26|(2:28|29)(1:30)))))(2:33|(1:(1:40)(2:35|(2:38|39)(1:37))))|32)))|18|(0))|44|45))|14|(0)|44|45)|60|61|(14:63|(1:65)|66|67|69|70|(2:72|(1:(1:75)(1:76)))(1:90)|77|78|80|81|(0)|44|45)|14|(0)|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0083, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0084, code lost:
    
        defpackage.AbstractC9464e.pro("EncoderProfilesProviderAdapter", "Unable to get CamcorderProfile by quality: " + r22, r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016d  */
    @Override // defpackage.InterfaceC6744e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.InterfaceC16104e vip(int r22) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2801e.vip(int):eَؙٖ");
    }
}
