package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٝۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC14126e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f27944e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f27945e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27946e = 1;

    public RunnableC14126e(C0560e c0560e, Callable callable) {
        this.f27945e = c0560e;
        this.f27944e = callable;
    }

    public /* synthetic */ RunnableC14126e(C17856e c17856e, C8383e c8383e) {
        EnumC11135e enumC11135e = EnumC11135e.UNKNOWN_EVENT;
        this.f27945e = c17856e;
        this.f27944e = c8383e;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, eِّؔ] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, eِّؔ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27946e) {
            case 0:
                C17856e c17856e = (C17856e) this.f27945e;
                EnumC11135e enumC11135e = EnumC11135e.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                C8383e c8383e = (C8383e) this.f27944e;
                HashMap hashMap = c17856e.adcel;
                C6834e c6834e = (C6834e) hashMap.get(enumC11135e);
                if (c6834e != null) {
                    C6834e c6834e2 = c6834e;
                    C11478e c11478e = c6834e2.f15261e;
                    if (c11478e == null) {
                        C6834e c6834e3 = c6834e2;
                        C11478e c11478e2 = new C11478e(c6834e3, c6834e3.f14065e);
                        c6834e2.f15261e = c11478e2;
                        c11478e = c11478e2;
                    }
                    Iterator it = c11478e.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj = (Collection) c6834e.f14065e.get(next);
                        if (obj == null) {
                            obj = new ArrayList(3);
                        }
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(list instanceof RandomAccess ? new C8680e(c6834e, next, list, null) : new C8680e(c6834e, next, list, null));
                        Collections.sort(arrayList);
                        ?? obj2 = new Object();
                        Iterator it2 = arrayList.iterator();
                        long j = 0;
                        while (it2.hasNext()) {
                            j += ((Long) it2.next()).longValue();
                        }
                        obj2.f6385e = Long.valueOf((j / arrayList.size()) & Long.MAX_VALUE);
                        obj2.f6388e = Long.valueOf(C17856e.ad(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj2.f6389e = Long.valueOf(C17856e.ad(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj2.f6384e = Long.valueOf(C17856e.ad(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj2.f6387e = Long.valueOf(C17856e.ad(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj2.f6386e = Long.valueOf(Long.MAX_VALUE & C17856e.ad(arrayList, 0.0d));
                        C6200e c6200e = new C6200e(obj2);
                        int size = arrayList.size();
                        C1729e c1729e = (C1729e) c8383e.f17149e;
                        C13120e c13120e = (C13120e) next;
                        ?? obj3 = new Object();
                        obj3.f6385e = c1729e.startapp ? EnumC5396e.TYPE_THICK : EnumC5396e.TYPE_THIN;
                        C15024e c15024e = new C15024e(17);
                        c15024e.f29787e = Integer.valueOf(size & Alert.DURATION_SHOW_INDEFINITELY);
                        c15024e.f29788e = c13120e;
                        c15024e.f29789e = c6200e;
                        obj3.f6389e = new C12175e(c15024e);
                        EnumC2663e.f6529e.execute(new RunnableC11327e(16, c17856e, new C7306e(obj3, 0), enumC11135e, c17856e.metrica(), false));
                    }
                    hashMap.remove(enumC11135e);
                    return;
                }
                return;
            default:
                C0560e c0560e = (C0560e) this.f27945e;
                try {
                    c0560e.amazon(((Callable) this.f27944e).call());
                    return;
                } catch (Exception e) {
                    c0560e.Signature(e);
                    return;
                } catch (Throwable th) {
                    c0560e.Signature(new RuntimeException(th));
                    return;
                }
        }
    }
}
