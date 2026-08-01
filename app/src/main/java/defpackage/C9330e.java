package defpackage;

import java.io.InputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9330e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final HashMap f18591e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C1400e f18592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9330e(InputStream inputStream) {
        super(inputStream);
        EnumC11433e enumC11433e = EnumC11433e.f22984e;
        C1400e c1400e = C1400e.f4213e;
        this.f18591e = new HashMap();
        this.f18592e = c1400e;
        InterfaceC13403e[] interfaceC13403eArr = {C14022e.vip, C14022e.metrica, C14022e.license, C5151e.appmetrica, C5151e.purchase, C5151e.advert, C5151e.billing, C5151e.yandex, C5151e.license, C3444e.metrica, C5151e.startapp, C3444e.appmetrica, C3444e.license, C5151e.adcel, C5151e.metrica, C5151e.mopub, C5151e.smaato, C5151e.amazon};
        for (int i = 0; i < 18; i++) {
            InterfaceC13403e interfaceC13403e = interfaceC13403eArr[i];
            this.f18591e.put(interfaceC13403e.amazon(), interfaceC13403e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x011c, code lost:
    
        r0 = r2.purchase();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012c, code lost:
    
        if (((java.util.Set) defpackage.C5389e.pro(r0, r4).f11540e).isEmpty() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0136, code lost:
    
        throw new defpackage.C2123e(10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, eِؖۙ] */
    @Override // defpackage.InterfaceC2088e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C11154e appmetrica() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9330e.appmetrica():eُٞۖ");
    }
}
