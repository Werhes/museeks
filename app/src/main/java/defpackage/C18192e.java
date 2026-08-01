package defpackage;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18192e extends AbstractC16412e {
    public final /* synthetic */ int billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18192e(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.billing = i;
    }

    @Override // defpackage.AbstractC16412e, defpackage.AbstractC4003e
    public void appmetrica(Object[] objArr) {
        switch (this.billing) {
            case 1:
                super.appmetrica(objArr);
                purchase(AbstractC1660e.ads(objArr));
                return;
            default:
                super.appmetrica(objArr);
                return;
        }
    }
}
