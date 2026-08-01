package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6470e extends AbstractC4003e {
    public AbstractC6470e(Field field, boolean z) {
        super(field, field.getGenericType(), z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // defpackage.InterfaceC9739e
    public Object license(Object[] objArr) {
        appmetrica(objArr);
        return ((Field) this.ad).get(this.metrica != null ? AbstractC1660e.applovin(objArr) : null);
    }
}
