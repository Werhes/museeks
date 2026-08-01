package defpackage;

import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: eٕٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17197e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f33720e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33721e;

    public /* synthetic */ C17197e(int i, Object obj) {
        this.f33721e = i;
        this.f33720e = obj;
    }

    public C17197e(C11980e c11980e, C12092e c12092e) {
        this.f33721e = 2;
        this.f33720e = c11980e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? singletonList;
        Class cls;
        C8404e c8404e;
        int i = this.f33721e;
        int i2 = 0;
        Object obj = this.f33720e;
        switch (i) {
            case 0:
                C1857e c1857e = (C1857e) obj;
                C13475e c13475e = c1857e.metrica;
                InterfaceC8614e interfaceC8614e = C1857e.billing[0];
                C6798e c6798e = (C6798e) c13475e.invoke();
                if (c6798e == null) {
                    return C9494e.vip;
                }
                C13475e c13475e2 = c1857e.ad;
                InterfaceC8614e interfaceC8614e2 = AbstractC8000e.vip[0];
                C0909e c0909e = ((C14723e) c13475e2.invoke()).vip;
                C3749e c3749e = (C3749e) c0909e.f3323e;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0909e.f3321e;
                Class cls2 = c6798e.ad;
                C11709e ad = AbstractC2677e.ad(cls2);
                Object obj2 = concurrentHashMap.get(ad);
                if (obj2 == null) {
                    C12816e c12816e = AbstractC2677e.ad(cls2).ad;
                    C4813e c4813e = c6798e.vip;
                    EnumC5730e enumC5730e = (EnumC5730e) c4813e.metrica;
                    EnumC5730e enumC5730e2 = EnumC5730e.MULTIFILE_CLASS;
                    if (enumC5730e == enumC5730e2) {
                        String[] strArr = (String[]) c4813e.appmetrica;
                        if (enumC5730e != enumC5730e2) {
                            strArr = null;
                        }
                        List asList = strArr != null ? Arrays.asList(strArr) : null;
                        if (asList == null) {
                            asList = C13664e.f27089e;
                        }
                        singletonList = new ArrayList();
                        Iterator it = asList.iterator();
                        while (it.hasNext()) {
                            C12816e c12816e2 = new C12816e(C1553e.metrica((String) it.next()).ad.replace('/', '.'));
                            C12816e vip = c12816e2.vip();
                            C0520e billing = c12816e2.ad.billing();
                            C12816e c12816e3 = C12816e.metrica;
                            C13579e c13579e = AbstractC18453e.billing(billing).ad;
                            c13579e.metrica();
                            C7850e c7850e = (C7850e) c0909e.f3322e;
                            C18277e c18277e = c3749e.ad;
                            if (c18277e == null) {
                                c18277e = null;
                            }
                            ((C11047e) c18277e.metrica).getClass();
                            C16308e c16308e = C16308e.billing;
                            String replace = c13579e.ad.replace('.', '$');
                            if (!vip.ad.metrica()) {
                                replace = vip + '.' + replace;
                            }
                            C2691e signatures = c7850e.signatures(replace);
                            C6798e c6798e2 = signatures != null ? (C6798e) signatures.f6570e : null;
                            if (c6798e2 != null) {
                                singletonList.add(c6798e2);
                            }
                        }
                    } else {
                        singletonList = Collections.singletonList(c6798e);
                    }
                    C18277e c18277e2 = c3749e.ad;
                    C11918e c11918e = new C11918e((InterfaceC5334e) (c18277e2 != null ? c18277e2 : null).vip, c12816e, i2);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = singletonList.iterator();
                    while (it2.hasNext()) {
                        C11260e ad2 = c3749e.ad(c11918e, (C6798e) it2.next());
                        if (ad2 != null) {
                            arrayList.add(ad2);
                        }
                    }
                    InterfaceC8528e ad3 = AbstractC13467e.ad("package " + c12816e + " (" + c6798e + ')', AbstractC13480e.m3575continue(arrayList));
                    Object putIfAbsent = concurrentHashMap.putIfAbsent(ad, ad3);
                    obj2 = putIfAbsent == null ? ad3 : putIfAbsent;
                }
                return (InterfaceC8528e) obj2;
            case 1:
                InterfaceC15498e mo1351switch = ((InterfaceC16046e) obj).mo1351switch();
                if (mo1351switch instanceof InterfaceC5052e) {
                    return AbstractC0607e.billing((InterfaceC5052e) mo1351switch);
                }
                if (!(mo1351switch instanceof InterfaceC0390e)) {
                    throw new Error("Unknown type parameter container: " + mo1351switch);
                }
                InterfaceC15498e mo1351switch2 = ((InterfaceC0390e) mo1351switch).mo1351switch();
                if (mo1351switch2 instanceof InterfaceC5052e) {
                    c8404e = AbstractC0607e.billing((InterfaceC5052e) mo1351switch2);
                } else {
                    InterfaceC3667e interfaceC3667e = mo1351switch instanceof InterfaceC3667e ? (InterfaceC3667e) mo1351switch : null;
                    if (interfaceC3667e == null) {
                        throw new Error("Non-class callable descriptor must be deserialized: " + mo1351switch);
                    }
                    InterfaceC7794e mo365e = interfaceC3667e.mo365e();
                    C11761e c11761e = mo365e instanceof C11761e ? (C11761e) mo365e : null;
                    C6798e c6798e3 = c11761e != null ? c11761e.f23633e : null;
                    C6798e c6798e4 = c6798e3 instanceof C6798e ? c6798e3 : null;
                    if (c6798e4 == null || (cls = c6798e4.ad) == null) {
                        throw new Error("Container of deserialized member is not resolved: " + interfaceC3667e);
                    }
                    c8404e = (C8404e) AbstractC3820e.ad.vip(cls);
                }
                return (InterfaceC8448e) mo1351switch.mo758e(new C15816e(7, c8404e), Unit.INSTANCE);
            case 2:
                ((C10990e) ((C17241e) ((C11980e) obj).f23950e).inmobi).getClass();
                return AbstractC13480e.m3582e(new ArrayList());
            case 3:
                C14155e.billing((View) obj, false);
                return Unit.INSTANCE;
            case 4:
                Function0 function0 = ((C17236e) obj).f33766e;
                if (function0 != null) {
                    return (List) function0.invoke();
                }
                return null;
            case 5:
                return (EnumC3856e) ((C0576e) ((C13440e) obj).ad.metrica).getValue();
            case 6:
                return (InterfaceC8528e) ((C17930e) obj).vip.invoke(C13520e.ad);
            case 7:
                return AbstractC14410e.pro(((C15786e) obj).ad);
            case 8:
                C18465e c18465e = (C18465e) obj;
                return c18465e.startapp(AbstractC6261e.vip(c18465e.vip, null, 3));
            case 9:
                return C18139e.vip(EnumC16799e.f32922e, ((C3168e) obj).toString());
            case 10:
                C16251e.license = false;
                C16251e c16251e = C16251e.ad;
                C16251e.license((EnumC14893e) obj);
                c16251e.vip();
                return Unit.INSTANCE;
            default:
                return (List) ((C8553e) obj).f17373e.getValue();
        }
    }
}
