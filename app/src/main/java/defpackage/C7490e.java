package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ۟ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7490e implements InterfaceC9739e {
    public final Class ad;
    public final ArrayList appmetrica;
    public final ArrayList billing;
    public final List license;
    public final int metrica;
    public final ArrayList purchase;
    public final ArrayList vip;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C7490e(java.lang.Class r7, java.util.ArrayList r8, int r9) {
        /*
            r6 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.AbstractC0746e.subscription(r8, r0)
            r5.<init>(r0)
            java.util.Iterator r0 = r8.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r1, r2)
            r5.add(r1)
            goto Lf
        L24:
            r4 = 2
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7490e.<init>(java.lang.Class, java.util.ArrayList, int):void");
    }

    public C7490e(Class cls, ArrayList arrayList, int i, int i2, List list) {
        this.ad = cls;
        this.vip = arrayList;
        this.metrica = i;
        this.license = list;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.appmetrica = arrayList2;
        List list2 = this.license;
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Class<?> cls2 = (Class) AbstractC2677e.metrica.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.purchase = arrayList3;
        List list3 = this.license;
        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.billing = arrayList4;
        if (this.metrica == 2 && i2 == 1 && !AbstractC13480e.m3576default(this.vip, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // defpackage.InterfaceC9739e
    public final List ad() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC9739e
    public final Type inmobi() {
        return this.ad;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r11.isInstance(r8) != false) goto L32;
     */
    @Override // defpackage.InterfaceC9739e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7490e.license(java.lang.Object[]):java.lang.Object");
    }

    @Override // defpackage.InterfaceC9739e
    public final /* bridge */ boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC9739e
    public final /* bridge */ /* synthetic */ Member vip() {
        return null;
    }
}
