package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: eؙؕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6177e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C14887e f12947e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12948e;

    public /* synthetic */ C6177e(C14887e c14887e, int i) {
        this.f12948e = i;
        this.f12947e = c14887e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f12948e) {
            case 0:
                C14887e c14887e = this.f12947e;
                C16113e c16113e = c14887e.f29500e;
                c16113e.m4120e();
                C9355e c9355e = (C9355e) c16113e.f31692e.getValue();
                C12816e c12816e = c14887e.f29498e;
                ArrayList arrayList = new ArrayList();
                AbstractC8439e.appmetrica(c9355e, c12816e, arrayList);
                return arrayList;
            case 1:
                C14887e c14887e2 = this.f12947e;
                C16113e c16113e2 = c14887e2.f29500e;
                c16113e2.m4120e();
                return Boolean.valueOf(AbstractC8439e.yandex((C9355e) c16113e2.f31692e.getValue(), c14887e2.f29498e));
            default:
                C14887e c14887e3 = this.f12947e;
                C0394e c0394e = c14887e3.f29501e;
                InterfaceC8614e[] interfaceC8614eArr = C14887e.f29497e;
                InterfaceC8614e interfaceC8614e = interfaceC8614eArr[1];
                boolean booleanValue = ((Boolean) c0394e.invoke()).booleanValue();
                C12816e c12816e2 = c14887e3.f29498e;
                C16113e c16113e3 = c14887e3.f29500e;
                if (booleanValue) {
                    return C9494e.vip;
                }
                C0394e c0394e2 = c14887e3.f29502e;
                InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[0];
                List list = (List) c0394e2.invoke();
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((InterfaceC9646e) it.next()).mo1385e());
                }
                return AbstractC13467e.ad("package view scope for " + c12816e2 + " in " + c16113e3.getName(), AbstractC13480e.m3572catch(new C10295e(c16113e3, c12816e2), arrayList2));
        }
    }
}
