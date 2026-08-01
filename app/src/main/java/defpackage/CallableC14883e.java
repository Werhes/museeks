package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC14883e implements Callable {
    public final /* synthetic */ int ad;
    public static final /* synthetic */ CallableC14883e vip = new CallableC14883e(0);
    public static final /* synthetic */ CallableC14883e metrica = new CallableC14883e(1);
    public static final /* synthetic */ CallableC14883e license = new CallableC14883e(2);

    public /* synthetic */ CallableC14883e(int i) {
        this.ad = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.ad) {
            case 0:
                C13391e c13391e = AbstractC16828e.f32957e;
                return null;
            case 1:
                C1738e c1738e = new C1738e("internal.platform", 4);
                c1738e.f20169e.put("getVersion", new C1738e("getVersion", 3));
                return c1738e;
            default:
                return null;
        }
    }
}
