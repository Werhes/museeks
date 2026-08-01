package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2430e extends AbstractC18469e implements InterfaceC16276e {
    public final Annotation ad;

    public C2430e(Annotation annotation) {
        this.ad = annotation;
    }

    public final ArrayList ad() {
        Annotation annotation = this.ad;
        Method[] declaredMethods = ((InterfaceC18155e) AbstractC14437e.appmetrica(annotation)).subs().getDeclaredMethods();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, null);
            C0520e appmetrica = C0520e.appmetrica(method.getName());
            Class<?> cls = invoke.getClass();
            List list = AbstractC2677e.ad;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C16910e(appmetrica, (Enum) invoke) : invoke instanceof Annotation ? new C15026e(appmetrica, (Annotation) invoke) : invoke instanceof Object[] ? new C17745e(appmetrica, (Object[]) invoke) : invoke instanceof Class ? new C17255e(appmetrica, (Class) invoke) : new C4451e(appmetrica, invoke));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2430e) {
            return this.ad == ((C2430e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.ad);
    }

    public final String toString() {
        return C2430e.class.getName() + ": " + this.ad;
    }
}
