package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* renamed from: eُؖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10816e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C17696e f21452e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21453e;

    public /* synthetic */ C10816e(C17696e c17696e, int i) {
        this.f21453e = i;
        this.f21452e = c17696e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f21453e) {
            case 0:
                return AbstractC2677e.ad(((InterfaceC18155e) AbstractC14437e.appmetrica(this.f21452e.vip.ad)).subs()).ad();
            case 1:
                C17696e c17696e = this.f21452e;
                C12816e mopub = c17696e.mopub();
                C2430e c2430e = c17696e.vip;
                C11980e c11980e = c17696e.ad;
                if (mopub == null) {
                    return C18139e.vip(EnumC16799e.f32924e, c2430e.toString());
                }
                C17241e c17241e = (C17241e) c11980e.f23950e;
                InterfaceC5334e interfaceC5334e = c17241e.loadAd;
                InterfaceC5052e admob = C11047e.admob(mopub, interfaceC5334e.amazon());
                if (admob == null) {
                    C17070e c17070e = new C17070e(((InterfaceC18155e) AbstractC14437e.appmetrica(c2430e.ad)).subs());
                    C12916e c12916e = (C12916e) c17241e.mopub.f31190e;
                    if (c12916e == null) {
                        c12916e = null;
                    }
                    admob = c12916e.m3416interface(c17070e);
                    if (admob == null) {
                        C11709e c11709e = new C11709e(mopub.vip(), mopub.ad.billing());
                        C18277e c18277e = c17241e.license.ad;
                        admob = AbstractC1284e.purchase(interfaceC5334e, c11709e, (C11980e) (c18277e != null ? c18277e : null).mopub);
                    }
                }
                return admob.mo1458e();
            default:
                C17696e c17696e2 = this.f21452e;
                ArrayList ad = c17696e2.vip.ad();
                ArrayList arrayList = new ArrayList();
                Iterator it = ad.iterator();
                while (it.hasNext()) {
                    InterfaceC16083e interfaceC16083e = (InterfaceC16083e) it.next();
                    C0520e c0520e = ((AbstractC13958e) interfaceC16083e).ad;
                    if (c0520e == null) {
                        c0520e = AbstractC15262e.vip;
                    }
                    AbstractC13656e vip = c17696e2.vip(interfaceC16083e);
                    C6571e c6571e = vip != null ? new C6571e(c0520e, vip) : null;
                    if (c6571e != null) {
                        arrayList.add(c6571e);
                    }
                }
                return AbstractC10064e.mopub(arrayList);
        }
    }
}
