package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13313e extends AbstractC15654e implements InterfaceC16252e {
    public final Object ad;

    public C13313e(Object obj) {
        this.ad = obj;
    }

    @Override // defpackage.AbstractC15654e
    public final Member ad() {
        C13391e c13391e = AbstractC13467e.appmetrica;
        Object obj = this.ad;
        if (c13391e == null) {
            Class<?> cls = obj.getClass();
            try {
                c13391e = new C13391e(cls.getMethod("getType", null), cls.getMethod("getAccessor", null), 27);
            } catch (NoSuchMethodException unused) {
                c13391e = new C13391e(r2, r2, 27);
            }
            AbstractC13467e.appmetrica = c13391e;
        }
        Method method = (Method) c13391e.f26644e;
        r2 = method != null ? (Method) method.invoke(obj, null) : null;
        if (r2 != null) {
            return r2;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final InterfaceC15088e purchase() {
        C13391e c13391e = AbstractC13467e.appmetrica;
        Object obj = this.ad;
        if (c13391e == null) {
            Class<?> cls = obj.getClass();
            try {
                c13391e = new C13391e(cls.getMethod("getType", null), cls.getMethod("getAccessor", null), 27);
            } catch (NoSuchMethodException unused) {
                c13391e = new C13391e(r2, r2, 27);
            }
            AbstractC13467e.appmetrica = c13391e;
        }
        Method method = (Method) c13391e.f26645e;
        r2 = method != null ? (Class) method.invoke(obj, null) : null;
        if (r2 != null) {
            return new C13652e(r2);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
