package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9985e implements InterfaceC7227e, InterfaceC18155e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final Map f19711e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Class f19712e;

    static {
        int i = 0;
        List startapp = AbstractC6874e.startapp(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(startapp, 10));
        for (Object obj : startapp) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            arrayList.add(new C6571e((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f19711e = AbstractC10064e.mopub(arrayList);
    }

    public C9985e(Class cls) {
        this.f19712e = cls;
    }

    public static void advert() {
        throw new C10928e();
    }

    @Override // defpackage.InterfaceC7227e
    public final List ad() {
        advert();
        throw null;
    }

    @Override // defpackage.InterfaceC7227e
    public final boolean applovin(Object obj) {
        Map map = f19711e;
        Class cls = this.f19712e;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return AbstractC9476e.adcel(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = AbstractC14437e.purchase(AbstractC3820e.ad.vip(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // defpackage.InterfaceC7227e
    public final boolean equals(Object obj) {
        return (obj instanceof C9985e) && AbstractC14437e.purchase(this).equals(AbstractC14437e.purchase((InterfaceC7227e) obj));
    }

    @Override // defpackage.InterfaceC7227e
    public final List getTypeParameters() {
        advert();
        throw null;
    }

    @Override // defpackage.InterfaceC7227e
    public final int hashCode() {
        return AbstractC14437e.purchase(this).hashCode();
    }

    @Override // defpackage.InterfaceC7227e
    /* renamed from: instanceof */
    public final boolean mo2269instanceof() {
        advert();
        throw null;
    }

    @Override // defpackage.InterfaceC7227e
    public final String license() {
        String appmetrica;
        Class cls = this.f19712e;
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String appmetrica2 = AbstractC4465e.appmetrica(cls.getName());
            return appmetrica2 == null ? cls.getCanonicalName() : appmetrica2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (appmetrica = AbstractC4465e.appmetrica(componentType.getName())) != null) {
            str = appmetrica.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    @Override // defpackage.InterfaceC7227e
    public final Object loadAd() {
        advert();
        throw null;
    }

    @Override // defpackage.InterfaceC7227e
    public final String mopub() {
        String adcel;
        Class cls = this.f19712e;
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String adcel2 = AbstractC4465e.adcel(cls.getName());
                return adcel2 == null ? cls.getSimpleName() : adcel2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (adcel = AbstractC4465e.adcel(componentType.getName())) != null) {
                str = adcel.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC5304e.m1872static(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int m1865interface = AbstractC5304e.m1865interface(simpleName, '$', 0, 6);
            return m1865interface == -1 ? simpleName : simpleName.substring(m1865interface + 1, simpleName.length());
        }
        return AbstractC5304e.m1872static(simpleName, enclosingConstructor.getName() + '$');
    }

    @Override // defpackage.InterfaceC7227e
    public final Collection premium() {
        advert();
        throw null;
    }

    @Override // defpackage.InterfaceC7227e
    /* renamed from: private */
    public final boolean mo2270private() {
        advert();
        throw null;
    }

    @Override // defpackage.InterfaceC7227e
    public final Collection purchase() {
        advert();
        throw null;
    }

    @Override // defpackage.InterfaceC18155e
    public final Class subs() {
        return this.f19712e;
    }

    @Override // defpackage.InterfaceC7227e
    public final boolean subscription() {
        advert();
        throw null;
    }

    @Override // defpackage.InterfaceC7227e
    /* renamed from: throw */
    public final Collection mo2271throw() {
        advert();
        throw null;
    }

    public final String toString() {
        return this.f19712e.toString() + " (Kotlin reflection is not available)";
    }
}
