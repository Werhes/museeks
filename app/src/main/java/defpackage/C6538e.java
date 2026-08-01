package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٞؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6538e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f13461e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f13462e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13463e;

    public /* synthetic */ C6538e(int i, Object obj, Object obj2, Object obj3) {
        this.f13463e = i;
        this.f13462e = obj2;
        this.f13461e = obj3;
    }

    public /* synthetic */ C6538e(Object obj, Object obj2, int i) {
        this.f13463e = i;
        this.f13462e = obj;
        this.f13461e = obj2;
    }

    private final Object ad(Object obj) {
        List list = (List) this.f13462e;
        C11744e c11744e = (C11744e) this.f13461e;
        Throwable th = (Throwable) obj;
        if (th != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C8823e) ((InterfaceC6334e) it.next())).m2503e(th);
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((C8823e) ((InterfaceC6334e) it2.next())).m2175import(Unit.INSTANCE);
            }
        }
        synchronized (c11744e.license) {
            c11744e.purchase.removeAll(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Type inference failed for: r7v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6538e.invoke(java.lang.Object):java.lang.Object");
    }
}
