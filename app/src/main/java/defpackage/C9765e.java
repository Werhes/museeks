package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* renamed from: eٍِۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9765e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C8404e f19307e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19308e;

    public /* synthetic */ C9765e(C8404e c8404e, int i) {
        this.f19308e = i;
        this.f19307e = c8404e;
    }

    public C9765e(C8404e c8404e, C10448e c10448e) {
        this.f19308e = 7;
        this.f19307e = c8404e;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, eؕٛؓ] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19308e;
        C8404e c8404e = this.f19307e;
        switch (i) {
            case 0:
                return new C10448e(c8404e);
            case 1:
                return C8404e.m2421abstract(c8404e, c8404e.m2424catch().mo1458e().mo483e(), 1);
            case 2:
                return C8404e.m2421abstract(c8404e, c8404e.m2424catch().mo1719e(), 1);
            case 3:
                return C8404e.m2421abstract(c8404e, c8404e.m2424catch().mo1458e().mo483e(), 2);
            case 4:
                return C8404e.m2421abstract(c8404e, c8404e.m2424catch().mo1719e(), 2);
            case 5:
                HashSet hashSet = C8404e.f17183e;
                C11709e m2428implements = c8404e.m2428implements();
                Class cls = c8404e.f17185e;
                C13475e c13475e = ((C10448e) c8404e.f17184e.getValue()).ad;
                InterfaceC8614e interfaceC8614e = AbstractC8000e.vip[0];
                C14723e c14723e = (C14723e) c13475e.invoke();
                C18277e c18277e = c14723e.ad;
                InterfaceC5052e license = (m2428implements.metrica && cls.isAnnotationPresent(Metadata.class)) ? (InterfaceC5052e) ((C12917e) c18277e.remoteconfig).vip.invoke(new C4712e(m2428implements, null)) : AbstractC1284e.license((InterfaceC5334e) c18277e.vip, m2428implements);
                if (license != null) {
                    return license;
                }
                if (cls.isSynthetic()) {
                    return C8404e.m2422default(m2428implements, c14723e);
                }
                C6798e vip = AbstractC4256e.vip(cls);
                EnumC5730e enumC5730e = vip != null ? (EnumC5730e) vip.vip.metrica : null;
                switch (enumC5730e != null ? AbstractC14977e.ad[enumC5730e.ordinal()] : -1) {
                    case -1:
                    case 6:
                        throw new Error("Unresolved class: " + cls + " (kind = " + enumC5730e + ')');
                    case 0:
                    default:
                        throw new C14803e(10);
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return C8404e.m2422default(m2428implements, c14723e);
                    case 5:
                        throw new Error("Unknown class: " + cls + " (kind = " + enumC5730e + ')');
                }
            case 6:
                Annotation[] annotations = c8404e.f17185e.getAnnotations();
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : annotations) {
                    if (!C8404e.f17183e.contains(((InterfaceC18155e) AbstractC14437e.appmetrica(annotation)).subs().getName())) {
                        arrayList.add(annotation);
                    }
                }
                return AbstractC5965e.adcel(arrayList);
            case 7:
                Class cls2 = c8404e.f17185e;
                if (cls2.isAnonymousClass()) {
                    return null;
                }
                C11709e m2428implements2 = c8404e.m2428implements();
                if (!m2428implements2.metrica) {
                    return m2428implements2.purchase().vip();
                }
                String simpleName = cls2.getSimpleName();
                Method enclosingMethod = cls2.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return AbstractC5304e.m1872static(simpleName, enclosingMethod.getName() + '$');
                }
                Constructor<?> enclosingConstructor = cls2.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    int m1865interface = AbstractC5304e.m1865interface(simpleName, '$', 0, 6);
                    return m1865interface == -1 ? simpleName : simpleName.substring(m1865interface + 1, simpleName.length());
                }
                return AbstractC5304e.m1872static(simpleName, enclosingConstructor.getName() + '$');
            case 8:
                if (c8404e.f17185e.isAnonymousClass()) {
                    return null;
                }
                C11709e m2428implements3 = c8404e.m2428implements();
                if (m2428implements3.metrica) {
                    return null;
                }
                return m2428implements3.ad().ad.ad;
            default:
                Collection mo2429interface = c8404e.mo2429interface();
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(mo2429interface, 10));
                Iterator it = mo2429interface.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C10208e(c8404e, (InterfaceC11788e) it.next()));
                }
                return arrayList2;
        }
    }
}
