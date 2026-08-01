package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3444e implements InterfaceC11571e {
    public final InterfaceC13403e ad;
    public final C14022e vip;
    public static final C3210e metrica = new C3210e(0);
    public static final C3210e license = new C3210e(1);
    public static final C3210e appmetrica = new C3210e(2);

    public C3444e(InterfaceC13403e interfaceC13403e) {
        C14022e c14022e = new C14022e(interfaceC13403e);
        this.ad = interfaceC13403e;
        this.vip = c14022e;
    }

    public static HashMap vip(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("BANDWIDTH", new C13869e(str, 0));
        hashMap.put("AVERAGE-BANDWIDTH", new C13869e(str, 1));
        hashMap.put("CODECS", new C13869e(str, 2));
        hashMap.put("RESOLUTION", new C13869e(str, 3));
        hashMap.put("FRAME-RATE", new C13869e(str, 4));
        hashMap.put("VIDEO", new C13869e(str, 5));
        hashMap.put("PROGRAM-ID", new C5199e());
        return hashMap;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [eۣٓٚ, java.lang.Object] */
    @Override // defpackage.InterfaceC11571e
    public final void ad(String str, C4052e c4052e) {
        C14518e c14518e = (C14518e) c4052e.f9005e;
        if (c14518e != null) {
            throw C15608e.ad(this.ad.amazon(), 21, null);
        }
        if (c14518e != null) {
            throw new C15608e(21, null);
        }
        if (((C14341e) c4052e.f8999e) == null) {
            ?? obj = new Object();
            obj.f28366e = new ArrayList();
            obj.f28373e = new ArrayList();
            obj.f28372e = new ArrayList();
            c4052e.f8999e = obj;
        }
        this.vip.ad(str, c4052e);
    }
}
