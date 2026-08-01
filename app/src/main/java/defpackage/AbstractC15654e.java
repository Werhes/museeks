package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15654e extends AbstractC18469e implements InterfaceC16902e, InterfaceC16252e {
    public abstract Member ad();

    public final AbstractC1984e appmetrica() {
        int modifiers = ad().getModifiers();
        return Modifier.isPublic(modifiers) ? C4824e.f10288e : Modifier.isPrivate(modifiers) ? C4824e.f10285e : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C4824e.f10293e : C4824e.f10294e : C4824e.f10283e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC15654e) && AbstractC7890e.billing(ad(), ((AbstractC15654e) obj).ad());
    }

    @Override // defpackage.InterfaceC16902e
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        AnnotatedElement annotatedElement = (AnnotatedElement) ad();
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? C13664e.f27089e : AbstractC0014e.startapp(declaredAnnotations);
    }

    public final int hashCode() {
        return ad().hashCode();
    }

    @Override // defpackage.InterfaceC16902e
    public final C2430e license(C12816e c12816e) {
        Annotation[] declaredAnnotations;
        AnnotatedElement annotatedElement = (AnnotatedElement) ad();
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC0014e.yandex(declaredAnnotations, c12816e);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList metrica(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15654e.metrica(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    public final String toString() {
        return getClass().getName() + ": " + ad();
    }

    public final C0520e vip() {
        String name = ad().getName();
        return name != null ? C0520e.appmetrica(name) : AbstractC13893e.ad;
    }
}
