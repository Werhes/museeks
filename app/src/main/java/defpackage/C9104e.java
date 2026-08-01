package defpackage;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۥؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9104e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f18239e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14388e f18240e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18241e;

    public /* synthetic */ C9104e(InterfaceC14388e interfaceC14388e, InterfaceC3314e interfaceC3314e, int i) {
        this.f18241e = i;
        this.f18240e = interfaceC14388e;
        this.f18239e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18241e) {
            case 0:
                C17897e c17897e = new C17897e(11, (Function0) obj);
                C9104e c9104e = new C9104e(this.f18240e, this.f18239e, 1);
                if (AbstractC4046e.ad()) {
                    return AbstractC4046e.vip(c17897e, c9104e, Build.VERSION.SDK_INT == 28 ? C17975e.f35236e : C15219e.f30119e);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            case 1:
                float vip = C16109e.vip(((C16109e) obj).ad);
                InterfaceC14388e interfaceC14388e = this.f18240e;
                this.f18239e.setValue(new C12729e((interfaceC14388e.mo493e(vip) << 32) | (interfaceC14388e.mo493e(C16109e.ad(r7.ad)) & 4294967295L)));
                return Unit.INSTANCE;
            case 2:
                C17897e c17897e2 = new C17897e(14, (Function0) obj);
                C9104e c9104e2 = new C9104e(this.f18240e, this.f18239e, 3);
                if (AbstractC4046e.ad()) {
                    return AbstractC4046e.vip(c17897e2, c9104e2, Build.VERSION.SDK_INT == 28 ? C17975e.f35236e : C15219e.f30119e);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                float vip2 = C16109e.vip(((C16109e) obj).ad);
                InterfaceC14388e interfaceC14388e2 = this.f18240e;
                this.f18239e.setValue(new C12729e((interfaceC14388e2.mo493e(vip2) << 32) | (interfaceC14388e2.mo493e(C16109e.ad(r7.ad)) & 4294967295L)));
                return Unit.INSTANCE;
        }
    }
}
