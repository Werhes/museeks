package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16051e extends AbstractC16412e implements InterfaceC2898e {
    public final Object billing;

    public C16051e(Method method, Object obj) {
        super(method, false, 4);
        this.billing = obj;
    }

    @Override // defpackage.AbstractC16412e, defpackage.InterfaceC9739e
    public final Object license(Object[] objArr) {
        appmetrica(objArr);
        return billing(this.billing, objArr);
    }
}
