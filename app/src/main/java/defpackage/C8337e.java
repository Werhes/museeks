package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۥٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8337e extends AbstractC16412e {
    public final /* synthetic */ int billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8337e(int i, Method method) {
        super(method, false, 6);
        this.billing = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8337e(Method method) {
        super(method, true, 4);
        this.billing = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8337e(Method method, boolean z, int i) {
        super(method, z, i);
        this.billing = 0;
    }

    @Override // defpackage.AbstractC16412e, defpackage.InterfaceC9739e
    public final Object license(Object[] objArr) {
        switch (this.billing) {
            case 0:
                appmetrica(objArr);
                return billing(objArr[0], objArr.length <= 1 ? new Object[0] : AbstractC1660e.pro(1, objArr.length, objArr));
            case 1:
                appmetrica(objArr);
                purchase(AbstractC1660e.ads(objArr));
                return billing(null, objArr.length <= 1 ? new Object[0] : AbstractC1660e.pro(1, objArr.length, objArr));
            default:
                appmetrica(objArr);
                return billing(null, objArr);
        }
    }
}
