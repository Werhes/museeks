package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2634e implements InterfaceC18244e {
    public final /* synthetic */ int ad = 0;
    public final /* synthetic */ int license;
    public final /* synthetic */ ArrayList metrica;
    public final /* synthetic */ C2111e vip;

    public /* synthetic */ C2634e(C2111e c2111e, int i, ArrayList arrayList) {
        this.vip = c2111e;
        this.license = i;
        this.metrica = arrayList;
    }

    public /* synthetic */ C2634e(C2111e c2111e, ArrayList arrayList, int i) {
        this.vip = c2111e;
        this.metrica = arrayList;
        this.license = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // defpackage.InterfaceC18244e
    public final ListenableFuture apply(Object obj) {
        switch (this.ad) {
            case 0:
                int i = this.license;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) AbstractC2017e.vip((Future) this.metrica.get(i2))).booleanValue()) {
                        ((List) this.vip.vip).get(i2).getClass();
                        throw new ClassCastException();
                    }
                }
                AbstractC17475e subscription = AbstractC17475e.subscription(arrayList);
                ?? obj2 = new Object();
                C12136e c12136e = new C12136e(subscription, true);
                c12136e.f24302e = new C7219e(c12136e, (Callable) obj2);
                c12136e.remoteconfig();
                return c12136e;
            default:
                ArrayList arrayList2 = this.metrica;
                AbstractC17475e subscription2 = AbstractC17475e.subscription(arrayList2);
                int i3 = this.license;
                C2111e c2111e = this.vip;
                C7302e ad = AbstractC9855e.ad(new C9556e(i3, c2111e, (AbstractC17836e) obj, arrayList2));
                Executor executor = (Executor) c2111e.metrica;
                C12136e c12136e2 = new C12136e(subscription2, false);
                c12136e2.f24302e = new C7219e(c12136e2, ad, executor);
                c12136e2.remoteconfig();
                return c12136e2;
        }
    }
}
