package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16412e extends AbstractC4003e {
    public final /* synthetic */ int appmetrica = 0;
    public final boolean purchase;

    public AbstractC16412e(Field field, boolean z, boolean z2) {
        super(field, Void.TYPE, z2 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
        this.purchase = z;
    }

    public /* synthetic */ AbstractC16412e(Method method, boolean z, int i) {
        this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, method.getGenericParameterTypes());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC16412e(java.lang.reflect.Method r2, boolean r3, java.lang.reflect.Type[] r4) {
        /*
            r1 = this;
            r0 = 1
            r1.appmetrica = r0
            java.lang.reflect.Type r0 = r2.getGenericReturnType()
            if (r3 == 0) goto Le
            java.lang.Class r3 = r2.getDeclaringClass()
            goto Lf
        Le:
            r3 = 0
        Lf:
            r1.<init>(r2, r0, r3, r4)
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r2 = defpackage.AbstractC7890e.billing(r0, r2)
            r1.purchase = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16412e.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
    }

    @Override // defpackage.AbstractC4003e
    public void appmetrica(Object[] objArr) {
        switch (this.appmetrica) {
            case 0:
                super.appmetrica(objArr);
                if (this.purchase && AbstractC1660e.m674this(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.appmetrica(objArr);
                return;
        }
    }

    public Object billing(Object obj, Object[] objArr) {
        return this.purchase ? Unit.INSTANCE : ((Method) this.ad).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.InterfaceC9739e
    public Object license(Object[] objArr) {
        appmetrica(objArr);
        ((Field) this.ad).set(this.metrica != null ? AbstractC1660e.applovin(objArr) : null, AbstractC1660e.m674this(objArr));
        return Unit.INSTANCE;
    }
}
