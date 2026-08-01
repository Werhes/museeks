package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.AlgorithmParameters;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0827e implements InterfaceC10597e {
    public final C2532e ad;

    public AbstractC0827e(C2532e c2532e) {
        this.ad = c2532e;
    }

    public final AlgorithmParameters ad(AlgorithmParameterSpec algorithmParameterSpec) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.ad.f6384e;
        Object obj = concurrentHashMap.get("EC");
        if (obj == null) {
            AbstractC10732e abstractC10732e = new AbstractC10732e(new C2997e(16));
            Object putIfAbsent = concurrentHashMap.putIfAbsent("EC", abstractC10732e);
            obj = putIfAbsent == null ? abstractC10732e : putIfAbsent;
        }
        AbstractC10732e abstractC10732e2 = (AbstractC10732e) obj;
        Object ad = abstractC10732e2.ad();
        try {
            AlgorithmParameters algorithmParameters = (AlgorithmParameters) ad;
            abstractC10732e2.vip(ad);
            algorithmParameters.init(algorithmParameterSpec);
            return algorithmParameters;
        } catch (Throwable th) {
            abstractC10732e2.vip(ad);
            throw th;
        }
    }

    public abstract InterfaceC16989e vip(PublicKey publicKey);
}
