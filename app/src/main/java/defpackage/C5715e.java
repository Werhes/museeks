package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5715e implements InterfaceC10819e, InterfaceC16827e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ArrayList f12119e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f12120e;

    @Override // defpackage.InterfaceC16827e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.license(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC12864e
    public final Object appmetrica(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC16827e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.purchase(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC16827e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        yandex(j);
        AbstractC2832e admob = interfaceC16719e.admob(j);
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 4));
    }

    @Override // defpackage.InterfaceC12864e
    public final /* synthetic */ InterfaceC12864e premium(InterfaceC12864e interfaceC12864e) {
        return AbstractC5087e.isVip(this, interfaceC12864e);
    }

    @Override // defpackage.InterfaceC16827e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.vip(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC16827e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.yandex(this, abstractC9292e, interfaceC16719e, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v3, types: [eّؖٝ, java.lang.Object] */
    @Override // defpackage.InterfaceC10819e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(defpackage.AbstractC10731e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.C6014e
            if (r0 == 0) goto L13
            r0 = r8
            eؘۣۤ r0 = (defpackage.C6014e) r0
            int r1 = r0.f12665e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12665e = r1
            goto L18
        L13:
            eؘۣۤ r0 = new eؘۣۤ
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f12663e
            int r1 = r0.f12665e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            eّؖٝ r0 = r0.f12664e
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Throwable -> L27
            goto L62
        L27:
            r8 = move-exception
            goto L72
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.AbstractC2003e.purchase(r8)
            long r3 = r7.f12120e
            boolean r8 = defpackage.C5602e.mopub(r3)
            if (r8 == 0) goto L7e
            eّؖٝ r8 = new eّؖٝ
            r8.<init>()
            r0.f12664e = r8     // Catch: java.lang.Throwable -> L6e
            r0.f12665e = r2     // Catch: java.lang.Throwable -> L6e
            eْۢ٘ r1 = new eْۢ٘     // Catch: java.lang.Throwable -> L6e
            eًؗۖ r0 = defpackage.AbstractC10558e.startapp(r0)     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6e
            r1.tapsense()     // Catch: java.lang.Throwable -> L6e
            r8.f9318e = r1     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayList r0 = r7.f12119e     // Catch: java.lang.Throwable -> L6e
            r0.add(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r1.signatures()     // Catch: java.lang.Throwable -> L6e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L61
            return r1
        L61:
            r0 = r8
        L62:
            java.util.ArrayList r8 = r7.f12119e
            java.lang.Object r0 = r0.f9318e
            java.util.Collection r8 = defpackage.AbstractC9476e.vip(r8)
            r8.remove(r0)
            goto L7e
        L6e:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L72:
            java.util.ArrayList r1 = r7.f12119e
            java.lang.Object r0 = r0.f9318e
            java.util.Collection r1 = defpackage.AbstractC9476e.vip(r1)
            r1.remove(r0)
            throw r8
        L7e:
            long r0 = r7.f12120e
            eٖٚۢ r8 = new eٖٚۢ
            int r2 = defpackage.C5602e.yandex(r0)
            eَِۦ r3 = defpackage.C11657e.ad
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r4) goto L96
            defpackage.AbstractC17540e.ad(r2)
            eؕۜٞ r5 = new eؕۜٞ
            r5.<init>(r2)
            goto L97
        L96:
            r5 = r3
        L97:
            int r0 = defpackage.C5602e.billing(r0)
            if (r0 == r4) goto La5
            defpackage.AbstractC17540e.ad(r0)
            eؕۜٞ r3 = new eؕۜٞ
            r3.<init>(r0)
        La5:
            r8.<init>(r5, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5715e.vip(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC12864e
    /* renamed from: volatile */
    public final boolean mo256volatile(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    public final void yandex(long j) {
        this.f12120e = j;
        if (C5602e.mopub(j)) {
            return;
        }
        ArrayList arrayList = this.f12119e;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f12119e = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5083e) it.next()).billing(Unit.INSTANCE);
        }
    }
}
