package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11300e implements InterfaceC9739e {
    public final boolean ad;
    public final C15926e[] appmetrica;
    public final C6029e license;
    public final Member metrica;
    public final boolean purchase;
    public final InterfaceC9739e vip;

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0115, code lost:
    
        if ((r13 instanceof defpackage.InterfaceC2898e) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00b2, code lost:
    
        r14 = defpackage.AbstractC2251e.Signature(r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C11300e(defpackage.InterfaceC0390e r12, defpackage.InterfaceC9739e r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11300e.<init>(eؑٚؐ, eٍۚۖ, boolean):void");
    }

    @Override // defpackage.InterfaceC9739e
    public final List ad() {
        return this.vip.ad();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [eٖؑۡ, eُۙۨ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eٖؑۡ, eُۙۨ] */
    public final C15926e appmetrica(int i) {
        C15926e[] c15926eArr = this.appmetrica;
        if (i >= 0 && i < c15926eArr.length) {
            return c15926eArr[i];
        }
        if (c15926eArr.length == 0) {
            return new C11241e(i, i, 1);
        }
        int length = ((C15926e) AbstractC1660e.m674this(c15926eArr)).f22522e + 1 + (i - c15926eArr.length);
        return new C11241e(length, length, 1);
    }

    @Override // defpackage.InterfaceC9739e
    public final Type inmobi() {
        return this.vip.inmobi();
    }

    @Override // defpackage.InterfaceC9739e
    public final Object license(Object[] objArr) {
        Object invoke;
        Object obj;
        C6029e c6029e = this.license;
        C15926e c15926e = (C15926e) c6029e.f12699e;
        List[] listArr = (List[]) c6029e.f12698e;
        Method method = (Method) c6029e.f12700e;
        boolean isEmpty = c15926e.isEmpty();
        int i = c15926e.f22522e;
        int i2 = c15926e.f22523e;
        if (!isEmpty) {
            if (this.purchase) {
                C1169e c1169e = new C1169e(objArr.length);
                for (int i3 = 0; i3 < i2; i3++) {
                    c1169e.add(objArr[i3]);
                }
                if (i2 <= i) {
                    while (true) {
                        List<Method> list = listArr[i2];
                        Object obj2 = objArr[i2];
                        if (list != null) {
                            for (Method method2 : list) {
                                c1169e.add(obj2 != null ? method2.invoke(obj2, null) : AbstractC5965e.metrica(method2.getReturnType()));
                            }
                        } else {
                            c1169e.add(obj2);
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                int i4 = i + 1;
                int length = objArr.length - 1;
                if (i4 <= length) {
                    while (true) {
                        c1169e.add(objArr[i4]);
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                objArr = AbstractC6874e.metrica(c1169e).toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    if (i5 > i || i2 > i5) {
                        obj = objArr[i5];
                    } else {
                        List list2 = listArr[i5];
                        Method method3 = list2 != null ? (Method) AbstractC13480e.m3590instanceof(list2) : null;
                        obj = objArr[i5];
                        if (method3 != null) {
                            obj = obj != null ? method3.invoke(obj, null) : AbstractC5965e.metrica(method3.getReturnType());
                        }
                    }
                    objArr2[i5] = obj;
                }
                objArr = objArr2;
            }
        }
        Object license = this.vip.license(objArr);
        return (license == EnumC2821e.f6782e || method == null || (invoke = method.invoke(null, license)) == null) ? license : invoke;
    }

    @Override // defpackage.InterfaceC9739e
    public final boolean metrica() {
        return this.vip instanceof C16051e;
    }

    @Override // defpackage.InterfaceC9739e
    public final Member vip() {
        return this.metrica;
    }
}
