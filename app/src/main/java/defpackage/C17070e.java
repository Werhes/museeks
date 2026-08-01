package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17070e extends AbstractC18469e implements InterfaceC16902e, InterfaceC16276e, InterfaceC3761e {
    public final Class ad;

    public C17070e(Class cls) {
        this.ad = cls;
    }

    public final List ad() {
        return AbstractC7762e.Signature(new C2167e(AbstractC7762e.adcel(AbstractC1660e.billing(this.ad.getDeclaredFields()), C17563e.f34408e), C15230e.f30133e));
    }

    public final C0520e appmetrica() {
        Class cls = this.ad;
        return cls.isAnonymousClass() ? C0520e.appmetrica(AbstractC5304e.m1871return(cls.getName())) : C0520e.appmetrica(cls.getSimpleName());
    }

    public final boolean billing() {
        C11467e c11467e = AbstractC4256e.metrica;
        if (c11467e == null) {
            try {
                c11467e = new C11467e(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                c11467e = new C11467e(r1, r1, r1, r1);
            }
            AbstractC4256e.metrica = c11467e;
        }
        Method method = (Method) c11467e.f23069e;
        r1 = method != null ? (Boolean) method.invoke(this.ad, null) : null;
        if (r1 != null) {
            return r1.booleanValue();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17070e) {
            return AbstractC7890e.billing(this.ad, ((C17070e) obj).ad);
        }
        return false;
    }

    @Override // defpackage.InterfaceC16902e
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.ad;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? C13664e.f27089e : AbstractC0014e.startapp(declaredAnnotations);
    }

    @Override // defpackage.InterfaceC3761e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.ad.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C0317e(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC16902e
    public final C2430e license(C12816e c12816e) {
        Annotation[] declaredAnnotations;
        Class cls = this.ad;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC0014e.yandex(declaredAnnotations, c12816e);
    }

    public final List metrica() {
        return AbstractC7762e.Signature(new C2167e(AbstractC7762e.startapp(AbstractC1660e.billing(this.ad.getDeclaredMethods()), new C14772e(3, this)), C6446e.f13354e));
    }

    public final ArrayList purchase() {
        C11467e c11467e = AbstractC4256e.metrica;
        if (c11467e == null) {
            try {
                c11467e = new C11467e(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                c11467e = new C11467e(r1, r1, r1, r1);
            }
            AbstractC4256e.metrica = c11467e;
        }
        Method method = (Method) c11467e.f23071e;
        r1 = method != null ? (Object[]) method.invoke(this.ad, null) : null;
        if (r1 == null) {
            r1 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(r1.length);
        for (Object obj : r1) {
            arrayList.add(new C13313e(obj));
        }
        return arrayList;
    }

    public final String toString() {
        return C17070e.class.getName() + ": " + this.ad;
    }

    public final C12816e vip() {
        return AbstractC2677e.ad(this.ad).ad();
    }

    public final boolean yandex() {
        C11467e c11467e = AbstractC4256e.metrica;
        if (c11467e == null) {
            try {
                c11467e = new C11467e(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                c11467e = new C11467e(r1, r1, r1, r1);
            }
            AbstractC4256e.metrica = c11467e;
        }
        Method method = (Method) c11467e.f23072e;
        r1 = method != null ? (Boolean) method.invoke(this.ad, null) : null;
        if (r1 != null) {
            return r1.booleanValue();
        }
        return false;
    }
}
