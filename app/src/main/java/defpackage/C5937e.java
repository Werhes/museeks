package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5937e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4031e f12522e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12523e;

    public /* synthetic */ C5937e(C4031e c4031e, int i) {
        this.f12523e = i;
        this.f12522e = c4031e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f12523e) {
            case 0:
                this.f12522e.m2514goto(new C13679e());
                return Unit.INSTANCE;
            case 1:
                this.f12522e.f8963e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                this.f12522e.m2514goto(new C12672e());
                return Unit.INSTANCE;
            case 3:
                this.f12522e.f8963e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 4:
                this.f12522e.m2514goto(new C2743e());
                return Unit.INSTANCE;
            default:
                C4031e c4031e = this.f12522e;
                InterfaceC1686e m4168strictfp = c4031e.m4168strictfp();
                C18010e c18010e = m4168strictfp instanceof C18010e ? (C18010e) m4168strictfp : null;
                Map map = c18010e != null ? c18010e.metrica : null;
                if (map == null) {
                    map = C9139e.f18290e;
                }
                new C12340e("common", map).signatures(c4031e.pro());
                return Unit.INSTANCE;
        }
    }
}
