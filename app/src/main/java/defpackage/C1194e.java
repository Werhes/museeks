package defpackage;

import java.lang.reflect.Field;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؒٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1194e extends AbstractC16412e implements InterfaceC2898e {
    public final Object billing;

    public C1194e(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.billing = obj;
    }

    @Override // defpackage.AbstractC16412e, defpackage.InterfaceC9739e
    public final Object license(Object[] objArr) {
        appmetrica(objArr);
        ((Field) this.ad).set(this.billing, AbstractC1660e.applovin(objArr));
        return Unit.INSTANCE;
    }
}
