package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15222e extends AbstractC7453e {
    public final /* synthetic */ Function2 metrica;
    public final /* synthetic */ C10014e vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15222e(C10014e c10014e, Function2 function2, String str) {
        super(str);
        this.vip = c10014e;
        this.metrica = function2;
    }

    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        C10014e c10014e = this.vip;
        C12429e c12429e = c10014e.f19777e;
        c12429e.f24862e = interfaceC13158e.getLayoutDirection();
        c12429e.f24860e = interfaceC13158e.vip();
        c12429e.f24859e = interfaceC13158e.mo499package();
        boolean mo398transient = interfaceC13158e.mo398transient();
        Function2 function2 = this.metrica;
        if (mo398transient || c10014e.f19781e.f27587e == null) {
            c10014e.f19779e = 0;
            InterfaceC17242e interfaceC17242e = (InterfaceC17242e) function2.invoke(c12429e, new C5602e(j));
            return new C16560e(interfaceC17242e, c10014e, c10014e.f19779e, interfaceC17242e, 1);
        }
        c10014e.f19768e = 0;
        InterfaceC17242e interfaceC17242e2 = (InterfaceC17242e) function2.invoke(c10014e.f19780e, new C5602e(j));
        return new C16560e(interfaceC17242e2, c10014e, c10014e.f19768e, interfaceC17242e2, 0);
    }
}
