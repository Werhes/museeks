package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٛ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4223e extends AbstractC16858e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13119e f9291e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f9292e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4223e(Function1 function1, C13119e c13119e) {
        super(3);
        this.f9292e = function1;
        this.f9291e = c13119e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        InterfaceC13158e interfaceC13158e = (InterfaceC13158e) obj;
        AbstractC2832e admob = ((InterfaceC16719e) obj2).admob(((C5602e) obj3).ad);
        if (interfaceC13158e.mo398transient()) {
            if (!((Boolean) this.f9292e.invoke(this.f9291e.license.getValue())).booleanValue()) {
                j = 0;
                return interfaceC13158e.ads((int) (j >> 32), (int) (4294967295L & j), C9139e.f18290e, new C8684e(admob, 2));
            }
        }
        j = (admob.f6806e << 32) | (admob.f6804e & 4294967295L);
        return interfaceC13158e.ads((int) (j >> 32), (int) (4294967295L & j), C9139e.f18290e, new C8684e(admob, 2));
    }
}
