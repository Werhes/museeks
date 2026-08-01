package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: eِّۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12857e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC5052e f25684e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25685e;

    public /* synthetic */ C12857e(InterfaceC5052e interfaceC5052e, int i) {
        this.f25685e = i;
        this.f25684e = interfaceC5052e;
    }

    public C12857e(InterfaceC5052e interfaceC5052e, C13714e c13714e, AbstractC10226e abstractC10226e, C9265e c9265e) {
        this.f25685e = 2;
        this.f25684e = interfaceC5052e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25685e) {
            case 0:
                C11005e c11005e = (C11005e) obj;
                List mo1221e = this.f25684e.mo1221e();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mo1221e, 10));
                Iterator it = mo1221e.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C17936e(c11005e, (InterfaceC16046e) it.next()));
                }
                return arrayList;
            case 1:
                Collection ad = this.f25684e.mo1459goto().ad();
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(ad, 10));
                Iterator it2 = ad.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C12011e((AbstractC1186e) it2.next()));
                }
                return arrayList2;
            default:
                AbstractC2876e.purchase(this.f25684e);
                return null;
        }
    }
}
