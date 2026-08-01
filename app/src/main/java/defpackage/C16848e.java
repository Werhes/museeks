package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: eؙٗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16848e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C11980e f33010e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33011e;

    public /* synthetic */ C16848e(C11980e c11980e, int i) {
        this.f33011e = i;
        this.f33010e = c11980e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33011e) {
            case 0:
                return new C11918e((InterfaceC5334e) this.f33010e.f23949e, (C12816e) obj, 0);
            default:
                C8665e c8665e = (C8665e) obj;
                C11709e c11709e = c8665e.ad;
                List list = c8665e.vip;
                if (c11709e.metrica) {
                    throw new UnsupportedOperationException("Unresolved local class: " + c11709e);
                }
                C11709e appmetrica = c11709e.appmetrica();
                C11980e c11980e = this.f33010e;
                InterfaceC17815e m3294default = appmetrica != null ? c11980e.m3294default(appmetrica, AbstractC13480e.subs(1, list)) : (InterfaceC17815e) ((C1159e) c11980e.f23951e).invoke(c11709e.ad);
                boolean billing = c11709e.billing();
                C6272e c6272e = (C6272e) c11980e.f23950e;
                C0520e purchase = c11709e.purchase();
                Integer num = (Integer) AbstractC13480e.m3604this(list);
                return new C5572e(c6272e, m3294default, purchase, billing, num != null ? num.intValue() : 0);
        }
    }
}
