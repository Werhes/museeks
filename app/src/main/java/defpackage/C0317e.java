package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0317e extends AbstractC18469e implements InterfaceC16902e, InterfaceC16276e {
    public final TypeVariable ad;

    public C0317e(TypeVariable typeVariable) {
        this.ad = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0317e) {
            return AbstractC7890e.billing(this.ad, ((C0317e) obj).ad);
        }
        return false;
    }

    @Override // defpackage.InterfaceC16902e
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.ad;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? C13664e.f27089e : AbstractC0014e.startapp(declaredAnnotations);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC16902e
    public final C2430e license(C12816e c12816e) {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.ad;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC0014e.yandex(declaredAnnotations, c12816e);
    }

    public final String toString() {
        return C0317e.class.getName() + ": " + this.ad;
    }
}
