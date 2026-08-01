package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: eؒۖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1245e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16113e f3927e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3928e;

    public /* synthetic */ C1245e(C16113e c16113e, int i) {
        this.f3928e = i;
        this.f3927e = c16113e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3928e) {
            case 0:
                return new C6499e(this.f3927e);
            case 1:
                C16113e c16113e = this.f3927e;
                C9024e c9024e = c16113e.f31694e;
                if (c9024e == null) {
                    throw new AssertionError(AbstractC1786e.signatures(new StringBuilder("Dependencies of module "), c16113e.getName().f2667e, " were not set before querying module content"));
                }
                List list = c9024e.ad;
                c16113e.m4120e();
                list.contains(c16113e);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C16113e) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C16113e) it2.next()).f31697e);
                }
                return new C9355e(arrayList, "CompositeProvider@ModuleDescriptor for " + c16113e.getName());
            default:
                return ((C14887e) this.f3927e.mo1886e(AbstractC4972e.startapp)).f29499e;
        }
    }
}
