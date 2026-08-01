package defpackage;

import java.security.PrivilegedAction;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: eٓۙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14208e implements PrivilegedAction {
    public final /* synthetic */ int ad;
    public final /* synthetic */ AlgorithmParameterSpec vip;

    public /* synthetic */ C14208e(AlgorithmParameterSpec algorithmParameterSpec, int i) {
        this.ad = i;
        this.vip = algorithmParameterSpec;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.ad) {
            case 0:
                AlgorithmParameterSpec algorithmParameterSpec = this.vip;
                try {
                    return algorithmParameterSpec.getClass().getMethod("getName", AbstractC10589e.ad).invoke(algorithmParameterSpec, AbstractC10589e.vip);
                } catch (Exception unused) {
                    return null;
                }
            default:
                AlgorithmParameterSpec algorithmParameterSpec2 = this.vip;
                try {
                    return algorithmParameterSpec2.getClass().getMethod("getContext", AbstractC10589e.ad).invoke(algorithmParameterSpec2, AbstractC10589e.vip);
                } catch (Exception unused2) {
                    return null;
                }
        }
    }
}
